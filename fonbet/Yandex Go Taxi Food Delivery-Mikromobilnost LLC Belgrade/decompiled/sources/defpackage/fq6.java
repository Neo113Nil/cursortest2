package defpackage;

import android.media.AudioManager;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;

/* loaded from: classes10.dex */
public final /* synthetic */ class fq6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hq6 b;

    public /* synthetic */ fq6(hq6 hq6Var, int i) {
        this.a = i;
        this.b = hq6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        hq6 hq6Var = this.b;
        switch (i) {
            case 0:
                hq6Var.D.set(false);
                jh3 jh3Var = hq6Var.z;
                jh3Var.a();
                if (jh3Var.w.getAndSet(false)) {
                    jh3Var.a.stop();
                    if (jh3Var.a.getRecordingState() != 1) {
                        jh3Var.a.getRecordingState();
                        sgb1.g(5, "AudioStreamImpl");
                    }
                    if (vbj.a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                        jh3Var.a.release();
                        jh3Var.a = jh3.b(jh3Var.y, jh3Var.b, null);
                    }
                }
                synchronized (hq6Var.x) {
                    hq6Var.y = null;
                    hq6Var.c.clear();
                }
                return;
            case 1:
                try {
                    hq6Var.z.d();
                    if (hq6Var.D.getAndSet(true)) {
                        return;
                    }
                    hq6Var.b();
                    return;
                } catch (AudioStream$AudioStreamException e) {
                    ny61.j(e);
                    return;
                }
            case 2:
                hq6Var.b();
                return;
            default:
                hq6Var.D.set(false);
                jh3 jh3Var2 = hq6Var.z;
                if (!jh3Var2.c.getAndSet(true)) {
                    AudioManager.AudioRecordingCallback audioRecordingCallback = jh3Var2.D;
                    if (audioRecordingCallback != null) {
                        jh3Var2.a.unregisterAudioRecordingCallback(audioRecordingCallback);
                    }
                    jh3Var2.a.release();
                }
                synchronized (hq6Var.x) {
                    hq6Var.y = null;
                    hq6Var.c.clear();
                }
                return;
        }
    }
}
