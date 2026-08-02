package xsna;

/* compiled from: DialogThemeModel.kt */
/* loaded from: classes2.dex */
public final class xkm {
    public final String a;
    public final long b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;

    public xkm(int i, long j, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkm)) {
            return false;
        }
        xkm xkmVar = (xkm) obj;
        return epx.f(this.a, xkmVar.a) && this.b == xkmVar.b && this.c == xkmVar.c && epx.f(this.d, xkmVar.d) && epx.f(this.e, xkmVar.e) && this.f == xkmVar.f;
    }

    public final int hashCode() {
        int a = shy.a(this.c, bh10.a(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogThemeModel(id=");
        sb.append(this.a);
        sb.append(", updateTimeMs=");
        sb.append(this.b);
        sb.append(", sort=");
        sb.append(this.c);
        sb.append(", appearanceId=");
        sb.append(this.d);
        sb.append(", backgroundId=");
        sb.append(this.e);
        sb.append(", isHidden=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
