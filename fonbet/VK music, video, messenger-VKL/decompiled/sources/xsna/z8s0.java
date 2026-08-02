package xsna;

/* compiled from: VideoCatalogCommands.kt */
/* loaded from: classes16.dex */
public final class z8s0 extends beq {
    public final lw3 a;

    public z8s0(lw3 lw3Var) {
        this.a = lw3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8s0) && epx.f(this.a, ((z8s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HorizontalScrollTo(condition=" + this.a + ')';
    }
}
