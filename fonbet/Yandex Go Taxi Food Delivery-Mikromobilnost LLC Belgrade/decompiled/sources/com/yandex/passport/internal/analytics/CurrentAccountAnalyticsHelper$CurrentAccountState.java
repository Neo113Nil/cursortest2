package com.yandex.passport.internal.analytics;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/passport/internal/analytics/CurrentAccountAnalyticsHelper$CurrentAccountState", "", "Lcom/yandex/passport/internal/analytics/CurrentAccountAnalyticsHelper$CurrentAccountState;", "noCurrentAccount", "noMasterToken", WriteBlocks.OK, "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CurrentAccountAnalyticsHelper$CurrentAccountState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CurrentAccountAnalyticsHelper$CurrentAccountState[] $VALUES;
    public static final CurrentAccountAnalyticsHelper$CurrentAccountState noCurrentAccount;
    public static final CurrentAccountAnalyticsHelper$CurrentAccountState noMasterToken;
    public static final CurrentAccountAnalyticsHelper$CurrentAccountState ok;

    static {
        CurrentAccountAnalyticsHelper$CurrentAccountState currentAccountAnalyticsHelper$CurrentAccountState = new CurrentAccountAnalyticsHelper$CurrentAccountState("noCurrentAccount", 0);
        noCurrentAccount = currentAccountAnalyticsHelper$CurrentAccountState;
        CurrentAccountAnalyticsHelper$CurrentAccountState currentAccountAnalyticsHelper$CurrentAccountState2 = new CurrentAccountAnalyticsHelper$CurrentAccountState("noMasterToken", 1);
        noMasterToken = currentAccountAnalyticsHelper$CurrentAccountState2;
        CurrentAccountAnalyticsHelper$CurrentAccountState currentAccountAnalyticsHelper$CurrentAccountState3 = new CurrentAccountAnalyticsHelper$CurrentAccountState(WriteBlocks.OK, 2);
        ok = currentAccountAnalyticsHelper$CurrentAccountState3;
        CurrentAccountAnalyticsHelper$CurrentAccountState[] currentAccountAnalyticsHelper$CurrentAccountStateArr = {currentAccountAnalyticsHelper$CurrentAccountState, currentAccountAnalyticsHelper$CurrentAccountState2, currentAccountAnalyticsHelper$CurrentAccountState3};
        $VALUES = currentAccountAnalyticsHelper$CurrentAccountStateArr;
        $ENTRIES = kotlin.enums.a.a(currentAccountAnalyticsHelper$CurrentAccountStateArr);
    }

    public static CurrentAccountAnalyticsHelper$CurrentAccountState valueOf(String str) {
        return (CurrentAccountAnalyticsHelper$CurrentAccountState) Enum.valueOf(CurrentAccountAnalyticsHelper$CurrentAccountState.class, str);
    }

    public static CurrentAccountAnalyticsHelper$CurrentAccountState[] values() {
        return (CurrentAccountAnalyticsHelper$CurrentAccountState[]) $VALUES.clone();
    }
}
