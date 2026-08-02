package com.yandex.go.taxi.order.cancel.similar.interactor;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h b;

    public e(vpr vprVar, h hVar) {
        this.a = vprVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1 cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof CancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1) {
            cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1 = (CancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1) continuation;
            int i2 = cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((o2y0) obj2).b().a, this.b.a)) {
                            break;
                        }
                    }
                    cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1.L$0 = null;
                    cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1.L$1 = null;
                    cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1.L$2 = null;
                    cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1.L$3 = null;
                    cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1 = new CancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1(this, continuation);
        Object obj32 = cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
