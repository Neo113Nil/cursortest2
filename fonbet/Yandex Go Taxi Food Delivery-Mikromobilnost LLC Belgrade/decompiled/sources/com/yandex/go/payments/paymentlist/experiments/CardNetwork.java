package com.yandex.go.payments.paymentlist.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mj8;
import defpackage.r66;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/CardNetwork;", "", "", "id", CA20Status.STATUS_USER_I, "b", "()I", "Companion", "mj8", "VISA", "MASTERCARD", "MIR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardNetwork {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardNetwork[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final mj8 Companion;
    public static final CardNetwork MASTERCARD;
    public static final CardNetwork MIR;
    public static final CardNetwork VISA;
    private final int id;

    static {
        CardNetwork cardNetwork = new CardNetwork("VISA", 0, 5);
        VISA = cardNetwork;
        CardNetwork cardNetwork2 = new CardNetwork("MASTERCARD", 1, 4);
        MASTERCARD = cardNetwork2;
        CardNetwork cardNetwork3 = new CardNetwork("MIR", 2, 7);
        MIR = cardNetwork3;
        CardNetwork[] cardNetworkArr = {cardNetwork, cardNetwork2, cardNetwork3};
        $VALUES = cardNetworkArr;
        $ENTRIES = kotlin.enums.a.a(cardNetworkArr);
        Companion = new mj8();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(21));
    }

    public CardNetwork(String str, int i, int i2) {
        this.id = i2;
    }

    public static CardNetwork valueOf(String str) {
        return (CardNetwork) Enum.valueOf(CardNetwork.class, str);
    }

    public static CardNetwork[] values() {
        return (CardNetwork[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }
}
