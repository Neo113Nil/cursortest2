package com.bumptech.glide.load;

import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class EncodeStrategy {
    private static final /* synthetic */ EncodeStrategy[] $VALUES;
    public static final EncodeStrategy NONE;
    public static final EncodeStrategy SOURCE;
    public static final EncodeStrategy TRANSFORMED;

    static {
        EncodeStrategy encodeStrategy = new EncodeStrategy("SOURCE", 0);
        SOURCE = encodeStrategy;
        EncodeStrategy encodeStrategy2 = new EncodeStrategy("TRANSFORMED", 1);
        TRANSFORMED = encodeStrategy2;
        EncodeStrategy encodeStrategy3 = new EncodeStrategy(JCP.RAW_PREFIX, 2);
        NONE = encodeStrategy3;
        $VALUES = new EncodeStrategy[]{encodeStrategy, encodeStrategy2, encodeStrategy3};
    }

    public static EncodeStrategy valueOf(String str) {
        return (EncodeStrategy) Enum.valueOf(EncodeStrategy.class, str);
    }

    public static EncodeStrategy[] values() {
        return (EncodeStrategy[]) $VALUES.clone();
    }
}
