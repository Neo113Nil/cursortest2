package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityReviewDeletedItem.kt */
/* loaded from: classes18.dex */
public final class lxh implements hfz {
    public final int b;
    public final String c;
    public final UserId d;
    public final boolean e;

    public lxh(int i, UserId userId, String str, boolean z) {
        this.b = i;
        this.c = str;
        this.d = userId;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxh)) {
            return false;
        }
        lxh lxhVar = (lxh) obj;
        return this.b == lxhVar.b && epx.f(this.c, lxhVar.c) && epx.f(this.d, lxhVar.d) && this.e == lxhVar.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + bh10.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReviewDeletedItem(id=");
        sb.append(this.b);
        sb.append(", authorImg=");
        sb.append(this.c);
        sb.append(", userId=");
        sb.append(this.d);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
