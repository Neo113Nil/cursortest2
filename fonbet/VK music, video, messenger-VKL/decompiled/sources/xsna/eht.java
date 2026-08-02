package xsna;

/* compiled from: Gateways.kt */
/* loaded from: classes4.dex */
public final class eht implements nn50<ur60, on50, ds60, qr60, yo60> {
    public final /* synthetic */ nn50<Object, on50, Object, Object, Object> b;
    public final /* synthetic */ yt60<Object, Object, Object> c;

    public eht(nn50<Object, on50, Object, Object, Object> nn50Var, yt60<Object, Object, Object> yt60Var) {
        this.b = nn50Var;
        this.c = yt60Var;
    }

    @Override // xsna.nn50
    public final void a(ds60 ds60Var) {
        this.b.a(this.c.d0().a(ds60Var));
    }

    @Override // xsna.nn50
    public final void c(yo60 yo60Var) {
        this.b.c(this.c.h1().a(yo60Var));
    }

    @Override // xsna.nn50
    public final ur60 e(qr60 qr60Var) {
        return ((tw60) this.b.e(this.c.Z().a(qr60Var))).p();
    }

    @Override // xsna.nn50
    public final ur60 getCurrentState() {
        return ((tw60) this.b.getCurrentState()).p();
    }
}
