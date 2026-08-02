package com.yandex.go.safety.center;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.evu0;
import defpackage.hxx;
import defpackage.itl0;
import defpackage.jst;
import defpackage.m950;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.p2y0;
import defpackage.pep0;
import defpackage.ti;
import defpackage.v770;
import defpackage.vi;
import defpackage.wfz;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class a extends vi {
    public final com.yandex.go.lifecycle.a b;
    public final p2y0 c;
    public final yvf0 d;

    public a(com.yandex.go.lifecycle.a aVar, p2y0 p2y0Var, yvf0 yvf0Var) {
        this.b = aVar;
        this.c = p2y0Var;
        this.d = yvf0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (ti) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, ti tiVar, ContinuationImpl continuationImpl) {
        AccidentDeeplinkHandler$handleDeeplink$1 accidentDeeplinkHandler$handleDeeplink$1;
        int i;
        zy11 zy11Var;
        String str;
        oep0 oep0Var2;
        String str2;
        if (continuationImpl instanceof AccidentDeeplinkHandler$handleDeeplink$1) {
            accidentDeeplinkHandler$handleDeeplink$1 = (AccidentDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = accidentDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accidentDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accidentDeeplinkHandler$handleDeeplink$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accidentDeeplinkHandler$handleDeeplink$1.label;
                zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = tiVar.a();
                    accidentDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    accidentDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    accidentDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    accidentDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    accidentDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = e(a, accidentDeeplinkHandler$handleDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) accidentDeeplinkHandler$handleDeeplink$1.L$4;
                        oep0Var2 = (oep0) accidentDeeplinkHandler$handleDeeplink$1.L$0;
                        kotlin.b.b(obj);
                        ((pep0) oep0Var2).f((m950) this.d.get(), new itl0(SafetyCenterParams$Source.ACCIDENT_DEEPLINK, str2, wfz.O), hxx.a);
                        return zy11Var;
                    }
                    oep0Var = (oep0) accidentDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                str = (String) obj;
                if (str != null || evu0.J(str)) {
                    jst.e.j(new IllegalArgumentException("Failed to process 'accident' deeplink, required order_id parameter is empty"));
                    return zy11Var;
                }
                accidentDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                accidentDeeplinkHandler$handleDeeplink$1.L$1 = null;
                accidentDeeplinkHandler$handleDeeplink$1.L$2 = null;
                accidentDeeplinkHandler$handleDeeplink$1.L$3 = null;
                accidentDeeplinkHandler$handleDeeplink$1.L$4 = str;
                accidentDeeplinkHandler$handleDeeplink$1.label = 2;
                if (this.b.a(accidentDeeplinkHandler$handleDeeplink$1) != obj2) {
                    oep0Var2 = oep0Var;
                    str2 = str;
                    ((pep0) oep0Var2).f((m950) this.d.get(), new itl0(SafetyCenterParams$Source.ACCIDENT_DEEPLINK, str2, wfz.O), hxx.a);
                    return zy11Var;
                }
                return obj2;
            }
        }
        accidentDeeplinkHandler$handleDeeplink$1 = new AccidentDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj3 = accidentDeeplinkHandler$handleDeeplink$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accidentDeeplinkHandler$handleDeeplink$1.label;
        zy11Var = zy11.a;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
        jst.e.j(new IllegalArgumentException("Failed to process 'accident' deeplink, required order_id parameter is empty"));
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        AccidentDeeplinkHandler$tryToGetOrderId$1 accidentDeeplinkHandler$tryToGetOrderId$1;
        int i;
        if (continuationImpl instanceof AccidentDeeplinkHandler$tryToGetOrderId$1) {
            accidentDeeplinkHandler$tryToGetOrderId$1 = (AccidentDeeplinkHandler$tryToGetOrderId$1) continuationImpl;
            int i2 = accidentDeeplinkHandler$tryToGetOrderId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accidentDeeplinkHandler$tryToGetOrderId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accidentDeeplinkHandler$tryToGetOrderId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accidentDeeplinkHandler$tryToGetOrderId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        return str;
                    }
                    accidentDeeplinkHandler$tryToGetOrderId$1.L$0 = str;
                    accidentDeeplinkHandler$tryToGetOrderId$1.label = 1;
                    obj = ((e0) this.c).y(accidentDeeplinkHandler$tryToGetOrderId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) accidentDeeplinkHandler$tryToGetOrderId$1.L$0;
                    kotlin.b.b(obj);
                }
                o2y0 o2y0Var = (o2y0) obj;
                return (o2y0Var == null && o2y0Var.e()) ? o2y0Var.b().a : str;
            }
        }
        accidentDeeplinkHandler$tryToGetOrderId$1 = new AccidentDeeplinkHandler$tryToGetOrderId$1(this, continuationImpl);
        Object obj2 = accidentDeeplinkHandler$tryToGetOrderId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accidentDeeplinkHandler$tryToGetOrderId$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var2 = (o2y0) obj2;
        if (o2y0Var2 == null) {
        }
    }
}
