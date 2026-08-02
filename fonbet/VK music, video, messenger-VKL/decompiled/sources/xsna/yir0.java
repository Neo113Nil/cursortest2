package xsna;

import xsna.uv70;

/* compiled from: ValidatingOffsetMapping.kt */
/* loaded from: classes11.dex */
public final class yir0 {
    public static final xir0 a = new xir0(uv70.a.a, 0, 0);

    public static final klp0 a(b6u0 b6u0Var, us2 us2Var) {
        klp0 a2 = b6u0Var.a(us2Var);
        int length = us2Var.c.length();
        us2 us2Var2 = a2.a;
        uv70 uv70Var = a2.b;
        int length2 = us2Var2.c.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            b(uv70Var.b(i), length2, i);
        }
        b(uv70Var.b(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            c(uv70Var.a(i2), length, i2);
        }
        c(uv70Var.a(length2), length, length2);
        return new klp0(us2Var2, new xir0(uv70Var, us2Var.c.length(), us2Var2.c.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder a2 = odj.a(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        a2.append(i2);
        a2.append(']');
        xzw.c(a2.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder a2 = odj.a(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        a2.append(i2);
        a2.append(']');
        xzw.c(a2.toString());
    }
}
