package xsna;

import com.vk.core.apps.BuildInfo;

/* compiled from: ThumbHashConfig.kt */
/* loaded from: classes11.dex */
public final class iso0 {
    public static final a i = new a();
    public static final iso0 j = new iso0(null, false, false, false, false, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;

    /* compiled from: ThumbHashConfig.kt */
    public static final class a {
    }

    public iso0(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = str;
    }

    public final boolean a() {
        return this.a || this.b || this.c || this.d || this.e || this.f || this.g;
    }

    public final String b(String str, boolean z) {
        String str2;
        if (!z) {
            return null;
        }
        if (BuildInfo.h() && (str2 = this.h) != null && !drm0.N(str2)) {
            return str2;
        }
        if (str == null || drm0.N(str)) {
            return null;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iso0)) {
            return false;
        }
        iso0 iso0Var = (iso0) obj;
        return this.a == iso0Var.a && this.b == iso0Var.b && this.c == iso0Var.c && this.d == iso0Var.d && this.e == iso0Var.e && this.f == iso0Var.f && this.g == iso0Var.g && epx.f(this.h, iso0Var.h);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThumbHashConfig(isEnabledInNewsfeed=");
        sb.append(this.a);
        sb.append(", isEnabledInDiscover=");
        sb.append(this.b);
        sb.append(", isEnabledInStories=");
        sb.append(this.c);
        sb.append(", isEnabledInProfileAndCommunity=");
        sb.append(this.d);
        sb.append(", isEnabledInMessenger=");
        sb.append(this.e);
        sb.append(", isEnabledInMarket=");
        sb.append(this.f);
        sb.append(", isEnabledInOtherPlaces=");
        sb.append(this.g);
        sb.append(", testThumbHash=");
        return ho8.a(sb, this.h, ')');
    }
}
