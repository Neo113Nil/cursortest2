package io.opentelemetry.sdk.metrics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class InstrumentType {
    private static final /* synthetic */ InstrumentType[] $VALUES;
    public static final InstrumentType COUNTER;
    public static final InstrumentType GAUGE;
    public static final InstrumentType HISTOGRAM;
    public static final InstrumentType OBSERVABLE_COUNTER;
    public static final InstrumentType OBSERVABLE_GAUGE;
    public static final InstrumentType OBSERVABLE_UP_DOWN_COUNTER;
    public static final InstrumentType UP_DOWN_COUNTER;

    static {
        InstrumentType instrumentType = new InstrumentType("COUNTER", 0);
        COUNTER = instrumentType;
        InstrumentType instrumentType2 = new InstrumentType("UP_DOWN_COUNTER", 1);
        UP_DOWN_COUNTER = instrumentType2;
        InstrumentType instrumentType3 = new InstrumentType("HISTOGRAM", 2);
        HISTOGRAM = instrumentType3;
        InstrumentType instrumentType4 = new InstrumentType("OBSERVABLE_COUNTER", 3);
        OBSERVABLE_COUNTER = instrumentType4;
        InstrumentType instrumentType5 = new InstrumentType("OBSERVABLE_UP_DOWN_COUNTER", 4);
        OBSERVABLE_UP_DOWN_COUNTER = instrumentType5;
        InstrumentType instrumentType6 = new InstrumentType("OBSERVABLE_GAUGE", 5);
        OBSERVABLE_GAUGE = instrumentType6;
        InstrumentType instrumentType7 = new InstrumentType("GAUGE", 6);
        GAUGE = instrumentType7;
        $VALUES = new InstrumentType[]{instrumentType, instrumentType2, instrumentType3, instrumentType4, instrumentType5, instrumentType6, instrumentType7};
    }

    public InstrumentType() {
        throw null;
    }

    public static InstrumentType valueOf(String str) {
        return (InstrumentType) Enum.valueOf(InstrumentType.class, str);
    }

    public static InstrumentType[] values() {
        return (InstrumentType[]) $VALUES.clone();
    }
}
