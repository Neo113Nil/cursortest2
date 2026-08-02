package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: VideoGetAlbumsByVideoResult.kt */
/* loaded from: classes3.dex */
public final class fns0 {
    public final ArrayList a;
    public final List<Integer> b;
    public final int c;

    public fns0(int i, ArrayList arrayList, List list) {
        this.a = arrayList;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fns0)) {
            return false;
        }
        fns0 fns0Var = (fns0) obj;
        return this.a.equals(fns0Var.a) && epx.f(this.b, fns0Var.b) && this.c == fns0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetAlbumsByVideoResult(userAlbums=");
        sb.append(this.a);
        sb.append(", idsOfAlbumsContainingVideo=");
        sb.append(this.b);
        sb.append(", albumsPageSize=");
        return vu5.b(sb, this.c, ')');
    }
}
