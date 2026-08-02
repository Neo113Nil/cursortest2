package com.yandex.messaging.support;

import com.yandex.messaging.support.SupportBotPayload;
import defpackage.d82;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.support.SupportBotRequestsHandler$handleLogRequest$1", f = "SupportBotRequestsHandler.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SupportBotRequestsHandler$handleLogRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $botRequestId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportBotRequestsHandler$handleLogRequest$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$botRequestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SupportBotRequestsHandler$handleLogRequest$1(this.this$0, this.$botRequestId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SupportBotRequestsHandler$handleLogRequest$1 supportBotRequestsHandler$handleLogRequest$1 = (SupportBotRequestsHandler$handleLogRequest$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        supportBotRequestsHandler$handleLogRequest$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if (r4 == null) goto L11;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object notSupported;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.b.getClass();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            notSupported = (SupportBotPayload) obj;
        }
        notSupported = new SupportBotPayload.NotSupported(this.$botRequestId);
        this.this$0.d.a(notSupported, null, new d82(1));
        return zy11.a;
    }
}
