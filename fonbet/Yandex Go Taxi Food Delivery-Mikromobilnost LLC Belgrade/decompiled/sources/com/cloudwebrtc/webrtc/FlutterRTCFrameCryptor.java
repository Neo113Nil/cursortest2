package com.cloudwebrtc.webrtc;

import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.afo;
import defpackage.da20;
import defpackage.g8e;
import defpackage.kbs;
import defpackage.tt5;
import defpackage.x920;
import defpackage.xeo;
import defpackage.zeo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.webrtc.FrameCryptor;
import org.webrtc.FrameCryptorAlgorithm;
import org.webrtc.FrameCryptorFactory;
import org.webrtc.FrameCryptorKeyProvider;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes10.dex */
public class FlutterRTCFrameCryptor {
    private static final String TAG = "FlutterRTCFrameCryptor";
    private final StateProvider stateProvider;
    private final Map<String, FrameCryptor> frameCryptos = new HashMap();
    private final Map<String, FrameCryptorStateObserver> frameCryptoObservers = new HashMap();
    private final Map<String, FrameCryptorKeyProvider> keyProviders = new HashMap();

    /* renamed from: com.cloudwebrtc.webrtc.FlutterRTCFrameCryptor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState;

        static {
            int[] iArr = new int[FrameCryptor.FrameCryptionState.values().length];
            $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState = iArr;
            try {
                iArr[FrameCryptor.FrameCryptionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.DECRYPTIONFAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.ENCRYPTIONFAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.INTERNALERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.KEYRATCHETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.MISSINGKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public class FrameCryptorStateObserver implements FrameCryptor.Observer, zeo {
        private final afo eventChannel;
        private final ArrayList eventQueue = new ArrayList();
        private xeo eventSink;
        private final String frameCryptorId;

        public FrameCryptorStateObserver(tt5 tt5Var, String str) {
            this.frameCryptorId = str;
            afo afoVar = new afo(tt5Var, g8e.o("FlutterWebRTC/frameCryptorEvent", str));
            this.eventChannel = afoVar;
            afoVar.a(new zeo() { // from class: com.cloudwebrtc.webrtc.FlutterRTCFrameCryptor.FrameCryptorStateObserver.1
                @Override // defpackage.zeo
                public void onCancel(Object obj) {
                    FrameCryptorStateObserver.this.eventSink = null;
                }

                @Override // defpackage.zeo
                public void onListen(Object obj, xeo xeoVar) {
                    FrameCryptorStateObserver.this.eventSink = new AnyThreadSink(xeoVar);
                    Iterator it = FrameCryptorStateObserver.this.eventQueue.iterator();
                    while (it.hasNext()) {
                        FrameCryptorStateObserver.this.eventSink.success(it.next());
                    }
                    FrameCryptorStateObserver.this.eventQueue.clear();
                }
            });
        }

        private String frameCryptorErrorStateToString(FrameCryptor.FrameCryptionState frameCryptionState) {
            switch (AnonymousClass1.$SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[frameCryptionState.ordinal()]) {
                case 1:
                    return "new";
                case 2:
                    return WriteBlocks.OK;
                case 3:
                    return "decryptionFailed";
                case 4:
                    return "encryptionFailed";
                case 5:
                    return "internalError";
                case 6:
                    return "keyRatcheted";
                case 7:
                    return "missingKey";
                default:
                    kbs.f(frameCryptionState, "Unknown FrameCryptorErrorState: ");
                    return null;
            }
        }

        @Override // defpackage.zeo
        public void onCancel(Object obj) {
            this.eventSink = null;
        }

        @Override // org.webrtc.FrameCryptor.Observer
        public void onFrameCryptionStateChanged(String str, FrameCryptor.FrameCryptionState frameCryptionState) {
            HashMap u = g8e.u(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "frameCryptionStateChanged", "participantId", str);
            u.put(ClidProvider.STATE, frameCryptorErrorStateToString(frameCryptionState));
            xeo xeoVar = this.eventSink;
            if (xeoVar != null) {
                xeoVar.success(u);
            } else {
                this.eventQueue.add(u);
            }
        }

        @Override // defpackage.zeo
        public void onListen(Object obj, xeo xeoVar) {
            this.eventSink = new AnyThreadSink(xeoVar);
            Iterator it = this.eventQueue.iterator();
            while (it.hasNext()) {
                this.eventSink.success(it.next());
            }
            this.eventQueue.clear();
        }
    }

    public FlutterRTCFrameCryptor(StateProvider stateProvider) {
        this.stateProvider = stateProvider;
    }

    private FrameCryptorAlgorithm frameCryptorAlgorithmFromInt(int i) {
        return i != 0 ? FrameCryptorAlgorithm.AES_GCM : FrameCryptorAlgorithm.AES_GCM;
    }

    private void frameCryptorDispose(Map<String, Object> map, da20 da20Var) {
        String str = (String) map.get("frameCryptorId");
        FrameCryptor frameCryptor = this.frameCryptos.get(str);
        if (frameCryptor == null) {
            da20Var.error("frameCryptorDisposeFailed", "frameCryptor not found", null);
            return;
        }
        frameCryptor.dispose();
        this.frameCryptos.remove(str);
        this.frameCryptoObservers.remove(str);
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(TarifficatorScenarioActivity.RESULT_KEY, "success");
        da20Var.success(constraintsMap.toMap());
    }

    private void frameCryptorFactoryCreateFrameCryptor(Map<String, Object> map, da20 da20Var) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            da20Var.error("frameCryptorFactoryCreateFrameCryptorFailed", "keyProvider not found", null);
            return;
        }
        PeerConnectionObserver peerConnectionObserver = this.stateProvider.getPeerConnectionObserver((String) map.get("peerConnectionId"));
        if (peerConnectionObserver == null) {
            da20Var.error("frameCryptorFactoryCreateFrameCryptorFailed", "peerConnection not found", null);
            return;
        }
        String str = (String) map.get("participantId");
        String str2 = (String) map.get("type");
        int intValue = ((Integer) map.get("algorithm")).intValue();
        String str3 = (String) map.get("rtpSenderId");
        String str4 = (String) map.get("rtpReceiverId");
        if (str2.equals("sender")) {
            FrameCryptor createFrameCryptorForRtpSender = FrameCryptorFactory.createFrameCryptorForRtpSender(this.stateProvider.getPeerConnectionFactory(), peerConnectionObserver.getRtpSenderById(str3), str, frameCryptorAlgorithmFromInt(intValue), frameCryptorKeyProvider);
            String uuid = UUID.randomUUID().toString();
            this.frameCryptos.put(uuid, createFrameCryptorForRtpSender);
            FrameCryptorStateObserver frameCryptorStateObserver = new FrameCryptorStateObserver(this.stateProvider.getMessenger(), uuid);
            createFrameCryptorForRtpSender.setObserver(frameCryptorStateObserver);
            this.frameCryptoObservers.put(uuid, frameCryptorStateObserver);
            ConstraintsMap constraintsMap = new ConstraintsMap();
            constraintsMap.putString("frameCryptorId", uuid);
            da20Var.success(constraintsMap.toMap());
            return;
        }
        if (!str2.equals("receiver")) {
            da20Var.error("frameCryptorFactoryCreateFrameCryptorFailed", "type must be sender or receiver", null);
            return;
        }
        FrameCryptor createFrameCryptorForRtpReceiver = FrameCryptorFactory.createFrameCryptorForRtpReceiver(this.stateProvider.getPeerConnectionFactory(), peerConnectionObserver.getRtpReceiverById(str4), str, frameCryptorAlgorithmFromInt(intValue), frameCryptorKeyProvider);
        String uuid2 = UUID.randomUUID().toString();
        this.frameCryptos.put(uuid2, createFrameCryptorForRtpReceiver);
        FrameCryptorStateObserver frameCryptorStateObserver2 = new FrameCryptorStateObserver(this.stateProvider.getMessenger(), uuid2);
        createFrameCryptorForRtpReceiver.setObserver(frameCryptorStateObserver2);
        this.frameCryptoObservers.put(uuid2, frameCryptorStateObserver2);
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putString("frameCryptorId", uuid2);
        da20Var.success(constraintsMap2.toMap());
    }

    private void frameCryptorFactoryCreateKeyProvider(Map<String, Object> map, da20 da20Var) {
        String uuid = UUID.randomUUID().toString();
        Map map2 = (Map) map.get("keyProviderOptions");
        boolean booleanValue = ((Boolean) map2.get("sharedKey")).booleanValue();
        int intValue = ((Integer) map2.get("ratchetWindowSize")).intValue();
        int intValue2 = ((Integer) map2.get("failureTolerance")).intValue();
        byte[] bArr = (byte[]) map2.get("ratchetSalt");
        byte[] bArr2 = new byte[0];
        if (map2.containsKey("uncryptedMagicBytes")) {
            bArr2 = (byte[]) map2.get("uncryptedMagicBytes");
        }
        FrameCryptorKeyProvider createFrameCryptorKeyProvider = FrameCryptorFactory.createFrameCryptorKeyProvider(booleanValue, bArr, intValue, bArr2, intValue2, ((Integer) map2.get("keyRingSize")).intValue(), ((Boolean) map2.get("discardFrameWhenCryptorNotReady")).booleanValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        this.keyProviders.put(uuid, createFrameCryptorKeyProvider);
        constraintsMap.putString("keyProviderId", uuid);
        da20Var.success(constraintsMap.toMap());
    }

    private void frameCryptorGetEnabled(Map<String, Object> map, da20 da20Var) {
        FrameCryptor frameCryptor = this.frameCryptos.get((String) map.get("frameCryptorId"));
        if (frameCryptor == null) {
            da20Var.error("frameCryptorGetEnabledFailed", "frameCryptor not found", null);
            return;
        }
        boolean isEnabled = frameCryptor.isEnabled();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(BackendConfig.Restrictions.ENABLED, isEnabled);
        da20Var.success(constraintsMap.toMap());
    }

    private void frameCryptorGetKeyIndex(Map<String, Object> map, da20 da20Var) {
        FrameCryptor frameCryptor = this.frameCryptos.get((String) map.get("frameCryptorId"));
        if (frameCryptor == null) {
            da20Var.error("frameCryptorGetKeyIndexFailed", "frameCryptor not found", null);
            return;
        }
        int keyIndex = frameCryptor.getKeyIndex();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putInt("keyIndex", keyIndex);
        da20Var.success(constraintsMap.toMap());
    }

    private void frameCryptorSetEnabled(Map<String, Object> map, da20 da20Var) {
        FrameCryptor frameCryptor = this.frameCryptos.get((String) map.get("frameCryptorId"));
        if (frameCryptor == null) {
            da20Var.error("frameCryptorSetEnabledFailed", "frameCryptor not found", null);
            return;
        }
        boolean booleanValue = ((Boolean) map.get(BackendConfig.Restrictions.ENABLED)).booleanValue();
        frameCryptor.setEnabled(booleanValue);
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(TarifficatorScenarioActivity.RESULT_KEY, booleanValue);
        da20Var.success(constraintsMap.toMap());
    }

    private void frameCryptorSetKeyIndex(Map<String, Object> map, da20 da20Var) {
        FrameCryptor frameCryptor = this.frameCryptos.get((String) map.get("frameCryptorId"));
        if (frameCryptor == null) {
            da20Var.error("frameCryptorSetKeyIndexFailed", "frameCryptor not found", null);
            return;
        }
        frameCryptor.setKeyIndex(((Integer) map.get("keyIndex")).intValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(TarifficatorScenarioActivity.RESULT_KEY, true);
        da20Var.success(constraintsMap.toMap());
    }

    private void keyProviderDispose(Map<String, Object> map, da20 da20Var) {
        String str = (String) map.get("keyProviderId");
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get(str);
        if (frameCryptorKeyProvider == null) {
            da20Var.error("keyProviderDisposeFailed", "keyProvider not found", null);
            return;
        }
        frameCryptorKeyProvider.dispose();
        this.keyProviders.remove(str);
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(TarifficatorScenarioActivity.RESULT_KEY, "success");
        da20Var.success(constraintsMap.toMap());
    }

    private void keyProviderExportKey(Map<String, Object> map, da20 da20Var) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            da20Var.error("keyProviderExportKeyFailed", "keyProvider not found", null);
            return;
        }
        byte[] exportKey = frameCryptorKeyProvider.exportKey((String) map.get("participantId"), ((Integer) map.get("keyIndex")).intValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putByte(TarifficatorScenarioActivity.RESULT_KEY, exportKey);
        da20Var.success(constraintsMap.toMap());
    }

    private void keyProviderExportSharedKey(Map<String, Object> map, da20 da20Var) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            da20Var.error("keyProviderExportSharedKeyFailed", "keyProvider not found", null);
            return;
        }
        byte[] exportSharedKey = frameCryptorKeyProvider.exportSharedKey(((Integer) map.get("keyIndex")).intValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putByte(TarifficatorScenarioActivity.RESULT_KEY, exportSharedKey);
        da20Var.success(constraintsMap.toMap());
    }

    private void keyProviderRatchetKey(Map<String, Object> map, da20 da20Var) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            da20Var.error("keyProviderSetKeysFailed", "keyProvider not found", null);
            return;
        }
        byte[] ratchetKey = frameCryptorKeyProvider.ratchetKey((String) map.get("participantId"), ((Integer) map.get("keyIndex")).intValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putByte(TarifficatorScenarioActivity.RESULT_KEY, ratchetKey);
        da20Var.success(constraintsMap.toMap());
    }

    private void keyProviderRatchetSharedKey(Map<String, Object> map, da20 da20Var) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            da20Var.error("keyProviderRatchetSharedKeyFailed", "keyProvider not found", null);
            return;
        }
        byte[] ratchetSharedKey = frameCryptorKeyProvider.ratchetSharedKey(((Integer) map.get("keyIndex")).intValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putByte(TarifficatorScenarioActivity.RESULT_KEY, ratchetSharedKey);
        da20Var.success(constraintsMap.toMap());
    }

    private void keyProviderSetKey(Map<String, Object> map, da20 da20Var) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            da20Var.error("keyProviderSetKeyFailed", "keyProvider not found", null);
            return;
        }
        frameCryptorKeyProvider.setKey((String) map.get("participantId"), ((Integer) map.get("keyIndex")).intValue(), (byte[]) map.get("key"));
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(TarifficatorScenarioActivity.RESULT_KEY, true);
        da20Var.success(constraintsMap.toMap());
    }

    private void keyProviderSetSharedKey(Map<String, Object> map, da20 da20Var) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            da20Var.error("keyProviderSetKeySharedFailed", "keyProvider not found", null);
            return;
        }
        frameCryptorKeyProvider.setSharedKey(((Integer) map.get("keyIndex")).intValue(), (byte[]) map.get("key"));
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(TarifficatorScenarioActivity.RESULT_KEY, true);
        da20Var.success(constraintsMap.toMap());
    }

    private void keyProviderSetSifTrailer(Map<String, Object> map, da20 da20Var) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            da20Var.error("keyProviderSetSifTrailerFailed", "keyProvider not found", null);
            return;
        }
        frameCryptorKeyProvider.setSifTrailer((byte[]) map.get("sifTrailer"));
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(TarifficatorScenarioActivity.RESULT_KEY, true);
        da20Var.success(constraintsMap.toMap());
    }

    public boolean handleMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        Map<String, Object> map = (Map) x920Var.b;
        if (str.equals("frameCryptorFactoryCreateFrameCryptor")) {
            frameCryptorFactoryCreateFrameCryptor(map, da20Var);
            return true;
        }
        if (str.equals("frameCryptorSetKeyIndex")) {
            frameCryptorSetKeyIndex(map, da20Var);
            return true;
        }
        if (str.equals("frameCryptorGetKeyIndex")) {
            frameCryptorGetKeyIndex(map, da20Var);
            return true;
        }
        if (str.equals("frameCryptorSetEnabled")) {
            frameCryptorSetEnabled(map, da20Var);
            return true;
        }
        if (str.equals("frameCryptorGetEnabled")) {
            frameCryptorGetEnabled(map, da20Var);
            return true;
        }
        if (str.equals("frameCryptorDispose")) {
            frameCryptorDispose(map, da20Var);
            return true;
        }
        if (str.equals("frameCryptorFactoryCreateKeyProvider")) {
            frameCryptorFactoryCreateKeyProvider(map, da20Var);
            return true;
        }
        if (str.equals("keyProviderSetSharedKey")) {
            keyProviderSetSharedKey(map, da20Var);
            return true;
        }
        if (str.equals("keyProviderRatchetSharedKey")) {
            keyProviderRatchetSharedKey(map, da20Var);
            return true;
        }
        if (str.equals("keyProviderExportSharedKey")) {
            keyProviderExportKey(map, da20Var);
            return true;
        }
        if (str.equals("keyProviderSetKey")) {
            keyProviderSetKey(map, da20Var);
            return true;
        }
        if (str.equals("keyProviderRatchetKey")) {
            keyProviderRatchetKey(map, da20Var);
            return true;
        }
        if (str.equals("keyProviderExportKey")) {
            keyProviderExportKey(map, da20Var);
            return true;
        }
        if (str.equals("keyProviderSetSifTrailer")) {
            keyProviderSetSifTrailer(map, da20Var);
            return true;
        }
        if (!str.equals("keyProviderDispose")) {
            return false;
        }
        keyProviderDispose(map, da20Var);
        return true;
    }
}
