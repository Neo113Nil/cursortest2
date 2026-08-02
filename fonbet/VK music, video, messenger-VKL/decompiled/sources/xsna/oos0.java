package xsna;

/* compiled from: VideoGrowthListingFeatureConfig.kt */
/* loaded from: classes11.dex */
public final class oos0 {
    public static final a k = new a();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;

    /* compiled from: VideoGrowthListingFeatureConfig.kt */
    public static final class a {
    }

    public oos0(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oos0)) {
            return false;
        }
        oos0 oos0Var = (oos0) obj;
        return epx.f(this.a, oos0Var.a) && this.b == oos0Var.b && this.c == oos0Var.c && this.d == oos0Var.d && epx.f(this.e, oos0Var.e) && epx.f(this.f, oos0Var.f) && epx.f(this.g, oos0Var.g) && epx.f(this.h, oos0Var.h) && epx.f(this.i, oos0Var.i) && this.j == oos0Var.j;
    }

    public final int hashCode() {
        int a2 = urd0.a(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return Boolean.hashCode(this.j) + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGrowthListingFeatureConfig(textTitle=");
        sb.append(this.a);
        sb.append(", openDiscoveryScenario=");
        sb.append(this.b);
        sb.append(", hardVariant=");
        sb.append(this.c);
        sb.append(", showOpenSAAPopup=");
        sb.append(this.d);
        sb.append(", link=");
        sb.append(this.e);
        sb.append(", huaweiLink=");
        sb.append(this.f);
        sb.append(", rustoreLink=");
        sb.append(this.g);
        sb.append(", samsungLink=");
        sb.append(this.h);
        sb.append(", xiaomiLink=");
        sb.append(this.i);
        sb.append(", testMode=");
        return defpackage.q0.a(sb, this.j, ')');
    }
}
