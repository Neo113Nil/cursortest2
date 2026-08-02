package com.yandex.plus.home.analytics.diagnostic.server;

import android.os.SystemClock;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.apollographql.apollo3.exception.ApolloParseException;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.core.network.api.exceptions.OfflineModeEnabledException;
import defpackage.EvgenDiagnostic$NetworkErrorType;
import defpackage.mvg;
import defpackage.to2;
import defpackage.vho;
import defpackage.y5e;
import defpackage.zls;
import defpackage.zy11;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza70;", CA20Status.STATUS_REQUEST_D, "Lvpr;", "Lvo2;", "", "error", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.analytics.diagnostic.server.EvgenDiagnosticApolloInterceptor$intercept$2", f = "EvgenDiagnosticApolloInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class EvgenDiagnosticApolloInterceptor$intercept$2 extends SuspendLambda implements zls {
    final /* synthetic */ to2 $request;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvgenDiagnosticApolloInterceptor$intercept$2(a aVar, to2 to2Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$request = to2Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        EvgenDiagnosticApolloInterceptor$intercept$2 evgenDiagnosticApolloInterceptor$intercept$2 = new EvgenDiagnosticApolloInterceptor$intercept$2(this.this$0, this.$request, (Continuation) obj3);
        evgenDiagnosticApolloInterceptor$intercept$2.L$0 = (Throwable) obj2;
        evgenDiagnosticApolloInterceptor$intercept$2.invokeSuspend(zy11.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType;
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        a aVar = this.this$0;
        to2 to2Var = this.$request;
        aVar.getClass();
        HashMap hashMap = new HashMap(3);
        if (th instanceof ApolloHttpException) {
            ApolloHttpException apolloHttpException = (ApolloHttpException) th;
            String r = y5e.r(apolloHttpException.getHeaders());
            int statusCode = apolloHttpException.getStatusCode();
            evgenDiagnostic$NetworkErrorType = EvgenDiagnostic$NetworkErrorType.Http;
            hashMap.put(AuthSdkActivity.RESPONSE_TYPE_CODE, String.valueOf(statusCode));
            if (r == null) {
                r = "";
            }
            hashMap.put("request_id", r);
        } else if (th instanceof ApolloNetworkException) {
            Throwable cause = th.getCause();
            if (cause instanceof OfflineModeEnabledException) {
                throw th;
            }
            evgenDiagnostic$NetworkErrorType = cause instanceof SSLException ? EvgenDiagnostic$NetworkErrorType.Ssl : ((cause instanceof SocketTimeoutException) || (cause instanceof UnknownHostException)) ? EvgenDiagnostic$NetworkErrorType.Connection : EvgenDiagnostic$NetworkErrorType.Unknown;
        } else {
            evgenDiagnostic$NetworkErrorType = th instanceof ApolloParseException ? EvgenDiagnostic$NetworkErrorType.Parsing : EvgenDiagnostic$NetworkErrorType.Unknown;
        }
        EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType2 = evgenDiagnostic$NetworkErrorType;
        Throwable cause2 = th.getCause();
        String message = cause2 != null ? cause2.getMessage() : null;
        if (message == null) {
            message = "";
        }
        hashMap.put("cause_message", message);
        String name = to2Var.a.name();
        String message2 = th.getMessage();
        vho vhoVar = new vho(to2Var, name, evgenDiagnostic$NetworkErrorType2, message2 == null ? "" : message2, hashMap);
        LinkedHashMap linkedHashMap = aVar.d;
        ReentrantLock reentrantLock = aVar.c;
        reentrantLock.lock();
        try {
            Long l = (Long) linkedHashMap.get(vhoVar);
            if (l != null) {
                if (l.longValue() + 60000 < SystemClock.elapsedRealtime()) {
                }
                reentrantLock.unlock();
                throw th;
            }
            aVar.a.a(vhoVar.d(), vhoVar.b(), vhoVar.c(), vhoVar.a());
            aVar.b(vhoVar.e().e, vhoVar.d(), vhoVar.b(), vhoVar.c(), vhoVar.a());
            long elapsedRealtime = SystemClock.elapsedRealtime() - 60000;
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Number) ((Map.Entry) it.next()).getValue()).longValue() < elapsedRealtime) {
                    it.remove();
                }
            }
            linkedHashMap.put(vhoVar, Long.valueOf(SystemClock.elapsedRealtime()));
            reentrantLock.unlock();
            throw th;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
