package defpackage;

import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public abstract class jlb1 {
    public static mgv a;

    public static final int a(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static z810 b(w820 w820Var, String str) {
        int i = 0;
        while (true) {
            s820[] s820VarArr = w820Var.a;
            if (i >= s820VarArr.length) {
                return null;
            }
            s820 s820Var = s820VarArr[i];
            if (s820Var instanceof z810) {
                z810 z810Var = (z810) s820Var;
                if (z810Var.a.equals(str)) {
                    return z810Var;
                }
            }
            i++;
        }
    }

    public static mo2 c(ef90 ef90Var) {
        int k = ef90Var.k();
        if (ef90Var.k() != 1684108385) {
            lk91.j("Failed to parse cover art attribute");
            return null;
        }
        int k2 = ef90Var.k();
        byte[] bArr = aj6.a;
        int i = k2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            xvz.v(i, "Unrecognized cover art flags: ");
            return null;
        }
        ef90Var.L(4);
        int i2 = k - 16;
        byte[] bArr2 = new byte[i2];
        ef90Var.i(0, i2, bArr2);
        return new mo2(str, null, 3, bArr2);
    }

    public static bpy0 d(int i, ef90 ef90Var, String str) {
        int k = ef90Var.k();
        if (ef90Var.k() == 1684108385 && k >= 22) {
            ef90Var.L(10);
            int E = ef90Var.E();
            if (E > 0) {
                String i2 = oyr.i(E, "");
                int E2 = ef90Var.E();
                if (E2 > 0) {
                    i2 = qv10.h(E2, i2, "/");
                }
                return new bpy0(str, null, ImmutableList.r(i2));
            }
        }
        lk91.j("Failed to parse index/count attribute: ".concat(ay4.d(i)));
        return null;
    }

    public static int e(ef90 ef90Var) {
        int k = ef90Var.k();
        if (ef90Var.k() == 1684108385) {
            ef90Var.L(8);
            int i = k - 16;
            if (i == 1) {
                return ef90Var.y();
            }
            if (i == 2) {
                return ef90Var.E();
            }
            if (i == 3) {
                return ef90Var.B();
            }
            if (i == 4 && (ef90Var.h() & 128) == 0) {
                return ef90Var.C();
            }
        }
        lk91.j("Failed to parse data atom to int");
        return -1;
    }

    public static x5v f(int i, String str, ef90 ef90Var, boolean z, boolean z2) {
        int e = e(ef90Var);
        if (z2) {
            e = Math.min(1, e);
        }
        if (e >= 0) {
            return z ? new bpy0(str, null, ImmutableList.r(Integer.toString(e))) : new gmc("und", str, Integer.toString(e));
        }
        lk91.j("Failed to parse uint8 attribute: ".concat(ay4.d(i)));
        return null;
    }

    public static bpy0 g(int i, ef90 ef90Var, String str) {
        int k = ef90Var.k();
        if (ef90Var.k() == 1684108385) {
            ef90Var.L(8);
            return new bpy0(str, null, ImmutableList.r(ef90Var.u(k - 16)));
        }
        lk91.j("Failed to parse text attribute: ".concat(ay4.d(i)));
        return null;
    }
}
