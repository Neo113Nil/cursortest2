package xsna;

/* compiled from: VideoEvents.kt */
/* loaded from: classes14.dex */
public final class iwr0 extends bwr0 {
    public final int a;
    public final long b;

    public iwr0(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwr0)) {
            return false;
        }
        iwr0 iwr0Var = (iwr0) obj;
        return this.a == iwr0Var.a && this.b == iwr0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoActionAlbumSortChanged(albumId=");
        sb.append(this.a);
        sb.append(", albumOwnerId=");
        return vu5.a(')', this.b, sb);
    }
}
