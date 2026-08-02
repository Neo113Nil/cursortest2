package com.yandex.go.chargers.discounts;

import defpackage.ak9;
import defpackage.eu9;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/chargers/discounts/ChargersDiscountsAnalyticsProxy$TaskState", "", "Lcom/yandex/go/chargers/discounts/ChargersDiscountsAnalyticsProxy$TaskState;", "Companion", "eu9", "NEW", "IN_PROGRESS", "SUCCESS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountsAnalyticsProxy$TaskState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersDiscountsAnalyticsProxy$TaskState[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final eu9 Companion;
    public static final ChargersDiscountsAnalyticsProxy$TaskState IN_PROGRESS;
    public static final ChargersDiscountsAnalyticsProxy$TaskState NEW;
    public static final ChargersDiscountsAnalyticsProxy$TaskState SUCCESS;

    static {
        ChargersDiscountsAnalyticsProxy$TaskState chargersDiscountsAnalyticsProxy$TaskState = new ChargersDiscountsAnalyticsProxy$TaskState("NEW", 0);
        NEW = chargersDiscountsAnalyticsProxy$TaskState;
        ChargersDiscountsAnalyticsProxy$TaskState chargersDiscountsAnalyticsProxy$TaskState2 = new ChargersDiscountsAnalyticsProxy$TaskState("IN_PROGRESS", 1);
        IN_PROGRESS = chargersDiscountsAnalyticsProxy$TaskState2;
        ChargersDiscountsAnalyticsProxy$TaskState chargersDiscountsAnalyticsProxy$TaskState3 = new ChargersDiscountsAnalyticsProxy$TaskState("SUCCESS", 2);
        SUCCESS = chargersDiscountsAnalyticsProxy$TaskState3;
        ChargersDiscountsAnalyticsProxy$TaskState[] chargersDiscountsAnalyticsProxy$TaskStateArr = {chargersDiscountsAnalyticsProxy$TaskState, chargersDiscountsAnalyticsProxy$TaskState2, chargersDiscountsAnalyticsProxy$TaskState3};
        $VALUES = chargersDiscountsAnalyticsProxy$TaskStateArr;
        $ENTRIES = a.a(chargersDiscountsAnalyticsProxy$TaskStateArr);
        Companion = new eu9();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(27));
    }

    public static ChargersDiscountsAnalyticsProxy$TaskState valueOf(String str) {
        return (ChargersDiscountsAnalyticsProxy$TaskState) Enum.valueOf(ChargersDiscountsAnalyticsProxy$TaskState.class, str);
    }

    public static ChargersDiscountsAnalyticsProxy$TaskState[] values() {
        return (ChargersDiscountsAnalyticsProxy$TaskState[]) $VALUES.clone();
    }
}
