package com.yandex.passport.internal.report.reporters;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class m0 {
    public final float a;
    public final int b;

    public /* synthetic */ m0(float f, int i, int i2) {
        this((i & 1) != 0 ? -1.0f : f, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Float.compare(this.a, m0Var.a) == 0 && this.b == m0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        float f = this.a;
        return f == -1.0f ? "unknown" : String.format(Locale.US, "%.4f [%d]", Arrays.copyOf(new Object[]{Float.valueOf(f), Integer.valueOf(this.b)}, 2));
    }

    public m0(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public m0() {
        this(0.0f, 3, 0);
    }
}
