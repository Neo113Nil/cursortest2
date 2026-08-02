package xsna;

/* compiled from: FriendsCleanupListViewItem.kt */
/* loaded from: classes15.dex */
public final class cns implements hfz {
    public final Throwable b;

    public cns(Throwable th) {
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cns) && epx.f(this.b, ((cns) obj).b);
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
