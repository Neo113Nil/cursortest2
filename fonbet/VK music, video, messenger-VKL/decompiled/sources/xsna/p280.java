package xsna;

/* compiled from: OnChannelReactionMappingsUpdatedEvent.kt */
/* loaded from: classes2.dex */
public final class p280 extends sxp {
    public final String b = "xsna.zab";

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p280) && epx.f(this.b, ((p280) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return tq.f(new StringBuilder("OnChannelReactionMappingsUpdatedEvent(changerTag="), this.b, ')');
    }
}
