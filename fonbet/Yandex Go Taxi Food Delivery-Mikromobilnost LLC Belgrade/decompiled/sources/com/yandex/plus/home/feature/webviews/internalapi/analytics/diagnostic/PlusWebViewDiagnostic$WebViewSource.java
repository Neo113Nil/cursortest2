package com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/analytics/diagnostic/PlusWebViewDiagnostic$WebViewSource", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/analytics/diagnostic/PlusWebViewDiagnostic$WebViewSource;", "HOME", "STORIES", "SIMPLE", "SMART", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusWebViewDiagnostic$WebViewSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusWebViewDiagnostic$WebViewSource[] $VALUES;
    public static final PlusWebViewDiagnostic$WebViewSource HOME;
    public static final PlusWebViewDiagnostic$WebViewSource SIMPLE;
    public static final PlusWebViewDiagnostic$WebViewSource SMART;
    public static final PlusWebViewDiagnostic$WebViewSource STORIES;

    static {
        PlusWebViewDiagnostic$WebViewSource plusWebViewDiagnostic$WebViewSource = new PlusWebViewDiagnostic$WebViewSource("HOME", 0);
        HOME = plusWebViewDiagnostic$WebViewSource;
        PlusWebViewDiagnostic$WebViewSource plusWebViewDiagnostic$WebViewSource2 = new PlusWebViewDiagnostic$WebViewSource("STORIES", 1);
        STORIES = plusWebViewDiagnostic$WebViewSource2;
        PlusWebViewDiagnostic$WebViewSource plusWebViewDiagnostic$WebViewSource3 = new PlusWebViewDiagnostic$WebViewSource("SIMPLE", 2);
        SIMPLE = plusWebViewDiagnostic$WebViewSource3;
        PlusWebViewDiagnostic$WebViewSource plusWebViewDiagnostic$WebViewSource4 = new PlusWebViewDiagnostic$WebViewSource("SMART", 3);
        SMART = plusWebViewDiagnostic$WebViewSource4;
        PlusWebViewDiagnostic$WebViewSource[] plusWebViewDiagnostic$WebViewSourceArr = {plusWebViewDiagnostic$WebViewSource, plusWebViewDiagnostic$WebViewSource2, plusWebViewDiagnostic$WebViewSource3, plusWebViewDiagnostic$WebViewSource4};
        $VALUES = plusWebViewDiagnostic$WebViewSourceArr;
        $ENTRIES = a.a(plusWebViewDiagnostic$WebViewSourceArr);
    }

    public static PlusWebViewDiagnostic$WebViewSource valueOf(String str) {
        return (PlusWebViewDiagnostic$WebViewSource) Enum.valueOf(PlusWebViewDiagnostic$WebViewSource.class, str);
    }

    public static PlusWebViewDiagnostic$WebViewSource[] values() {
        return (PlusWebViewDiagnostic$WebViewSource[]) $VALUES.clone();
    }
}
