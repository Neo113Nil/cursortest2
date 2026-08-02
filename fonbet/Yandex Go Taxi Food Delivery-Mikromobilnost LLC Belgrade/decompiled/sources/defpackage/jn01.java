package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.phone.PhonePlaceholder;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.PhoneSelectionScenario;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class jn01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

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
        int[] iArr2 = new int[PhonePlaceholder.values().length];
        try {
            iArr2[PhonePlaceholder.PHONE_OR_CONTACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PhonePlaceholder.PHONE_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
