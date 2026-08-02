package xsna;

/* compiled from: OnChannelsCountUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class v280 extends sxp {
    public final Object b;

    public v280(Object obj) {
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
        return (obj instanceof v280) && epx.f(this.b, ((v280) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("OnChannelsCountUpdateEvent(changerTag="), this.b, ')');
    }
}
