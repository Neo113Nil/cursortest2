package com.yandex.messaging.internal.authorized.chat.refresher;

import defpackage.fse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.smi0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.refresher.ReducedMessageRefresher$requestMessage$2", f = "ReducedMessageRefresher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ReducedMessageRefresher$requestMessage$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $timestamp;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.authorized.chat.refresher.ReducedMessageRefresher$requestMessage$2$1", f = "ReducedMessageRefresher.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.authorized.chat.refresher.ReducedMessageRefresher$requestMessage$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ long $timestamp;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, long j, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$timestamp = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$timestamp, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tse tseVar = (tse) this.L$0;
                e eVar = this.this$0;
                fse coroutineContext = tseVar.getCoroutineContext();
                long j = this.$timestamp;
                this.label = 1;
                if (e.b(eVar, coroutineContext, j, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReducedMessageRefresher$requestMessage$2(e eVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$timestamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReducedMessageRefresher$requestMessage$2 reducedMessageRefresher$requestMessage$2 = new ReducedMessageRefresher$requestMessage$2(this.this$0, this.$timestamp, continuation);
        reducedMessageRefresher$requestMessage$2.L$0 = obj;
        return reducedMessageRefresher$requestMessage$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReducedMessageRefresher$requestMessage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pzt0 N = tje.N((tse) this.L$0, null, null, new AnonymousClass1(this.this$0, this.$timestamp, null), 3);
        e eVar = this.this$0;
        eVar.h.add(N);
        N.w(new smi0(eVar, N, 1));
        return N;
    }
}
