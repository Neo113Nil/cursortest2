package com.google.gson;

import defpackage.nl11;
import defpackage.um11;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public abstract class LongSerializationPolicy {
    private static final /* synthetic */ LongSerializationPolicy[] $VALUES;
    public static final LongSerializationPolicy DEFAULT;
    public static final LongSerializationPolicy STRING;

    static {
        LongSerializationPolicy longSerializationPolicy = new LongSerializationPolicy() { // from class: com.google.gson.LongSerializationPolicy.1
            @Override // com.google.gson.LongSerializationPolicy
            public final nl11 a() {
                return um11.k;
            }
        };
        DEFAULT = longSerializationPolicy;
        LongSerializationPolicy longSerializationPolicy2 = new LongSerializationPolicy() { // from class: com.google.gson.LongSerializationPolicy.2
            @Override // com.google.gson.LongSerializationPolicy
            public final nl11 a() {
                return um11.l;
            }
        };
        STRING = longSerializationPolicy2;
        $VALUES = new LongSerializationPolicy[]{longSerializationPolicy, longSerializationPolicy2};
    }

    public static LongSerializationPolicy valueOf(String str) {
        return (LongSerializationPolicy) Enum.valueOf(LongSerializationPolicy.class, str);
    }

    public static LongSerializationPolicy[] values() {
        return (LongSerializationPolicy[]) $VALUES.clone();
    }

    public abstract nl11 a();
}
