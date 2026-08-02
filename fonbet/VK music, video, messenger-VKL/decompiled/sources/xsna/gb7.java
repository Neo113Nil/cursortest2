package xsna;

/* compiled from: BirthdaysListViewItem.kt */
/* loaded from: classes15.dex */
public final class gb7 implements hfz {
    public final Throwable b;

    public gb7(Throwable th) {
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb7) && epx.f(this.b, ((gb7) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("PageLoadingError(throwable="), this.b, ')');
    }
}
