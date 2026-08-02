package ru.ok.tensorflow.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.opencv.android.Utils;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import xsna.fo8;
import xsna.lxj0;
import xsna.wpk;

/* loaded from: classes9.dex */
public class ImageUtils {
    public static Mat bitmapToMat(Bitmap bitmap) {
        return bitmapToMat(bitmap, new Mat());
    }

    public static Mat bitmapToMatUint8(Bitmap bitmap, byte[] bArr) {
        Mat mat = new Mat(bitmap.getWidth(), bitmap.getHeight(), wpk.a);
        mat.r(bArr);
        return mat;
    }

    public static Matrix getTransformationMatrix(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        Matrix matrix = new Matrix();
        if (z) {
            matrix.postRotate(-90.0f, (-i) / 2.0f, (-i2) / 2.0f);
            i2 = i;
            i = i2;
        }
        float f = i3;
        float f2 = i;
        float f3 = f / f2;
        float f4 = i4;
        float f5 = i2;
        float f6 = f4 / f5;
        float f7 = f2 / 2.0f;
        float f8 = f5 / 2.0f;
        float f9 = f / 2.0f;
        float f10 = f4 / 2.0f;
        if (!z3) {
            matrix.postScale(f3, f6);
            return matrix;
        }
        float min = z2 ? Math.min(f3, f6) : Math.max(f3, f6);
        matrix.postTranslate(f9 - f7, f10 - f8);
        matrix.postScale(min, min, f9, f10);
        return matrix;
    }

    public static Matrix mat2Matrix(Mat mat) {
        if (mat == null || mat.h()) {
            throw new IllegalArgumentException();
        }
        int v = mat.v() * mat.d();
        float[] fArr = new float[v];
        int y = mat.y();
        int i = wpk.a;
        if ((y & 7) == 5) {
            mat.l(fArr);
        } else {
            double[] dArr = new double[v];
            mat.k(dArr);
            for (int i2 = 0; i2 < v; i2++) {
                fArr[i2] = (float) dArr[i2];
            }
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public static Bitmap matToBitmap(Mat mat, Bitmap.Config config) {
        Bitmap createBitmap = Bitmap.createBitmap(mat.z(), mat.o(), config);
        Utils.b(createBitmap, mat);
        return createBitmap;
    }

    public static Bitmap matToBitmapUint8(Mat mat) {
        byte[] bArr = new byte[mat.o() * mat.z()];
        mat.j(bArr);
        Bitmap createBitmap = Bitmap.createBitmap(mat.z(), mat.o(), Bitmap.Config.ALPHA_8);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        return createBitmap;
    }

    public static Mat matrix2Mat(Matrix matrix, int i) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix is null");
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        if (i == 5) {
            Mat mat = new Mat(3, 3, 5);
            mat.s(fArr);
            return mat;
        }
        if (i != 6) {
            throw new IllegalArgumentException("Unsupported CvType");
        }
        Mat mat2 = new Mat(3, 3, 6);
        double[] dArr = new double[9];
        for (int i2 = 0; i2 < 9; i2++) {
            dArr[i2] = fArr[i2];
        }
        mat2.q(0, 0, dArr);
        return mat2;
    }

    public static Mat removeAlpha(Mat mat) {
        ArrayList arrayList = new ArrayList();
        Core.h(arrayList, mat);
        arrayList.remove(3);
        Mat mat2 = new Mat();
        Core.f(arrayList, mat2);
        return mat2;
    }

    public static Mat resizeToMaxSide(Mat mat, int i) {
        Mat mat2 = new Mat();
        double max = i / Math.max(mat.z(), mat.o());
        Imgproc.b(mat, mat2, new lxj0(), max, max);
        return mat2;
    }

    public static void save(Bitmap bitmap, String str, String str2) {
        String absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
        new File(fo8.a(absolutePath, str)).mkdirs();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(absolutePath + str + str2);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Mat toGrayscale(Mat mat) {
        Mat mat2 = new Mat();
        Imgproc.a(mat, mat2);
        return mat2;
    }

    public static Mat bitmapToMat(Bitmap bitmap, Mat mat) {
        Utils.a(bitmap, mat, true);
        return removeAlpha(mat);
    }
}
