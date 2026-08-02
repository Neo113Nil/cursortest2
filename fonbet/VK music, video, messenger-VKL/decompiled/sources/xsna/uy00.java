package xsna;

import android.content.Context;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.params.api.City;
import com.vk.search.params.api.VkMarketSearchParams;
import com.vk.search.params.api.domain.model.MarketSearchDeliveryType;
import com.vk.search.params.api.domain.model.MarketSearchSortingOptions;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MarketFilterFieldsDelegate.kt */
/* loaded from: classes18.dex */
public final class uy00 implements qcr<vcr<?>> {
    public final Context a;
    public final f5z b;
    public final VkMarketSearchParams c;
    public final DiscoverSearchFragment.c d;
    public final uv00 e;
    public final io.reactivex.rxjava3.subjects.d<List<vcr<?>>> f = io.reactivex.rxjava3.subjects.d.N0();
    public boolean g;

    public uy00(Context context, f5z f5zVar, VkMarketSearchParams vkMarketSearchParams, DiscoverSearchFragment.c cVar, String str) {
        this.a = context;
        this.b = f5zVar;
        this.c = vkMarketSearchParams;
        this.d = cVar;
        this.e = new uv00(new yd10(), str);
    }

    @Override // xsna.qcr
    public final io.reactivex.rxjava3.core.k<List<vcr<?>>> b(City city) {
        return new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.observable.e0(d()), new com.vk.movika.sdk.base.ui.j(new l2k(this, city), 27));
    }

    @Override // xsna.qcr
    public final io.reactivex.rxjava3.core.k<List<vcr<?>>> c() {
        return new io.reactivex.rxjava3.internal.operators.observable.e0(d());
    }

    @Override // xsna.qcr
    public final io.reactivex.rxjava3.core.q<List<vcr<?>>> d() {
        io.reactivex.rxjava3.subjects.d<List<vcr<?>>> dVar = this.f;
        if (!dVar.Q0() && !this.g) {
            e();
        }
        return dVar;
    }

    @Override // xsna.qcr
    public final void e() {
        this.g = true;
        xgv xgvVar = new xgv(this, 10);
        hx3 hx3Var = new hx3(1, this, uy00.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, 3);
        uv00 uv00Var = this.e;
        io.reactivex.rxjava3.subjects.d<MarketBridgeCategory> dVar = uv00Var.c;
        if (!dVar.Q0()) {
            uv00Var.a.getClass();
            dz2 x = yfb.x(new tfx("market.getCategories", new hr(20), new ir(24)));
            x.j("type", "search_filters");
            new io.reactivex.rxjava3.internal.operators.observable.e0(hg1.m(rsg0.y0(x, null, null, 3), this.a, 0L, false, 62).U(new d22(new sec(uv00Var, 3), 24))).subscribe(new pm1(new f1j(uv00Var, 24), 27), new defpackage.i0(hx3Var, 28));
        }
        hg1.a(new io.reactivex.rxjava3.internal.operators.observable.e0(dVar).subscribe(new ljs(new f0z(xgvVar, 4), 6)), this.b);
    }

    @Override // xsna.qcr
    public final void f() {
        io.reactivex.rxjava3.subjects.d<List<vcr<?>>> dVar = this.f;
        List<vcr<?>> P0 = dVar.P0();
        if (P0 == null) {
            return;
        }
        Iterator<T> it = P0.iterator();
        while (it.hasNext()) {
            ((vcr) it.next()).a();
        }
        dVar.onNext(P0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d0, code lost:
    
        if (r3 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00fd, code lost:
    
        if (xsna.epx.f(r5, r8 != null ? r8.b : null) == false) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qcr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        boolean z;
        MarketSearchDeliveryType marketSearchDeliveryType;
        Integer num;
        Integer num2;
        p6d0 p6d0Var;
        Integer num3;
        Integer num4;
        io.reactivex.rxjava3.subjects.d<List<vcr<?>>> dVar = this.f;
        List<vcr<?>> P0 = dVar.P0();
        if (P0 != null) {
            List<vcr<?>> list = P0;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof n6d0) {
                    arrayList.add(obj);
                }
            }
            n6d0 n6d0Var = (n6d0) j5g.a0(arrayList);
            if (n6d0Var != null && (p6d0Var = n6d0Var.f) != null && (num3 = p6d0Var.a) != null) {
                int intValue = num3.intValue();
                p6d0 p6d0Var2 = n6d0Var.f;
                if (p6d0Var2 != null && (num4 = p6d0Var2.b) != null && intValue > num4.intValue()) {
                    n6d0Var.g = this.a.getString(R.string.wrong_price_range);
                    List<vcr<?>> P02 = dVar.P0();
                    if (P02 != null) {
                        dVar.onNext(P02);
                        return false;
                    }
                }
            }
            Iterator<T> it = list.iterator();
            Object[] objArr = false;
            while (it.hasNext()) {
                vcr vcrVar = (vcr) it.next();
                boolean z2 = vcrVar instanceof nmo;
                VkMarketSearchParams vkMarketSearchParams = this.c;
                r7 = null;
                Integer num5 = null;
                if (z2) {
                    nmo nmoVar = (nmo) vcrVar;
                    int i = nmoVar.g;
                    if (i != 5) {
                        if (i == 6) {
                            fxh0<Integer> fxh0Var = vkMarketSearchParams.d;
                            Integer num6 = fxh0Var != null ? fxh0Var.a : null;
                            wqd0 wqd0Var = nmoVar.e;
                            if (!epx.f(num6, wqd0Var != null ? Integer.valueOf(wqd0Var.a) : null)) {
                                wqd0 wqd0Var2 = nmoVar.e;
                                vkMarketSearchParams.d = wqd0Var2 != null ? new fxh0<>(Integer.valueOf(wqd0Var2.a), wqd0Var2.c) : null;
                                z = true;
                            }
                        }
                        z = false;
                    } else {
                        wqd0 wqd0Var3 = nmoVar.e;
                        City city = wqd0Var3 != null ? new City(wqd0Var3.a, wqd0Var3.c, null, null, 12, null) : null;
                        if (!epx.f(vkMarketSearchParams.b, city)) {
                            vkMarketSearchParams.b = city;
                            z = true;
                        }
                        z = false;
                    }
                } else {
                    if (vcrVar instanceof n6d0) {
                        Integer num7 = vkMarketSearchParams.g;
                        n6d0 n6d0Var2 = (n6d0) vcrVar;
                        p6d0 p6d0Var3 = n6d0Var2.f;
                        if (epx.f(num7, p6d0Var3 != null ? p6d0Var3.a : null)) {
                            Integer num8 = vkMarketSearchParams.h;
                            p6d0 p6d0Var4 = n6d0Var2.f;
                        }
                        p6d0 p6d0Var5 = n6d0Var2.f;
                        vkMarketSearchParams.g = (p6d0Var5 == null || (num2 = p6d0Var5.a) == null) ? null : Integer.valueOf(num2.intValue() / 100);
                        p6d0 p6d0Var6 = n6d0Var2.f;
                        if (p6d0Var6 != null && (num = p6d0Var6.b) != null) {
                            num5 = Integer.valueOf(num.intValue() / 100);
                        }
                        vkMarketSearchParams.h = num5;
                        z = true;
                    } else if (vcrVar instanceof xqd0) {
                        xqd0 xqd0Var = (xqd0) vcrVar;
                        z = !epx.f(vkMarketSearchParams.n, xqd0Var.h);
                        Boolean bool = xqd0Var.h;
                        if (bool == null) {
                            bool = Boolean.FALSE;
                        }
                        vkMarketSearchParams.n = bool;
                    } else if (vcrVar instanceof znd0) {
                        znd0 znd0Var = (znd0) vcrVar;
                        z = !epx.f(vkMarketSearchParams.o, znd0Var.h);
                        Boolean bool2 = znd0Var.h;
                        if (bool2 == null) {
                            bool2 = Boolean.FALSE;
                        }
                        vkMarketSearchParams.o = bool2;
                    } else if (vcrVar instanceof pfi0) {
                        pfi0 pfi0Var = (pfi0) vcrVar;
                        z = !epx.f(vkMarketSearchParams.p, pfi0Var.h);
                        Boolean bool3 = pfi0Var.h;
                        if (bool3 == null) {
                            bool3 = Boolean.FALSE;
                        }
                        vkMarketSearchParams.p = bool3;
                    } else if (vcrVar instanceof wod0) {
                        wod0 wod0Var = (wod0) vcrVar;
                        z = !epx.f(vkMarketSearchParams.q, wod0Var.h);
                        Boolean bool4 = wod0Var.h;
                        if (bool4 == null) {
                            bool4 = Boolean.FALSE;
                        }
                        vkMarketSearchParams.q = bool4;
                    } else if (vcrVar instanceof xod0) {
                        xod0 xod0Var = (xod0) vcrVar;
                        z = !epx.f(vkMarketSearchParams.r, xod0Var.h);
                        Boolean bool5 = xod0Var.h;
                        if (bool5 == null) {
                            bool5 = Boolean.FALSE;
                        }
                        vkMarketSearchParams.r = bool5;
                    } else if (vcrVar instanceof xnd0) {
                        MarketSearchDeliveryType marketSearchDeliveryType2 = vkMarketSearchParams.s;
                        xnd0 xnd0Var = (xnd0) vcrVar;
                        z = !epx.f(marketSearchDeliveryType2 != null ? Integer.valueOf(marketSearchDeliveryType2.ordinal()) : null, xnd0Var.h);
                        Integer num9 = xnd0Var.h;
                        if (num9 != null) {
                            marketSearchDeliveryType = (MarketSearchDeliveryType) MarketSearchDeliveryType.h().get(num9.intValue());
                        }
                        marketSearchDeliveryType = MarketSearchDeliveryType.ANY;
                        vkMarketSearchParams.s = marketSearchDeliveryType;
                    } else if (vcrVar instanceof dsd0) {
                        Integer num10 = ((dsd0) vcrVar).i;
                        String i2 = num10 != null ? ((MarketSearchSortingOptions) MarketSearchSortingOptions.h().get(num10.intValue())).i() : null;
                        z = !epx.f(vkMarketSearchParams.c, i2);
                        vkMarketSearchParams.c = i2;
                    }
                    z = false;
                }
                if (z) {
                    objArr = true;
                }
            }
            if (objArr != false) {
                ysg0.b.a(new jru0(DiscoverSearchFragment.this.Y));
            }
            return true;
        }
        return false;
    }

    @Override // xsna.qcr
    public final /* bridge */ /* synthetic */ void a(vcr vcrVar) {
    }
}
