package com.yandex.fintechsdk.core.network.api.request;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/core/network/api/request/RestMethod;", "", "DELETE", "GET", "PATCH", "POST", "PUT", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RestMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RestMethod[] $VALUES;
    public static final RestMethod DELETE;
    public static final RestMethod GET;
    public static final RestMethod PATCH;
    public static final RestMethod POST;
    public static final RestMethod PUT;

    static {
        RestMethod restMethod = new RestMethod("DELETE", 0);
        DELETE = restMethod;
        RestMethod restMethod2 = new RestMethod("GET", 1);
        GET = restMethod2;
        RestMethod restMethod3 = new RestMethod("PATCH", 2);
        PATCH = restMethod3;
        RestMethod restMethod4 = new RestMethod("POST", 3);
        POST = restMethod4;
        RestMethod restMethod5 = new RestMethod("PUT", 4);
        PUT = restMethod5;
        RestMethod[] restMethodArr = {restMethod, restMethod2, restMethod3, restMethod4, restMethod5};
        $VALUES = restMethodArr;
        $ENTRIES = kotlin.enums.a.a(restMethodArr);
    }

    public static RestMethod valueOf(String str) {
        return (RestMethod) Enum.valueOf(RestMethod.class, str);
    }

    public static RestMethod[] values() {
        return (RestMethod[]) $VALUES.clone();
    }
}
