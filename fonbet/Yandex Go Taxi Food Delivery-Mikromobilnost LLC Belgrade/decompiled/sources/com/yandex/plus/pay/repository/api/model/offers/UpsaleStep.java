package com.yandex.plus.pay.repository.api.model.offers;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/UpsaleStep;", "", "CHECKOUT", "UPSALE", "PRESALE", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpsaleStep {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpsaleStep[] $VALUES;
    public static final UpsaleStep CHECKOUT;
    public static final UpsaleStep PRESALE;
    public static final UpsaleStep UPSALE;

    static {
        UpsaleStep upsaleStep = new UpsaleStep("CHECKOUT", 0);
        CHECKOUT = upsaleStep;
        UpsaleStep upsaleStep2 = new UpsaleStep("UPSALE", 1);
        UPSALE = upsaleStep2;
        UpsaleStep upsaleStep3 = new UpsaleStep("PRESALE", 2);
        PRESALE = upsaleStep3;
        UpsaleStep[] upsaleStepArr = {upsaleStep, upsaleStep2, upsaleStep3};
        $VALUES = upsaleStepArr;
        $ENTRIES = kotlin.enums.a.a(upsaleStepArr);
    }

    public static UpsaleStep valueOf(String str) {
        return (UpsaleStep) Enum.valueOf(UpsaleStep.class, str);
    }

    public static UpsaleStep[] values() {
        return (UpsaleStep[]) $VALUES.clone();
    }
}
