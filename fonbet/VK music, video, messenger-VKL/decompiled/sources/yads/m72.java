package yads;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class m72 implements eg3 {
    public final /* synthetic */ n72 a;

    public m72(n72 n72Var) {
        this.a = n72Var;
    }

    @Override // yads.eg3
    public final void a(nf3 nf3Var, float f) {
    }

    @Override // yads.eg3
    public final void b(nf3 nf3Var) {
        fg3 fg3Var = this.a.c;
        fg3Var.getClass();
        dp2 dp2Var = dp2.c;
        gp2 a = fg3Var.a.a();
        Map map = a.a;
        fg3Var.b.a(new fp2("video_ad_start", new LinkedHashMap(map), a.b));
        ig3 ig3Var = this.a.e;
        if (ig3Var != null) {
            ig3Var.c();
        }
    }

    @Override // yads.eg3
    public final void c(nf3 nf3Var) {
        fg3 fg3Var = this.a.c;
        fg3Var.getClass();
        dp2 dp2Var = dp2.c;
        gp2 a = fg3Var.a.a();
        Map map = a.a;
        fg3Var.b.a(new fp2("video_ad_complete", new LinkedHashMap(map), a.b));
        ig3 ig3Var = this.a.e;
        if (ig3Var != null) {
            ig3Var.b();
        }
    }

    @Override // yads.eg3
    public final void h(nf3 nf3Var) {
        ig3 ig3Var = this.a.e;
        if (ig3Var != null) {
            ig3Var.b();
        }
    }

    @Override // yads.eg3
    public final void i(nf3 nf3Var) {
        this.a.b.h();
    }

    @Override // yads.eg3
    public final void j(nf3 nf3Var) {
        this.a.d.a.c();
    }

    @Override // yads.eg3
    public final void a(nf3 nf3Var, ng3 ng3Var) {
        this.a.a.e();
        ig3 ig3Var = this.a.e;
        if (ig3Var != null) {
            ig3Var.a();
        }
    }

    @Override // yads.eg3
    public final void a(nf3 nf3Var) {
        this.a.b.d();
    }

    @Override // yads.eg3
    public final void d(nf3 nf3Var) {
    }

    @Override // yads.eg3
    public final void f(nf3 nf3Var) {
    }

    @Override // yads.eg3
    public final void g(nf3 nf3Var) {
    }

    @Override // yads.eg3
    public final void k(nf3 nf3Var) {
    }
}
