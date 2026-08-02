package xsna;

/* compiled from: CommonDependencyForMinimizableState.kt */
/* loaded from: classes7.dex */
public final class yig implements wny {
    public final kxj0 a;
    public final h4x b;
    public final int c;

    public yig(kxj0 kxj0Var, h4x h4xVar, int i) {
        this.a = kxj0Var;
        this.b = h4xVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yig)) {
            return false;
        }
        yig yigVar = (yig) obj;
        return epx.f(this.a, yigVar.a) && epx.f(this.b, yigVar.b) && this.c == yigVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + shy.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonDependencyForMinimizableState(containerSize=");
        sb.append(this.a);
        sb.append(", insets=");
        sb.append(this.b);
        sb.append(", miniplayerHeight=");
        return h5s.c(this.c, ", bottomNavHeight=0)", sb);
    }
}
