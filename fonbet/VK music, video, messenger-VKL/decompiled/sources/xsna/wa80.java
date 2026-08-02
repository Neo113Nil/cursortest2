package xsna;

/* compiled from: OnResetCountersTooltipConfigUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class wa80 extends sxp {
    public final boolean b;

    public wa80(boolean z) {
        this.b = z;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa80) && this.b == ((wa80) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) * 31;
    }

    public final String toString() {
        return n23.b(new StringBuilder("OnResetCountersTooltipConfigUpdateEvent(enabled="), this.b, ", changerTag=null)");
    }
}
