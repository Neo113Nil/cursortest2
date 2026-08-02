package defpackage;

import com.yandex.go.routestats.PrefetchRouteStatsMode;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class obl0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PrefetchRouteStatsMode.values().length];
        try {
            iArr[PrefetchRouteStatsMode.ONLY_FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PrefetchRouteStatsMode.FIRST_TWO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PrefetchRouteStatsMode.ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PrefetchRouteStatsMode.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
