package xsna;

import com.vk.dto.common.Image;
import com.vk.ecomm.core.models.product.ProductItemBadge;
import com.vk.ecomm.core.models.product.ProductPrice;
import com.vk.ecomm.design.compose.tile.model.ProductCtaButton;
import com.vk.toggle.features.SoccomFeatures;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.vid0;

/* compiled from: ProductListStateMapper.kt */
/* loaded from: classes18.dex */
public final class mqd0 implements dc10 {
    public final Float a;
    public final String b;
    public final Image c;
    public final String d;
    public final ArrayList e;
    public final boolean f;
    public final grd0 g;
    public final long h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public mqd0(vpd0 vpd0Var) {
        vid0 vid0Var;
        vid0 vid0Var2;
        jpd0 jpd0Var = vpd0Var.o;
        ArrayList arrayList = null;
        this.a = jpd0Var != null ? Float.valueOf(jpd0Var.a) : null;
        jpd0 jpd0Var2 = vpd0Var.o;
        this.b = jpd0Var2 != null ? jpd0Var2.c : null;
        this.c = vpd0Var.g;
        this.d = vpd0Var.n;
        List<ProductItemBadge> list = vpd0Var.p;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ProductItemBadge productItemBadge : list) {
                kc10 kc10Var = com.vk.ecomm.product_list.presentation.p.a;
                if (productItemBadge instanceof ProductItemBadge.Ozon) {
                    vid0Var = vid0.c.a;
                } else {
                    if (productItemBadge instanceof ProductItemBadge.Default) {
                        vid0Var2 = new vid0.a(((ProductItemBadge.Default) productItemBadge).b);
                    } else {
                        if (!(productItemBadge instanceof ProductItemBadge.MultiIntegration)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ProductItemBadge.MultiIntegration multiIntegration = (ProductItemBadge.MultiIntegration) productItemBadge;
                        vid0 bVar = new vid0.b(new ely(multiIntegration.b, multiIntegration.c, multiIntegration.d, multiIntegration.e));
                        SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                        soccomFeatures.getClass();
                        vid0Var2 = bVar;
                        if (!com.vk.toggle.b.A.a(soccomFeatures)) {
                            vid0Var = null;
                        }
                    }
                    vid0Var = vid0Var2;
                }
                if (vid0Var != null) {
                    arrayList2.add(vid0Var);
                }
            }
            arrayList = arrayList2;
        }
        this.e = arrayList;
        this.f = vpd0Var.c;
        ProductPrice productPrice = vpd0Var.e;
        this.g = new grd0(productPrice.b, productPrice.d, productPrice.e);
        this.h = vpd0Var.a;
        this.i = vpd0Var.f;
        this.j = vpd0Var.m;
        this.k = vpd0Var.d;
        this.l = vpd0Var.h.c;
        this.m = vpd0Var.l;
        this.n = vpd0Var.k;
        this.o = vpd0Var.i;
    }

    @Override // xsna.dc10
    public final String P() {
        return this.d;
    }

    @Override // xsna.dc10
    public final boolean X() {
        return this.o;
    }

    @Override // xsna.dc10
    public final List<Image> Z() {
        return null;
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
        return this.f;
    }

    @Override // xsna.dc10
    public final Float e() {
        return this.a;
    }

    @Override // xsna.dc10
    public final Boolean f() {
        return Boolean.valueOf(this.j);
    }

    @Override // xsna.dc10
    public final Boolean g() {
        return Boolean.valueOf(this.m);
    }

    @Override // xsna.dc10
    public final long getItemId() {
        return this.h;
    }

    @Override // xsna.dc10
    public final grd0 getPrice() {
        return this.g;
    }

    @Override // xsna.dc10
    public final String h() {
        return this.i;
    }

    @Override // xsna.dc10
    public final List<ProductCtaButton> i() {
        return null;
    }

    @Override // xsna.dc10
    public final Image j() {
        return this.c;
    }

    @Override // xsna.dc10
    public final boolean k() {
        return this.k;
    }

    @Override // xsna.dc10
    public final List<vid0> u0() {
        return this.e;
    }
}
