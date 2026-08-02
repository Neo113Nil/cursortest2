package com.yandex.plus.core.graphql.exception;

import com.apollographql.apollo3.exception.ApolloHttpException;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/core/graphql/exception/GraphQLHttpException;", "Lcom/yandex/plus/core/graphql/exception/GraphQLException;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "a", "()I", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GraphQLHttpException extends GraphQLException {
    private final int code;

    public GraphQLHttpException(String str, ApolloHttpException apolloHttpException) {
        this(str, apolloHttpException, apolloHttpException.getStatusCode());
    }

    /* renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public GraphQLHttpException(String str, ApolloHttpException apolloHttpException, int i) {
        super(str, apolloHttpException);
        this.code = i;
    }
}
