package defpackage;

import com.ybsdk.core.stories.CloseButtonVisibility;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class amu0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CloseButtonVisibility.values().length];
        try {
            iArr[CloseButtonVisibility.VISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CloseButtonVisibility.INVISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CloseButtonVisibility.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
