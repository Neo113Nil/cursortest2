package xsna;

import java.util.ArrayList;

/* compiled from: LiveLikesItem.kt */
/* loaded from: classes3.dex */
public final class rjz implements hfz {
    public final ArrayList b;
    public final int c;
    public final ArrayList d;

    public rjz(int i, ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = i;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjz)) {
            return false;
        }
        rjz rjzVar = (rjz) obj;
        return this.b.equals(rjzVar.b) && this.c == rjzVar.c && this.d.equals(rjzVar.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveLikesItem(avatars=");
        sb.append(this.b);
        sb.append(", likesCount=");
        sb.append(this.c);
        sb.append(", friendNames=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
    }
}
