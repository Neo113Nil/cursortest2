package com.yandex.passport.internal.report.reporters;

import defpackage.k4o;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/passport/internal/report/reporters/PassportInitReporter$Companion$UrlSource", "", "Lcom/yandex/passport/internal/report/reporters/PassportInitReporter$Companion$UrlSource;", "", "source", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OVERRIDE_URL_BY_LOCATION", "OVERRIDE_URL", DefaultErrorCategoryProvider.CONFIG, "DEFAULT_CONFIG", "DEFAULT_URL", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassportInitReporter$Companion$UrlSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportInitReporter$Companion$UrlSource[] $VALUES;
    public static final PassportInitReporter$Companion$UrlSource CONFIG;
    public static final PassportInitReporter$Companion$UrlSource DEFAULT_CONFIG;
    public static final PassportInitReporter$Companion$UrlSource DEFAULT_URL;
    public static final PassportInitReporter$Companion$UrlSource OVERRIDE_URL;
    public static final PassportInitReporter$Companion$UrlSource OVERRIDE_URL_BY_LOCATION;
    private final String source;

    static {
        PassportInitReporter$Companion$UrlSource passportInitReporter$Companion$UrlSource = new PassportInitReporter$Companion$UrlSource("OVERRIDE_URL_BY_LOCATION", 0, "override_url_by_location");
        OVERRIDE_URL_BY_LOCATION = passportInitReporter$Companion$UrlSource;
        PassportInitReporter$Companion$UrlSource passportInitReporter$Companion$UrlSource2 = new PassportInitReporter$Companion$UrlSource("OVERRIDE_URL", 1, "override_url");
        OVERRIDE_URL = passportInitReporter$Companion$UrlSource2;
        PassportInitReporter$Companion$UrlSource passportInitReporter$Companion$UrlSource3 = new PassportInitReporter$Companion$UrlSource(DefaultErrorCategoryProvider.CONFIG, 2, ConfigConstants.CONFIG);
        CONFIG = passportInitReporter$Companion$UrlSource3;
        PassportInitReporter$Companion$UrlSource passportInitReporter$Companion$UrlSource4 = new PassportInitReporter$Companion$UrlSource("DEFAULT_CONFIG", 3, "default_config");
        DEFAULT_CONFIG = passportInitReporter$Companion$UrlSource4;
        PassportInitReporter$Companion$UrlSource passportInitReporter$Companion$UrlSource5 = new PassportInitReporter$Companion$UrlSource("DEFAULT_URL", 4, "default_url");
        DEFAULT_URL = passportInitReporter$Companion$UrlSource5;
        PassportInitReporter$Companion$UrlSource[] passportInitReporter$Companion$UrlSourceArr = {passportInitReporter$Companion$UrlSource, passportInitReporter$Companion$UrlSource2, passportInitReporter$Companion$UrlSource3, passportInitReporter$Companion$UrlSource4, passportInitReporter$Companion$UrlSource5};
        $VALUES = passportInitReporter$Companion$UrlSourceArr;
        $ENTRIES = kotlin.enums.a.a(passportInitReporter$Companion$UrlSourceArr);
    }

    public PassportInitReporter$Companion$UrlSource(String str, int i, String str2) {
        this.source = str2;
    }

    public static PassportInitReporter$Companion$UrlSource valueOf(String str) {
        return (PassportInitReporter$Companion$UrlSource) Enum.valueOf(PassportInitReporter$Companion$UrlSource.class, str);
    }

    public static PassportInitReporter$Companion$UrlSource[] values() {
        return (PassportInitReporter$Companion$UrlSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getSource() {
        return this.source;
    }
}
