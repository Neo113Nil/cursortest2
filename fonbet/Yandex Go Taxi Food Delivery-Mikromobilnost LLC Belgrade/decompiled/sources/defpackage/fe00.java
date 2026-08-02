package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class fe00 {
    public final wy40 a;

    public fe00() {
        this(new wy40(0));
    }

    public final List a(an11 an11Var) {
        wy40 wy40Var = this.a;
        if (wy40Var.b == 0) {
            return EmptyList.a;
        }
        wy40 wy40Var2 = new wy40(1);
        Object[] objArr = wy40Var.a;
        int i = wy40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            le00 le00Var = (le00) objArr[i2];
            if (le00Var.b.equals(an11Var)) {
                Object obj = le00Var.a;
                int i3 = wy40Var2.b + 1;
                Object[] objArr2 = wy40Var2.a;
                if (objArr2.length < i3) {
                    int length = objArr2.length;
                    Object[] objArr3 = new Object[Math.max(i3, (length * 3) / 2)];
                    System.arraycopy(objArr2, 0, objArr3, 0, length);
                    wy40Var2.a = objArr3;
                }
                Object[] objArr4 = wy40Var2.a;
                int i4 = wy40Var2.b;
                objArr4[i4] = obj;
                wy40Var2.b = i4 + 1;
            }
        }
        ty40 ty40Var = wy40Var2.c;
        if (ty40Var != null) {
            return ty40Var;
        }
        ty40 ty40Var2 = new ty40(wy40Var2);
        wy40Var2.c = ty40Var2;
        return ty40Var2;
    }

    public final boolean b(an11 an11Var) {
        wy40 wy40Var = this.a;
        Object[] objArr = wy40Var.a;
        int i = wy40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((le00) objArr[i2]).b.equals(an11Var)) {
                return true;
            }
        }
        return false;
    }

    public fe00(wy40 wy40Var) {
        this.a = wy40Var;
    }
}
