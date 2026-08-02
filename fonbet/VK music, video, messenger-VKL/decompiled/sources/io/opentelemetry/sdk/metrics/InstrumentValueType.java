package io.opentelemetry.sdk.metrics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class InstrumentValueType {
    private static final /* synthetic */ InstrumentValueType[] $VALUES;
    public static final InstrumentValueType DOUBLE;
    public static final InstrumentValueType LONG;

    static {
        InstrumentValueType instrumentValueType = new InstrumentValueType("LONG", 0);
        LONG = instrumentValueType;
        InstrumentValueType instrumentValueType2 = new InstrumentValueType("DOUBLE", 1);
        DOUBLE = instrumentValueType2;
        $VALUES = new InstrumentValueType[]{instrumentValueType, instrumentValueType2};
    }

    public InstrumentValueType() {
        throw null;
    }

    public static InstrumentValueType valueOf(String str) {
        return (InstrumentValueType) Enum.valueOf(InstrumentValueType.class, str);
    }

    public static InstrumentValueType[] values() {
        return (InstrumentValueType[]) $VALUES.clone();
    }
}
