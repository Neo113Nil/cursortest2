package com.yandex.plus.core.graphql.internal;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.apollographql.apollo3.exception.ApolloParseException;
import com.yandex.plus.core.graphql.exception.GraphQLException;
import com.yandex.plus.core.graphql.exception.GraphQLHttpException;
import com.yandex.plus.core.graphql.exception.GraphQLNetworkException;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.core.graphql.exception.GraphQLUnknownException;
import defpackage.b050;
import defpackage.bvu0;
import defpackage.cqc0;
import defpackage.ejg0;
import defpackage.fc70;
import defpackage.ny61;
import defpackage.qo2;
import defpackage.t5o;
import defpackage.tls;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public abstract class a {
    public static final Object a(qo2 qo2Var, b050 b050Var, ContinuationImpl continuationImpl) {
        return b(b050Var, new ApolloClientExtensionsKt$awaitMutation$2(qo2Var, b050Var, null), continuationImpl);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|13|(1:15)(2:17|(2:19|20)(2:21|22))))|36|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(fc70 fc70Var, tls tlsVar, ContinuationImpl continuationImpl) {
        ApolloClientExtensionsKt$awaitOperation$1 apolloClientExtensionsKt$awaitOperation$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof ApolloClientExtensionsKt$awaitOperation$1) {
            apolloClientExtensionsKt$awaitOperation$1 = (ApolloClientExtensionsKt$awaitOperation$1) continuationImpl;
            int i2 = apolloClientExtensionsKt$awaitOperation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                apolloClientExtensionsKt$awaitOperation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = apolloClientExtensionsKt$awaitOperation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = apolloClientExtensionsKt$awaitOperation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    apolloClientExtensionsKt$awaitOperation$1.L$0 = fc70Var;
                    apolloClientExtensionsKt$awaitOperation$1.L$1 = null;
                    apolloClientExtensionsKt$awaitOperation$1.L$2 = null;
                    apolloClientExtensionsKt$awaitOperation$1.L$3 = null;
                    apolloClientExtensionsKt$awaitOperation$1.L$4 = null;
                    apolloClientExtensionsKt$awaitOperation$1.I$0 = 0;
                    apolloClientExtensionsKt$awaitOperation$1.I$1 = 0;
                    apolloClientExtensionsKt$awaitOperation$1.label = 1;
                    obj = tlsVar.invoke(apolloClientExtensionsKt$awaitOperation$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fc70Var = (fc70) apolloClientExtensionsKt$awaitOperation$1.L$0;
                    kotlin.b.b(obj);
                }
                a = Result.a(obj);
                if (a != null) {
                    return obj;
                }
                if (a instanceof ApolloException) {
                    throw f((ApolloException) a, fc70Var.name());
                }
                throw new GraphQLUnknownException(a.getMessage(), a);
            }
        }
        apolloClientExtensionsKt$awaitOperation$1 = new ApolloClientExtensionsKt$awaitOperation$1(continuationImpl);
        Object obj3 = apolloClientExtensionsKt$awaitOperation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = apolloClientExtensionsKt$awaitOperation$1.label;
        if (i != 0) {
        }
        a = Result.a(obj3);
        if (a != null) {
        }
    }

    public static final Object c(qo2 qo2Var, cqc0 cqc0Var, List list, Continuation continuation) {
        return b(cqc0Var, new ApolloClientExtensionsKt$awaitQuery$4(qo2Var, cqc0Var, list, null), (ContinuationImpl) continuation);
    }

    public static final Object d(qo2 qo2Var, ejg0 ejg0Var, ContinuationImpl continuationImpl) {
        return b(ejg0Var, new ApolloClientExtensionsKt$awaitQuery$2(qo2Var, ejg0Var, null), continuationImpl);
    }

    public static final GraphQLException e(t5o t5oVar) {
        Object obj;
        String obj2;
        Integer l;
        Map b = t5oVar.b();
        return (b == null || (obj = b.get(ACSPConstants.STATUS)) == null || (obj2 = obj.toString()) == null || (l = bvu0.l(10, obj2)) == null) ? new GraphQLUnknownException(t5oVar.a(), null) : new GraphQLHttpException(t5oVar.a(), null, l.intValue());
    }

    public static final GraphQLException f(ApolloException apolloException, String str) {
        return apolloException instanceof ApolloHttpException ? new GraphQLHttpException("Http exception for operation: ".concat(str), (ApolloHttpException) apolloException) : apolloException instanceof ApolloNetworkException ? new GraphQLNetworkException("Network exception for operation: ".concat(str), apolloException) : apolloException instanceof ApolloParseException ? new GraphQLParseException("Parse exception for operation: ".concat(str), apolloException) : new GraphQLUnknownException(apolloException.getMessage(), apolloException);
    }
}
