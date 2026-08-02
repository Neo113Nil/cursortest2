package xsna;

import java.util.List;

/* compiled from: CommunityRecomCardGroupExt.kt */
/* loaded from: classes5.dex */
public final class nzq0 {
    public final List<String> a;
    public final String b;

    public nzq0(List<String> list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzq0)) {
            return false;
        }
        nzq0 nzq0Var = (nzq0) obj;
        return epx.f(this.a, nzq0Var.a) && epx.f(this.b, nzq0Var.b);
    }

    public final int hashCode() {
        List<String> list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserStackBadgeData(avatarUrls=");
        sb.append(this.a);
        sb.append(", badgeText=");
        return ho8.a(sb, this.b, ')');
    }
}
