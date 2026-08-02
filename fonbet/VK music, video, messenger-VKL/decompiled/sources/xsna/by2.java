package xsna;

import android.content.Context;

/* compiled from: ErrorViewConfiguration.kt */
/* loaded from: classes3.dex */
public final class by2 {
    public final int a;
    public final boolean b;
    public final izs<Context, s3q0> c;

    public by2() {
        this(0, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by2)) {
            return false;
        }
        by2 by2Var = (by2) obj;
        return this.a == by2Var.a && this.b == by2Var.b && epx.f(this.c, by2Var.c);
    }

    public final int hashCode() {
        int a = shy.a(0, qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31);
        izs<Context, s3q0> izsVar = this.c;
        return a + (izsVar != null ? izsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiErrorConfig(titleRes=");
        sb.append(this.a);
        sb.append(", isRetryVisible=");
        sb.append(this.b);
        sb.append(", actonTitle=0, customAction=");
        return up.c(sb, this.c, ')');
    }

    public by2(int i, int i2, izs izsVar) {
        i = (i2 & 1) != 0 ? 0 : i;
        boolean z = (i2 & 2) != 0;
        izsVar = (i2 & 8) != 0 ? null : izsVar;
        this.a = i;
        this.b = z;
        this.c = izsVar;
    }
}
