package com.apollographql.apollo3.exception;

import defpackage.hvu;
import defpackage.qq6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloHttpException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "", "statusCode", CA20Status.STATUS_USER_I, "c", "()I", "", "Lhvu;", "headers", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lqq6;", "body", "Lqq6;", "a", "()Lqq6;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class ApolloHttpException extends ApolloException {
    private final qq6 body;
    private final List<hvu> headers;
    private final int statusCode;

    public ApolloHttpException(int i, ArrayList arrayList, qq6 qq6Var, String str) {
        super(str, (Throwable) null);
        this.statusCode = i;
        this.headers = arrayList;
        this.body = qq6Var;
    }

    /* renamed from: a, reason: from getter */
    public final qq6 getBody() {
        return this.body;
    }

    /* renamed from: b, reason: from getter */
    public final List getHeaders() {
        return this.headers;
    }

    /* renamed from: c, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }
}
