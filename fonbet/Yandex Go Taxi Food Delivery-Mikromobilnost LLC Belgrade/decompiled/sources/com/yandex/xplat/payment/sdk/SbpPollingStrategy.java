package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/xplat/payment/sdk/SbpPollingStrategy;", "", "resolveOnSbpUrl", "resolveOnSuccess", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SbpPollingStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SbpPollingStrategy[] $VALUES;
    public static final SbpPollingStrategy resolveOnSbpUrl;
    public static final SbpPollingStrategy resolveOnSuccess;

    static {
        SbpPollingStrategy sbpPollingStrategy = new SbpPollingStrategy("resolveOnSbpUrl", 0);
        resolveOnSbpUrl = sbpPollingStrategy;
        SbpPollingStrategy sbpPollingStrategy2 = new SbpPollingStrategy("resolveOnSuccess", 1);
        resolveOnSuccess = sbpPollingStrategy2;
        SbpPollingStrategy[] sbpPollingStrategyArr = {sbpPollingStrategy, sbpPollingStrategy2};
        $VALUES = sbpPollingStrategyArr;
        $ENTRIES = a.a(sbpPollingStrategyArr);
    }

    public static SbpPollingStrategy valueOf(String str) {
        return (SbpPollingStrategy) Enum.valueOf(SbpPollingStrategy.class, str);
    }

    public static SbpPollingStrategy[] values() {
        return (SbpPollingStrategy[]) $VALUES.clone();
    }
}
