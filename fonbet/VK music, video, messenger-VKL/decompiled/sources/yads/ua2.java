package yads;

/* loaded from: classes10.dex */
public final class ua2 implements vq2, uq2 {
    public final String a;
    public final pe3 b;
    public final /* synthetic */ va2 c;

    public ua2(va2 va2Var, String str, xa2 xa2Var) {
        this.c = va2Var;
        this.a = str;
        this.b = xa2Var;
    }

    @Override // yads.uq2
    public final void a(mn3 mn3Var) {
        this.b.a();
    }

    @Override // yads.vq2
    public final void a(Object obj) {
        ((uh1) this.c.b.a).a("YmadOmSdkJs", (String) obj);
        za2 za2Var = this.c.b;
        ((uh1) za2Var.a).a("YmadOmSdkJsUrl", this.a);
        this.b.a();
    }
}
