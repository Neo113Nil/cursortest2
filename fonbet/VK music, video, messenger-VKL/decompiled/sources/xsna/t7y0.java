package xsna;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ZstdInitConfig.kt */
/* loaded from: classes.dex */
public final class t7y0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final Object e;

    public t7y0() {
        this(31, null, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7y0)) {
            return false;
        }
        t7y0 t7y0Var = (t7y0) obj;
        return this.a == t7y0Var.a && this.b == t7y0Var.b && this.c == t7y0Var.c && epx.f(this.d, t7y0Var.d) && epx.f(this.e, t7y0Var.e);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZstdInitConfig(isFeatureEnabled=");
        sb.append(this.a);
        sb.append(", zstdEnabled=");
        sb.append(this.b);
        sb.append(", statEnabled=");
        sb.append(this.c);
        sb.append(", overrideDictVersion=");
        sb.append(this.d);
        sb.append(", wrapEnabledDelegate=");
        return k73.c(sb, this.e, ')');
    }

    public t7y0(int i, String str, boolean z, boolean z2, boolean z3) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        str = (i & 8) != 0 ? null : str;
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new c24(0));
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = a;
    }
}
