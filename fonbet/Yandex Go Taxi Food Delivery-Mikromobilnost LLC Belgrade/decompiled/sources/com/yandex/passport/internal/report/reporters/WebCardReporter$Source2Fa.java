package com.yandex.passport.internal.report.reporters;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/passport/internal/report/reporters/WebCardReporter$Source2Fa", "", "Lcom/yandex/passport/internal/report/reporters/WebCardReporter$Source2Fa;", "DataPush", "NotificationPush", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WebCardReporter$Source2Fa {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebCardReporter$Source2Fa[] $VALUES;
    public static final WebCardReporter$Source2Fa DataPush;
    public static final WebCardReporter$Source2Fa NotificationPush;

    static {
        WebCardReporter$Source2Fa webCardReporter$Source2Fa = new WebCardReporter$Source2Fa("DataPush", 0);
        DataPush = webCardReporter$Source2Fa;
        WebCardReporter$Source2Fa webCardReporter$Source2Fa2 = new WebCardReporter$Source2Fa("NotificationPush", 1);
        NotificationPush = webCardReporter$Source2Fa2;
        WebCardReporter$Source2Fa[] webCardReporter$Source2FaArr = {webCardReporter$Source2Fa, webCardReporter$Source2Fa2};
        $VALUES = webCardReporter$Source2FaArr;
        $ENTRIES = kotlin.enums.a.a(webCardReporter$Source2FaArr);
    }

    public static WebCardReporter$Source2Fa valueOf(String str) {
        return (WebCardReporter$Source2Fa) Enum.valueOf(WebCardReporter$Source2Fa.class, str);
    }

    public static WebCardReporter$Source2Fa[] values() {
        return (WebCardReporter$Source2Fa[]) $VALUES.clone();
    }
}
