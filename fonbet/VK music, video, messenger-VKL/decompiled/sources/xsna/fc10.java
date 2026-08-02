package xsna;

import com.vk.dto.common.Image;
import com.vk.ecomm.design.compose.tile.model.ProductCtaButton;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketProductItemTile.kt */
/* loaded from: classes18.dex */
public final class fc10 implements dc10 {
    public final Float a;
    public final String b;
    public final List<Image> c;
    public final Image d;
    public final List<ProductCtaButton> e;
    public final List<vid0> f;
    public final boolean g;
    public final grd0 h;
    public final long i;
    public final String j;
    public final Boolean k;
    public final boolean l;
    public final Boolean m;
    public final boolean n;
    public final boolean o;

    public fc10(Float f, String str, ArrayList arrayList, Image image, List list, List list2, boolean z, grd0 grd0Var, long j, String str2, Boolean bool, boolean z2, Boolean bool2, boolean z3, boolean z4) {
        this.a = f;
        this.b = str;
        this.c = arrayList;
        this.d = image;
        this.e = list;
        this.f = list2;
        this.g = z;
        this.h = grd0Var;
        this.i = j;
        this.j = str2;
        this.k = bool;
        this.l = z2;
        this.m = bool2;
        this.n = z3;
        this.o = z4;
    }

    @Override // xsna.dc10
    public final String P() {
        return null;
    }

    @Override // xsna.dc10
    public final boolean X() {
        return this.o;
    }

    @Override // xsna.dc10
    public final List<Image> Z() {
        return this.c;
    }

    @Override // xsna.dc10
    public final boolean a() {
        return this.n;
    }

    @Override // xsna.dc10
    public final boolean b() {
        return this.l;
    }

    @Override // xsna.dc10
    public final String c() {
        return this.b;
    }

    @Override // xsna.dc10
    public final boolean d() {
        return this.g;
    }

    @Override // xsna.dc10
    public final Float e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc10)) {
            return false;
        }
        fc10 fc10Var = (fc10) obj;
        return epx.f(this.a, fc10Var.a) && epx.f(this.b, fc10Var.b) && epx.f(this.c, fc10Var.c) && epx.f(this.d, fc10Var.d) && epx.f(this.e, fc10Var.e) && epx.f(this.f, fc10Var.f) && this.g == fc10Var.g && this.h.equals(fc10Var.h) && this.i == fc10Var.i && epx.f(this.j, fc10Var.j) && this.k.equals(fc10Var.k) && this.l == fc10Var.l && this.m.equals(fc10Var.m) && this.n == fc10Var.n && this.o == fc10Var.o;
    }

    @Override // xsna.dc10
    public final Boolean f() {
        return this.k;
    }

    @Override // xsna.dc10
    public final Boolean g() {
        return this.m;
    }

    @Override // xsna.dc10
    public final long getItemId() {
        return this.i;
    }

    @Override // xsna.dc10
    public final grd0 getPrice() {
        return this.h;
    }

    @Override // xsna.dc10
    public final String h() {
        return this.j;
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Image> list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Image image = this.d;
        int hashCode4 = (hashCode3 + (image == null ? 0 : image.hashCode())) * 961;
        List<ProductCtaButton> list2 = this.e;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<vid0> list3 = this.f;
        return Boolean.hashCode(this.o) + qoy.b((this.m.hashCode() + qoy.b(qoy.b((this.k.hashCode() + urd0.a(bh10.a((this.h.hashCode() + qoy.b((hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.g)) * 31, 31, this.i), 31, this.j)) * 31, 31, false), 31, this.l)) * 31, 31, this.n);
    }

    @Override // xsna.dc10
    public final List<ProductCtaButton> i() {
        return this.e;
    }

    @Override // xsna.dc10
    public final Image j() {
        return this.d;
    }

    @Override // xsna.dc10
    public final boolean k() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketProductItemTile(marketItemRating=");
        sb.append(this.a);
        sb.append(", marketReviewCountText=");
        sb.append(this.b);
        sb.append(", images=");
        sb.append(this.c);
        sb.append(", mainImage=");
        sb.append(this.d);
        sb.append(", ownerName=null, buttons=");
        sb.append(this.e);
        sb.append(", badges=");
        sb.append(this.f);
        sb.append(", isOwner=");
        sb.append(this.g);
        sb.append(", price=");
        sb.append(this.h);
        sb.append(", itemId=");
        sb.append(this.i);
        sb.append(", itemTitle=");
        sb.append(this.j);
        sb.append(", hasSoftBlock=");
        sb.append(this.k);
        sb.append(", isOwnerVerified=false, isHardBlocked=");
        sb.append(this.l);
        sb.append(", isModerationInProgress=");
        sb.append(this.m);
        sb.append(", isAvailable=");
        sb.append(this.n);
        sb.append(", isFave=");
        return defpackage.q0.a(sb, this.o, ')');
    }

    @Override // xsna.dc10
    public final List<vid0> u0() {
        return this.f;
    }
}
