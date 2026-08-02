package xsna;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class hs4 extends wof0 {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;

    public hs4(long j, long j2, int i, String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = str;
        this.e = num;
        this.f = num2;
        this.g = num3;
        this.h = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs4)) {
            return false;
        }
        hs4 hs4Var = (hs4) obj;
        return this.a == hs4Var.a && this.b == hs4Var.b && this.c == hs4Var.c && epx.f(this.d, hs4Var.d) && epx.f(this.e, hs4Var.e) && epx.f(this.f, hs4Var.f) && epx.f(this.g, hs4Var.g) && epx.f(this.h, hs4Var.h);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.c, bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder b = fp.b(this.a, "AudioPlaybackState(ownerId=", ", audioId=");
        b.append(this.b);
        b.append(", fragmentId=");
        b.append(this.c);
        b.append(", sessionIdentifier=");
        b.append(this.d);
        b.append(", responseTtfb=");
        b.append(this.e);
        b.append(", responseTtff=");
        b.append(this.f);
        b.append(", bufferingTime=");
        b.append(this.g);
        b.append(", fragmentDuration=");
        b.append(this.h);
        b.append(")");
        return b.toString();
    }
}
