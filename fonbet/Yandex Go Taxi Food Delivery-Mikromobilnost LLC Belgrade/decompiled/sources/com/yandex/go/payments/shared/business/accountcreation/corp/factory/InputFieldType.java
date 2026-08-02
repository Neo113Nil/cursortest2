package com.yandex.go.payments.shared.business.accountcreation.corp.factory;

import com.samsung.android.sdk.samsungpay.v2.card.IdvVerifyInfo;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/factory/InputFieldType;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "errorFieldName", "b", "COMPANY_NAME", "USER_NAME", "PHONE", IdvVerifyInfo.IDV_TYPE_EMAIL, "CITY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InputFieldType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InputFieldType[] $VALUES;
    public static final InputFieldType CITY;
    public static final InputFieldType COMPANY_NAME;
    public static final InputFieldType EMAIL;
    public static final InputFieldType PHONE;
    public static final InputFieldType USER_NAME;
    private final String analyticsName;
    private final String errorFieldName;

    static {
        InputFieldType inputFieldType = new InputFieldType("COMPANY_NAME", 0, "company_name", "company_name");
        COMPANY_NAME = inputFieldType;
        InputFieldType inputFieldType2 = new InputFieldType("USER_NAME", 1, "user_name", "contact");
        USER_NAME = inputFieldType2;
        InputFieldType inputFieldType3 = new InputFieldType("PHONE", 2, "phone", "phone");
        PHONE = inputFieldType3;
        InputFieldType inputFieldType4 = new InputFieldType(IdvVerifyInfo.IDV_TYPE_EMAIL, 3, "email", "email");
        EMAIL = inputFieldType4;
        InputFieldType inputFieldType5 = new InputFieldType("CITY", 4, "city", "city");
        CITY = inputFieldType5;
        InputFieldType[] inputFieldTypeArr = {inputFieldType, inputFieldType2, inputFieldType3, inputFieldType4, inputFieldType5};
        $VALUES = inputFieldTypeArr;
        $ENTRIES = a.a(inputFieldTypeArr);
    }

    public InputFieldType(String str, int i, String str2, String str3) {
        this.analyticsName = str2;
        this.errorFieldName = str3;
    }

    public static InputFieldType valueOf(String str) {
        return (InputFieldType) Enum.valueOf(InputFieldType.class, str);
    }

    public static InputFieldType[] values() {
        return (InputFieldType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* renamed from: b, reason: from getter */
    public final String getErrorFieldName() {
        return this.errorFieldName;
    }
}
