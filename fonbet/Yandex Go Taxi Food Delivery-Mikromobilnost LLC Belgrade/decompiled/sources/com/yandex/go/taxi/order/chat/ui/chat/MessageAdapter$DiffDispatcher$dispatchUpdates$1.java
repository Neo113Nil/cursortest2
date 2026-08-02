package com.yandex.go.taxi.order.chat.ui.chat;

import defpackage.gs10;
import defpackage.hs10;
import defpackage.jv10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w410;
import defpackage.wls;
import defpackage.wy10;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.ui.chat.MessageAdapter$DiffDispatcher$dispatchUpdates$1", f = "MessageAdapter.kt", l = {156, 157}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MessageAdapter$DiffDispatcher$dispatchUpdates$1 extends SuspendLambda implements wls {
    final /* synthetic */ hs10 $adapter;
    final /* synthetic */ wy10 $messages;
    final /* synthetic */ List<jv10> $oldModels;
    final /* synthetic */ Consumer<Boolean> $onNewMessages;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ gs10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAdapter$DiffDispatcher$dispatchUpdates$1(gs10 gs10Var, hs10 hs10Var, wy10 wy10Var, List list, Consumer consumer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gs10Var;
        this.$adapter = hs10Var;
        this.$messages = wy10Var;
        this.$oldModels = list;
        this.$onNewMessages = consumer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessageAdapter$DiffDispatcher$dispatchUpdates$1(this.this$0, this.$adapter, this.$messages, this.$oldModels, this.$onNewMessages, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageAdapter$DiffDispatcher$dispatchUpdates$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a2 A[Catch: all -> 0x0023, CancellationException -> 0x00c3, TryCatch #2 {CancellationException -> 0x00c3, all -> 0x0023, blocks: (B:7:0x001e, B:8:0x0099, B:10:0x00a2, B:14:0x00a8, B:16:0x00ac, B:20:0x0041, B:23:0x0072, B:28:0x0055), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8 A[Catch: all -> 0x0023, CancellationException -> 0x00c3, TryCatch #2 {CancellationException -> 0x00c3, all -> 0x0023, blocks: (B:7:0x001e, B:8:0x0099, B:10:0x00a2, B:14:0x00a8, B:16:0x00ac, B:20:0x0041, B:23:0x0072, B:28:0x0055), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [gs10, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        gs10 gs10Var;
        hs10 hs10Var;
        List<jv10> list;
        gs10 gs10Var2;
        Consumer<Boolean> consumer;
        Consumer<Boolean> consumer2;
        gs10 gs10Var3;
        MessageAdapter$TailState messageAdapter$TailState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            r1.c.b("dispatchUpdates", th, new w410(26));
        }
        if (r1 == 0) {
            kotlin.b.b(obj);
            gs10Var = this.this$0;
            hs10Var = this.$adapter;
            wy10 wy10Var = this.$messages;
            list = this.$oldModels;
            Consumer<Boolean> consumer3 = this.$onNewMessages;
            this.L$0 = gs10Var;
            this.L$1 = hs10Var;
            this.L$2 = list;
            this.L$3 = consumer3;
            this.L$4 = gs10Var;
            this.label = 1;
            obj = tje.k0(gs10Var.d, new MessageAdapter$DiffDispatcher$mapToModels$2(hs10Var, wy10Var, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            gs10Var2 = gs10Var;
            consumer = consumer3;
        } else {
            if (r1 != 1) {
                if (r1 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                consumer2 = (Consumer) this.L$1;
                gs10Var3 = (gs10) this.L$0;
                kotlin.b.b(obj);
                messageAdapter$TailState = (MessageAdapter$TailState) obj;
                gs10Var3.getClass();
                if (messageAdapter$TailState != MessageAdapter$TailState.TAIL_APPENDED) {
                    consumer2.accept(Boolean.TRUE);
                } else if (messageAdapter$TailState == MessageAdapter$TailState.TAIL_MOVES) {
                    consumer2.accept(Boolean.FALSE);
                }
                return zy11.a;
            }
            gs10Var = (gs10) this.L$4;
            consumer = (Consumer) this.L$3;
            list = (List) this.L$2;
            hs10Var = (hs10) this.L$1;
            gs10 gs10Var4 = (gs10) this.L$0;
            kotlin.b.b(obj);
            gs10Var2 = gs10Var4;
        }
        hs10 hs10Var2 = hs10Var;
        List<jv10> list2 = list;
        List list3 = (List) obj;
        this.L$0 = gs10Var2;
        this.L$1 = consumer;
        this.L$2 = gs10Var;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
        gs10Var2.b.getClass();
        sjh sjhVar = uyj.a;
        obj = tje.k0(o400.a, new MessageAdapter$DiffDispatcher$setMessages$2(list2, hs10Var2, list3, gs10Var2, null), this);
        if (obj != coroutineSingletons) {
            consumer2 = consumer;
            gs10Var3 = gs10Var2;
            messageAdapter$TailState = (MessageAdapter$TailState) obj;
            gs10Var3.getClass();
            if (messageAdapter$TailState != MessageAdapter$TailState.TAIL_APPENDED) {
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
