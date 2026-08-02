package com.yandex.go.notifications.acknowledge.lifecycle;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fz7;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tka1;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.x8x;
import defpackage.z8x;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz8x;", "pushAckState", "Lzy11;", "<anonymous>", "(Lz8x;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.notifications.acknowledge.lifecycle.SendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1", f = "SendAllPushAckParamsLifecycleListener.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.notifications.acknowledge.lifecycle.SendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1$1", f = "SendAllPushAckParamsLifecycleListener.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.notifications.acknowledge.lifecycle.SendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                b.b(obj);
                com.yandex.go.notifications.acknowledge.domain.b bVar = this.this$0.c;
                this.label = 1;
                if (bVar.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1 sendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1 = new SendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1(this.this$0, continuation);
        sendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1.L$0 = obj;
        return sendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1) create((z8x) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z8x z8xVar = (z8x) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (z8xVar instanceof x8x) {
                x8x x8xVar = (x8x) z8xVar;
                Long b = x8xVar.b();
                long longValue = b != null ? b.longValue() * 60000 : 21600000L;
                Long a = x8xVar.a();
                long longValue2 = a != null ? a.longValue() * 60000 : longValue;
                Boolean c = x8xVar.c();
                ?? booleanValue = c != null ? c.booleanValue() : 1;
                Boolean d = x8xVar.d();
                boolean booleanValue2 = d != null ? d.booleanValue() : false;
                this.this$0.b.e(tka1.j("send_all_push_ack", longValue, longValue2, booleanValue, booleanValue2));
                this.this$0.d.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.L$0 = null;
                this.J$0 = longValue;
                this.J$1 = longValue2;
                this.I$0 = booleanValue;
                this.I$1 = booleanValue2 ? 1 : 0;
                this.label = 1;
                if (tje.k0(mdhVar, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                this.this$0.b.c(new fz7("send_all_push_ack"));
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
