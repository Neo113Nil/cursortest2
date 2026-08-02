package xsna;

import com.vk.reefton.dto.ReefContentType;

/* compiled from: AnalyticsConfig.kt */
/* loaded from: classes3.dex */
public final class vmf0 {
    public final String a;
    public final String b;
    public final ReefContentType c;
    public final boolean d;

    public vmf0(String str, String str2, ReefContentType reefContentType, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = reefContentType;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmf0)) {
            return false;
        }
        vmf0 vmf0Var = (vmf0) obj;
        return epx.f(this.a, vmf0Var.a) && epx.f(this.b, vmf0Var.b) && this.c == vmf0Var.c && this.d == vmf0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReefAnalyticsConfig(contentId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", reefContentType=");
        sb.append(this.c);
        sb.append(", isAd=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
