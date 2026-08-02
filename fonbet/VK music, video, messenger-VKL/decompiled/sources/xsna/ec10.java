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
import kotlin.collections.EmptyList;
import xsna.vid0;

/* compiled from: MarketProductItemGood.kt */
/* loaded from: classes18.dex */
public final class ec10 implements dc10 {
    public final Good a;

    /* compiled from: MarketProductItemGood.kt */
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

    public ec10(Good good) {
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0012 A[SYNTHETIC] */
    @Override // xsna.dc10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<ProductCtaButton> i() {
        ProductCtaButton.Type type;
        ProductCtaButton productCtaButton;
        List<CallProducerButton> list = this.a.n0;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (CallProducerButton callProducerButton : list) {
                Boolean bool = callProducerButton.f;
                int i = callProducerButton.b;
                if (!epx.f(bool, Boolean.FALSE) || i != 2) {
                    switch (i) {
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
                    }
                    if (productCtaButton == null) {
                        arrayList2.add(productCtaButton);
                    }
                }
                productCtaButton = null;
                if (productCtaButton == null) {
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

    @Override // xsna.dc10
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
                } else if (i == 2) {
                    aVar = vid0.c.a;
                } else if (i != 3) {
                    aVar = null;
                } else {
                    List<BaseImageDto> list2 = goodBadge.h;
                    if (list2 != null) {
                        Serializer.c<GoodBadge> cVar = GoodBadge.CREATOR;
                        elyVar = new ely(GoodBadge.a.c(list2), GoodBadge.a.a(list2), GoodBadge.a.d(list2), GoodBadge.a.b(list2));
                    } else {
                        elyVar = null;
                    }
                    aVar = new vid0.b(elyVar);
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
