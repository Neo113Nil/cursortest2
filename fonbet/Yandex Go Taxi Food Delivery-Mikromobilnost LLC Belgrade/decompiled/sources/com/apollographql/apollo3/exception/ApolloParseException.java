package com.apollographql.apollo3.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloParseException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class ApolloParseException extends ApolloException {
    public ApolloParseException(Throwable th) {
        super("Failed to parse GraphQL http network response", th);
    }

    public ApolloParseException() {
        super((String) null, (Throwable) null);
    }
}
