package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.market.GoodBadge;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.design.compose.tile.model.ProductCtaButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.vid0;

/* compiled from: CommunityMarketProductItemService.kt */
/* loaded from: classes5.dex */
public final class p9h implements dc10 {
    public final Good a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new wb1(6));

    /* compiled from: CommunityMarketProductItemService.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoodBadge.BadgeType.values().length];
            try {
                iArr[GoodBadge.BadgeType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoodBadge.BadgeType.OZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoodBadge.BadgeType.PARTNER_INTEGRATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public p9h(Good good) {
        this.a = good;
    }

    @Override // xsna.dc10
    public final String P() {
        Owner owner = this.a.M;
        if (owner != null) {
            return owner.c;
        }
        return null;
    }

    @Override // xsna.dc10
    public final boolean X() {
        return this.a.J;
    }

    @Override // xsna.dc10
    public final List<Image> Z() {
        return this.a.m0;
    }

    @Override // xsna.dc10
    public final boolean a() {
        return this.a.Bb();
    }

    @Override // xsna.dc10
    public final boolean b() {
        return this.a.i0;
    }

    @Override // xsna.dc10
    public final String c() {
        MarketItemRating marketItemRating = this.a.t;
        if (marketItemRating != null) {
            return marketItemRating.d;
        }
        return null;
    }

    @Override // xsna.dc10
    public final boolean d() {
        return this.a.g0;
    }

    @Override // xsna.dc10
    public final Float e() {
        MarketItemRating marketItemRating = this.a.t;
        if (marketItemRating != null) {
            return marketItemRating.b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9h) && epx.f(this.a, ((p9h) obj).a);
    }

    @Override // xsna.dc10
    public final Boolean f() {
        MarketRejectInfo marketRejectInfo = this.a.e0;
        boolean z = false;
        if (marketRejectInfo != null && marketRejectInfo.f == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // xsna.dc10
    public final Boolean g() {
        MarketRejectInfo marketRejectInfo = this.a.e0;
        boolean z = false;
        if (marketRejectInfo != null && marketRejectInfo.g) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // xsna.dc10
    public final long getItemId() {
        return this.a.b;
    }

    @Override // xsna.dc10
    public final grd0 getPrice() {
        Price price = this.a.h;
        return new grd0(price.e, price.f, price.i);
    }

    @Override // xsna.dc10
    public final String h() {
        return this.a.d;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.dc10
    public final List<ProductCtaButton> i() {
        ProductCtaButton.Type type;
        ProductCtaButton productCtaButton;
        List<CallProducerButton> list = this.a.n0;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
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
                        type = ProductCtaButton.Type.PartnerLink;
                        productCtaButton = new ProductCtaButton(type, callProducerButton.c);
                        break;
                    default:
                        productCtaButton = null;
                        break;
                }
                if (productCtaButton != null) {
                    arrayList2.add(productCtaButton);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }

    @Override // xsna.dc10
    public final Image j() {
        return this.a.n;
    }

    @Override // xsna.dc10
    public final boolean k() {
        VerifyInfo verifyInfo;
        Owner owner = this.a.M;
        return (owner == null || (verifyInfo = owner.f) == null || !verifyInfo.b) ? false : true;
    }

    public final String toString() {
        return "CommunityMarketProductItemService(good=" + this.a + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (((java.lang.Boolean) r8.b.getValue()).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dc10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<vid0> u0() {
        vid0 aVar;
        ely elyVar;
        List<GoodBadge> list = this.a.O;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (GoodBadge goodBadge : list) {
                GoodBadge.BadgeType badgeType = goodBadge.c;
                int i = badgeType == null ? -1 : a.$EnumSwitchMapping$0[badgeType.ordinal()];
                if (i == 1) {
                    aVar = new vid0.a(goodBadge.b);
                } else if (i != 2) {
                    if (i == 3) {
                        List<BaseImageDto> list2 = goodBadge.h;
                        if (list2 != null) {
                            Serializer.c<GoodBadge> cVar = GoodBadge.CREATOR;
                            elyVar = new ely(GoodBadge.a.c(list2), GoodBadge.a.a(list2), GoodBadge.a.d(list2), GoodBadge.a.b(list2));
                        } else {
                            elyVar = null;
                        }
                        aVar = new vid0.b(elyVar);
                    }
                    aVar = null;
                } else {
                    aVar = vid0.c.a;
                }
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }
}
