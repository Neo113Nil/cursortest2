package xsna;

/* compiled from: ScreenScrollComposeChecker.kt */
/* loaded from: classes3.dex */
public final class kgh0 {
    public final long a;
    public final nrb b;
    public final z9g c;
    public final nw90 d;

    public kgh0(long j, nrb nrbVar, z9g z9gVar, nw90 nw90Var) {
        this.a = j;
        this.b = nrbVar;
        this.c = z9gVar;
        this.d = nw90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgh0)) {
            return false;
        }
        kgh0 kgh0Var = (kgh0) obj;
        return this.a == kgh0Var.a && this.b.equals(kgh0Var.b) && this.c.equals(kgh0Var.c) && this.d.equals(kgh0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ScrollStoreOps(startDelayMs=" + this.a + ", getFrames=" + this.b + ", getFreeze=" + this.c + ", store=" + this.d + ')';
    }
}
