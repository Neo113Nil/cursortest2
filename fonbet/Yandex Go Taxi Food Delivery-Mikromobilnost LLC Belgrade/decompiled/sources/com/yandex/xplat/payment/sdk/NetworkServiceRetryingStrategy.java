package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/xplat/payment/sdk/NetworkServiceRetryingStrategy;", "", "retryOnce", "retry", "noRetry", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkServiceRetryingStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkServiceRetryingStrategy[] $VALUES;
    public static final NetworkServiceRetryingStrategy noRetry;
    public static final NetworkServiceRetryingStrategy retry;
    public static final NetworkServiceRetryingStrategy retryOnce;

    static {
        NetworkServiceRetryingStrategy networkServiceRetryingStrategy = new NetworkServiceRetryingStrategy("retryOnce", 0);
        retryOnce = networkServiceRetryingStrategy;
        NetworkServiceRetryingStrategy networkServiceRetryingStrategy2 = new NetworkServiceRetryingStrategy("retry", 1);
        retry = networkServiceRetryingStrategy2;
        NetworkServiceRetryingStrategy networkServiceRetryingStrategy3 = new NetworkServiceRetryingStrategy("noRetry", 2);
        noRetry = networkServiceRetryingStrategy3;
        NetworkServiceRetryingStrategy[] networkServiceRetryingStrategyArr = {networkServiceRetryingStrategy, networkServiceRetryingStrategy2, networkServiceRetryingStrategy3};
        $VALUES = networkServiceRetryingStrategyArr;
        $ENTRIES = a.a(networkServiceRetryingStrategyArr);
    }

    public static NetworkServiceRetryingStrategy valueOf(String str) {
        return (NetworkServiceRetryingStrategy) Enum.valueOf(NetworkServiceRetryingStrategy.class, str);
    }

    public static NetworkServiceRetryingStrategy[] values() {
        return (NetworkServiceRetryingStrategy[]) $VALUES.clone();
    }
}
