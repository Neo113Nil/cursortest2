package com.yandex.urbanads;

import defpackage.af21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.z121;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/urbanads/UrbanAdsCreativeParams$Format", "", "Lcom/yandex/urbanads/UrbanAdsCreativeParams$Format;", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "af21", "HERO", "FEED", "POPUP", "STREAMER", "urbanads-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UrbanAdsCreativeParams$Format {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UrbanAdsCreativeParams$Format[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final af21 Companion;
    public static final UrbanAdsCreativeParams$Format FEED;
    public static final UrbanAdsCreativeParams$Format HERO;
    public static final UrbanAdsCreativeParams$Format POPUP;
    public static final UrbanAdsCreativeParams$Format STREAMER;
    private final String value;

    static {
        UrbanAdsCreativeParams$Format urbanAdsCreativeParams$Format = new UrbanAdsCreativeParams$Format("HERO", 0, "hero");
        HERO = urbanAdsCreativeParams$Format;
        UrbanAdsCreativeParams$Format urbanAdsCreativeParams$Format2 = new UrbanAdsCreativeParams$Format("FEED", 1, "feed");
        FEED = urbanAdsCreativeParams$Format2;
        UrbanAdsCreativeParams$Format urbanAdsCreativeParams$Format3 = new UrbanAdsCreativeParams$Format("POPUP", 2, "popup");
        POPUP = urbanAdsCreativeParams$Format3;
        UrbanAdsCreativeParams$Format urbanAdsCreativeParams$Format4 = new UrbanAdsCreativeParams$Format("STREAMER", 3, "streamer");
        STREAMER = urbanAdsCreativeParams$Format4;
        UrbanAdsCreativeParams$Format[] urbanAdsCreativeParams$FormatArr = {urbanAdsCreativeParams$Format, urbanAdsCreativeParams$Format2, urbanAdsCreativeParams$Format3, urbanAdsCreativeParams$Format4};
        $VALUES = urbanAdsCreativeParams$FormatArr;
        $ENTRIES = a.a(urbanAdsCreativeParams$FormatArr);
        Companion = new af21();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z121(17));
    }

    public UrbanAdsCreativeParams$Format(String str, int i, String str2) {
        this.value = str2;
    }

    public static UrbanAdsCreativeParams$Format valueOf(String str) {
        return (UrbanAdsCreativeParams$Format) Enum.valueOf(UrbanAdsCreativeParams$Format.class, str);
    }

    public static UrbanAdsCreativeParams$Format[] values() {
        return (UrbanAdsCreativeParams$Format[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
