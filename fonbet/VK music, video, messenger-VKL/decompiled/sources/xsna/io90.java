package xsna;

/* compiled from: PastBroadcastsListViewItem.kt */
/* loaded from: classes7.dex */
public final class io90 implements hfz {
    public final Throwable b;

    public io90(Throwable th) {
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof io90) && epx.f(this.b, ((io90) obj).b);
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
