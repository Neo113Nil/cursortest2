package xsna;

/* compiled from: CommonDependencyForDiscoveryState.kt */
/* loaded from: classes7.dex */
public final class uig implements wny {
    public final kxj0 a;
    public final h4x b;

    public uig(kxj0 kxj0Var, h4x h4xVar) {
        this.a = kxj0Var;
        this.b = h4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uig)) {
            return false;
        }
        uig uigVar = (uig) obj;
        return epx.f(this.a, uigVar.a) && epx.f(this.b, uigVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonDependencyForDiscoveryState(containerSize=" + this.a + ", insets=" + this.b + ')';
    }
}
