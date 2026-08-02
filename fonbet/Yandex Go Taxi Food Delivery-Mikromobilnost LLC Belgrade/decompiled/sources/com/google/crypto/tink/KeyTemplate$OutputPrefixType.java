package com.google.crypto.tink;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class KeyTemplate$OutputPrefixType {
    private static final /* synthetic */ KeyTemplate$OutputPrefixType[] $VALUES;
    public static final KeyTemplate$OutputPrefixType CRUNCHY;
    public static final KeyTemplate$OutputPrefixType LEGACY;
    public static final KeyTemplate$OutputPrefixType RAW;
    public static final KeyTemplate$OutputPrefixType TINK;

    static {
        KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType = new KeyTemplate$OutputPrefixType("TINK", 0);
        TINK = keyTemplate$OutputPrefixType;
        KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType2 = new KeyTemplate$OutputPrefixType("LEGACY", 1);
        LEGACY = keyTemplate$OutputPrefixType2;
        KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType3 = new KeyTemplate$OutputPrefixType("RAW", 2);
        RAW = keyTemplate$OutputPrefixType3;
        KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType4 = new KeyTemplate$OutputPrefixType("CRUNCHY", 3);
        CRUNCHY = keyTemplate$OutputPrefixType4;
        $VALUES = new KeyTemplate$OutputPrefixType[]{keyTemplate$OutputPrefixType, keyTemplate$OutputPrefixType2, keyTemplate$OutputPrefixType3, keyTemplate$OutputPrefixType4};
    }

    public static KeyTemplate$OutputPrefixType valueOf(String str) {
        return (KeyTemplate$OutputPrefixType) Enum.valueOf(KeyTemplate$OutputPrefixType.class, str);
    }

    public static KeyTemplate$OutputPrefixType[] values() {
        return (KeyTemplate$OutputPrefixType[]) $VALUES.clone();
    }
}
