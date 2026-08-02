package com.ybsdk.feature.transfer.internal.domain;

import defpackage.ar51;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zq51;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lar51;", "", "<anonymous>", "(Lar51;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.internal.domain.PartnerCheckInteractor$pollCheckUserTarget$2", f = "PartnerCheckInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerCheckInteractor$pollCheckUserTarget$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PartnerCheckInteractor$pollCheckUserTarget$2 partnerCheckInteractor$pollCheckUserTarget$2 = new PartnerCheckInteractor$pollCheckUserTarget$2(2, continuation);
        partnerCheckInteractor$pollCheckUserTarget$2.L$0 = obj;
        return partnerCheckInteractor$pollCheckUserTarget$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PartnerCheckInteractor$pollCheckUserTarget$2) create((ar51) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(!jl40.l((ar51) this.L$0, zq51.a));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
