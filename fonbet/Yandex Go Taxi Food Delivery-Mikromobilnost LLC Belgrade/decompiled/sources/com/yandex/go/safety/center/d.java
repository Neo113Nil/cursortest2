package com.yandex.go.safety.center;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.evu0;
import defpackage.gtl0;
import defpackage.hsl0;
import defpackage.hxx;
import defpackage.isl0;
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
public final class d extends isl0 {
    public final com.yandex.go.lifecycle.a b;
    public final p2y0 c;
    public final yvf0 d;

    public d(com.yandex.go.lifecycle.a aVar, p2y0 p2y0Var, yvf0 yvf0Var) {
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
        return d(oep0Var, (hsl0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, hsl0 hsl0Var, ContinuationImpl continuationImpl) {
        SafetyCenterInstructionsDeeplinkHandler$handleDeeplink$1 safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        oep0 oep0Var2;
        String str;
        if (continuationImpl instanceof SafetyCenterInstructionsDeeplinkHandler$handleDeeplink$1) {
            safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1 = (SafetyCenterInstructionsDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String b = hsl0Var.b();
                    safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$1 = hsl0Var;
                    safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj2 = e(b, safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$4;
                        hsl0Var = (hsl0) safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$1;
                        oep0Var2 = (oep0) safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$0;
                        kotlin.b.b(obj2);
                        ((pep0) oep0Var2).f((m950) this.d.get(), new itl0(SafetyCenterParams$Source.SAFETY_CENTER_DEEPLINK, str, new gtl0(hsl0Var.a())), hxx.a);
                        return zy11.a;
                    }
                    hsl0Var = (hsl0) safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj2);
                }
                String str2 = (String) obj2;
                safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$1 = hsl0Var;
                safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$2 = null;
                safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$3 = null;
                safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$4 = str2;
                safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.label = 2;
                if (this.b.a(safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1) != obj) {
                    oep0Var2 = oep0Var;
                    str = str2;
                    ((pep0) oep0Var2).f((m950) this.d.get(), new itl0(SafetyCenterParams$Source.SAFETY_CENTER_DEEPLINK, str, new gtl0(hsl0Var.a())), hxx.a);
                    return zy11.a;
                }
                return obj;
            }
        }
        safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1 = new SafetyCenterInstructionsDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj22 = safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        String str22 = (String) obj22;
        safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
        safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$1 = hsl0Var;
        safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$2 = null;
        safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$3 = null;
        safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.L$4 = str22;
        safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1.label = 2;
        if (this.b.a(safetyCenterInstructionsDeeplinkHandler$handleDeeplink$1) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        SafetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1 safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1;
        int i;
        if (continuationImpl instanceof SafetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1) {
            safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1 = (SafetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1) continuationImpl;
            int i2 = safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        return str;
                    }
                    safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1.L$0 = str;
                    safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1.label = 1;
                    obj = ((e0) this.c).y(safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1.L$0;
                    kotlin.b.b(obj);
                }
                o2y0 o2y0Var = (o2y0) obj;
                return (o2y0Var == null && o2y0Var.e()) ? o2y0Var.b().a : str;
            }
        }
        safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1 = new SafetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1(this, continuationImpl);
        Object obj2 = safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterInstructionsDeeplinkHandler$tryToGetOrderId$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var2 = (o2y0) obj2;
        if (o2y0Var2 == null) {
        }
    }
}
