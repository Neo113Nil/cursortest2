package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemReviewItem.kt */
/* loaded from: classes18.dex */
public final class h210 implements hfz {
    public final int b;
    public final long c;
    public final UserId d;
    public final String e;
    public final vhg0 f;
    public final ugg0 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;

    public h210(int i, long j, UserId userId, String str, vhg0 vhg0Var, ugg0 ugg0Var, boolean z, boolean z2, boolean z3, int i2, boolean z4, boolean z5) {
        this.b = i;
        this.c = j;
        this.d = userId;
        this.e = str;
        this.f = vhg0Var;
        this.g = ugg0Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = i2;
        this.l = z4;
        this.m = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h210)) {
            return false;
        }
        h210 h210Var = (h210) obj;
        return this.b == h210Var.b && this.c == h210Var.c && epx.f(this.d, h210Var.d) && epx.f(this.e, h210Var.e) && epx.f(this.f, h210Var.f) && epx.f(this.g, h210Var.g) && this.h == h210Var.h && this.i == h210Var.i && this.j == h210Var.j && this.k == h210Var.k && this.l == h210Var.l && this.m == h210Var.m;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d.b);
        String str = this.e;
        return Boolean.hashCode(this.m) + qoy.b(shy.a(this.k, qoy.b(qoy.b(qoy.b((this.g.hashCode() + ((this.f.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewItem(id=");
        sb.append(this.b);
        sb.append(", itemId=");
        sb.append(this.c);
        sb.append(", userId=");
        sb.append(this.d);
        sb.append(", authorImg=");
        sb.append(this.e);
        sb.append(", headerData=");
        sb.append(this.f);
        sb.append(", bodyData=");
        sb.append(this.g);
        sb.append(", canUpdate=");
        sb.append(this.h);
        sb.append(", canDelete=");
        sb.append(this.i);
        sb.append(", canReply=");
        sb.append(this.j);
        sb.append(", reviewsCount=");
        sb.append(this.k);
        sb.append(", isEnabled=");
        sb.append(this.l);
        sb.append(", isPartnerIntegrationType=");
        return defpackage.q0.a(sb, this.m, ')');
    }
}
