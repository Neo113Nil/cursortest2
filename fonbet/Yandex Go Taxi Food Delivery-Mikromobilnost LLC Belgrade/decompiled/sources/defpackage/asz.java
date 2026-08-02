package defpackage;

import com.airbnb.lottie.compose.LottieCancellationBehavior;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class asz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LottieCancellationBehavior.values().length];
        try {
            iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LottieCancellationBehavior.Immediately.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
