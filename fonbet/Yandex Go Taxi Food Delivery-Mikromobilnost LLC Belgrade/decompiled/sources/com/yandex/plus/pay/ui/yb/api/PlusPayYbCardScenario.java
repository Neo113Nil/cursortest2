package com.yandex.plus.pay.ui.yb.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/yb/api/PlusPayYbCardScenario;", "", "OPENING", "TOPUP", "pay-sdk-ui-yb-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayYbCardScenario {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayYbCardScenario[] $VALUES;
    public static final PlusPayYbCardScenario OPENING;
    public static final PlusPayYbCardScenario TOPUP;

    static {
        PlusPayYbCardScenario plusPayYbCardScenario = new PlusPayYbCardScenario("OPENING", 0);
        OPENING = plusPayYbCardScenario;
        PlusPayYbCardScenario plusPayYbCardScenario2 = new PlusPayYbCardScenario("TOPUP", 1);
        TOPUP = plusPayYbCardScenario2;
        PlusPayYbCardScenario[] plusPayYbCardScenarioArr = {plusPayYbCardScenario, plusPayYbCardScenario2};
        $VALUES = plusPayYbCardScenarioArr;
        $ENTRIES = a.a(plusPayYbCardScenarioArr);
    }

    public static PlusPayYbCardScenario valueOf(String str) {
        return (PlusPayYbCardScenario) Enum.valueOf(PlusPayYbCardScenario.class, str);
    }

    public static PlusPayYbCardScenario[] values() {
        return (PlusPayYbCardScenario[]) $VALUES.clone();
    }
}
