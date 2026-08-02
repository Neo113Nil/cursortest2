package xsna;

/* compiled from: PastBroadcastsListViewItem.kt */
/* loaded from: classes7.dex */
public final class fo90 implements hfz {
    public final String b;

    public fo90(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fo90) && epx.f(this.b, ((fo90) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Date(date="), this.b, ')');
    }
}
