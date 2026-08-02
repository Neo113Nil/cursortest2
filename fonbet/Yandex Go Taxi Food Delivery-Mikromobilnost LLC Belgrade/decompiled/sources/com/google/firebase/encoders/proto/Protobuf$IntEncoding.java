package com.google.firebase.encoders.proto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Protobuf$IntEncoding {
    private static final /* synthetic */ Protobuf$IntEncoding[] $VALUES;
    public static final Protobuf$IntEncoding DEFAULT;
    public static final Protobuf$IntEncoding FIXED;
    public static final Protobuf$IntEncoding SIGNED;

    static {
        Protobuf$IntEncoding protobuf$IntEncoding = new Protobuf$IntEncoding("DEFAULT", 0);
        DEFAULT = protobuf$IntEncoding;
        Protobuf$IntEncoding protobuf$IntEncoding2 = new Protobuf$IntEncoding("SIGNED", 1);
        SIGNED = protobuf$IntEncoding2;
        Protobuf$IntEncoding protobuf$IntEncoding3 = new Protobuf$IntEncoding("FIXED", 2);
        FIXED = protobuf$IntEncoding3;
        $VALUES = new Protobuf$IntEncoding[]{protobuf$IntEncoding, protobuf$IntEncoding2, protobuf$IntEncoding3};
    }

    public static Protobuf$IntEncoding valueOf(String str) {
        return (Protobuf$IntEncoding) Enum.valueOf(Protobuf$IntEncoding.class, str);
    }

    public static Protobuf$IntEncoding[] values() {
        return (Protobuf$IntEncoding[]) $VALUES.clone();
    }
}
