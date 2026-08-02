package defpackage;

import ru.yandex.taxi.intercity.IntercityToSummaryNavigationSource;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class k9w {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IntercityToSummaryNavigationSource.values().length];
        try {
            iArr[IntercityToSummaryNavigationSource.INTERCITY_DASHBOARD_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IntercityToSummaryNavigationSource.INTERCITY_DISCOVERY_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
