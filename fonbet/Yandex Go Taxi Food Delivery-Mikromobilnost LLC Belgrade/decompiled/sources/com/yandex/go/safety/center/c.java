package com.yandex.go.safety.center;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.dab1;
import defpackage.erl0;
import defpackage.evu0;
import defpackage.grl0;
import defpackage.hxx;
import defpackage.itl0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.p2y0;
import defpackage.pep0;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class c extends grl0 {
    public final com.yandex.go.lifecycle.a b;
    public final p2y0 c;
    public final yvf0 d;

    public c(com.yandex.go.lifecycle.a aVar, p2y0 p2y0Var, yvf0 yvf0Var) {
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
        return d(oep0Var, (erl0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, erl0 erl0Var, ContinuationImpl continuationImpl) {
        SafetyCenterDeeplinkHandler$handleDeeplink$1 safetyCenterDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        oep0 oep0Var2;
        String str;
        if (continuationImpl instanceof SafetyCenterDeeplinkHandler$handleDeeplink$1) {
            safetyCenterDeeplinkHandler$handleDeeplink$1 = (SafetyCenterDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = safetyCenterDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = safetyCenterDeeplinkHandler$handleDeeplink$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String a = erl0Var.a();
                    safetyCenterDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    safetyCenterDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    safetyCenterDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    safetyCenterDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    safetyCenterDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj2 = e(a, safetyCenterDeeplinkHandler$handleDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) safetyCenterDeeplinkHandler$handleDeeplink$1.L$4;
                        oep0Var2 = (oep0) safetyCenterDeeplinkHandler$handleDeeplink$1.L$0;
                        kotlin.b.b(obj2);
                        ((pep0) oep0Var2).f((m950) this.d.get(), new itl0(SafetyCenterParams$Source.SAFETY_CENTER_DEEPLINK, str, dab1.O), hxx.a);
                        return zy11.a;
                    }
                    oep0Var = (oep0) safetyCenterDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj2);
                }
                String str2 = (String) obj2;
                safetyCenterDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                safetyCenterDeeplinkHandler$handleDeeplink$1.L$1 = null;
                safetyCenterDeeplinkHandler$handleDeeplink$1.L$2 = null;
                safetyCenterDeeplinkHandler$handleDeeplink$1.L$3 = null;
                safetyCenterDeeplinkHandler$handleDeeplink$1.L$4 = str2;
                safetyCenterDeeplinkHandler$handleDeeplink$1.label = 2;
                if (this.b.a(safetyCenterDeeplinkHandler$handleDeeplink$1) != obj) {
                    oep0Var2 = oep0Var;
                    str = str2;
                    ((pep0) oep0Var2).f((m950) this.d.get(), new itl0(SafetyCenterParams$Source.SAFETY_CENTER_DEEPLINK, str, dab1.O), hxx.a);
                    return zy11.a;
                }
                return obj;
            }
        }
        safetyCenterDeeplinkHandler$handleDeeplink$1 = new SafetyCenterDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj22 = safetyCenterDeeplinkHandler$handleDeeplink$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        String str22 = (String) obj22;
        safetyCenterDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
        safetyCenterDeeplinkHandler$handleDeeplink$1.L$1 = null;
        safetyCenterDeeplinkHandler$handleDeeplink$1.L$2 = null;
        safetyCenterDeeplinkHandler$handleDeeplink$1.L$3 = null;
        safetyCenterDeeplinkHandler$handleDeeplink$1.L$4 = str22;
        safetyCenterDeeplinkHandler$handleDeeplink$1.label = 2;
        if (this.b.a(safetyCenterDeeplinkHandler$handleDeeplink$1) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        SafetyCenterDeeplinkHandler$tryToGetOrderId$1 safetyCenterDeeplinkHandler$tryToGetOrderId$1;
        int i;
        if (continuationImpl instanceof SafetyCenterDeeplinkHandler$tryToGetOrderId$1) {
            safetyCenterDeeplinkHandler$tryToGetOrderId$1 = (SafetyCenterDeeplinkHandler$tryToGetOrderId$1) continuationImpl;
            int i2 = safetyCenterDeeplinkHandler$tryToGetOrderId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterDeeplinkHandler$tryToGetOrderId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterDeeplinkHandler$tryToGetOrderId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterDeeplinkHandler$tryToGetOrderId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        return str;
                    }
                    safetyCenterDeeplinkHandler$tryToGetOrderId$1.L$0 = str;
                    safetyCenterDeeplinkHandler$tryToGetOrderId$1.label = 1;
                    obj = ((e0) this.c).y(safetyCenterDeeplinkHandler$tryToGetOrderId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) safetyCenterDeeplinkHandler$tryToGetOrderId$1.L$0;
                    kotlin.b.b(obj);
                }
                o2y0 o2y0Var = (o2y0) obj;
                return (o2y0Var == null && o2y0Var.e()) ? o2y0Var.b().a : str;
            }
        }
        safetyCenterDeeplinkHandler$tryToGetOrderId$1 = new SafetyCenterDeeplinkHandler$tryToGetOrderId$1(this, continuationImpl);
        Object obj2 = safetyCenterDeeplinkHandler$tryToGetOrderId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterDeeplinkHandler$tryToGetOrderId$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var2 = (o2y0) obj2;
        if (o2y0Var2 == null) {
        }
    }
}
