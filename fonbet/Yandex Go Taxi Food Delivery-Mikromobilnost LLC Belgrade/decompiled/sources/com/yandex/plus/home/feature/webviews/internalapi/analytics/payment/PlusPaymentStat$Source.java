package com.yandex.plus.home.feature.webviews.internalapi.analytics.payment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPaymentStat$Source", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/analytics/payment/PlusPaymentStat$Source;", "HOME", "STORY", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusPaymentStat$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPaymentStat$Source[] $VALUES;
    public static final PlusPaymentStat$Source HOME;
    public static final PlusPaymentStat$Source STORY;

    static {
        PlusPaymentStat$Source plusPaymentStat$Source = new PlusPaymentStat$Source("HOME", 0);
        HOME = plusPaymentStat$Source;
        PlusPaymentStat$Source plusPaymentStat$Source2 = new PlusPaymentStat$Source("STORY", 1);
        STORY = plusPaymentStat$Source2;
        PlusPaymentStat$Source[] plusPaymentStat$SourceArr = {plusPaymentStat$Source, plusPaymentStat$Source2};
        $VALUES = plusPaymentStat$SourceArr;
        $ENTRIES = a.a(plusPaymentStat$SourceArr);
    }

    public static PlusPaymentStat$Source valueOf(String str) {
        return (PlusPaymentStat$Source) Enum.valueOf(PlusPaymentStat$Source.class, str);
    }

    public static PlusPaymentStat$Source[] values() {
        return (PlusPaymentStat$Source[]) $VALUES.clone();
    }
}
