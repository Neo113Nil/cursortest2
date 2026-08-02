package defpackage;

import com.yandex.go.beginners.safety.name.domain.model.SafetyNameInputScreenState$Type;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class kwl0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SafetyNameInputScreenState$Type.values().length];
        try {
            iArr[SafetyNameInputScreenState$Type.INPUT_STATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SafetyNameInputScreenState$Type.VALIDATION_ERROR_STATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SafetyNameInputScreenState$Type.SENDING_STATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SafetyNameInputScreenState$Type.NETWORK_ERROR_STATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
