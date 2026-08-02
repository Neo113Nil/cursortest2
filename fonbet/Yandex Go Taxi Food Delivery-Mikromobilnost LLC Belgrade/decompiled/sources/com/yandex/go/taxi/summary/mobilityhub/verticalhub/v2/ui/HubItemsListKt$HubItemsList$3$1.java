package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui;

import defpackage.bpl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
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
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.HubItemsListKt$HubItemsList$3$1", f = "HubItemsList.kt", l = {164, 169}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubItemsListKt$HubItemsList$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $addressesStartedCollapsing$delegate;
    final /* synthetic */ yx40 $headerHeightPx$delegate;
    final /* synthetic */ boolean $isExpanded;
    final /* synthetic */ oz40 $justTransitionedToExpanded$delegate;
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    final /* synthetic */ bpl0 $scrollableItems;
    final /* synthetic */ String $selectedOfferItemId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubItemsListKt$HubItemsList$3$1(boolean z, androidx.compose.foundation.lazy.b bVar, String str, bpl0 bpl0Var, oz40 oz40Var, oz40 oz40Var2, yx40 yx40Var, Continuation continuation) {
        super(2, continuation);
        this.$isExpanded = z;
        this.$listState = bVar;
        this.$selectedOfferItemId = str;
        this.$scrollableItems = bpl0Var;
        this.$justTransitionedToExpanded$delegate = oz40Var;
        this.$addressesStartedCollapsing$delegate = oz40Var2;
        this.$headerHeightPx$delegate = yx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HubItemsListKt$HubItemsList$3$1(this.$isExpanded, this.$listState, this.$selectedOfferItemId, this.$scrollableItems, this.$justTransitionedToExpanded$delegate, this.$addressesStartedCollapsing$delegate, this.$headerHeightPx$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HubItemsListKt$HubItemsList$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r6.f(0, 0, r5) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.b.d(r6, r1, r3, r4, r5) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = this.$isExpanded;
            oz40 oz40Var = this.$justTransitionedToExpanded$delegate;
            if (z) {
                oz40Var.setValue(Boolean.TRUE);
                this.$addressesStartedCollapsing$delegate.setValue(Boolean.FALSE);
                androidx.compose.foundation.lazy.b bVar = this.$listState;
                this.label = 1;
            } else {
                Boolean bool = Boolean.FALSE;
                oz40Var.setValue(bool);
                this.$addressesStartedCollapsing$delegate.setValue(bool);
                if (this.$selectedOfferItemId != null && this.$headerHeightPx$delegate.getIntValue() > 0) {
                    String str = this.$selectedOfferItemId;
                    List list = this.$scrollableItems.a;
                    androidx.compose.foundation.lazy.b bVar2 = this.$listState;
                    int intValue = this.$headerHeightPx$delegate.getIntValue();
                    this.label = 2;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
