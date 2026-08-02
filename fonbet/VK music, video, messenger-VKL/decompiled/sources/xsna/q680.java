package xsna;

/* compiled from: OnImItemCacheInvalidateEvent.kt */
/* loaded from: classes2.dex */
public final class q680 extends sxp {
    public final Object b;

    public q680(Object obj) {
        this.b = obj;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q680) && epx.f(this.b, ((q680) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("OnImItemCacheInvalidateEvent(changerTag="), this.b, ')');
    }
}
