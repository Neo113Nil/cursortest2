package com.ybsdk.rconfig;

import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechConfigStateReason;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/ybsdk/rconfig/RemoteConfigReporter$ReportReason", "", "Lcom/ybsdk/rconfig/RemoteConfigReporter$ReportReason;", "Lcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechConfigStateReason;", CRLReasonCodeExtension.REASON, "<init>", "(Ljava/lang/String;ILcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechConfigStateReason;)V", "Lcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechConfigStateReason;", "getReason", "()Lcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechConfigStateReason;", "COLD_START_APPLY", "HOT_START_APPLY", "REMOTE_CONFIG_UPDATE", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RemoteConfigReporter$ReportReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RemoteConfigReporter$ReportReason[] $VALUES;
    public static final RemoteConfigReporter$ReportReason COLD_START_APPLY = new RemoteConfigReporter$ReportReason("COLD_START_APPLY", 0, TechEvents$TechConfigStateReason.COLD_START);
    public static final RemoteConfigReporter$ReportReason HOT_START_APPLY = new RemoteConfigReporter$ReportReason("HOT_START_APPLY", 1, TechEvents$TechConfigStateReason.HOT_START);
    public static final RemoteConfigReporter$ReportReason REMOTE_CONFIG_UPDATE = new RemoteConfigReporter$ReportReason("REMOTE_CONFIG_UPDATE", 2, TechEvents$TechConfigStateReason.REMOTE_CONFIG_UPDATE);
    private final TechEvents$TechConfigStateReason reason;

    private static final /* synthetic */ RemoteConfigReporter$ReportReason[] $values() {
        return new RemoteConfigReporter$ReportReason[]{COLD_START_APPLY, HOT_START_APPLY, REMOTE_CONFIG_UPDATE};
    }

    static {
        RemoteConfigReporter$ReportReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private RemoteConfigReporter$ReportReason(String str, int i, TechEvents$TechConfigStateReason techEvents$TechConfigStateReason) {
        this.reason = techEvents$TechConfigStateReason;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RemoteConfigReporter$ReportReason valueOf(String str) {
        return (RemoteConfigReporter$ReportReason) Enum.valueOf(RemoteConfigReporter$ReportReason.class, str);
    }

    public static RemoteConfigReporter$ReportReason[] values() {
        return (RemoteConfigReporter$ReportReason[]) $VALUES.clone();
    }

    public final TechEvents$TechConfigStateReason getReason() {
        return this.reason;
    }
}
