package xsna;

/* compiled from: FriendsCleanupListViewItem.kt */
/* loaded from: classes15.dex */
public final class bns implements hfz {
    public final String b;

    public bns(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bns) && epx.f(this.b, ((bns) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("DescriptionHeader(description="), this.b, ')');
    }
}
