package defpackage;

/* loaded from: classes9.dex */
public abstract class he00 {
    public static final ge00 c = new ge00(new fe00(), ke00.I2);
    public final /* synthetic */ fe00 a;
    public final /* synthetic */ je00 b;

    public he00(fe00 fe00Var, je00 je00Var) {
        this.a = fe00Var;
        this.b = je00Var;
    }

    public final void a(int i, String str, Throwable th, String str2) {
        ke00 a = this.b.a();
        if (a == null || !a.b(i)) {
            return;
        }
        a.a(i, str, th, str2, this.a);
    }
}
