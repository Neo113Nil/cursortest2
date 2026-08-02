package com.yandex.go.inapp_calls.analytics.evgen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/inapp_calls/analytics/evgen/InAppCallsAnalytics$Option", "", "Lcom/yandex/go/inapp_calls/analytics/evgen/InAppCallsAnalytics$Option;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "InApp", "Phone", "Ask", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InAppCallsAnalytics$Option {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InAppCallsAnalytics$Option[] $VALUES;
    public static final InAppCallsAnalytics$Option Ask;
    public static final InAppCallsAnalytics$Option InApp;
    public static final InAppCallsAnalytics$Option Phone;
    private final String eventValue;

    static {
        InAppCallsAnalytics$Option inAppCallsAnalytics$Option = new InAppCallsAnalytics$Option("InApp", 0, "in_app");
        InApp = inAppCallsAnalytics$Option;
        InAppCallsAnalytics$Option inAppCallsAnalytics$Option2 = new InAppCallsAnalytics$Option("Phone", 1, "phone");
        Phone = inAppCallsAnalytics$Option2;
        InAppCallsAnalytics$Option inAppCallsAnalytics$Option3 = new InAppCallsAnalytics$Option("Ask", 2, "ask");
        Ask = inAppCallsAnalytics$Option3;
        InAppCallsAnalytics$Option[] inAppCallsAnalytics$OptionArr = {inAppCallsAnalytics$Option, inAppCallsAnalytics$Option2, inAppCallsAnalytics$Option3};
        $VALUES = inAppCallsAnalytics$OptionArr;
        $ENTRIES = a.a(inAppCallsAnalytics$OptionArr);
    }

    public InAppCallsAnalytics$Option(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static InAppCallsAnalytics$Option valueOf(String str) {
        return (InAppCallsAnalytics$Option) Enum.valueOf(InAppCallsAnalytics$Option.class, str);
    }

    public static InAppCallsAnalytics$Option[] values() {
        return (InAppCallsAnalytics$Option[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
