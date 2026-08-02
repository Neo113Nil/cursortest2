package com.yandex.go.ugc;

import defpackage.cs11;
import defpackage.ds11;
import defpackage.fx60;
import defpackage.hxx;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.v770;
import defpackage.xr11;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class c extends cs11 {
    public final yvf0 b;
    public final fx60 c;

    public c(fx60 fx60Var, yvf0 yvf0Var) {
        this.b = yvf0Var;
        this.c = fx60Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (xr11) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, xr11 xr11Var, ContinuationImpl continuationImpl) {
        UgcDeeplinkHandler$handleDeeplink$1 ugcDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        if (continuationImpl instanceof UgcDeeplinkHandler$handleDeeplink$1) {
            ugcDeeplinkHandler$handleDeeplink$1 = (UgcDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = ugcDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ugcDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = ugcDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ugcDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                    ugcDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    ugcDeeplinkHandler$handleDeeplink$1.L$1 = xr11Var;
                    ugcDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    ugcDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    ugcDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.c.c(events$Zalogin$LoginContext, ugcDeeplinkHandler$handleDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xr11Var = (xr11) ugcDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) ugcDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ((pep0) oep0Var).f((m950) this.b.get(), new ds11(xr11Var.a()), hxx.a);
                }
                return zy11.a;
            }
        }
        ugcDeeplinkHandler$handleDeeplink$1 = new UgcDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = ugcDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ugcDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
