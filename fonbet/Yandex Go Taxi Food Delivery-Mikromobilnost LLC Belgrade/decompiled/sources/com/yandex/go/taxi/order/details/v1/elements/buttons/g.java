package com.yandex.go.taxi.order.details.v1.elements.buttons;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class g implements tpr {
    public final /* synthetic */ jqr a;

    public g(jqr jqrVar) {
        this.a = jqrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DetailsCardBottomButtonsStateMapper$map$$inlined$map$3$1 detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1;
        int i;
        if (continuation instanceof DetailsCardBottomButtonsStateMapper$map$$inlined$map$3$1) {
            detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1 = (DetailsCardBottomButtonsStateMapper$map$$inlined$map$3$1) continuation;
            int i2 = detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar);
                    detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1.L$0 = null;
                    detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1.L$1 = null;
                    detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1.L$2 = null;
                    detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1.label = 1;
                    if (this.a.collect(fVar, detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1) == coroutineSingletons) {
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
        detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1 = new DetailsCardBottomButtonsStateMapper$map$$inlined$map$3$1(this, continuation);
        Object obj2 = detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardBottomButtonsStateMapper$map$$inlined$map$3$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
