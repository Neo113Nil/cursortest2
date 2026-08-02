package com.yandex.go.deeplinks.generated.add_payment_method;

import defpackage.k4o;
import defpackage.ri0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/deeplinks/generated/add_payment_method/AddPaymentMethodType;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "ri0", "SBP_TOKEN", "MBANK_ACCOUNT", "YAPE_TOKEN", "NEQUI_TOKEN", "FASTSHIFT_ACCOUNT", "deeplinks"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddPaymentMethodType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddPaymentMethodType[] $VALUES;
    public static final ri0 Companion;
    public static final AddPaymentMethodType FASTSHIFT_ACCOUNT;
    public static final AddPaymentMethodType MBANK_ACCOUNT;
    public static final AddPaymentMethodType NEQUI_TOKEN;
    public static final AddPaymentMethodType SBP_TOKEN;
    public static final AddPaymentMethodType YAPE_TOKEN;
    private final String value;

    static {
        AddPaymentMethodType addPaymentMethodType = new AddPaymentMethodType("SBP_TOKEN", 0, "sbp_token");
        SBP_TOKEN = addPaymentMethodType;
        AddPaymentMethodType addPaymentMethodType2 = new AddPaymentMethodType("MBANK_ACCOUNT", 1, "mbank_account");
        MBANK_ACCOUNT = addPaymentMethodType2;
        AddPaymentMethodType addPaymentMethodType3 = new AddPaymentMethodType("YAPE_TOKEN", 2, "yape_token");
        YAPE_TOKEN = addPaymentMethodType3;
        AddPaymentMethodType addPaymentMethodType4 = new AddPaymentMethodType("NEQUI_TOKEN", 3, "nequi_token");
        NEQUI_TOKEN = addPaymentMethodType4;
        AddPaymentMethodType addPaymentMethodType5 = new AddPaymentMethodType("FASTSHIFT_ACCOUNT", 4, "fastshift_account");
        FASTSHIFT_ACCOUNT = addPaymentMethodType5;
        AddPaymentMethodType[] addPaymentMethodTypeArr = {addPaymentMethodType, addPaymentMethodType2, addPaymentMethodType3, addPaymentMethodType4, addPaymentMethodType5};
        $VALUES = addPaymentMethodTypeArr;
        $ENTRIES = a.a(addPaymentMethodTypeArr);
        Companion = new ri0();
    }

    public AddPaymentMethodType(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static AddPaymentMethodType valueOf(String str) {
        return (AddPaymentMethodType) Enum.valueOf(AddPaymentMethodType.class, str);
    }

    public static AddPaymentMethodType[] values() {
        return (AddPaymentMethodType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
