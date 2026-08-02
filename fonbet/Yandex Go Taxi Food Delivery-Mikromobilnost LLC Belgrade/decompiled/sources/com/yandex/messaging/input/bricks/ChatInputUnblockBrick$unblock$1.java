package com.yandex.messaging.input.bricks;

import android.os.Handler;
import defpackage.b00;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tqs;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.bricks.ChatInputUnblockBrick$unblock$1", f = "ChatInputUnblockBrick.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatInputUnblockBrick$unblock$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputUnblockBrick$unblock$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatInputUnblockBrick$unblock$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatInputUnblockBrick$unblock$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            tpr a = aVar.z.a(aVar.y);
            this.label = 1;
            obj = e.y(a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        String str = ((j3b) obj).e;
        zy11 zy11Var = zy11.a;
        if (str == null) {
            return zy11Var;
        }
        b00 b00Var = this.this$0.c;
        ((Handler) b00Var.a.get()).post(new tqs(2, b00Var, str));
        return zy11Var;
    }
}
