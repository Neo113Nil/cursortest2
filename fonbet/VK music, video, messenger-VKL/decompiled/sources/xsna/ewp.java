package xsna;

/* compiled from: PickerUIModel.kt */
/* loaded from: classes5.dex */
public final class ewp {
    public final Throwable a;

    public ewp(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewp) && epx.f(this.a, ((ewp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("ErrorLoading(throwable="), this.a, ')');
    }
}
