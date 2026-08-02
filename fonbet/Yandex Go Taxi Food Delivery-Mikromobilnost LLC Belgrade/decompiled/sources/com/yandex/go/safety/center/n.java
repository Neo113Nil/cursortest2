package com.yandex.go.safety.center;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.dab1;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.hxx;
import defpackage.itl0;
import defpackage.jqz0;
import defpackage.m950;
import defpackage.ng11;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.oh11;
import defpackage.p2y0;
import defpackage.pep0;
import defpackage.pg11;
import defpackage.qg11;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class n extends qg11 {
    public final com.yandex.go.lifecycle.a b;
    public final yvf0 c;
    public final h3y d;
    public final yvf0 e;
    public final p2y0 f;

    public n(com.yandex.go.lifecycle.a aVar, jqz0 jqz0Var, h3y h3yVar, yvf0 yvf0Var, p2y0 p2y0Var) {
        this.b = aVar;
        this.c = jqz0Var;
        this.d = h3yVar;
        this.e = yvf0Var;
        this.f = p2y0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (pg11) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fb, code lost:
    
        if (r3.a(r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (r3.a(r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, pg11 pg11Var, ContinuationImpl continuationImpl) {
        TrustedContactsDeeplinkHandler$handleDeeplink$1 trustedContactsDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        oep0 oep0Var2;
        String str;
        if (continuationImpl instanceof TrustedContactsDeeplinkHandler$handleDeeplink$1) {
            trustedContactsDeeplinkHandler$handleDeeplink$1 = (TrustedContactsDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = trustedContactsDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trustedContactsDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = trustedContactsDeeplinkHandler$handleDeeplink$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trustedContactsDeeplinkHandler$handleDeeplink$1.label;
                com.yandex.go.lifecycle.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ng11 ng11Var = (ng11) this.d.get();
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$1 = pg11Var;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = ng11Var.a(trustedContactsDeeplinkHandler$handleDeeplink$1);
                } else if (i == 1) {
                    pg11Var = (pg11) trustedContactsDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) trustedContactsDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i == 2) {
                        oep0Var = (oep0) trustedContactsDeeplinkHandler$handleDeeplink$1.L$0;
                        kotlin.b.b(obj);
                        ((pep0) oep0Var).f((m950) this.c.get(), new oh11(), hxx.a);
                        return zy11.a;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) trustedContactsDeeplinkHandler$handleDeeplink$1.L$4;
                        oep0Var2 = (oep0) trustedContactsDeeplinkHandler$handleDeeplink$1.L$0;
                        kotlin.b.b(obj);
                        ((pep0) oep0Var2).f((m950) this.e.get(), new itl0(SafetyCenterParams$Source.SAFETY_CENTER_DEEPLINK, str, dab1.O), hxx.a);
                        return zy11.a;
                    }
                    oep0Var = (oep0) trustedContactsDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                    oep0Var2 = oep0Var;
                    str = (String) obj;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var2;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$4 = str;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.label = 4;
                }
                if (((Boolean) obj).booleanValue()) {
                    String a = pg11Var.a();
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.label = 3;
                    obj = e(a, trustedContactsDeeplinkHandler$handleDeeplink$1);
                } else {
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    trustedContactsDeeplinkHandler$handleDeeplink$1.label = 2;
                }
                return obj2;
            }
        }
        trustedContactsDeeplinkHandler$handleDeeplink$1 = new TrustedContactsDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = trustedContactsDeeplinkHandler$handleDeeplink$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trustedContactsDeeplinkHandler$handleDeeplink$1.label;
        com.yandex.go.lifecycle.a aVar2 = this.b;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        TrustedContactsDeeplinkHandler$tryToGetOrderId$1 trustedContactsDeeplinkHandler$tryToGetOrderId$1;
        int i;
        if (continuationImpl instanceof TrustedContactsDeeplinkHandler$tryToGetOrderId$1) {
            trustedContactsDeeplinkHandler$tryToGetOrderId$1 = (TrustedContactsDeeplinkHandler$tryToGetOrderId$1) continuationImpl;
            int i2 = trustedContactsDeeplinkHandler$tryToGetOrderId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trustedContactsDeeplinkHandler$tryToGetOrderId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trustedContactsDeeplinkHandler$tryToGetOrderId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trustedContactsDeeplinkHandler$tryToGetOrderId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        return str;
                    }
                    trustedContactsDeeplinkHandler$tryToGetOrderId$1.L$0 = str;
                    trustedContactsDeeplinkHandler$tryToGetOrderId$1.label = 1;
                    obj = ((e0) this.f).y(trustedContactsDeeplinkHandler$tryToGetOrderId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) trustedContactsDeeplinkHandler$tryToGetOrderId$1.L$0;
                    kotlin.b.b(obj);
                }
                o2y0 o2y0Var = (o2y0) obj;
                return (o2y0Var == null && o2y0Var.e()) ? o2y0Var.b().a : str;
            }
        }
        trustedContactsDeeplinkHandler$tryToGetOrderId$1 = new TrustedContactsDeeplinkHandler$tryToGetOrderId$1(this, continuationImpl);
        Object obj2 = trustedContactsDeeplinkHandler$tryToGetOrderId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trustedContactsDeeplinkHandler$tryToGetOrderId$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var2 = (o2y0) obj2;
        if (o2y0Var2 == null) {
        }
    }
}
