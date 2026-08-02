package defpackage;

/* loaded from: classes.dex */
public class ee60 {
    public final wz40 a = new wz40(new xd60[16]);
    public final xy40 b = new xy40(10);

    public boolean a(rnz rnzVar, rzx rzxVar, tis0 tis0Var, boolean z) {
        wz40 wz40Var = this.a;
        Object[] objArr = wz40Var.a;
        int i = wz40Var.c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((xd60) objArr[i2]).a(rnzVar, rzxVar, tis0Var, z) || z2;
        }
        return z2;
    }

    public void b(tis0 tis0Var) {
        wz40 wz40Var = this.a;
        int i = wz40Var.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((xd60) wz40Var.a[i]).d.f()) {
                wz40Var.k(i);
            }
        }
    }
}
