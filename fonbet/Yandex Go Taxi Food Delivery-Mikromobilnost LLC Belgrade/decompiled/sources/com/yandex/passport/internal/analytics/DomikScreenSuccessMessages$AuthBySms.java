package com.yandex.passport.internal.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/passport/internal/analytics/DomikScreenSuccessMessages$AuthBySms", "Lcom/yandex/passport/internal/analytics/z;", "", "Lcom/yandex/passport/internal/analytics/DomikScreenSuccessMessages$AuthBySms;", "smsSendingSuccess", "phoneIsConfirmed", "authSuccessBySms", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DomikScreenSuccessMessages$AuthBySms implements z {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DomikScreenSuccessMessages$AuthBySms[] $VALUES;
    public static final DomikScreenSuccessMessages$AuthBySms authSuccessBySms;
    public static final DomikScreenSuccessMessages$AuthBySms phoneIsConfirmed;
    public static final DomikScreenSuccessMessages$AuthBySms smsSendingSuccess;

    static {
        DomikScreenSuccessMessages$AuthBySms domikScreenSuccessMessages$AuthBySms = new DomikScreenSuccessMessages$AuthBySms("smsSendingSuccess", 0);
        smsSendingSuccess = domikScreenSuccessMessages$AuthBySms;
        DomikScreenSuccessMessages$AuthBySms domikScreenSuccessMessages$AuthBySms2 = new DomikScreenSuccessMessages$AuthBySms("phoneIsConfirmed", 1);
        phoneIsConfirmed = domikScreenSuccessMessages$AuthBySms2;
        DomikScreenSuccessMessages$AuthBySms domikScreenSuccessMessages$AuthBySms3 = new DomikScreenSuccessMessages$AuthBySms("authSuccessBySms", 2);
        authSuccessBySms = domikScreenSuccessMessages$AuthBySms3;
        DomikScreenSuccessMessages$AuthBySms[] domikScreenSuccessMessages$AuthBySmsArr = {domikScreenSuccessMessages$AuthBySms, domikScreenSuccessMessages$AuthBySms2, domikScreenSuccessMessages$AuthBySms3};
        $VALUES = domikScreenSuccessMessages$AuthBySmsArr;
        $ENTRIES = kotlin.enums.a.a(domikScreenSuccessMessages$AuthBySmsArr);
    }

    public static DomikScreenSuccessMessages$AuthBySms valueOf(String str) {
        return (DomikScreenSuccessMessages$AuthBySms) Enum.valueOf(DomikScreenSuccessMessages$AuthBySms.class, str);
    }

    public static DomikScreenSuccessMessages$AuthBySms[] values() {
        return (DomikScreenSuccessMessages$AuthBySms[]) $VALUES.clone();
    }
}
