package com.yandex.go.account.api.family;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/account/api/family/SharedPaymentContext;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "WIZARD", "DETAILS", "ORDER", "CREATE_ACCOUNT", "INVITE_CARD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SharedPaymentContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharedPaymentContext[] $VALUES;
    public static final SharedPaymentContext CREATE_ACCOUNT;
    public static final SharedPaymentContext DETAILS;
    public static final SharedPaymentContext INVITE_CARD;
    public static final SharedPaymentContext ORDER;
    public static final SharedPaymentContext WIZARD;
    private final String value;

    static {
        SharedPaymentContext sharedPaymentContext = new SharedPaymentContext("WIZARD", 0, "wizard");
        WIZARD = sharedPaymentContext;
        SharedPaymentContext sharedPaymentContext2 = new SharedPaymentContext("DETAILS", 1, "details");
        DETAILS = sharedPaymentContext2;
        SharedPaymentContext sharedPaymentContext3 = new SharedPaymentContext("ORDER", 2, "order");
        ORDER = sharedPaymentContext3;
        SharedPaymentContext sharedPaymentContext4 = new SharedPaymentContext("CREATE_ACCOUNT", 3, "create_account");
        CREATE_ACCOUNT = sharedPaymentContext4;
        SharedPaymentContext sharedPaymentContext5 = new SharedPaymentContext("INVITE_CARD", 4, "invite_card");
        INVITE_CARD = sharedPaymentContext5;
        SharedPaymentContext[] sharedPaymentContextArr = {sharedPaymentContext, sharedPaymentContext2, sharedPaymentContext3, sharedPaymentContext4, sharedPaymentContext5};
        $VALUES = sharedPaymentContextArr;
        $ENTRIES = a.a(sharedPaymentContextArr);
    }

    public SharedPaymentContext(String str, int i, String str2) {
        this.value = str2;
    }

    public static SharedPaymentContext valueOf(String str) {
        return (SharedPaymentContext) Enum.valueOf(SharedPaymentContext.class, str);
    }

    public static SharedPaymentContext[] values() {
        return (SharedPaymentContext[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
