package com.yandex.messaging.ui.banners;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x4b0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4b0;", "it", "Lzy11;", "<anonymous>", "(Lx4b0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.banners.TelemostBannerListViewModel$4", f = "TelemostBannerListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TelemostBannerListViewModel$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelemostBannerListViewModel$4(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TelemostBannerListViewModel$4 telemostBannerListViewModel$4 = new TelemostBannerListViewModel$4(this.this$0, continuation);
        telemostBannerListViewModel$4.L$0 = obj;
        return telemostBannerListViewModel$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TelemostBannerListViewModel$4 telemostBannerListViewModel$4 = (TelemostBannerListViewModel$4) create((x4b0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        telemostBannerListViewModel$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        x4b0 x4b0Var = (x4b0) this.L$0;
        a aVar = this.this$0;
        aVar.H = x4b0Var;
        aVar.Z();
        return zy11.a;
    }
}
