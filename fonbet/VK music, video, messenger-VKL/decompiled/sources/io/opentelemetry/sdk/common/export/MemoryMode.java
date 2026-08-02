package io.opentelemetry.sdk.common.export;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class MemoryMode {
    private static final /* synthetic */ MemoryMode[] $VALUES;
    public static final MemoryMode IMMUTABLE_DATA;
    public static final MemoryMode REUSABLE_DATA;

    static {
        MemoryMode memoryMode = new MemoryMode("REUSABLE_DATA", 0);
        REUSABLE_DATA = memoryMode;
        MemoryMode memoryMode2 = new MemoryMode("IMMUTABLE_DATA", 1);
        IMMUTABLE_DATA = memoryMode2;
        $VALUES = new MemoryMode[]{memoryMode, memoryMode2};
    }

    public MemoryMode() {
        throw null;
    }

    public static MemoryMode valueOf(String str) {
        return (MemoryMode) Enum.valueOf(MemoryMode.class, str);
    }

    public static MemoryMode[] values() {
        return (MemoryMode[]) $VALUES.clone();
    }
}
