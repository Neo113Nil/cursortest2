package xsna;

/* compiled from: CommunityChecklistBannerData.kt */
/* loaded from: classes18.dex */
public final class zwg {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public zwg(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwg)) {
            return false;
        }
        zwg zwgVar = (zwg) obj;
        return this.a == zwgVar.a && this.b == zwgVar.b && epx.f(this.c, zwgVar.c) && epx.f(this.d, zwgVar.d);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityChecklistBannerData(tipsTotal=");
        sb.append(this.a);
        sb.append(", tipsCompleted=");
        sb.append(this.b);
        sb.append(", imageOnLight=");
        sb.append(this.c);
        sb.append(", imageOnDark=");
        return ho8.a(sb, this.d, ')');
    }
}
