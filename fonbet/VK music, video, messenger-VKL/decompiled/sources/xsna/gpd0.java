package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;

/* compiled from: OrderListItem.kt */
/* loaded from: classes18.dex */
public final class gpd0 extends jv80 {
    public final y8l b;
    public final String c;
    public final long d;
    public final UserId e;
    public final Image f;
    public final String g;
    public final String h;
    public final int i;
    public final String j;
    public final boolean k;
    public final boolean l;

    public gpd0(y8l y8lVar, String str, long j, UserId userId, Image image, String str2, String str3, int i, String str4, boolean z, boolean z2) {
        super(str);
        this.b = y8lVar;
        this.c = str;
        this.d = j;
        this.e = userId;
        this.f = image;
        this.g = str2;
        this.h = str3;
        this.i = i;
        this.j = str4;
        this.k = z;
        this.l = z2;
    }

    @Override // xsna.jv80
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpd0)) {
            return false;
        }
        gpd0 gpd0Var = (gpd0) obj;
        return epx.f(this.b, gpd0Var.b) && epx.f(this.c, gpd0Var.c) && this.d == gpd0Var.d && epx.f(this.e, gpd0Var.e) && epx.f(this.f, gpd0Var.f) && epx.f(this.g, gpd0Var.g) && epx.f(this.h, gpd0Var.h) && this.i == gpd0Var.i && epx.f(this.j, gpd0Var.j) && this.k == gpd0Var.k && this.l == gpd0Var.l;
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e.b);
        Image image = this.f;
        int a2 = urd0.a((a + (image == null ? 0 : image.hashCode())) * 31, 31, this.g);
        String str = this.h;
        return Boolean.hashCode(this.l) + qoy.b(urd0.a(shy.a(this.i, (a2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductItem(decorationType=");
        sb.append(this.b);
        sb.append(", key=");
        sb.append(this.c);
        sb.append(", productId=");
        sb.append(this.d);
        sb.append(", groupId=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", properties=");
        sb.append(this.h);
        sb.append(", amount=");
        sb.append(this.i);
        sb.append(", price=");
        sb.append(this.j);
        sb.append(", canReview=");
        sb.append(this.k);
        sb.append(", isLast=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
