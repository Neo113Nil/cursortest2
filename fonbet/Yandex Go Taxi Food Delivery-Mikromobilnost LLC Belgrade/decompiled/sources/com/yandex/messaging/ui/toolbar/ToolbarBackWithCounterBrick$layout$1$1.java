package com.yandex.messaging.ui.toolbar;

import defpackage.d8b;
import defpackage.jsz0;
import defpackage.mvg;
import defpackage.n4b;
import defpackage.ny61;
import defpackage.q420;
import defpackage.sfl0;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.toolbar.ToolbarBackWithCounterBrick$layout$1$1", f = "ToolbarBackWithCounterBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ToolbarBackWithCounterBrick$layout$1$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarBackWithCounterBrick$layout$1$1(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ToolbarBackWithCounterBrick$layout$1$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ToolbarBackWithCounterBrick$layout$1$1 toolbarBackWithCounterBrick$layout$1$1 = (ToolbarBackWithCounterBrick$layout$1$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        toolbarBackWithCounterBrick$layout$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        com.yandex.messaging.ui.timeline.b bVar = this.this$0.y;
        bVar.getClass();
        bVar.c(new d8b(bVar, 0));
        int i = jsz0.a[this.this$0.B.ordinal()];
        if (i == 1) {
            this.this$0.c.getClass();
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            sfl0 sfl0Var = this.this$0.c;
            new n4b(q420.d);
            sfl0Var.getClass();
        }
        return zy11.a;
    }
}
