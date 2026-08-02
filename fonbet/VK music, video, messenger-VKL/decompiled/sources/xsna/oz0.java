package xsna;

import java.util.List;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;

/* compiled from: AdsItemVideoUIEventListener.kt */
/* loaded from: classes17.dex */
public final class oz0 implements lih0 {
    public final ux0 a;
    public final ny0 b;

    public oz0(ux0 ux0Var) {
        this.a = ux0Var;
        this.b = new ny0(ux0Var);
    }

    @Override // xsna.lih0
    public final void I(qi5 qi5Var, long j, long j2) {
        if (qi5Var.a.isPaused()) {
            return;
        }
        this.b.b.a(j);
    }

    @Override // xsna.lih0
    public final void J(qi5 qi5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        this.a.a(new e01(new j4b0(qi5Var), i, errorCode, th));
    }

    @Override // xsna.lih0
    public final void K(int i, int i2) {
        this.a.a(new n01(new rlh0(i, i2)));
    }

    @Override // xsna.lih0
    public final void L(qi5 qi5Var) {
        this.a.a(new c01(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void M(qi5 qi5Var) {
        this.a.a(new f01(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void d(qi5 qi5Var) {
        this.a.a(new h01(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void e(qi5 qi5Var) {
        this.a.a(new k01(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void f(qi5 qi5Var) {
        this.a.a(new d01(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void g(qi5 qi5Var) {
        this.a.a(new g01(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void h(qi5 qi5Var) {
        this.a.a(new i01(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void u() {
        this.a.a(m01.b);
    }

    @Override // xsna.lih0
    public final void x0() {
        this.a.a(o01.b);
    }

    @Override // xsna.lih0
    public final void c() {
    }

    @Override // xsna.lih0
    public final void a(boolean z) {
    }

    @Override // xsna.lih0
    public final void b(qi5 qi5Var) {
    }

    @Override // xsna.lih0
    public final void onIsPlayingChanged(boolean z) {
    }

    @Override // xsna.lih0
    public final void q(List<? extends SubtitleRenderItem> list) {
    }

    @Override // xsna.lih0
    public final void H(long j, long j2) {
    }
}
