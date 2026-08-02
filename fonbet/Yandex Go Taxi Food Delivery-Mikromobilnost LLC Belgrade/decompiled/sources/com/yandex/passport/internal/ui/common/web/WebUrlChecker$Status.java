package com.yandex.passport.internal.ui.common.web;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/passport/internal/ui/common/web/WebUrlChecker$Status", "", "Lcom/yandex/passport/internal/ui/common/web/WebUrlChecker$Status;", "ALLOWED", "BLOCKED", "EXTERNAL", "EXTERNAL_AND_CANCEL", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebUrlChecker$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebUrlChecker$Status[] $VALUES;
    public static final WebUrlChecker$Status ALLOWED;
    public static final WebUrlChecker$Status BLOCKED;
    public static final WebUrlChecker$Status EXTERNAL;
    public static final WebUrlChecker$Status EXTERNAL_AND_CANCEL;

    static {
        WebUrlChecker$Status webUrlChecker$Status = new WebUrlChecker$Status("ALLOWED", 0);
        ALLOWED = webUrlChecker$Status;
        WebUrlChecker$Status webUrlChecker$Status2 = new WebUrlChecker$Status("BLOCKED", 1);
        BLOCKED = webUrlChecker$Status2;
        WebUrlChecker$Status webUrlChecker$Status3 = new WebUrlChecker$Status("EXTERNAL", 2);
        EXTERNAL = webUrlChecker$Status3;
        WebUrlChecker$Status webUrlChecker$Status4 = new WebUrlChecker$Status("EXTERNAL_AND_CANCEL", 3);
        EXTERNAL_AND_CANCEL = webUrlChecker$Status4;
        WebUrlChecker$Status[] webUrlChecker$StatusArr = {webUrlChecker$Status, webUrlChecker$Status2, webUrlChecker$Status3, webUrlChecker$Status4};
        $VALUES = webUrlChecker$StatusArr;
        $ENTRIES = kotlin.enums.a.a(webUrlChecker$StatusArr);
    }

    public static WebUrlChecker$Status valueOf(String str) {
        return (WebUrlChecker$Status) Enum.valueOf(WebUrlChecker$Status.class, str);
    }

    public static WebUrlChecker$Status[] values() {
        return (WebUrlChecker$Status[]) $VALUES.clone();
    }
}
