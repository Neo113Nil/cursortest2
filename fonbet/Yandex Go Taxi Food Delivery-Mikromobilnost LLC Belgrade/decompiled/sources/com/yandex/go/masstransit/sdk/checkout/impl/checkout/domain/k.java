package com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain;

import com.yandex.fintechsdk.flows.payment.kit.api.widget.PaymentKitWidget;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutErrorReason;
import defpackage.afp0;
import defpackage.akb;
import defpackage.bkb;
import defpackage.blc;
import defpackage.c6p0;
import defpackage.cnb;
import defpackage.enb;
import defpackage.fnb;
import defpackage.g4a0;
import defpackage.gbp0;
import defpackage.gf5;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jo2;
import defpackage.jup0;
import defpackage.l7b;
import defpackage.lkb;
import defpackage.llb;
import defpackage.llc;
import defpackage.mf11;
import defpackage.mkb;
import defpackage.nkb;
import defpackage.ny61;
import defpackage.oob1;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.r1a0;
import defpackage.rmb;
import defpackage.uka0;
import defpackage.umb;
import defpackage.vka0;
import defpackage.yka0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.domain.i0;

/* loaded from: classes12.dex */
public final class k {
    public final fnb a;
    public final fnb b;
    public final enb c;
    public final s d;
    public final com.yandex.go.masstransit.sdk.client_api.a e;
    public final i0 f;
    public final gbp0 g;
    public pzt0 h;
    public pzt0 i;
    public pzt0 j;
    public pzt0 k;
    public pzt0 l;
    public final com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.processor.e m;

    public k(fnb fnbVar, fnb fnbVar2, enb enbVar, s sVar, com.yandex.go.masstransit.sdk.client_api.a aVar, i0 i0Var) {
        this.a = fnbVar;
        this.b = fnbVar2;
        this.c = enbVar;
        this.d = sVar;
        this.e = aVar;
        this.f = i0Var;
        gbp0 gbp0Var = new gbp0(new c6p0(10), "");
        this.g = gbp0Var;
        this.m = new com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.processor.e(gbp0Var, new l7b(9, this), new CheckoutDataInteractor$commandProcessor$2(3, this, k.class, "sendCommandsBatch", "sendCommandsBatch(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
    
        if (r9.h(r10, r1) == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k kVar, mkb mkbVar, ContinuationImpl continuationImpl) {
        CheckoutDataInteractor$initTripFromUrl$1 checkoutDataInteractor$initTripFromUrl$1;
        Object obj;
        Object obj2;
        int i;
        mkb mkbVar2;
        com.yandex.go.masstransit.sdk.client_api.a aVar;
        mkb mkbVar3;
        Throwable a;
        enb enbVar = kVar.c;
        fnb fnbVar = kVar.a;
        if (continuationImpl instanceof CheckoutDataInteractor$initTripFromUrl$1) {
            checkoutDataInteractor$initTripFromUrl$1 = (CheckoutDataInteractor$initTripFromUrl$1) continuationImpl;
            int i2 = checkoutDataInteractor$initTripFromUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutDataInteractor$initTripFromUrl$1.label = i2 - Integer.MIN_VALUE;
                obj = checkoutDataInteractor$initTripFromUrl$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutDataInteractor$initTripFromUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fnbVar.e(rmb.a);
                    com.yandex.go.masstransit.sdk.client_api.a aVar2 = kVar.e;
                    i0 i0Var = kVar.f;
                    checkoutDataInteractor$initTripFromUrl$1.L$0 = mkbVar;
                    checkoutDataInteractor$initTripFromUrl$1.L$1 = aVar2;
                    checkoutDataInteractor$initTripFromUrl$1.label = 1;
                    Object a2 = i0Var.a(checkoutDataInteractor$initTripFromUrl$1);
                    if (a2 != obj2) {
                        mkbVar2 = mkbVar;
                        aVar = aVar2;
                        obj = a2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    mkbVar3 = (mkb) checkoutDataInteractor$initTripFromUrl$1.L$0;
                    kotlin.b.b(obj);
                    jo2 jo2Var = (jo2) obj;
                    Object obj3 = jo2Var.a;
                    a = Result.a(obj3);
                    String str = jo2Var.b;
                    if (a != null) {
                        jup0 jup0Var = (jup0) kotlin.collections.a.R((List) obj3);
                        if (jup0Var != null) {
                            Map a3 = jup0Var.a();
                            checkoutDataInteractor$initTripFromUrl$1.L$0 = null;
                            checkoutDataInteractor$initTripFromUrl$1.L$1 = null;
                            checkoutDataInteractor$initTripFromUrl$1.L$2 = null;
                            checkoutDataInteractor$initTripFromUrl$1.L$3 = null;
                            checkoutDataInteractor$initTripFromUrl$1.L$4 = null;
                            checkoutDataInteractor$initTripFromUrl$1.L$5 = null;
                            checkoutDataInteractor$initTripFromUrl$1.L$6 = null;
                            checkoutDataInteractor$initTripFromUrl$1.label = 3;
                        } else {
                            fnbVar.e(enb.i(mkbVar3, str));
                        }
                    } else {
                        fnbVar.e(enb.i(mkbVar3, str));
                    }
                    return zy11.a;
                }
                aVar = (com.yandex.go.masstransit.sdk.client_api.a) checkoutDataInteractor$initTripFromUrl$1.L$1;
                mkbVar2 = (mkb) checkoutDataInteractor$initTripFromUrl$1.L$0;
                kotlin.b.b(obj);
                String str2 = mkbVar2.a;
                checkoutDataInteractor$initTripFromUrl$1.L$0 = mkbVar2;
                checkoutDataInteractor$initTripFromUrl$1.L$1 = null;
                checkoutDataInteractor$initTripFromUrl$1.label = 2;
                obj = aVar.f((zzs) obj, str2, checkoutDataInteractor$initTripFromUrl$1);
                if (obj != obj2) {
                    mkbVar3 = mkbVar2;
                    jo2 jo2Var2 = (jo2) obj;
                    Object obj32 = jo2Var2.a;
                    a = Result.a(obj32);
                    String str3 = jo2Var2.b;
                    if (a != null) {
                    }
                    return zy11.a;
                }
                return obj2;
            }
        }
        checkoutDataInteractor$initTripFromUrl$1 = new CheckoutDataInteractor$initTripFromUrl$1(kVar, continuationImpl);
        obj = checkoutDataInteractor$initTripFromUrl$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutDataInteractor$initTripFromUrl$1.label;
        if (i != 0) {
        }
        String str22 = mkbVar2.a;
        checkoutDataInteractor$initTripFromUrl$1.L$0 = mkbVar2;
        checkoutDataInteractor$initTripFromUrl$1.L$1 = null;
        checkoutDataInteractor$initTripFromUrl$1.label = 2;
        obj = aVar.f((zzs) obj, str22, checkoutDataInteractor$initTripFromUrl$1);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(k kVar, String str, List list, Continuation continuation) {
        CheckoutDataInteractor$sendCommandsBatch$1 checkoutDataInteractor$sendCommandsBatch$1;
        int i;
        Object obj;
        gf5 gf5Var = gf5.a;
        enb enbVar = kVar.c;
        fnb fnbVar = kVar.a;
        if (continuation instanceof CheckoutDataInteractor$sendCommandsBatch$1) {
            checkoutDataInteractor$sendCommandsBatch$1 = (CheckoutDataInteractor$sendCommandsBatch$1) continuation;
            int i2 = checkoutDataInteractor$sendCommandsBatch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutDataInteractor$sendCommandsBatch$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = checkoutDataInteractor$sendCommandsBatch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutDataInteractor$sendCommandsBatch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fnbVar.c(true);
                    com.yandex.go.masstransit.sdk.client_api.a aVar = kVar.e;
                    checkoutDataInteractor$sendCommandsBatch$1.L$0 = str;
                    checkoutDataInteractor$sendCommandsBatch$1.L$1 = list;
                    checkoutDataInteractor$sendCommandsBatch$1.label = 1;
                    obj2 = aVar.h(str, list, checkoutDataInteractor$sendCommandsBatch$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) checkoutDataInteractor$sendCommandsBatch$1.L$1;
                    str = (String) checkoutDataInteractor$sendCommandsBatch$1.L$0;
                    kotlin.b.b(obj2);
                }
                jo2 jo2Var = (jo2) obj2;
                obj = jo2Var.a;
                if (Result.a(obj) == null) {
                    fnbVar.e(enbVar.h(str, jo2Var));
                    fnbVar.c(false);
                    return gf5Var;
                }
                if (((mf11) obj).b) {
                    fnbVar.c(false);
                    fnbVar.e(enbVar.h(str, jo2Var));
                    return gf5Var;
                }
                Iterable<blc> iterable = (Iterable) kVar.m.d.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    loop0: for (blc blcVar : iterable) {
                        List<blc> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (blc blcVar2 : list2) {
                                if (!jl40.l(blcVar2.a(), blcVar.a()) || !jl40.l(oob1.b(blcVar2), oob1.b(blcVar))) {
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                }
                fnbVar.c(false);
                fnbVar.e(enbVar.h(str, jo2Var));
                return gf5.b;
            }
        }
        checkoutDataInteractor$sendCommandsBatch$1 = new CheckoutDataInteractor$sendCommandsBatch$1(kVar, continuation);
        Object obj22 = checkoutDataInteractor$sendCommandsBatch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutDataInteractor$sendCommandsBatch$1.label;
        if (i != 0) {
        }
        jo2 jo2Var2 = (jo2) obj22;
        obj = jo2Var2.a;
        if (Result.a(obj) == null) {
        }
    }

    public static final void c(k kVar, String str, String str2) {
        kVar.a.b(llb.a);
        pzt0 pzt0Var = kVar.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        kVar.l = gbp0.c(kVar.g, new CheckoutDataInteractor$startPollingCheckoutStatus$1(kVar, str2, str, null));
    }

    public final void d() {
        gbp0 gbp0Var = this.g;
        gbp0Var.a();
        this.m.c();
        gbp0.c(gbp0Var, new CheckoutDataInteractor$attach$1(this, null));
        gbp0.c(gbp0Var, new CheckoutDataInteractor$attach$2(this, null));
        gbp0.c(gbp0Var, new CheckoutDataInteractor$attach$3(this, null));
    }

    public final void e(String str) {
        pzt0 pzt0Var = this.k;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.k = gbp0.c(this.g, new CheckoutDataInteractor$checkoutTrip$1(this, str, null));
    }

    public final void f(String str) {
        pzt0 pzt0Var = this.j;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.j = gbp0.c(this.g, new CheckoutDataInteractor$copyTrip$1(this, str, null));
    }

    public final void g(nkb nkbVar) {
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.h = gbp0.c(this.g, new CheckoutDataInteractor$initTrip$1(nkbVar, this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if (r15 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        if (r15 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Map map, ContinuationImpl continuationImpl) {
        CheckoutDataInteractor$initTripFromContext$1 checkoutDataInteractor$initTripFromContext$1;
        int i;
        yka0 yka0Var;
        cnb g;
        if (continuationImpl instanceof CheckoutDataInteractor$initTripFromContext$1) {
            checkoutDataInteractor$initTripFromContext$1 = (CheckoutDataInteractor$initTripFromContext$1) continuationImpl;
            int i2 = checkoutDataInteractor$initTripFromContext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutDataInteractor$initTripFromContext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkoutDataInteractor$initTripFromContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutDataInteractor$initTripFromContext$1.label;
                zy11 zy11Var = zy11.a;
                fnb fnbVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fnbVar.e(rmb.a);
                    s sVar = this.d;
                    i3y i3yVar = sVar.f;
                    ((PaymentKitWidget) i3yVar.getValue()).reload(map);
                    h hVar = new h(kotlinx.coroutines.flow.e.X(((PaymentKitWidget) i3yVar.getValue()).getState(), new PaymentWidgetHolder$getWidgetState$$inlined$flatMapLatest$1(sVar, null)));
                    checkoutDataInteractor$initTripFromContext$1.L$0 = map;
                    checkoutDataInteractor$initTripFromContext$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(hVar, checkoutDataInteractor$initTripFromContext$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map = (Map) checkoutDataInteractor$initTripFromContext$1.L$0;
                        kotlin.b.b(obj);
                        jo2 jo2Var = (jo2) obj;
                        Object obj2 = jo2Var.a;
                        Throwable a = Result.a(obj2);
                        if (a != null) {
                            fnbVar.e(enb.g(new lkb(map), a, jo2Var.b));
                            return zy11Var;
                        }
                        fnbVar.a = map;
                        Object obj3 = jo2Var.a;
                        Throwable a2 = Result.a(obj3);
                        String str = jo2Var.b;
                        if (a2 == null) {
                            afp0 afp0Var = (afp0) obj3;
                            g = enb.f(this.c, afp0Var, false, str, new bkb(afp0Var.a, str), 2);
                        } else {
                            g = enb.g(new lkb(map), a2, str);
                        }
                        fnbVar.e(g);
                        return zy11Var;
                    }
                    map = (Map) checkoutDataInteractor$initTripFromContext$1.L$0;
                    kotlin.b.b(obj);
                }
                yka0Var = (yka0) obj;
                if (!jl40.l(yka0Var, uka0.a)) {
                    fnbVar.e(new umb(new lkb(map), new akb(CheckoutErrorReason.PaymentMethodsFailure, null, null, null, oyr.i(map.hashCode(), "payment_methods_init:"))));
                    return zy11Var;
                }
                g4a0 g4a0Var = yka0Var instanceof vka0 ? ((vka0) yka0Var).a : null;
                checkoutDataInteractor$initTripFromContext$1.L$0 = map;
                checkoutDataInteractor$initTripFromContext$1.L$1 = null;
                checkoutDataInteractor$initTripFromContext$1.L$2 = null;
                checkoutDataInteractor$initTripFromContext$1.label = 2;
                obj = this.e.e(map, g4a0Var, checkoutDataInteractor$initTripFromContext$1);
            }
        }
        checkoutDataInteractor$initTripFromContext$1 = new CheckoutDataInteractor$initTripFromContext$1(this, continuationImpl);
        Object obj4 = checkoutDataInteractor$initTripFromContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutDataInteractor$initTripFromContext$1.label;
        zy11 zy11Var2 = zy11.a;
        fnb fnbVar2 = this.a;
        if (i != 0) {
        }
        yka0Var = (yka0) obj4;
        if (!jl40.l(yka0Var, uka0.a)) {
        }
    }

    public final void i(r1a0 r1a0Var) {
        gbp0.c(this.g, new CheckoutDataInteractor$reloadPaymentWidget$1(this, r1a0Var, null));
    }

    public final void j(String str) {
        pzt0 pzt0Var = this.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.i = gbp0.c(this.g, new CheckoutDataInteractor$reloadTrip$1(this, str, null));
    }

    public final void k(String str, String str2) {
        gbp0.c(this.g, new CheckoutDataInteractor$restartPollingOrderStatus$1(this, str, str2, null));
    }

    public final void l(blc blcVar) {
        Object value;
        ArrayList arrayList;
        llc a = this.b.a();
        if (a == null || a.a.length() <= 0 || a.c) {
            return;
        }
        r0 r0Var = this.m.d;
        do {
            value = r0Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                blc blcVar2 = (blc) obj;
                if (blcVar2.a() == null || !jl40.l(blcVar2.a(), blcVar.a())) {
                    arrayList.add(obj);
                }
            }
        } while (!r0Var.k(value, kotlin.collections.a.o0(arrayList, blcVar)));
    }
}
