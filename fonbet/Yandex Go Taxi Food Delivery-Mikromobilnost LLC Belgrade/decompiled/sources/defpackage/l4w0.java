package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Details$State;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class l4w0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LogisticsOrderTracking$Details$State.values().length];
        try {
            iArr[LogisticsOrderTracking$Details$State.Expanded.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogisticsOrderTracking$Details$State.Anchored.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LogisticsOrderTracking$Details$State.Collapsed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
