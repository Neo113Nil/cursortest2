package defpackage;

/* loaded from: classes12.dex */
public final class k431 extends u0x implements r7u, s7u, u7u {
    public final String a;
    public final String b = "vaults_pager";
    public final l431 c;

    public k431(String str, l431 l431Var) {
        this.a = str;
        this.c = l431Var;
    }

    @Override // defpackage.r7u
    public final Object g() {
        return this.b;
    }

    @Override // defpackage.s7u
    public final Object getItemId() {
        return this.a;
    }

    @Override // defpackage.u7u
    public final Object getModel() {
        return this.c;
    }
}
