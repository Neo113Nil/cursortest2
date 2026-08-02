package com.yandex.go.chargers.offer;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/chargers/offer/ChargersOfferOpenReason;", "", "", "eventValue", "Ljava/lang/String;", "getEventValue", "()Ljava/lang/String;", "Deeplink", "Qr", "go-client-android.features.chargers.offer:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOfferOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersOfferOpenReason[] $VALUES;
    public static final ChargersOfferOpenReason Deeplink;
    public static final ChargersOfferOpenReason Qr;
    private final String eventValue;

    static {
        ChargersOfferOpenReason chargersOfferOpenReason = new ChargersOfferOpenReason("Deeplink", 0, Constants.DEEPLINK);
        Deeplink = chargersOfferOpenReason;
        ChargersOfferOpenReason chargersOfferOpenReason2 = new ChargersOfferOpenReason("Qr", 1, "qr");
        Qr = chargersOfferOpenReason2;
        ChargersOfferOpenReason[] chargersOfferOpenReasonArr = {chargersOfferOpenReason, chargersOfferOpenReason2};
        $VALUES = chargersOfferOpenReasonArr;
        $ENTRIES = a.a(chargersOfferOpenReasonArr);
    }

    public ChargersOfferOpenReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersOfferOpenReason valueOf(String str) {
        return (ChargersOfferOpenReason) Enum.valueOf(ChargersOfferOpenReason.class, str);
    }

    public static ChargersOfferOpenReason[] values() {
        return (ChargersOfferOpenReason[]) $VALUES.clone();
    }
}
