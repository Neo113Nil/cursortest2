package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFooterDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingType;
import defpackage.gyu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x0v;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/model/ModalState;", "", "<destruct>", "Lgyu;", "<anonymous>", "(Lkotlin/Pair;)Lgyu;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.HubFooterUiStateInteractor$stateFlow$3", f = "HubFooterUiStateInteractor.kt", l = {43, 47, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubFooterUiStateInteractor$stateFlow$3 extends SuspendLambda implements wls {
    final /* synthetic */ HubFooterDto $footerDto;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubFooterUiStateInteractor$stateFlow$3(g gVar, HubFooterDto hubFooterDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$footerDto = hubFooterDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HubFooterUiStateInteractor$stateFlow$3 hubFooterUiStateInteractor$stateFlow$3 = new HubFooterUiStateInteractor$stateFlow$3(this.this$0, this.$footerDto, continuation);
        hubFooterUiStateInteractor$stateFlow$3.L$0 = obj;
        return hubFooterUiStateInteractor$stateFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HubFooterUiStateInteractor$stateFlow$3) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if (r8 == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        x0v x0vVar;
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ModalState modalState = (ModalState) pair.getFirst();
            str = (String) pair.getSecond();
            ModalState modalState2 = ModalState.Expanded;
            if (modalState != modalState2) {
                g gVar = this.this$0;
                List list = this.$footerDto.a;
                HubOnboardingType hubOnboardingType = HubOnboardingType.FULL;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                obj = g.a(gVar, list, hubOnboardingType, this);
            } else {
                if (modalState != modalState2) {
                    return null;
                }
                g gVar2 = this.this$0;
                List list2 = this.$footerDto.a;
                HubOnboardingType hubOnboardingType2 = HubOnboardingType.ONLY_EXPANDED;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = str;
                this.label = 2;
                obj = g.a(gVar2, list2, hubOnboardingType2, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return new gyu((x0v) obj, EmptyList.a);
        }
        if (i != 2) {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x0vVar = (x0v) this.L$3;
            kotlin.b.b(obj);
            return new gyu(x0vVar, (List) obj);
        }
        str = (String) this.L$2;
        kotlin.b.b(obj);
        x0v x0vVar2 = (x0v) obj;
        com.yandex.go.taxi.summary.mobilityhub.mapper.d dVar = this.this$0.c;
        HubFooterDto hubFooterDto = this.$footerDto;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = x0vVar2;
        this.label = 3;
        Object g = dVar.g(hubFooterDto, str, this);
        if (g != coroutineSingletons) {
            x0vVar = x0vVar2;
            obj = g;
            return new gyu(x0vVar, (List) obj);
        }
        return coroutineSingletons;
    }
}
