package defpackage;

import com.yandex.go.address.search.common.analytics.SuggestionsAnalytics$Type;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class lbv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuggestionsAnalytics$Type.values().length];
        try {
            iArr[SuggestionsAnalytics$Type.DEFAULT_SUGGEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuggestionsAnalytics$Type.SKIP_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuggestionsAnalytics$Type.SUGGEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
