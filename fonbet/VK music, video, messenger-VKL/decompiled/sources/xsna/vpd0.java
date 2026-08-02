package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.core.models.product.ProductItemBadge;
import com.vk.ecomm.core.models.product.ProductPrice;
import java.util.List;

/* compiled from: ProductListModel.kt */
/* loaded from: classes18.dex */
public final class vpd0 {
    public final long a;
    public final UserId b;
    public final boolean c;
    public final boolean d;
    public final ProductPrice e;
    public final String f;
    public final Image g;
    public final c530 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final jpd0 o;
    public final List<ProductItemBadge> p;
    public final String q;
    public final boolean r;
    public final String s;

    /* JADX WARN: Multi-variable type inference failed */
    public vpd0(long j, UserId userId, boolean z, boolean z2, ProductPrice productPrice, String str, Image image, c530 c530Var, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, jpd0 jpd0Var, List<? extends ProductItemBadge> list, String str3, boolean z8) {
        this.a = j;
        this.b = userId;
        this.c = z;
        this.d = z2;
        this.e = productPrice;
        this.f = str;
        this.g = image;
        this.h = c530Var;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = str2;
        this.o = jpd0Var;
        this.p = list;
        this.q = str3;
        this.r = z8;
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(j);
        this.s = sb.toString();
    }

    public static vpd0 a(vpd0 vpd0Var, boolean z, boolean z2, int i) {
        return new vpd0(vpd0Var.a, vpd0Var.b, vpd0Var.c, vpd0Var.d, vpd0Var.e, vpd0Var.f, vpd0Var.g, vpd0Var.h, (i & 256) != 0 ? vpd0Var.i : z, vpd0Var.j, vpd0Var.k, vpd0Var.l, vpd0Var.m, vpd0Var.n, vpd0Var.o, vpd0Var.p, vpd0Var.q, (i & 131072) != 0 ? vpd0Var.r : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpd0)) {
            return false;
        }
        vpd0 vpd0Var = (vpd0) obj;
        return this.a == vpd0Var.a && epx.f(this.b, vpd0Var.b) && this.c == vpd0Var.c && this.d == vpd0Var.d && epx.f(this.e, vpd0Var.e) && epx.f(this.f, vpd0Var.f) && epx.f(this.g, vpd0Var.g) && epx.f(this.h, vpd0Var.h) && this.i == vpd0Var.i && this.j == vpd0Var.j && this.k == vpd0Var.k && this.l == vpd0Var.l && this.m == vpd0Var.m && epx.f(this.n, vpd0Var.n) && epx.f(this.o, vpd0Var.o) && epx.f(this.p, vpd0Var.p) && epx.f(this.q, vpd0Var.q) && this.r == vpd0Var.r;
    }

    public final int hashCode() {
        int a = urd0.a((this.e.hashCode() + qoy.b(qoy.b(bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
        Image image = this.g;
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.h.hashCode() + ((a + (image == null ? 0 : image.hashCode())) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str = this.n;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        jpd0 jpd0Var = this.o;
        int hashCode2 = (hashCode + (jpd0Var == null ? 0 : jpd0Var.hashCode())) * 31;
        List<ProductItemBadge> list = this.p;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.q;
        return Boolean.hashCode(this.r) + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductListModel(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", isOwner=");
        sb.append(this.c);
        sb.append(", isOwnerVerified=");
        sb.append(this.d);
        sb.append(", price=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", image=");
        sb.append(this.g);
        sb.append(", moderation=");
        sb.append(this.h);
        sb.append(", isFave=");
        sb.append(this.i);
        sb.append(", isService=");
        sb.append(this.j);
        sb.append(", isAvailable=");
        sb.append(this.k);
        sb.append(", rejectIsInProgress=");
        sb.append(this.l);
        sb.append(", hasSoftBlock=");
        sb.append(this.m);
        sb.append(", ownerName=");
        sb.append(this.n);
        sb.append(", itemRating=");
        sb.append(this.o);
        sb.append(", badges=");
        sb.append(this.p);
        sb.append(", trackCode=");
        sb.append(this.q);
        sb.append(", isRestricted=");
        return defpackage.q0.a(sb, this.r, ')');
    }
}
