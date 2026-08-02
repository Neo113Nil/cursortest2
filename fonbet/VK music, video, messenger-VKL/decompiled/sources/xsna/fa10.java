package xsna;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Good;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.Price;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.core.models.product.ProductItemType;
import com.vk.ecomm.core.models.product.ProductPrice;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.e0o0;
import xsna.i0o0;
import xsna.ibc0;
import xsna.n0o0;
import xsna.via0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fa10 implements izs {
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ com.vk.newsfeed.posting.market_picker.presentation.base.view.g c;
    public final /* synthetic */ Photo d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ fa10(Ref$ObjectRef ref$ObjectRef, com.vk.newsfeed.posting.market_picker.presentation.base.view.g gVar, Photo photo, float f, float f2) {
        this.b = ref$ObjectRef;
        this.c = gVar;
        this.d = photo;
        this.e = f;
        this.f = f2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ProductPrice productPrice;
        jpd0 jpd0Var;
        com.vk.newsfeed.posting.market_picker.presentation.base.view.h hVar;
        MultipickerProduct multipickerProduct = (MultipickerProduct) obj;
        ysd0 ysd0Var = (ysd0) this.b.element;
        if (ysd0Var != null) {
            ysd0Var.hide();
        }
        Good a = multipickerProduct != null ? i740.a(multipickerProduct) : null;
        PointF pointF = new PointF(this.e, this.f);
        com.vk.newsfeed.posting.market_picker.presentation.base.view.f fVar = this.c.a;
        if (a != null) {
            long j = a.b;
            ibc0.b u = fVar.e.u();
            UserId userId = a.c;
            int i = (int) j;
            Photo photo = this.d;
            u.K(com.vk.newsfeed.posting.market_picker.presentation.base.view.f.f(photo, userId, i));
            double d = pointF.x;
            double d2 = pointF.y;
            i0o0 i0o0Var = fVar.r;
            int i2 = i0o0Var.a;
            i0o0Var.a = i2 - 1;
            Tag.ContentType contentType = Tag.ContentType.PHOTO;
            UserId userId2 = photo.e;
            int i3 = photo.c;
            String str = a.k0;
            if (str == null) {
                str = "";
            }
            String str2 = a.d;
            Price price = a.h;
            ProductPrice productPrice2 = new ProductPrice(price.e, price.g, price.f, price.i);
            rnd0 rnd0Var = new rnd0(a.i, a.j, a.V);
            MarketItemType marketItemType = a.f;
            int i4 = marketItemType == null ? -1 : i0o0.a.$EnumSwitchMapping$0[marketItemType.ordinal()];
            ProductItemType productItemType = i4 != 1 ? i4 != 2 ? ProductItemType.VK : ProductItemType.OZON : ProductItemType.VK;
            MarketItemRating marketItemRating = a.t;
            if (marketItemRating != null) {
                Float f = marketItemRating.b;
                float floatValue = f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                productPrice = productPrice2;
                Integer num = marketItemRating.c;
                int intValue = num != null ? num.intValue() : 0;
                String str3 = marketItemRating.d;
                if (str3 == null) {
                    str3 = "";
                }
                jpd0Var = new jpd0(floatValue, intValue, str3);
            } else {
                productPrice = productPrice2;
                jpd0Var = null;
            }
            fVar.b(photo, new e0o0.a(new via0.a(new Tag(i2, i, contentType, userId2, i3, new n0o0("", str, str2, photo, new n0o0.a(productPrice, rnd0Var, productItemType, jpd0Var, null), "", a.J), d, d2, null, null, a.g0, a.h0), a.c, a.b, a)));
            com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = fVar.t;
            if (eVar != null && (hVar = eVar.l) != null) {
                hVar.c(photo, fVar.e(photo), com.vk.newsfeed.posting.market_picker.presentation.base.view.f.g(photo));
            }
        }
        return s3q0.a;
    }
}
