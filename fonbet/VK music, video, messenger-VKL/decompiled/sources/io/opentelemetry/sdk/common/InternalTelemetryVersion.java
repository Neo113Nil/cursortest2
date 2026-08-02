package io.opentelemetry.sdk.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class InternalTelemetryVersion {
    private static final /* synthetic */ InternalTelemetryVersion[] $VALUES;
    public static final InternalTelemetryVersion LATEST;
    public static final InternalTelemetryVersion LEGACY;

    static {
        InternalTelemetryVersion internalTelemetryVersion = new InternalTelemetryVersion("LEGACY", 0);
        LEGACY = internalTelemetryVersion;
        InternalTelemetryVersion internalTelemetryVersion2 = new InternalTelemetryVersion("LATEST", 1);
        LATEST = internalTelemetryVersion2;
        $VALUES = new InternalTelemetryVersion[]{internalTelemetryVersion, internalTelemetryVersion2};
    }

    public InternalTelemetryVersion() {
        throw null;
    }

    public static InternalTelemetryVersion valueOf(String str) {
        return (InternalTelemetryVersion) Enum.valueOf(InternalTelemetryVersion.class, str);
    }

    public static InternalTelemetryVersion[] values() {
        return (InternalTelemetryVersion[]) $VALUES.clone();
    }
}
