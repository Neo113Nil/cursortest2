package com.yandex.plus.home.feature.webviews.internalapi;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/WebViewType;", "", "HOME", "STORIES", "SMART", "SIMPLE", "SYSTEM", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebViewType[] $VALUES;
    public static final WebViewType HOME;
    public static final WebViewType SIMPLE;
    public static final WebViewType SMART;
    public static final WebViewType STORIES;
    public static final WebViewType SYSTEM;

    static {
        WebViewType webViewType = new WebViewType("HOME", 0);
        HOME = webViewType;
        WebViewType webViewType2 = new WebViewType("STORIES", 1);
        STORIES = webViewType2;
        WebViewType webViewType3 = new WebViewType("SMART", 2);
        SMART = webViewType3;
        WebViewType webViewType4 = new WebViewType("SIMPLE", 3);
        SIMPLE = webViewType4;
        WebViewType webViewType5 = new WebViewType("SYSTEM", 4);
        SYSTEM = webViewType5;
        WebViewType[] webViewTypeArr = {webViewType, webViewType2, webViewType3, webViewType4, webViewType5};
        $VALUES = webViewTypeArr;
        $ENTRIES = a.a(webViewTypeArr);
    }

    public static WebViewType valueOf(String str) {
        return (WebViewType) Enum.valueOf(WebViewType.class, str);
    }

    public static WebViewType[] values() {
        return (WebViewType[]) $VALUES.clone();
    }
}
