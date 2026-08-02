package com.yandex.plus.core.graphql.internal;

import com.apollographql.apollo3.exception.ApolloHttpException;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.apollographql.apollo3.exception.ApolloParseException;
import com.yandex.plus.core.graphql.exception.GraphQLHttpException;
import com.yandex.plus.core.graphql.exception.GraphQLNetworkException;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.core.graphql.exception.GraphQLUnknownException;
import defpackage.fc70;
import defpackage.lro;
import defpackage.ny61;
import defpackage.oo2;
import defpackage.qo2;
import defpackage.vo2;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final qo2 a;

    public b(qo2 qo2Var) {
        this.a = qo2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:41|42))(3:43|44|(1:46))|12|(3:14|15|(1:37)(3:17|18|(2:20|(2:22|(2:24|25)(2:27|28))(2:29|30))(2:31|32)))(2:38|39)))|54|6|7|(0)(0)|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004b, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
    
        r11 = new kotlin.Result.Failure(r9);
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0097, code lost:
    
        r9 = r11;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0099, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009a, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0049, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0092, code lost:
    
        r11 = new kotlin.Result.Failure(r9);
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080 A[Catch: all -> 0x0049, TimeoutCancellationException -> 0x004b, CancellationException -> 0x0099, TryCatch #3 {TimeoutCancellationException -> 0x004b, CancellationException -> 0x0099, all -> 0x0049, blocks: (B:11:0x0045, B:12:0x0079, B:38:0x0080, B:39:0x0091, B:44:0x0056), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r10v15, types: [fc70] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(lro lroVar, ContinuationImpl continuationImpl) {
        ApolloClientWrapperImpl$awaitQuery$1 apolloClientWrapperImpl$awaitQuery$1;
        int i;
        Object obj;
        if (continuationImpl instanceof ApolloClientWrapperImpl$awaitQuery$1) {
            apolloClientWrapperImpl$awaitQuery$1 = (ApolloClientWrapperImpl$awaitQuery$1) continuationImpl;
            int i2 = apolloClientWrapperImpl$awaitQuery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                apolloClientWrapperImpl$awaitQuery$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = apolloClientWrapperImpl$awaitQuery$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = apolloClientWrapperImpl$awaitQuery$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    oo2 oo2Var = new oo2(this.a, lroVar);
                    apolloClientWrapperImpl$awaitQuery$1.L$0 = null;
                    apolloClientWrapperImpl$awaitQuery$1.L$1 = null;
                    apolloClientWrapperImpl$awaitQuery$1.L$2 = lroVar;
                    apolloClientWrapperImpl$awaitQuery$1.L$3 = null;
                    apolloClientWrapperImpl$awaitQuery$1.L$4 = null;
                    apolloClientWrapperImpl$awaitQuery$1.L$5 = null;
                    apolloClientWrapperImpl$awaitQuery$1.I$0 = 0;
                    apolloClientWrapperImpl$awaitQuery$1.I$1 = 0;
                    apolloClientWrapperImpl$awaitQuery$1.I$2 = 0;
                    apolloClientWrapperImpl$awaitQuery$1.label = 1;
                    obj2 = oo2Var.g(apolloClientWrapperImpl$awaitQuery$1);
                    lroVar = lroVar;
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r10 = (fc70) apolloClientWrapperImpl$awaitQuery$1.L$2;
                    kotlin.b.b(obj2);
                    lroVar = r10;
                }
                obj = ((vo2) obj2).c;
                if (obj != null) {
                    throw new IllegalArgumentException("Response data is null: ".concat(lroVar.name()).toString());
                }
                lro lroVar2 = lroVar;
                Throwable a = Result.a(obj);
                if (a == null) {
                    return obj;
                }
                try {
                    String name = lroVar2.name();
                    if (a instanceof ApolloHttpException) {
                        throw new GraphQLHttpException("Http exception: ".concat(name), (ApolloHttpException) a);
                    }
                    if (a instanceof ApolloNetworkException) {
                        throw new GraphQLNetworkException("Network exception: ".concat(name), a);
                    }
                    if (a instanceof ApolloParseException) {
                        throw new GraphQLParseException("Parse exception: ".concat(name), a);
                    }
                    throw new GraphQLUnknownException(a.getMessage(), a);
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        apolloClientWrapperImpl$awaitQuery$1 = new ApolloClientWrapperImpl$awaitQuery$1(this, continuationImpl);
        Object obj22 = apolloClientWrapperImpl$awaitQuery$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = apolloClientWrapperImpl$awaitQuery$1.label;
        if (i != 0) {
        }
        obj = ((vo2) obj22).c;
        if (obj != null) {
        }
    }
}
