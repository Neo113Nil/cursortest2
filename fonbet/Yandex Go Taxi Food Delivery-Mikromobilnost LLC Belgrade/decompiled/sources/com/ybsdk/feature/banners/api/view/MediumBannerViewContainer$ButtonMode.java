package com.ybsdk.feature.banners.api.view;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/banners/api/view/MediumBannerViewContainer$ButtonMode", "", "Lcom/ybsdk/feature/banners/api/view/MediumBannerViewContainer$ButtonMode;", "<init>", "(Ljava/lang/String;I)V", "GONE", "INVISIBLE", "feature-banners-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediumBannerViewContainer$ButtonMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MediumBannerViewContainer$ButtonMode[] $VALUES;
    public static final MediumBannerViewContainer$ButtonMode GONE = new MediumBannerViewContainer$ButtonMode("GONE", 0);
    public static final MediumBannerViewContainer$ButtonMode INVISIBLE = new MediumBannerViewContainer$ButtonMode("INVISIBLE", 1);

    private static final /* synthetic */ MediumBannerViewContainer$ButtonMode[] $values() {
        return new MediumBannerViewContainer$ButtonMode[]{GONE, INVISIBLE};
    }

    static {
        MediumBannerViewContainer$ButtonMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private MediumBannerViewContainer$ButtonMode(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static MediumBannerViewContainer$ButtonMode valueOf(String str) {
        return (MediumBannerViewContainer$ButtonMode) Enum.valueOf(MediumBannerViewContainer$ButtonMode.class, str);
    }

    public static MediumBannerViewContainer$ButtonMode[] values() {
        return (MediumBannerViewContainer$ButtonMode[]) $VALUES.clone();
    }
}
