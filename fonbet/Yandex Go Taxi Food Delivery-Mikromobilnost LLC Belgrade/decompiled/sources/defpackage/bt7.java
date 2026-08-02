package defpackage;

import androidx.camera.core.impl.CameraInternal$State;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class bt7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CameraInternal$State.values().length];
        a = iArr;
        try {
            iArr[CameraInternal$State.PENDING_OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[CameraInternal$State.OPENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[CameraInternal$State.OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[CameraInternal$State.CONFIGURED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[CameraInternal$State.CLOSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[CameraInternal$State.RELEASING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[CameraInternal$State.CLOSED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[CameraInternal$State.RELEASED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
