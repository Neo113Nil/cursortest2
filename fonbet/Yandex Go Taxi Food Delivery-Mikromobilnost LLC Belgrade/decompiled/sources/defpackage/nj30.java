package defpackage;

import ru.yandex.taxi.masstransit.experiment.ExperimentAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class nj30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ExperimentAction.values().length];
        try {
            iArr[ExperimentAction.SHARE_ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExperimentAction.VIEW_ON_MAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
