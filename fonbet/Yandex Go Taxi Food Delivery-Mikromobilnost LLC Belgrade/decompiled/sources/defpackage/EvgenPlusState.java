package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LEvgenPlusState;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NotLoggedIn", "NoPlus", CA20Status.STATUS_USER_DESCRIPTION_A, "Unknown", "plus-home-domain-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EvgenPlusState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EvgenPlusState[] $VALUES;
    public static final EvgenPlusState Active;
    public static final EvgenPlusState NoPlus;
    public static final EvgenPlusState NotLoggedIn;
    public static final EvgenPlusState Unknown;
    private final String eventValue;

    static {
        EvgenPlusState evgenPlusState = new EvgenPlusState("NotLoggedIn", 0, "not_logged_in");
        NotLoggedIn = evgenPlusState;
        EvgenPlusState evgenPlusState2 = new EvgenPlusState("NoPlus", 1, "no_plus");
        NoPlus = evgenPlusState2;
        EvgenPlusState evgenPlusState3 = new EvgenPlusState(CA20Status.STATUS_USER_DESCRIPTION_A, 2, ClidProvider.APP_ACTIVE);
        Active = evgenPlusState3;
        EvgenPlusState evgenPlusState4 = new EvgenPlusState("Unknown", 3, "unknown");
        Unknown = evgenPlusState4;
        EvgenPlusState[] evgenPlusStateArr = {evgenPlusState, evgenPlusState2, evgenPlusState3, evgenPlusState4};
        $VALUES = evgenPlusStateArr;
        $ENTRIES = a.a(evgenPlusStateArr);
    }

    public EvgenPlusState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EvgenPlusState valueOf(String str) {
        return (EvgenPlusState) Enum.valueOf(EvgenPlusState.class, str);
    }

    public static EvgenPlusState[] values() {
        return (EvgenPlusState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
