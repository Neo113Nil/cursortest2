package com.yandex.messaging.internal.view.timeline.poll;

import defpackage.f85;
import defpackage.g85;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tbt;
import defpackage.tpr;
import defpackage.tse;
import defpackage.ubt;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.poll.BasePollMessageViewHolder$startDelayedUpdate$1", f = "BasePollMessageViewHolder.kt", l = {188, 200}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BasePollMessageViewHolder$startDelayedUpdate$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $chatId;
    final /* synthetic */ long $messageTimestamp;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePollMessageViewHolder$startDelayedUpdate$1(String str, long j, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$chatId = str;
        this.$messageTimestamp = j;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasePollMessageViewHolder$startDelayedUpdate$1(this.$chatId, this.$messageTimestamp, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePollMessageViewHolder$startDelayedUpdate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r11.collect(r1, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (defpackage.wpb1.h(r4, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long j = g85.a;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        String str = this.$chatId;
        long j2 = this.$messageTimestamp;
        a aVar = this.this$0;
        tpr a = ((ubt) aVar.x2.c).a(new tbt(3, j2, aVar.Z, str, aVar.a0));
        f85 f85Var = f85.b;
        this.label = 2;
    }
}
