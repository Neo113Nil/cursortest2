package com.yandex.passport.internal.ui.common.web;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.ssl.SSLLogger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/passport/internal/ui/common/web/WebCaseNext$Error", "", "Lcom/yandex/passport/internal/ui/common/web/WebCaseNext$Error;", SSLLogger.SHORT_LOGGER_NAME, "NETWORK", "UNKNOWN", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebCaseNext$Error {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebCaseNext$Error[] $VALUES;
    public static final WebCaseNext$Error NETWORK;
    public static final WebCaseNext$Error SSL;
    public static final WebCaseNext$Error UNKNOWN;

    static {
        WebCaseNext$Error webCaseNext$Error = new WebCaseNext$Error(SSLLogger.SHORT_LOGGER_NAME, 0);
        SSL = webCaseNext$Error;
        WebCaseNext$Error webCaseNext$Error2 = new WebCaseNext$Error("NETWORK", 1);
        NETWORK = webCaseNext$Error2;
        WebCaseNext$Error webCaseNext$Error3 = new WebCaseNext$Error("UNKNOWN", 2);
        UNKNOWN = webCaseNext$Error3;
        WebCaseNext$Error[] webCaseNext$ErrorArr = {webCaseNext$Error, webCaseNext$Error2, webCaseNext$Error3};
        $VALUES = webCaseNext$ErrorArr;
        $ENTRIES = kotlin.enums.a.a(webCaseNext$ErrorArr);
    }

    public static WebCaseNext$Error valueOf(String str) {
        return (WebCaseNext$Error) Enum.valueOf(WebCaseNext$Error.class, str);
    }

    public static WebCaseNext$Error[] values() {
        return (WebCaseNext$Error[]) $VALUES.clone();
    }
}
