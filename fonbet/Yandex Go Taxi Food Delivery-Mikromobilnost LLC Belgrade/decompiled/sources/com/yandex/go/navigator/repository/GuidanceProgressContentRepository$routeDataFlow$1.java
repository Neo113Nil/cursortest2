package com.yandex.go.navigator.repository;

import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ll7z;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.repository.GuidanceProgressContentRepository$routeDataFlow$1", f = "GuidanceProgressContentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GuidanceProgressContentRepository$routeDataFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.go.navigator.domain.o $locationChangedListener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuidanceProgressContentRepository$routeDataFlow$1(com.yandex.go.navigator.domain.o oVar, Continuation continuation) {
        super(2, continuation);
        this.$locationChangedListener = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GuidanceProgressContentRepository$routeDataFlow$1(this.$locationChangedListener, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GuidanceProgressContentRepository$routeDataFlow$1 guidanceProgressContentRepository$routeDataFlow$1 = (GuidanceProgressContentRepository$routeDataFlow$1) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        guidanceProgressContentRepository$routeDataFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Guidance guidance;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.navigator.domain.o oVar = this.$locationChangedListener;
        Navigation b = oVar.a.b();
        if (b != null && (guidance = b.getGuidance()) != null) {
            oVar.c(guidance);
        }
        return zy11.a;
    }
}
