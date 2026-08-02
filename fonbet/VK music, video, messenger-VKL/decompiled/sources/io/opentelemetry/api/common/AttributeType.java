package io.opentelemetry.api.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AttributeType {
    private static final /* synthetic */ AttributeType[] $VALUES;
    public static final AttributeType BOOLEAN;
    public static final AttributeType BOOLEAN_ARRAY;
    public static final AttributeType DOUBLE;
    public static final AttributeType DOUBLE_ARRAY;
    public static final AttributeType LONG;
    public static final AttributeType LONG_ARRAY;
    public static final AttributeType STRING;
    public static final AttributeType STRING_ARRAY;
    public static final AttributeType VALUE;

    static {
        AttributeType attributeType = new AttributeType("STRING", 0);
        STRING = attributeType;
        AttributeType attributeType2 = new AttributeType("BOOLEAN", 1);
        BOOLEAN = attributeType2;
        AttributeType attributeType3 = new AttributeType("LONG", 2);
        LONG = attributeType3;
        AttributeType attributeType4 = new AttributeType("DOUBLE", 3);
        DOUBLE = attributeType4;
        AttributeType attributeType5 = new AttributeType("STRING_ARRAY", 4);
        STRING_ARRAY = attributeType5;
        AttributeType attributeType6 = new AttributeType("BOOLEAN_ARRAY", 5);
        BOOLEAN_ARRAY = attributeType6;
        AttributeType attributeType7 = new AttributeType("LONG_ARRAY", 6);
        LONG_ARRAY = attributeType7;
        AttributeType attributeType8 = new AttributeType("DOUBLE_ARRAY", 7);
        DOUBLE_ARRAY = attributeType8;
        AttributeType attributeType9 = new AttributeType("VALUE", 8);
        VALUE = attributeType9;
        $VALUES = new AttributeType[]{attributeType, attributeType2, attributeType3, attributeType4, attributeType5, attributeType6, attributeType7, attributeType8, attributeType9};
    }

    public AttributeType() {
        throw null;
    }

    public static AttributeType valueOf(String str) {
        return (AttributeType) Enum.valueOf(AttributeType.class, str);
    }

    public static AttributeType[] values() {
        return (AttributeType[]) $VALUES.clone();
    }
}
