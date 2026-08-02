package xsna;

import one.video.statistics.ContentType;

/* compiled from: AnalyticsConfig.kt */
/* loaded from: classes3.dex */
public final class dk80 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final ContentType g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final long l;
    public final int m;

    public dk80(boolean z, boolean z2, boolean z3, String str, String str2, String str3, ContentType contentType, String str4, String str5, String str6, int i, long j, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = contentType;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = i;
        this.l = j;
        this.m = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk80)) {
            return false;
        }
        dk80 dk80Var = (dk80) obj;
        return this.a == dk80Var.a && this.b == dk80Var.b && this.c == dk80Var.c && epx.f(this.d, dk80Var.d) && epx.f(this.e, dk80Var.e) && epx.f(this.f, dk80Var.f) && this.g == dk80Var.g && epx.f(this.h, dk80Var.h) && epx.f(this.i, dk80Var.i) && epx.f(this.j, dk80Var.j) && this.k == dk80Var.k && this.l == dk80Var.l && this.m == dk80Var.m;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int a = urd0.a((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        ContentType contentType = this.g;
        int hashCode2 = (hashCode + (contentType == null ? 0 : contentType.hashCode())) * 31;
        String str3 = this.h;
        int a2 = urd0.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i);
        String str4 = this.j;
        return Integer.hashCode(this.m) + bh10.a(shy.a(this.k, (a2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneVideoAnalyticsConfig(isHeartBeatEnabled=");
        sb.append(this.a);
        sb.append(", isAutoPlay=");
        sb.append(this.b);
        sb.append(", isLive=");
        sb.append(this.c);
        sb.append(", cdnHost=");
        sb.append(this.d);
        sb.append(", videoUrlContentType=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", contentType=");
        sb.append(this.g);
        sb.append(", place=");
        sb.append(this.h);
        sb.append(", sessionId=");
        sb.append(this.i);
        sb.append(", ovid=");
        sb.append(this.j);
        sb.append(", videoId=");
        sb.append(this.k);
        sb.append(", ownerId=");
        sb.append(this.l);
        sb.append(", type=");
        return vu5.b(sb, this.m, ')');
    }
}
