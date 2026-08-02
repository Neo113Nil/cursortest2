package com.bumptech.glide.load.engine;

import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class DecodeJob$Stage {
    private static final /* synthetic */ DecodeJob$Stage[] $VALUES;
    public static final DecodeJob$Stage DATA_CACHE;
    public static final DecodeJob$Stage ENCODE;
    public static final DecodeJob$Stage FINISHED;
    public static final DecodeJob$Stage INITIALIZE;
    public static final DecodeJob$Stage RESOURCE_CACHE;
    public static final DecodeJob$Stage SOURCE;

    static {
        DecodeJob$Stage decodeJob$Stage = new DecodeJob$Stage("INITIALIZE", 0);
        INITIALIZE = decodeJob$Stage;
        DecodeJob$Stage decodeJob$Stage2 = new DecodeJob$Stage("RESOURCE_CACHE", 1);
        RESOURCE_CACHE = decodeJob$Stage2;
        DecodeJob$Stage decodeJob$Stage3 = new DecodeJob$Stage("DATA_CACHE", 2);
        DATA_CACHE = decodeJob$Stage3;
        DecodeJob$Stage decodeJob$Stage4 = new DecodeJob$Stage("SOURCE", 3);
        SOURCE = decodeJob$Stage4;
        DecodeJob$Stage decodeJob$Stage5 = new DecodeJob$Stage("ENCODE", 4);
        ENCODE = decodeJob$Stage5;
        DecodeJob$Stage decodeJob$Stage6 = new DecodeJob$Stage(TlsConstants.TLS_FINISHED, 5);
        FINISHED = decodeJob$Stage6;
        $VALUES = new DecodeJob$Stage[]{decodeJob$Stage, decodeJob$Stage2, decodeJob$Stage3, decodeJob$Stage4, decodeJob$Stage5, decodeJob$Stage6};
    }

    public static DecodeJob$Stage valueOf(String str) {
        return (DecodeJob$Stage) Enum.valueOf(DecodeJob$Stage.class, str);
    }

    public static DecodeJob$Stage[] values() {
        return (DecodeJob$Stage[]) $VALUES.clone();
    }
}
