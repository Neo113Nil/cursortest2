package com.yandex.smartcamera.arscene.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.smartcamera.arscene.ui.HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$4$2$1$1$1$1$1", f = "HorizontalCenteringSwitcher.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$4$2$1$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $item;
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$4$2$1$1$1$1$1(int i, androidx.compose.foundation.lazy.b bVar, Continuation continuation) {
        super(2, continuation);
        this.$listState = bVar;
        this.$item = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$4$2$1$1$1$1$1(this.$item, this.$listState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$4$2$1$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.lazy.b bVar = this.$listState;
            int i2 = this.$item;
            this.label = 1;
            if (e.c(bVar, i2, true, this) == coroutineSingletons) {
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
