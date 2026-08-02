package com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner;

import defpackage.d250;
import defpackage.k4o;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/ads/mobile_ads_sdk/presentation/divkit/native_banner/NativeAdSlot;", "", "", "customType", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "role", "c", "Companion", "d250", "TITLE", "DOMAIN", "WARNING", "SPONSORED", "BODY", "PRICE", "AGE", "REVIEW_COUNT", "FEEDBACK", "CALL_TO_ACTION", "ICON", "FAVICON", DefaultErrorCategoryProvider.MEDIA, "RATING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NativeAdSlot {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NativeAdSlot[] $VALUES;
    public static final NativeAdSlot AGE;
    public static final NativeAdSlot BODY;
    public static final NativeAdSlot CALL_TO_ACTION;
    public static final d250 Companion;
    public static final NativeAdSlot DOMAIN;
    public static final NativeAdSlot FAVICON;
    public static final NativeAdSlot FEEDBACK;
    public static final NativeAdSlot ICON;
    public static final NativeAdSlot MEDIA;
    public static final NativeAdSlot PRICE;
    public static final NativeAdSlot RATING;
    public static final NativeAdSlot REVIEW_COUNT;
    public static final NativeAdSlot SPONSORED;
    public static final NativeAdSlot TITLE;
    public static final NativeAdSlot WARNING;
    private final String customType;
    private final String role;

    static {
        NativeAdSlot nativeAdSlot = new NativeAdSlot("TITLE", 0, "yx_native_title", "title_label");
        TITLE = nativeAdSlot;
        NativeAdSlot nativeAdSlot2 = new NativeAdSlot("DOMAIN", 1, "yx_native_domain", "domain_label");
        DOMAIN = nativeAdSlot2;
        NativeAdSlot nativeAdSlot3 = new NativeAdSlot("WARNING", 2, "yx_native_warning", "warning_label");
        WARNING = nativeAdSlot3;
        NativeAdSlot nativeAdSlot4 = new NativeAdSlot("SPONSORED", 3, "yx_native_sponsored", "sponsored_label");
        SPONSORED = nativeAdSlot4;
        NativeAdSlot nativeAdSlot5 = new NativeAdSlot("BODY", 4, "yx_native_body", "body_label");
        BODY = nativeAdSlot5;
        NativeAdSlot nativeAdSlot6 = new NativeAdSlot("PRICE", 5, "yx_native_price", "price_label");
        PRICE = nativeAdSlot6;
        NativeAdSlot nativeAdSlot7 = new NativeAdSlot("AGE", 6, "yx_native_age", "age_label");
        AGE = nativeAdSlot7;
        NativeAdSlot nativeAdSlot8 = new NativeAdSlot("REVIEW_COUNT", 7, "yx_native_review_count", "review_count_label");
        REVIEW_COUNT = nativeAdSlot8;
        NativeAdSlot nativeAdSlot9 = new NativeAdSlot("FEEDBACK", 8, "yx_native_feedback", "feedback_button");
        FEEDBACK = nativeAdSlot9;
        NativeAdSlot nativeAdSlot10 = new NativeAdSlot("CALL_TO_ACTION", 9, "yx_native_cta", "call_to_action_button");
        CALL_TO_ACTION = nativeAdSlot10;
        NativeAdSlot nativeAdSlot11 = new NativeAdSlot("ICON", 10, "yx_native_icon", "icon_image_view");
        ICON = nativeAdSlot11;
        NativeAdSlot nativeAdSlot12 = new NativeAdSlot("FAVICON", 11, "yx_native_favicon", "favicon_image_view");
        FAVICON = nativeAdSlot12;
        NativeAdSlot nativeAdSlot13 = new NativeAdSlot(DefaultErrorCategoryProvider.MEDIA, 12, "yx_native_media", "media_view");
        MEDIA = nativeAdSlot13;
        NativeAdSlot nativeAdSlot14 = new NativeAdSlot("RATING", 13, "yx_native_rating", "rating_view");
        RATING = nativeAdSlot14;
        NativeAdSlot[] nativeAdSlotArr = {nativeAdSlot, nativeAdSlot2, nativeAdSlot3, nativeAdSlot4, nativeAdSlot5, nativeAdSlot6, nativeAdSlot7, nativeAdSlot8, nativeAdSlot9, nativeAdSlot10, nativeAdSlot11, nativeAdSlot12, nativeAdSlot13, nativeAdSlot14};
        $VALUES = nativeAdSlotArr;
        $ENTRIES = kotlin.enums.a.a(nativeAdSlotArr);
        Companion = new d250();
    }

    public NativeAdSlot(String str, int i, String str2, String str3) {
        this.customType = str2;
        this.role = str3;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static NativeAdSlot valueOf(String str) {
        return (NativeAdSlot) Enum.valueOf(NativeAdSlot.class, str);
    }

    public static NativeAdSlot[] values() {
        return (NativeAdSlot[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCustomType() {
        return this.customType;
    }

    /* renamed from: c, reason: from getter */
    public final String getRole() {
        return this.role;
    }
}
