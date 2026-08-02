package defpackage;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"EvgenAnalytics$EvgenPurchaseType", "", "LEvgenAnalytics$EvgenPurchaseType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Web", "InApp", "Native", "Host", "plus-home-domain-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EvgenAnalytics$EvgenPurchaseType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EvgenAnalytics$EvgenPurchaseType[] $VALUES;
    public static final EvgenAnalytics$EvgenPurchaseType Host;
    public static final EvgenAnalytics$EvgenPurchaseType InApp;
    public static final EvgenAnalytics$EvgenPurchaseType Native;
    public static final EvgenAnalytics$EvgenPurchaseType Web;
    private final String eventValue;

    static {
        EvgenAnalytics$EvgenPurchaseType evgenAnalytics$EvgenPurchaseType = new EvgenAnalytics$EvgenPurchaseType("Web", 0, "web");
        Web = evgenAnalytics$EvgenPurchaseType;
        EvgenAnalytics$EvgenPurchaseType evgenAnalytics$EvgenPurchaseType2 = new EvgenAnalytics$EvgenPurchaseType("InApp", 1, "in_app");
        InApp = evgenAnalytics$EvgenPurchaseType2;
        EvgenAnalytics$EvgenPurchaseType evgenAnalytics$EvgenPurchaseType3 = new EvgenAnalytics$EvgenPurchaseType("Native", 2, "native");
        Native = evgenAnalytics$EvgenPurchaseType3;
        EvgenAnalytics$EvgenPurchaseType evgenAnalytics$EvgenPurchaseType4 = new EvgenAnalytics$EvgenPurchaseType("Host", 3, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
        Host = evgenAnalytics$EvgenPurchaseType4;
        EvgenAnalytics$EvgenPurchaseType[] evgenAnalytics$EvgenPurchaseTypeArr = {evgenAnalytics$EvgenPurchaseType, evgenAnalytics$EvgenPurchaseType2, evgenAnalytics$EvgenPurchaseType3, evgenAnalytics$EvgenPurchaseType4};
        $VALUES = evgenAnalytics$EvgenPurchaseTypeArr;
        $ENTRIES = a.a(evgenAnalytics$EvgenPurchaseTypeArr);
    }

    public EvgenAnalytics$EvgenPurchaseType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EvgenAnalytics$EvgenPurchaseType valueOf(String str) {
        return (EvgenAnalytics$EvgenPurchaseType) Enum.valueOf(EvgenAnalytics$EvgenPurchaseType.class, str);
    }

    public static EvgenAnalytics$EvgenPurchaseType[] values() {
        return (EvgenAnalytics$EvgenPurchaseType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
