package com.yandex.go.taxi.order.common;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class e implements tpr {
    public final /* synthetic */ g a;

    public e(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1 orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1) {
            orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1 = (OrderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1) continuation;
            int i2 = orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar);
                    orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1.L$0 = null;
                    orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1.L$1 = null;
                    orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1.L$2 = null;
                    orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1) == coroutineSingletons) {
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
        orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1 = new OrderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1(this, continuation);
        Object obj2 = orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
