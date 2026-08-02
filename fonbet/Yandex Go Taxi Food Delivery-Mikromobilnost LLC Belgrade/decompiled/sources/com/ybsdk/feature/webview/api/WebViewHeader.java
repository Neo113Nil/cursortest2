package com.ybsdk.feature.webview.api;

import defpackage.k4o;
import defpackage.yu50;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/feature/webview/api/WebViewHeader;", "", "headerName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getHeaderName", "()Ljava/lang/String;", "HEADER_AUTHORIZATION", "X_YABANK_SESSION_UUID", "SDK_USER_AGENT", "HEADER_ACCEPT_LANGUAGE", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebViewHeader {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebViewHeader[] $VALUES;
    public static final WebViewHeader HEADER_ACCEPT_LANGUAGE;
    public static final WebViewHeader HEADER_AUTHORIZATION = new WebViewHeader("HEADER_AUTHORIZATION", 0, "Authorization");
    public static final WebViewHeader SDK_USER_AGENT;
    public static final WebViewHeader X_YABANK_SESSION_UUID;
    private final String headerName;

    private static final /* synthetic */ WebViewHeader[] $values() {
        return new WebViewHeader[]{HEADER_AUTHORIZATION, X_YABANK_SESSION_UUID, SDK_USER_AGENT, HEADER_ACCEPT_LANGUAGE};
    }

    static {
        String str = yu50.a;
        X_YABANK_SESSION_UUID = new WebViewHeader("X_YABANK_SESSION_UUID", 1, yu50.f);
        SDK_USER_AGENT = new WebViewHeader("SDK_USER_AGENT", 2, "YB-User-Agent");
        HEADER_ACCEPT_LANGUAGE = new WebViewHeader("HEADER_ACCEPT_LANGUAGE", 3, "Accept-Language");
        WebViewHeader[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private WebViewHeader(String str, int i, String str2) {
        this.headerName = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static WebViewHeader valueOf(String str) {
        return (WebViewHeader) Enum.valueOf(WebViewHeader.class, str);
    }

    public static WebViewHeader[] values() {
        return (WebViewHeader[]) $VALUES.clone();
    }

    public final String getHeaderName() {
        return this.headerName;
    }
}
