package com.yandex.go.yb.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/yb/api/domain/model/YbSdkCheckPaymentCondition;", "", "", "wireName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TOPUP", "IDENTIFICATION", "KYC", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class YbSdkCheckPaymentCondition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbSdkCheckPaymentCondition[] $VALUES;
    public static final YbSdkCheckPaymentCondition IDENTIFICATION;
    public static final YbSdkCheckPaymentCondition KYC;
    public static final YbSdkCheckPaymentCondition TOPUP;
    private final String wireName;

    static {
        YbSdkCheckPaymentCondition ybSdkCheckPaymentCondition = new YbSdkCheckPaymentCondition("TOPUP", 0, "TOPUP");
        TOPUP = ybSdkCheckPaymentCondition;
        YbSdkCheckPaymentCondition ybSdkCheckPaymentCondition2 = new YbSdkCheckPaymentCondition("IDENTIFICATION", 1, "IDENTIFICATION");
        IDENTIFICATION = ybSdkCheckPaymentCondition2;
        YbSdkCheckPaymentCondition ybSdkCheckPaymentCondition3 = new YbSdkCheckPaymentCondition("KYC", 2, "KYC");
        KYC = ybSdkCheckPaymentCondition3;
        YbSdkCheckPaymentCondition[] ybSdkCheckPaymentConditionArr = {ybSdkCheckPaymentCondition, ybSdkCheckPaymentCondition2, ybSdkCheckPaymentCondition3};
        $VALUES = ybSdkCheckPaymentConditionArr;
        $ENTRIES = a.a(ybSdkCheckPaymentConditionArr);
    }

    public YbSdkCheckPaymentCondition(String str, int i, String str2) {
        this.wireName = str2;
    }

    public static YbSdkCheckPaymentCondition valueOf(String str) {
        return (YbSdkCheckPaymentCondition) Enum.valueOf(YbSdkCheckPaymentCondition.class, str);
    }

    public static YbSdkCheckPaymentCondition[] values() {
        return (YbSdkCheckPaymentCondition[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getWireName() {
        return this.wireName;
    }
}
