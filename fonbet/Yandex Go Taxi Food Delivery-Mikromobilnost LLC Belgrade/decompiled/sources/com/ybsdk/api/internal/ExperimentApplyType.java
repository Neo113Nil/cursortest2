package com.ybsdk.api.internal;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/api/internal/ExperimentApplyType;", "", "<init>", "(Ljava/lang/String;I)V", "COLD_START", "HOT_START", "LATEST", "yb-sdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExperimentApplyType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExperimentApplyType[] $VALUES;
    public static final ExperimentApplyType COLD_START = new ExperimentApplyType("COLD_START", 0);
    public static final ExperimentApplyType HOT_START = new ExperimentApplyType("HOT_START", 1);
    public static final ExperimentApplyType LATEST = new ExperimentApplyType("LATEST", 2);

    private static final /* synthetic */ ExperimentApplyType[] $values() {
        return new ExperimentApplyType[]{COLD_START, HOT_START, LATEST};
    }

    static {
        ExperimentApplyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ExperimentApplyType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ExperimentApplyType valueOf(String str) {
        return (ExperimentApplyType) Enum.valueOf(ExperimentApplyType.class, str);
    }

    public static ExperimentApplyType[] values() {
        return (ExperimentApplyType[]) $VALUES.clone();
    }
}
