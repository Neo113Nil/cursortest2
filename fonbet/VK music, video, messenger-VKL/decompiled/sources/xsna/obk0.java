package xsna;

import com.vk.music.player.error.VkPlayerException;

/* compiled from: SnippetAnalyticsListener.kt */
/* loaded from: classes3.dex */
public final class obk0 extends vtl {
    public final tn6 c;
    public final gzs<jx4> d;
    public final gzs<s3q0> e;

    /* JADX WARN: Multi-variable type inference failed */
    public obk0(tn6 tn6Var, gzs<? extends jx4> gzsVar, gzs<s3q0> gzsVar2, px40 px40Var) {
        super(px40Var);
        this.c = tn6Var;
        this.d = gzsVar;
        this.e = gzsVar2;
    }

    @Override // xsna.vtl, xsna.px40
    public final void D(v0q<? extends kw40> v0qVar) {
        this.c.a(v0qVar);
        super.D(v0qVar);
    }

    @Override // xsna.vtl, xsna.px40
    public final void a(ry40 ry40Var) {
        this.c.b(ry40Var);
        super.a(ry40Var);
    }

    @Override // xsna.vtl, xsna.px40
    public final void q(ky40 ky40Var) {
        jx4 invoke = this.d.invoke();
        this.c.c(invoke);
        super.q(new ky40(ky40Var.a, ky40Var.b, invoke.b(), invoke.a()));
    }

    @Override // xsna.vtl, xsna.px40
    public final void v(cz40 cz40Var, VkPlayerException vkPlayerException) {
        this.e.invoke();
        super.v(cz40Var, vkPlayerException);
    }
}
