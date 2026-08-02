package com.yandex.plus.pay.graphql.analytics;

import android.os.SystemClock;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rr50;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza70;", CA20Status.STATUS_REQUEST_D, "Lvpr;", "Lvo2;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.graphql.analytics.NetworkDiagnosticApolloInterceptor$intercept$2", f = "NetworkDiagnosticApolloInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class NetworkDiagnosticApolloInterceptor$intercept$2 extends SuspendLambda implements zls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkDiagnosticApolloInterceptor$intercept$2(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NetworkDiagnosticApolloInterceptor$intercept$2 networkDiagnosticApolloInterceptor$intercept$2 = new NetworkDiagnosticApolloInterceptor$intercept$2(this.this$0, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        networkDiagnosticApolloInterceptor$intercept$2.invokeSuspend(zy11Var);
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
        a aVar = this.this$0;
        aVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - 60000;
        Iterator it = aVar.d.entrySet().iterator();
        while (it.hasNext()) {
            if (((rr50) ((Map.Entry) it.next()).getValue()).c < elapsedRealtime) {
                it.remove();
            }
        }
        return zy11.a;
    }
}
