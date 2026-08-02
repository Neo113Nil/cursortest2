package xsna;

import xsna.iip0;

/* compiled from: TracksManagerListenerImpl.kt */
/* loaded from: classes8.dex */
public final class jip0 implements iip0.a {
    public final xk80 a;
    public final one.video.player.j b;

    public jip0(xk80 xk80Var, one.video.player.j jVar) {
        this.a = xk80Var;
        this.b = jVar;
    }

    @Override // xsna.iip0.a
    public final void a(cno0 cno0Var, boolean z) {
        this.b.m(this.a, cno0Var, z);
    }

    @Override // xsna.iip0.a
    public final void b(one.video.player.tracks.c cVar) {
        this.b.n(this.a, cVar);
    }

    @Override // xsna.iip0.a
    public final void c(one.video.player.tracks.c cVar) {
        this.b.e(this.a, cVar);
    }

    @Override // xsna.iip0.a
    public final void d(one.video.player.tracks.a aVar) {
        this.b.t(this.a, aVar);
    }
}
