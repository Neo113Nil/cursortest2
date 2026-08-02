package com.yandex.passport.internal.analytics;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/passport/internal/analytics/DomikScreenSuccessMessages$CallConfirm", "Lcom/yandex/passport/internal/analytics/z;", "", "Lcom/yandex/passport/internal/analytics/DomikScreenSuccessMessages$CallConfirm;", "smsSent", URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, "successPhonishAuth", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DomikScreenSuccessMessages$CallConfirm implements z {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DomikScreenSuccessMessages$CallConfirm[] $VALUES;
    public static final DomikScreenSuccessMessages$CallConfirm smsSent;
    public static final DomikScreenSuccessMessages$CallConfirm successPhonishAuth;
    public static final DomikScreenSuccessMessages$CallConfirm username;

    static {
        DomikScreenSuccessMessages$CallConfirm domikScreenSuccessMessages$CallConfirm = new DomikScreenSuccessMessages$CallConfirm("smsSent", 0);
        smsSent = domikScreenSuccessMessages$CallConfirm;
        DomikScreenSuccessMessages$CallConfirm domikScreenSuccessMessages$CallConfirm2 = new DomikScreenSuccessMessages$CallConfirm(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, 1);
        username = domikScreenSuccessMessages$CallConfirm2;
        DomikScreenSuccessMessages$CallConfirm domikScreenSuccessMessages$CallConfirm3 = new DomikScreenSuccessMessages$CallConfirm("successPhonishAuth", 2);
        successPhonishAuth = domikScreenSuccessMessages$CallConfirm3;
        DomikScreenSuccessMessages$CallConfirm[] domikScreenSuccessMessages$CallConfirmArr = {domikScreenSuccessMessages$CallConfirm, domikScreenSuccessMessages$CallConfirm2, domikScreenSuccessMessages$CallConfirm3};
        $VALUES = domikScreenSuccessMessages$CallConfirmArr;
        $ENTRIES = kotlin.enums.a.a(domikScreenSuccessMessages$CallConfirmArr);
    }

    public static DomikScreenSuccessMessages$CallConfirm valueOf(String str) {
        return (DomikScreenSuccessMessages$CallConfirm) Enum.valueOf(DomikScreenSuccessMessages$CallConfirm.class, str);
    }

    public static DomikScreenSuccessMessages$CallConfirm[] values() {
        return (DomikScreenSuccessMessages$CallConfirm[]) $VALUES.clone();
    }
}
