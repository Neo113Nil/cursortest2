package com.yandex.go.shortcuts.impl.next.button;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/shortcuts/impl/next/button/NextButtonAnalytics$ProceedButtonType", "", "Lcom/yandex/go/shortcuts/impl/next/button/NextButtonAnalytics$ProceedButtonType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ARROW_ON_SHORTCUT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NextButtonAnalytics$ProceedButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NextButtonAnalytics$ProceedButtonType[] $VALUES;
    public static final NextButtonAnalytics$ProceedButtonType ARROW_ON_SHORTCUT;
    private final String value = "arrow_on_shortcut";

    static {
        NextButtonAnalytics$ProceedButtonType nextButtonAnalytics$ProceedButtonType = new NextButtonAnalytics$ProceedButtonType();
        ARROW_ON_SHORTCUT = nextButtonAnalytics$ProceedButtonType;
        NextButtonAnalytics$ProceedButtonType[] nextButtonAnalytics$ProceedButtonTypeArr = {nextButtonAnalytics$ProceedButtonType};
        $VALUES = nextButtonAnalytics$ProceedButtonTypeArr;
        $ENTRIES = kotlin.enums.a.a(nextButtonAnalytics$ProceedButtonTypeArr);
    }

    public static NextButtonAnalytics$ProceedButtonType valueOf(String str) {
        return (NextButtonAnalytics$ProceedButtonType) Enum.valueOf(NextButtonAnalytics$ProceedButtonType.class, str);
    }

    public static NextButtonAnalytics$ProceedButtonType[] values() {
        return (NextButtonAnalytics$ProceedButtonType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
