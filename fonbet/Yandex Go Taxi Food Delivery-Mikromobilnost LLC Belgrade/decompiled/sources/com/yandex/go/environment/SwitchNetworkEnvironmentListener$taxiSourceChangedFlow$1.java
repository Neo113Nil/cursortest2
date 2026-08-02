package com.yandex.go.environment;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpv0;", "addressInfo", "Lkotlin/Pair;", "Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "<anonymous>", "(Lpv0;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.environment.SwitchNetworkEnvironmentListener$taxiSourceChangedFlow$1", f = "SwitchNetworkEnvironmentListener.kt", l = {190}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SwitchNetworkEnvironmentListener$taxiSourceChangedFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/yandex/go/address/models/Address;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.environment.SwitchNetworkEnvironmentListener$taxiSourceChangedFlow$1$1", f = "SwitchNetworkEnvironmentListener.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.environment.SwitchNetworkEnvironmentListener$taxiSourceChangedFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ pv0 $addressInfo;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(pv0 pv0Var, Continuation continuation) {
            super(2, continuation);
            this.$addressInfo = pv0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$addressInfo, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((Address) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Address address = (Address) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(address != null && address.equals(this.$addressInfo.a));
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchNetworkEnvironmentListener$taxiSourceChangedFlow$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SwitchNetworkEnvironmentListener$taxiSourceChangedFlow$1 switchNetworkEnvironmentListener$taxiSourceChangedFlow$1 = new SwitchNetworkEnvironmentListener$taxiSourceChangedFlow$1(this.this$0, continuation);
        switchNetworkEnvironmentListener$taxiSourceChangedFlow$1.L$0 = obj;
        return switchNetworkEnvironmentListener$taxiSourceChangedFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SwitchNetworkEnvironmentListener$taxiSourceChangedFlow$1) create((pv0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var = (pv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr f = this.this$0.b.f();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pv0Var, null);
            this.L$0 = pv0Var;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.z(f, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new Pair(pv0Var, RoutePointType.POINT_A);
    }
}
