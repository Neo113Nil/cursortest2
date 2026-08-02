package defpackage;

import com.yandex.go.walking.navigation.impl.guidance.interactor.FocusAction;
import com.yandex.mapkit.navigation.guidance_camera.CameraMode;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class q141 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FocusAction.values().length];
        try {
            iArr[FocusAction.FOCUS_ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FocusAction.FOCUS_USER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[CameraMode.values().length];
        try {
            iArr2[CameraMode.FREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CameraMode.OVERVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CameraMode.FOLLOWING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CameraMode.INDOOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
