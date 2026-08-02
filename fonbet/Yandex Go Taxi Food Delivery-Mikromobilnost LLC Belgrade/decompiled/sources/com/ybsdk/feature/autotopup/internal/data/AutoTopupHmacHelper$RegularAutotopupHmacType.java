package com.ybsdk.feature.autotopup.internal.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/autotopup/internal/data/AutoTopupHmacHelper$RegularAutotopupHmacType", "", "Lcom/ybsdk/feature/autotopup/internal/data/AutoTopupHmacHelper$RegularAutotopupHmacType;", "<init>", "(Ljava/lang/String;I)V", "WEEKLY", "MONTHLY", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupHmacHelper$RegularAutotopupHmacType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupHmacHelper$RegularAutotopupHmacType[] $VALUES;
    public static final AutoTopupHmacHelper$RegularAutotopupHmacType WEEKLY = new AutoTopupHmacHelper$RegularAutotopupHmacType("WEEKLY", 0);
    public static final AutoTopupHmacHelper$RegularAutotopupHmacType MONTHLY = new AutoTopupHmacHelper$RegularAutotopupHmacType("MONTHLY", 1);

    private static final /* synthetic */ AutoTopupHmacHelper$RegularAutotopupHmacType[] $values() {
        return new AutoTopupHmacHelper$RegularAutotopupHmacType[]{WEEKLY, MONTHLY};
    }

    static {
        AutoTopupHmacHelper$RegularAutotopupHmacType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AutoTopupHmacHelper$RegularAutotopupHmacType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupHmacHelper$RegularAutotopupHmacType valueOf(String str) {
        return (AutoTopupHmacHelper$RegularAutotopupHmacType) Enum.valueOf(AutoTopupHmacHelper$RegularAutotopupHmacType.class, str);
    }

    public static AutoTopupHmacHelper$RegularAutotopupHmacType[] values() {
        return (AutoTopupHmacHelper$RegularAutotopupHmacType[]) $VALUES.clone();
    }
}
