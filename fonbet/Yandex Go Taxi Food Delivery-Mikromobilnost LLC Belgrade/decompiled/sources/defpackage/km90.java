package defpackage;

import com.ybsdk.feature.passes.widget.api.entity.PassesWidgetScreenType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class km90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassesWidgetScreenType.values().length];
        try {
            iArr[PassesWidgetScreenType.QR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassesWidgetScreenType.NFC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
