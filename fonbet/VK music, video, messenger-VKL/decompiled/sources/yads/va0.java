package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes10.dex */
public final class va0 {
    public final String a;
    public final nx0 b;
    public final nx0 c;
    public final int d;
    public final int e;

    public va0(String str, nx0 nx0Var, nx0 nx0Var2, int i, int i2) {
        ni.a(i == 0 || i2 == 0);
        this.a = ni.a(str);
        this.b = (nx0) ni.a(nx0Var);
        this.c = (nx0) ni.a(nx0Var2);
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && va0.class == obj.getClass()) {
            va0 va0Var = (va0) obj;
            if (this.d == va0Var.d && this.e == va0Var.e && this.a.equals(va0Var.a) && this.b.equals(va0Var.b) && this.c.equals(va0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + k4.a(this.a, (((this.d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.e) * 31, 31)) * 31);
    }
}
