package xsna;

/* compiled from: Error.kt */
/* loaded from: classes5.dex */
public final class vup {
    public final Throwable a;

    public vup(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vup) && epx.f(this.a, ((vup) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
    }
}
