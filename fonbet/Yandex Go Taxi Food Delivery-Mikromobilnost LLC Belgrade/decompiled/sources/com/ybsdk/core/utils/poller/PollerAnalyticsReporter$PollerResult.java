package com.ybsdk.core.utils.poller;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/core/utils/poller/PollerAnalyticsReporter$PollerResult", "", "Lcom/ybsdk/core/utils/poller/PollerAnalyticsReporter$PollerResult;", "<init>", "(Ljava/lang/String;I)V", TlsConstants.TLS_FINISHED, "CANCELLED", "TIMEOUT", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PollerAnalyticsReporter$PollerResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PollerAnalyticsReporter$PollerResult[] $VALUES;
    public static final PollerAnalyticsReporter$PollerResult FINISHED = new PollerAnalyticsReporter$PollerResult(TlsConstants.TLS_FINISHED, 0);
    public static final PollerAnalyticsReporter$PollerResult CANCELLED = new PollerAnalyticsReporter$PollerResult("CANCELLED", 1);
    public static final PollerAnalyticsReporter$PollerResult TIMEOUT = new PollerAnalyticsReporter$PollerResult("TIMEOUT", 2);

    private static final /* synthetic */ PollerAnalyticsReporter$PollerResult[] $values() {
        return new PollerAnalyticsReporter$PollerResult[]{FINISHED, CANCELLED, TIMEOUT};
    }

    static {
        PollerAnalyticsReporter$PollerResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PollerAnalyticsReporter$PollerResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PollerAnalyticsReporter$PollerResult valueOf(String str) {
        return (PollerAnalyticsReporter$PollerResult) Enum.valueOf(PollerAnalyticsReporter$PollerResult.class, str);
    }

    public static PollerAnalyticsReporter$PollerResult[] values() {
        return (PollerAnalyticsReporter$PollerResult[]) $VALUES.clone();
    }
}
