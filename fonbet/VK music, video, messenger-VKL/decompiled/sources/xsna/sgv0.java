package xsna;

import android.text.TextUtils;

/* compiled from: VkRichCell.kt */
/* loaded from: classes17.dex */
public final class sgv0 {
    public final tlo0 a;
    public final ngv0 b;
    public final ngv0 c;
    public final int d;
    public final TextUtils.TruncateAt e;

    public /* synthetic */ sgv0(int i, tlo0 tlo0Var) {
        this(tlo0Var, null, null, (i & 8) != 0 ? Integer.MAX_VALUE : 1, (i & 16) != 0 ? null : TextUtils.TruncateAt.END);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgv0)) {
            return false;
        }
        sgv0 sgv0Var = (sgv0) obj;
        return epx.f(this.a, sgv0Var.a) && epx.f(this.b, sgv0Var.b) && epx.f(this.c, sgv0Var.c) && this.d == sgv0Var.d && this.e == sgv0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ngv0 ngv0Var = this.b;
        int hashCode2 = (hashCode + (ngv0Var == null ? 0 : ngv0Var.hashCode())) * 31;
        ngv0 ngv0Var2 = this.c;
        int a = shy.a(this.d, (hashCode2 + (ngv0Var2 == null ? 0 : ngv0Var2.hashCode())) * 31, 31);
        TextUtils.TruncateAt truncateAt = this.e;
        return a + (truncateAt != null ? truncateAt.hashCode() : 0);
    }

    public final String toString() {
        return "Overtitle(overtitle=" + this.a + ", before=" + this.b + ", after=" + this.c + ", maxLines=" + this.d + ", overflow=" + this.e + ')';
    }

    public sgv0(tlo0 tlo0Var, ngv0 ngv0Var, ngv0 ngv0Var2, int i, TextUtils.TruncateAt truncateAt) {
        this.a = tlo0Var;
        this.b = ngv0Var;
        this.c = ngv0Var2;
        this.d = i;
        this.e = truncateAt;
    }
}
