package com.yandex.plus.webview.api.container;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/webview/api/container/WebViewContainerType;", "", "TOOLBAR", "FOOTER", "MAIN", "plus-core-webview-contracts_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewContainerType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebViewContainerType[] $VALUES;
    public static final WebViewContainerType FOOTER;
    public static final WebViewContainerType MAIN;
    public static final WebViewContainerType TOOLBAR;

    static {
        WebViewContainerType webViewContainerType = new WebViewContainerType("TOOLBAR", 0);
        TOOLBAR = webViewContainerType;
        WebViewContainerType webViewContainerType2 = new WebViewContainerType("FOOTER", 1);
        FOOTER = webViewContainerType2;
        WebViewContainerType webViewContainerType3 = new WebViewContainerType("MAIN", 2);
        MAIN = webViewContainerType3;
        WebViewContainerType[] webViewContainerTypeArr = {webViewContainerType, webViewContainerType2, webViewContainerType3};
        $VALUES = webViewContainerTypeArr;
        $ENTRIES = a.a(webViewContainerTypeArr);
    }

    public static WebViewContainerType valueOf(String str) {
        return (WebViewContainerType) Enum.valueOf(WebViewContainerType.class, str);
    }

    public static WebViewContainerType[] values() {
        return (WebViewContainerType[]) $VALUES.clone();
    }
}
