package defpackage;

import com.ybsdk.feature.pfm.internal.ui.viewitems.PfmFilterViewItem$Content$Mode;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class oab0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PfmFilterViewItem$Content$Mode.values().length];
        try {
            iArr[PfmFilterViewItem$Content$Mode.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PfmFilterViewItem$Content$Mode.SELECTABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PfmFilterViewItem$Content$Mode.RESETTABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
