package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/xplat/payment/sdk/Scenario;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "NEW_CARD_PAY", "CARD_BIND", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Scenario {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Scenario[] $VALUES;
    public static final Scenario CARD_BIND;
    public static final Scenario NEW_CARD_PAY;
    private final String value;

    static {
        Scenario scenario = new Scenario("NEW_CARD_PAY", 0, "NewCardPay");
        NEW_CARD_PAY = scenario;
        Scenario scenario2 = new Scenario("CARD_BIND", 1, "CardBind");
        CARD_BIND = scenario2;
        Scenario[] scenarioArr = {scenario, scenario2};
        $VALUES = scenarioArr;
        $ENTRIES = a.a(scenarioArr);
    }

    public Scenario(String str, int i, String str2) {
        this.value = str2;
    }

    public static Scenario valueOf(String str) {
        return (Scenario) Enum.valueOf(Scenario.class, str);
    }

    public static Scenario[] values() {
        return (Scenario[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
