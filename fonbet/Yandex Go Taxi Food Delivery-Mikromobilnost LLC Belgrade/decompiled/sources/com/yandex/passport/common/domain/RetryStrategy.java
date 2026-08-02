package com.yandex.passport.common.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/common/domain/RetryStrategy;", "", "CONSTANT", "LINEAR", "EXPONENTIAL", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RetryStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RetryStrategy[] $VALUES;
    public static final RetryStrategy CONSTANT;
    public static final RetryStrategy EXPONENTIAL;
    public static final RetryStrategy LINEAR;

    static {
        RetryStrategy retryStrategy = new RetryStrategy("CONSTANT", 0);
        CONSTANT = retryStrategy;
        RetryStrategy retryStrategy2 = new RetryStrategy("LINEAR", 1);
        LINEAR = retryStrategy2;
        RetryStrategy retryStrategy3 = new RetryStrategy("EXPONENTIAL", 2);
        EXPONENTIAL = retryStrategy3;
        RetryStrategy[] retryStrategyArr = {retryStrategy, retryStrategy2, retryStrategy3};
        $VALUES = retryStrategyArr;
        $ENTRIES = kotlin.enums.a.a(retryStrategyArr);
    }

    public static RetryStrategy valueOf(String str) {
        return (RetryStrategy) Enum.valueOf(RetryStrategy.class, str);
    }

    public static RetryStrategy[] values() {
        return (RetryStrategy[]) $VALUES.clone();
    }
}
