package xsna;

/* compiled from: InviteLink.kt */
/* loaded from: classes2.dex */
public final class msx {
    public final String a;
    public final String b;
    public final boolean c;

    public msx(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msx)) {
            return false;
        }
        msx msxVar = (msx) obj;
        return epx.f(this.a, msxVar.a) && epx.f(this.b, msxVar.b) && this.c == msxVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InviteLink(title=");
        sb.append(this.a);
        sb.append(", link=");
        sb.append(this.b);
        sb.append(", isChannel=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
