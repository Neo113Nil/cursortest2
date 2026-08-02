package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import com.ryanheise.audio_session.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class p72 implements ca20 {
    public static a b;
    public ea20 a;

    public static ArrayList a(MicrophoneInfo.Coordinate3F coordinate3F) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(coordinate3F.x));
        arrayList.add(Double.valueOf(coordinate3F.y));
        arrayList.add(Double.valueOf(coordinate3F.z));
        return arrayList;
    }

    public static HashMap b(AudioDeviceInfo audioDeviceInfo) {
        return d("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", audioDeviceInfo.getAddress(), "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), "type", Integer.valueOf(audioDeviceInfo.getType()));
    }

    public static ArrayList c(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static HashMap d(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            hashMap.put((String) objArr[i], objArr[i + 1]);
        }
        return hashMap;
    }

    public static void e(int i) {
        if (Build.VERSION.SDK_INT >= i) {
            return;
        }
        kbs.g(oyr.i(i, "Requires API level "));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        AudioDeviceInfo communicationDevice;
        List availableCommunicationDevices;
        try {
            List list = (List) x920Var.b;
            String str = x920Var.a;
            boolean z = false;
            switch (str.hashCode()) {
                case -1758921066:
                    if (str.equals("getCommunicationDevice")) {
                        a aVar = b;
                        aVar.getClass();
                        e(31);
                        communicationDevice = aVar.f.getCommunicationDevice();
                        ((ba20) da20Var).success(b(communicationDevice));
                        return;
                    }
                    break;
                case -1698305881:
                    if (str.equals("getDevices")) {
                        ((ba20) da20Var).success(b.c(((Integer) list.get(0)).intValue()));
                        return;
                    }
                    break;
                case -1679670739:
                    if (str.equals("isMicrophoneMute")) {
                        ((ba20) da20Var).success(Boolean.valueOf(b.f.isMicrophoneMute()));
                        return;
                    }
                    break;
                case -1582239800:
                    if (str.equals("getStreamMaxVolume")) {
                        ((ba20) da20Var).success(Integer.valueOf(b.f.getStreamMaxVolume(((Integer) list.get(0)).intValue())));
                        return;
                    }
                    break;
                case -1562927400:
                    if (str.equals("isSpeakerphoneOn")) {
                        ((ba20) da20Var).success(Boolean.valueOf(b.f.isSpeakerphoneOn()));
                        return;
                    }
                    break;
                case -1524320654:
                    if (str.equals("isHapticPlaybackSupported")) {
                        b.getClass();
                        e(29);
                        ((ba20) da20Var).success(Boolean.valueOf(AudioManager.isHapticPlaybackSupported()));
                        return;
                    }
                    break;
                case -1504647535:
                    if (str.equals("requestAudioFocus")) {
                        ((ba20) da20Var).success(Boolean.valueOf(b.f(list)));
                        return;
                    }
                    break;
                case -1413157019:
                    if (str.equals("setMicrophoneMute")) {
                        b.f.setMicrophoneMute(((Boolean) list.get(0)).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -1296413680:
                    if (str.equals("setSpeakerphoneOn")) {
                        b.f.setSpeakerphoneOn(((Boolean) list.get(0)).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -1285190630:
                    if (str.equals("isBluetoothScoOn")) {
                        ((ba20) da20Var).success(Boolean.valueOf(b.f.isBluetoothScoOn()));
                        return;
                    }
                    break;
                case -1197068311:
                    if (str.equals("adjustStreamVolume")) {
                        b.f.adjustStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -1091382445:
                    if (str.equals("getMicrophones")) {
                        ((ba20) da20Var).success(b.d());
                        return;
                    }
                    break;
                case -1079290158:
                    if (str.equals("setAllowedCapturePolicy")) {
                        a aVar2 = b;
                        int intValue = ((Integer) list.get(0)).intValue();
                        aVar2.getClass();
                        e(29);
                        aVar2.f.setAllowedCapturePolicy(intValue);
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -1018676910:
                    if (str.equals("setBluetoothScoOn")) {
                        b.f.setBluetoothScoOn(((Boolean) list.get(0)).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -809761226:
                    if (str.equals("getStreamMinVolume")) {
                        a aVar3 = b;
                        int intValue2 = ((Integer) list.get(0)).intValue();
                        aVar3.getClass();
                        e(28);
                        ((ba20) da20Var).success(Integer.valueOf(aVar3.f.getStreamMinVolume(intValue2)));
                        return;
                    }
                    break;
                case -763512583:
                    if (str.equals("loadSoundEffects")) {
                        b.f.loadSoundEffects();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -694417919:
                    if (str.equals("isMusicActive")) {
                        ((ba20) da20Var).success(Boolean.valueOf(b.f.isMusicActive()));
                        return;
                    }
                    break;
                case -580980717:
                    if (str.equals("startBluetoothSco")) {
                        b.f.startBluetoothSco();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -445792758:
                    if (str.equals("setCommunicationDevice")) {
                        a aVar4 = b;
                        Integer num = (Integer) list.get(0);
                        aVar4.getClass();
                        e(31);
                        Iterator it = aVar4.h.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) it.next();
                                if (audioDeviceInfo.getId() == num.intValue()) {
                                    z = aVar4.f.setCommunicationDevice(audioDeviceInfo);
                                }
                            }
                        }
                        ((ba20) da20Var).success(Boolean.valueOf(z));
                        return;
                    }
                    break;
                case -380792370:
                    if (str.equals("getStreamVolumeDb")) {
                        a aVar5 = b;
                        int intValue3 = ((Integer) list.get(0)).intValue();
                        int intValue4 = ((Integer) list.get(1)).intValue();
                        int intValue5 = ((Integer) list.get(2)).intValue();
                        aVar5.getClass();
                        e(28);
                        ((ba20) da20Var).success(Float.valueOf(aVar5.f.getStreamVolumeDb(intValue3, intValue4, intValue5)));
                        return;
                    }
                    break;
                case -75324903:
                    if (str.equals("getMode")) {
                        ((ba20) da20Var).success(Integer.valueOf(b.f.getMode()));
                        return;
                    }
                    break;
                case 152385829:
                    if (str.equals("dispatchMediaKeyEvent")) {
                        b.b((Map) list.get(0));
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 160987616:
                    if (str.equals("getParameters")) {
                        ((ba20) da20Var).success(b.f.getParameters((String) list.get(0)));
                        return;
                    }
                    break;
                case 186762163:
                    if (str.equals("stopBluetoothSco")) {
                        b.f.stopBluetoothSco();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 276698416:
                    if (str.equals("getStreamVolume")) {
                        ((ba20) da20Var).success(Integer.valueOf(b.f.getStreamVolume(((Integer) list.get(0)).intValue())));
                        return;
                    }
                    break;
                case 469094495:
                    if (str.equals("isBluetoothScoAvailableOffCall")) {
                        ((ba20) da20Var).success(Boolean.valueOf(b.f.isBluetoothScoAvailableOffCall()));
                        return;
                    }
                    break;
                case 623794710:
                    if (str.equals("getRingerMode")) {
                        ((ba20) da20Var).success(Integer.valueOf(b.f.getRingerMode()));
                        return;
                    }
                    break;
                case 935118828:
                    if (str.equals("setParameters")) {
                        b.f.setParameters((String) list.get(0));
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 954131337:
                    if (str.equals("adjustVolume")) {
                        b.f.adjustVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 976310915:
                    if (str.equals("isStreamMute")) {
                        a aVar6 = b;
                        int intValue6 = ((Integer) list.get(0)).intValue();
                        aVar6.getClass();
                        e(23);
                        ((ba20) da20Var).success(Boolean.valueOf(aVar6.f.isStreamMute(intValue6)));
                        return;
                    }
                    break;
                case 1084758859:
                    if (str.equals("getProperty")) {
                        ((ba20) da20Var).success(b.f.getProperty((String) list.get(0)));
                        return;
                    }
                    break;
                case 1163405254:
                    if (str.equals("getAllowedCapturePolicy")) {
                        a aVar7 = b;
                        aVar7.getClass();
                        e(29);
                        ((ba20) da20Var).success(Integer.valueOf(aVar7.f.getAllowedCapturePolicy()));
                        return;
                    }
                    break;
                case 1187450940:
                    if (str.equals("setStreamVolume")) {
                        b.f.setStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1241312831:
                    if (str.equals("clearCommunicationDevice")) {
                        a aVar8 = b;
                        aVar8.getClass();
                        e(31);
                        aVar8.f.clearCommunicationDevice();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1258134830:
                    if (str.equals("adjustSuggestedStreamVolume")) {
                        b.f.adjustSuggestedStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1357290231:
                    if (str.equals("abandonAudioFocus")) {
                        ((ba20) da20Var).success(Boolean.valueOf(b.a()));
                        return;
                    }
                    break;
                case 1378317714:
                    if (str.equals("unloadSoundEffects")) {
                        b.f.unloadSoundEffects();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1397925922:
                    if (str.equals("setRingerMode")) {
                        b.f.setRingerMode(((Integer) list.get(0)).intValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1504508844:
                    if (str.equals("playSoundEffect")) {
                        a aVar9 = b;
                        int intValue7 = ((Integer) list.get(0)).intValue();
                        Double d = (Double) list.get(1);
                        AudioManager audioManager = aVar9.f;
                        if (d != null) {
                            audioManager.playSoundEffect(intValue7, (float) d.doubleValue());
                        } else {
                            audioManager.playSoundEffect(intValue7);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1570996442:
                    if (str.equals("getAvailableCommunicationDevices")) {
                        a aVar10 = b;
                        aVar10.getClass();
                        e(31);
                        availableCommunicationDevices = aVar10.f.getAvailableCommunicationDevices();
                        aVar10.h = availableCommunicationDevices;
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = aVar10.h.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(b((AudioDeviceInfo) it2.next()));
                        }
                        ((ba20) da20Var).success(arrayList);
                        return;
                    }
                    break;
                case 1984784677:
                    if (str.equals("setMode")) {
                        b.f.setMode(((Integer) list.get(0)).intValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1986792688:
                    if (str.equals("isVolumeFixed")) {
                        a aVar11 = b;
                        aVar11.getClass();
                        e(21);
                        ((ba20) da20Var).success(Boolean.valueOf(aVar11.f.isVolumeFixed()));
                        return;
                    }
                    break;
                case 2093966320:
                    if (str.equals("generateAudioSessionId")) {
                        a aVar12 = b;
                        aVar12.getClass();
                        e(21);
                        ((ba20) da20Var).success(Integer.valueOf(aVar12.f.generateAudioSessionId()));
                        return;
                    }
                    break;
            }
            ((ba20) da20Var).notImplemented();
        } catch (Exception e) {
            ((ba20) da20Var).error("Error: " + e, null, null);
        }
    }
}
