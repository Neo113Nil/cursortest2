package xsna;

/* compiled from: VideoDiscoveryPrefetchItemsConfig.kt */
/* loaded from: classes7.dex */
public final class axc0 {
    public final int a;
    public final rfc b;
    public final int c;

    public axc0(int i, rfc rfcVar, int i2) {
        this.a = i;
        this.b = rfcVar;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axc0)) {
            return false;
        }
        axc0 axc0Var = (axc0) obj;
        return this.a == axc0Var.a && epx.f(this.b, axc0Var.b) && this.c == axc0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreInflateItemConfig(layoutId=");
        sb.append(this.a);
        sb.append(", prefetchedDelegateClass=");
        sb.append(this.b);
        sb.append(", count=");
        return vu5.b(sb, this.c, ')');
    }
}
