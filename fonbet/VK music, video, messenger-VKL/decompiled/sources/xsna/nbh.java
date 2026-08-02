package xsna;

/* compiled from: CommunityOnboardingBannerData.kt */
/* loaded from: classes17.dex */
public final class nbh {
    public final String a;
    public final String b;
    public final String c;

    public nbh(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbh)) {
            return false;
        }
        nbh nbhVar = (nbh) obj;
        return epx.f(this.a, nbhVar.a) && epx.f(this.b, nbhVar.b) && epx.f(this.c, nbhVar.c);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return (a + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityOnboardingBannerData(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", textButton=");
        return i5s.a(sb, this.c, ", imageUrl=null)");
    }
}
