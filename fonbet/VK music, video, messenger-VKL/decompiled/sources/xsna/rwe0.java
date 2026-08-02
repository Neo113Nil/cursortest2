package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: RangedUri.java */
/* loaded from: classes12.dex */
public final class rwe0 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public rwe0(@Nullable String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    @Nullable
    public final rwe0 a(@Nullable rwe0 rwe0Var, String str) {
        rwe0 rwe0Var2;
        String c = neq0.c(str, this.c);
        if (rwe0Var != null) {
            long j = rwe0Var.b;
            if (c.equals(neq0.c(str, rwe0Var.c))) {
                long j2 = this.b;
                if (j2 != -1) {
                    long j3 = this.a;
                    rwe0Var2 = null;
                    if (j3 + j2 == rwe0Var.a) {
                        return new rwe0(c, j3, j != -1 ? j2 + j : -1L);
                    }
                } else {
                    rwe0Var2 = null;
                }
                if (j == -1) {
                    return rwe0Var2;
                }
                long j4 = rwe0Var.a;
                if (j4 + j == this.a) {
                    return new rwe0(c, j4, j2 != -1 ? j + j2 : -1L);
                }
                return rwe0Var2;
            }
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rwe0.class == obj.getClass()) {
            rwe0 rwe0Var = (rwe0) obj;
            if (this.a == rwe0Var.a && this.b == rwe0Var.b && this.c.equals(rwe0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return efz.b(this.b, ")", sb);
    }
}
