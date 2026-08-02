package xsna;

/* compiled from: VideoStreamTarget.kt */
/* loaded from: classes18.dex */
public final class sit0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public sit0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sit0)) {
            return false;
        }
        sit0 sit0Var = (sit0) obj;
        return epx.f(this.a, sit0Var.a) && epx.f(this.b, sit0Var.b) && epx.f(this.c, sit0Var.c) && epx.f(this.d, sit0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoStreamTarget(liveOvId=");
        sb.append(this.a);
        sb.append(", rtmpUrl=");
        sb.append(this.b);
        sb.append(", okmpUrl=");
        sb.append(this.c);
        sb.append(", key=");
        return ho8.a(sb, this.d, ')');
    }
}
