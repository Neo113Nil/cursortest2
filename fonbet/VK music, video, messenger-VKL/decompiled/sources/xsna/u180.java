package xsna;

/* compiled from: OnBgSyncStateUpdateEvent.kt */
/* loaded from: classes.dex */
public final class u180 extends sxp {
    public final ixv b;

    public u180(ixv ixvVar) {
        this.b = ixvVar;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u180) && epx.f(this.b, ((u180) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OnBgSyncStateUpdateEvent(bgSyncStatus=" + this.b + ')';
    }
}
