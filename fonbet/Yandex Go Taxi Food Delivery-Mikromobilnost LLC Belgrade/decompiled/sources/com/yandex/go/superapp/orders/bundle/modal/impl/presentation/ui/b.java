package com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui;

import com.yandex.go.dto.response.BundledOrdersPayload;
import defpackage.ku6;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public b(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (r9.emit(r11, r6) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r11 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1 superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1) {
            superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1 = (SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1 superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12 = superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1;
                Object obj2 = superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f fVar = this.b;
                    ru.yandex.taxi.widgets.domain.d dVar = fVar.F;
                    BundledOrdersPayload bundledOrdersPayload = ((ku6) fVar.A).a;
                    yaf0 yaf0Var = fVar.C;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$0 = null;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$1 = null;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$2 = null;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$3 = null;
                    vprVar = this.a;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$4 = vprVar;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$5 = null;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$6 = null;
                    superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.label = 1;
                    obj2 = dVar.b.a((List) obj, bundledOrdersPayload, "orders_list_action", yaf0Var, superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$4;
                    kotlin.b.b(obj2);
                }
                superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$0 = null;
                superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$1 = null;
                superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$2 = null;
                superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$3 = null;
                superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$4 = null;
                superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$5 = null;
                superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.L$6 = null;
                superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$12.label = 2;
            }
        }
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1 = new SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1 superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$122 = superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$1;
        Object obj22 = superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$122.L$0 = null;
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$122.L$1 = null;
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$122.L$2 = null;
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$122.L$3 = null;
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$122.L$4 = null;
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$122.L$5 = null;
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$122.L$6 = null;
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$map$1$2$122.label = 2;
    }
}
