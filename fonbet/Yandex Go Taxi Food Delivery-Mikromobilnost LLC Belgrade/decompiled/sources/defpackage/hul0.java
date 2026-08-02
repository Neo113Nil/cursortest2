package defpackage;

import com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorViewUiState$ButtonUiState$Type;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class hul0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SafetyCenterWebErrorViewUiState$ButtonUiState$Type.values().length];
        try {
            iArr[SafetyCenterWebErrorViewUiState$ButtonUiState$Type.CALL_EMERGENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SafetyCenterWebErrorViewUiState$ButtonUiState$Type.SUPPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SafetyCenterWebErrorViewUiState$ButtonUiState$Type.SHARE_URL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
