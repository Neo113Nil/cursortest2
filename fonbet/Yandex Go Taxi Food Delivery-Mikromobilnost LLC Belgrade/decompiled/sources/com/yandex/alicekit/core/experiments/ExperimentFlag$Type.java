package com.yandex.alicekit.core.experiments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ExperimentFlag$Type {
    private static final /* synthetic */ ExperimentFlag$Type[] $VALUES;
    public static final ExperimentFlag$Type BOOLEAN;
    public static final ExperimentFlag$Type ENUM;
    public static final ExperimentFlag$Type FLOAT;
    public static final ExperimentFlag$Type LONG;
    public static final ExperimentFlag$Type STRING;

    static {
        ExperimentFlag$Type experimentFlag$Type = new ExperimentFlag$Type("LONG", 0);
        LONG = experimentFlag$Type;
        ExperimentFlag$Type experimentFlag$Type2 = new ExperimentFlag$Type("BOOLEAN", 1);
        BOOLEAN = experimentFlag$Type2;
        ExperimentFlag$Type experimentFlag$Type3 = new ExperimentFlag$Type("ENUM", 2);
        ENUM = experimentFlag$Type3;
        ExperimentFlag$Type experimentFlag$Type4 = new ExperimentFlag$Type("STRING", 3);
        STRING = experimentFlag$Type4;
        ExperimentFlag$Type experimentFlag$Type5 = new ExperimentFlag$Type("FLOAT", 4);
        FLOAT = experimentFlag$Type5;
        $VALUES = new ExperimentFlag$Type[]{experimentFlag$Type, experimentFlag$Type2, experimentFlag$Type3, experimentFlag$Type4, experimentFlag$Type5};
    }

    public static ExperimentFlag$Type valueOf(String str) {
        return (ExperimentFlag$Type) Enum.valueOf(ExperimentFlag$Type.class, str);
    }

    public static ExperimentFlag$Type[] values() {
        return (ExperimentFlag$Type[]) $VALUES.clone();
    }
}
