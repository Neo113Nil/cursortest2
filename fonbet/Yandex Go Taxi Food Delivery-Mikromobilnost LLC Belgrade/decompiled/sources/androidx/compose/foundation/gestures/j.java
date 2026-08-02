package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragDetectionState$AwaitDown;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DragDetectionState$AwaitDown.AwaitTouchSlop.values().length];
        try {
            iArr[DragDetectionState$AwaitDown.AwaitTouchSlop.NotInitialized.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
