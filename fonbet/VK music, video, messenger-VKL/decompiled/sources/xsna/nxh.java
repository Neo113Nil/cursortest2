package xsna;

import java.util.ArrayList;

/* compiled from: CommunityReviewFriendsCountItem.kt */
/* loaded from: classes18.dex */
public final class nxh implements hfz {
    public final int b;
    public final ArrayList c;
    public final boolean d;

    public nxh(ArrayList arrayList, int i, boolean z) {
        this.b = i;
        this.c = arrayList;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxh)) {
            return false;
        }
        nxh nxhVar = (nxh) obj;
        return this.b == nxhVar.b && this.c.equals(nxhVar.c) && this.d == nxhVar.d;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qr.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReviewFriendsCountItem(total=");
        sb.append(this.b);
        sb.append(", avatars=");
        sb.append(this.c);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
