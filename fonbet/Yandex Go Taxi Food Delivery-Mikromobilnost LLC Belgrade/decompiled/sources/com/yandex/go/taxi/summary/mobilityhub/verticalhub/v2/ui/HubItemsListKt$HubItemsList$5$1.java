package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui;

import androidx.compose.runtime.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t24;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zo1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.HubItemsListKt$HubItemsList$5$1", f = "HubItemsList.kt", l = {202}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubItemsListKt$HubItemsList$5$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isExpanded;
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    final /* synthetic */ tls $onAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubItemsListKt$HubItemsList$5$1(androidx.compose.foundation.lazy.b bVar, boolean z, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$listState = bVar;
        this.$isExpanded = z;
        this.$onAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HubItemsListKt$HubItemsList$5$1(this.$listState, this.$isExpanded, this.$onAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HubItemsListKt$HubItemsList$5$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(f.o(new zo1(this.$listState, this.$isExpanded, 11)));
            t24 t24Var = new t24(4, this.$onAction);
            this.label = 1;
            if (t.collect(t24Var, this) == coroutineSingletons) {
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
