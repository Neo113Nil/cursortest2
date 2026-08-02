package xsna;

import java.util.ArrayList;

/* compiled from: PagedPlaylistsData.kt */
/* loaded from: classes4.dex */
public final class sa90 {
    public final int a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public sa90(ArrayList arrayList, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa90)) {
            return false;
        }
        sa90 sa90Var = (sa90) obj;
        return this.a == sa90Var.a && this.b == sa90Var.b && this.c == sa90Var.c && this.d.equals(sa90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagedPlaylistsData(offset=");
        sb.append(this.a);
        sb.append(", nextOffset=");
        sb.append(this.b);
        sb.append(", totalCount=");
        sb.append(this.c);
        sb.append(", playlists=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
    }
}
