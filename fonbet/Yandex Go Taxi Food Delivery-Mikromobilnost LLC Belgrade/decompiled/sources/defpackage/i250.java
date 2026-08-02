package defpackage;

import com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner.NativeAdSlot;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class i250 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NativeAdSlot.values().length];
        try {
            iArr[NativeAdSlot.MEDIA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeAdSlot.ICON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeAdSlot.FAVICON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NativeAdSlot.FEEDBACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[NativeAdSlot.RATING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
