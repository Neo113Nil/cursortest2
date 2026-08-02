package com.yandex.messaging.internal.view.input;

import androidx.appcompat.widget.AppCompatImageView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w0w;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.input.StarBrick$showTooltip$1", f = "StarBrick.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class StarBrick$showTooltip$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarBrick$showTooltip$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StarBrick$showTooltip$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StarBrick$showTooltip$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        if (this.this$0.x.getVisibility() == 0) {
            d dVar = this.this$0;
            b bVar = dVar.c;
            AppCompatImageView appCompatImageView = dVar.x;
            this.label = 1;
            bVar.getClass();
            Object b = bVar.b(new w0w(appCompatImageView, null, b.e, false), this);
            if (b != coroutineSingletons) {
                b = zy11Var;
            }
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
