package xsna;

/* compiled from: FastSeekViewState.kt */
/* loaded from: classes8.dex */
public final class wlq implements x0u0 {
    public static final wlq c = new wlq(false, false);
    public final boolean a;
    public final boolean b;

    public wlq(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlq)) {
            return false;
        }
        wlq wlqVar = (wlq) obj;
        return this.a == wlqVar.a && this.b == wlqVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return sni0.a("FastSeekViewState(isSeekForwardEnabled=", ", isSeekBackwardEnabled=", ")", this.a, this.b);
    }
}
