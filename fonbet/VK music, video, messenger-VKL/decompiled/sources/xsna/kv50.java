package xsna;

/* compiled from: YandexNativeAdLoaderImpl.kt */
/* loaded from: classes14.dex */
public final class kv50 {
    public final z4y0 a;
    public final Object b;

    public kv50(z4y0 z4y0Var, Object obj) {
        this.a = z4y0Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv50)) {
            return false;
        }
        kv50 kv50Var = (kv50) obj;
        return epx.f(this.a, kv50Var.a) && epx.f(this.b, kv50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeAdToLoader(ad=");
        sb.append(this.a);
        sb.append(", loader=");
        return k73.c(sb, this.b, ')');
    }
}
