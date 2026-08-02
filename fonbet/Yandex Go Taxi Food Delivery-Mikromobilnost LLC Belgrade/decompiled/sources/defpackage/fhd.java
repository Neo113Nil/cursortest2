package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class fhd {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SummaryAnalytics$SummaryCollapseReasonV2.values().length];
        try {
            iArr[SummaryAnalytics$SummaryCollapseReasonV2.Pull.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryAnalytics$SummaryCollapseReasonV2.ChevronDownTap.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SummaryAnalytics$SummaryCollapseReasonV2.SystemBack.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SummaryAnalytics$SummaryCollapseReasonV2.OutCardTap.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SummaryAnalytics$SummaryCollapseReasonV2.Automatic.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SummaryAnalytics$SummaryCollapseReasonV2.TopBackButtonTap.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
