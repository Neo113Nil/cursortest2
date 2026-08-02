package com.yandex.go.promocodes.base.impl.promo_codes.data.repositories;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.go.promocodes.base.api.domain.entities.status.PromoCodeStatus;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.activation.PromoCodeActivationResponseDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list.PromoCodeListResponseDto;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.zone.model.Zone;
import defpackage.a7t0;
import defpackage.ate0;
import defpackage.bre0;
import defpackage.bvf0;
import defpackage.cne0;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.ha2;
import defpackage.hit;
import defpackage.imf0;
import defpackage.jl40;
import defpackage.knf0;
import defpackage.lmf0;
import defpackage.lnf0;
import defpackage.md3;
import defpackage.mj21;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qqo;
import defpackage.rmf0;
import defpackage.sjh;
import defpackage.smf0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uw60;
import defpackage.uyj;
import defpackage.va90;
import defpackage.wlf0;
import defpackage.ycc;
import defpackage.yqv0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.experiments.d;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes8.dex */
public final class c implements uw60, bre0 {
    public final h3y a;
    public final g b;
    public final tt2 c;
    public final lmf0 d;
    public final h3y e;
    public final h3y f;
    public final h3y g;
    public final h3y h;
    public final h3y i;
    public final va90 j;
    public final hit k;
    public final r0 l = bvf0.c(new knf0(0, EmptyList.a));
    public final r0 m = bvf0.c(Boolean.FALSE);
    public pzt0 n;

    public c(h3y h3yVar, g gVar, tt2 tt2Var, lmf0 lmf0Var, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, va90 va90Var, hit hitVar) {
        this.a = h3yVar;
        this.b = gVar;
        this.c = tt2Var;
        this.d = lmf0Var;
        this.e = h3yVar2;
        this.f = h3yVar3;
        this.g = h3yVar4;
        this.h = h3yVar5;
        this.i = h3yVar6;
        this.j = va90Var;
        this.k = hitVar;
    }

    public static ArrayList j(String str, List list) {
        Iterator it;
        List list2 = list;
        int i = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            rmf0 rmf0Var = (rmf0) it2.next();
            List<wlf0> list3 = rmf0Var.b;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, i));
            for (wlf0 wlf0Var : list3) {
                boolean l = jl40.l(wlf0Var.f, str);
                if (evu0.J(str)) {
                    it = it2;
                } else {
                    it = it2;
                    wlf0Var = new wlf0(wlf0Var.a, wlf0Var.b, wlf0Var.c, wlf0Var.d, wlf0Var.e, wlf0Var.f, wlf0Var.g, wlf0Var.h, wlf0Var.i, l, wlf0Var.k, wlf0Var.l, wlf0Var.m, wlf0Var.n, wlf0Var.o);
                }
                arrayList2.add(wlf0Var);
                it2 = it;
            }
            arrayList.add(new rmf0(rmf0Var.a, arrayList2));
            it2 = it2;
            i = 10;
        }
        return arrayList;
    }

    @Override // defpackage.uw60
    public final Object a(Continuation continuation) {
        ((smf0) this.a.get()).a.a();
        lmf0 lmf0Var = this.d;
        cne0 cne0Var = lmf0Var.a;
        cne0Var.w("valid");
        cne0Var.w(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        cne0Var.w("details");
        cne0Var.w("gotCouponCheck");
        cne0Var.w("canUseAnyway");
        cne0Var.w(ErrorResponseData.JSON_ERROR_CODE);
        cne0 cne0Var2 = lmf0Var.a;
        cne0Var2.w("promocode");
        cne0Var2.w(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        cne0Var2.w("details");
        cne0Var2.w("canUseAnyway");
        cne0Var2.w("valid");
        ((mj21) this.h.get()).a.l(null);
        return zy11.a;
    }

    @Override // defpackage.bre0
    public final void b() {
        knf0 knf0Var = new knf0(i(), EmptyList.a);
        r0 r0Var = this.l;
        r0Var.getClass();
        r0Var.m(null, knf0Var);
    }

    public final ha2 c() {
        return e.m(this.l, ((mj21) this.h.get()).b, ((ru.yandex.taxi.maas.impl.ride.c) this.i.get()).a(), this.m, new PromoCodesRepositoryImpl$activePromoCodeFlow$1(this, null));
    }

    public final boolean d(Zone zone) {
        String g;
        if (((String) ((mj21) this.h.get()).a.getValue()) != null) {
            return true;
        }
        ru.yandex.taxi.maas.impl.ride.c cVar = (ru.yandex.taxi.maas.impl.ride.c) this.i.get();
        yqv0 a = ((a7t0) cVar.a).a();
        String str = (a.a == SummaryUiState$Type.TRAP && jl40.l(a.b, cVar.d)) ? cVar.c : "";
        if (str == null || str.length() == 0) {
            return (zone == null || !zone.g.a || (g = g()) == null || g.length() == 0) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(4:19|(2:23|(1:25))|13|14)|12|13|14))|30|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        defpackage.jst.e.k(r5, "Got error while activating saved promo code");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        PromoCodesRepositoryImpl$checkLegacy$1 promoCodesRepositoryImpl$checkLegacy$1;
        int i;
        if (continuationImpl instanceof PromoCodesRepositoryImpl$checkLegacy$1) {
            promoCodesRepositoryImpl$checkLegacy$1 = (PromoCodesRepositoryImpl$checkLegacy$1) continuationImpl;
            int i2 = promoCodesRepositoryImpl$checkLegacy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodesRepositoryImpl$checkLegacy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoCodesRepositoryImpl$checkLegacy$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodesRepositoryImpl$checkLegacy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String l = this.d.a.l("promocode", null);
                    if (l != null && !evu0.J(l)) {
                        promoCodesRepositoryImpl$checkLegacy$1.L$0 = null;
                        promoCodesRepositoryImpl$checkLegacy$1.L$1 = null;
                        promoCodesRepositoryImpl$checkLegacy$1.label = 1;
                        if (k(str, l, promoCodesRepositoryImpl$checkLegacy$1) == obj2) {
                            return obj2;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
        }
        promoCodesRepositoryImpl$checkLegacy$1 = new PromoCodesRepositoryImpl$checkLegacy$1(this, continuationImpl);
        Object obj3 = promoCodesRepositoryImpl$checkLegacy$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodesRepositoryImpl$checkLegacy$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void f() {
        ((mj21) this.h.get()).a.l(null);
        ((smf0) this.a.get()).a.a();
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.m;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    public final String g() {
        Object obj;
        String str = (String) ((mj21) this.h.get()).a.getValue();
        if (str != null) {
            return str;
        }
        ru.yandex.taxi.maas.impl.ride.c cVar = (ru.yandex.taxi.maas.impl.ride.c) this.i.get();
        yqv0 a = ((a7t0) cVar.a).a();
        String str2 = (a.a == SummaryUiState$Type.TRAP && jl40.l(a.b, cVar.d)) ? cVar.c : "";
        if (str2 != null && str2.length() != 0) {
            return str2;
        }
        if (!((Boolean) this.m.getValue()).booleanValue()) {
            String a2 = ((com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.c) this.g.get()).a.a();
            List h = h();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : h) {
                if (jl40.l(((lnf0) obj2).a, a2)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList3 = ((lnf0) it.next()).c;
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    ycc.r(((rmf0) it2.next()).b, arrayList4);
                }
                ycc.r(arrayList4, arrayList2);
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (((wlf0) obj).j) {
                    break;
                }
            }
            wlf0 wlf0Var = (wlf0) obj;
            if (wlf0Var != null) {
                return wlf0Var.f;
            }
        }
        return null;
    }

    public final List h() {
        Object value = this.l.getValue();
        if (((knf0) value).a != i()) {
            value = null;
        }
        knf0 knf0Var = (knf0) value;
        return knf0Var != null ? knf0Var.b : EmptyList.a;
    }

    public final long i() {
        return this.b.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, ContinuationImpl continuationImpl) {
        PromoCodesRepositoryImpl$promoCodeActivate$1 promoCodesRepositoryImpl$promoCodeActivate$1;
        int i;
        PromoCodeDto a;
        if (continuationImpl instanceof PromoCodesRepositoryImpl$promoCodeActivate$1) {
            promoCodesRepositoryImpl$promoCodeActivate$1 = (PromoCodesRepositoryImpl$promoCodeActivate$1) continuationImpl;
            int i2 = promoCodesRepositoryImpl$promoCodeActivate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodesRepositoryImpl$promoCodeActivate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoCodesRepositoryImpl$promoCodeActivate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodesRepositoryImpl$promoCodeActivate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.c cVar = (com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.c) this.e.get();
                    promoCodesRepositoryImpl$promoCodeActivate$1.L$0 = null;
                    promoCodesRepositoryImpl$promoCodeActivate$1.L$1 = null;
                    promoCodesRepositoryImpl$promoCodeActivate$1.label = 1;
                    obj = cVar.a(str, str2, promoCodesRepositoryImpl$promoCodeActivate$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                a = ((PromoCodeActivationResponseDto) obj).getA();
                if (a == null) {
                    return ((imf0) this.f.get()).a(a);
                }
                return null;
            }
        }
        promoCodesRepositoryImpl$promoCodeActivate$1 = new PromoCodesRepositoryImpl$promoCodeActivate$1(this, continuationImpl);
        Object obj2 = promoCodesRepositoryImpl$promoCodeActivate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodesRepositoryImpl$promoCodeActivate$1.label;
        if (i != 0) {
        }
        a = ((PromoCodeActivationResponseDto) obj2).getA();
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0100, code lost:
    
        if (r2 != r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c A[Catch: Exception -> 0x0106, CancellationException -> 0x010d, TryCatch #2 {CancellationException -> 0x010d, Exception -> 0x0106, blocks: (B:15:0x003d, B:16:0x0103, B:23:0x0050, B:25:0x00e4, B:29:0x0066, B:30:0x00c2, B:31:0x00ce, B:36:0x0072, B:38:0x008b, B:40:0x009c, B:46:0x007b), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, List list, ContinuationImpl continuationImpl) {
        PromoCodesRepositoryImpl$promoCodesList$1 promoCodesRepositoryImpl$promoCodesList$1;
        int i;
        String str2;
        List list2;
        List list3;
        List list4;
        String str3;
        List list5;
        com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.c cVar;
        String str4;
        List list6;
        com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.c cVar2;
        String str5;
        try {
            if (continuationImpl instanceof PromoCodesRepositoryImpl$promoCodesList$1) {
                promoCodesRepositoryImpl$promoCodesList$1 = (PromoCodesRepositoryImpl$promoCodesList$1) continuationImpl;
                int i2 = promoCodesRepositoryImpl$promoCodesList$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    promoCodesRepositoryImpl$promoCodesList$1.label = i2 - Integer.MIN_VALUE;
                    PromoCodesRepositoryImpl$promoCodesList$1 promoCodesRepositoryImpl$promoCodesList$12 = promoCodesRepositoryImpl$promoCodesList$1;
                    Object obj = promoCodesRepositoryImpl$promoCodesList$12.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = promoCodesRepositoryImpl$promoCodesList$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        promoCodesRepositoryImpl$promoCodesList$12.L$0 = str;
                        promoCodesRepositoryImpl$promoCodesList$12.L$1 = list;
                        promoCodesRepositoryImpl$promoCodesList$12.label = 1;
                        if (e(str, promoCodesRepositoryImpl$promoCodesList$12) == obj2) {
                            return obj2;
                        }
                        str2 = str;
                        list2 = list;
                    } else if (i == 1) {
                        List list7 = (List) promoCodesRepositoryImpl$promoCodesList$12.L$1;
                        String str6 = (String) promoCodesRepositoryImpl$promoCodesList$12.L$0;
                        kotlin.b.b(obj);
                        list2 = list7;
                        str2 = str6;
                    } else if (i == 2) {
                        cVar2 = (com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.c) promoCodesRepositoryImpl$promoCodesList$12.L$3;
                        str4 = (String) promoCodesRepositoryImpl$promoCodesList$12.L$2;
                        list6 = (List) promoCodesRepositoryImpl$promoCodesList$12.L$1;
                        str3 = (String) promoCodesRepositoryImpl$promoCodesList$12.L$0;
                        kotlin.b.b(obj);
                        List list8 = (List) obj;
                        cVar = cVar2;
                        list5 = list6;
                        list4 = list8;
                        promoCodesRepositoryImpl$promoCodesList$12.L$0 = str3;
                        promoCodesRepositoryImpl$promoCodesList$12.L$1 = list5;
                        promoCodesRepositoryImpl$promoCodesList$12.L$2 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.L$3 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.label = 3;
                        obj = cVar.c(str4, list4, promoCodesRepositoryImpl$promoCodesList$12);
                        if (obj == obj2) {
                            return obj2;
                        }
                        str5 = str3;
                        List list9 = list5;
                        this.c.getClass();
                        sjh sjhVar = uyj.a;
                        PromoCodesRepositoryImpl$promoCodesList$2$1 promoCodesRepositoryImpl$promoCodesList$2$1 = new PromoCodesRepositoryImpl$promoCodesList$2$1(this, (PromoCodeListResponseDto) obj, str5, list9, null);
                        promoCodesRepositoryImpl$promoCodesList$12.L$0 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.L$1 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.L$2 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.label = 4;
                        obj = tje.k0(sjhVar, promoCodesRepositoryImpl$promoCodesList$2$1, promoCodesRepositoryImpl$promoCodesList$12);
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return (List) obj;
                        }
                        list5 = (List) promoCodesRepositoryImpl$promoCodesList$12.L$1;
                        str5 = (String) promoCodesRepositoryImpl$promoCodesList$12.L$0;
                        kotlin.b.b(obj);
                        List list92 = list5;
                        this.c.getClass();
                        sjh sjhVar2 = uyj.a;
                        PromoCodesRepositoryImpl$promoCodesList$2$1 promoCodesRepositoryImpl$promoCodesList$2$12 = new PromoCodesRepositoryImpl$promoCodesList$2$1(this, (PromoCodeListResponseDto) obj, str5, list92, null);
                        promoCodesRepositoryImpl$promoCodesList$12.L$0 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.L$1 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.L$2 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.label = 4;
                        obj = tje.k0(sjhVar2, promoCodesRepositoryImpl$promoCodesList$2$12, promoCodesRepositoryImpl$promoCodesList$12);
                    }
                    com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.c cVar3 = (com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.c) this.e.get();
                    list3 = list2;
                    if (list3.isEmpty()) {
                        list4 = list3;
                        str3 = str2;
                        list5 = list2;
                        cVar = cVar3;
                        str4 = str3;
                        promoCodesRepositoryImpl$promoCodesList$12.L$0 = str3;
                        promoCodesRepositoryImpl$promoCodesList$12.L$1 = list5;
                        promoCodesRepositoryImpl$promoCodesList$12.L$2 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.L$3 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.label = 3;
                        obj = cVar.c(str4, list4, promoCodesRepositoryImpl$promoCodesList$12);
                        if (obj == obj2) {
                        }
                    } else {
                        promoCodesRepositoryImpl$promoCodesList$12.L$0 = str2;
                        promoCodesRepositoryImpl$promoCodesList$12.L$1 = list2;
                        promoCodesRepositoryImpl$promoCodesList$12.L$2 = str2;
                        promoCodesRepositoryImpl$promoCodesList$12.L$3 = cVar3;
                        promoCodesRepositoryImpl$promoCodesList$12.label = 2;
                        Object y = e.y(new com.yandex.go.promocodes.base.impl.promo_codes.data.experiments.c(d.a((qqo) this.j.a)), promoCodesRepositoryImpl$promoCodesList$12);
                        if (y == obj2) {
                            return obj2;
                        }
                        list6 = list2;
                        obj = y;
                        str3 = str2;
                        cVar2 = cVar3;
                        str4 = str3;
                        List list82 = (List) obj;
                        cVar = cVar2;
                        list5 = list6;
                        list4 = list82;
                        promoCodesRepositoryImpl$promoCodesList$12.L$0 = str3;
                        promoCodesRepositoryImpl$promoCodesList$12.L$1 = list5;
                        promoCodesRepositoryImpl$promoCodesList$12.L$2 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.L$3 = null;
                        promoCodesRepositoryImpl$promoCodesList$12.label = 3;
                        obj = cVar.c(str4, list4, promoCodesRepositoryImpl$promoCodesList$12);
                        if (obj == obj2) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.c cVar32 = (com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.c) this.e.get();
            list3 = list2;
            if (list3.isEmpty()) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        promoCodesRepositoryImpl$promoCodesList$1 = new PromoCodesRepositoryImpl$promoCodesList$1(this, continuationImpl);
        PromoCodesRepositoryImpl$promoCodesList$1 promoCodesRepositoryImpl$promoCodesList$122 = promoCodesRepositoryImpl$promoCodesList$1;
        Object obj3 = promoCodesRepositoryImpl$promoCodesList$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodesRepositoryImpl$promoCodesList$122.label;
    }

    public final void m(String str) {
        Boolean bool = Boolean.FALSE;
        r0 r0Var = this.m;
        r0Var.getClass();
        r0Var.m(null, bool);
        ((mj21) this.h.get()).a.l(str);
        ((smf0) this.a.get()).a.r("selected_promo", str);
    }

    public final ArrayList n(String str, ArrayList arrayList, List list) {
        Object obj;
        List singletonList = Collections.singletonList(new rmf0(null, arrayList));
        h3y h3yVar = this.a;
        String l = ((smf0) h3yVar.get()).a.l("selected_promo", null);
        if (l == null) {
            l = "";
        }
        if (!evu0.J(l)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = singletonList.iterator();
            while (it.hasNext()) {
                ycc.r(((rmf0) it.next()).b, arrayList2);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (jl40.l(((wlf0) obj).f, l)) {
                    break;
                }
            }
            wlf0 wlf0Var = (wlf0) obj;
            if (wlf0Var == null || wlf0Var.g == PromoCodeStatus.INVALID) {
                ((smf0) h3yVar.get()).a.a();
            }
        }
        String l2 = ((smf0) h3yVar.get()).a.l("selected_promo", null);
        ArrayList j = j(l2 != null ? l2 : "", singletonList);
        o(new lnf0(str, j, list));
        return j;
    }

    public final void o(lnf0 lnf0Var) {
        r0 r0Var;
        knf0 knf0Var;
        ArrayList arrayList;
        do {
            r0Var = this.l;
            knf0Var = (knf0) r0Var.getValue();
            arrayList = new ArrayList(knf0Var.b);
            arrayList.removeIf(new md3(16, new ate0(1, lnf0Var)));
            arrayList.add(lnf0Var);
        } while (!r0Var.k(knf0Var, new knf0(i(), arrayList)));
    }

    public final void p() {
        String a = ((com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.c) this.g.get()).a.a();
        if (a == null) {
            a = "";
        }
        List h = h();
        if ((h instanceof Collection) && h.isEmpty()) {
            return;
        }
        Iterator it = h.iterator();
        while (it.hasNext()) {
            if (jl40.l(((lnf0) it.next()).a, a)) {
                q(a);
                return;
            }
        }
    }

    public final void q(String str) {
        long i = i();
        List h = h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h) {
            if (!jl40.l(((lnf0) obj).a, str)) {
                arrayList.add(obj);
            }
        }
        knf0 knf0Var = new knf0(i, arrayList);
        r0 r0Var = this.l;
        r0Var.getClass();
        r0Var.m(null, knf0Var);
        pzt0 pzt0Var = this.n;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.n = tje.N(this.k.a, null, null, new PromoCodesRepositoryImpl$updateTaxiPromoCodes$3(this, str, null), 3);
    }

    public final void r(String str) {
        List h = h();
        if (!(h instanceof Collection) || !h.isEmpty()) {
            Iterator it = h.iterator();
            while (it.hasNext()) {
                if (jl40.l(((lnf0) it.next()).a, str)) {
                    return;
                }
            }
        }
        q(str);
    }
}
