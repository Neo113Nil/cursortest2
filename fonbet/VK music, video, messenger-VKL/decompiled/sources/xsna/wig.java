package xsna;

/* compiled from: CommonDependencyForFullscreenState.kt */
/* loaded from: classes7.dex */
public final class wig implements wny {
    public final kxj0 a;
    public final int b;

    public wig(kxj0 kxj0Var, int i) {
        this.a = kxj0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wig)) {
            return false;
        }
        wig wigVar = (wig) obj;
        return epx.f(this.a, wigVar.a) && this.b == wigVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonDependencyForFullscreenState(containerSize=");
        sb.append(this.a);
        sb.append(", dialogContainerWidth=");
        return vu5.b(sb, this.b, ')');
    }
}
