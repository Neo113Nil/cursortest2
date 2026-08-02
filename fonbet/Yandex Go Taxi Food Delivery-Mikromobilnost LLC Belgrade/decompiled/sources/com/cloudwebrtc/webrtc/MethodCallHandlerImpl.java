package com.cloudwebrtc.webrtc;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.util.Log;
import android.util.LongSparseArray;
import com.cloudwebrtc.webrtc.GetUserMediaImpl;
import com.cloudwebrtc.webrtc.audio.AudioDeviceKind;
import com.cloudwebrtc.webrtc.audio.AudioProcessingController;
import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;
import com.cloudwebrtc.webrtc.audio.AudioUtils;
import com.cloudwebrtc.webrtc.audio.LocalAudioTrack;
import com.cloudwebrtc.webrtc.audio.PlaybackSamplesReadyCallbackAdapter;
import com.cloudwebrtc.webrtc.audio.RecordSamplesReadyCallbackAdapter;
import com.cloudwebrtc.webrtc.record.AudioChannel;
import com.cloudwebrtc.webrtc.record.FrameCapturer;
import com.cloudwebrtc.webrtc.utils.AnyThreadResult;
import com.cloudwebrtc.webrtc.utils.Callback;
import com.cloudwebrtc.webrtc.utils.ConstraintsArray;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import com.cloudwebrtc.webrtc.utils.EglUtils;
import com.cloudwebrtc.webrtc.utils.MediaConstraintsUtils;
import com.cloudwebrtc.webrtc.utils.ObjectType;
import com.cloudwebrtc.webrtc.utils.PermissionUtils;
import com.cloudwebrtc.webrtc.utils.Utils;
import com.cloudwebrtc.webrtc.video.LocalVideoTrack;
import com.cloudwebrtc.webrtc.video.camera.CameraUtils;
import com.cloudwebrtc.webrtc.video.camera.Point;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.div.state.db.StateEntry;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.afo;
import defpackage.b64;
import defpackage.ca20;
import defpackage.da20;
import defpackage.g8e;
import defpackage.hf3;
import defpackage.oyr;
import defpackage.qft;
import defpackage.tt5;
import defpackage.unr0;
import defpackage.x920;
import defpackage.xuy0;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.flutter.view.TextureRegistry$SurfaceLifecycle;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.webrtc.AudioTrack;
import org.webrtc.CryptoOptions;
import org.webrtc.EglBase;
import org.webrtc.IceCandidate;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpCapabilities;
import org.webrtc.RtpSender;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import org.webrtc.VideoTrack;
import org.webrtc.audio.AudioDeviceModule;
import org.webrtc.audio.JavaAudioDeviceModule;
import org.webrtc.video.CustomVideoDecoderFactory;
import org.webrtc.video.CustomVideoEncoderFactory;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.PolicyConstraintsExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes10.dex */
public class MethodCallHandlerImpl implements ca20, StateProvider {
    public static final String TAG = "FlutterWebRTCPlugin";
    private Activity activity;
    private AudioDeviceModule audioDeviceModule;
    public AudioProcessingController audioProcessingController;
    private CameraUtils cameraUtils;
    private final Context context;
    private FlutterRTCFrameCryptor frameCryptor;
    private GetUserMediaImpl getUserMediaImpl;
    private PeerConnectionFactory mFactory;
    private final tt5 messenger;
    public PlaybackSamplesReadyCallbackAdapter playbackSamplesReadyCallbackAdapter;
    public RecordSamplesReadyCallbackAdapter recordSamplesReadyCallbackAdapter;
    private final xuy0 textures;
    private CustomVideoDecoderFactory videoDecoderFactory;
    private CustomVideoEncoderFactory videoEncoderFactory;
    private final Map<String, PeerConnectionObserver> mPeerConnectionObservers = new HashMap();
    private final Map<String, MediaStream> localStreams = new HashMap();
    private final Map<String, LocalTrack> localTracks = new HashMap();
    private final LongSparseArray<FlutterRTCVideoRenderer> renders = new LongSparseArray<>();

    /* renamed from: com.cloudwebrtc.webrtc.MethodCallHandlerImpl$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType;

        static {
            int[] iArr = new int[ObjectType.values().length];
            $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType = iArr;
            try {
                iArr[ObjectType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[ObjectType.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MethodCallHandlerImpl(Context context, tt5 tt5Var, xuy0 xuy0Var) {
        this.context = context;
        this.textures = xuy0Var;
        this.messenger = tt5Var;
    }

    private ConstraintsMap capabilitiestoMap(RtpCapabilities rtpCapabilities) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        for (RtpCapabilities.CodecCapability codecCapability : rtpCapabilities.codecs) {
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            constraintsMap2.putString("mimeType", codecCapability.mimeType);
            constraintsMap2.putInt("clockRate", codecCapability.clockRate.intValue());
            Integer num = codecCapability.numChannels;
            if (num != null) {
                constraintsMap2.putInt("channels", num.intValue());
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : codecCapability.parameters.entrySet()) {
                if (entry.getKey().length() > 0) {
                    arrayList.add(entry.getKey() + "=" + entry.getValue());
                } else {
                    arrayList.add(entry.getValue());
                }
            }
            if (arrayList.size() > 0) {
                constraintsMap2.putString("sdpFmtpLine", String.join(";", arrayList));
            }
            constraintsArray.pushMap(constraintsMap2);
        }
        ConstraintsArray constraintsArray2 = new ConstraintsArray();
        for (RtpCapabilities.HeaderExtensionCapability headerExtensionCapability : rtpCapabilities.headerExtensions) {
            ConstraintsMap constraintsMap3 = new ConstraintsMap();
            constraintsMap3.putString(LaunchBrowserActivity.KEY_URI, headerExtensionCapability.getUri());
            constraintsMap3.putInt("id", headerExtensionCapability.getPreferredId());
            constraintsMap3.putBoolean("encrypted", headerExtensionCapability.getPreferredEncrypted());
            constraintsArray2.pushMap(constraintsMap3);
        }
        constraintsMap.putArray("codecs", constraintsArray.toArrayList());
        constraintsMap.putArray("headerExtensions", constraintsArray2.toArrayList());
        constraintsMap.putArray("fecMechanisms", new ConstraintsArray().toArrayList());
        return constraintsMap;
    }

    private List<PeerConnection.IceServer> createIceServers(ConstraintsArray constraintsArray) {
        int size = constraintsArray == null ? 0 : constraintsArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            ConstraintsMap map = constraintsArray.getMap(i);
            boolean z = map.hasKey(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME) && map.hasKey(URLCredentialContract.FeedEntry.TABLE_NAME);
            if (map.hasKey("url")) {
                if (z) {
                    arrayList.add(PeerConnection.IceServer.builder(map.getString("url")).setUsername(map.getString(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME)).setPassword(map.getString(URLCredentialContract.FeedEntry.TABLE_NAME)).createIceServer());
                } else {
                    arrayList.add(PeerConnection.IceServer.builder(map.getString("url")).createIceServer());
                }
            } else if (map.hasKey("urls")) {
                int i2 = AnonymousClass7.$SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[map.getType("urls").ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        ConstraintsArray array = map.getArray("urls");
                        ArrayList arrayList2 = new ArrayList();
                        for (int i3 = 0; i3 < array.size(); i3++) {
                            arrayList2.add(array.getString(i3));
                        }
                        PeerConnection.IceServer.Builder builder = PeerConnection.IceServer.builder(arrayList2);
                        if (z) {
                            builder.setUsername(map.getString(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME)).setPassword(map.getString(URLCredentialContract.FeedEntry.TABLE_NAME));
                        }
                        arrayList.add(builder.createIceServer());
                    }
                } else if (z) {
                    arrayList.add(PeerConnection.IceServer.builder(map.getString("urls")).setUsername(map.getString(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME)).setPassword(map.getString(URLCredentialContract.FeedEntry.TABLE_NAME)).createIceServer());
                } else {
                    arrayList.add(PeerConnection.IceServer.builder(map.getString("urls")).createIceServer());
                }
            }
        }
        return arrayList;
    }

    private void createLocalMediaStream(da20 da20Var) {
        String nextStreamUUID = getNextStreamUUID();
        MediaStream createLocalMediaStream = this.mFactory.createLocalMediaStream(nextStreamUUID);
        this.localStreams.put(nextStreamUUID, createLocalMediaStream);
        if (createLocalMediaStream == null) {
            resultError("createLocalMediaStream", "Failed to create new media stream", da20Var);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("streamId", createLocalMediaStream.getId());
        da20Var.success(hashMap);
    }

    private MediaConstraints defaultConstraints() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveAudio", "true"));
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "true"));
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("DtlsSrtpKeyAgreement", "true"));
        return mediaConstraints;
    }

    private PeerConnection getPeerConnection(String str) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null) {
            return null;
        }
        return peerConnectionObserver.getPeerConnection();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void initialize(boolean z, int i, boolean z2, List<String> list, ConstraintsMap constraintsMap) {
        AudioAttributes audioAttributes;
        if (this.mFactory != null) {
            return;
        }
        PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(this.context).setEnableInternalTracer(true).createInitializationOptions());
        GetUserMediaImpl getUserMediaImpl = new GetUserMediaImpl(this, this.context);
        this.getUserMediaImpl = getUserMediaImpl;
        this.cameraUtils = new CameraUtils(getUserMediaImpl, this.activity);
        this.frameCryptor = new FlutterRTCFrameCryptor(this);
        if (constraintsMap != null) {
            Integer audioAttributesUsageTypeForString = AudioUtils.getAudioAttributesUsageTypeForString(constraintsMap.getString("androidAudioAttributesUsageType"));
            Integer audioAttributesContentTypeFromString = AudioUtils.getAudioAttributesContentTypeFromString(constraintsMap.getString("androidAudioAttributesContentType"));
            if (audioAttributesUsageTypeForString != null && audioAttributesContentTypeFromString != null) {
                audioAttributes = new AudioAttributes.Builder().setUsage(audioAttributesUsageTypeForString.intValue()).setContentType(audioAttributesContentTypeFromString.intValue()).build();
                JavaAudioDeviceModule.Builder builder = JavaAudioDeviceModule.builder(this.context);
                this.recordSamplesReadyCallbackAdapter = new RecordSamplesReadyCallbackAdapter();
                this.playbackSamplesReadyCallbackAdapter = new PlaybackSamplesReadyCallbackAdapter();
                if (z) {
                    builder.setUseHardwareAcousticEchoCanceler(true).setUseLowLatency(true).setUseHardwareNoiseSuppressor(true);
                } else {
                    builder.setUseHardwareAcousticEchoCanceler(false).setUseHardwareNoiseSuppressor(false).setUseStereoInput(true).setUseStereoOutput(true).setAudioSource(1);
                }
                builder.setSamplesReadyCallback(this.recordSamplesReadyCallbackAdapter);
                builder.setPlaybackSamplesReadyCallback(this.playbackSamplesReadyCallbackAdapter);
                this.recordSamplesReadyCallbackAdapter.addCallback(this.getUserMediaImpl.inputSamplesInterceptor);
                this.recordSamplesReadyCallbackAdapter.addCallback(new JavaAudioDeviceModule.SamplesReadyCallback() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.1
                    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
                    public void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
                        for (LocalTrack localTrack : MethodCallHandlerImpl.this.localTracks.values()) {
                            if (localTrack instanceof LocalAudioTrack) {
                                ((LocalAudioTrack) localTrack).onWebRtcAudioRecordSamplesReady(audioSamples);
                            }
                        }
                    }
                });
                if (audioAttributes != null) {
                    builder.setAudioAttributes(audioAttributes);
                }
                this.audioDeviceModule = builder.createAudioDeviceModule();
                if (!z && JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    this.audioDeviceModule.setNoiseSuppressorEnabled(true);
                }
                this.getUserMediaImpl.audioDeviceModule = (JavaAudioDeviceModule) this.audioDeviceModule;
                PeerConnectionFactory.Options options = new PeerConnectionFactory.Options();
                options.networkIgnoreMask = i;
                PeerConnectionFactory.Builder options2 = PeerConnectionFactory.builder().setOptions(options);
                EglBase.Context rootEglBaseContext = EglUtils.getRootEglBaseContext();
                this.videoEncoderFactory = new CustomVideoEncoderFactory(rootEglBaseContext, true, true);
                this.videoDecoderFactory = new CustomVideoDecoderFactory(rootEglBaseContext);
                options2.setVideoEncoderFactory(this.videoEncoderFactory).setVideoDecoderFactory(this.videoDecoderFactory);
                this.videoDecoderFactory.setForceSWCodec(z2);
                this.videoDecoderFactory.setForceSWCodecList(list);
                this.videoEncoderFactory.setForceSWCodec(z2);
                this.videoEncoderFactory.setForceSWCodecList(list);
                AudioProcessingController audioProcessingController = new AudioProcessingController();
                this.audioProcessingController = audioProcessingController;
                options2.setAudioProcessingFactory(audioProcessingController.externalAudioProcessingFactory);
                this.mFactory = options2.setAudioDeviceModule(this.audioDeviceModule).createPeerConnectionFactory();
            }
        }
        audioAttributes = null;
        JavaAudioDeviceModule.Builder builder2 = JavaAudioDeviceModule.builder(this.context);
        this.recordSamplesReadyCallbackAdapter = new RecordSamplesReadyCallbackAdapter();
        this.playbackSamplesReadyCallbackAdapter = new PlaybackSamplesReadyCallbackAdapter();
        if (z) {
        }
        builder2.setSamplesReadyCallback(this.recordSamplesReadyCallbackAdapter);
        builder2.setPlaybackSamplesReadyCallback(this.playbackSamplesReadyCallbackAdapter);
        this.recordSamplesReadyCallbackAdapter.addCallback(this.getUserMediaImpl.inputSamplesInterceptor);
        this.recordSamplesReadyCallbackAdapter.addCallback(new JavaAudioDeviceModule.SamplesReadyCallback() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.1
            @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
            public void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
                for (LocalTrack localTrack : MethodCallHandlerImpl.this.localTracks.values()) {
                    if (localTrack instanceof LocalAudioTrack) {
                        ((LocalAudioTrack) localTrack).onWebRtcAudioRecordSamplesReady(audioSamples);
                    }
                }
            }
        });
        if (audioAttributes != null) {
        }
        this.audioDeviceModule = builder2.createAudioDeviceModule();
        if (!z) {
            this.audioDeviceModule.setNoiseSuppressorEnabled(true);
        }
        this.getUserMediaImpl.audioDeviceModule = (JavaAudioDeviceModule) this.audioDeviceModule;
        PeerConnectionFactory.Options options3 = new PeerConnectionFactory.Options();
        options3.networkIgnoreMask = i;
        PeerConnectionFactory.Builder options22 = PeerConnectionFactory.builder().setOptions(options3);
        EglBase.Context rootEglBaseContext2 = EglUtils.getRootEglBaseContext();
        this.videoEncoderFactory = new CustomVideoEncoderFactory(rootEglBaseContext2, true, true);
        this.videoDecoderFactory = new CustomVideoDecoderFactory(rootEglBaseContext2);
        options22.setVideoEncoderFactory(this.videoEncoderFactory).setVideoDecoderFactory(this.videoDecoderFactory);
        this.videoDecoderFactory.setForceSWCodec(z2);
        this.videoDecoderFactory.setForceSWCodecList(list);
        this.videoEncoderFactory.setForceSWCodec(z2);
        this.videoEncoderFactory.setForceSWCodecList(list);
        AudioProcessingController audioProcessingController2 = new AudioProcessingController();
        this.audioProcessingController = audioProcessingController2;
        options22.setAudioProcessingFactory(audioProcessingController2.externalAudioProcessingFactory);
        this.mFactory = options22.setAudioDeviceModule(this.audioDeviceModule).createPeerConnectionFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestPermissions$0(ArrayList arrayList, Callback callback, Callback callback2, String[] strArr, int[] iArr) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (iArr[i] == 0) {
                arrayList2.add(str);
            } else {
                arrayList3.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!arrayList2.contains((String) it.next())) {
                callback.invoke(arrayList3);
                return;
            }
        }
        callback2.invoke(arrayList2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        if (r8.equals("max-compat") == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private PeerConnection.RTCConfiguration parseRTCConfiguration(ConstraintsMap constraintsMap) {
        int i;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        int i2;
        String string6;
        String string7;
        String string8;
        char c;
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(createIceServers(constraintsMap != null ? constraintsMap.getArray("iceServers") : null));
        if (constraintsMap != null) {
            char c2 = 2;
            boolean z = false;
            if (constraintsMap.hasKey("iceTransportPolicy") && constraintsMap.getType("iceTransportPolicy") == ObjectType.String && (string8 = constraintsMap.getString("iceTransportPolicy")) != null) {
                switch (string8.hashCode()) {
                    case -1040041239:
                        if (string8.equals("nohost")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 96673:
                        if (string8.equals("all")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3387192:
                        if (string8.equals("none")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108397201:
                        if (string8.equals("relay")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.NOHOST;
                        break;
                    case 1:
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.ALL;
                        break;
                    case 2:
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.NONE;
                        break;
                    case 3:
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.RELAY;
                        break;
                }
            }
            if (constraintsMap.hasKey("bundlePolicy") && constraintsMap.getType("bundlePolicy") == ObjectType.String && (string7 = constraintsMap.getString("bundlePolicy")) != null) {
                switch (string7.hashCode()) {
                    case -1924829944:
                        if (string7.equals("balanced")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -585638645:
                        if (string7.equals("max-bundle")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -562569205:
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.BALANCED;
                        break;
                    case 1:
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
                        break;
                    case 2:
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXCOMPAT;
                        break;
                }
            }
            if (constraintsMap.hasKey("rtcpMuxPolicy") && constraintsMap.getType("rtcpMuxPolicy") == ObjectType.String && (string6 = constraintsMap.getString("rtcpMuxPolicy")) != null) {
                if (string6.equals("negotiate")) {
                    rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.NEGOTIATE;
                } else if (string6.equals(PolicyConstraintsExtension.REQUIRE)) {
                    rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
                }
            }
            if (constraintsMap.hasKey("iceCandidatePoolSize") && constraintsMap.getType("iceCandidatePoolSize") == ObjectType.Number && (i2 = constraintsMap.getInt("iceCandidatePoolSize")) > 0) {
                rTCConfiguration.iceCandidatePoolSize = i2;
            }
            if (constraintsMap.hasKey("sdpSemantics") && constraintsMap.getType("sdpSemantics") == ObjectType.String && (string5 = constraintsMap.getString("sdpSemantics")) != null) {
                if (string5.equals("plan-b")) {
                    rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.PLAN_B;
                } else if (string5.equals("unified-plan")) {
                    rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
                }
            }
            if (constraintsMap.hasKey("maxIPv6Networks") && constraintsMap.getType("maxIPv6Networks") == ObjectType.Number) {
                rTCConfiguration.maxIPv6Networks = constraintsMap.getInt("maxIPv6Networks");
            }
            if (constraintsMap.hasKey("tcpCandidatePolicy") && constraintsMap.getType("tcpCandidatePolicy") == ObjectType.String && (string4 = constraintsMap.getString("tcpCandidatePolicy")) != null) {
                if (string4.equals(BackendConfig.Restrictions.ENABLED)) {
                    rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
                } else if (string4.equals(BackendConfig.Restrictions.DISABLED)) {
                    rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.DISABLED;
                }
            }
            if (constraintsMap.hasKey("candidateNetworkPolicy") && constraintsMap.getType("candidateNetworkPolicy") == ObjectType.String && (string3 = constraintsMap.getString("candidateNetworkPolicy")) != null) {
                if (string3.equals("low_cost")) {
                    rTCConfiguration.candidateNetworkPolicy = PeerConnection.CandidateNetworkPolicy.LOW_COST;
                } else if (string3.equals("all")) {
                    rTCConfiguration.candidateNetworkPolicy = PeerConnection.CandidateNetworkPolicy.ALL;
                }
            }
            if (constraintsMap.hasKey("keyType") && constraintsMap.getType("keyType") == ObjectType.String && (string2 = constraintsMap.getString("keyType")) != null) {
                if (string2.equals("RSA")) {
                    rTCConfiguration.keyType = PeerConnection.KeyType.RSA;
                } else if (string2.equals(JCP.ECDSA_NAME)) {
                    rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
                }
            }
            if (constraintsMap.hasKey("continualGatheringPolicy") && constraintsMap.getType("continualGatheringPolicy") == ObjectType.String && (string = constraintsMap.getString("continualGatheringPolicy")) != null) {
                if (string.equals("gather_once")) {
                    rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_ONCE;
                } else if (string.equals("gather_continually")) {
                    rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
                }
            }
            if (constraintsMap.hasKey("audioJitterBufferMaxPackets") && constraintsMap.getType("audioJitterBufferMaxPackets") == ObjectType.Number && (i = constraintsMap.getInt("audioJitterBufferMaxPackets")) > 0) {
                rTCConfiguration.audioJitterBufferMaxPackets = i;
            }
            if (constraintsMap.hasKey("iceConnectionReceivingTimeout") && constraintsMap.getType("iceConnectionReceivingTimeout") == ObjectType.Number) {
                rTCConfiguration.iceConnectionReceivingTimeout = constraintsMap.getInt("iceConnectionReceivingTimeout");
            }
            if (constraintsMap.hasKey("iceBackupCandidatePairPingInterval") && constraintsMap.getType("iceBackupCandidatePairPingInterval") == ObjectType.Number) {
                rTCConfiguration.iceBackupCandidatePairPingInterval = constraintsMap.getInt("iceBackupCandidatePairPingInterval");
            }
            if (constraintsMap.hasKey("audioJitterBufferFastAccelerate") && constraintsMap.getType("audioJitterBufferFastAccelerate") == ObjectType.Boolean) {
                rTCConfiguration.audioJitterBufferFastAccelerate = constraintsMap.getBoolean("audioJitterBufferFastAccelerate");
            }
            if (constraintsMap.hasKey("pruneTurnPorts") && constraintsMap.getType("pruneTurnPorts") == ObjectType.Boolean) {
                rTCConfiguration.pruneTurnPorts = constraintsMap.getBoolean("pruneTurnPorts");
            }
            if (constraintsMap.hasKey("presumeWritableWhenFullyRelayed") && constraintsMap.getType("presumeWritableWhenFullyRelayed") == ObjectType.Boolean) {
                rTCConfiguration.presumeWritableWhenFullyRelayed = constraintsMap.getBoolean("presumeWritableWhenFullyRelayed");
            }
            if (constraintsMap.hasKey("cryptoOptions") && constraintsMap.getType("cryptoOptions") == ObjectType.Map) {
                ConstraintsMap map = constraintsMap.getMap("cryptoOptions");
                CryptoOptions.Builder enableEncryptedRtpHeaderExtensions = CryptoOptions.builder().setEnableGcmCryptoSuites(map.hasKey("enableGcmCryptoSuites") && map.getBoolean("enableGcmCryptoSuites")).setRequireFrameEncryption(map.hasKey("requireFrameEncryption") && map.getBoolean("requireFrameEncryption")).setEnableEncryptedRtpHeaderExtensions(map.hasKey("enableEncryptedRtpHeaderExtensions") && map.getBoolean("enableEncryptedRtpHeaderExtensions"));
                if (map.hasKey("enableAes128Sha1_32CryptoCipher") && map.getBoolean("enableAes128Sha1_32CryptoCipher")) {
                    z = true;
                }
                rTCConfiguration.cryptoOptions = enableEncryptedRtpHeaderExtensions.setEnableAes128Sha1_32CryptoCipher(z).createCryptoOptions();
            }
            if (constraintsMap.hasKey("enableCpuOveruseDetection") && constraintsMap.getType("enableCpuOveruseDetection") == ObjectType.Boolean) {
                rTCConfiguration.enableCpuOveruseDetection = constraintsMap.getBoolean("enableCpuOveruseDetection");
            }
        }
        return rTCConfiguration;
    }

    private void removeStreamForRendererById(String str) {
        for (int i = 0; i < this.renders.size(); i++) {
            FlutterRTCVideoRenderer valueAt = this.renders.valueAt(i);
            if (valueAt.checkMediaStream(str, "local")) {
                valueAt.setStream(null, "");
            }
        }
    }

    private void removeTrackForRendererById(String str) {
        for (int i = 0; i < this.renders.size(); i++) {
            FlutterRTCVideoRenderer valueAt = this.renders.valueAt(i);
            if (valueAt.checkVideoTrack(str, "local")) {
                valueAt.setStream(null, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void resultError(String str, String str2, da20 da20Var) {
        da20Var.error(str, g8e.p(str, "(): ", str2), null);
    }

    public void addTrack(String str, String str2, List<String> list, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        LocalTrack localTrack = this.localTracks.get(str2);
        if (localTrack == null) {
            resultError("addTrack", "track is null", da20Var);
        } else if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("addTrack", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.addTrack(localTrack.track, list, da20Var);
        }
    }

    public void addTransceiver(String str, String str2, Map<String, Object> map, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        LocalTrack localTrack = this.localTracks.get(str2);
        if (localTrack == null) {
            resultError("addTransceiver", "track is null", da20Var);
        } else if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("addTransceiver", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.addTransceiver(localTrack.track, map, da20Var);
        }
    }

    public void addTransceiverOfType(String str, String str2, Map<String, Object> map, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("addTransceiverOfType", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.addTransceiverOfType(str2, map, da20Var);
        }
    }

    public void createDataChannel(String str, String str2, ConstraintsMap constraintsMap, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            return;
        }
        peerConnectionObserver.createDataChannel(str2, constraintsMap, da20Var);
    }

    public void dataChannelClose(String str, String str2) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            return;
        }
        peerConnectionObserver.dataChannelClose(str2);
    }

    public void dataChannelSend(String str, String str2, ByteBuffer byteBuffer, Boolean bool) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            return;
        }
        peerConnectionObserver.dataChannelSend(str2, byteBuffer, bool);
    }

    public void dispose() {
        for (MediaStream mediaStream : this.localStreams.values()) {
            streamDispose(mediaStream);
            mediaStream.dispose();
        }
        this.localStreams.clear();
        Iterator<LocalTrack> it = this.localTracks.values().iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.localTracks.clear();
        Iterator<PeerConnectionObserver> it2 = this.mPeerConnectionObservers.values().iterator();
        while (it2.hasNext()) {
            peerConnectionDispose(it2.next());
        }
        this.mPeerConnectionObservers.clear();
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public Activity getActivity() {
        return this.activity;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public Context getApplicationContext() {
        return this.context;
    }

    public ConstraintsMap getCameraInfo(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            ConstraintsMap constraintsMap = new ConstraintsMap();
            String str = cameraInfo.facing == 1 ? "front" : "back";
            StringBuilder v = unr0.v(i, "Camera ", ", Facing ", str, ", Orientation ");
            v.append(cameraInfo.orientation);
            constraintsMap.putString("label", v.toString());
            constraintsMap.putString("deviceId", "" + i);
            constraintsMap.putString("facing", str);
            constraintsMap.putString("kind", "videoinput");
            constraintsMap.putString("groupId", "camera");
            return constraintsMap;
        } catch (Exception e) {
            Logging.e("CameraEnumerationAndroid", "getCameraInfo failed on index " + i, e);
            return null;
        }
    }

    public void getDisplayMedia(ConstraintsMap constraintsMap, da20 da20Var) {
        MediaStream createLocalMediaStream = this.mFactory.createLocalMediaStream(getNextStreamUUID());
        if (createLocalMediaStream == null) {
            resultError("getDisplayMedia", "Failed to create new media stream", da20Var);
        } else {
            this.getUserMediaImpl.getDisplayMedia(constraintsMap, da20Var, createLocalMediaStream);
        }
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public LocalTrack getLocalTrack(String str) {
        return this.localTracks.get(str);
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public tt5 getMessenger() {
        return this.messenger;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public String getNextStreamUUID() {
        String uuid;
        do {
            uuid = UUID.randomUUID().toString();
        } while (getStreamForId(uuid, "") != null);
        return uuid;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public String getNextTrackUUID() {
        String uuid;
        do {
            uuid = UUID.randomUUID().toString();
        } while (getTrackForId(uuid, null) != null);
        return uuid;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public PeerConnectionFactory getPeerConnectionFactory() {
        return this.mFactory;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public PeerConnectionObserver getPeerConnectionObserver(String str) {
        return this.mPeerConnectionObservers.get(str);
    }

    public void getReceivers(String str, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("getReceivers", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.getReceivers(da20Var);
        }
    }

    public MediaStreamTrack getRemoteTrack(String str) {
        Iterator<Map.Entry<String, PeerConnectionObserver>> it = this.mPeerConnectionObservers.entrySet().iterator();
        while (it.hasNext()) {
            PeerConnectionObserver value = it.next().getValue();
            MediaStreamTrack mediaStreamTrack = value.remoteTracks.get(str);
            if (mediaStreamTrack == null) {
                mediaStreamTrack = value.getTransceiversTrack(str);
            }
            if (mediaStreamTrack != null) {
                return mediaStreamTrack;
            }
        }
        return null;
    }

    public void getSenders(String str, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("getSenders", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.getSenders(da20Var);
        }
    }

    public void getSources(da20 da20Var) {
        ConstraintsArray constraintsArray = new ConstraintsArray();
        String[] strArr = new String[Camera.getNumberOfCameras()];
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            ConstraintsMap cameraInfo = getCameraInfo(i);
            if (cameraInfo != null) {
                constraintsArray.pushMap(cameraInfo);
            }
        }
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getDevices(1)) {
            if (audioDeviceInfo.getType() == 15 || audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 3) {
                ConstraintsMap constraintsMap = new ConstraintsMap();
                constraintsMap.putString("label", AudioUtils.getAudioDeviceLabel(audioDeviceInfo));
                constraintsMap.putString("deviceId", AudioUtils.getAudioDeviceId(audioDeviceInfo));
                constraintsMap.putString("groupId", AudioUtils.getAudioGroupId(audioDeviceInfo));
                constraintsMap.putString("kind", "audioinput");
                constraintsArray.pushMap(constraintsMap);
            }
        }
        for (hf3 hf3Var : AudioSwitchManager.instance.availableAudioDevices()) {
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            constraintsMap2.putString("label", hf3Var.a());
            constraintsMap2.putString("deviceId", AudioDeviceKind.fromAudioDevice(hf3Var).typeName);
            constraintsMap2.putString("groupId", "" + AudioDeviceKind.fromAudioDevice(hf3Var).typeName);
            constraintsMap2.putString("kind", "audiooutput");
            constraintsArray.pushMap(constraintsMap2);
        }
        ConstraintsMap constraintsMap3 = new ConstraintsMap();
        constraintsMap3.putArray("sources", constraintsArray.toArrayList());
        da20Var.success(constraintsMap3.toMap());
    }

    public MediaStream getStreamForId(String str, String str2) {
        int length = str2.length();
        Map<String, PeerConnectionObserver> map = this.mPeerConnectionObservers;
        MediaStream mediaStream = null;
        if (length > 0) {
            PeerConnectionObserver peerConnectionObserver = map.get(str2);
            if (peerConnectionObserver != null) {
                mediaStream = peerConnectionObserver.remoteStreams.get(str);
            }
        } else {
            Iterator<Map.Entry<String, PeerConnectionObserver>> it = map.entrySet().iterator();
            while (it.hasNext() && (mediaStream = it.next().getValue().remoteStreams.get(str)) == null) {
            }
        }
        return mediaStream == null ? this.localStreams.get(str) : mediaStream;
    }

    public MediaStreamTrack getTrackForId(String str, String str2) {
        LocalTrack localTrack = this.localTracks.get(str);
        if (localTrack != null) {
            return localTrack.track;
        }
        MediaStreamTrack mediaStreamTrack = null;
        for (Map.Entry<String, PeerConnectionObserver> entry : this.mPeerConnectionObservers.entrySet()) {
            if (str2 == null || entry.getKey().compareTo(str2) == 0) {
                PeerConnectionObserver value = entry.getValue();
                MediaStreamTrack mediaStreamTrack2 = value.remoteTracks.get(str);
                mediaStreamTrack = mediaStreamTrack2 == null ? value.getTransceiversTrack(str) : mediaStreamTrack2;
                if (mediaStreamTrack != null) {
                    break;
                }
            }
        }
        return mediaStreamTrack;
    }

    public void getTransceivers(String str, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("getTransceivers", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.getTransceivers(da20Var);
        }
    }

    public void getUserMedia(ConstraintsMap constraintsMap, da20 da20Var) {
        MediaStream createLocalMediaStream = this.mFactory.createLocalMediaStream(getNextStreamUUID());
        if (createLocalMediaStream == null) {
            resultError("getUserMediaFailed", "Failed to create new media stream", da20Var);
        } else {
            this.getUserMediaImpl.getUserMedia(constraintsMap, da20Var, createLocalMediaStream);
        }
    }

    public void mediaStreamAddTrack(String str, String str2, da20 da20Var) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            resultError("mediaStreamAddTrack", oyr.p("mediaStreamAddTrack() stream [", str, "] is null"), da20Var);
            return;
        }
        MediaStreamTrack trackForId = getTrackForId(str2, null);
        if (trackForId == null) {
            resultError("mediaStreamAddTrack", oyr.p("mediaStreamAddTrack() track [", str2, "] is null"), da20Var);
            return;
        }
        String kind = trackForId.kind();
        if (kind.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            mediaStream.addTrack((AudioTrack) trackForId);
            da20Var.success(null);
        } else if (!kind.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            resultError("mediaStreamAddTrack", b64.l("mediaStreamAddTrack() track [", str2, "] has unsupported type: ", kind), da20Var);
        } else {
            mediaStream.addTrack((VideoTrack) trackForId);
            da20Var.success(null);
        }
    }

    public void mediaStreamRemoveTrack(String str, String str2, da20 da20Var) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            resultError("mediaStreamRemoveTrack", oyr.p("mediaStreamRemoveTrack() stream [", str, "] is null"), da20Var);
            return;
        }
        LocalTrack localTrack = this.localTracks.get(str2);
        if (localTrack == null) {
            resultError("mediaStreamRemoveTrack", oyr.p("mediaStreamRemoveTrack() track [", str2, "] is null"), da20Var);
            return;
        }
        String kind = localTrack.kind();
        if (kind.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            mediaStream.removeTrack((AudioTrack) localTrack.track);
            da20Var.success(null);
        } else if (!kind.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            resultError("mediaStreamRemoveTrack", b64.l("mediaStreamRemoveTrack() track [", str2, "] has unsupported type: ", kind), da20Var);
        } else {
            mediaStream.removeTrack((VideoTrack) localTrack.track);
            da20Var.success(null);
        }
    }

    public void mediaStreamTrackRelease(String str, String str2) {
        LocalTrack localTrack;
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null || (localTrack = this.localTracks.get(str2)) == null) {
            return;
        }
        localTrack.setEnabled(false);
        this.localTracks.remove(str2);
        if (localTrack.kind().equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            mediaStream.removeTrack((AudioTrack) localTrack.track);
        } else if (localTrack.kind().equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            mediaStream.removeTrack((VideoTrack) localTrack.track);
            this.getUserMediaImpl.removeVideoCapturer(str2);
        }
    }

    public void mediaStreamTrackSetEnabled(String str, boolean z, String str2) {
        MediaStreamTrack trackForId = getTrackForId(str, str2);
        if (trackForId == null || trackForId.enabled() == z) {
            return;
        }
        trackForId.setEnabled(z);
    }

    public void mediaStreamTrackSetVolume(String str, double d, String str2) {
        MediaStreamTrack trackForId = getTrackForId(str, null);
        if (trackForId instanceof AudioTrack) {
            try {
                ((AudioTrack) trackForId).setVolume(d);
            } catch (Exception e) {
                Log.e("FlutterWebRTCPlugin", "setVolume(): error", e);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        char c;
        String str;
        String str2;
        String str3;
        String str4;
        VideoTrack videoTrack;
        AudioChannel audioChannel;
        Integer num;
        Double d;
        Double d2;
        LocalTrack localTrack;
        int i;
        int i2;
        ConstraintsMap constraintsMap;
        ConstraintsArray array;
        char c2;
        Double d3;
        Double d4;
        AnyThreadResult anyThreadResult = new AnyThreadResult(da20Var);
        String str5 = x920Var.a;
        str5.getClass();
        switch (str5.hashCode()) {
            case -2029538871:
                if (str5.equals("mediaStreamTrackHasTorch")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2018433153:
                if (str5.equals("getIceGatheringState")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -2012155104:
                if (str5.equals("getRemoteDescription")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1986592945:
                if (str5.equals("enableSpeakerphoneButPreferBluetooth")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1775201796:
                if (str5.equals("restartIce")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1750276065:
                if (str5.equals("peerConnectionDispose")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1741316902:
                if (str5.equals("rtpSenderReplaceTrack")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1616154678:
                if (str5.equals("startRecordToFile")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1531347291:
                if (str5.equals("mediaStreamTrackSetExposureMode")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1519605372:
                if (str5.equals("setCodecPreferences")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1473768637:
                if (str5.equals("addTransceiver")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1413157019:
                if (str5.equals("setMicrophoneMute")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1360576767:
                if (str5.equals("setPreferredInputDevice")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1278187352:
                if (str5.equals("getSenders")) {
                    c = HexString.LF;
                    break;
                }
                c = 65535;
                break;
            case -1276198134:
                if (str5.equals("clearAndroidCommunicationDevice")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1246051030:
                if (str5.equals("addTrack")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1215346305:
                if (str5.equals("videoRendererSetSrcObject")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1149209849:
                if (str5.equals("getLocalDescription")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1133030926:
                if (str5.equals("enableSpeakerphone")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1128914952:
                if (str5.equals("peerConnectionClose")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1070259528:
                if (str5.equals("getDisplayMedia")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1016490060:
                if (str5.equals("setConfiguration")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -985016446:
                if (str5.equals("getSources")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -853425884:
                if (str5.equals("removeStream")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -848411798:
                if (str5.equals("stopRecordToFile")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -814414636:
                if (str5.equals("rtpSenderSetStreams")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -755487682:
                if (str5.equals("getIceConnectionState")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -754817791:
                if (str5.equals("mediaStreamTrackSetTorch")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -733144257:
                if (str5.equals("rtpTransceiverGetDirection")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -716906962:
                if (str5.equals("mediaStreamTrackSetZoom")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -508770624:
                if (str5.equals("createOffer")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -493039020:
                if (str5.equals("trackDispose")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -458608769:
                if (str5.equals("dataChannelClose")) {
                    c = HexString.CHAR_SPACE;
                    break;
                }
                c = 65535;
                break;
            case -335765670:
                if (str5.equals("mediaStreamGetTracks")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -303776985:
                if (str5.equals("removeTrack")) {
                    c = OpenList.CHAR_QUOTE;
                    break;
                }
                c = 65535;
                break;
            case -224350002:
                if (str5.equals("mediaStreamTrackSetExposurePoint")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -79205919:
                if (str5.equals("videoRendererDispose")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -74359520:
                if (str5.equals("mediaStreamTrackSetFocusMode")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -49161876:
                if (str5.equals("rtpSenderSetTrack")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 849793:
                if (str5.equals("addStream")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 14738269:
                if (str5.equals("createDataChannel")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 94533635:
                if (str5.equals("mediaStreamRemoveTrack")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 192554293:
                if (str5.equals("createLocalMediaStream")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 249725048:
                if (str5.equals("rtpTransceiverStop")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 257409565:
                if (str5.equals("getConnectionState")) {
                    c = HexString.CHAR_COMMA;
                    break;
                }
                c = 65535;
                break;
            case 312847395:
                if (str5.equals("getUserMedia")) {
                    c = LicenseUtility.SEPARATOR;
                    break;
                }
                c = 65535;
                break;
            case 370762210:
                if (str5.equals("addCandidate")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 378901966:
                if (str5.equals("mediaStreamAddTrack")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 539865377:
                if (str5.equals("dataChannelSend")) {
                    c = MoneyInputEditView.DEFAULT_VALUE;
                    break;
                }
                c = 65535;
                break;
            case 670514716:
                if (str5.equals("setVolume")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 689882542:
                if (str5.equals("getReceivers")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 743935431:
                if (str5.equals("captureFrame")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 810983395:
                if (str5.equals("getRtpSenderCapabilities")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 815848371:
                if (str5.equals("rtpTransceiverSetDirection")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 860427970:
                if (str5.equals("createVideoRenderer")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 871091088:
                if (str5.equals("initialize")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 1008232166:
                if (str5.equals("requestCapturePermission")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 1014964186:
                if (str5.equals("createAnswer")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case 1066335740:
                if (str5.equals("createPeerConnection")) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case 1108149445:
                if (str5.equals("getTransceivers")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case 1246983633:
                if (str5.equals("sendDtmf")) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 1332393542:
                if (str5.equals("rtpTransceiverGetCurrentDirection")) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case 1602029587:
                if (str5.equals("setLocalDescription")) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case 1671888788:
                if (str5.equals("setRemoteDescription")) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case 1696515689:
                if (str5.equals("rtpSenderSetParameters")) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case 1819903040:
                if (str5.equals("mediaStreamTrackSwitchCamera")) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case 1856030640:
                if (str5.equals("selectAudioInput")) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case 1880729051:
                if (str5.equals("selectAudioOutput")) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case 1930015389:
                if (str5.equals("getRtpReceiverCapabilities")) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case 1933307245:
                if (str5.equals("getSignalingState")) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case 1939584286:
                if (str5.equals("mediaStreamTrackSetEnable")) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case 1965583081:
                if (str5.equals("getStats")) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case 1992597939:
                if (str5.equals("mediaStreamTrackSetFocusPoint")) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case 2082225997:
                if (str5.equals("setAndroidAudioConfiguration")) {
                    c = 'I';
                    break;
                }
                c = 65535;
                break;
            case 2144861823:
                if (str5.equals("streamDispose")) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str6 = "local";
        switch (c) {
            case 0:
                this.cameraUtils.hasTorch((String) x920Var.a("trackId"), anyThreadResult);
                break;
            case 1:
                PeerConnection peerConnection = getPeerConnection((String) x920Var.a("peerConnectionId"));
                if (peerConnection == null) {
                    resultError("getIceGatheringState", "peerConnection is null", anyThreadResult);
                    break;
                } else {
                    ConstraintsMap constraintsMap2 = new ConstraintsMap();
                    constraintsMap2.putString(ClidProvider.STATE, Utils.iceGatheringStateString(peerConnection.iceGatheringState()));
                    anyThreadResult.success(constraintsMap2.toMap());
                    break;
                }
            case 2:
                PeerConnection peerConnection2 = getPeerConnection((String) x920Var.a("peerConnectionId"));
                if (peerConnection2 != null) {
                    SessionDescription remoteDescription = peerConnection2.getRemoteDescription();
                    if (remoteDescription == null) {
                        anyThreadResult.success(null);
                        break;
                    } else {
                        ConstraintsMap constraintsMap3 = new ConstraintsMap();
                        constraintsMap3.putString("sdp", remoteDescription.description);
                        constraintsMap3.putString("type", remoteDescription.type.canonicalForm());
                        anyThreadResult.success(constraintsMap3.toMap());
                        break;
                    }
                } else {
                    resultError("getRemoteDescription", "peerConnection is null", anyThreadResult);
                    break;
                }
            case 3:
                AudioSwitchManager.instance.enableSpeakerButPreferBluetooth();
                anyThreadResult.success(null);
                break;
            case 4:
                restartIce((String) x920Var.a("peerConnectionId"));
                anyThreadResult.success(null);
                break;
            case 5:
                peerConnectionDispose((String) x920Var.a("peerConnectionId"));
                anyThreadResult.success(null);
                break;
            case 6:
                rtpSenderSetTrack((String) x920Var.a("peerConnectionId"), (String) x920Var.a("rtpSenderId"), (String) x920Var.a("trackId"), true, anyThreadResult);
                break;
            case 7:
                x920 x920Var2 = x920Var;
                try {
                    str2 = (String) x920Var2.a(StateEntry.COLUMN_PATH);
                    str3 = (String) x920Var2.a("videoTrackId");
                    str4 = (String) x920Var2.a("peerConnectionId");
                } catch (Exception e) {
                    e = e;
                    str = "startRecordToFile";
                }
                try {
                    if (str3 != null) {
                        MediaStreamTrack trackForId = getTrackForId(str3, str4);
                        if (trackForId instanceof VideoTrack) {
                            videoTrack = (VideoTrack) trackForId;
                            audioChannel = (x920Var2.c("audioChannel") || x920Var2.a("audioChannel") == null) ? null : AudioChannel.values()[((Integer) x920Var2.a("audioChannel")).intValue()];
                            num = (Integer) x920Var2.a("recorderId");
                            if (videoTrack == null || audioChannel != null) {
                                this.getUserMediaImpl.startRecordingToFile(str2, num, videoTrack, audioChannel);
                                anyThreadResult.success(null);
                                break;
                            } else {
                                resultError("startRecordToFile", "No tracks", anyThreadResult);
                                break;
                            }
                        }
                    }
                    if (videoTrack == null) {
                    }
                    this.getUserMediaImpl.startRecordingToFile(str2, num, videoTrack, audioChannel);
                    anyThreadResult.success(null);
                } catch (Exception e2) {
                    e = e2;
                    str = x920Var2;
                    resultError(str, e.getMessage(), anyThreadResult);
                    return;
                }
                videoTrack = null;
                if (x920Var2.c("audioChannel")) {
                }
                num = (Integer) x920Var2.a("recorderId");
            case '\b':
                this.cameraUtils.setExposureMode(x920Var, anyThreadResult);
                break;
            case '\t':
                rtpTransceiverSetCodecPreferences((String) x920Var.a("peerConnectionId"), (String) x920Var.a("transceiverId"), (List) x920Var.a("codecs"), anyThreadResult);
                break;
            case '\n':
                String str7 = (String) x920Var.a("peerConnectionId");
                Map<String, Object> map = (Map) x920Var.a("transceiverInit");
                if (x920Var.c("trackId")) {
                    addTransceiver(str7, (String) x920Var.a("trackId"), map, anyThreadResult);
                    break;
                } else if (x920Var.c("mediaType")) {
                    addTransceiverOfType(str7, (String) x920Var.a("mediaType"), map, anyThreadResult);
                    break;
                } else {
                    resultError("addTransceiver", "Incomplete parameters", anyThreadResult);
                    break;
                }
            case 11:
                AudioSwitchManager.instance.setMicrophoneMute(((Boolean) x920Var.a("mute")).booleanValue());
                anyThreadResult.success(null);
                break;
            case '\f':
                this.getUserMediaImpl.setPreferredInputDevice((String) x920Var.a("deviceId"));
                anyThreadResult.success(null);
                break;
            case '\r':
                getSenders((String) x920Var.a("peerConnectionId"), anyThreadResult);
                break;
            case 14:
                AudioSwitchManager.instance.clearCommunicationDevice();
                break;
            case 15:
                addTrack((String) x920Var.a("peerConnectionId"), (String) x920Var.a("trackId"), (List) x920Var.a("streamIds"), anyThreadResult);
                break;
            case 16:
                int intValue = ((Integer) x920Var.a("textureId")).intValue();
                String str8 = (String) x920Var.a("streamId");
                String str9 = (String) x920Var.a("ownerTag");
                String str10 = (String) x920Var.a("trackId");
                FlutterRTCVideoRenderer flutterRTCVideoRenderer = this.renders.get(intValue);
                if (flutterRTCVideoRenderer == null) {
                    resultError("videoRendererSetSrcObject", oyr.j(intValue, "render [", "] not found !"), anyThreadResult);
                    break;
                } else {
                    MediaStream streamForId = str9.equals(str6) ? this.localStreams.get(str8) : getStreamForId(str8, str9);
                    if (str10 == null || str10.equals("0")) {
                        flutterRTCVideoRenderer.setStream(streamForId, str9);
                    } else {
                        flutterRTCVideoRenderer.setStream(streamForId, str10, str9);
                    }
                    anyThreadResult.success(null);
                    break;
                }
                break;
            case 17:
                PeerConnection peerConnection3 = getPeerConnection((String) x920Var.a("peerConnectionId"));
                if (peerConnection3 != null) {
                    SessionDescription localDescription = peerConnection3.getLocalDescription();
                    ConstraintsMap constraintsMap4 = new ConstraintsMap();
                    constraintsMap4.putString("sdp", localDescription.description);
                    constraintsMap4.putString("type", localDescription.type.canonicalForm());
                    anyThreadResult.success(constraintsMap4.toMap());
                    break;
                } else {
                    resultError("getLocalDescription", "peerConnection is null", anyThreadResult);
                    break;
                }
            case 18:
                AudioSwitchManager.instance.enableSpeakerphone(((Boolean) x920Var.a("enable")).booleanValue());
                anyThreadResult.success(null);
                break;
            case 19:
                peerConnectionClose((String) x920Var.a("peerConnectionId"));
                anyThreadResult.success(null);
                break;
            case 20:
                getDisplayMedia(new ConstraintsMap((Map) x920Var.a("constraints")), anyThreadResult);
                break;
            case 21:
                String str11 = (String) x920Var.a("peerConnectionId");
                Map map2 = (Map) x920Var.a("configuration");
                PeerConnection peerConnection4 = getPeerConnection(str11);
                if (peerConnection4 != null) {
                    peerConnectionSetConfiguration(new ConstraintsMap(map2), peerConnection4);
                    anyThreadResult.success(null);
                    break;
                } else {
                    resultError("setConfiguration", "peerConnection is null", anyThreadResult);
                    break;
                }
            case 22:
                getSources(anyThreadResult);
                break;
            case 23:
                peerConnectionRemoveStream((String) x920Var.a("streamId"), (String) x920Var.a("peerConnectionId"), anyThreadResult);
                break;
            case 24:
                this.getUserMediaImpl.stopRecording((Integer) x920Var.a("recorderId"));
                anyThreadResult.success(null);
                break;
            case 25:
                rtpSenderSetStreams((String) x920Var.a("peerConnectionId"), (String) x920Var.a("rtpSenderId"), (List) x920Var.a("streamIds"), anyThreadResult);
                break;
            case 26:
                PeerConnection peerConnection5 = getPeerConnection((String) x920Var.a("peerConnectionId"));
                if (peerConnection5 == null) {
                    resultError("getIceConnectionState", "peerConnection is null", anyThreadResult);
                    break;
                } else {
                    ConstraintsMap constraintsMap5 = new ConstraintsMap();
                    constraintsMap5.putString(ClidProvider.STATE, Utils.iceConnectionStateString(peerConnection5.iceConnectionState()));
                    anyThreadResult.success(constraintsMap5.toMap());
                    break;
                }
            case 27:
                this.cameraUtils.setTorch((String) x920Var.a("trackId"), ((Boolean) x920Var.a("torch")).booleanValue(), anyThreadResult);
                break;
            case 28:
                rtpTransceiverGetDirection((String) x920Var.a("peerConnectionId"), (String) x920Var.a("transceiverId"), anyThreadResult);
                break;
            case 29:
                this.cameraUtils.setZoom((String) x920Var.a("trackId"), ((Double) x920Var.a("zoomLevel")).doubleValue(), anyThreadResult);
                break;
            case 30:
                peerConnectionCreateOffer((String) x920Var.a("peerConnectionId"), new ConstraintsMap((Map) x920Var.a("constraints")), anyThreadResult);
                break;
            case 31:
                trackDispose((String) x920Var.a("trackId"));
                anyThreadResult.success(null);
                break;
            case ' ':
                dataChannelClose((String) x920Var.a("peerConnectionId"), (String) x920Var.a("dataChannelId"));
                anyThreadResult.success(null);
                break;
            case '!':
                AnyThreadResult anyThreadResult2 = anyThreadResult;
                MediaStream streamForId2 = getStreamForId((String) x920Var.a("streamId"), "");
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<AudioTrack> it = streamForId2.audioTracks.iterator();
                while (it.hasNext()) {
                    AudioTrack next = it.next();
                    Iterator<AudioTrack> it2 = it;
                    this.localTracks.put(next.id(), new LocalAudioTrack(next));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(next.enabled()));
                    hashMap2.put("id", next.id());
                    hashMap2.put("kind", next.kind());
                    hashMap2.put("label", next.id());
                    hashMap2.put("readyState", "live");
                    hashMap2.put("remote", Boolean.FALSE);
                    arrayList.add(hashMap2);
                    it = it2;
                    anyThreadResult2 = anyThreadResult2;
                }
                da20 da20Var2 = anyThreadResult2;
                for (VideoTrack videoTrack2 : streamForId2.videoTracks) {
                    this.localTracks.put(videoTrack2.id(), new LocalVideoTrack(videoTrack2));
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(videoTrack2.enabled()));
                    hashMap3.put("id", videoTrack2.id());
                    hashMap3.put("kind", videoTrack2.kind());
                    hashMap3.put("label", videoTrack2.id());
                    hashMap3.put("readyState", "live");
                    hashMap3.put("remote", Boolean.FALSE);
                    arrayList2.add(hashMap3);
                }
                hashMap.put("audioTracks", arrayList);
                hashMap.put("videoTracks", arrayList2);
                da20Var2.success(hashMap);
                break;
            case '\"':
                removeTrack((String) x920Var.a("peerConnectionId"), (String) x920Var.a("senderId"), anyThreadResult);
                break;
            case '#':
                Map map3 = (Map) x920Var.a("exposurePoint");
                Boolean bool = (Boolean) map3.get("reset");
                if (bool == null || !bool.booleanValue()) {
                    d = (Double) map3.get(RemoteBioParameters.X);
                    d2 = (Double) map3.get(RemoteBioParameters.Y);
                } else {
                    d2 = null;
                    d = null;
                }
                this.cameraUtils.setExposurePoint(x920Var, new Point(d, d2), anyThreadResult);
                break;
            case '$':
                int intValue2 = ((Integer) x920Var.a("textureId")).intValue();
                long j = intValue2;
                FlutterRTCVideoRenderer flutterRTCVideoRenderer2 = this.renders.get(j);
                if (flutterRTCVideoRenderer2 == null) {
                    resultError("videoRendererDispose", oyr.j(intValue2, "render [", "] not found !"), anyThreadResult);
                    break;
                } else {
                    flutterRTCVideoRenderer2.Dispose();
                    this.renders.delete(j);
                    anyThreadResult.success(null);
                    break;
                }
            case '%':
                this.cameraUtils.setFocusMode(x920Var, anyThreadResult);
                break;
            case '&':
                rtpSenderSetTrack((String) x920Var.a("peerConnectionId"), (String) x920Var.a("rtpSenderId"), (String) x920Var.a("trackId"), false, anyThreadResult);
                break;
            case '\'':
                peerConnectionAddStream((String) x920Var.a("streamId"), (String) x920Var.a("peerConnectionId"), anyThreadResult);
                break;
            case '(':
                createDataChannel((String) x920Var.a("peerConnectionId"), (String) x920Var.a("label"), new ConstraintsMap((Map) x920Var.a("dataChannelDict")), anyThreadResult);
                break;
            case ')':
                String str12 = (String) x920Var.a("streamId");
                mediaStreamRemoveTrack(str12, (String) x920Var.a("trackId"), anyThreadResult);
                removeStreamForRendererById(str12);
                break;
            case '*':
                createLocalMediaStream(anyThreadResult);
                break;
            case '+':
                rtpTransceiverStop((String) x920Var.a("peerConnectionId"), (String) x920Var.a("transceiverId"), anyThreadResult);
                break;
            case ',':
                PeerConnection peerConnection6 = getPeerConnection((String) x920Var.a("peerConnectionId"));
                if (peerConnection6 == null) {
                    resultError("getConnectionState", "peerConnection is null", anyThreadResult);
                    break;
                } else {
                    ConstraintsMap constraintsMap6 = new ConstraintsMap();
                    constraintsMap6.putString(ClidProvider.STATE, Utils.connectionStateString(peerConnection6.connectionState()));
                    anyThreadResult.success(constraintsMap6.toMap());
                    break;
                }
            case '-':
                getUserMedia(new ConstraintsMap((Map) x920Var.a("constraints")), anyThreadResult);
                break;
            case '.':
                peerConnectionAddICECandidate(new ConstraintsMap((Map) x920Var.a("candidate")), (String) x920Var.a("peerConnectionId"), anyThreadResult);
                break;
            case '/':
                String str13 = (String) x920Var.a("streamId");
                String str14 = (String) x920Var.a("trackId");
                mediaStreamAddTrack(str13, str14, anyThreadResult);
                int i3 = 0;
                while (i3 < this.renders.size()) {
                    FlutterRTCVideoRenderer valueAt = this.renders.valueAt(i3);
                    String str15 = str6;
                    if (valueAt.checkMediaStream(str13, str15) && (localTrack = this.localTracks.get(str14)) != null) {
                        valueAt.setVideoTrack((VideoTrack) localTrack.track);
                    }
                    i3++;
                    str6 = str15;
                }
                break;
            case '0':
                String str16 = (String) x920Var.a("peerConnectionId");
                String str17 = (String) x920Var.a("dataChannelId");
                boolean equals = ((String) x920Var.a("type")).equals(BuildConfig.SDK_DEPENDENCY);
                dataChannelSend(str16, str17, equals ? ByteBuffer.wrap((byte[]) x920Var.a(Constants.KEY_DATA)) : ByteBuffer.wrap(((String) x920Var.a(Constants.KEY_DATA)).getBytes(StandardCharsets.UTF_8)), Boolean.valueOf(equals));
                anyThreadResult.success(null);
                break;
            case '1':
                mediaStreamTrackSetVolume((String) x920Var.a("trackId"), ((Double) x920Var.a("volume")).doubleValue(), (String) x920Var.a("peerConnectionId"));
                anyThreadResult.success(null);
                break;
            case '2':
                getReceivers((String) x920Var.a("peerConnectionId"), anyThreadResult);
                break;
            case SAFETY_TIPS_VALUE:
                String str18 = (String) x920Var.a(StateEntry.COLUMN_PATH);
                String str19 = (String) x920Var.a("trackId");
                String str20 = (String) x920Var.a("peerConnectionId");
                if (str19 != null) {
                    MediaStreamTrack trackForId2 = getTrackForId(str19, str20);
                    if (trackForId2 instanceof VideoTrack) {
                        new FrameCapturer((VideoTrack) trackForId2, new File(str18), anyThreadResult);
                        break;
                    } else {
                        resultError("captureFrame", "It's not video track", anyThreadResult);
                        break;
                    }
                } else {
                    resultError("captureFrame", "Track is null", anyThreadResult);
                    break;
                }
            case '4':
                String str21 = (String) x920Var.a("kind");
                MediaStreamTrack.MediaType mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO;
                if (str21.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO;
                }
                anyThreadResult.success(capabilitiestoMap(this.mFactory.getRtpSenderCapabilities(mediaType)).toMap());
                break;
            case '5':
                rtpTransceiverSetDirection((String) x920Var.a("peerConnectionId"), (String) x920Var.a("direction"), (String) x920Var.a("transceiverId"), anyThreadResult);
                break;
            case '6':
                xuy0 xuy0Var = this.textures;
                xuy0Var.getClass();
                TextureRegistry$SurfaceProducer b = ((io.flutter.embedding.engine.renderer.f) xuy0Var).b(TextureRegistry$SurfaceLifecycle.manual);
                FlutterRTCVideoRenderer flutterRTCVideoRenderer3 = new FlutterRTCVideoRenderer(b);
                this.renders.put(b.id(), flutterRTCVideoRenderer3);
                afo afoVar = new afo(this.messenger, "FlutterWebRTC/Texture" + b.id());
                afoVar.a(flutterRTCVideoRenderer3);
                flutterRTCVideoRenderer3.setEventChannel(afoVar);
                flutterRTCVideoRenderer3.setId((int) b.id());
                ConstraintsMap constraintsMap7 = new ConstraintsMap();
                constraintsMap7.putInt("textureId", (int) b.id());
                anyThreadResult.success(constraintsMap7.toMap());
                break;
            case SODA_DE_DE_VALUE:
                Map map4 = (Map) x920Var.a("options");
                ConstraintsMap constraintsMap8 = new ConstraintsMap(map4);
                if (constraintsMap8.hasKey("networkIgnoreMask") && constraintsMap8.getType("networkIgnoreMask") == ObjectType.Array && (array = constraintsMap8.getArray("networkIgnoreMask")) != null) {
                    Iterator<Object> it3 = array.toArrayList().iterator();
                    i = 0;
                    while (it3.hasNext()) {
                        String obj = it3.next().toString();
                        obj.getClass();
                        switch (obj.hashCode()) {
                            case -1094464034:
                                if (obj.equals("adapterTypeWifi")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -789419052:
                                if (obj.equals("adapterTypeLoopback")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -171711968:
                                if (obj.equals("adapterTypeEthernet")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 331049907:
                                if (obj.equals("adapterTypeCellular")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1904336387:
                                if (obj.equals("adapterTypeAny")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1904356619:
                                if (obj.equals("adapterTypeVpn")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                i += 2;
                                break;
                            case 1:
                                i += 16;
                                break;
                            case 2:
                                i++;
                                break;
                            case 3:
                                i += 4;
                                break;
                            case 4:
                                i += 32;
                                break;
                            case 5:
                                i += 8;
                                break;
                        }
                    }
                } else {
                    i = 0;
                }
                boolean z = (constraintsMap8.hasKey("forceSWCodec") && constraintsMap8.getType("forceSWCodec") == ObjectType.Boolean) ? constraintsMap8.getBoolean("forceSWCodec") : false;
                ArrayList arrayList3 = new ArrayList();
                if (constraintsMap8.hasKey("forceSWCodecList") && constraintsMap8.getType("forceSWCodecList") == ObjectType.Array) {
                    Iterator<Object> it4 = constraintsMap8.getListArray("forceSWCodecList").iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(it4.next().toString());
                    }
                } else {
                    arrayList3.add("VP9");
                }
                if (constraintsMap8.hasKey("androidAudioConfiguration") && constraintsMap8.getType("androidAudioConfiguration") == ObjectType.Map) {
                    int i4 = i;
                    constraintsMap = constraintsMap8.getMap("androidAudioConfiguration");
                    i2 = i4;
                } else {
                    i2 = i;
                    constraintsMap = null;
                }
                initialize(map4.get("bypassVoiceProcessing") != null ? ((Boolean) map4.get("bypassVoiceProcessing")).booleanValue() : false, i2, z, arrayList3, constraintsMap);
                anyThreadResult.success(null);
                break;
            case '8':
                this.getUserMediaImpl.requestCapturePermission(anyThreadResult);
                break;
            case SODA_ES_ES_VALUE:
                peerConnectionCreateAnswer((String) x920Var.a("peerConnectionId"), new ConstraintsMap((Map) x920Var.a("constraints")), anyThreadResult);
                break;
            case ':':
                String peerConnectionInit = peerConnectionInit(new ConstraintsMap((Map) x920Var.a("configuration")), new ConstraintsMap((Map) x920Var.a("constraints")));
                ConstraintsMap constraintsMap9 = new ConstraintsMap();
                constraintsMap9.putString("peerConnectionId", peerConnectionInit);
                anyThreadResult.success(constraintsMap9.toMap());
                break;
            case ';':
                getTransceivers((String) x920Var.a("peerConnectionId"), anyThreadResult);
                break;
            case '<':
                RtpSender rtpSender = null;
                String str22 = (String) x920Var.a("peerConnectionId");
                String str23 = (String) x920Var.a("tone");
                int intValue3 = ((Integer) x920Var.a("duration")).intValue();
                int intValue4 = ((Integer) x920Var.a("gap")).intValue();
                PeerConnection peerConnection7 = getPeerConnection(str22);
                if (peerConnection7 != null) {
                    for (RtpSender rtpSender2 : peerConnection7.getSenders()) {
                        if (rtpSender2 != null && rtpSender2.track() != null && rtpSender2.track().kind().equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                            rtpSender = rtpSender2;
                        }
                    }
                    if (rtpSender != null) {
                        rtpSender.dtmf().insertDtmf(str23, intValue3, intValue4);
                    }
                    anyThreadResult.success("success");
                    break;
                } else {
                    resultError("dtmf", "peerConnection is null", anyThreadResult);
                    break;
                }
                break;
            case '=':
                rtpTransceiverGetCurrentDirection((String) x920Var.a("peerConnectionId"), (String) x920Var.a("transceiverId"), anyThreadResult);
                break;
            case '>':
                peerConnectionSetLocalDescription(new ConstraintsMap((Map) x920Var.a(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)), (String) x920Var.a("peerConnectionId"), anyThreadResult);
                break;
            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                peerConnectionSetRemoteDescription(new ConstraintsMap((Map) x920Var.a(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)), (String) x920Var.a("peerConnectionId"), anyThreadResult);
                break;
            case '@':
                rtpSenderSetParameters((String) x920Var.a("peerConnectionId"), (String) x920Var.a("rtpSenderId"), (Map) x920Var.a("parameters"), anyThreadResult);
                break;
            case 'A':
                this.getUserMediaImpl.switchCamera((String) x920Var.a("trackId"), anyThreadResult);
                break;
            case 'B':
                this.getUserMediaImpl.setPreferredInputDevice((String) x920Var.a("deviceId"));
                anyThreadResult.success(null);
                break;
            case 'C':
                AudioSwitchManager.instance.selectAudioOutput(AudioDeviceKind.fromTypeName((String) x920Var.a("deviceId")));
                anyThreadResult.success(null);
                break;
            case TRANSLATE_KIT_VALUE:
                String str24 = (String) x920Var.a("kind");
                MediaStreamTrack.MediaType mediaType2 = MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO;
                if (str24.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    mediaType2 = MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO;
                }
                anyThreadResult.success(capabilitiestoMap(this.mFactory.getRtpReceiverCapabilities(mediaType2)).toMap());
                break;
            case 'E':
                PeerConnection peerConnection8 = getPeerConnection((String) x920Var.a("peerConnectionId"));
                if (peerConnection8 == null) {
                    resultError("getSignalingState", "peerConnection is null", anyThreadResult);
                    break;
                } else {
                    ConstraintsMap constraintsMap10 = new ConstraintsMap();
                    constraintsMap10.putString(ClidProvider.STATE, Utils.signalingStateString(peerConnection8.signalingState()));
                    anyThreadResult.success(constraintsMap10.toMap());
                    break;
                }
            case 'F':
                mediaStreamTrackSetEnabled((String) x920Var.a("trackId"), ((Boolean) x920Var.a(BackendConfig.Restrictions.ENABLED)).booleanValue(), (String) x920Var.a("peerConnectionId"));
                anyThreadResult.success(null);
                break;
            case 'G':
                peerConnectionGetStats((String) x920Var.a("trackId"), (String) x920Var.a("peerConnectionId"), anyThreadResult);
                break;
            case 'H':
                Map map5 = (Map) x920Var.a("focusPoint");
                Boolean bool2 = (Boolean) map5.get("reset");
                if (bool2 == null || !bool2.booleanValue()) {
                    d3 = (Double) map5.get(RemoteBioParameters.X);
                    d4 = (Double) map5.get(RemoteBioParameters.Y);
                } else {
                    d4 = null;
                    d3 = null;
                }
                this.cameraUtils.setFocusPoint(x920Var, new Point(d3, d4), anyThreadResult);
                break;
            case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                AudioSwitchManager.instance.setAudioConfiguration((Map) x920Var.a("configuration"));
                anyThreadResult.success(null);
                break;
            case 'J':
                streamDispose((String) x920Var.a("streamId"));
                anyThreadResult.success(null);
                break;
            default:
                if (!this.frameCryptor.handleMethodCall(x920Var, anyThreadResult)) {
                    anyThreadResult.notImplemented();
                    break;
                }
                break;
        }
    }

    public void peerConnectionAddICECandidate(ConstraintsMap constraintsMap, String str, da20 da20Var) {
        PeerConnection peerConnection = getPeerConnection(str);
        boolean z = false;
        if (peerConnection != null) {
            z = peerConnection.addIceCandidate(new IceCandidate(constraintsMap.getString("sdpMid"), constraintsMap.isNull("sdpMLineIndex") ? 0 : constraintsMap.getInt("sdpMLineIndex"), constraintsMap.getString("candidate")));
        } else {
            resultError("peerConnectionAddICECandidate", "peerConnection is null", da20Var);
        }
        da20Var.success(Boolean.valueOf(z));
    }

    public void peerConnectionAddStream(String str, String str2, da20 da20Var) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            return;
        }
        PeerConnection peerConnection = getPeerConnection(str2);
        if (peerConnection == null) {
            resultError("peerConnectionAddStream", "peerConnection is null", da20Var);
            return;
        }
        boolean addStream = peerConnection.addStream(mediaStream);
        Objects.toString(da20Var);
        da20Var.success(Boolean.valueOf(addStream));
    }

    public void peerConnectionClose(String str) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            return;
        }
        peerConnectionObserver.close();
    }

    public void peerConnectionCreateAnswer(String str, ConstraintsMap constraintsMap, final da20 da20Var) {
        PeerConnection peerConnection = getPeerConnection(str);
        if (peerConnection != null) {
            peerConnection.createAnswer(new SdpObserver() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.3
                @Override // org.webrtc.SdpObserver
                public void onCreateFailure(String str2) {
                    MethodCallHandlerImpl.resultError("peerConnectionCreateAnswer", g8e.o("WEBRTC_CREATE_ANSWER_ERROR: ", str2), da20Var);
                }

                @Override // org.webrtc.SdpObserver
                public void onCreateSuccess(SessionDescription sessionDescription) {
                    ConstraintsMap constraintsMap2 = new ConstraintsMap();
                    constraintsMap2.putString("sdp", sessionDescription.description);
                    constraintsMap2.putString("type", sessionDescription.type.canonicalForm());
                    da20Var.success(constraintsMap2.toMap());
                }

                @Override // org.webrtc.SdpObserver
                public void onSetFailure(String str2) {
                }

                @Override // org.webrtc.SdpObserver
                public void onSetSuccess() {
                }
            }, MediaConstraintsUtils.parseMediaConstraints(constraintsMap));
        } else {
            resultError("peerConnectionCreateAnswer", "peerConnection is null", da20Var);
        }
    }

    public void peerConnectionCreateOffer(String str, ConstraintsMap constraintsMap, final da20 da20Var) {
        PeerConnection peerConnection = getPeerConnection(str);
        if (peerConnection != null) {
            peerConnection.createOffer(new SdpObserver() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.2
                @Override // org.webrtc.SdpObserver
                public void onCreateFailure(String str2) {
                    MethodCallHandlerImpl.resultError("peerConnectionCreateOffer", g8e.o("WEBRTC_CREATE_OFFER_ERROR: ", str2), da20Var);
                }

                @Override // org.webrtc.SdpObserver
                public void onCreateSuccess(SessionDescription sessionDescription) {
                    ConstraintsMap constraintsMap2 = new ConstraintsMap();
                    constraintsMap2.putString("sdp", sessionDescription.description);
                    constraintsMap2.putString("type", sessionDescription.type.canonicalForm());
                    da20Var.success(constraintsMap2.toMap());
                }

                @Override // org.webrtc.SdpObserver
                public void onSetFailure(String str2) {
                }

                @Override // org.webrtc.SdpObserver
                public void onSetSuccess() {
                }
            }, MediaConstraintsUtils.parseMediaConstraints(constraintsMap));
        } else {
            resultError("peerConnectionCreateOffer", "WEBRTC_CREATE_OFFER_ERROR", da20Var);
        }
    }

    public void peerConnectionDispose(String str) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver != null && peerConnectionDispose(peerConnectionObserver)) {
            this.mPeerConnectionObservers.remove(str);
        }
        if (this.mPeerConnectionObservers.size() == 0) {
            AudioSwitchManager.instance.stop();
        }
    }

    public void peerConnectionGetStats(String str, String str2, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str2);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("peerConnectionGetStats", "peerConnection is null", da20Var);
        } else if (str == null || str.isEmpty()) {
            peerConnectionObserver.getStats(da20Var);
        } else {
            peerConnectionObserver.getStatsForTrack(str, da20Var);
        }
    }

    public String peerConnectionInit(ConstraintsMap constraintsMap, ConstraintsMap constraintsMap2) {
        String nextStreamUUID = getNextStreamUUID();
        PeerConnection.RTCConfiguration parseRTCConfiguration = parseRTCConfiguration(constraintsMap);
        PeerConnectionObserver peerConnectionObserver = new PeerConnectionObserver(parseRTCConfiguration, this, this.messenger, nextStreamUUID);
        peerConnectionObserver.setPeerConnection(this.mFactory.createPeerConnection(parseRTCConfiguration, MediaConstraintsUtils.parseMediaConstraints(constraintsMap2), peerConnectionObserver));
        this.mPeerConnectionObservers.put(nextStreamUUID, peerConnectionObserver);
        return nextStreamUUID;
    }

    public void peerConnectionRemoveStream(String str, String str2, da20 da20Var) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            return;
        }
        PeerConnection peerConnection = getPeerConnection(str2);
        if (peerConnection == null) {
            resultError("peerConnectionRemoveStream", "peerConnection is null", da20Var);
        } else {
            peerConnection.removeStream(mediaStream);
            da20Var.success(null);
        }
    }

    public void peerConnectionSetConfiguration(ConstraintsMap constraintsMap, PeerConnection peerConnection) {
        if (peerConnection == null) {
            return;
        }
        peerConnection.setConfiguration(parseRTCConfiguration(constraintsMap));
    }

    public void peerConnectionSetLocalDescription(ConstraintsMap constraintsMap, String str, final da20 da20Var) {
        PeerConnection peerConnection = getPeerConnection(str);
        if (peerConnection == null) {
            resultError("peerConnectionSetLocalDescription", "WEBRTC_SET_LOCAL_DESCRIPTION_ERROR: peerConnection is null", da20Var);
        } else {
            peerConnection.setLocalDescription(new SdpObserver() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.4
                @Override // org.webrtc.SdpObserver
                public void onCreateFailure(String str2) {
                }

                @Override // org.webrtc.SdpObserver
                public void onCreateSuccess(SessionDescription sessionDescription) {
                }

                @Override // org.webrtc.SdpObserver
                public void onSetFailure(String str2) {
                    MethodCallHandlerImpl.resultError("peerConnectionSetLocalDescription", g8e.o("WEBRTC_SET_LOCAL_DESCRIPTION_ERROR: ", str2), da20Var);
                }

                @Override // org.webrtc.SdpObserver
                public void onSetSuccess() {
                    da20Var.success(null);
                }
            }, new SessionDescription(SessionDescription.Type.fromCanonicalForm(constraintsMap.getString("type")), constraintsMap.getString("sdp")));
        }
    }

    public void peerConnectionSetRemoteDescription(ConstraintsMap constraintsMap, String str, final da20 da20Var) {
        PeerConnection peerConnection = getPeerConnection(str);
        if (peerConnection == null) {
            resultError("peerConnectionSetRemoteDescription", "WEBRTC_SET_REMOTE_DESCRIPTION_ERROR: peerConnection is null", da20Var);
        } else {
            peerConnection.setRemoteDescription(new SdpObserver() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.5
                @Override // org.webrtc.SdpObserver
                public void onCreateFailure(String str2) {
                }

                @Override // org.webrtc.SdpObserver
                public void onCreateSuccess(SessionDescription sessionDescription) {
                }

                @Override // org.webrtc.SdpObserver
                public void onSetFailure(String str2) {
                    MethodCallHandlerImpl.resultError("peerConnectionSetRemoteDescription", g8e.o("WEBRTC_SET_REMOTE_DESCRIPTION_ERROR: ", str2), da20Var);
                }

                @Override // org.webrtc.SdpObserver
                public void onSetSuccess() {
                    da20Var.success(null);
                }
            }, new SessionDescription(SessionDescription.Type.fromCanonicalForm(constraintsMap.getString("type")), constraintsMap.getString("sdp")));
        }
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public boolean putLocalStream(String str, MediaStream mediaStream) {
        this.localStreams.put(str, mediaStream);
        return true;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public boolean putLocalTrack(String str, LocalTrack localTrack) {
        this.localTracks.put(str, localTrack);
        return true;
    }

    public void reStartCamera() {
        GetUserMediaImpl getUserMediaImpl = this.getUserMediaImpl;
        if (getUserMediaImpl == null) {
            return;
        }
        getUserMediaImpl.reStartCamera(new GetUserMediaImpl.IsCameraEnabled() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.6
            @Override // com.cloudwebrtc.webrtc.GetUserMediaImpl.IsCameraEnabled
            public boolean isEnabled(String str) {
                if (MethodCallHandlerImpl.this.localTracks.containsKey(str)) {
                    return ((LocalTrack) MethodCallHandlerImpl.this.localTracks.get(str)).enabled();
                }
                return false;
            }
        });
    }

    public void removeTrack(String str, String str2, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("removeTrack", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.removeTrack(str2, da20Var);
        }
    }

    public void requestPermissions(ArrayList<String> arrayList, Callback callback, Callback callback2) {
        qft qftVar = new qft(arrayList, callback2, callback, 1);
        PermissionUtils.requestPermissions(getApplicationContext(), getActivity(), (String[]) arrayList.toArray(new String[arrayList.size()]), qftVar);
    }

    public void restartIce(String str) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            return;
        }
        peerConnectionObserver.restartIce();
    }

    public void rtpSenderSetParameters(String str, String str2, Map<String, Object> map, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpSenderSetParameters", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.rtpSenderSetParameters(str2, map, da20Var);
        }
    }

    public void rtpSenderSetStreams(String str, String str2, List<String> list, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpSenderSetStreams", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.rtpSenderSetStreams(str2, list, da20Var);
        }
    }

    public void rtpSenderSetTrack(String str, String str2, String str3, boolean z, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpSenderSetTrack", "peerConnection is null", da20Var);
            return;
        }
        LocalTrack localTrack = this.localTracks.get(str3);
        if (str3.length() <= 0 || localTrack != null) {
            peerConnectionObserver.rtpSenderSetTrack(str2, localTrack != null ? localTrack.track : null, da20Var, z);
        } else {
            resultError("rtpSenderSetTrack", "track is null", da20Var);
        }
    }

    public void rtpTransceiverGetCurrentDirection(String str, String str2, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpTransceiverSetDirection", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.rtpTransceiverGetCurrentDirection(str2, da20Var);
        }
    }

    public void rtpTransceiverGetDirection(String str, String str2, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpTransceiverSetDirection", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.rtpTransceiverGetDirection(str2, da20Var);
        }
    }

    public void rtpTransceiverSetCodecPreferences(String str, String str2, List<Map<String, Object>> list, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("setCodecPreferences", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.rtpTransceiverSetCodecPreferences(str2, list, da20Var);
        }
    }

    public void rtpTransceiverSetDirection(String str, String str2, String str3, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpTransceiverSetDirection", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.rtpTransceiverSetDirection(str2, str3, da20Var);
        }
    }

    public void rtpTransceiverStop(String str, String str2, da20 da20Var) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpTransceiverStop", "peerConnection is null", da20Var);
        } else {
            peerConnectionObserver.rtpTransceiverStop(str2, da20Var);
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void streamDispose(MediaStream mediaStream) {
        for (VideoTrack videoTrack : mediaStream.videoTracks) {
            this.localTracks.remove(videoTrack.id());
            this.getUserMediaImpl.removeVideoCapturer(videoTrack.id());
            mediaStream.removeTrack(videoTrack);
        }
        for (AudioTrack audioTrack : mediaStream.audioTracks) {
            this.localTracks.remove(audioTrack.id());
            mediaStream.removeTrack(audioTrack);
        }
    }

    public void trackDispose(String str) {
        LocalTrack localTrack = this.localTracks.get(str);
        if (localTrack == null) {
            return;
        }
        removeTrackForRendererById(str);
        localTrack.setEnabled(false);
        if (localTrack instanceof LocalVideoTrack) {
            this.getUserMediaImpl.removeVideoCapturer(str);
        }
        this.localTracks.remove(str);
    }

    public boolean peerConnectionDispose(PeerConnectionObserver peerConnectionObserver) {
        if (peerConnectionObserver.getPeerConnection() == null) {
            return false;
        }
        peerConnectionObserver.dispose();
        return true;
    }

    public void streamDispose(String str) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream != null) {
            streamDispose(mediaStream);
            this.localStreams.remove(str);
            removeStreamForRendererById(str);
        }
    }
}
