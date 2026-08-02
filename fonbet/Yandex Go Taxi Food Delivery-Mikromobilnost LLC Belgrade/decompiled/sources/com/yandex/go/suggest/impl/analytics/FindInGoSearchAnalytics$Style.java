package com.yandex.go.suggest.impl.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/suggest/impl/analytics/FindInGoSearchAnalytics$Style", "", "Lcom/yandex/go/suggest/impl/analytics/FindInGoSearchAnalytics$Style;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Normal", "FloatingInput", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FindInGoSearchAnalytics$Style {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FindInGoSearchAnalytics$Style[] $VALUES;
    public static final FindInGoSearchAnalytics$Style FloatingInput;
    public static final FindInGoSearchAnalytics$Style Normal;
    private final String eventValue;

    static {
        FindInGoSearchAnalytics$Style findInGoSearchAnalytics$Style = new FindInGoSearchAnalytics$Style("Normal", 0, Constants.NORMAL);
        Normal = findInGoSearchAnalytics$Style;
        FindInGoSearchAnalytics$Style findInGoSearchAnalytics$Style2 = new FindInGoSearchAnalytics$Style("FloatingInput", 1, "floating_input");
        FloatingInput = findInGoSearchAnalytics$Style2;
        FindInGoSearchAnalytics$Style[] findInGoSearchAnalytics$StyleArr = {findInGoSearchAnalytics$Style, findInGoSearchAnalytics$Style2};
        $VALUES = findInGoSearchAnalytics$StyleArr;
        $ENTRIES = a.a(findInGoSearchAnalytics$StyleArr);
    }

    public FindInGoSearchAnalytics$Style(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static FindInGoSearchAnalytics$Style valueOf(String str) {
        return (FindInGoSearchAnalytics$Style) Enum.valueOf(FindInGoSearchAnalytics$Style.class, str);
    }

    public static FindInGoSearchAnalytics$Style[] values() {
        return (FindInGoSearchAnalytics$Style[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
