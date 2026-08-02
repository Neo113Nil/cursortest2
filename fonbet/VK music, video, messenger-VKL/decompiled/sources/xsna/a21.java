package xsna;

import java.util.List;

/* compiled from: AdsState.kt */
/* loaded from: classes2.dex */
public final class a21 {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final List<? extends d290> f;

    public a21() {
        throw null;
    }

    public a21(String str, String str2, Long l, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = str4;
        this.f = list;
    }

    public static a21 a(a21 a21Var, int i) {
        String str = a21Var.a;
        String str2 = a21Var.b;
        Long l = a21Var.c;
        String str3 = (i & 8) != 0 ? a21Var.d : null;
        String str4 = (i & 16) != 0 ? a21Var.e : null;
        List<? extends d290> list = a21Var.f;
        a21Var.getClass();
        return new a21(str, str2, l, str3, str4, list);
    }

    public final boolean equals(Object obj) {
        boolean f;
        boolean f2;
        boolean f3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a21)) {
            return false;
        }
        a21 a21Var = (a21) obj;
        if (!epx.f(this.a, a21Var.a) || !epx.f(this.b, a21Var.b) || !epx.f(this.c, a21Var.c)) {
            return false;
        }
        String str = a21Var.d;
        String str2 = this.d;
        if (str2 == null) {
            if (str == null) {
                f = true;
            }
            f = false;
        } else {
            if (str != null) {
                f = epx.f(str2, str);
            }
            f = false;
        }
        if (!f) {
            return false;
        }
        String str3 = a21Var.e;
        String str4 = this.e;
        if (str4 == null) {
            if (str3 == null) {
                f2 = true;
            }
            f2 = false;
        } else {
            if (str3 != null) {
                f2 = epx.f(str4, str3);
            }
            f2 = false;
        }
        if (!f2) {
            return false;
        }
        List<? extends d290> list = a21Var.f;
        List<? extends d290> list2 = this.f;
        if (list2 == null) {
            if (list == null) {
                f3 = true;
            }
            f3 = false;
        } else {
            if (list != null) {
                f3 = epx.f(list2, list);
            }
            f3 = false;
        }
        return f3;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<? extends d290> list = this.f;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsState(videoId=");
        sb.append(this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", videoOwnerId=");
        sb.append(this.c);
        sb.append(", instream=");
        String str = "null";
        String str2 = this.d;
        sb.append((Object) (str2 == null ? "null" : air.b(')', "InstreamAd(sdkSource=", str2)));
        sb.append(", sport=");
        String str3 = this.e;
        sb.append((Object) (str3 == null ? "null" : air.b(')', "SportAd(sportUrl=", str3)));
        sb.append(", overlay=");
        List<? extends d290> list = this.f;
        if (list != null) {
            str = "OverlayAd(banners=" + list + ')';
        }
        return tq.f(sb, str, ')');
    }
}
