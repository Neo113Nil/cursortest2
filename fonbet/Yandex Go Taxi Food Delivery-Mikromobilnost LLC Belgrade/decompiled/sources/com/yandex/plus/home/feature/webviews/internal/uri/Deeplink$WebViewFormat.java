package com.yandex.plus.home.feature.webviews.internal.uri;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/home/feature/webviews/internal/uri/Deeplink$WebViewFormat", "", "Lcom/yandex/plus/home/feature/webviews/internal/uri/Deeplink$WebViewFormat;", "CARD", "FULL", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Deeplink$WebViewFormat {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Deeplink$WebViewFormat[] $VALUES;
    public static final Deeplink$WebViewFormat CARD;
    public static final Deeplink$WebViewFormat FULL;

    static {
        Deeplink$WebViewFormat deeplink$WebViewFormat = new Deeplink$WebViewFormat("CARD", 0);
        CARD = deeplink$WebViewFormat;
        Deeplink$WebViewFormat deeplink$WebViewFormat2 = new Deeplink$WebViewFormat("FULL", 1);
        FULL = deeplink$WebViewFormat2;
        Deeplink$WebViewFormat[] deeplink$WebViewFormatArr = {deeplink$WebViewFormat, deeplink$WebViewFormat2};
        $VALUES = deeplink$WebViewFormatArr;
        $ENTRIES = kotlin.enums.a.a(deeplink$WebViewFormatArr);
    }

    public static Deeplink$WebViewFormat valueOf(String str) {
        return (Deeplink$WebViewFormat) Enum.valueOf(Deeplink$WebViewFormat.class, str);
    }

    public static Deeplink$WebViewFormat[] values() {
        return (Deeplink$WebViewFormat[]) $VALUES.clone();
    }
}
