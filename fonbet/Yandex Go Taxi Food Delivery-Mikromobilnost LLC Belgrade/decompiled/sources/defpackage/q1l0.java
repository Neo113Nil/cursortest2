package defpackage;

/* loaded from: classes12.dex */
public final class q1l0 {
    public final rwc a;

    public q1l0(rwc rwcVar) {
        this.a = rwcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1l0) && this.a.equals(((q1l0) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + unr0.e(this.a.hashCode() * 31, 31, true);
    }

    public final String toString() {
        return "RouteControlsUiState(compassState=" + this.a + ", isMyLocationButtonVisible=true, isOverviewButtonVisible=false)";
    }
}
