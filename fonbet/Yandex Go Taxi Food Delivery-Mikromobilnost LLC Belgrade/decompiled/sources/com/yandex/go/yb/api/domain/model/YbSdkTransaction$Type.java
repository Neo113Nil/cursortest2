package com.yandex.go.yb.api.domain.model;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/yb/api/domain/model/YbSdkTransaction$Type", "", "Lcom/yandex/go/yb/api/domain/model/YbSdkTransaction$Type;", Card.CARD_TYPE_DEBIT, Card.CARD_TYPE_CREDIT, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class YbSdkTransaction$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbSdkTransaction$Type[] $VALUES;
    public static final YbSdkTransaction$Type CREDIT;
    public static final YbSdkTransaction$Type DEBIT;

    static {
        YbSdkTransaction$Type ybSdkTransaction$Type = new YbSdkTransaction$Type(Card.CARD_TYPE_DEBIT, 0);
        DEBIT = ybSdkTransaction$Type;
        YbSdkTransaction$Type ybSdkTransaction$Type2 = new YbSdkTransaction$Type(Card.CARD_TYPE_CREDIT, 1);
        CREDIT = ybSdkTransaction$Type2;
        YbSdkTransaction$Type[] ybSdkTransaction$TypeArr = {ybSdkTransaction$Type, ybSdkTransaction$Type2};
        $VALUES = ybSdkTransaction$TypeArr;
        $ENTRIES = a.a(ybSdkTransaction$TypeArr);
    }

    public static YbSdkTransaction$Type valueOf(String str) {
        return (YbSdkTransaction$Type) Enum.valueOf(YbSdkTransaction$Type.class, str);
    }

    public static YbSdkTransaction$Type[] values() {
        return (YbSdkTransaction$Type[]) $VALUES.clone();
    }
}
