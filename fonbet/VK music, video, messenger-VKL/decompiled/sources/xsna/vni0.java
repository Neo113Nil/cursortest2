package xsna;

/* compiled from: ServerUpdateInfo.kt */
/* loaded from: classes6.dex */
public final class vni0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;

    public vni0(String str, int i, String str2, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vni0)) {
            return false;
        }
        vni0 vni0Var = (vni0) obj;
        return epx.f(this.a, vni0Var.a) && this.b == vni0Var.b && epx.f(this.c, vni0Var.c) && epx.f(this.d, vni0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerUpdateInfo(versionName=");
        sb.append(this.a);
        sb.append(", versionCode=");
        sb.append(this.b);
        sb.append(", path=");
        sb.append(this.c);
        sb.append(", sha512Hash=");
        return ho8.a(sb, this.d, ')');
    }
}
