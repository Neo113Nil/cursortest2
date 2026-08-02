package xsna;

/* compiled from: CommunityEventDateItemModel.kt */
/* loaded from: classes5.dex */
public final class j2h extends s4h {
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public j2h(int i, int i2, String str, String str2, String str3) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2h)) {
            return false;
        }
        j2h j2hVar = (j2h) obj;
        return this.b == j2hVar.b && this.c == j2hVar.c && epx.f(this.d, j2hVar.d) && epx.f(this.e, j2hVar.e) && epx.f(this.f, j2hVar.f);
    }

    public final int hashCode() {
        int a = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityEventDateItemModel(eventStartTime=");
        sb.append(this.b);
        sb.append(", eventEndTime=");
        sb.append(this.c);
        sb.append(", fullName=");
        sb.append(this.d);
        sb.append(", place=");
        sb.append(this.e);
        sb.append(", about=");
        return ho8.a(sb, this.f, ')');
    }
}
