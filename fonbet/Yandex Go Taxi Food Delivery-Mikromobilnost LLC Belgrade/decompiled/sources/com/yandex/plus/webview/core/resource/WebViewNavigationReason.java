package com.yandex.plus.webview.core.resource;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/webview/core/resource/WebViewNavigationReason;", "", "USER_ACTION", "REDIRECT", "OTHER", "homeless-core-webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewNavigationReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebViewNavigationReason[] $VALUES;
    public static final WebViewNavigationReason OTHER;
    public static final WebViewNavigationReason REDIRECT;
    public static final WebViewNavigationReason USER_ACTION;

    static {
        WebViewNavigationReason webViewNavigationReason = new WebViewNavigationReason("USER_ACTION", 0);
        USER_ACTION = webViewNavigationReason;
        WebViewNavigationReason webViewNavigationReason2 = new WebViewNavigationReason("REDIRECT", 1);
        REDIRECT = webViewNavigationReason2;
        WebViewNavigationReason webViewNavigationReason3 = new WebViewNavigationReason("OTHER", 2);
        OTHER = webViewNavigationReason3;
        WebViewNavigationReason[] webViewNavigationReasonArr = {webViewNavigationReason, webViewNavigationReason2, webViewNavigationReason3};
        $VALUES = webViewNavigationReasonArr;
        $ENTRIES = a.a(webViewNavigationReasonArr);
    }

    public static WebViewNavigationReason valueOf(String str) {
        return (WebViewNavigationReason) Enum.valueOf(WebViewNavigationReason.class, str);
    }

    public static WebViewNavigationReason[] values() {
        return (WebViewNavigationReason[]) $VALUES.clone();
    }
}
