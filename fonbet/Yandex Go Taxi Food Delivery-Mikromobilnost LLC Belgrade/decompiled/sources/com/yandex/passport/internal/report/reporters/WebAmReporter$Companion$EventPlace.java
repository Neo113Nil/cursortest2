package com.yandex.passport.internal.report.reporters;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/passport/internal/report/reporters/WebAmReporter$Companion$EventPlace", "", "Lcom/yandex/passport/internal/report/reporters/WebAmReporter$Companion$EventPlace;", "", "place", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "WEB_CARD", "STANDALONE", "AUTH_SDK", "USER_MENU", "DELETE_FOREVER_ACCOUNT", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebAmReporter$Companion$EventPlace {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebAmReporter$Companion$EventPlace[] $VALUES;
    public static final WebAmReporter$Companion$EventPlace AUTH_SDK;
    public static final WebAmReporter$Companion$EventPlace DELETE_FOREVER_ACCOUNT;
    public static final WebAmReporter$Companion$EventPlace STANDALONE;
    public static final WebAmReporter$Companion$EventPlace USER_MENU;
    public static final WebAmReporter$Companion$EventPlace WEB_CARD;
    private final String place;

    static {
        WebAmReporter$Companion$EventPlace webAmReporter$Companion$EventPlace = new WebAmReporter$Companion$EventPlace("WEB_CARD", 0, "web_card");
        WEB_CARD = webAmReporter$Companion$EventPlace;
        WebAmReporter$Companion$EventPlace webAmReporter$Companion$EventPlace2 = new WebAmReporter$Companion$EventPlace("STANDALONE", 1, "standalone");
        STANDALONE = webAmReporter$Companion$EventPlace2;
        WebAmReporter$Companion$EventPlace webAmReporter$Companion$EventPlace3 = new WebAmReporter$Companion$EventPlace("AUTH_SDK", 2, "auth_sdk");
        AUTH_SDK = webAmReporter$Companion$EventPlace3;
        WebAmReporter$Companion$EventPlace webAmReporter$Companion$EventPlace4 = new WebAmReporter$Companion$EventPlace("USER_MENU", 3, "user_menu");
        USER_MENU = webAmReporter$Companion$EventPlace4;
        WebAmReporter$Companion$EventPlace webAmReporter$Companion$EventPlace5 = new WebAmReporter$Companion$EventPlace("DELETE_FOREVER_ACCOUNT", 4, "delete_forever_account");
        DELETE_FOREVER_ACCOUNT = webAmReporter$Companion$EventPlace5;
        WebAmReporter$Companion$EventPlace[] webAmReporter$Companion$EventPlaceArr = {webAmReporter$Companion$EventPlace, webAmReporter$Companion$EventPlace2, webAmReporter$Companion$EventPlace3, webAmReporter$Companion$EventPlace4, webAmReporter$Companion$EventPlace5};
        $VALUES = webAmReporter$Companion$EventPlaceArr;
        $ENTRIES = kotlin.enums.a.a(webAmReporter$Companion$EventPlaceArr);
    }

    public WebAmReporter$Companion$EventPlace(String str, int i, String str2) {
        this.place = str2;
    }

    public static WebAmReporter$Companion$EventPlace valueOf(String str) {
        return (WebAmReporter$Companion$EventPlace) Enum.valueOf(WebAmReporter$Companion$EventPlace.class, str);
    }

    public static WebAmReporter$Companion$EventPlace[] values() {
        return (WebAmReporter$Companion$EventPlace[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getPlace() {
        return this.place;
    }
}
