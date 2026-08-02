package com.yandex.go.payments;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/payments/AddButtonType;", "", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CARD", "SBP_TOKEN", "TRANSPORT_CARD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AddButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddButtonType[] $VALUES;
    public static final AddButtonType CARD;
    public static final AddButtonType SBP_TOKEN;
    public static final AddButtonType TRANSPORT_CARD;
    private final String type;

    static {
        AddButtonType addButtonType = new AddButtonType("CARD", 0, "card");
        CARD = addButtonType;
        AddButtonType addButtonType2 = new AddButtonType("SBP_TOKEN", 1, "sbp_token");
        SBP_TOKEN = addButtonType2;
        AddButtonType addButtonType3 = new AddButtonType("TRANSPORT_CARD", 2, "transport_card");
        TRANSPORT_CARD = addButtonType3;
        AddButtonType[] addButtonTypeArr = {addButtonType, addButtonType2, addButtonType3};
        $VALUES = addButtonTypeArr;
        $ENTRIES = a.a(addButtonTypeArr);
    }

    public AddButtonType(String str, int i, String str2) {
        this.type = str2;
    }

    public static AddButtonType valueOf(String str) {
        return (AddButtonType) Enum.valueOf(AddButtonType.class, str);
    }

    public static AddButtonType[] values() {
        return (AddButtonType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
