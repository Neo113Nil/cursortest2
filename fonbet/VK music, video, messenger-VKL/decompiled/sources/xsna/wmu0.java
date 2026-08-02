package xsna;

/* compiled from: VkConnectRemoteConfig.kt */
/* loaded from: classes6.dex */
public final class wmu0 {
    public final String a;
    public final String b;
    public final String c;

    public wmu0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmu0)) {
            return false;
        }
        wmu0 wmu0Var = (wmu0) obj;
        return epx.f(this.a, wmu0Var.a) && epx.f(this.b, wmu0Var.b) && epx.f(this.c, wmu0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkConnectRemoteConfig(externalAuthUrlTemplate=");
        sb.append(this.a);
        sb.append(", eduAuthUrl=");
        sb.append(this.b);
        sb.append(", eduRegUrl=");
        return ho8.a(sb, this.c, ')');
    }
}
