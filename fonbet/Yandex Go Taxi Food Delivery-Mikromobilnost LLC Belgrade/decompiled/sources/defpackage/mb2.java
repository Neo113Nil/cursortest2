package defpackage;

import androidx.compose.ui.graphics.Path$Direction;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class mb2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Path$Direction.values().length];
        try {
            iArr[Path$Direction.CounterClockwise.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Path$Direction.Clockwise.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
