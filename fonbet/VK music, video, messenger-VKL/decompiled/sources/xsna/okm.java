package xsna;

/* compiled from: DialogThemeData.kt */
/* loaded from: classes2.dex */
public final class okm {
    public final String a;
    public final long b;
    public final boolean c;
    public final int d;
    public final long e;
    public final String f;
    public final String g;

    public okm(int i, String str, String str2, String str3, long j, boolean z, long j2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = i;
        this.e = j2;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okm)) {
            return false;
        }
        okm okmVar = (okm) obj;
        return epx.f(this.a, okmVar.a) && this.b == okmVar.b && this.c == okmVar.c && this.d == okmVar.d && this.e == okmVar.e && epx.f(this.f, okmVar.f) && epx.f(this.g, okmVar.g);
    }

    public final int hashCode() {
        int a = bh10.a(shy.a(this.d, qoy.b(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        String str = this.f;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogThemeData(id=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        sb.append(", isHidden=");
        sb.append(this.c);
        sb.append(", sort=");
        sb.append(this.d);
        sb.append(", lastSyncTimeMs=");
        sb.append(this.e);
        sb.append(", appearanceId=");
        sb.append(this.f);
        sb.append(", backgroundId=");
        return ho8.a(sb, this.g, ')');
    }
}
