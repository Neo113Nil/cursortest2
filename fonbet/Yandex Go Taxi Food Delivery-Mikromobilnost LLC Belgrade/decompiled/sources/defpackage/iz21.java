package defpackage;

/* loaded from: classes10.dex */
public abstract class iz21 {
    public static final kn1 a = new kn1(hv60.a, 0, 0, 8);

    public static final vw01 a(gy31 gy31Var, kk2 kk2Var) {
        vw01 b = gy31Var.b(kk2Var);
        int length = kk2Var.b.length();
        kk2 kk2Var2 = b.a;
        iv60 iv60Var = b.b;
        int length2 = kk2Var2.b.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            b(iv60Var.r(i), length2, i);
        }
        b(iv60Var.r(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            c(iv60Var.j(i2), length, i2);
        }
        c(iv60Var.j(length2), length, length2);
        return new vw01(kk2Var2, new kn1(iv60Var, kk2Var.b.length(), kk2Var2.b.length(), 8));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder s = b64.s(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        s.append(i2);
        s.append(']');
        lxv.c(s.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder s = b64.s(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        s.append(i2);
        s.append(']');
        lxv.c(s.toString());
    }
}
