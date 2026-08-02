package defpackage;

import com.ybsdk.widgets.common.shimmer.ShimmerArgs$GradientShape;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class gur0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ShimmerArgs$GradientShape.values().length];
        try {
            iArr[ShimmerArgs$GradientShape.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShimmerArgs$GradientShape.TILTED_OVAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
