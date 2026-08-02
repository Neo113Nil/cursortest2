package xsna;

/* compiled from: FriendsAndFollowersListViewItem.kt */
/* loaded from: classes15.dex */
public final class kks implements hfz {
    public final Throwable b;

    public kks(Throwable th) {
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kks) && epx.f(this.b, ((kks) obj).b);
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
