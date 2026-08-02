package xsna;

import java.util.ArrayList;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class j3r0 {
    public static float a(e6y0 e6y0Var) {
        return e6y0Var.a / e6y0Var.b;
    }

    public static int b(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            float a = a((e6y0) arrayList.get(i2));
            i = a >= 1.2f ? i | 1 : a <= 0.8f ? i | 2 : i | 4;
        }
        return i;
    }

    public static float c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }
}
