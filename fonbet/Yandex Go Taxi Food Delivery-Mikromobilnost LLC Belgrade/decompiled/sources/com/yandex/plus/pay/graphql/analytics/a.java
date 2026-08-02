package com.yandex.plus.pay.graphql.analytics;

import android.os.SystemClock;
import com.yandex.plus.core.graphql.exception.GraphQLException;
import com.yandex.plus.core.graphql.exception.GraphQLHttpException;
import com.yandex.plus.core.graphql.exception.GraphQLNetworkException;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.core.graphql.exception.GraphQLUnknownException;
import defpackage.PayEvgenDiagnostic$PlusPayEvgenResponseErrorType;
import defpackage.bt90;
import defpackage.d5j0;
import defpackage.evu0;
import defpackage.jqr;
import defpackage.kdh;
import defpackage.kvj0;
import defpackage.m5j0;
import defpackage.m8w;
import defpackage.mdd0;
import defpackage.p8w;
import defpackage.rr50;
import defpackage.rvj0;
import defpackage.so2;
import defpackage.sr50;
import defpackage.to2;
import defpackage.tpr;
import defpackage.vez0;
import defpackage.w511;
import defpackage.zci0;
import java.net.URI;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.o;

/* loaded from: classes8.dex */
public final class a implements so2, p8w {
    public final sr50 a;
    public final mdd0 b;
    public final URI c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public a(sr50 sr50Var, mdd0 mdd0Var, URI uri) {
        this.a = sr50Var;
        this.b = mdd0Var;
        this.c = uri;
    }

    @Override // defpackage.so2
    public final tpr a(to2 to2Var, kdh kdhVar) {
        return new o(new k(new jqr(kdhVar.b(to2Var), new NetworkDiagnosticApolloInterceptor$intercept$1(this, to2Var, null), 3), new NetworkDiagnosticApolloInterceptor$intercept$2(this, null)), new NetworkDiagnosticApolloInterceptor$intercept$3(this, to2Var, null));
    }

    public final void b(d5j0 d5j0Var, kvj0 kvj0Var) {
        String a = d5j0Var.c.a("X-Request-Id");
        if (a == null || evu0.J(a)) {
            return;
        }
        m5j0 m5j0Var = d5j0Var.d;
        rvj0 rvj0Var = kvj0Var != null ? kvj0Var.z : null;
        if (m5j0Var == null && rvj0Var == null) {
            return;
        }
        this.d.put(a, new rr50(m5j0Var, rvj0Var, SystemClock.elapsedRealtime()));
    }

    public final void c(String str, String str2, rr50 rr50Var, Throwable th, GraphQLException graphQLException) {
        String message;
        PayEvgenDiagnostic$PlusPayEvgenResponseErrorType payEvgenDiagnostic$PlusPayEvgenResponseErrorType;
        rvj0 rvj0Var;
        m5j0 m5j0Var;
        String Z = (rr50Var == null || (m5j0Var = rr50Var.a) == null) ? null : vez0.Z(m5j0Var);
        if (rr50Var == null || (rvj0Var = rr50Var.b) == null || (message = vez0.a0(rvj0Var)) == null) {
            Throwable th2 = th == null ? graphQLException : th;
            message = th2 != null ? th2.getMessage() : null;
        }
        sr50 sr50Var = this.a;
        sr50Var.getClass();
        if (graphQLException != null) {
            boolean z = graphQLException instanceof GraphQLHttpException;
            if (z) {
                payEvgenDiagnostic$PlusPayEvgenResponseErrorType = PayEvgenDiagnostic$PlusPayEvgenResponseErrorType.Http;
            } else if (graphQLException instanceof GraphQLNetworkException) {
                payEvgenDiagnostic$PlusPayEvgenResponseErrorType = PayEvgenDiagnostic$PlusPayEvgenResponseErrorType.Network;
            } else if (graphQLException instanceof GraphQLParseException) {
                payEvgenDiagnostic$PlusPayEvgenResponseErrorType = PayEvgenDiagnostic$PlusPayEvgenResponseErrorType.Parse;
            } else {
                if (!(graphQLException instanceof GraphQLUnknownException)) {
                    w511.b();
                    return;
                }
                payEvgenDiagnostic$PlusPayEvgenResponseErrorType = PayEvgenDiagnostic$PlusPayEvgenResponseErrorType.Unknown;
            }
            PayEvgenDiagnostic$PlusPayEvgenResponseErrorType payEvgenDiagnostic$PlusPayEvgenResponseErrorType2 = payEvgenDiagnostic$PlusPayEvgenResponseErrorType;
            if (payEvgenDiagnostic$PlusPayEvgenResponseErrorType2 != null) {
                bt90 bt90Var = sr50Var.a;
                String host = this.c.getHost();
                String str3 = host == null ? "no_value" : host;
                String str4 = str == null ? "no_value" : str;
                GraphQLHttpException graphQLHttpException = z ? (GraphQLHttpException) graphQLException : null;
                Integer valueOf = graphQLHttpException != null ? Integer.valueOf(graphQLHttpException.getCode()) : null;
                String num = valueOf != null ? valueOf.toString() : null;
                bt90Var.a(str3, str2, str4, payEvgenDiagnostic$PlusPayEvgenResponseErrorType2, num == null ? "no_value" : num, message == null ? "no_value" : message, Z == null ? "no_value" : Z);
            }
        }
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        Object failure;
        d5j0 d5j0Var = ((zci0) m8wVar).e;
        try {
            failure = ((zci0) m8wVar).b(d5j0Var);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            b(d5j0Var, (kvj0) failure);
        }
        if (Result.a(failure) != null) {
            b(d5j0Var, null);
        }
        kotlin.b.b(failure);
        return (kvj0) failure;
    }
}
