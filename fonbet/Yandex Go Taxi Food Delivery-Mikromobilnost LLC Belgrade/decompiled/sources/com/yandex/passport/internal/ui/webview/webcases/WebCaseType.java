package com.yandex.passport.internal.ui.webview.webcases;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/passport/internal/ui/webview/webcases/WebCaseType;", "", "", "clearCookies", "Z", "a", "()Z", "WEB_LOGIN", "SOCIAL_AUTH", "MAIL_OAUTH", "NATIVE_SOCIAL_AUTH", "WEB_RESTORE_PASSWORD", "VIEW_LEGAL", "WEB_EXTERNAL_ACTION", "BIND_SOCIAL_NATIVE", "BIND_SOCIAL_WEB", "WEB_SHOW_AUTH_CODE", "CHANGE_PASSWORD", "AUTH_ON_TV", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebCaseType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebCaseType[] $VALUES;
    public static final WebCaseType AUTH_ON_TV;
    public static final WebCaseType BIND_SOCIAL_NATIVE;
    public static final WebCaseType BIND_SOCIAL_WEB;
    public static final WebCaseType CHANGE_PASSWORD;
    public static final WebCaseType MAIL_OAUTH;
    public static final WebCaseType NATIVE_SOCIAL_AUTH;
    public static final WebCaseType SOCIAL_AUTH;
    public static final WebCaseType VIEW_LEGAL;
    public static final WebCaseType WEB_EXTERNAL_ACTION;
    public static final WebCaseType WEB_LOGIN;
    public static final WebCaseType WEB_RESTORE_PASSWORD;
    public static final WebCaseType WEB_SHOW_AUTH_CODE;
    private final boolean clearCookies;

    static {
        WebCaseType webCaseType = new WebCaseType("WEB_LOGIN", 0, false);
        WEB_LOGIN = webCaseType;
        WebCaseType webCaseType2 = new WebCaseType("SOCIAL_AUTH", 1, true);
        SOCIAL_AUTH = webCaseType2;
        WebCaseType webCaseType3 = new WebCaseType("MAIL_OAUTH", 2, true);
        MAIL_OAUTH = webCaseType3;
        WebCaseType webCaseType4 = new WebCaseType("NATIVE_SOCIAL_AUTH", 3, false);
        NATIVE_SOCIAL_AUTH = webCaseType4;
        WebCaseType webCaseType5 = new WebCaseType("WEB_RESTORE_PASSWORD", 4, false);
        WEB_RESTORE_PASSWORD = webCaseType5;
        WebCaseType webCaseType6 = new WebCaseType("VIEW_LEGAL", 5, false);
        VIEW_LEGAL = webCaseType6;
        WebCaseType webCaseType7 = new WebCaseType("WEB_EXTERNAL_ACTION", 6, false);
        WEB_EXTERNAL_ACTION = webCaseType7;
        WebCaseType webCaseType8 = new WebCaseType("BIND_SOCIAL_NATIVE", 7, false);
        BIND_SOCIAL_NATIVE = webCaseType8;
        WebCaseType webCaseType9 = new WebCaseType("BIND_SOCIAL_WEB", 8, true);
        BIND_SOCIAL_WEB = webCaseType9;
        WebCaseType webCaseType10 = new WebCaseType("WEB_SHOW_AUTH_CODE", 9, false);
        WEB_SHOW_AUTH_CODE = webCaseType10;
        WebCaseType webCaseType11 = new WebCaseType("CHANGE_PASSWORD", 10, false);
        CHANGE_PASSWORD = webCaseType11;
        WebCaseType webCaseType12 = new WebCaseType("AUTH_ON_TV", 11, false);
        AUTH_ON_TV = webCaseType12;
        WebCaseType[] webCaseTypeArr = {webCaseType, webCaseType2, webCaseType3, webCaseType4, webCaseType5, webCaseType6, webCaseType7, webCaseType8, webCaseType9, webCaseType10, webCaseType11, webCaseType12};
        $VALUES = webCaseTypeArr;
        $ENTRIES = kotlin.enums.a.a(webCaseTypeArr);
    }

    public WebCaseType(String str, int i, boolean z) {
        this.clearCookies = z;
    }

    public static WebCaseType valueOf(String str) {
        return (WebCaseType) Enum.valueOf(WebCaseType.class, str);
    }

    public static WebCaseType[] values() {
        return (WebCaseType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final boolean getClearCookies() {
        return this.clearCookies;
    }
}
