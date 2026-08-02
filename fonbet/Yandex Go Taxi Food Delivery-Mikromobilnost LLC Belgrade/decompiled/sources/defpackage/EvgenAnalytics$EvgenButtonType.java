package defpackage;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"EvgenAnalytics$EvgenButtonType", "", "LEvgenAnalytics$EvgenButtonType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Web", "Native", "Host", "plus-home-domain-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EvgenAnalytics$EvgenButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EvgenAnalytics$EvgenButtonType[] $VALUES;
    public static final EvgenAnalytics$EvgenButtonType Host;
    public static final EvgenAnalytics$EvgenButtonType Native;
    public static final EvgenAnalytics$EvgenButtonType Web;
    private final String eventValue;

    static {
        EvgenAnalytics$EvgenButtonType evgenAnalytics$EvgenButtonType = new EvgenAnalytics$EvgenButtonType("Web", 0, "web");
        Web = evgenAnalytics$EvgenButtonType;
        EvgenAnalytics$EvgenButtonType evgenAnalytics$EvgenButtonType2 = new EvgenAnalytics$EvgenButtonType("Native", 1, "native");
        Native = evgenAnalytics$EvgenButtonType2;
        EvgenAnalytics$EvgenButtonType evgenAnalytics$EvgenButtonType3 = new EvgenAnalytics$EvgenButtonType("Host", 2, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
        Host = evgenAnalytics$EvgenButtonType3;
        EvgenAnalytics$EvgenButtonType[] evgenAnalytics$EvgenButtonTypeArr = {evgenAnalytics$EvgenButtonType, evgenAnalytics$EvgenButtonType2, evgenAnalytics$EvgenButtonType3};
        $VALUES = evgenAnalytics$EvgenButtonTypeArr;
        $ENTRIES = a.a(evgenAnalytics$EvgenButtonTypeArr);
    }

    public EvgenAnalytics$EvgenButtonType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EvgenAnalytics$EvgenButtonType valueOf(String str) {
        return (EvgenAnalytics$EvgenButtonType) Enum.valueOf(EvgenAnalytics$EvgenButtonType.class, str);
    }

    public static EvgenAnalytics$EvgenButtonType[] values() {
        return (EvgenAnalytics$EvgenButtonType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
