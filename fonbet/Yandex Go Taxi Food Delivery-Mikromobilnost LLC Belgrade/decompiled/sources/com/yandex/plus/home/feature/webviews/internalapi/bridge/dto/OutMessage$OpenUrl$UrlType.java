package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iu80;
import defpackage.k4o;
import defpackage.yi80;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenUrl$UrlType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenUrl$UrlType;", "Companion", "iu80", "DEEPLINK", "WEBLINK", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OutMessage$OpenUrl$UrlType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OutMessage$OpenUrl$UrlType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final iu80 Companion;
    public static final OutMessage$OpenUrl$UrlType DEEPLINK;
    public static final OutMessage$OpenUrl$UrlType WEBLINK;

    static {
        OutMessage$OpenUrl$UrlType outMessage$OpenUrl$UrlType = new OutMessage$OpenUrl$UrlType("DEEPLINK", 0);
        DEEPLINK = outMessage$OpenUrl$UrlType;
        OutMessage$OpenUrl$UrlType outMessage$OpenUrl$UrlType2 = new OutMessage$OpenUrl$UrlType("WEBLINK", 1);
        WEBLINK = outMessage$OpenUrl$UrlType2;
        OutMessage$OpenUrl$UrlType[] outMessage$OpenUrl$UrlTypeArr = {outMessage$OpenUrl$UrlType, outMessage$OpenUrl$UrlType2};
        $VALUES = outMessage$OpenUrl$UrlTypeArr;
        $ENTRIES = a.a(outMessage$OpenUrl$UrlTypeArr);
        Companion = new iu80();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(25));
    }

    public static OutMessage$OpenUrl$UrlType valueOf(String str) {
        return (OutMessage$OpenUrl$UrlType) Enum.valueOf(OutMessage$OpenUrl$UrlType.class, str);
    }

    public static OutMessage$OpenUrl$UrlType[] values() {
        return (OutMessage$OpenUrl$UrlType[]) $VALUES.clone();
    }
}
