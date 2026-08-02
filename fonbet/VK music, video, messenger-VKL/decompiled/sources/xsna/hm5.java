package xsna;

import io.opentelemetry.sdk.common.internal.AttributesMap;

/* compiled from: AutoValue_ImmutableExceptionEventData.java */
/* loaded from: classes8.dex */
public final class hm5 extends iow {
    public final AttributesMap a;
    public final long b;
    public final int c;
    public final Throwable d;

    public hm5(AttributesMap attributesMap, long j, int i, Throwable th) {
        this.a = attributesMap;
        this.b = j;
        this.c = i;
        if (th == null) {
            throw new NullPointerException("Null exception");
        }
        this.d = th;
    }

    @Override // xsna.pyp
    public final int a() {
        return this.c;
    }

    @Override // xsna.pyp
    public final long b() {
        return this.b;
    }

    @Override // xsna.iow
    public final Throwable d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iow)) {
            return false;
        }
        iow iowVar = (iow) obj;
        hm5 hm5Var = (hm5) iowVar;
        return this.a.equals(hm5Var.a) && this.b == hm5Var.b && this.c == hm5Var.c && this.d.equals(iowVar.d());
    }

    @Override // xsna.pyp
    public final q94 getAttributes() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((hashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ImmutableExceptionEventData{attributes=" + this.a + ", epochNanos=" + this.b + ", totalAttributeCount=" + this.c + ", exception=" + this.d + "}";
    }
}
