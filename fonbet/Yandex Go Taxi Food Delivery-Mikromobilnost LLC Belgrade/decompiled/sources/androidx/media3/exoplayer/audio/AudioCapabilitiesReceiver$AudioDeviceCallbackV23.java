package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import defpackage.tw21;
import defpackage.ye3;

/* loaded from: classes10.dex */
final class AudioCapabilitiesReceiver$AudioDeviceCallbackV23 extends AudioDeviceCallback {
    final /* synthetic */ a this$0;

    private AudioCapabilitiesReceiver$AudioDeviceCallbackV23(a aVar) {
        this.this$0 = aVar;
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        a aVar = this.this$0;
        aVar.a(ye3.b(aVar.a, aVar.i, aVar.h));
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (tw21.l(audioDeviceInfoArr, this.this$0.h)) {
            this.this$0.h = null;
        }
        a aVar = this.this$0;
        aVar.a(ye3.b(aVar.a, aVar.i, aVar.h));
    }
}
