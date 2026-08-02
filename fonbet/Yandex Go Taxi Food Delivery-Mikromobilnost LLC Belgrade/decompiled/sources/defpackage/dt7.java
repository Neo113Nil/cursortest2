package defpackage;

import androidx.camera.core.CameraState;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class dt7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CameraState.Type.values().length];
        a = iArr;
        try {
            iArr[CameraState.Type.PENDING_OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[CameraState.Type.OPENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[CameraState.Type.OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[CameraState.Type.CLOSING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[CameraState.Type.CLOSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
