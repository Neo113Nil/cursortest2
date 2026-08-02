package defpackage;

import androidx.compose.ui.node.Invalidation;

/* loaded from: classes.dex */
public abstract /* synthetic */ class kxi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Invalidation.values().length];
        try {
            iArr[Invalidation.LookaheadMeasurement.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Invalidation.LookaheadPlacement.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Invalidation.Measurement.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Invalidation.Placement.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
