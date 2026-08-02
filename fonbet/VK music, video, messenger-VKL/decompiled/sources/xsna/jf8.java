package xsna;

/* compiled from: BroadcastFinishInfo.kt */
/* loaded from: classes7.dex */
public final class jf8 {
    public final boolean a;
    public final whr0 b;

    public jf8(boolean z, whr0 whr0Var) {
        this.a = z;
        this.b = whr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf8)) {
            return false;
        }
        jf8 jf8Var = (jf8) obj;
        return this.a == jf8Var.a && epx.f(this.b, jf8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BroadcastFinishInfo(isRecord=" + this.a + ", finishedBy=" + this.b + ')';
    }
}
