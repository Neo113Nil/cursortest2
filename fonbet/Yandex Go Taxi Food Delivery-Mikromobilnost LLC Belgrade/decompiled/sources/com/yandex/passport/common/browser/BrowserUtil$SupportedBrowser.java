package com.yandex.passport.common.browser;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"com/yandex/passport/common/browser/BrowserUtil$SupportedBrowser", "", "Lcom/yandex/passport/common/browser/BrowserUtil$SupportedBrowser;", "", "packageName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "com/yandex/passport/common/browser/b", "YA_BRO", "YA_BRO_BETA", "YA_BRO_ALPHA", "YA_SEARCHAPP", "YA_SEARCHAPP_BETA", "YA_START", "YA_START_BETA", "CHROME", "CHROME_BETA", "CHROME_DEV", "FIREFOX", "HUAWEI", "XIAOMI", "OPERA", "SAMSUNG", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BrowserUtil$SupportedBrowser {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BrowserUtil$SupportedBrowser[] $VALUES;
    public static final BrowserUtil$SupportedBrowser CHROME;
    public static final BrowserUtil$SupportedBrowser CHROME_BETA;
    public static final BrowserUtil$SupportedBrowser CHROME_DEV;
    public static final b Companion;
    public static final BrowserUtil$SupportedBrowser FIREFOX;
    public static final BrowserUtil$SupportedBrowser HUAWEI;
    public static final BrowserUtil$SupportedBrowser OPERA;
    public static final BrowserUtil$SupportedBrowser SAMSUNG;
    public static final BrowserUtil$SupportedBrowser XIAOMI;
    public static final BrowserUtil$SupportedBrowser YA_BRO;
    public static final BrowserUtil$SupportedBrowser YA_BRO_ALPHA;
    public static final BrowserUtil$SupportedBrowser YA_BRO_BETA;
    public static final BrowserUtil$SupportedBrowser YA_SEARCHAPP;
    public static final BrowserUtil$SupportedBrowser YA_SEARCHAPP_BETA;
    public static final BrowserUtil$SupportedBrowser YA_START;
    public static final BrowserUtil$SupportedBrowser YA_START_BETA;
    private final String packageName;

    static {
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser = new BrowserUtil$SupportedBrowser("YA_BRO", 0, "com.yandex.browser");
        YA_BRO = browserUtil$SupportedBrowser;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser2 = new BrowserUtil$SupportedBrowser("YA_BRO_BETA", 1, "com.yandex.browser.beta");
        YA_BRO_BETA = browserUtil$SupportedBrowser2;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser3 = new BrowserUtil$SupportedBrowser("YA_BRO_ALPHA", 2, "com.yandex.browser.alpha");
        YA_BRO_ALPHA = browserUtil$SupportedBrowser3;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser4 = new BrowserUtil$SupportedBrowser("YA_SEARCHAPP", 3, "com.yandex.searchapp");
        YA_SEARCHAPP = browserUtil$SupportedBrowser4;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser5 = new BrowserUtil$SupportedBrowser("YA_SEARCHAPP_BETA", 4, "com.yandex.searchapp.beta");
        YA_SEARCHAPP_BETA = browserUtil$SupportedBrowser5;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser6 = new BrowserUtil$SupportedBrowser("YA_START", 5, "ru.yandex.searchplugin");
        YA_START = browserUtil$SupportedBrowser6;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser7 = new BrowserUtil$SupportedBrowser("YA_START_BETA", 6, "ru.yandex.searchplugin.beta");
        YA_START_BETA = browserUtil$SupportedBrowser7;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser8 = new BrowserUtil$SupportedBrowser("CHROME", 7, "com.android.chrome");
        CHROME = browserUtil$SupportedBrowser8;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser9 = new BrowserUtil$SupportedBrowser("CHROME_BETA", 8, "com.android.chrome.beta");
        CHROME_BETA = browserUtil$SupportedBrowser9;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser10 = new BrowserUtil$SupportedBrowser("CHROME_DEV", 9, "com.android.chrome.dev");
        CHROME_DEV = browserUtil$SupportedBrowser10;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser11 = new BrowserUtil$SupportedBrowser("FIREFOX", 10, "org.mozilla.firefox");
        FIREFOX = browserUtil$SupportedBrowser11;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser12 = new BrowserUtil$SupportedBrowser("HUAWEI", 11, "com.huawei.browser");
        HUAWEI = browserUtil$SupportedBrowser12;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser13 = new BrowserUtil$SupportedBrowser("XIAOMI", 12, "com.mi.globalbrowser");
        XIAOMI = browserUtil$SupportedBrowser13;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser14 = new BrowserUtil$SupportedBrowser("OPERA", 13, "com.opera.browser");
        OPERA = browserUtil$SupportedBrowser14;
        BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser15 = new BrowserUtil$SupportedBrowser("SAMSUNG", 14, "com.sec.android.app.sbrowser");
        SAMSUNG = browserUtil$SupportedBrowser15;
        BrowserUtil$SupportedBrowser[] browserUtil$SupportedBrowserArr = {browserUtil$SupportedBrowser, browserUtil$SupportedBrowser2, browserUtil$SupportedBrowser3, browserUtil$SupportedBrowser4, browserUtil$SupportedBrowser5, browserUtil$SupportedBrowser6, browserUtil$SupportedBrowser7, browserUtil$SupportedBrowser8, browserUtil$SupportedBrowser9, browserUtil$SupportedBrowser10, browserUtil$SupportedBrowser11, browserUtil$SupportedBrowser12, browserUtil$SupportedBrowser13, browserUtil$SupportedBrowser14, browserUtil$SupportedBrowser15};
        $VALUES = browserUtil$SupportedBrowserArr;
        $ENTRIES = kotlin.enums.a.a(browserUtil$SupportedBrowserArr);
        Companion = new b();
    }

    public BrowserUtil$SupportedBrowser(String str, int i, String str2) {
        this.packageName = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static BrowserUtil$SupportedBrowser valueOf(String str) {
        return (BrowserUtil$SupportedBrowser) Enum.valueOf(BrowserUtil$SupportedBrowser.class, str);
    }

    public static BrowserUtil$SupportedBrowser[] values() {
        return (BrowserUtil$SupportedBrowser[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }
}
