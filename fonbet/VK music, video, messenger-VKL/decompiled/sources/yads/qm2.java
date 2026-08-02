package yads;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.efz;

/* loaded from: classes10.dex */
public final class qm2 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public qm2(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final qm2 a(qm2 qm2Var, String str) {
        String a = sb3.a(str, this.c);
        if (qm2Var == null || !a.equals(sb3.a(str, qm2Var.c))) {
            return null;
        }
        long j = this.b;
        if (j != -1) {
            long j2 = this.a;
            if (j2 + j == qm2Var.a) {
                long j3 = qm2Var.b;
                return new qm2(a, j2, j3 != -1 ? j + j3 : -1L);
            }
        }
        long j4 = qm2Var.b;
        if (j4 == -1) {
            return null;
        }
        long j5 = qm2Var.a;
        if (j5 + j4 == this.a) {
            return new qm2(a, j5, j != -1 ? j4 + j : -1L);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qm2.class == obj.getClass()) {
            qm2 qm2Var = (qm2) obj;
            if (this.a == qm2Var.a && this.b == qm2Var.b && this.c.equals(qm2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((((int) this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31);
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

    public final Uri a(String str) {
        return Uri.parse(sb3.a(str, this.c));
    }
}
