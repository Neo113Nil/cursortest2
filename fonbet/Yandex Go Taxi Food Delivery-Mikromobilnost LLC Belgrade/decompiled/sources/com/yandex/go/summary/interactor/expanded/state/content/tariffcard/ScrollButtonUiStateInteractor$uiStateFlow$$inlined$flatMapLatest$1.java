package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.arm0;
import defpackage.avj0;
import defpackage.g92;
import defpackage.ihp0;
import defpackage.jqr;
import defpackage.kyh0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.ScrollButtonUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1", f = "ScrollButtonUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class ScrollButtonUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ tpr $experimentFlow$inlined;
    final /* synthetic */ tpr $firstDefaultRequirementOrCarouselIndexFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ihp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollButtonUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(Continuation continuation, ihp0 ihp0Var, tpr tprVar, tpr tprVar2) {
        super(3, continuation);
        this.this$0 = ihp0Var;
        this.$firstDefaultRequirementOrCarouselIndexFlow$inlined = tprVar;
        this.$experimentFlow$inlined = tprVar2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScrollButtonUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 scrollButtonUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 = new ScrollButtonUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$firstDefaultRequirementOrCarouselIndexFlow$inlined, this.$experimentFlow$inlined);
        scrollButtonUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        scrollButtonUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return scrollButtonUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((Boolean) obj2).booleanValue()) {
                ihp0 ihp0Var = this.this$0;
                tpr tprVar = this.$firstDefaultRequirementOrCarouselIndexFlow$inlined;
                g92Var = new h(new jqr(new mth(new kotlinx.coroutines.flow.j0(null, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(tprVar, kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(new f(tprVar), new arm0(15)), new ScrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$$inlined$flatMapLatest$1(ihp0Var, null)), this.$experimentFlow$inlined, ihp0Var.d.b, new ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1(((avj0) ihp0Var.a).h(kyh0.tariff_requirements_scroll_button_title), null))), new ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$$inlined$withPreviousEmit$1(3, null)), 6), new ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2(ihp0Var, null), 3));
            } else {
                g92Var = new g92(2, null);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
