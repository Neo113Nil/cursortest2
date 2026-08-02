package defpackage;

/* loaded from: classes5.dex */
public final class ber implements en11 {
    public final /* synthetic */ en11 a;

    public ber(rqo rqoVar) {
        this.a = ((jbh) rqoVar).b(new aer(0));
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.qqo
    public final Object b() {
        return (aer) this.a.b();
    }

    @Override // defpackage.en11
    public final tpr c() {
        return this.a.c();
    }

    public final boolean d() {
        en11 en11Var = this.a;
        return en11Var.isEnabled() && ((aer) en11Var.b()).d;
    }

    @Override // defpackage.en11
    public final boolean isEnabled() {
        return this.a.isEnabled();
    }
}
