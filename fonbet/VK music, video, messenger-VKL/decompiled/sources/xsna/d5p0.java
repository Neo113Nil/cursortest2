package xsna;

import android.text.SpannableStringBuilder;

/* compiled from: ImAdBadge.kt */
/* loaded from: classes2.dex */
public final class d5p0 {
    public final SpannableStringBuilder a;
    public final gzs<s3q0> b;
    public final gzs<s3q0> c;

    public d5p0() {
        throw null;
    }

    public d5p0(SpannableStringBuilder spannableStringBuilder, gzs gzsVar, gzs gzsVar2) {
        this.a = spannableStringBuilder;
        this.b = gzsVar;
        this.c = gzsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5p0)) {
            return false;
        }
        d5p0 d5p0Var = (d5p0) obj;
        d5p0Var.getClass();
        return epx.f(this.a, d5p0Var.a) && epx.f(this.b, d5p0Var.b) && epx.f(this.c, d5p0Var.c);
    }

    public final int hashCode() {
        SpannableStringBuilder spannableStringBuilder = this.a;
        int b = qoy.b((spannableStringBuilder == null ? 0 : spannableStringBuilder.hashCode()) * 31, 31, false);
        gzs<s3q0> gzsVar = this.b;
        int hashCode = (b + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
        gzs<s3q0> gzsVar2 = this.c;
        return (hashCode + (gzsVar2 != null ? gzsVar2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "TooltipData(title=null, description=" + ((Object) this.a) + ", showClose=false, onTooltipShown=" + this.b + ", onTooltipClick=" + this.c + ", onTooltipDismiss=null)";
    }
}
