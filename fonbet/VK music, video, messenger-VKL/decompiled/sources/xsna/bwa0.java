package xsna;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class bwa0 extends wof0 {
    public final int a;
    public final String b;

    public bwa0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwa0)) {
            return false;
        }
        bwa0 bwa0Var = (bwa0) obj;
        return this.a == bwa0Var.a && epx.f(this.b, bwa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return gq.b(this.a, "PlaybackErrorState(errorCode=", ", errorDescription=", this.b, ")");
    }
}
