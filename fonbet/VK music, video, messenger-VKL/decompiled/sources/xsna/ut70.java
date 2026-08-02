package xsna;

/* compiled from: OfflineDownloadDebugInfo.kt */
/* loaded from: classes3.dex */
public final class ut70 {
    public final Integer a;
    public final Integer b;
    public final Long c;
    public final Float d;
    public final Long e;
    public final String f;
    public final String g;

    public ut70(Integer num, Integer num2, Long l, Float f, Long l2, String str, String str2) {
        this.a = num;
        this.b = num2;
        this.c = l;
        this.d = f;
        this.e = l2;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut70)) {
            return false;
        }
        ut70 ut70Var = (ut70) obj;
        return epx.f(this.a, ut70Var.a) && epx.f(this.b, ut70Var.b) && epx.f(this.c, ut70Var.c) && epx.f(this.d, ut70Var.d) && epx.f(this.e, ut70Var.e) && epx.f(this.f, ut70Var.f) && epx.f(this.g, ut70Var.g);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Float f = this.d;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Long l2 = this.e;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineDownloadDebugInfo(state=");
        sb.append(this.a);
        sb.append(", failureReason=");
        sb.append(this.b);
        sb.append(", bytesDownloaded=");
        sb.append(this.c);
        sb.append(", percentDownloaded=");
        sb.append(this.d);
        sb.append(", contentLength=");
        sb.append(this.e);
        sb.append(", requestUri=");
        sb.append(this.f);
        sb.append(", segmentKey=");
        return ho8.a(sb, this.g, ')');
    }
}
