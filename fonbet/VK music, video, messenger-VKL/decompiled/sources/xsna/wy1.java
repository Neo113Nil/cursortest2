package xsna;

/* compiled from: Anchor.kt */
/* loaded from: classes2.dex */
public final class wy1 {
    public final x7w a;
    public final x7w b;

    public wy1(x7w x7wVar, x7w x7wVar2) {
        this.a = x7wVar;
        this.b = x7wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy1)) {
            return false;
        }
        wy1 wy1Var = (wy1) obj;
        return epx.f(this.a, wy1Var.a) && epx.f(this.b, wy1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Anchor(dialogsWeight=" + this.a + ", channelsWeight=" + this.b + ')';
    }
}
