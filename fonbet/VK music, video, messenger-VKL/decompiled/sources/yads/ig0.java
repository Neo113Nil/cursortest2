package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes10.dex */
public final class ig0 implements xq {
    public final int b;
    public final int c;
    public final int d;

    public ig0(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig0)) {
            return false;
        }
        ig0 ig0Var = (ig0) obj;
        return this.b == ig0Var.b && this.c == ig0Var.c && this.d == ig0Var.d;
    }

    public final int hashCode() {
        return ((((this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c) * 31) + this.d;
    }
}
