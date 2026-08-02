package xsna;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.by40;

/* compiled from: AudioDevicesChangedReceiver.kt */
/* loaded from: classes3.dex */
public final class vm4 extends AudioDeviceCallback {
    public static final List<Integer> b = Collections.singletonList(8);
    public final rw40 a;

    public vm4(rw40 rw40Var) {
        this.a = rw40Var;
    }

    public static ArrayList a(AudioDeviceInfo[] audioDeviceInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (audioDeviceInfo.isSink()) {
                if (b.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    arrayList.add(audioDeviceInfo);
                }
            }
        }
        return arrayList;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        AudioDeviceInfo audioDeviceInfo;
        if (audioDeviceInfoArr == null || audioDeviceInfoArr.length == 0 || (audioDeviceInfo = (AudioDeviceInfo) j5g.a0(a(audioDeviceInfoArr))) == null) {
            return;
        }
        String obj = audioDeviceInfo.getProductName().toString();
        rw40 rw40Var = this.a;
        rw40Var.getClass();
        rw40Var.T(new by40.a(obj));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        AudioDeviceInfo audioDeviceInfo;
        if (audioDeviceInfoArr == null || audioDeviceInfoArr.length == 0 || (audioDeviceInfo = (AudioDeviceInfo) j5g.a0(a(audioDeviceInfoArr))) == null) {
            return;
        }
        String obj = audioDeviceInfo.getProductName().toString();
        rw40 rw40Var = this.a;
        rw40Var.getClass();
        rw40Var.T(new by40.b(obj));
    }
}
