package com.yandex.passport.internal.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/passport/internal/analytics/DomikScreenSuccessMessages$Phone", "Lcom/yandex/passport/internal/analytics/z;", "", "Lcom/yandex/passport/internal/analytics/DomikScreenSuccessMessages$Phone;", "liteReg", "phoneConfirmed", "smsSent", "callRequested", "portalAuth", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DomikScreenSuccessMessages$Phone implements z {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DomikScreenSuccessMessages$Phone[] $VALUES;
    public static final DomikScreenSuccessMessages$Phone callRequested;
    public static final DomikScreenSuccessMessages$Phone liteReg;
    public static final DomikScreenSuccessMessages$Phone phoneConfirmed;
    public static final DomikScreenSuccessMessages$Phone portalAuth;
    public static final DomikScreenSuccessMessages$Phone smsSent;

    static {
        DomikScreenSuccessMessages$Phone domikScreenSuccessMessages$Phone = new DomikScreenSuccessMessages$Phone("liteReg", 0);
        liteReg = domikScreenSuccessMessages$Phone;
        DomikScreenSuccessMessages$Phone domikScreenSuccessMessages$Phone2 = new DomikScreenSuccessMessages$Phone("phoneConfirmed", 1);
        phoneConfirmed = domikScreenSuccessMessages$Phone2;
        DomikScreenSuccessMessages$Phone domikScreenSuccessMessages$Phone3 = new DomikScreenSuccessMessages$Phone("smsSent", 2);
        smsSent = domikScreenSuccessMessages$Phone3;
        DomikScreenSuccessMessages$Phone domikScreenSuccessMessages$Phone4 = new DomikScreenSuccessMessages$Phone("callRequested", 3);
        callRequested = domikScreenSuccessMessages$Phone4;
        DomikScreenSuccessMessages$Phone domikScreenSuccessMessages$Phone5 = new DomikScreenSuccessMessages$Phone("portalAuth", 4);
        portalAuth = domikScreenSuccessMessages$Phone5;
        DomikScreenSuccessMessages$Phone[] domikScreenSuccessMessages$PhoneArr = {domikScreenSuccessMessages$Phone, domikScreenSuccessMessages$Phone2, domikScreenSuccessMessages$Phone3, domikScreenSuccessMessages$Phone4, domikScreenSuccessMessages$Phone5};
        $VALUES = domikScreenSuccessMessages$PhoneArr;
        $ENTRIES = kotlin.enums.a.a(domikScreenSuccessMessages$PhoneArr);
    }

    public static DomikScreenSuccessMessages$Phone valueOf(String str) {
        return (DomikScreenSuccessMessages$Phone) Enum.valueOf(DomikScreenSuccessMessages$Phone.class, str);
    }

    public static DomikScreenSuccessMessages$Phone[] values() {
        return (DomikScreenSuccessMessages$Phone[]) $VALUES.clone();
    }
}
