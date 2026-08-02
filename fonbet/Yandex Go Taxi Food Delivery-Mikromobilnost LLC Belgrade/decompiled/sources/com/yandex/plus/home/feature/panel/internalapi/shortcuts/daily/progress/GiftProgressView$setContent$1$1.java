package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress;

import android.animation.ValueAnimator;
import defpackage.cht;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.GiftProgressView$setContent$1$1", f = "GiftProgressView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GiftProgressView$setContent$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ GiftProgressView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftProgressView$setContent$1$1(GiftProgressView giftProgressView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = giftProgressView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GiftProgressView$setContent$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GiftProgressView$setContent$1$1 giftProgressView$setContent$1$1 = (GiftProgressView$setContent$1$1) create((zy11) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        giftProgressView$setContent$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cht chtVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        chtVar = this.this$0.animator;
        if (!chtVar.c) {
            chtVar.c = true;
            ValueAnimator valueAnimator = chtVar.a;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
        return zy11.a;
    }
}
