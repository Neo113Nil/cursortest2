package xsna;

/* compiled from: AsrRecordFeatureAction.kt */
/* loaded from: classes7.dex */
public final class qv3 implements pv3 {
    public final Throwable a;

    public qv3(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qv3) && epx.f(this.a, ((qv3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("Error(t="), this.a, ')');
    }
}
