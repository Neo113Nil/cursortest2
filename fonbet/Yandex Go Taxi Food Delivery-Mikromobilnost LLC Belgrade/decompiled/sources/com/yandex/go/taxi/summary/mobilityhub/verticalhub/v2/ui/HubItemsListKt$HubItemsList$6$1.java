package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.HubItemsListKt$HubItemsList$6$1", f = "HubItemsList.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubItemsListKt$HubItemsList$6$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $addressesStartedCollapsing$delegate;
    final /* synthetic */ boolean $isExpanded;
    final /* synthetic */ oz40 $justTransitionedToExpanded$delegate;
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubItemsListKt$HubItemsList$6$1(boolean z, androidx.compose.foundation.lazy.b bVar, oz40 oz40Var, oz40 oz40Var2, Continuation continuation) {
        super(2, continuation);
        this.$isExpanded = z;
        this.$listState = bVar;
        this.$justTransitionedToExpanded$delegate = oz40Var;
        this.$addressesStartedCollapsing$delegate = oz40Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HubItemsListKt$HubItemsList$6$1(this.$isExpanded, this.$listState, this.$justTransitionedToExpanded$delegate, this.$addressesStartedCollapsing$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        HubItemsListKt$HubItemsList$6$1 hubItemsListKt$HubItemsList$6$1 = (HubItemsListKt$HubItemsList$6$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        hubItemsListKt$HubItemsList$6$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (((Boolean) this.$justTransitionedToExpanded$delegate.getValue()).booleanValue() && this.$isExpanded && this.$listState.h() == 0 && this.$listState.i() == 0) {
            this.$justTransitionedToExpanded$delegate.setValue(Boolean.FALSE);
        }
        if (this.$isExpanded && !((Boolean) this.$justTransitionedToExpanded$delegate.getValue()).booleanValue() && (this.$listState.h() > 0 || this.$listState.i() > 0)) {
            this.$addressesStartedCollapsing$delegate.setValue(Boolean.TRUE);
        }
        return zy11.a;
    }
}
