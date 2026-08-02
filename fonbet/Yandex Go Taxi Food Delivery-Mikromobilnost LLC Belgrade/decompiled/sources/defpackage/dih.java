package defpackage;

/* loaded from: classes10.dex */
public final class dih {
    public final String a;
    public int b;
    public long c;
    public final sf10 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ eih g;

    public dih(eih eihVar, String str, int i, sf10 sf10Var) {
        this.g = eihVar;
        this.a = str;
        this.b = i;
        this.c = sf10Var == null ? -1L : sf10Var.d;
        if (sf10Var == null || !sf10Var.b()) {
            return;
        }
        this.d = sf10Var;
    }

    public final boolean a(h42 h42Var) {
        sf10 sf10Var = h42Var.d;
        a9z0 a9z0Var = h42Var.b;
        if (sf10Var == null) {
            return this.b != h42Var.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (sf10Var.d > j) {
            return true;
        }
        sf10 sf10Var2 = this.d;
        if (sf10Var2 == null) {
            return false;
        }
        int i = sf10Var2.b;
        int b = a9z0Var.b(sf10Var.a);
        int b2 = a9z0Var.b(sf10Var2.a);
        if (sf10Var.d < sf10Var2.d || b < b2) {
            return false;
        }
        if (b > b2) {
            return true;
        }
        if (!sf10Var.b()) {
            int i2 = sf10Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = sf10Var.b;
        int i4 = sf10Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > sf10Var2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.p()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(a9z0 a9z0Var, a9z0 a9z0Var2) {
        sf10 sf10Var;
        int i = this.b;
        if (i < a9z0Var.p()) {
            eih eihVar = this.g;
            z8z0 z8z0Var = eihVar.a;
            a9z0Var.o(z8z0Var, i);
            for (int i2 = z8z0Var.m; i2 <= z8z0Var.n; i2++) {
                int b = a9z0Var2.b(a9z0Var.m(i2));
                if (b != -1) {
                    i = a9z0Var2.g(b, eihVar.b, false).c;
                    break;
                }
            }
            i = -1;
        }
        this.b = i;
        return i != -1 && ((sf10Var = this.d) == null || a9z0Var2.b(sf10Var.a) != -1);
    }
}
