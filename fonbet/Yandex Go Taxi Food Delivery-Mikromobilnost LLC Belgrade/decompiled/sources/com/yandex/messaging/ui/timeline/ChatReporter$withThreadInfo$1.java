package com.yandex.messaging.ui.timeline;

import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pb;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.ChatReporter$withThreadInfo$1", f = "ChatReporter.kt", l = {237}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatReporter$withThreadInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $block;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatReporter$withThreadInfo$1(b bVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$block = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatReporter$withThreadInfo$1(this.this$0, this.$block, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatReporter$withThreadInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pb pbVar = this.this$0.h;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.A(pbVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        j3b j3bVar = (j3b) obj;
        if (j3bVar != null) {
            this.$block.invoke(j3bVar);
        }
        return zy11.a;
    }
}
