package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui;

import androidx.compose.foundation.gestures.c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.HubItemsListKt$HubItemsList$10$4$1$1$1", f = "HubItemsList.kt", l = {281}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubItemsListKt$HubItemsList$10$4$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $expandModalForAccessibility;
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    final /* synthetic */ float $y;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubItemsListKt$HubItemsList$10$4$1$1$1(androidx.compose.foundation.lazy.b bVar, float f, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$listState = bVar;
        this.$y = f;
        this.$expandModalForAccessibility = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HubItemsListKt$HubItemsList$10$4$1$1$1(this.$listState, this.$y, this.$expandModalForAccessibility, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HubItemsListKt$HubItemsList$10$4$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.lazy.b bVar = this.$listState;
            float f = this.$y;
            this.label = 1;
            if (c.p(bVar, f, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (this.$y > 0.0f) {
            this.$expandModalForAccessibility.invoke();
        }
        return zy11.a;
    }
}
