package com.ybsdk.feature.savings.internal.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/savings/internal/entities/SavingsClosingVersion;", "", "<init>", "(Ljava/lang/String;I)V", "V1", "V2", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsClosingVersion {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SavingsClosingVersion[] $VALUES;
    public static final SavingsClosingVersion V1 = new SavingsClosingVersion("V1", 0);
    public static final SavingsClosingVersion V2 = new SavingsClosingVersion("V2", 1);

    private static final /* synthetic */ SavingsClosingVersion[] $values() {
        return new SavingsClosingVersion[]{V1, V2};
    }

    static {
        SavingsClosingVersion[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SavingsClosingVersion(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SavingsClosingVersion valueOf(String str) {
        return (SavingsClosingVersion) Enum.valueOf(SavingsClosingVersion.class, str);
    }

    public static SavingsClosingVersion[] values() {
        return (SavingsClosingVersion[]) $VALUES.clone();
    }
}
