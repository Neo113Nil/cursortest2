package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ProtoSyntax {
    private static final /* synthetic */ ProtoSyntax[] $VALUES;
    public static final ProtoSyntax EDITIONS;
    public static final ProtoSyntax PROTO2;
    public static final ProtoSyntax PROTO3;

    static {
        ProtoSyntax protoSyntax = new ProtoSyntax("PROTO2", 0);
        PROTO2 = protoSyntax;
        ProtoSyntax protoSyntax2 = new ProtoSyntax("PROTO3", 1);
        PROTO3 = protoSyntax2;
        ProtoSyntax protoSyntax3 = new ProtoSyntax("EDITIONS", 2);
        EDITIONS = protoSyntax3;
        $VALUES = new ProtoSyntax[]{protoSyntax, protoSyntax2, protoSyntax3};
    }

    public static ProtoSyntax valueOf(String str) {
        return (ProtoSyntax) Enum.valueOf(ProtoSyntax.class, str);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) $VALUES.clone();
    }
}
