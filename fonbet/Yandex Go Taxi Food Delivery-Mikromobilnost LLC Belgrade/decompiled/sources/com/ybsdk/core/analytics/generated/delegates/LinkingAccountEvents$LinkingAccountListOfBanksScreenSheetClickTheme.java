package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import defpackage.y5e;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme", "", "Lcom/ybsdk/core/analytics/generated/delegates/LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "CONFIRM_OPEN_APP", "NO_APP_INSTALLED", "NO_YB_ACCOUNT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme[] $VALUES;
    public static final LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme CONFIRM_OPEN_APP = new LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme("CONFIRM_OPEN_APP", 0, y5e.o(y5e.l));
    public static final LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme NO_APP_INSTALLED = new LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme("NO_APP_INSTALLED", 1, y5e.o(y5e.D));
    public static final LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme NO_YB_ACCOUNT = new LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme("NO_YB_ACCOUNT", 2, y5e.o(y5e.M));
    private final String originalValue;

    private static final /* synthetic */ LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme[] $values() {
        return new LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme[]{CONFIRM_OPEN_APP, NO_APP_INSTALLED, NO_YB_ACCOUNT};
    }

    static {
        LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme valueOf(String str) {
        return (LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme) Enum.valueOf(LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme.class, str);
    }

    public static LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme[] values() {
        return (LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
