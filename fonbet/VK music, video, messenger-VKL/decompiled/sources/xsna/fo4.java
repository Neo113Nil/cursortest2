package xsna;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: AudioFocusManagerCompat.kt */
/* loaded from: classes.dex */
public final class fo4 {
    public final io4 a;

    public fo4(Context context, boolean z) {
        this.a = new io4(context, z);
    }

    public final void a(do4 do4Var) {
        this.a.g.add(do4Var);
    }

    public final void b() {
        io4 io4Var = this.a;
        synchronized (io4Var) {
            if (io4Var.h != 0 && io4Var.f != null) {
                ((AudioManager) io4Var.d.getValue()).abandonAudioFocusRequest(io4Var.f);
                io4Var.a(0);
            }
        }
    }
}
