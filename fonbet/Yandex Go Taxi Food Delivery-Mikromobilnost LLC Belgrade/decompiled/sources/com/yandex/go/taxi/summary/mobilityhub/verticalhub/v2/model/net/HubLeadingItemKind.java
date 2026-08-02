package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.o0v;
import defpackage.syu;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubLeadingItemKind;", "", "Companion", "o0v", Card.CARD_TYPE_CREDIT_DEBIT, "TRANSPORT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubLeadingItemKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HubLeadingItemKind[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final o0v Companion;
    public static final HubLeadingItemKind PAYMENT;
    public static final HubLeadingItemKind TRANSPORT;

    static {
        HubLeadingItemKind hubLeadingItemKind = new HubLeadingItemKind(Card.CARD_TYPE_CREDIT_DEBIT, 0);
        PAYMENT = hubLeadingItemKind;
        HubLeadingItemKind hubLeadingItemKind2 = new HubLeadingItemKind("TRANSPORT", 1);
        TRANSPORT = hubLeadingItemKind2;
        HubLeadingItemKind[] hubLeadingItemKindArr = {hubLeadingItemKind, hubLeadingItemKind2};
        $VALUES = hubLeadingItemKindArr;
        $ENTRIES = kotlin.enums.a.a(hubLeadingItemKindArr);
        Companion = new o0v();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(2));
    }

    public static HubLeadingItemKind valueOf(String str) {
        return (HubLeadingItemKind) Enum.valueOf(HubLeadingItemKind.class, str);
    }

    public static HubLeadingItemKind[] values() {
        return (HubLeadingItemKind[]) $VALUES.clone();
    }
}
