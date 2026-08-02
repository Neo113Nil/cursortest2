package androidx.datastore.preferences.protobuf;

import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class WireFormat$FieldType {
    private static final /* synthetic */ WireFormat$FieldType[] $VALUES;
    public static final WireFormat$FieldType BOOL;
    public static final WireFormat$FieldType BYTES;
    public static final WireFormat$FieldType DOUBLE;
    public static final WireFormat$FieldType ENUM;
    public static final WireFormat$FieldType FIXED32;
    public static final WireFormat$FieldType FIXED64;
    public static final WireFormat$FieldType FLOAT;
    public static final WireFormat$FieldType GROUP;
    public static final WireFormat$FieldType INT32;
    public static final WireFormat$FieldType INT64;
    public static final WireFormat$FieldType MESSAGE;
    public static final WireFormat$FieldType SFIXED32;
    public static final WireFormat$FieldType SFIXED64;
    public static final WireFormat$FieldType SINT32;
    public static final WireFormat$FieldType SINT64;
    public static final WireFormat$FieldType STRING;
    public static final WireFormat$FieldType UINT32;
    public static final WireFormat$FieldType UINT64;
    private final WireFormat$JavaType javaType;
    private final int wireType;

    /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$1, reason: invalid class name */
    public enum AnonymousClass1 extends WireFormat$FieldType {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$2, reason: invalid class name */
    public enum AnonymousClass2 extends WireFormat$FieldType {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$3, reason: invalid class name */
    public enum AnonymousClass3 extends WireFormat$FieldType {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$4, reason: invalid class name */
    public enum AnonymousClass4 extends WireFormat$FieldType {
    }

    static {
        WireFormat$FieldType wireFormat$FieldType = new WireFormat$FieldType("DOUBLE", 0, WireFormat$JavaType.DOUBLE, 1);
        DOUBLE = wireFormat$FieldType;
        WireFormat$FieldType wireFormat$FieldType2 = new WireFormat$FieldType("FLOAT", 1, WireFormat$JavaType.FLOAT, 5);
        FLOAT = wireFormat$FieldType2;
        WireFormat$JavaType wireFormat$JavaType = WireFormat$JavaType.LONG;
        WireFormat$FieldType wireFormat$FieldType3 = new WireFormat$FieldType("INT64", 2, wireFormat$JavaType, 0);
        INT64 = wireFormat$FieldType3;
        WireFormat$FieldType wireFormat$FieldType4 = new WireFormat$FieldType("UINT64", 3, wireFormat$JavaType, 0);
        UINT64 = wireFormat$FieldType4;
        WireFormat$JavaType wireFormat$JavaType2 = WireFormat$JavaType.INT;
        WireFormat$FieldType wireFormat$FieldType5 = new WireFormat$FieldType("INT32", 4, wireFormat$JavaType2, 0);
        INT32 = wireFormat$FieldType5;
        WireFormat$FieldType wireFormat$FieldType6 = new WireFormat$FieldType("FIXED64", 5, wireFormat$JavaType, 1);
        FIXED64 = wireFormat$FieldType6;
        WireFormat$FieldType wireFormat$FieldType7 = new WireFormat$FieldType("FIXED32", 6, wireFormat$JavaType2, 5);
        FIXED32 = wireFormat$FieldType7;
        WireFormat$FieldType wireFormat$FieldType8 = new WireFormat$FieldType("BOOL", 7, WireFormat$JavaType.BOOLEAN, 0);
        BOOL = wireFormat$FieldType8;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("STRING", 8, WireFormat$JavaType.STRING, 2);
        STRING = anonymousClass1;
        WireFormat$JavaType wireFormat$JavaType3 = WireFormat$JavaType.MESSAGE;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("GROUP", 9, wireFormat$JavaType3, 3);
        GROUP = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(IDialogId.INTENT_EXTRA_IN_MESSAGE, 10, wireFormat$JavaType3, 2);
        MESSAGE = anonymousClass3;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4("BYTES", 11, WireFormat$JavaType.BYTE_STRING, 2);
        BYTES = anonymousClass4;
        WireFormat$FieldType wireFormat$FieldType9 = new WireFormat$FieldType("UINT32", 12, wireFormat$JavaType2, 0);
        UINT32 = wireFormat$FieldType9;
        WireFormat$FieldType wireFormat$FieldType10 = new WireFormat$FieldType("ENUM", 13, WireFormat$JavaType.ENUM, 0);
        ENUM = wireFormat$FieldType10;
        WireFormat$FieldType wireFormat$FieldType11 = new WireFormat$FieldType("SFIXED32", 14, wireFormat$JavaType2, 5);
        SFIXED32 = wireFormat$FieldType11;
        WireFormat$FieldType wireFormat$FieldType12 = new WireFormat$FieldType("SFIXED64", 15, wireFormat$JavaType, 1);
        SFIXED64 = wireFormat$FieldType12;
        WireFormat$FieldType wireFormat$FieldType13 = new WireFormat$FieldType("SINT32", 16, wireFormat$JavaType2, 0);
        SINT32 = wireFormat$FieldType13;
        WireFormat$FieldType wireFormat$FieldType14 = new WireFormat$FieldType("SINT64", 17, wireFormat$JavaType, 0);
        SINT64 = wireFormat$FieldType14;
        $VALUES = new WireFormat$FieldType[]{wireFormat$FieldType, wireFormat$FieldType2, wireFormat$FieldType3, wireFormat$FieldType4, wireFormat$FieldType5, wireFormat$FieldType6, wireFormat$FieldType7, wireFormat$FieldType8, anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, wireFormat$FieldType9, wireFormat$FieldType10, wireFormat$FieldType11, wireFormat$FieldType12, wireFormat$FieldType13, wireFormat$FieldType14};
    }

    public WireFormat$FieldType(String str, int i, WireFormat$JavaType wireFormat$JavaType, int i2) {
        this.javaType = wireFormat$JavaType;
        this.wireType = i2;
    }

    public static WireFormat$FieldType valueOf(String str) {
        return (WireFormat$FieldType) Enum.valueOf(WireFormat$FieldType.class, str);
    }

    public static WireFormat$FieldType[] values() {
        return (WireFormat$FieldType[]) $VALUES.clone();
    }

    public final WireFormat$JavaType a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }
}
