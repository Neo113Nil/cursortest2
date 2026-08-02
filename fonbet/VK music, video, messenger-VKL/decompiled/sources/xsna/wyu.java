package xsna;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: HeadsetBluetoothConnectionChangedListener.kt */
/* loaded from: classes.dex */
public final class wyu extends AudioDeviceCallback {
    public static final List<Integer> c = e43.l(8, 7, 26, 27);
    public final xyu a;
    public final LinkedHashSet b = new LinkedHashSet();

    public wyu(xyu xyuVar) {
        this.a = xyuVar;
    }

    public static ArrayList a(AudioDeviceInfo[] audioDeviceInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (audioDeviceInfo.isSink()) {
                if (c.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    arrayList.add(audioDeviceInfo);
                }
            }
        }
        return arrayList;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (audioDeviceInfoArr == null || audioDeviceInfoArr.length == 0) {
            return;
        }
        ArrayList a = a(audioDeviceInfoArr);
        LinkedHashSet linkedHashSet = this.b;
        boolean isEmpty = linkedHashSet.isEmpty();
        linkedHashSet.addAll(a);
        boolean isEmpty2 = linkedHashSet.isEmpty();
        if (!isEmpty || isEmpty2) {
            return;
        }
        this.a.a(true);
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (audioDeviceInfoArr == null || audioDeviceInfoArr.length == 0) {
            return;
        }
        ArrayList a = a(audioDeviceInfoArr);
        LinkedHashSet linkedHashSet = this.b;
        boolean isEmpty = linkedHashSet.isEmpty();
        linkedHashSet.removeAll(j5g.S0(a));
        boolean isEmpty2 = linkedHashSet.isEmpty();
        if (isEmpty || !isEmpty2) {
            return;
        }
        this.a.a(false);
    }
}
