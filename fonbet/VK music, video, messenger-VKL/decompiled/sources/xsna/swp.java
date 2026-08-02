package xsna;

/* compiled from: SwitchCatalogVhState.kt */
/* loaded from: classes16.dex */
public final class swp extends bnn0 {
    public final Throwable a;

    public swp(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swp) && epx.f(this.a, ((swp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qjg.a(this) + ' ' + this.a;
    }
}
