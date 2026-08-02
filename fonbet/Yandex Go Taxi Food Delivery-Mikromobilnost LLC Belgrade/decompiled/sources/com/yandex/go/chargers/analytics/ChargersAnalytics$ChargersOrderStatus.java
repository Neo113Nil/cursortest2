package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersOrderStatus", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersOrderStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Created", "Reservation", "Execution", "Leasing", "Canceled", "Finished", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChargersAnalytics$ChargersOrderStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersOrderStatus[] $VALUES;
    public static final ChargersAnalytics$ChargersOrderStatus Canceled;
    public static final ChargersAnalytics$ChargersOrderStatus Created;
    public static final ChargersAnalytics$ChargersOrderStatus Execution;
    public static final ChargersAnalytics$ChargersOrderStatus Finished;
    public static final ChargersAnalytics$ChargersOrderStatus Leasing;
    public static final ChargersAnalytics$ChargersOrderStatus Reservation;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersOrderStatus chargersAnalytics$ChargersOrderStatus = new ChargersAnalytics$ChargersOrderStatus("Created", 0, "created");
        Created = chargersAnalytics$ChargersOrderStatus;
        ChargersAnalytics$ChargersOrderStatus chargersAnalytics$ChargersOrderStatus2 = new ChargersAnalytics$ChargersOrderStatus("Reservation", 1, "reservation");
        Reservation = chargersAnalytics$ChargersOrderStatus2;
        ChargersAnalytics$ChargersOrderStatus chargersAnalytics$ChargersOrderStatus3 = new ChargersAnalytics$ChargersOrderStatus("Execution", 2, "execution");
        Execution = chargersAnalytics$ChargersOrderStatus3;
        ChargersAnalytics$ChargersOrderStatus chargersAnalytics$ChargersOrderStatus4 = new ChargersAnalytics$ChargersOrderStatus("Leasing", 3, "leasing");
        Leasing = chargersAnalytics$ChargersOrderStatus4;
        ChargersAnalytics$ChargersOrderStatus chargersAnalytics$ChargersOrderStatus5 = new ChargersAnalytics$ChargersOrderStatus("Canceled", 4, "canceled");
        Canceled = chargersAnalytics$ChargersOrderStatus5;
        ChargersAnalytics$ChargersOrderStatus chargersAnalytics$ChargersOrderStatus6 = new ChargersAnalytics$ChargersOrderStatus("Finished", 5, UgcLiveVideoData.UgcLiveStatus.FINISHED);
        Finished = chargersAnalytics$ChargersOrderStatus6;
        ChargersAnalytics$ChargersOrderStatus[] chargersAnalytics$ChargersOrderStatusArr = {chargersAnalytics$ChargersOrderStatus, chargersAnalytics$ChargersOrderStatus2, chargersAnalytics$ChargersOrderStatus3, chargersAnalytics$ChargersOrderStatus4, chargersAnalytics$ChargersOrderStatus5, chargersAnalytics$ChargersOrderStatus6};
        $VALUES = chargersAnalytics$ChargersOrderStatusArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersOrderStatusArr);
    }

    public ChargersAnalytics$ChargersOrderStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersOrderStatus valueOf(String str) {
        return (ChargersAnalytics$ChargersOrderStatus) Enum.valueOf(ChargersAnalytics$ChargersOrderStatus.class, str);
    }

    public static ChargersAnalytics$ChargersOrderStatus[] values() {
        return (ChargersAnalytics$ChargersOrderStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
