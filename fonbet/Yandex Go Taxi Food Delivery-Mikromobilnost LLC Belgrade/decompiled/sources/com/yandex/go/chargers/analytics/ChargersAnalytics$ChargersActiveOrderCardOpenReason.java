package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersActiveOrderCardOpenReason", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersActiveOrderCardOpenReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SuperappMain", "CreatingOffer", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersActiveOrderCardOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersActiveOrderCardOpenReason[] $VALUES;
    public static final ChargersAnalytics$ChargersActiveOrderCardOpenReason CreatingOffer;
    public static final ChargersAnalytics$ChargersActiveOrderCardOpenReason SuperappMain;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersActiveOrderCardOpenReason chargersAnalytics$ChargersActiveOrderCardOpenReason = new ChargersAnalytics$ChargersActiveOrderCardOpenReason("SuperappMain", 0, "superapp_main");
        SuperappMain = chargersAnalytics$ChargersActiveOrderCardOpenReason;
        ChargersAnalytics$ChargersActiveOrderCardOpenReason chargersAnalytics$ChargersActiveOrderCardOpenReason2 = new ChargersAnalytics$ChargersActiveOrderCardOpenReason("CreatingOffer", 1, "creating_offer");
        CreatingOffer = chargersAnalytics$ChargersActiveOrderCardOpenReason2;
        ChargersAnalytics$ChargersActiveOrderCardOpenReason[] chargersAnalytics$ChargersActiveOrderCardOpenReasonArr = {chargersAnalytics$ChargersActiveOrderCardOpenReason, chargersAnalytics$ChargersActiveOrderCardOpenReason2};
        $VALUES = chargersAnalytics$ChargersActiveOrderCardOpenReasonArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersActiveOrderCardOpenReasonArr);
    }

    public ChargersAnalytics$ChargersActiveOrderCardOpenReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersActiveOrderCardOpenReason valueOf(String str) {
        return (ChargersAnalytics$ChargersActiveOrderCardOpenReason) Enum.valueOf(ChargersAnalytics$ChargersActiveOrderCardOpenReason.class, str);
    }

    public static ChargersAnalytics$ChargersActiveOrderCardOpenReason[] values() {
        return (ChargersAnalytics$ChargersActiveOrderCardOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
