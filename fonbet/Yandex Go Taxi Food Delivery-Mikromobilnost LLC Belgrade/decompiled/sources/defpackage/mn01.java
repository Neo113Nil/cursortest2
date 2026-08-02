package defpackage;

import com.ybsdk.core.permissions.RequestPermissionResult;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.PhoneSelectionScenario;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mn01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[TransferScenario.values().length];
        try {
            iArr[TransferScenario.CROSS_BORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[PhoneSelectionScenario.values().length];
        try {
            iArr2[PhoneSelectionScenario.CROSS_BORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[PhoneSelectionScenario.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
        int[] iArr3 = new int[RequestPermissionResult.values().length];
        try {
            iArr3[RequestPermissionResult.RATIONALE_DISALLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[RequestPermissionResult.SYSTEM_DISALLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[RequestPermissionResult.RATIONALE_DISMISS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[RequestPermissionResult.SETTINGS_DISMISS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[RequestPermissionResult.ALLOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
