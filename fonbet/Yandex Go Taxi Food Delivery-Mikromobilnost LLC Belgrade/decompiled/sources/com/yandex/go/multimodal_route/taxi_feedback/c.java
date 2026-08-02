package com.yandex.go.multimodal_route.taxi_feedback;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ TaxiFeedbackStateRepository b;

    public c(r0 r0Var, TaxiFeedbackStateRepository taxiFeedbackStateRepository) {
        this.a = r0Var;
        this.b = taxiFeedbackStateRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiFeedbackStateRepository$special$$inlined$filter$1$1 taxiFeedbackStateRepository$special$$inlined$filter$1$1;
        int i;
        if (continuation instanceof TaxiFeedbackStateRepository$special$$inlined$filter$1$1) {
            taxiFeedbackStateRepository$special$$inlined$filter$1$1 = (TaxiFeedbackStateRepository$special$$inlined$filter$1$1) continuation;
            int i2 = taxiFeedbackStateRepository$special$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiFeedbackStateRepository$special$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiFeedbackStateRepository$special$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiFeedbackStateRepository$special$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    taxiFeedbackStateRepository$special$$inlined$filter$1$1.L$0 = null;
                    taxiFeedbackStateRepository$special$$inlined$filter$1$1.L$1 = null;
                    taxiFeedbackStateRepository$special$$inlined$filter$1$1.L$2 = null;
                    taxiFeedbackStateRepository$special$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(bVar, taxiFeedbackStateRepository$special$$inlined$filter$1$1) == coroutineSingletons) {
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
        taxiFeedbackStateRepository$special$$inlined$filter$1$1 = new TaxiFeedbackStateRepository$special$$inlined$filter$1$1(this, continuation);
        Object obj2 = taxiFeedbackStateRepository$special$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiFeedbackStateRepository$special$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
