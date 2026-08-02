package xsna;

/* compiled from: AsrRecordFeatureAction.kt */
/* loaded from: classes7.dex */
public final class wv3 implements pv3 {
    public final mew0 a;

    public wv3(mew0 mew0Var) {
        this.a = mew0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wv3) && epx.f(this.a, ((wv3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(asrInfo=" + this.a + ')';
    }
}
