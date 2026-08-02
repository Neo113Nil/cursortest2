package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes10.dex */
public final class pk implements xq {
    public static final pk h = new pk(0, 0, 1, 1, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public ok g;

    public pk(int i, int i2, int i3, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pk.class == obj.getClass()) {
            pk pkVar = (pk) obj;
            if (this.b == pkVar.b && this.c == pkVar.c && this.d == pkVar.d && this.e == pkVar.e && this.f == pkVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }
}
