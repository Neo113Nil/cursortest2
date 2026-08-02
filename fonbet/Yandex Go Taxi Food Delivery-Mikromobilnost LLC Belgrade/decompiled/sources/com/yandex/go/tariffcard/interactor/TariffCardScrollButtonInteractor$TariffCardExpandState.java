package com.yandex.go.tariffcard.interactor;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/tariffcard/interactor/TariffCardScrollButtonInteractor$TariffCardExpandState", "", "Lcom/yandex/go/tariffcard/interactor/TariffCardScrollButtonInteractor$TariffCardExpandState;", "COLLAPSED", "EXPANDED_AT_LEAST_ONCE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final class TariffCardScrollButtonInteractor$TariffCardExpandState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffCardScrollButtonInteractor$TariffCardExpandState[] $VALUES;
    public static final TariffCardScrollButtonInteractor$TariffCardExpandState COLLAPSED;
    public static final TariffCardScrollButtonInteractor$TariffCardExpandState EXPANDED_AT_LEAST_ONCE;

    static {
        TariffCardScrollButtonInteractor$TariffCardExpandState tariffCardScrollButtonInteractor$TariffCardExpandState = new TariffCardScrollButtonInteractor$TariffCardExpandState("COLLAPSED", 0);
        COLLAPSED = tariffCardScrollButtonInteractor$TariffCardExpandState;
        TariffCardScrollButtonInteractor$TariffCardExpandState tariffCardScrollButtonInteractor$TariffCardExpandState2 = new TariffCardScrollButtonInteractor$TariffCardExpandState("EXPANDED_AT_LEAST_ONCE", 1);
        EXPANDED_AT_LEAST_ONCE = tariffCardScrollButtonInteractor$TariffCardExpandState2;
        TariffCardScrollButtonInteractor$TariffCardExpandState[] tariffCardScrollButtonInteractor$TariffCardExpandStateArr = {tariffCardScrollButtonInteractor$TariffCardExpandState, tariffCardScrollButtonInteractor$TariffCardExpandState2};
        $VALUES = tariffCardScrollButtonInteractor$TariffCardExpandStateArr;
        $ENTRIES = kotlin.enums.a.a(tariffCardScrollButtonInteractor$TariffCardExpandStateArr);
    }

    public static TariffCardScrollButtonInteractor$TariffCardExpandState valueOf(String str) {
        return (TariffCardScrollButtonInteractor$TariffCardExpandState) Enum.valueOf(TariffCardScrollButtonInteractor$TariffCardExpandState.class, str);
    }

    public static TariffCardScrollButtonInteractor$TariffCardExpandState[] values() {
        return (TariffCardScrollButtonInteractor$TariffCardExpandState[]) $VALUES.clone();
    }
}
