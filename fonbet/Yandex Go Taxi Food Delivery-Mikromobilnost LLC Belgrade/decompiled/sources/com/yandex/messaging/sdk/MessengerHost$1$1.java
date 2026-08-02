package com.yandex.messaging.sdk;

import defpackage.dne0;
import defpackage.f220;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.s66;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.messaging.sdk.MessengerHost$1$1", f = "MessengerHost.kt", l = {41, 42}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MessengerHost$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ f220 $this_apply;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerHost$1$1(a aVar, f220 f220Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$this_apply = f220Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessengerHost$1$1(this.this$0, this.$this_apply, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessengerHost$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r1.a(r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (com.yandex.messaging.sdk.a.a(r7, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        zzf zzfVar = (zzf) this.$this_apply;
        com.yandex.go.messenger_native.experiment.c cVar = new com.yandex.go.messenger_native.experiment.c(new s66((rqo) zzfVar.C.get(), 8), (dne0) zzfVar.d.get());
        this.label = 2;
    }
}
