package com.yandex.messaging.input.quote;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/messaging/input/quote/QuotePresenter$QuoteType", "", "Lcom/yandex/messaging/input/quote/QuotePresenter$QuoteType;", "REPLY", "FORWARD", "QUOTE", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class QuotePresenter$QuoteType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QuotePresenter$QuoteType[] $VALUES;
    public static final QuotePresenter$QuoteType FORWARD;
    public static final QuotePresenter$QuoteType QUOTE;
    public static final QuotePresenter$QuoteType REPLY;

    static {
        QuotePresenter$QuoteType quotePresenter$QuoteType = new QuotePresenter$QuoteType("REPLY", 0);
        REPLY = quotePresenter$QuoteType;
        QuotePresenter$QuoteType quotePresenter$QuoteType2 = new QuotePresenter$QuoteType("FORWARD", 1);
        FORWARD = quotePresenter$QuoteType2;
        QuotePresenter$QuoteType quotePresenter$QuoteType3 = new QuotePresenter$QuoteType("QUOTE", 2);
        QUOTE = quotePresenter$QuoteType3;
        QuotePresenter$QuoteType[] quotePresenter$QuoteTypeArr = {quotePresenter$QuoteType, quotePresenter$QuoteType2, quotePresenter$QuoteType3};
        $VALUES = quotePresenter$QuoteTypeArr;
        $ENTRIES = kotlin.enums.a.a(quotePresenter$QuoteTypeArr);
    }

    public static QuotePresenter$QuoteType valueOf(String str) {
        return (QuotePresenter$QuoteType) Enum.valueOf(QuotePresenter$QuoteType.class, str);
    }

    public static QuotePresenter$QuoteType[] values() {
        return (QuotePresenter$QuoteType[]) $VALUES.clone();
    }
}
