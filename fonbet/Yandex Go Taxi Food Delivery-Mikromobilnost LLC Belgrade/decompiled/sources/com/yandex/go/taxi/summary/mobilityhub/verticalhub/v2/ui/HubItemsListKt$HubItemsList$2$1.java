package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui;

import androidx.compose.runtime.f;
import defpackage.bpl0;
import defpackage.mvg;
import defpackage.n0v;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tls;
import defpackage.tse;
import defpackage.vs9;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.HubItemsListKt$HubItemsList$2$1", f = "HubItemsList.kt", l = {149}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubItemsListKt$HubItemsList$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ float $bottomContentHeightPx;
    final /* synthetic */ boolean $isExpanded;
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    final /* synthetic */ float $offsetToExpandState;
    final /* synthetic */ tls $onAction;
    final /* synthetic */ bpl0 $scrollableItems;
    final /* synthetic */ oz40 $shownItems;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubItemsListKt$HubItemsList$2$1(androidx.compose.foundation.lazy.b bVar, bpl0 bpl0Var, float f, float f2, boolean z, tls tlsVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$listState = bVar;
        this.$scrollableItems = bpl0Var;
        this.$bottomContentHeightPx = f;
        this.$offsetToExpandState = f2;
        this.$isExpanded = z;
        this.$onAction = tlsVar;
        this.$shownItems = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HubItemsListKt$HubItemsList$2$1(this.$listState, this.$scrollableItems, this.$bottomContentHeightPx, this.$offsetToExpandState, this.$isExpanded, this.$onAction, this.$shownItems, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HubItemsListKt$HubItemsList$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        androidx.compose.foundation.lazy.b bVar = this.$listState;
        bpl0 bpl0Var = this.$scrollableItems;
        float f = this.$bottomContentHeightPx;
        float f2 = this.$offsetToExpandState;
        boolean z = this.$isExpanded;
        tls tlsVar = this.$onAction;
        oz40 oz40Var = this.$shownItems;
        this.label = 1;
        return (((z || (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) != 0) && (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) ? e.t(f.o(new vs9(bVar, 5))).collect(new n0v(bVar, f2, f, bpl0Var, oz40Var, tlsVar), this) : zy11Var) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
