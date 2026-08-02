package com.yandex.payment.sdk.datasource.bind.interfaces;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/payment/sdk/datasource/bind/interfaces/CardButtonTitle;", "", "ShowNext", "ShowProcess", "datasource_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardButtonTitle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardButtonTitle[] $VALUES;
    public static final CardButtonTitle ShowNext;
    public static final CardButtonTitle ShowProcess;

    static {
        CardButtonTitle cardButtonTitle = new CardButtonTitle("ShowNext", 0);
        ShowNext = cardButtonTitle;
        CardButtonTitle cardButtonTitle2 = new CardButtonTitle("ShowProcess", 1);
        ShowProcess = cardButtonTitle2;
        CardButtonTitle[] cardButtonTitleArr = {cardButtonTitle, cardButtonTitle2};
        $VALUES = cardButtonTitleArr;
        $ENTRIES = a.a(cardButtonTitleArr);
    }

    public static CardButtonTitle valueOf(String str) {
        return (CardButtonTitle) Enum.valueOf(CardButtonTitle.class, str);
    }

    public static CardButtonTitle[] values() {
        return (CardButtonTitle[]) $VALUES.clone();
    }
}
