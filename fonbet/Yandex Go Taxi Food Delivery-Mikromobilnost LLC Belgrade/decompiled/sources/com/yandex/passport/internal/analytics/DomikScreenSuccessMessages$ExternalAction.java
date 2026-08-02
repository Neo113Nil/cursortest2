package com.yandex.passport.internal.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/passport/internal/analytics/DomikScreenSuccessMessages$ExternalAction", "Lcom/yandex/passport/internal/analytics/z;", "", "Lcom/yandex/passport/internal/analytics/DomikScreenSuccessMessages$ExternalAction;", "authSuccess", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DomikScreenSuccessMessages$ExternalAction implements z {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DomikScreenSuccessMessages$ExternalAction[] $VALUES;
    public static final DomikScreenSuccessMessages$ExternalAction authSuccess;

    static {
        DomikScreenSuccessMessages$ExternalAction domikScreenSuccessMessages$ExternalAction = new DomikScreenSuccessMessages$ExternalAction("authSuccess", 0);
        authSuccess = domikScreenSuccessMessages$ExternalAction;
        DomikScreenSuccessMessages$ExternalAction[] domikScreenSuccessMessages$ExternalActionArr = {domikScreenSuccessMessages$ExternalAction};
        $VALUES = domikScreenSuccessMessages$ExternalActionArr;
        $ENTRIES = kotlin.enums.a.a(domikScreenSuccessMessages$ExternalActionArr);
    }

    public static DomikScreenSuccessMessages$ExternalAction valueOf(String str) {
        return (DomikScreenSuccessMessages$ExternalAction) Enum.valueOf(DomikScreenSuccessMessages$ExternalAction.class, str);
    }

    public static DomikScreenSuccessMessages$ExternalAction[] values() {
        return (DomikScreenSuccessMessages$ExternalAction[]) $VALUES.clone();
    }
}
