package com.yandex.passport.internal.analytics;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/passport/internal/analytics/DomikScreenSuccessMessages$Relogin", "Lcom/yandex/passport/internal/analytics/z;", "", "Lcom/yandex/passport/internal/analytics/DomikScreenSuccessMessages$Relogin;", URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "accountNotFound", "liteRegistration", "error", "magicLinkSent", "smsSendingSuccess", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DomikScreenSuccessMessages$Relogin implements z {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DomikScreenSuccessMessages$Relogin[] $VALUES;
    public static final DomikScreenSuccessMessages$Relogin accountNotFound;
    public static final DomikScreenSuccessMessages$Relogin error;
    public static final DomikScreenSuccessMessages$Relogin liteRegistration;
    public static final DomikScreenSuccessMessages$Relogin magicLinkSent;
    public static final DomikScreenSuccessMessages$Relogin password;
    public static final DomikScreenSuccessMessages$Relogin smsSendingSuccess;

    static {
        DomikScreenSuccessMessages$Relogin domikScreenSuccessMessages$Relogin = new DomikScreenSuccessMessages$Relogin(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, 0);
        password = domikScreenSuccessMessages$Relogin;
        DomikScreenSuccessMessages$Relogin domikScreenSuccessMessages$Relogin2 = new DomikScreenSuccessMessages$Relogin("accountNotFound", 1);
        accountNotFound = domikScreenSuccessMessages$Relogin2;
        DomikScreenSuccessMessages$Relogin domikScreenSuccessMessages$Relogin3 = new DomikScreenSuccessMessages$Relogin("liteRegistration", 2);
        liteRegistration = domikScreenSuccessMessages$Relogin3;
        DomikScreenSuccessMessages$Relogin domikScreenSuccessMessages$Relogin4 = new DomikScreenSuccessMessages$Relogin("error", 3);
        error = domikScreenSuccessMessages$Relogin4;
        DomikScreenSuccessMessages$Relogin domikScreenSuccessMessages$Relogin5 = new DomikScreenSuccessMessages$Relogin("magicLinkSent", 4);
        magicLinkSent = domikScreenSuccessMessages$Relogin5;
        DomikScreenSuccessMessages$Relogin domikScreenSuccessMessages$Relogin6 = new DomikScreenSuccessMessages$Relogin("smsSendingSuccess", 5);
        smsSendingSuccess = domikScreenSuccessMessages$Relogin6;
        DomikScreenSuccessMessages$Relogin[] domikScreenSuccessMessages$ReloginArr = {domikScreenSuccessMessages$Relogin, domikScreenSuccessMessages$Relogin2, domikScreenSuccessMessages$Relogin3, domikScreenSuccessMessages$Relogin4, domikScreenSuccessMessages$Relogin5, domikScreenSuccessMessages$Relogin6};
        $VALUES = domikScreenSuccessMessages$ReloginArr;
        $ENTRIES = kotlin.enums.a.a(domikScreenSuccessMessages$ReloginArr);
    }

    public static DomikScreenSuccessMessages$Relogin valueOf(String str) {
        return (DomikScreenSuccessMessages$Relogin) Enum.valueOf(DomikScreenSuccessMessages$Relogin.class, str);
    }

    public static DomikScreenSuccessMessages$Relogin[] values() {
        return (DomikScreenSuccessMessages$Relogin[]) $VALUES.clone();
    }
}
