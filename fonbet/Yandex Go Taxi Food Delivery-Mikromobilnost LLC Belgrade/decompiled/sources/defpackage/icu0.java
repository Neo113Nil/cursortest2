package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class icu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jcu0 b;

    public /* synthetic */ icu0(jcu0 jcu0Var, int i) {
        this.a = i;
        this.b = jcu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        jcu0 jcu0Var = this.b;
        switch (i) {
            case 0:
                jcu0Var.x.f.b(jcu0Var);
                break;
            case 1:
                jcu0Var.x.f.d(jcu0Var);
                break;
            case 2:
                jcu0Var.a(true);
                break;
            default:
                jcu0Var.a(false);
                break;
        }
    }
}
