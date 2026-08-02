package com.yandex.go.superapp.discovery.map.impl.domain.interactors;

import com.yandex.go.superapp.discovery.map.impl.domain.entities.main.SuperAppOpenServiceActionType;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.domain.interactors.SearchbarStateRepository$fetchConfig$1", f = "SuperAppDiscoveryMapLayersInteractor.kt", l = {53, 54}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SearchbarStateRepository$fetchConfig$1 extends SuspendLambda implements wls {
    final /* synthetic */ SuperAppOpenServiceActionType $service;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchbarStateRepository$fetchConfig$1(a aVar, SuperAppOpenServiceActionType superAppOpenServiceActionType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$service = superAppOpenServiceActionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchbarStateRepository$fetchConfig$1(this.this$0, this.$service, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchbarStateRepository$fetchConfig$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r7 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.superapp.discovery.map.impl.experiments.v2.p pVar = this.this$0.a;
            SuperAppOpenServiceActionType superAppOpenServiceActionType = this.$service;
            this.label = 1;
            obj = pVar.d(superAppOpenServiceActionType, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        r0 r0Var = this.this$0.c;
        this.L$0 = null;
        this.label = 2;
        r0Var.emit((SuperAppDiscoveryMapV2Experiment.SearchBarConfig) obj, this);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
