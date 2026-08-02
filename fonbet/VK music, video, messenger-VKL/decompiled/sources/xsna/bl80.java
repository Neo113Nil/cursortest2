package xsna;

import android.view.Surface;
import xsna.hzf0;

/* compiled from: OneVideoExoPlayer.kt */
/* loaded from: classes8.dex */
public final class bl80 implements hzf0.a {
    public final /* synthetic */ androidx.media3.exoplayer.c a;
    public final /* synthetic */ xk80 b;

    public bl80(androidx.media3.exoplayer.c cVar, xk80 xk80Var) {
        this.a = cVar;
        this.b = xk80Var;
    }

    @Override // xsna.hzf0.a
    public final void a(Surface surface) {
        this.a.R(surface);
    }

    @Override // xsna.hzf0.a
    public final void onRenderedFirstFrame() {
        xk80 xk80Var = this.b;
        xk80Var.h0 = true;
        xk80Var.l.x(xk80Var);
    }

    @Override // xsna.hzf0.a
    public final void b(long j) {
    }
}
