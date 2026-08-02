package com.yandex.plus.pay.common.internal.log;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.ht90;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/plus/pay/common/internal/log/PayCoreLogTag;", "Lht90;", "", "NATIVE_PAYMENT", "IN_APP_PAYMENT", "OFFERS", "USER", "UPSALE", Card.CARD_TYPE_CREDIT_DEBIT, "FAMILY", "CONTACTS", "PRESALE", "CLOSING_OFFER", "COUNTER_OFFERS", "pay-sdk-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayCoreLogTag implements ht90 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayCoreLogTag[] $VALUES;
    public static final PayCoreLogTag CLOSING_OFFER;
    public static final PayCoreLogTag CONTACTS;
    public static final PayCoreLogTag COUNTER_OFFERS;
    public static final PayCoreLogTag FAMILY;
    public static final PayCoreLogTag IN_APP_PAYMENT;
    public static final PayCoreLogTag NATIVE_PAYMENT;
    public static final PayCoreLogTag OFFERS;
    public static final PayCoreLogTag PAYMENT;
    public static final PayCoreLogTag PRESALE;
    public static final PayCoreLogTag UPSALE;
    public static final PayCoreLogTag USER;

    static {
        PayCoreLogTag payCoreLogTag = new PayCoreLogTag("NATIVE_PAYMENT", 0);
        NATIVE_PAYMENT = payCoreLogTag;
        PayCoreLogTag payCoreLogTag2 = new PayCoreLogTag("IN_APP_PAYMENT", 1);
        IN_APP_PAYMENT = payCoreLogTag2;
        PayCoreLogTag payCoreLogTag3 = new PayCoreLogTag("OFFERS", 2);
        OFFERS = payCoreLogTag3;
        PayCoreLogTag payCoreLogTag4 = new PayCoreLogTag("USER", 3);
        USER = payCoreLogTag4;
        PayCoreLogTag payCoreLogTag5 = new PayCoreLogTag("UPSALE", 4);
        UPSALE = payCoreLogTag5;
        PayCoreLogTag payCoreLogTag6 = new PayCoreLogTag(Card.CARD_TYPE_CREDIT_DEBIT, 5);
        PAYMENT = payCoreLogTag6;
        PayCoreLogTag payCoreLogTag7 = new PayCoreLogTag("FAMILY", 6);
        FAMILY = payCoreLogTag7;
        PayCoreLogTag payCoreLogTag8 = new PayCoreLogTag("CONTACTS", 7);
        CONTACTS = payCoreLogTag8;
        PayCoreLogTag payCoreLogTag9 = new PayCoreLogTag("PRESALE", 8);
        PRESALE = payCoreLogTag9;
        PayCoreLogTag payCoreLogTag10 = new PayCoreLogTag("CLOSING_OFFER", 9);
        CLOSING_OFFER = payCoreLogTag10;
        PayCoreLogTag payCoreLogTag11 = new PayCoreLogTag("COUNTER_OFFERS", 10);
        COUNTER_OFFERS = payCoreLogTag11;
        PayCoreLogTag[] payCoreLogTagArr = {payCoreLogTag, payCoreLogTag2, payCoreLogTag3, payCoreLogTag4, payCoreLogTag5, payCoreLogTag6, payCoreLogTag7, payCoreLogTag8, payCoreLogTag9, payCoreLogTag10, payCoreLogTag11};
        $VALUES = payCoreLogTagArr;
        $ENTRIES = a.a(payCoreLogTagArr);
    }

    public static PayCoreLogTag valueOf(String str) {
        return (PayCoreLogTag) Enum.valueOf(PayCoreLogTag.class, str);
    }

    public static PayCoreLogTag[] values() {
        return (PayCoreLogTag[]) $VALUES.clone();
    }

    @Override // defpackage.ht90
    public final String g() {
        return "PAY";
    }

    @Override // defpackage.ht90
    public final /* bridge */ /* synthetic */ String getName() {
        return name();
    }
}
