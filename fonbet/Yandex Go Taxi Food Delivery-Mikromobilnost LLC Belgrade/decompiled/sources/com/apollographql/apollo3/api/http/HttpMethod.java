package com.apollographql.apollo3.api.http;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo3/api/http/HttpMethod;", "", "Get", "Post", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HttpMethod {
    private static final /* synthetic */ HttpMethod[] $VALUES;
    public static final HttpMethod Get;
    public static final HttpMethod Post;

    static {
        HttpMethod httpMethod = new HttpMethod("Get", 0);
        Get = httpMethod;
        HttpMethod httpMethod2 = new HttpMethod("Post", 1);
        Post = httpMethod2;
        $VALUES = new HttpMethod[]{httpMethod, httpMethod2};
    }

    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) $VALUES.clone();
    }
}
