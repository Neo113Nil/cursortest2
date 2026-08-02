package defpackage;

import ru.yandex.logistics.care.camera.di.Config$CameraLens;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class phb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Config$CameraLens.values().length];
        try {
            iArr[Config$CameraLens.Front.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Config$CameraLens.Back.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
