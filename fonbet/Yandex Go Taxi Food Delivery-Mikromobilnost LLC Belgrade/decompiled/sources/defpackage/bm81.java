package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;
import yads.gn0;
import yads.tj;

/* loaded from: classes7.dex */
public final class bm81 {
    public final AudioManager a;
    public final tj b;
    public gn0 c;
    public int d;
    public float e = 1.0f;

    public bm81(Context context, Handler handler, gn0 gn0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.a = audioManager;
        this.c = gn0Var;
        this.b = new tj(this, handler);
        this.d = 0;
    }

    public final void a() {
        if (this.d == 0) {
            return;
        }
        if (rf71.a < 26) {
            this.a.abandonAudioFocus(this.b);
        }
        c(0);
    }

    public final void b(int i) {
        gn0 gn0Var = this.c;
        if (gn0Var != null) {
            ek71 ek71Var = gn0Var.a;
            ek71Var.v();
            boolean z = ek71Var.b0.l;
            ek71 ek71Var2 = gn0Var.a;
            int i2 = 1;
            if (z && i != 1) {
                i2 = 2;
            }
            ek71Var2.e(i, i2, z);
        }
    }

    public final void c(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.e == f) {
            return;
        }
        this.e = f;
        gn0 gn0Var = this.c;
        if (gn0Var != null) {
            ek71 ek71Var = gn0Var.a;
            ek71Var.d(1, 2, Float.valueOf(ek71Var.V * ek71Var.w.e));
        }
    }
}
