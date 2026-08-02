package ru.ok.gl;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class GlesHelper {
    private GlesHelper() {
    }

    public static native boolean glIsGles3Supported();

    public static native void glReadPixelsFromPbo(int i, int i2, int i3, int i4, int i5, int i6);

    public static native boolean glReadPixelsFromPboToBitmap(int i, int i2, int i3, @NonNull Bitmap bitmap);

    public static native boolean glReadPixelsToBitmap(int i, int i2, int i3, int i4, int i5, int i6, @NonNull Bitmap bitmap);
}
