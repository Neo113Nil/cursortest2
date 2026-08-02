package com.yandex.go.taxi.order.cancel.similar.interactor;

import com.yandex.go.taxi.order.cancel.similar.model.CancelSimilarUiState$State;
import com.yandex.go.taxi.order.cancel.similar.model.CancelSimilarUiState$TopContentType;
import com.yandex.go.taxi.order.models.api.cancel.Buttons;
import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersModal;
import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;
import defpackage.ems;
import defpackage.f6j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p08;
import defpackage.tz7;
import defpackage.w511;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.Orientation;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "eta", "Lf6j;", "driverState", "", "Loz7;", "buttons", "", "allCancelled", "Lru/yandex/taxi/utils/UiStateDrawableWrapper;", "image", "Lp08;", "<anonymous>", "(Ljava/lang/String;Lf6j;Ljava/util/List;ZLru/yandex/taxi/utils/UiStateDrawableWrapper;)Lp08;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.similar.interactor.CancelSimilarOrdersFeatureInteractor$observeUiState$1$1", f = "CancelSimilarOrdersFeatureInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CancelSimilarOrdersFeatureInteractor$observeUiState$1$1 extends SuspendLambda implements ems {
    final /* synthetic */ CancelSimilarOrdersNotification $currentNotification;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelSimilarOrdersFeatureInteractor$observeUiState$1$1(CancelSimilarOrdersNotification cancelSimilarOrdersNotification, h hVar, Continuation continuation) {
        super(6, continuation);
        this.$currentNotification = cancelSimilarOrdersNotification;
        this.this$0 = hVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        CancelSimilarOrdersFeatureInteractor$observeUiState$1$1 cancelSimilarOrdersFeatureInteractor$observeUiState$1$1 = new CancelSimilarOrdersFeatureInteractor$observeUiState$1$1(this.$currentNotification, this.this$0, (Continuation) obj6);
        cancelSimilarOrdersFeatureInteractor$observeUiState$1$1.L$0 = (String) obj;
        cancelSimilarOrdersFeatureInteractor$observeUiState$1$1.L$1 = (f6j) obj2;
        cancelSimilarOrdersFeatureInteractor$observeUiState$1$1.L$2 = (List) obj3;
        cancelSimilarOrdersFeatureInteractor$observeUiState$1$1.Z$0 = booleanValue;
        cancelSimilarOrdersFeatureInteractor$observeUiState$1$1.L$3 = (UiStateDrawableWrapper) obj5;
        return cancelSimilarOrdersFeatureInteractor$observeUiState$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Orientation orientation;
        CancelSimilarUiState$TopContentType cancelSimilarUiState$TopContentType;
        Buttons buttons;
        String str = (String) this.L$0;
        f6j f6jVar = (f6j) this.L$1;
        List list = (List) this.L$2;
        boolean z = this.Z$0;
        UiStateDrawableWrapper uiStateDrawableWrapper = (UiStateDrawableWrapper) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CancelSimilarOrdersNotification cancelSimilarOrdersNotification = this.$currentNotification;
        CancelSimilarOrdersModal cancelSimilarOrdersModal = cancelSimilarOrdersNotification.e;
        if (cancelSimilarOrdersModal == null || (buttons = cancelSimilarOrdersModal.c) == null || (orientation = buttons.a) == null) {
            orientation = Orientation.VERTICAL;
        }
        String str2 = cancelSimilarOrdersModal != null ? cancelSimilarOrdersModal.a : null;
        String str3 = cancelSimilarOrdersModal != null ? cancelSimilarOrdersModal.b : null;
        CancelSimilarUiState$State cancelSimilarUiState$State = z ? CancelSimilarUiState$State.SUCCESS : CancelSimilarUiState$State.IDLE;
        h hVar = this.this$0;
        CancelSimilarOrdersNotification.ModalType modalType = cancelSimilarOrdersNotification.d;
        hVar.getClass();
        int i = tz7.a[modalType.ordinal()];
        if (i == 1) {
            cancelSimilarUiState$TopContentType = CancelSimilarUiState$TopContentType.ORDER_CARD;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            cancelSimilarUiState$TopContentType = CancelSimilarUiState$TopContentType.IMAGE;
        }
        return new p08(orientation, str2, str3, str, cancelSimilarUiState$State, f6jVar, list, cancelSimilarUiState$TopContentType, uiStateDrawableWrapper);
    }
}
