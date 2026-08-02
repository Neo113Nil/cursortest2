package com.apollographql.apollo3.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloNetworkException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "", "platformCause", "Ljava/lang/Object;", "getPlatformCause", "()Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloNetworkException extends ApolloException {
    private final Object platformCause;

    public ApolloNetworkException(String str, Exception exc) {
        super(str, exc != null ? exc : null);
        this.platformCause = exc;
    }

    public ApolloNetworkException() {
        this((String) null, 3);
    }

    public /* synthetic */ ApolloNetworkException(String str, int i) {
        this((i & 1) != 0 ? null : str, (Exception) null);
    }
}
