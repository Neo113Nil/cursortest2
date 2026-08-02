package xsna;

/* compiled from: VideoTextureState.kt */
/* loaded from: classes17.dex */
public final class qjt0 {
    public final rlh0 a;
    public final rlh0 b;

    public qjt0(rlh0 rlh0Var, rlh0 rlh0Var2) {
        this.a = rlh0Var;
        this.b = rlh0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjt0)) {
            return false;
        }
        qjt0 qjt0Var = (qjt0) obj;
        return epx.f(this.a, qjt0Var.a) && epx.f(this.b, qjt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoTextureState(clipVideoSize=" + this.a + ", playerVideoSize=" + this.b + ')';
    }
}
