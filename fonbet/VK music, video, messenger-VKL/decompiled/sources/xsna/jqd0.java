package xsna;

import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketBadgeDto;
import com.vk.api.generated.market.dto.MarketBadgeTypeDto;
import com.vk.api.generated.market.dto.MarketGetByIdExtendedResponseDto;
import com.vk.api.generated.market.dto.MarketItemOwnerInfoDto;
import com.vk.api.generated.market.dto.MarketItemRejectInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemAvailabilityDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.core.models.product.ProductItemBadge;
import com.vk.ecomm.core.models.product.ProductPrice;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ProductListRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class jqd0 {
    public final yd10 a;
    public final x8c b;

    public jqd0(yd10 yd10Var, x8c x8cVar) {
        this.a = yd10Var;
        this.b = x8cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(List list, ContinuationImpl continuationImpl) {
        iqd0 iqd0Var;
        int i;
        Iterator it;
        ArrayList arrayList;
        Iterator it2;
        MarketMarketItemFullDto marketMarketItemFullDto;
        boolean z;
        Parcelable parcelable;
        String str;
        List<BaseImageDto> f;
        String str2;
        BaseImageDto baseImageDto;
        BaseImageDto baseImageDto2;
        List<BaseImageDto> list2;
        Object obj;
        Object obj2;
        jqd0 jqd0Var = this;
        if (continuationImpl instanceof iqd0) {
            iqd0Var = (iqd0) continuationImpl;
            int i2 = iqd0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iqd0Var.label = i2 - Integer.MIN_VALUE;
                Object obj3 = iqd0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = iqd0Var.label;
                boolean z2 = true;
                if (i != 0) {
                    kotlin.a.a(obj3);
                    iz2 A = yfb.A(jqd0Var.a.C(list));
                    iqd0Var.L$0 = null;
                    iqd0Var.label = 1;
                    obj3 = evj.p(A, iqd0Var);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj3);
                }
                List<MarketMarketItemFullDto> d = ((MarketGetByIdExtendedResponseDto) obj3).d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                it = d.iterator();
                while (it.hasNext()) {
                    MarketMarketItemFullDto marketMarketItemFullDto2 = (MarketMarketItemFullDto) it.next();
                    long id = marketMarketItemFullDto2.getId();
                    UserId q = marketMarketItemFullDto2.q();
                    Boolean o1 = marketMarketItemFullDto2.o1();
                    boolean booleanValue = o1 != null ? o1.booleanValue() : false;
                    MarketItemOwnerInfoDto W = marketMarketItemFullDto2.W();
                    boolean f2 = W != null ? epx.f(W.f(), Boolean.TRUE) : false;
                    ProductPrice v = pli.v(marketMarketItemFullDto2.a0());
                    String title = marketMarketItemFullDto2.getTitle();
                    ne6 ne6Var = (ne6) jqd0Var.b.b;
                    List<BaseImageDto> K0 = marketMarketItemFullDto2.K0();
                    ne6Var.getClass();
                    Image a = ne6.a(K0);
                    c530 c = e530.c(marketMarketItemFullDto2);
                    Boolean d1 = marketMarketItemFullDto2.d1();
                    Boolean bool = Boolean.TRUE;
                    boolean f3 = epx.f(d1, bool);
                    boolean f4 = epx.f(marketMarketItemFullDto2.s1(), bool);
                    boolean z3 = marketMarketItemFullDto2.f() == MarketMarketItemAvailabilityDto.AVAILABLE ? z2 : false;
                    MarketItemRejectInfoDto v0 = marketMarketItemFullDto2.v0();
                    boolean z4 = (v0 == null || v0.e() != z2) ? false : z2;
                    MarketItemRejectInfoDto v02 = marketMarketItemFullDto2.v0();
                    boolean z5 = (v02 == null || v02.g() != 2) ? false : z2;
                    MarketItemOwnerInfoDto W2 = marketMarketItemFullDto2.W();
                    String e = W2 != null ? W2.e() : null;
                    MarketMarketItemRatingDto F = marketMarketItemFullDto2.F();
                    jpd0 jpd0Var = F != null ? new jpd0(F.d(), F.e(), F.f()) : null;
                    List<MarketBadgeDto> g = marketMarketItemFullDto2.g();
                    if (g != null) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = g.iterator();
                        while (it3.hasNext()) {
                            MarketBadgeDto marketBadgeDto = (MarketBadgeDto) it3.next();
                            MarketBadgeTypeDto k = marketBadgeDto.k();
                            int i3 = k == null ? -1 : ipd0.$EnumSwitchMapping$0[k.ordinal()];
                            Iterator it4 = it3;
                            if (i3 == 1) {
                                it2 = it;
                                marketMarketItemFullDto = marketMarketItemFullDto2;
                                z = booleanValue;
                                parcelable = ProductItemBadge.Ozon.b;
                            } else if (i3 == 2) {
                                List<BaseImageDto> f5 = marketBadgeDto.f();
                                if (f5 != null) {
                                    Iterator<T> it5 = f5.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            it2 = it;
                                            marketMarketItemFullDto = marketMarketItemFullDto2;
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it5.next();
                                        it2 = it;
                                        marketMarketItemFullDto = marketMarketItemFullDto2;
                                        if (((BaseImageDto) obj2).d() == BaseImageDto.ThemeDto.LIGHT) {
                                            break;
                                        }
                                        marketMarketItemFullDto2 = marketMarketItemFullDto;
                                        it = it2;
                                    }
                                    BaseImageDto baseImageDto3 = (BaseImageDto) obj2;
                                    if (baseImageDto3 == null || (str = baseImageDto3.getUrl()) == null) {
                                        BaseImageDto baseImageDto4 = (BaseImageDto) j5g.a0(f5);
                                        if (baseImageDto4 != null) {
                                            str = baseImageDto4.getUrl();
                                        }
                                    }
                                    f = marketBadgeDto.f();
                                    if (f == null) {
                                        Iterator<T> it6 = f.iterator();
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                list2 = f;
                                                z = booleanValue;
                                                obj = null;
                                                break;
                                            }
                                            obj = it6.next();
                                            list2 = f;
                                            z = booleanValue;
                                            if (((BaseImageDto) obj).d() == BaseImageDto.ThemeDto.DARK) {
                                                break;
                                            }
                                            booleanValue = z;
                                            f = list2;
                                        }
                                        BaseImageDto baseImageDto5 = (BaseImageDto) obj;
                                        if (baseImageDto5 == null || (str2 = baseImageDto5.getUrl()) == null) {
                                            BaseImageDto baseImageDto6 = (BaseImageDto) j5g.a0(list2);
                                            if (baseImageDto6 != null) {
                                                str2 = baseImageDto6.getUrl();
                                            }
                                        }
                                        List<BaseImageDto> f6 = marketBadgeDto.f();
                                        Integer valueOf = (f6 != null || (baseImageDto2 = (BaseImageDto) j5g.a0(f6)) == null) ? null : Integer.valueOf(baseImageDto2.getWidth());
                                        List<BaseImageDto> f7 = marketBadgeDto.f();
                                        parcelable = new ProductItemBadge.MultiIntegration(str, str2, valueOf, (f7 != null || (baseImageDto = (BaseImageDto) j5g.a0(f7)) == null) ? null : Integer.valueOf(baseImageDto.getHeight()));
                                    } else {
                                        z = booleanValue;
                                    }
                                    str2 = null;
                                    List<BaseImageDto> f62 = marketBadgeDto.f();
                                    if (f62 != null) {
                                    }
                                    List<BaseImageDto> f72 = marketBadgeDto.f();
                                    parcelable = new ProductItemBadge.MultiIntegration(str, str2, valueOf, (f72 != null || (baseImageDto = (BaseImageDto) j5g.a0(f72)) == null) ? null : Integer.valueOf(baseImageDto.getHeight()));
                                } else {
                                    it2 = it;
                                    marketMarketItemFullDto = marketMarketItemFullDto2;
                                }
                                str = null;
                                f = marketBadgeDto.f();
                                if (f == null) {
                                }
                                str2 = null;
                                List<BaseImageDto> f622 = marketBadgeDto.f();
                                if (f622 != null) {
                                }
                                List<BaseImageDto> f722 = marketBadgeDto.f();
                                parcelable = new ProductItemBadge.MultiIntegration(str, str2, valueOf, (f722 != null || (baseImageDto = (BaseImageDto) j5g.a0(f722)) == null) ? null : Integer.valueOf(baseImageDto.getHeight()));
                            } else if (i3 != 3) {
                                it2 = it;
                                marketMarketItemFullDto = marketMarketItemFullDto2;
                                z = booleanValue;
                                parcelable = null;
                            } else {
                                parcelable = new ProductItemBadge.Default(marketBadgeDto.g());
                                it2 = it;
                                marketMarketItemFullDto = marketMarketItemFullDto2;
                                z = booleanValue;
                            }
                            if (parcelable != null) {
                                arrayList3.add(parcelable);
                            }
                            it3 = it4;
                            booleanValue = z;
                            marketMarketItemFullDto2 = marketMarketItemFullDto;
                            it = it2;
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    Iterator it7 = it;
                    arrayList2.add(new vpd0(id, q, booleanValue, f2, v, title, a, c, f3, f4, z3, z4, z5, e, jpd0Var, arrayList, marketMarketItemFullDto2.r(), false));
                    jqd0Var = this;
                    it = it7;
                    z2 = true;
                }
                return arrayList2;
            }
        }
        iqd0Var = new iqd0(jqd0Var, continuationImpl);
        Object obj32 = iqd0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iqd0Var.label;
        boolean z22 = true;
        if (i != 0) {
        }
        List<MarketMarketItemFullDto> d2 = ((MarketGetByIdExtendedResponseDto) obj32).d();
        ArrayList arrayList22 = new ArrayList(c5g.u(d2, 10));
        it = d2.iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }
}
