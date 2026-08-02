package org.opencv.android;

import android.graphics.Bitmap;
import org.opencv.core.Mat;

/* loaded from: classes8.dex */
public class Utils {
    public static void a(Bitmap bitmap, Mat mat, boolean z) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bmp == null");
        }
        if (mat == null) {
            throw new IllegalArgumentException("mat == null");
        }
        nBitmapToMat2(bitmap, mat.a, z);
    }

    public static void b(Bitmap bitmap, Mat mat) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bmp == null");
        }
        nMatToBitmap2(mat.a, bitmap, false);
    }

    private static native void nBitmapToMat2(Bitmap bitmap, long j, boolean z);

    private static native void nMatToBitmap2(long j, Bitmap bitmap, boolean z);
}
