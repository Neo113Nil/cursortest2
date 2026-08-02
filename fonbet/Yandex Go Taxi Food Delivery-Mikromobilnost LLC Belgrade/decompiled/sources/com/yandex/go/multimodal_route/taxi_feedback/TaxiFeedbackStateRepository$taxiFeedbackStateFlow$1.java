package com.yandex.go.multimodal_route.taxi_feedback;

import defpackage.mvg;
import defpackage.nvx0;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isExpired", "Lnvx0;", ClidProvider.STATE, "<anonymous>", "(ZLnvx0;)Lnvx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.taxi_feedback.TaxiFeedbackStateRepository$taxiFeedbackStateFlow$1", f = "TaxiFeedbackStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class TaxiFeedbackStateRepository$taxiFeedbackStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        TaxiFeedbackStateRepository$taxiFeedbackStateFlow$1 taxiFeedbackStateRepository$taxiFeedbackStateFlow$1 = new TaxiFeedbackStateRepository$taxiFeedbackStateFlow$1(3, (Continuation) obj3);
        taxiFeedbackStateRepository$taxiFeedbackStateFlow$1.Z$0 = booleanValue;
        taxiFeedbackStateRepository$taxiFeedbackStateFlow$1.L$0 = (nvx0) obj2;
        return taxiFeedbackStateRepository$taxiFeedbackStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        nvx0 nvx0Var = (nvx0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (nvx0Var != null) {
            return nvx0.a(nvx0Var, z, null, null, 6);
        }
        return null;
    }
}
