package com.google.crypto.tink.config.internal;

import defpackage.yez0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class TinkFipsUtil$AlgorithmFipsCompatibility {
    private static final /* synthetic */ TinkFipsUtil$AlgorithmFipsCompatibility[] $VALUES;
    public static final TinkFipsUtil$AlgorithmFipsCompatibility ALGORITHM_NOT_FIPS;
    public static final TinkFipsUtil$AlgorithmFipsCompatibility ALGORITHM_REQUIRES_BORINGCRYPTO;

    static {
        TinkFipsUtil$AlgorithmFipsCompatibility tinkFipsUtil$AlgorithmFipsCompatibility = new TinkFipsUtil$AlgorithmFipsCompatibility() { // from class: com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility.1
            @Override // com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility
            public final boolean a() {
                return !yez0.a();
            }
        };
        ALGORITHM_NOT_FIPS = tinkFipsUtil$AlgorithmFipsCompatibility;
        TinkFipsUtil$AlgorithmFipsCompatibility tinkFipsUtil$AlgorithmFipsCompatibility2 = new TinkFipsUtil$AlgorithmFipsCompatibility() { // from class: com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility.2
            @Override // com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility
            public final boolean a() {
                Boolean bool;
                if (yez0.a()) {
                    try {
                        bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                    } catch (Exception unused) {
                        yez0.a.info("Conscrypt is not available or does not support checking for FIPS build.");
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue()) {
                        return false;
                    }
                }
                return true;
            }
        };
        ALGORITHM_REQUIRES_BORINGCRYPTO = tinkFipsUtil$AlgorithmFipsCompatibility2;
        $VALUES = new TinkFipsUtil$AlgorithmFipsCompatibility[]{tinkFipsUtil$AlgorithmFipsCompatibility, tinkFipsUtil$AlgorithmFipsCompatibility2};
    }

    public static TinkFipsUtil$AlgorithmFipsCompatibility valueOf(String str) {
        return (TinkFipsUtil$AlgorithmFipsCompatibility) Enum.valueOf(TinkFipsUtil$AlgorithmFipsCompatibility.class, str);
    }

    public static TinkFipsUtil$AlgorithmFipsCompatibility[] values() {
        return (TinkFipsUtil$AlgorithmFipsCompatibility[]) $VALUES.clone();
    }

    public abstract boolean a();
}
