package xsna;

/* compiled from: CommonContainerSizeDependency.kt */
/* loaded from: classes7.dex */
public final class oig implements wny {
    public final kxj0 a;

    public oig(kxj0 kxj0Var) {
        this.a = kxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oig) && epx.f(this.a, ((oig) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CommonContainerSizeDependency(containerSize=" + this.a + ')';
    }
}
