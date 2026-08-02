package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ju71 extends ui81 {
    public final int b;
    public final float c;

    public ju71(int i, float f) {
        boolean z = false;
        cha1.c("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        cha1.c("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ju71)) {
            return false;
        }
        ju71 ju71Var = (ju71) obj;
        return this.b == ju71Var.b && this.c == ju71Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Float.valueOf(this.c)});
    }

    public ju71(int i) {
        cha1.c("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }
}
