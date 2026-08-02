package com.yandex.go.masstransit.sdk.checkout.impl.checkout.ui.components;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.checkout.impl.checkout.ui.components.BlockInteractionBoxKt$blockInteraction$1$1", f = "BlockInteractionBox.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class BlockInteractionBoxKt$blockInteraction$1$1 extends RestrictedSuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BlockInteractionBoxKt$blockInteraction$1$1 blockInteractionBoxKt$blockInteraction$1$1 = new BlockInteractionBoxKt$blockInteraction$1$1(2, continuation);
        blockInteractionBoxKt$blockInteraction$1$1.L$0 = obj;
        return blockInteractionBoxKt$blockInteraction$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BlockInteractionBoxKt$blockInteraction$1$1) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        f fVar = (f) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        do {
            this.L$0 = fVar;
            this.label = 1;
            a = fVar.a(PointerEventPass.Main, this);
        } while (a != coroutineSingletons);
        return coroutineSingletons;
    }
}
