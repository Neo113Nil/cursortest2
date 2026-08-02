package xsna;

import java.util.Arrays;

/* compiled from: models.kt */
/* loaded from: classes6.dex */
public final class fe80 {
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;

    public fe80(int i, int i2, int i3, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe80)) {
            return false;
        }
        fe80 fe80Var = (fe80) obj;
        return this.a == fe80Var.a && this.b == fe80Var.b && this.c == fe80Var.c && epx.f(this.d, fe80Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "OnboardingPagerData(icon=" + this.a + ", title=" + this.b + ", subtitleTexts=" + this.c + ", subtitleIcons=" + Arrays.toString(this.d) + ')';
    }
}
