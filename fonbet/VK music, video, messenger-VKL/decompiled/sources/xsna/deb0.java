package xsna;

/* compiled from: PlaylistSeekPosition.kt */
/* loaded from: classes8.dex */
public final class deb0 {
    public static final deb0 d = new deb0(0, 0, null);
    public final int a;
    public final long b;
    public final Long c;

    public deb0(int i, long j, Long l) {
        this.a = i;
        this.b = j;
        this.c = l;
    }

    public final String toString() {
        StringBuilder b = jr.b(this.a, "itemIndex: ", ", position: ", this.b);
        b.append(" real: ");
        b.append(this.c);
        return b.toString();
    }
}
