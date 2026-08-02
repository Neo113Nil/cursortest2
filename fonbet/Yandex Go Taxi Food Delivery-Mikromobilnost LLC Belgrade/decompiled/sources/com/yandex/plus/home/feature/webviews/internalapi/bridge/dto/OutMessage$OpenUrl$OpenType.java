package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.gsq0;
import defpackage.hu80;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.yi80;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenUrl$OpenType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenUrl$OpenType;", "Companion", "hu80", "IN", "OUT", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OutMessage$OpenUrl$OpenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OutMessage$OpenUrl$OpenType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final hu80 Companion;
    public static final OutMessage$OpenUrl$OpenType IN;
    public static final OutMessage$OpenUrl$OpenType OUT;

    static {
        OutMessage$OpenUrl$OpenType outMessage$OpenUrl$OpenType = new OutMessage$OpenUrl$OpenType("IN", 0);
        IN = outMessage$OpenUrl$OpenType;
        OutMessage$OpenUrl$OpenType outMessage$OpenUrl$OpenType2 = new OutMessage$OpenUrl$OpenType("OUT", 1);
        OUT = outMessage$OpenUrl$OpenType2;
        OutMessage$OpenUrl$OpenType[] outMessage$OpenUrl$OpenTypeArr = {outMessage$OpenUrl$OpenType, outMessage$OpenUrl$OpenType2};
        $VALUES = outMessage$OpenUrl$OpenTypeArr;
        $ENTRIES = a.a(outMessage$OpenUrl$OpenTypeArr);
        Companion = new hu80();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(24));
    }

    public static OutMessage$OpenUrl$OpenType valueOf(String str) {
        return (OutMessage$OpenUrl$OpenType) Enum.valueOf(OutMessage$OpenUrl$OpenType.class, str);
    }

    public static OutMessage$OpenUrl$OpenType[] values() {
        return (OutMessage$OpenUrl$OpenType[]) $VALUES.clone();
    }
}
