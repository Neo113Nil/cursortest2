package com.yandex.go.chargers.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersOfferCardOpenReason", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersOfferCardOpenReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Deeplink", "Qr", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersOfferCardOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersOfferCardOpenReason[] $VALUES;
    public static final ChargersAnalytics$ChargersOfferCardOpenReason Deeplink;
    public static final ChargersAnalytics$ChargersOfferCardOpenReason Qr;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersOfferCardOpenReason chargersAnalytics$ChargersOfferCardOpenReason = new ChargersAnalytics$ChargersOfferCardOpenReason("Deeplink", 0, Constants.DEEPLINK);
        Deeplink = chargersAnalytics$ChargersOfferCardOpenReason;
        ChargersAnalytics$ChargersOfferCardOpenReason chargersAnalytics$ChargersOfferCardOpenReason2 = new ChargersAnalytics$ChargersOfferCardOpenReason("Qr", 1, "qr");
        Qr = chargersAnalytics$ChargersOfferCardOpenReason2;
        ChargersAnalytics$ChargersOfferCardOpenReason[] chargersAnalytics$ChargersOfferCardOpenReasonArr = {chargersAnalytics$ChargersOfferCardOpenReason, chargersAnalytics$ChargersOfferCardOpenReason2};
        $VALUES = chargersAnalytics$ChargersOfferCardOpenReasonArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersOfferCardOpenReasonArr);
    }

    public ChargersAnalytics$ChargersOfferCardOpenReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersOfferCardOpenReason valueOf(String str) {
        return (ChargersAnalytics$ChargersOfferCardOpenReason) Enum.valueOf(ChargersAnalytics$ChargersOfferCardOpenReason.class, str);
    }

    public static ChargersAnalytics$ChargersOfferCardOpenReason[] values() {
        return (ChargersAnalytics$ChargersOfferCardOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
