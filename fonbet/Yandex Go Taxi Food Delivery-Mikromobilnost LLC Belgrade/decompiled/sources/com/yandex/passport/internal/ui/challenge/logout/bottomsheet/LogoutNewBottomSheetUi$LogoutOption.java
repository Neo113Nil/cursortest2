package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/passport/internal/ui/challenge/logout/bottomsheet/LogoutNewBottomSheetUi$LogoutOption", "", "Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/LogoutNewBottomSheetUi$LogoutOption;", "THIS", "ALL", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutNewBottomSheetUi$LogoutOption {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogoutNewBottomSheetUi$LogoutOption[] $VALUES;
    public static final LogoutNewBottomSheetUi$LogoutOption ALL;
    public static final LogoutNewBottomSheetUi$LogoutOption THIS;

    static {
        LogoutNewBottomSheetUi$LogoutOption logoutNewBottomSheetUi$LogoutOption = new LogoutNewBottomSheetUi$LogoutOption("THIS", 0);
        THIS = logoutNewBottomSheetUi$LogoutOption;
        LogoutNewBottomSheetUi$LogoutOption logoutNewBottomSheetUi$LogoutOption2 = new LogoutNewBottomSheetUi$LogoutOption("ALL", 1);
        ALL = logoutNewBottomSheetUi$LogoutOption2;
        LogoutNewBottomSheetUi$LogoutOption[] logoutNewBottomSheetUi$LogoutOptionArr = {logoutNewBottomSheetUi$LogoutOption, logoutNewBottomSheetUi$LogoutOption2};
        $VALUES = logoutNewBottomSheetUi$LogoutOptionArr;
        $ENTRIES = kotlin.enums.a.a(logoutNewBottomSheetUi$LogoutOptionArr);
    }

    public static LogoutNewBottomSheetUi$LogoutOption valueOf(String str) {
        return (LogoutNewBottomSheetUi$LogoutOption) Enum.valueOf(LogoutNewBottomSheetUi$LogoutOption.class, str);
    }

    public static LogoutNewBottomSheetUi$LogoutOption[] values() {
        return (LogoutNewBottomSheetUi$LogoutOption[]) $VALUES.clone();
    }
}
