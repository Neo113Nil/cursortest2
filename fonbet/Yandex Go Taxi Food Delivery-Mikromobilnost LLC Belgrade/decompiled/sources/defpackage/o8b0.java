package defpackage;

import com.ybsdk.feature.pfm.internal.ui.interactors.PfmAnalyticsInteractor$Companion$SourceType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class o8b0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PfmAnalyticsInteractor$Companion$SourceType.values().length];
        try {
            iArr[PfmAnalyticsInteractor$Companion$SourceType.FILTERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PfmAnalyticsInteractor$Companion$SourceType.CATEGORIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
