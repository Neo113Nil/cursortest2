package com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter;

import com.yandex.go.superapp.tracking.domain.f;
import defpackage.aog0;
import defpackage.bdc;
import defpackage.bms;
import defpackage.f401;
import defpackage.g401;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q6y0;
import defpackage.w201;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/utils/UiStateDrawableWrapper;", "selectedImage", "unselectedImage", "backgroundImage", "Lg401;", "<anonymous>", "(Lru/yandex/taxi/utils/UiStateDrawableWrapper;Lru/yandex/taxi/utils/UiStateDrawableWrapper;Lru/yandex/taxi/utils/UiStateDrawableWrapper;)Lg401;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$2", f = "SuperappTrackingCardUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$2 extends SuspendLambda implements bms {
    final /* synthetic */ w201 $data;
    final /* synthetic */ boolean $isUltima;
    final /* synthetic */ f401 $ratingSelector;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$2(w201 w201Var, e eVar, f401 f401Var, boolean z, Continuation continuation) {
        super(4, continuation);
        this.$data = w201Var;
        this.this$0 = eVar;
        this.$ratingSelector = f401Var;
        this.$isUltima = z;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$2 superappTrackingCardUiStateInteractor$getRatingUiStateFlow$2 = new SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$2(this.$data, this.this$0, this.$ratingSelector, this.$isUltima, (Continuation) obj4);
        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$2.L$0 = (UiStateDrawableWrapper) obj;
        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$2.L$1 = (UiStateDrawableWrapper) obj2;
        superappTrackingCardUiStateInteractor$getRatingUiStateFlow$2.L$2 = (UiStateDrawableWrapper) obj3;
        return superappTrackingCardUiStateInteractor$getRatingUiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UiStateDrawableWrapper uiStateDrawableWrapper = (UiStateDrawableWrapper) this.L$0;
        UiStateDrawableWrapper uiStateDrawableWrapper2 = (UiStateDrawableWrapper) this.L$1;
        UiStateDrawableWrapper uiStateDrawableWrapper3 = (UiStateDrawableWrapper) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return new g401(((q6y0) this.$data).j.b, ((f) this.this$0.l).a(this.$ratingSelector.a, new bdc(aog0.decoratedRatingBarStarColor), this.$isUltima), uiStateDrawableWrapper, uiStateDrawableWrapper2, uiStateDrawableWrapper3);
    }
}
