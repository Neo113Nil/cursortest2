package xsna;

import android.text.TextUtils;
import xsna.ngv0;

/* compiled from: VkRichCell.kt */
/* loaded from: classes17.dex */
public final class qgv0 {
    public final tlo0 a;
    public final ngv0 b;
    public final ngv0 c;
    public final int d;
    public final TextUtils.TruncateAt e;

    public /* synthetic */ qgv0(tlo0 tlo0Var, ngv0.a aVar, ngv0.a aVar2, int i, int i2) {
        this(tlo0Var, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : aVar2, (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? null : TextUtils.TruncateAt.END);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgv0)) {
            return false;
        }
        qgv0 qgv0Var = (qgv0) obj;
        return epx.f(this.a, qgv0Var.a) && epx.f(this.b, qgv0Var.b) && epx.f(this.c, qgv0Var.c) && this.d == qgv0Var.d && this.e == qgv0Var.e;
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
        return "ExtraSubtitle(extraSubtitle=" + this.a + ", before=" + this.b + ", after=" + this.c + ", maxLines=" + this.d + ", overflow=" + this.e + ')';
    }

    public qgv0(tlo0 tlo0Var, ngv0 ngv0Var, ngv0 ngv0Var2, int i, TextUtils.TruncateAt truncateAt) {
        this.a = tlo0Var;
        this.b = ngv0Var;
        this.c = ngv0Var2;
        this.d = i;
        this.e = truncateAt;
    }
}
