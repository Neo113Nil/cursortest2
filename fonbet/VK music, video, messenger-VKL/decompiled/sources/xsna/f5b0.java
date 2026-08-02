package xsna;

import android.content.Context;
import android.media.AudioManager;
import one.video.player.OneVideoPlayer;

/* compiled from: PlayerUtils.kt */
/* loaded from: classes3.dex */
public final class f5b0 {
    public static final AudioManager a(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(d3b0 d3b0Var) {
        boolean z;
        OneVideoPlayer a = d3b0Var.a();
        if (a != null) {
            OneVideoPlayer a2 = d3b0Var.a();
            boolean z2 = (a2 != null ? a2.getState() : null) == OneVideoPlayer.State.BUFFERING;
            if (fxc0.B().J().i0()) {
                c63 c63Var = c63.a;
                if (!c63.f) {
                    z = true;
                    boolean z3 = a.getState() != OneVideoPlayer.State.PLAYING;
                    if (z ? !(z3 || (a.f0() && z2)) : !(z3 || (a.f0() && z2))) {
                        return true;
                    }
                }
            }
            z = false;
            if (a.getState() != OneVideoPlayer.State.PLAYING) {
            }
            if (z) {
            }
        }
        return false;
    }
}
