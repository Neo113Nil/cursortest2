package defpackage;

import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;

/* loaded from: classes10.dex */
public final /* synthetic */ class lh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioSwitchManager b;

    public /* synthetic */ lh3(AudioSwitchManager audioSwitchManager, int i) {
        this.a = i;
        this.b = audioSwitchManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AudioSwitchManager audioSwitchManager = this.b;
        switch (i) {
            case 0:
                audioSwitchManager.lambda$initAudioSwitch$2();
                break;
            case 1:
                audioSwitchManager.lambda$updatePreferredDeviceList$6();
                break;
            case 2:
                audioSwitchManager.lambda$start$3();
                break;
            case 3:
                audioSwitchManager.lambda$enableSpeakerphone$7();
                break;
            default:
                audioSwitchManager.lambda$stop$4();
                break;
        }
    }
}
