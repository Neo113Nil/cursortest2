package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.models.SummaryRedirectActionModel;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.arv0;
import defpackage.bhv0;
import defpackage.bvf0;
import defpackage.c4r0;
import defpackage.c4w0;
import defpackage.c8r;
import defpackage.ck31;
import defpackage.dab1;
import defpackage.dd61;
import defpackage.dqe0;
import defpackage.egz;
import defpackage.fjv0;
import defpackage.fse0;
import defpackage.g6u;
import defpackage.ghv0;
import defpackage.hhv0;
import defpackage.hre0;
import defpackage.hxx;
import defpackage.i270;
import defpackage.icv0;
import defpackage.ijv0;
import defpackage.jhv0;
import defpackage.jjv0;
import defpackage.k9s0;
import defpackage.kpi0;
import defpackage.lse0;
import defpackage.m950;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o820;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.po21;
import defpackage.scb1;
import defpackage.sjh;
import defpackage.sxg;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vpe0;
import defpackage.ynv0;
import defpackage.yvf0;
import defpackage.yyr0;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes.dex */
public final class c implements c4w0 {
    public final tt2 a;
    public final dqe0 b;
    public final ck31 c;
    public final jjv0 d;
    public final arv0 e;
    public final i270 f;
    public final po21 g;
    public final ru.yandex.taxi.deeplinks.e h;
    public final ru.yandex.taxi.shortcuts.interactors.a i;
    public final c4r0 j;
    public final yvf0 k;
    public final icv0 l;
    public final kpi0 m;
    public final c8r n;
    public final oep0 o;

    public c(tt2 tt2Var, dqe0 dqe0Var, ck31 ck31Var, jjv0 jjv0Var, arv0 arv0Var, i270 i270Var, po21 po21Var, ru.yandex.taxi.deeplinks.e eVar, ru.yandex.taxi.shortcuts.interactors.a aVar, c4r0 c4r0Var, yvf0 yvf0Var, icv0 icv0Var, kpi0 kpi0Var, c8r c8rVar, oep0 oep0Var) {
        this.a = tt2Var;
        this.b = dqe0Var;
        this.c = ck31Var;
        this.d = jjv0Var;
        this.e = arv0Var;
        this.f = i270Var;
        this.g = po21Var;
        this.h = eVar;
        this.i = aVar;
        this.j = c4r0Var;
        this.k = yvf0Var;
        this.l = icv0Var;
        this.m = kpi0Var;
        this.n = c8rVar;
        this.o = oep0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ContinuationImpl continuationImpl) {
        SuperAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1 superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof SuperAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1) {
            superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1 = (SuperAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1) continuationImpl;
            int i2 = superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.taxi.tariffs.internal.repository.h i3 = ((k) cVar.c).i();
                    SuperAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$2 superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$2 = new SuperAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$2();
                    superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(i3, superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$2, superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1 = new SuperAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1(cVar, continuationImpl);
        Object obj2 = superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenSummaryRedirectNavigatorImpl$listenNonEmptyVerticalsEvent$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|(1:23))(1:24))|12|13|14))|29|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        defpackage.jst.e.k(r5, "Cant resolve destination for summary redirect");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable b(c cVar, SummaryRedirectActionModel summaryRedirectActionModel, yyr0 yyr0Var, ContinuationImpl continuationImpl) {
        SuperAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1 superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof SuperAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1) {
            superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1 = (SuperAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1) continuationImpl;
            int i2 = superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1.label;
                Address address = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SummaryRedirectActionModel.a a = summaryRedirectActionModel.a();
                    if (a == null) {
                        return null;
                    }
                    ru.yandex.taxi.shortcuts.interactors.a aVar = cVar.i;
                    zzs b = a.b();
                    String a2 = a.a();
                    o820 c = scb1.c(yyr0Var);
                    superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1.L$0 = null;
                    superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1.L$1 = null;
                    superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1.L$2 = null;
                    superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1.label = 1;
                    obj = aVar.a(b, a2, c, false, superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1);
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
                address = ((sxg) obj).a.a;
                return address;
            }
        }
        superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1 = new SuperAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1(cVar, continuationImpl);
        Object obj2 = superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenSummaryRedirectNavigatorImpl$resolveDestinationAddressFromAction$1.label;
        Address address2 = null;
        if (i != 0) {
        }
        address2 = ((sxg) obj2).a.a;
        return address2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r8 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (defpackage.tje.k0(r8, r2, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, ContinuationImpl continuationImpl) {
        SuperAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1 superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof SuperAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1) {
            superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1 = (SuperAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1) continuationImpl;
            int i2 = superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ZoneAddress f = cVar.b.f();
                    if (f != null) {
                        return f;
                    }
                    cVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    SuperAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$2 superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$2 = new SuperAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$2(cVar, null);
                    superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.L$0 = null;
                    superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.label = 1;
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((dd61) obj).a();
                    }
                    kotlin.b.b(obj);
                    tpr g = cVar.h.g(((mo21) obj).a(), null, true, false);
                    superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.L$0 = null;
                    superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.L$1 = null;
                    superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.label = 3;
                    obj = kotlinx.coroutines.flow.e.y(g, superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1);
                }
                po21 po21Var = cVar.g;
                superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.L$0 = null;
                superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.label = 2;
                obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1);
            }
        }
        superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1 = new SuperAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1(cVar, continuationImpl);
        Object obj2 = superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.label;
        if (i != 0) {
        }
        po21 po21Var2 = cVar.g;
        superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.L$0 = null;
        superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1.label = 2;
        obj2 = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var2).h(superAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k9s0 d(SummaryRedirectActionModel summaryRedirectActionModel) {
        ynv0 b = summaryRedirectActionModel.b();
        this.d.getClass();
        ijv0 a = jjv0.a(b);
        Object[] objArr = 0;
        if (a == null) {
            a = new fjv0(objArr == true ? 1 : 0);
        }
        boolean z = summaryRedirectActionModel.c() == SummaryRedirectActionModel.State.EXPANDED;
        bhv0 bhv0Var = new bhv0(new jhv0(z ? new hhv0(SummaryExpandReason.AUTO_DELIVERY_REDIRECT_ACTION) : ghv0.a, z));
        k9s0 k9s0Var = k9s0.f;
        return egz.G(true, bhv0Var, a);
    }

    public final Object e(SummaryRedirectActionModel summaryRedirectActionModel, yyr0 yyr0Var, tls tlsVar, SuspendLambda suspendLambda) {
        Object n = bvf0.n(new SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2(this, summaryRedirectActionModel, tlsVar, yyr0Var, null), suspendLambda);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }

    public final void f(Preorder preorder, k9s0 k9s0Var) {
        dab1 dab1Var = dab1.b;
        boolean a = this.l.a(new SuitabilityCheckType[0]);
        yvf0 yvf0Var = this.k;
        oep0 oep0Var = this.o;
        if (a) {
            ((pep0) oep0Var).f((m950) yvf0Var.get(), new hre0(new vpe0(preorder), new lse0(k9s0Var), "open summary from handle redirect action on super-app main screen", true, dab1Var), hxx.a);
        } else {
            ((pep0) oep0Var).f((m950) yvf0Var.get(), new hre0(new vpe0(preorder), new fse0(k9s0Var), "open summary from handle redirect action on super-app main screen", true, dab1Var), hxx.a);
        }
    }
}
