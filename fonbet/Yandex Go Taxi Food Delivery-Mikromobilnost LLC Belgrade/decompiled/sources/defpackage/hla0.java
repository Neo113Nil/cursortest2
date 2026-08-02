package defpackage;

/* loaded from: classes8.dex */
public final class hla0 extends u0x implements r7u, s7u, u7u, uvr {
    public final String a;
    public final gla0 b;

    public hla0(String str, gla0 gla0Var) {
        this.a = str;
        this.b = gla0Var;
    }

    @Override // defpackage.uvr
    public final String a() {
        return "payment_widgets";
    }

    @Override // defpackage.r7u
    public final Object g() {
        return "payment_widgets";
    }

    @Override // defpackage.s7u
    public final Object getItemId() {
        return this.a;
    }

    @Override // defpackage.u7u
    public final Object getModel() {
        return this.b;
    }
}
