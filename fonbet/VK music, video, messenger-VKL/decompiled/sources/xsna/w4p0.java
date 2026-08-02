package xsna;

import com.vk.dto.hints.HintId;

/* compiled from: StorefrontState.kt */
/* loaded from: classes18.dex */
public final class w4p0 {
    public final HintId a;
    public final String b;
    public final String c;
    public final boolean d;

    public w4p0(HintId hintId, String str, String str2, boolean z) {
        this.a = hintId;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4p0)) {
            return false;
        }
        w4p0 w4p0Var = (w4p0) obj;
        return this.a == w4p0Var.a && epx.f(this.b, w4p0Var.b) && epx.f(this.c, w4p0Var.c) && this.d == w4p0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tooltip(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", topOf=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
