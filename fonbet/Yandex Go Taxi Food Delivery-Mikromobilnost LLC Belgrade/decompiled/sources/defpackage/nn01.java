package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.phone.PhoneSelectionScenario;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class nn01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PhoneSelectionScenario.values().length];
        try {
            iArr[PhoneSelectionScenario.CROSS_BORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PhoneSelectionScenario.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
