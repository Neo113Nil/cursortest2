package xsna;

/* compiled from: VideoPickerViewState.kt */
/* loaded from: classes4.dex */
public final class fwp {
    public final Throwable a;

    public fwp(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwp) && epx.f(this.a, ((fwp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("ErrorLoading(throwable="), this.a, ')');
    }
}
