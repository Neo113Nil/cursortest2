package com.yandex.mobile.ads.retailmedia.type;

import com.yandex.mobile.ads.nativeads.NativeAdType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/mobile/ads/retailmedia/type/RetailMediaAdType;", "", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "PRODUCT_PROMO", "CONTENT", "APP_INSTALL", DefaultErrorCategoryProvider.MEDIA, "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RetailMediaAdType {
    public static final RetailMediaAdType APP_INSTALL;
    public static final RetailMediaAdType CONTENT;
    public static final RetailMediaAdType MEDIA;
    public static final RetailMediaAdType PRODUCT_PROMO;
    private static final /* synthetic */ RetailMediaAdType[] c;
    private static final /* synthetic */ k4o d;

    /* renamed from: b, reason: from kotlin metadata */
    private final String value;

    static {
        RetailMediaAdType retailMediaAdType = new RetailMediaAdType(0, "PRODUCT_PROMO", "productPromo");
        PRODUCT_PROMO = retailMediaAdType;
        RetailMediaAdType retailMediaAdType2 = new RetailMediaAdType(1, "CONTENT", NativeAdType.CONTENT.getValue());
        CONTENT = retailMediaAdType2;
        RetailMediaAdType retailMediaAdType3 = new RetailMediaAdType(2, "APP_INSTALL", NativeAdType.APP_INSTALL.getValue());
        APP_INSTALL = retailMediaAdType3;
        RetailMediaAdType retailMediaAdType4 = new RetailMediaAdType(3, DefaultErrorCategoryProvider.MEDIA, NativeAdType.MEDIA.getValue());
        MEDIA = retailMediaAdType4;
        RetailMediaAdType[] retailMediaAdTypeArr = {retailMediaAdType, retailMediaAdType2, retailMediaAdType3, retailMediaAdType4};
        c = retailMediaAdTypeArr;
        d = a.a(retailMediaAdTypeArr);
    }

    private RetailMediaAdType(int i, String str, String str2) {
        this.value = str2;
    }

    public static RetailMediaAdType valueOf(String str) {
        return (RetailMediaAdType) Enum.valueOf(RetailMediaAdType.class, str);
    }

    public static RetailMediaAdType[] values() {
        return (RetailMediaAdType[]) c.clone();
    }
}
