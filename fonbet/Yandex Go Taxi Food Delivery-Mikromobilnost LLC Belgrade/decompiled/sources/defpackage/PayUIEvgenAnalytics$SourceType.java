package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"PayUIEvgenAnalytics$SourceType", "", "LPayUIEvgenAnalytics$SourceType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Internal", "External", "pay-sdk-ui-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayUIEvgenAnalytics$SourceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayUIEvgenAnalytics$SourceType[] $VALUES;
    public static final PayUIEvgenAnalytics$SourceType External;
    public static final PayUIEvgenAnalytics$SourceType Internal;
    private final String eventValue;

    static {
        PayUIEvgenAnalytics$SourceType payUIEvgenAnalytics$SourceType = new PayUIEvgenAnalytics$SourceType("Internal", 0, "internal");
        Internal = payUIEvgenAnalytics$SourceType;
        PayUIEvgenAnalytics$SourceType payUIEvgenAnalytics$SourceType2 = new PayUIEvgenAnalytics$SourceType("External", 1, "external");
        External = payUIEvgenAnalytics$SourceType2;
        PayUIEvgenAnalytics$SourceType[] payUIEvgenAnalytics$SourceTypeArr = {payUIEvgenAnalytics$SourceType, payUIEvgenAnalytics$SourceType2};
        $VALUES = payUIEvgenAnalytics$SourceTypeArr;
        $ENTRIES = a.a(payUIEvgenAnalytics$SourceTypeArr);
    }

    public PayUIEvgenAnalytics$SourceType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PayUIEvgenAnalytics$SourceType valueOf(String str) {
        return (PayUIEvgenAnalytics$SourceType) Enum.valueOf(PayUIEvgenAnalytics$SourceType.class, str);
    }

    public static PayUIEvgenAnalytics$SourceType[] values() {
        return (PayUIEvgenAnalytics$SourceType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
