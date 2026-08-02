package com.yandex.go.walking.navigation.impl.overview.interactor;

import com.yandex.go.walking.navigation.impl.model.WalkNavFocusButtonState;
import defpackage.bms;
import defpackage.e541;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t741;
import defpackage.z041;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lt741;", "sectionContent", "Lz041;", "compassFabState", "Lcom/yandex/go/walking/navigation/impl/model/WalkNavFocusButtonState;", "focusFabState", "Le541;", "<anonymous>", "(Lt741;Lz041;Lcom/yandex/go/walking/navigation/impl/model/WalkNavFocusButtonState;)Le541;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.overview.interactor.WalkNavOverviewUiStateInteractor$uiStateFlow$1", f = "WalkNavOverviewUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavOverviewUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavOverviewUiStateInteractor$uiStateFlow$1(j jVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = jVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        WalkNavOverviewUiStateInteractor$uiStateFlow$1 walkNavOverviewUiStateInteractor$uiStateFlow$1 = new WalkNavOverviewUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj4);
        walkNavOverviewUiStateInteractor$uiStateFlow$1.L$0 = (t741) obj;
        walkNavOverviewUiStateInteractor$uiStateFlow$1.L$1 = (z041) obj2;
        walkNavOverviewUiStateInteractor$uiStateFlow$1.L$2 = (WalkNavFocusButtonState) obj3;
        return walkNavOverviewUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t741 t741Var = (t741) this.L$0;
        z041 z041Var = (z041) this.L$1;
        WalkNavFocusButtonState walkNavFocusButtonState = (WalkNavFocusButtonState) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new e541(t741Var, z041Var, walkNavFocusButtonState, this.this$0.e.a.isEnabled());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
