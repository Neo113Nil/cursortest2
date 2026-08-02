package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.footer;

import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.footer.VerticalHubBottomContentKt$ErrorButton$1$1$1", f = "VerticalHubBottomContent.kt", l = {229}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubBottomContentKt$ErrorButton$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wg6 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubBottomContentKt$ErrorButton$1$1$1(wg6 wg6Var, Continuation continuation) {
        super(2, continuation);
        this.$state = wg6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalHubBottomContentKt$ErrorButton$1$1$1(this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalHubBottomContentKt$ErrorButton$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            wg6 wg6Var = this.$state;
            this.label = 1;
            if (c.d(wg6Var, -2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
