package com.yandex.plus.pay.graphql.analytics;

import com.yandex.plus.core.graphql.exception.GraphQLException;
import defpackage.b64;
import defpackage.evu0;
import defpackage.gt90;
import defpackage.hvu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rr50;
import defpackage.t5o;
import defpackage.to2;
import defpackage.vo2;
import defpackage.wls;
import defpackage.y5e;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lza70;", CA20Status.STATUS_REQUEST_D, "Lvo2;", "response", "Lzy11;", "<anonymous>", "(Lvo2;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.graphql.analytics.NetworkDiagnosticApolloInterceptor$intercept$1", f = "NetworkDiagnosticApolloInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class NetworkDiagnosticApolloInterceptor$intercept$1 extends SuspendLambda implements wls {
    final /* synthetic */ to2 $request;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkDiagnosticApolloInterceptor$intercept$1(a aVar, to2 to2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = to2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkDiagnosticApolloInterceptor$intercept$1 networkDiagnosticApolloInterceptor$intercept$1 = new NetworkDiagnosticApolloInterceptor$intercept$1(this.this$0, this.$request, continuation);
        networkDiagnosticApolloInterceptor$intercept$1.L$0 = obj;
        return networkDiagnosticApolloInterceptor$intercept$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NetworkDiagnosticApolloInterceptor$intercept$1 networkDiagnosticApolloInterceptor$intercept$1 = (NetworkDiagnosticApolloInterceptor$intercept$1) create((vo2) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        networkDiagnosticApolloInterceptor$intercept$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        if (r10 == false) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        vo2 vo2Var = (vo2) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str2 = null;
        str2 = null;
        str2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        t5o s = y5e.s(vo2Var);
        a aVar = this.this$0;
        if (s != null) {
            to2 to2Var = this.$request;
            aVar.getClass();
            String name = to2Var.a.name();
            List p = y5e.p(vo2Var);
            String r = p != null ? y5e.r(p) : null;
            GraphQLException e = com.yandex.plus.core.graphql.internal.a.e(s);
            aVar.c(r, name, r != null ? (rr50) aVar.d.remove(r) : null, null, e);
            aVar.b.f(gt90.a, b64.l("Error during GraphQL operation. operationName = ", name, "; errorMessage = ", e.getMessage()), e, r);
        } else {
            List p2 = y5e.p(vo2Var);
            aVar.getClass();
            if (p2 != null) {
                Iterator it = p2.iterator();
                boolean z = false;
                Object obj2 = null;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        String str3 = ((hvu) next).a;
                        Locale locale = Locale.ROOT;
                        if (str3.toLowerCase(locale).equals("X-Request-Id".toLowerCase(locale))) {
                            if (z) {
                                break;
                            }
                            z = true;
                            obj2 = next;
                        }
                    }
                }
                hvu hvuVar = (hvu) obj2;
                if (hvuVar != null && (str = hvuVar.b) != null) {
                    str2 = evu0.k0(str).toString();
                }
            }
            if (str2 != null) {
            }
        }
        return zy11.a;
    }
}
