package xsna;

/* compiled from: ReefImagesLoadMetrics.kt */
/* loaded from: classes5.dex */
public final class qnf0 {
    public final String a;
    public final int b;
    public final int c;
    public final Integer d;
    public final Integer e;
    public final int f;
    public final int g;
    public final String h;
    public final Integer i;
    public final String j;
    public final String k;
    public final String l;
    public final Integer m;

    public qnf0(String str, int i, int i2, Integer num, Integer num2, int i3, int i4, String str2, Integer num3, String str3, String str4, String str5, Integer num4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = num;
        this.e = num2;
        this.f = i3;
        this.g = i4;
        this.h = str2;
        this.i = num3;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnf0)) {
            return false;
        }
        qnf0 qnf0Var = (qnf0) obj;
        return epx.f(this.a, qnf0Var.a) && this.b == qnf0Var.b && this.c == qnf0Var.c && epx.f(this.d, qnf0Var.d) && epx.f(this.e, qnf0Var.e) && this.f == qnf0Var.f && this.g == qnf0Var.g && epx.f(this.h, qnf0Var.h) && epx.f(this.i, qnf0Var.i) && epx.f(this.j, qnf0Var.j) && epx.f(this.k, qnf0Var.k) && epx.f(this.l, qnf0Var.l) && epx.f(this.m, qnf0Var.m);
    }

    public final int hashCode() {
        int a = shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.d;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int a2 = shy.a(this.g, shy.a(this.f, (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31);
        String str = this.h;
        int hashCode2 = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.i;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.j;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.m;
        return hashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder b = xy6.b(this.b, "ReefImagesLoadMetrics(eventSource=", this.a, ", imageSizeBytes=", ", imageSizePixels=");
        b.append(this.c);
        b.append(", imageAppearingTime=");
        b.append(this.d);
        b.append(", imageProcessingTime=");
        b.append(this.e);
        b.append(", responseTtfb=");
        b.append(this.f);
        b.append(", responseTime=");
        jax0.a(this.g, ", status=", this.h, ", imageWidthPixels=", b);
        mq.b(this.i, ", imageFormat=", this.j, ", protocol=", b);
        n6j.b(b, this.k, ", httpRequestHost=", this.l, ", httpResponseCode=");
        return oq.b(b, this.m, ")");
    }
}
