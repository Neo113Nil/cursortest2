package io.opentelemetry.api.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ValueType {
    private static final /* synthetic */ ValueType[] $VALUES;
    public static final ValueType ARRAY;
    public static final ValueType BOOLEAN;
    public static final ValueType BYTES;
    public static final ValueType DOUBLE;
    public static final ValueType EMPTY;
    public static final ValueType KEY_VALUE_LIST;
    public static final ValueType LONG;
    public static final ValueType STRING;

    static {
        ValueType valueType = new ValueType("STRING", 0);
        STRING = valueType;
        ValueType valueType2 = new ValueType("BOOLEAN", 1);
        BOOLEAN = valueType2;
        ValueType valueType3 = new ValueType("LONG", 2);
        LONG = valueType3;
        ValueType valueType4 = new ValueType("DOUBLE", 3);
        DOUBLE = valueType4;
        ValueType valueType5 = new ValueType("ARRAY", 4);
        ARRAY = valueType5;
        ValueType valueType6 = new ValueType("KEY_VALUE_LIST", 5);
        KEY_VALUE_LIST = valueType6;
        ValueType valueType7 = new ValueType("BYTES", 6);
        BYTES = valueType7;
        ValueType valueType8 = new ValueType("EMPTY", 7);
        EMPTY = valueType8;
        $VALUES = new ValueType[]{valueType, valueType2, valueType3, valueType4, valueType5, valueType6, valueType7, valueType8};
    }

    public ValueType() {
        throw null;
    }

    public static ValueType valueOf(String str) {
        return (ValueType) Enum.valueOf(ValueType.class, str);
    }

    public static ValueType[] values() {
        return (ValueType[]) $VALUES.clone();
    }
}
