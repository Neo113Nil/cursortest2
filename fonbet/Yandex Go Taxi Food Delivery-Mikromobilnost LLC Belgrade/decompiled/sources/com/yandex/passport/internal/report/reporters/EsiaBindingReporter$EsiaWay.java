package com.yandex.passport.internal.report.reporters;

import defpackage.k4o;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/passport/internal/report/reporters/EsiaBindingReporter$EsiaWay", "", "Lcom/yandex/passport/internal/report/reporters/EsiaBindingReporter$EsiaWay;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "WEB_VIEW", "APPLICATION", "BROWSER", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EsiaBindingReporter$EsiaWay {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EsiaBindingReporter$EsiaWay[] $VALUES;
    public static final EsiaBindingReporter$EsiaWay APPLICATION;
    public static final EsiaBindingReporter$EsiaWay BROWSER;
    public static final EsiaBindingReporter$EsiaWay WEB_VIEW;
    private final String value;

    static {
        EsiaBindingReporter$EsiaWay esiaBindingReporter$EsiaWay = new EsiaBindingReporter$EsiaWay("WEB_VIEW", 0, "webview");
        WEB_VIEW = esiaBindingReporter$EsiaWay;
        EsiaBindingReporter$EsiaWay esiaBindingReporter$EsiaWay2 = new EsiaBindingReporter$EsiaWay("APPLICATION", 1, ClidProvider.APPLICATION);
        APPLICATION = esiaBindingReporter$EsiaWay2;
        EsiaBindingReporter$EsiaWay esiaBindingReporter$EsiaWay3 = new EsiaBindingReporter$EsiaWay("BROWSER", 2, "browser");
        BROWSER = esiaBindingReporter$EsiaWay3;
        EsiaBindingReporter$EsiaWay[] esiaBindingReporter$EsiaWayArr = {esiaBindingReporter$EsiaWay, esiaBindingReporter$EsiaWay2, esiaBindingReporter$EsiaWay3};
        $VALUES = esiaBindingReporter$EsiaWayArr;
        $ENTRIES = kotlin.enums.a.a(esiaBindingReporter$EsiaWayArr);
    }

    public EsiaBindingReporter$EsiaWay(String str, int i, String str2) {
        this.value = str2;
    }

    public static EsiaBindingReporter$EsiaWay valueOf(String str) {
        return (EsiaBindingReporter$EsiaWay) Enum.valueOf(EsiaBindingReporter$EsiaWay.class, str);
    }

    public static EsiaBindingReporter$EsiaWay[] values() {
        return (EsiaBindingReporter$EsiaWay[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
