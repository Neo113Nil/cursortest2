package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersDiscountsTabIdV2", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersDiscountsTabIdV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Rental", "Partners", "Tasks", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersDiscountsTabIdV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersDiscountsTabIdV2[] $VALUES;
    public static final ChargersAnalytics$ChargersDiscountsTabIdV2 Partners;
    public static final ChargersAnalytics$ChargersDiscountsTabIdV2 Rental;
    public static final ChargersAnalytics$ChargersDiscountsTabIdV2 Tasks;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersDiscountsTabIdV2 chargersAnalytics$ChargersDiscountsTabIdV2 = new ChargersAnalytics$ChargersDiscountsTabIdV2("Rental", 0, "rental");
        Rental = chargersAnalytics$ChargersDiscountsTabIdV2;
        ChargersAnalytics$ChargersDiscountsTabIdV2 chargersAnalytics$ChargersDiscountsTabIdV22 = new ChargersAnalytics$ChargersDiscountsTabIdV2("Partners", 1, "partners");
        Partners = chargersAnalytics$ChargersDiscountsTabIdV22;
        ChargersAnalytics$ChargersDiscountsTabIdV2 chargersAnalytics$ChargersDiscountsTabIdV23 = new ChargersAnalytics$ChargersDiscountsTabIdV2("Tasks", 2, "tasks");
        Tasks = chargersAnalytics$ChargersDiscountsTabIdV23;
        ChargersAnalytics$ChargersDiscountsTabIdV2[] chargersAnalytics$ChargersDiscountsTabIdV2Arr = {chargersAnalytics$ChargersDiscountsTabIdV2, chargersAnalytics$ChargersDiscountsTabIdV22, chargersAnalytics$ChargersDiscountsTabIdV23};
        $VALUES = chargersAnalytics$ChargersDiscountsTabIdV2Arr;
        $ENTRIES = a.a(chargersAnalytics$ChargersDiscountsTabIdV2Arr);
    }

    public ChargersAnalytics$ChargersDiscountsTabIdV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersDiscountsTabIdV2 valueOf(String str) {
        return (ChargersAnalytics$ChargersDiscountsTabIdV2) Enum.valueOf(ChargersAnalytics$ChargersDiscountsTabIdV2.class, str);
    }

    public static ChargersAnalytics$ChargersDiscountsTabIdV2[] values() {
        return (ChargersAnalytics$ChargersDiscountsTabIdV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
