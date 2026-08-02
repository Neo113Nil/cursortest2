package xsna;

/* compiled from: ReefWifiNetworkInfo.kt */
/* loaded from: classes5.dex */
public final class zof0 {
    public final boolean a;
    public final Float b;
    public final Integer c;
    public final String d;
    public final Integer e;

    public zof0(boolean z, Float f, Integer num, String str, Integer num2) {
        this.a = z;
        this.b = f;
        this.c = num;
        this.d = str;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zof0)) {
            return false;
        }
        zof0 zof0Var = (zof0) obj;
        return this.a == zof0Var.a && epx.f(this.b, zof0Var.b) && epx.f(this.c, zof0Var.c) && epx.f(this.d, zof0Var.d) && epx.f(this.e, zof0Var.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Float f = this.b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReefWifiNetworkInfo(isConnected=");
        sb.append(this.a);
        sb.append(", signalLevel=");
        sb.append(this.b);
        sb.append(", level=");
        mq.b(this.c, ", bbsid=", this.d, ", freq=", sb);
        return oq.b(sb, this.e, ")");
    }
}
