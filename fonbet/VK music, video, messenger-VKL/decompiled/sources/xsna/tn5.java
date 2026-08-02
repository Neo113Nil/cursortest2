package xsna;

import xsna.zhk0;

/* compiled from: AutoValue_SpanLimits_SpanLimitsValue.java */
/* loaded from: classes11.dex */
public final class tn5 extends zhk0.a {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public tn5(int i, int i2, int i3, int i4, int i5, int i6) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    @Override // xsna.zhk0.a, xsna.zhk0
    public final int a() {
        return this.g;
    }

    @Override // xsna.zhk0
    public final int b() {
        return this.b;
    }

    @Override // xsna.zhk0
    public final int c() {
        return this.e;
    }

    @Override // xsna.zhk0
    public final int d() {
        return this.f;
    }

    @Override // xsna.zhk0
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zhk0.a)) {
            return false;
        }
        zhk0.a aVar = (zhk0.a) obj;
        return this.b == aVar.b() && this.c == aVar.e() && this.d == aVar.f() && this.e == aVar.c() && this.f == aVar.d() && this.g == aVar.a();
    }

    @Override // xsna.zhk0
    public final int f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanLimitsValue{maxNumberOfAttributes=");
        sb.append(this.b);
        sb.append(", maxNumberOfEvents=");
        sb.append(this.c);
        sb.append(", maxNumberOfLinks=");
        sb.append(this.d);
        sb.append(", maxNumberOfAttributesPerEvent=");
        sb.append(this.e);
        sb.append(", maxNumberOfAttributesPerLink=");
        sb.append(this.f);
        sb.append(", maxAttributeValueLength=");
        return h5s.c(this.g, "}", sb);
    }
}
