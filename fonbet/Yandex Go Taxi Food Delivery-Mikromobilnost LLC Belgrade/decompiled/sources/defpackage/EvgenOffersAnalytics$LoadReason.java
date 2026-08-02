package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"EvgenOffersAnalytics$LoadReason", "", "LEvgenOffersAnalytics$LoadReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Default", "Showcase", "Upsale", "ContrOffer", "ClosingOffer", "Presale", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EvgenOffersAnalytics$LoadReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EvgenOffersAnalytics$LoadReason[] $VALUES;
    public static final EvgenOffersAnalytics$LoadReason ClosingOffer;
    public static final EvgenOffersAnalytics$LoadReason ContrOffer;
    public static final EvgenOffersAnalytics$LoadReason Default;
    public static final EvgenOffersAnalytics$LoadReason Presale;
    public static final EvgenOffersAnalytics$LoadReason Showcase;
    public static final EvgenOffersAnalytics$LoadReason Upsale;
    private final String eventValue;

    static {
        EvgenOffersAnalytics$LoadReason evgenOffersAnalytics$LoadReason = new EvgenOffersAnalytics$LoadReason("Default", 0, "default");
        Default = evgenOffersAnalytics$LoadReason;
        EvgenOffersAnalytics$LoadReason evgenOffersAnalytics$LoadReason2 = new EvgenOffersAnalytics$LoadReason("Showcase", 1, "showcase");
        Showcase = evgenOffersAnalytics$LoadReason2;
        EvgenOffersAnalytics$LoadReason evgenOffersAnalytics$LoadReason3 = new EvgenOffersAnalytics$LoadReason("Upsale", 2, "upsale");
        Upsale = evgenOffersAnalytics$LoadReason3;
        EvgenOffersAnalytics$LoadReason evgenOffersAnalytics$LoadReason4 = new EvgenOffersAnalytics$LoadReason("ContrOffer", 3, "contrOffer");
        ContrOffer = evgenOffersAnalytics$LoadReason4;
        EvgenOffersAnalytics$LoadReason evgenOffersAnalytics$LoadReason5 = new EvgenOffersAnalytics$LoadReason("ClosingOffer", 4, "closingOffer");
        ClosingOffer = evgenOffersAnalytics$LoadReason5;
        EvgenOffersAnalytics$LoadReason evgenOffersAnalytics$LoadReason6 = new EvgenOffersAnalytics$LoadReason("Presale", 5, "presale");
        Presale = evgenOffersAnalytics$LoadReason6;
        EvgenOffersAnalytics$LoadReason[] evgenOffersAnalytics$LoadReasonArr = {evgenOffersAnalytics$LoadReason, evgenOffersAnalytics$LoadReason2, evgenOffersAnalytics$LoadReason3, evgenOffersAnalytics$LoadReason4, evgenOffersAnalytics$LoadReason5, evgenOffersAnalytics$LoadReason6};
        $VALUES = evgenOffersAnalytics$LoadReasonArr;
        $ENTRIES = a.a(evgenOffersAnalytics$LoadReasonArr);
    }

    public EvgenOffersAnalytics$LoadReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EvgenOffersAnalytics$LoadReason valueOf(String str) {
        return (EvgenOffersAnalytics$LoadReason) Enum.valueOf(EvgenOffersAnalytics$LoadReason.class, str);
    }

    public static EvgenOffersAnalytics$LoadReason[] values() {
        return (EvgenOffersAnalytics$LoadReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
