package xsna;

import android.text.TextUtils;
import xsna.ngv0;
import xsna.tlo0;

/* compiled from: VkRichCell.kt */
/* loaded from: classes17.dex */
public final class ugv0 {
    public final tlo0 a;
    public final ngv0 b;
    public final ngv0 c;
    public final int d;
    public final TextUtils.TruncateAt e;
    public final gzs<s3q0> f;

    public /* synthetic */ ugv0(tlo0.h hVar, ngv0.a aVar, ngv0.a aVar2, int i, fy0 fy0Var, int i2) {
        this(hVar, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : aVar2, (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? null : TextUtils.TruncateAt.END, (i2 & 32) != 0 ? null : fy0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugv0)) {
            return false;
        }
        ugv0 ugv0Var = (ugv0) obj;
        return epx.f(this.a, ugv0Var.a) && epx.f(this.b, ugv0Var.b) && epx.f(this.c, ugv0Var.c) && this.d == ugv0Var.d && this.e == ugv0Var.e && epx.f(this.f, ugv0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ngv0 ngv0Var = this.b;
        int hashCode2 = (hashCode + (ngv0Var == null ? 0 : ngv0Var.hashCode())) * 31;
        ngv0 ngv0Var2 = this.c;
        int a = shy.a(this.d, (hashCode2 + (ngv0Var2 == null ? 0 : ngv0Var2.hashCode())) * 31, 31);
        TextUtils.TruncateAt truncateAt = this.e;
        int hashCode3 = (a + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31;
        gzs<s3q0> gzsVar = this.f;
        return hashCode3 + (gzsVar != null ? gzsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Subtitle(subtitle=");
        sb.append(this.a);
        sb.append(", before=");
        sb.append(this.b);
        sb.append(", after=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", overflow=");
        sb.append(this.e);
        sb.append(", onClick=");
        return uf3.d(sb, this.f, ')');
    }

    public ugv0(tlo0 tlo0Var, ngv0 ngv0Var, ngv0 ngv0Var2, int i, TextUtils.TruncateAt truncateAt, gzs<s3q0> gzsVar) {
        this.a = tlo0Var;
        this.b = ngv0Var;
        this.c = ngv0Var2;
        this.d = i;
        this.e = truncateAt;
        this.f = gzsVar;
    }
}
