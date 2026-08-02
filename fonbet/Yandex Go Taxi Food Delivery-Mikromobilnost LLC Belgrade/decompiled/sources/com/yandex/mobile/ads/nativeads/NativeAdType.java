package com.yandex.mobile.ads.nativeads;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdType;", "", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "CONTENT", "APP_INSTALL", DefaultErrorCategoryProvider.MEDIA, "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NativeAdType {
    public static final NativeAdType APP_INSTALL;
    public static final NativeAdType CONTENT;
    public static final NativeAdType MEDIA;
    private static final /* synthetic */ NativeAdType[] c;
    private static final /* synthetic */ k4o d;

    /* renamed from: b, reason: from kotlin metadata */
    private final String value;

    static {
        NativeAdType nativeAdType = new NativeAdType(0, "CONTENT", "content");
        CONTENT = nativeAdType;
        NativeAdType nativeAdType2 = new NativeAdType(1, "APP_INSTALL", "app");
        APP_INSTALL = nativeAdType2;
        NativeAdType nativeAdType3 = new NativeAdType(2, DefaultErrorCategoryProvider.MEDIA, "media");
        MEDIA = nativeAdType3;
        NativeAdType[] nativeAdTypeArr = {nativeAdType, nativeAdType2, nativeAdType3};
        c = nativeAdTypeArr;
        d = a.a(nativeAdTypeArr);
    }

    private NativeAdType(int i, String str, String str2) {
        this.value = str2;
    }

    public static NativeAdType valueOf(String str) {
        return (NativeAdType) Enum.valueOf(NativeAdType.class, str);
    }

    public static NativeAdType[] values() {
        return (NativeAdType[]) c.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
