package xsna;

import java.util.List;

/* compiled from: ProductActionButtonsState.kt */
/* loaded from: classes18.dex */
public final class hid0 {
    public final List a;
    public final rbg0 b;
    public final String c;
    public final boolean d;

    public hid0(List list, rbg0 rbg0Var, String str, boolean z) {
        this.a = list;
        this.b = rbg0Var;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hid0)) {
            return false;
        }
        hid0 hid0Var = (hid0) obj;
        return epx.f(this.a, hid0Var.a) && epx.f(this.b, hid0Var.b) && epx.f(this.c, hid0Var.c) && this.d == hid0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rbg0 rbg0Var = this.b;
        int hashCode2 = (hashCode + (rbg0Var == null ? 0 : rbg0Var.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductActionButtonsState(ctaButtons=");
        mr.c(", responseTimeData=", sb, this.a);
        sb.append(this.b);
        sb.append(", legalDisclaimer=");
        sb.append(this.c);
        sb.append(", isHorizontalLayout=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
