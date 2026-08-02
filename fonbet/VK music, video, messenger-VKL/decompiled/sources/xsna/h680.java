package xsna;

/* compiled from: OnGiftStickersReceiveEvent.kt */
/* loaded from: classes2.dex */
public final class h680 extends sxp {
    public final Object b;

    public h680() {
        this(null);
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h680) && epx.f(this.b, ((h680) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("OnGiftStickersReceiveEvent(changerTag="), this.b, ')');
    }

    public h680(Object obj) {
        this.b = obj;
    }
}
