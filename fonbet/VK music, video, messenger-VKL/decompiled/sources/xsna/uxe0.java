package xsna;

/* compiled from: RatingBarStyle.kt */
/* loaded from: classes17.dex */
public final class uxe0 {
    public final float a;
    public final float b;
    public final float c;
    public final long d;
    public final long e;

    /* compiled from: RatingBarStyle.kt */
    public static final class a {
        public static uxe0 a(androidx.compose.runtime.a aVar) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1208935292, 6, -1, "com.vk.core.compose.extracomponents.rating.RatingBarStyle.Companion.<get-Large> (RatingBarStyle.kt:44)");
            }
            float f = 36;
            float f2 = 4;
            float f3 = 10;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long c = l5g.c(14, ylu0Var.getIcon().n, 0.4f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uxe0 uxe0Var = new uxe0(f, f2, f3, c, ylu0Var2.q().i);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return uxe0Var;
        }

        public static uxe0 b(androidx.compose.runtime.a aVar) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-41794044, 6, -1, "com.vk.core.compose.extracomponents.rating.RatingBarStyle.Companion.<get-Small> (RatingBarStyle.kt:22)");
            }
            float f = 16;
            float f2 = 1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long c = l5g.c(14, ylu0Var.getIcon().n, 0.4f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uxe0 uxe0Var = new uxe0(f, f2, f2, c, ylu0Var2.q().i);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return uxe0Var;
        }
    }

    public uxe0(float f, float f2, float f3, long j, long j2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = j;
        this.e = j2;
    }

    public static uxe0 a(uxe0 uxe0Var, long j, long j2, int i) {
        float f = uxe0Var.a;
        float f2 = uxe0Var.b;
        float f3 = uxe0Var.c;
        if ((i & 8) != 0) {
            j = uxe0Var.d;
        }
        return new uxe0(f, f2, f3, j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxe0)) {
            return false;
        }
        uxe0 uxe0Var = (uxe0) obj;
        return pco.b(this.a, uxe0Var.a) && pco.b(this.b, uxe0Var.b) && pco.b(this.c, uxe0Var.c) && l5g.d(this.d, uxe0Var.d) && l5g.d(this.e, uxe0Var.e);
    }

    public final int hashCode() {
        int a2 = io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        int i = l5g.l;
        return Long.hashCode(this.e) + bh10.a(a2, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingBarStyle(starSize=");
        oq.f(this.a, ", starHorizontalPadding=", sb);
        oq.f(this.b, ", gap=", sb);
        oq.f(this.c, ", colorEmpty=", sb);
        dn.h(this.d, ", colorFilled=", sb);
        return pm0.d(')', this.e, sb);
    }
}
