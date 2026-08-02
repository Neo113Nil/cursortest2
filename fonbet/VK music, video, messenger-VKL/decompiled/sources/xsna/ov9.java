package xsna;

/* compiled from: CarouselSwitcherDelegate.kt */
/* loaded from: classes4.dex */
public final class ov9 {
    public final z84 a;
    public boolean b = true;
    public boolean c = true;
    public boolean d;

    public ov9(z84 z84Var) {
        this.a = z84Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xsna.qv9] */
    public final void a(int i) {
        boolean z = i >= 2 && this.b;
        this.d = z;
        z84 z84Var = this.a;
        if (z) {
            z84Var.I1(this.c);
            z84Var.r1(this.c);
        } else {
            z84Var.I1(true);
            z84Var.r1(true);
        }
        boolean z2 = this.d;
        ?? r0 = z84Var.l;
        if (r0 != 0) {
            r0.b(z2);
        }
    }
}
