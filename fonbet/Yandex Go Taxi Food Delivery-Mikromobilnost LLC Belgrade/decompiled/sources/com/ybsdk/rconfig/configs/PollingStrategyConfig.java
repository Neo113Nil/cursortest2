package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/rconfig/configs/PollingStrategyConfig;", "", "Lcom/ybsdk/rconfig/configs/PollingStrategyConfig$IntervalType;", "intervalType", "<init>", "(Lcom/ybsdk/rconfig/configs/PollingStrategyConfig$IntervalType;)V", "component1", "()Lcom/ybsdk/rconfig/configs/PollingStrategyConfig$IntervalType;", "copy", "(Lcom/ybsdk/rconfig/configs/PollingStrategyConfig$IntervalType;)Lcom/ybsdk/rconfig/configs/PollingStrategyConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/PollingStrategyConfig$IntervalType;", "getIntervalType", "IntervalType", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PollingStrategyConfig {
    private final IntervalType intervalType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/rconfig/configs/PollingStrategyConfig$IntervalType;", "", "<init>", "(Ljava/lang/String;I)V", "CONST", "BACKOFF", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IntervalType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ IntervalType[] $VALUES;

        @Json(name = "constant")
        public static final IntervalType CONST = new IntervalType("CONST", 0);

        @Json(name = "backoff")
        public static final IntervalType BACKOFF = new IntervalType("BACKOFF", 1);

        private static final /* synthetic */ IntervalType[] $values() {
            return new IntervalType[]{CONST, BACKOFF};
        }

        static {
            IntervalType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private IntervalType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static IntervalType valueOf(String str) {
            return (IntervalType) Enum.valueOf(IntervalType.class, str);
        }

        public static IntervalType[] values() {
            return (IntervalType[]) $VALUES.clone();
        }
    }

    public PollingStrategyConfig(@Json(name = "interval_type") IntervalType intervalType) {
        this.intervalType = intervalType;
    }

    public static /* synthetic */ PollingStrategyConfig copy$default(PollingStrategyConfig pollingStrategyConfig, IntervalType intervalType, int i, Object obj) {
        if ((i & 1) != 0) {
            intervalType = pollingStrategyConfig.intervalType;
        }
        return pollingStrategyConfig.copy(intervalType);
    }

    /* renamed from: component1, reason: from getter */
    public final IntervalType getIntervalType() {
        return this.intervalType;
    }

    public final PollingStrategyConfig copy(@Json(name = "interval_type") IntervalType intervalType) {
        return new PollingStrategyConfig(intervalType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PollingStrategyConfig) && this.intervalType == ((PollingStrategyConfig) other).intervalType;
    }

    public final IntervalType getIntervalType() {
        return this.intervalType;
    }

    public int hashCode() {
        return this.intervalType.hashCode();
    }

    public String toString() {
        return "PollingStrategyConfig(intervalType=" + this.intervalType + Extension.C_BRAKE;
    }
}
