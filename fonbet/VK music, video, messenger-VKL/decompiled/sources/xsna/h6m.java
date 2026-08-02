package xsna;

/* compiled from: QrInfoResponse.kt */
/* loaded from: classes6.dex */
public final class h6m {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public h6m(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6m)) {
            return false;
        }
        h6m h6mVar = (h6m) obj;
        return epx.f(this.a, h6mVar.a) && epx.f(this.b, h6mVar.b) && epx.f(this.c, h6mVar.c) && epx.f(this.d, h6mVar.d) && epx.f(this.e, h6mVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfo(deviceName=");
        sb.append(this.a);
        sb.append(", deviceIp=");
        sb.append(this.b);
        sb.append(", deviceLocation=");
        sb.append(this.c);
        sb.append(", deviceLocationMapUrl=");
        sb.append(this.d);
        sb.append(", browserName=");
        return ho8.a(sb, this.e, ')');
    }
}
