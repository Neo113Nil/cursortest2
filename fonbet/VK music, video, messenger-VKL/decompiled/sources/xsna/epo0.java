package xsna;

/* compiled from: ThemeChooserComponent.kt */
/* loaded from: classes2.dex */
public final class epo0 {
    public final Throwable a;

    public epo0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epo0) && epx.f(this.a, ((epo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("SaveFailed(exception="), this.a, ')');
    }
}
