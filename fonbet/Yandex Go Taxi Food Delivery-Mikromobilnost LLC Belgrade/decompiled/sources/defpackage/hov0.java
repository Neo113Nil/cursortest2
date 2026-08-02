package defpackage;

import com.yandex.go.taxi.summary.api.repository.SummaryRouterType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class hov0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SummaryRouterType.values().length];
        try {
            iArr[SummaryRouterType.RIDA_SUMMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryRouterType.VERTICAL_SUMMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SummaryRouterType.COMPOSE_SUMMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SummaryRouterType.VIEW_SUMMARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
