package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.design.compose.tile.model.ProductCtaButton;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StorefrontServicesState.kt */
/* loaded from: classes18.dex */
public final class uoi0 implements dc10 {
    public final Float a;
    public final String b;
    public final List<Image> c;
    public final Image d;
    public final List<CallProducerButton> e;
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
    public final UserId p;
    public final c530 q;
    public final ModerationRestriction r;
    public final String s;
    public final int t;
    public final boolean u;

    public uoi0(Float f, String str, List list, Image image, List list2, List list3, boolean z, grd0 grd0Var, long j, String str2, Boolean bool, boolean z2, Boolean bool2, boolean z3, boolean z4, UserId userId, c530 c530Var, ModerationRestriction moderationRestriction, String str3, int i, boolean z5) {
        this.a = f;
        this.b = str;
        this.c = list;
        this.d = image;
        this.e = list2;
        this.f = list3;
        this.g = z;
        this.h = grd0Var;
        this.i = j;
        this.j = str2;
        this.k = bool;
        this.l = z2;
        this.m = bool2;
        this.n = z3;
        this.o = z4;
        this.p = userId;
        this.q = c530Var;
        this.r = moderationRestriction;
        this.s = str3;
        this.t = i;
        this.u = z5;
    }

    public static uoi0 l(uoi0 uoi0Var, boolean z, ModerationRestriction moderationRestriction, int i) {
        Float f;
        c530 c530Var;
        ModerationRestriction moderationRestriction2;
        Float f2 = uoi0Var.a;
        String str = uoi0Var.b;
        List<Image> list = uoi0Var.c;
        Image image = uoi0Var.d;
        List<CallProducerButton> list2 = uoi0Var.e;
        List<vid0> list3 = uoi0Var.f;
        boolean z2 = uoi0Var.g;
        grd0 grd0Var = uoi0Var.h;
        long j = uoi0Var.i;
        String str2 = uoi0Var.j;
        Boolean bool = uoi0Var.k;
        boolean z3 = uoi0Var.l;
        Boolean bool2 = uoi0Var.m;
        boolean z4 = uoi0Var.n;
        if ((i & 65536) != 0) {
            f = f2;
            z = uoi0Var.o;
        } else {
            f = f2;
        }
        UserId userId = uoi0Var.p;
        c530 c530Var2 = uoi0Var.q;
        if ((i & 524288) != 0) {
            c530Var = c530Var2;
            moderationRestriction2 = uoi0Var.r;
        } else {
            c530Var = c530Var2;
            moderationRestriction2 = moderationRestriction;
        }
        return new uoi0(f, str, list, image, list2, list3, z2, grd0Var, j, str2, bool, z3, bool2, z4, z, userId, c530Var, moderationRestriction2, uoi0Var.s, uoi0Var.t, (i & 4194304) != 0 ? uoi0Var.u : true);
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
        if (!(obj instanceof uoi0)) {
            return false;
        }
        uoi0 uoi0Var = (uoi0) obj;
        return epx.f(this.a, uoi0Var.a) && epx.f(this.b, uoi0Var.b) && epx.f(this.c, uoi0Var.c) && epx.f(this.d, uoi0Var.d) && epx.f(this.e, uoi0Var.e) && epx.f(this.f, uoi0Var.f) && this.g == uoi0Var.g && this.h.equals(uoi0Var.h) && this.i == uoi0Var.i && epx.f(this.j, uoi0Var.j) && this.k.equals(uoi0Var.k) && this.l == uoi0Var.l && this.m.equals(uoi0Var.m) && this.n == uoi0Var.n && this.o == uoi0Var.o && epx.f(this.p, uoi0Var.p) && this.q.equals(uoi0Var.q) && this.r == uoi0Var.r && epx.f(this.s, uoi0Var.s) && this.t == uoi0Var.t && this.u == uoi0Var.u;
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
        List<CallProducerButton> list2 = this.e;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<vid0> list3 = this.f;
        int hashCode6 = (this.r.hashCode() + ((this.q.hashCode() + bh10.a(qoy.b(qoy.b((this.m.hashCode() + qoy.b(qoy.b((this.k.hashCode() + urd0.a(bh10.a((this.h.hashCode() + qoy.b((hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.g)) * 31, 31, this.i), 31, this.j)) * 31, 31, false), 31, this.l)) * 31, 31, this.n), 31, this.o), 31, this.p.b)) * 31)) * 31;
        String str2 = this.s;
        return Boolean.hashCode(this.u) + shy.a(this.t, (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @Override // xsna.dc10
    public final List<ProductCtaButton> i() {
        ProductCtaButton.Type type;
        ProductCtaButton productCtaButton;
        List<CallProducerButton> list = this.e;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (CallProducerButton callProducerButton : list) {
            switch (callProducerButton.b) {
                case 0:
                    type = ProductCtaButton.Type.Write;
                    productCtaButton = new ProductCtaButton(type, callProducerButton.c);
                    break;
                case 1:
                    type = ProductCtaButton.Type.Link;
                    productCtaButton = new ProductCtaButton(type, callProducerButton.c);
                    break;
                case 2:
                    type = ProductCtaButton.Type.Call;
                    productCtaButton = new ProductCtaButton(type, callProducerButton.c);
                    break;
                case 3:
                    type = ProductCtaButton.Type.GoToCart;
                    productCtaButton = new ProductCtaButton(type, callProducerButton.c);
                    break;
                case 4:
                    type = ProductCtaButton.Type.AddToCart;
                    productCtaButton = new ProductCtaButton(type, callProducerButton.c);
                    break;
                case 5:
                    type = ProductCtaButton.Type.Similar;
                    productCtaButton = new ProductCtaButton(type, callProducerButton.c);
                    break;
                case 6:
                    type = ProductCtaButton.Type.Link;
                    productCtaButton = new ProductCtaButton(type, callProducerButton.c);
                    break;
                default:
                    productCtaButton = null;
                    break;
            }
            if (productCtaButton != null) {
                arrayList.add(productCtaButton);
            }
        }
        return arrayList;
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
        StringBuilder sb = new StringBuilder("ServiceData(marketItemRating=");
        sb.append(this.a);
        sb.append(", marketReviewCountText=");
        sb.append(this.b);
        sb.append(", images=");
        sb.append(this.c);
        sb.append(", mainImage=");
        sb.append(this.d);
        sb.append(", ownerName=null, ctaButtons=");
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
        sb.append(this.o);
        sb.append(", ownerId=");
        sb.append(this.p);
        sb.append(", moderationItem=");
        sb.append(this.q);
        sb.append(", restriction=");
        sb.append(this.r);
        sb.append(", trackCode=");
        sb.append(this.s);
        sb.append(", cartQuantity=");
        sb.append(this.t);
        sb.append(", isViewed=");
        return defpackage.q0.a(sb, this.u, ')');
    }

    @Override // xsna.dc10
    public final List<vid0> u0() {
        return this.f;
    }
}
