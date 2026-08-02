package xsna;

/* compiled from: PastAsrListViewItem.kt */
/* loaded from: classes7.dex */
public final class nn90 implements hfz {
    public final Throwable b;

    public nn90(Throwable th) {
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn90) && epx.f(this.b, ((nn90) obj).b);
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
