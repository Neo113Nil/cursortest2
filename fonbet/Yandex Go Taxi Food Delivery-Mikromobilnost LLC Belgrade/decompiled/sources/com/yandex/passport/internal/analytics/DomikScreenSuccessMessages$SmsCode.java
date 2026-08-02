package com.yandex.passport.internal.analytics;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/passport/internal/analytics/DomikScreenSuccessMessages$SmsCode", "Lcom/yandex/passport/internal/analytics/z;", "", "Lcom/yandex/passport/internal/analytics/DomikScreenSuccessMessages$SmsCode;", URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, "successPhonishAuth", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DomikScreenSuccessMessages$SmsCode implements z {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DomikScreenSuccessMessages$SmsCode[] $VALUES;
    public static final DomikScreenSuccessMessages$SmsCode successPhonishAuth;
    public static final DomikScreenSuccessMessages$SmsCode username;

    static {
        DomikScreenSuccessMessages$SmsCode domikScreenSuccessMessages$SmsCode = new DomikScreenSuccessMessages$SmsCode(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, 0);
        username = domikScreenSuccessMessages$SmsCode;
        DomikScreenSuccessMessages$SmsCode domikScreenSuccessMessages$SmsCode2 = new DomikScreenSuccessMessages$SmsCode("successPhonishAuth", 1);
        successPhonishAuth = domikScreenSuccessMessages$SmsCode2;
        DomikScreenSuccessMessages$SmsCode[] domikScreenSuccessMessages$SmsCodeArr = {domikScreenSuccessMessages$SmsCode, domikScreenSuccessMessages$SmsCode2};
        $VALUES = domikScreenSuccessMessages$SmsCodeArr;
        $ENTRIES = kotlin.enums.a.a(domikScreenSuccessMessages$SmsCodeArr);
    }

    public static DomikScreenSuccessMessages$SmsCode valueOf(String str) {
        return (DomikScreenSuccessMessages$SmsCode) Enum.valueOf(DomikScreenSuccessMessages$SmsCode.class, str);
    }

    public static DomikScreenSuccessMessages$SmsCode[] values() {
        return (DomikScreenSuccessMessages$SmsCode[]) $VALUES.clone();
    }
}
