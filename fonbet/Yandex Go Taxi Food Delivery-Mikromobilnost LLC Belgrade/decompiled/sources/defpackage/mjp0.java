package defpackage;

import com.ybsdk.feature.educations.internal.ui.ScrollSnapPreference;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mjp0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScrollSnapPreference.values().length];
        try {
            iArr[ScrollSnapPreference.SNAP_TO_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScrollSnapPreference.SNAP_TO_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
