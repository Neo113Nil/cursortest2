package com.yandex.passport.internal.ui.router;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/passport/internal/ui/router/RoadSign;", "", "", "signName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LOGIN", "SOCIAL_BIND", "SOCIAL_APPLICATION_BIND", "AUTHORIZATION_BY_QR", "TURBO_APP_AUTH", "CONFIRM_QR_AUTHORIZATION", "LOGOUT", "SET_CURRENT_ACCOUNT", "WEB_VIEW", "NOTIFICATION_BUILDER", "SHOW_USER_MENU", "DELETE_ACCOUNT", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RoadSign {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RoadSign[] $VALUES;
    public static final RoadSign AUTHORIZATION_BY_QR;
    public static final RoadSign CONFIRM_QR_AUTHORIZATION;
    public static final RoadSign DELETE_ACCOUNT;
    public static final RoadSign LOGIN;
    public static final RoadSign LOGOUT;
    public static final RoadSign NOTIFICATION_BUILDER;
    public static final RoadSign SET_CURRENT_ACCOUNT;
    public static final RoadSign SHOW_USER_MENU;
    public static final RoadSign SOCIAL_APPLICATION_BIND;
    public static final RoadSign SOCIAL_BIND;
    public static final RoadSign TURBO_APP_AUTH;
    public static final RoadSign WEB_VIEW;
    private final String signName;

    static {
        RoadSign roadSign = new RoadSign("LOGIN", 0, "Login");
        LOGIN = roadSign;
        RoadSign roadSign2 = new RoadSign("SOCIAL_BIND", 1, "SocialBind");
        SOCIAL_BIND = roadSign2;
        RoadSign roadSign3 = new RoadSign("SOCIAL_APPLICATION_BIND", 2, "SocialApplicationBind");
        SOCIAL_APPLICATION_BIND = roadSign3;
        RoadSign roadSign4 = new RoadSign("AUTHORIZATION_BY_QR", 3, "AuthorizationByQr");
        AUTHORIZATION_BY_QR = roadSign4;
        RoadSign roadSign5 = new RoadSign("TURBO_APP_AUTH", 4, "TurboAppAuth");
        TURBO_APP_AUTH = roadSign5;
        RoadSign roadSign6 = new RoadSign("CONFIRM_QR_AUTHORIZATION", 5, "ConfirmQrAuthorization");
        CONFIRM_QR_AUTHORIZATION = roadSign6;
        RoadSign roadSign7 = new RoadSign("LOGOUT", 6, "Logout");
        LOGOUT = roadSign7;
        RoadSign roadSign8 = new RoadSign("SET_CURRENT_ACCOUNT", 7, "SetCurrentAccount");
        SET_CURRENT_ACCOUNT = roadSign8;
        RoadSign roadSign9 = new RoadSign("WEB_VIEW", 8, "WebView");
        WEB_VIEW = roadSign9;
        RoadSign roadSign10 = new RoadSign("NOTIFICATION_BUILDER", 9, "NotificationBuilder");
        NOTIFICATION_BUILDER = roadSign10;
        RoadSign roadSign11 = new RoadSign("SHOW_USER_MENU", 10, "ShowUserMenu");
        SHOW_USER_MENU = roadSign11;
        RoadSign roadSign12 = new RoadSign("DELETE_ACCOUNT", 11, "DeleteAccount");
        DELETE_ACCOUNT = roadSign12;
        RoadSign[] roadSignArr = {roadSign, roadSign2, roadSign3, roadSign4, roadSign5, roadSign6, roadSign7, roadSign8, roadSign9, roadSign10, roadSign11, roadSign12};
        $VALUES = roadSignArr;
        $ENTRIES = kotlin.enums.a.a(roadSignArr);
    }

    public RoadSign(String str, int i, String str2) {
        this.signName = str2;
    }

    public static RoadSign valueOf(String str) {
        return (RoadSign) Enum.valueOf(RoadSign.class, str);
    }

    public static RoadSign[] values() {
        return (RoadSign[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getSignName() {
        return this.signName;
    }
}
