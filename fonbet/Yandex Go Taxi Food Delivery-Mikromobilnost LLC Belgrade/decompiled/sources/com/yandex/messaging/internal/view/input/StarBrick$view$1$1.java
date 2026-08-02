package com.yandex.messaging.internal.view.input;

import androidx.appcompat.widget.AppCompatImageView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.input.StarBrick$view$1$1", f = "StarBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class StarBrick$view$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ AppCompatImageView $this_apply;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarBrick$view$1$1(d dVar, AppCompatImageView appCompatImageView, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$this_apply = appCompatImageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new StarBrick$view$1$1(this.this$0, this.$this_apply, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        StarBrick$view$1$1 starBrick$view$1$1 = (StarBrick$view$1$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        starBrick$view$1$1.invokeSuspend(zy11Var);
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
        this.this$0.a.c(!this.$this_apply.isActivated());
        return zy11.a;
    }
}
