package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui;

import defpackage.bpl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.HubItemsListKt$HubItemsList$4$1", f = "HubItemsList.kt", l = {183}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubItemsListKt$HubItemsList$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ yx40 $headerHeightPx$delegate;
    final /* synthetic */ boolean $isExpanded;
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    final /* synthetic */ bpl0 $scrollableItems;
    final /* synthetic */ String $selectedOfferItemId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubItemsListKt$HubItemsList$4$1(boolean z, String str, bpl0 bpl0Var, androidx.compose.foundation.lazy.b bVar, yx40 yx40Var, Continuation continuation) {
        super(2, continuation);
        this.$isExpanded = z;
        this.$selectedOfferItemId = str;
        this.$scrollableItems = bpl0Var;
        this.$listState = bVar;
        this.$headerHeightPx$delegate = yx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HubItemsListKt$HubItemsList$4$1(this.$isExpanded, this.$selectedOfferItemId, this.$scrollableItems, this.$listState, this.$headerHeightPx$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HubItemsListKt$HubItemsList$4$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!this.$isExpanded && this.$selectedOfferItemId != null && this.$headerHeightPx$delegate.getIntValue() != 0) {
            String str = this.$selectedOfferItemId;
            List list = this.$scrollableItems.a;
            androidx.compose.foundation.lazy.b bVar = this.$listState;
            int intValue = this.$headerHeightPx$delegate.getIntValue();
            this.label = 1;
            if (b.d(str, list, bVar, intValue, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
