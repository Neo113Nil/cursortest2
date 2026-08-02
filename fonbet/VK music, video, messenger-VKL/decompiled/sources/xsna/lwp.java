package xsna;

import java.util.EnumSet;
import one.video.player.OneVideoPlayer;

/* compiled from: ErrorProcessor.kt */
/* loaded from: classes8.dex */
public final class lwp {
    public final vw3 a;
    public final mwp b;
    public xds0 c;
    public o5h0 d;

    public lwp(vw3 vw3Var, mwp mwpVar) {
        this.a = vw3Var;
        this.b = mwpVar;
    }

    public final void a(OneVideoPlayer.State state) {
        OneVideoPlayer.State state2;
        o5h0 o5h0Var = this.d;
        if (o5h0Var == null || (state2 = o5h0Var.d) == state) {
            return;
        }
        EnumSet<OneVideoPlayer.State> enumSet = o5h0.e;
        if (!enumSet.contains(state2) && enumSet.contains(state)) {
            o5h0Var.c = null;
            o5h0Var.b = null;
        }
        o5h0Var.d = state;
    }
}
