package yads;

/* loaded from: classes10.dex */
public final class ne0 {
    public final String a;
    public int b;
    public long c;
    public final zn1 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ oe0 g;

    public ne0(oe0 oe0Var, String str, int i, zn1 zn1Var) {
        this.g = oe0Var;
        this.a = str;
        this.b = i;
        this.c = zn1Var == null ? -1L : zn1Var.d;
        if (zn1Var == null || !zn1Var.a()) {
            return;
        }
        this.d = zn1Var;
    }

    public final boolean a(ye yeVar) {
        long j = this.c;
        if (j == -1) {
            return false;
        }
        zn1 zn1Var = yeVar.d;
        if (zn1Var == null) {
            return this.b != yeVar.c;
        }
        if (zn1Var.d > j) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        int a = yeVar.b.a(zn1Var.a);
        int a2 = yeVar.b.a(this.d.a);
        zn1 zn1Var2 = yeVar.d;
        if (zn1Var2.d < this.d.d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        if (!zn1Var2.a()) {
            int i = yeVar.d.e;
            return i == -1 || i > this.d.b;
        }
        zn1 zn1Var3 = yeVar.d;
        int i2 = zn1Var3.b;
        int i3 = zn1Var3.c;
        zn1 zn1Var4 = this.d;
        int i4 = zn1Var4.b;
        return i2 > i4 || (i2 == i4 && i3 > zn1Var4.c);
    }
}
