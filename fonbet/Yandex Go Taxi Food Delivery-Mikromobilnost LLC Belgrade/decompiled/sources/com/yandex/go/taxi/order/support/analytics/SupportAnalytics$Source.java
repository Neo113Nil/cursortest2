package com.yandex.go.taxi.order.support.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/taxi/order/support/analytics/SupportAnalytics$Source", "", "Lcom/yandex/go/taxi/order/support/analytics/SupportAnalytics$Source;", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "OUT_OF_SCREEN", "BACK_BUTTON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SupportAnalytics$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportAnalytics$Source[] $VALUES;
    public static final SupportAnalytics$Source BACK_BUTTON;
    public static final SupportAnalytics$Source OUT_OF_SCREEN;
    private final String text;

    static {
        SupportAnalytics$Source supportAnalytics$Source = new SupportAnalytics$Source("OUT_OF_SCREEN", 0, "out_of_screen");
        OUT_OF_SCREEN = supportAnalytics$Source;
        SupportAnalytics$Source supportAnalytics$Source2 = new SupportAnalytics$Source("BACK_BUTTON", 1, "back_button");
        BACK_BUTTON = supportAnalytics$Source2;
        SupportAnalytics$Source[] supportAnalytics$SourceArr = {supportAnalytics$Source, supportAnalytics$Source2};
        $VALUES = supportAnalytics$SourceArr;
        $ENTRIES = a.a(supportAnalytics$SourceArr);
    }

    public SupportAnalytics$Source(String str, int i, String str2) {
        this.text = str2;
    }

    public static SupportAnalytics$Source valueOf(String str) {
        return (SupportAnalytics$Source) Enum.valueOf(SupportAnalytics$Source.class, str);
    }

    public static SupportAnalytics$Source[] values() {
        return (SupportAnalytics$Source[]) $VALUES.clone();
    }
}
