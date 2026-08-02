package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityReviewItem.kt */
/* loaded from: classes18.dex */
public final class qxh implements hfz {
    public final int b;
    public final UserId c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final vhg0 g;
    public final ugg0 h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public qxh(int i, UserId userId, boolean z, boolean z2, String str, vhg0 vhg0Var, ugg0 ugg0Var, int i2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.b = i;
        this.c = userId;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = vhg0Var;
        this.h = ugg0Var;
        this.i = i2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxh)) {
            return false;
        }
        qxh qxhVar = (qxh) obj;
        return this.b == qxhVar.b && epx.f(this.c, qxhVar.c) && this.d == qxhVar.d && this.e == qxhVar.e && epx.f(this.f, qxhVar.f) && epx.f(this.g, qxhVar.g) && epx.f(this.h, qxhVar.h) && this.i == qxhVar.i && this.j == qxhVar.j && this.k == qxhVar.k && this.l == qxhVar.l && this.m == qxhVar.m;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.m) + qoy.b(qoy.b(qoy.b(shy.a(this.i, (this.h.hashCode() + ((this.g.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReviewItem(id=");
        sb.append(this.b);
        sb.append(", userId=");
        sb.append(this.c);
        sb.append(", canDelete=");
        sb.append(this.d);
        sb.append(", canUpdate=");
        sb.append(this.e);
        sb.append(", authorImg=");
        sb.append(this.f);
        sb.append(", headerData=");
        sb.append(this.g);
        sb.append(", bodyData=");
        sb.append(this.h);
        sb.append(", reviewsCount=");
        sb.append(this.i);
        sb.append(", isPinned=");
        sb.append(this.j);
        sb.append(", canPin=");
        sb.append(this.k);
        sb.append(", isEnabled=");
        sb.append(this.l);
        sb.append(", isHighlighted=");
        return defpackage.q0.a(sb, this.m, ')');
    }
}
