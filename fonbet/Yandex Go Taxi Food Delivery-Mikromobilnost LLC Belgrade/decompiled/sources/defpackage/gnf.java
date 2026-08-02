package defpackage;

import ru.rt.ebs.cryptosdk.presentation.customView.ProgressBarType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class gnf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProgressBarType.values().length];
        try {
            iArr[ProgressBarType.PROCESSING_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProgressBarType.PROCESSING_WIDGET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
