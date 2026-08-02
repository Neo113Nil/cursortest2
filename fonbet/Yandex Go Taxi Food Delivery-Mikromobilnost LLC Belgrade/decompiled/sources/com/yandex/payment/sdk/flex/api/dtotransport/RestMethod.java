package com.yandex.payment.sdk.flex.api.dtotransport;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.twj0;
import defpackage.zfj0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/payment/sdk/flex/api/dtotransport/RestMethod;", "", "Companion", "twj0", "GET", "POST", "PUT", "HEAD", "DELETE", "PATCH", "flex-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RestMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RestMethod[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final twj0 Companion;
    public static final RestMethod DELETE;
    public static final RestMethod GET;
    public static final RestMethod HEAD;
    public static final RestMethod PATCH;
    public static final RestMethod POST;
    public static final RestMethod PUT;

    static {
        RestMethod restMethod = new RestMethod("GET", 0);
        GET = restMethod;
        RestMethod restMethod2 = new RestMethod("POST", 1);
        POST = restMethod2;
        RestMethod restMethod3 = new RestMethod("PUT", 2);
        PUT = restMethod3;
        RestMethod restMethod4 = new RestMethod("HEAD", 3);
        HEAD = restMethod4;
        RestMethod restMethod5 = new RestMethod("DELETE", 4);
        DELETE = restMethod5;
        RestMethod restMethod6 = new RestMethod("PATCH", 5);
        PATCH = restMethod6;
        RestMethod[] restMethodArr = {restMethod, restMethod2, restMethod3, restMethod4, restMethod5, restMethod6};
        $VALUES = restMethodArr;
        $ENTRIES = a.a(restMethodArr);
        Companion = new twj0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(10));
    }

    public static RestMethod valueOf(String str) {
        return (RestMethod) Enum.valueOf(RestMethod.class, str);
    }

    public static RestMethod[] values() {
        return (RestMethod[]) $VALUES.clone();
    }
}
