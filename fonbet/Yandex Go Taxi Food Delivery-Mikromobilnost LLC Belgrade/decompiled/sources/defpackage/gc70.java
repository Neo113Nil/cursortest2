package defpackage;

/* loaded from: classes.dex */
public abstract class gc70 {
    public final int a;
    public final int b;

    public /* synthetic */ gc70(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var);

    public yss b(vc70 vc70Var) {
        return null;
    }

    public final String toString() {
        String d = qoi0.a(getClass()).d();
        return d == null ? "" : d;
    }

    public gc70(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
