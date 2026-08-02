package com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui;

import defpackage.ny61;
import defpackage.pu6;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pu6 b;

    public d(vpr vprVar, pu6 pu6Var) {
        this.a = vprVar;
        this.b = pu6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) {
            superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 = (SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair(this.b.g, (List) obj);
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 = new SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppOrderBundlePresenter$onResume$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
