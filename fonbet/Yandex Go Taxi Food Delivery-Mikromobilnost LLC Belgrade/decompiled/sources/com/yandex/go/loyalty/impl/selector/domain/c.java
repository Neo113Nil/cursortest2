package com.yandex.go.loyalty.impl.selector.domain;

import com.adjust.sdk.Constants;
import defpackage.bhx;
import defpackage.ewz;
import defpackage.fwz;
import defpackage.fx60;
import defpackage.hxx;
import defpackage.jvz;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.swz;
import defpackage.tpr;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class c extends fwz {
    public final yvf0 b;
    public final fx60 c;
    public final jvz d;

    public c(bhx bhxVar, fx60 fx60Var, jvz jvzVar) {
        this.b = bhxVar;
        this.c = fx60Var;
        this.d = jvzVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (ewz) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, ewz ewzVar, ContinuationImpl continuationImpl) {
        LoyaltySelectorDeeplinkHandler$handleDeeplink$1 loyaltySelectorDeeplinkHandler$handleDeeplink$1;
        int i;
        boolean booleanValue;
        oep0 oep0Var2;
        ewz ewzVar2;
        if (continuationImpl instanceof LoyaltySelectorDeeplinkHandler$handleDeeplink$1) {
            loyaltySelectorDeeplinkHandler$handleDeeplink$1 = (LoyaltySelectorDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = loyaltySelectorDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loyaltySelectorDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loyaltySelectorDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltySelectorDeeplinkHandler$handleDeeplink$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.LOYALTY_PROGRAM;
                    loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$1 = ewzVar;
                    loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    loyaltySelectorDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.c.c(events$Zalogin$LoginContext, loyaltySelectorDeeplinkHandler$handleDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ewzVar2 = (ewz) loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$1;
                        oep0Var2 = (oep0) loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ((pep0) oep0Var2).f((m950) this.b.get(), new swz(Constants.DEEPLINK, ewzVar2.a()), hxx.a);
                            return zy11Var;
                        }
                        return zy11Var;
                    }
                    ewzVar = (ewz) loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    tpr t = e.t(this.d.a.c());
                    loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$1 = ewzVar;
                    loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    loyaltySelectorDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    loyaltySelectorDeeplinkHandler$handleDeeplink$1.Z$0 = booleanValue;
                    loyaltySelectorDeeplinkHandler$handleDeeplink$1.label = 2;
                    obj = e.y(t, loyaltySelectorDeeplinkHandler$handleDeeplink$1);
                    if (obj != coroutineSingletons) {
                        ewz ewzVar3 = ewzVar;
                        oep0Var2 = oep0Var;
                        ewzVar2 = ewzVar3;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11Var;
            }
        }
        loyaltySelectorDeeplinkHandler$handleDeeplink$1 = new LoyaltySelectorDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = loyaltySelectorDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltySelectorDeeplinkHandler$handleDeeplink$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        return zy11Var2;
    }
}
