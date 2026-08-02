package com.yandex.fintechsdk.flows.applink.payment.internal.model.payment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/fintechsdk/flows/applink/payment/internal/model/payment/PayboxScenario;", "", "PAY_OFFLINE", "PAY_BOX_OFFLINE", "PAY_TV", "PAY_ONLINE", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PayboxScenario {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayboxScenario[] $VALUES;
    public static final PayboxScenario PAY_BOX_OFFLINE;
    public static final PayboxScenario PAY_OFFLINE;
    public static final PayboxScenario PAY_ONLINE;
    public static final PayboxScenario PAY_TV;

    static {
        PayboxScenario payboxScenario = new PayboxScenario("PAY_OFFLINE", 0);
        PAY_OFFLINE = payboxScenario;
        PayboxScenario payboxScenario2 = new PayboxScenario("PAY_BOX_OFFLINE", 1);
        PAY_BOX_OFFLINE = payboxScenario2;
        PayboxScenario payboxScenario3 = new PayboxScenario("PAY_TV", 2);
        PAY_TV = payboxScenario3;
        PayboxScenario payboxScenario4 = new PayboxScenario("PAY_ONLINE", 3);
        PAY_ONLINE = payboxScenario4;
        PayboxScenario[] payboxScenarioArr = {payboxScenario, payboxScenario2, payboxScenario3, payboxScenario4};
        $VALUES = payboxScenarioArr;
        $ENTRIES = a.a(payboxScenarioArr);
    }

    public static PayboxScenario valueOf(String str) {
        return (PayboxScenario) Enum.valueOf(PayboxScenario.class, str);
    }

    public static PayboxScenario[] values() {
        return (PayboxScenario[]) $VALUES.clone();
    }
}
