package xsna;

/* compiled from: AsrRecordFeatureAction.kt */
/* loaded from: classes7.dex */
public final class uv3 implements pv3 {
    public final Throwable a;

    public uv3(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uv3) && epx.f(this.a, ((uv3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("Error(t="), this.a, ')');
    }
}
