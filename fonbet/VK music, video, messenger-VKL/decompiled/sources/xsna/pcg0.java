package xsna;

import com.vk.dto.common.restrictions.Restriction;

/* compiled from: MarketLinkedContentScreen.kt */
/* loaded from: classes18.dex */
public final class pcg0 {
    public final String a;
    public final Restriction b;
    public final String c;
    public final int d;

    public pcg0(String str, Restriction restriction, String str2, int i) {
        this.a = str;
        this.b = restriction;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcg0)) {
            return false;
        }
        pcg0 pcg0Var = (pcg0) obj;
        return epx.f(this.a, pcg0Var.a) && epx.f(this.b, pcg0Var.b) && epx.f(this.c, pcg0Var.c) && this.d == pcg0Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Restriction restriction = this.b;
        int hashCode2 = (hashCode + (restriction == null ? 0 : restriction.hashCode())) * 31;
        String str2 = this.c;
        return Integer.hashCode(this.d) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestrictedPhotoItem(photoUrl=");
        sb.append(this.a);
        sb.append(", restriction=");
        sb.append(this.b);
        sb.append(", lowQualityPhotoUrl=");
        sb.append(this.c);
        sb.append(", accessibilityStringRes=");
        return vu5.b(sb, this.d, ')');
    }
}
