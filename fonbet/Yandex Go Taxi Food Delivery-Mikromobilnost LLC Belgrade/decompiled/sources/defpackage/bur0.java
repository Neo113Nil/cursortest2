package defpackage;

import com.ybsdk.widgets.common.shimmer.ShimmerArgs$CompositeMode;
import com.ybsdk.widgets.common.shimmer.ShimmerArgs$GradientShape;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class bur0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ShimmerArgs$CompositeMode.values().length];
        try {
            iArr[ShimmerArgs$CompositeMode.OVER_TRANSPARENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShimmerArgs$CompositeMode.OPAQUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ShimmerArgs$CompositeMode.CLIP_TO_ALPHA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ShimmerArgs$GradientShape.values().length];
        try {
            iArr2[ShimmerArgs$GradientShape.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ShimmerArgs$GradientShape.TILTED_OVAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
