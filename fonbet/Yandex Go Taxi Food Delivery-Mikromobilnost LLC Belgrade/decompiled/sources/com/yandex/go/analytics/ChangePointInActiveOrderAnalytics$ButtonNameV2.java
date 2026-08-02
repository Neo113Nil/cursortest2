package com.yandex.go.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/analytics/ChangePointInActiveOrderAnalytics$ButtonNameV2", "", "Lcom/yandex/go/analytics/ChangePointInActiveOrderAnalytics$ButtonNameV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Entrance", "Done", "Geo", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChangePointInActiveOrderAnalytics$ButtonNameV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangePointInActiveOrderAnalytics$ButtonNameV2[] $VALUES;
    public static final ChangePointInActiveOrderAnalytics$ButtonNameV2 Back;
    public static final ChangePointInActiveOrderAnalytics$ButtonNameV2 Done;
    public static final ChangePointInActiveOrderAnalytics$ButtonNameV2 Entrance;
    public static final ChangePointInActiveOrderAnalytics$ButtonNameV2 Geo;
    private final String eventValue;

    static {
        ChangePointInActiveOrderAnalytics$ButtonNameV2 changePointInActiveOrderAnalytics$ButtonNameV2 = new ChangePointInActiveOrderAnalytics$ButtonNameV2("Back", 0, "back");
        Back = changePointInActiveOrderAnalytics$ButtonNameV2;
        ChangePointInActiveOrderAnalytics$ButtonNameV2 changePointInActiveOrderAnalytics$ButtonNameV22 = new ChangePointInActiveOrderAnalytics$ButtonNameV2("Entrance", 1, "entrance");
        Entrance = changePointInActiveOrderAnalytics$ButtonNameV22;
        ChangePointInActiveOrderAnalytics$ButtonNameV2 changePointInActiveOrderAnalytics$ButtonNameV23 = new ChangePointInActiveOrderAnalytics$ButtonNameV2("Done", 2, "done");
        Done = changePointInActiveOrderAnalytics$ButtonNameV23;
        ChangePointInActiveOrderAnalytics$ButtonNameV2 changePointInActiveOrderAnalytics$ButtonNameV24 = new ChangePointInActiveOrderAnalytics$ButtonNameV2("Geo", 3, "geo");
        Geo = changePointInActiveOrderAnalytics$ButtonNameV24;
        ChangePointInActiveOrderAnalytics$ButtonNameV2[] changePointInActiveOrderAnalytics$ButtonNameV2Arr = {changePointInActiveOrderAnalytics$ButtonNameV2, changePointInActiveOrderAnalytics$ButtonNameV22, changePointInActiveOrderAnalytics$ButtonNameV23, changePointInActiveOrderAnalytics$ButtonNameV24};
        $VALUES = changePointInActiveOrderAnalytics$ButtonNameV2Arr;
        $ENTRIES = kotlin.enums.a.a(changePointInActiveOrderAnalytics$ButtonNameV2Arr);
    }

    public ChangePointInActiveOrderAnalytics$ButtonNameV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChangePointInActiveOrderAnalytics$ButtonNameV2 valueOf(String str) {
        return (ChangePointInActiveOrderAnalytics$ButtonNameV2) Enum.valueOf(ChangePointInActiveOrderAnalytics$ButtonNameV2.class, str);
    }

    public static ChangePointInActiveOrderAnalytics$ButtonNameV2[] values() {
        return (ChangePointInActiveOrderAnalytics$ButtonNameV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
