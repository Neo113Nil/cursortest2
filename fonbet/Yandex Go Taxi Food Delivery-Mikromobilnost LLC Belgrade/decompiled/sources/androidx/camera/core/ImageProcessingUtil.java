package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.d6z;
import defpackage.e8v;
import defpackage.edv;
import defpackage.gdv;
import defpackage.jdv;
import defpackage.mdl0;
import defpackage.ny61;
import defpackage.pdv;
import defpackage.sgb1;
import defpackage.w511;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Result {
        private static final /* synthetic */ Result[] $VALUES;
        public static final Result ERROR_CONVERSION;
        public static final Result SUCCESS;
        public static final Result UNKNOWN;

        static {
            Result result = new Result("UNKNOWN", 0);
            UNKNOWN = result;
            Result result2 = new Result("SUCCESS", 1);
            SUCCESS = result2;
            Result result3 = new Result("ERROR_CONVERSION", 2);
            ERROR_CONVERSION = result3;
            $VALUES = new Result[]{result, result2, result3};
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(jdv jdvVar) {
        if (!h(jdvVar)) {
            sgb1.d("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = jdvVar.getWidth();
        int height = jdvVar.getHeight();
        int a2 = jdvVar.i0()[0].a();
        int a3 = jdvVar.i0()[1].a();
        int a4 = jdvVar.i0()[2].a();
        int b = jdvVar.i0()[0].b();
        int b2 = jdvVar.i0()[1].b();
        if ((nativeShiftPixel(jdvVar.i0()[0].h(), a2, jdvVar.i0()[1].h(), a3, jdvVar.i0()[2].h(), a4, b, b2, width, height, b, b2, b2) != 0 ? Result.ERROR_CONVERSION : Result.SUCCESS) == Result.ERROR_CONVERSION) {
            sgb1.d("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static jdv b(mdl0 mdl0Var, byte[] bArr) {
        d6z.n(mdl0Var.h() == 256);
        bArr.getClass();
        Surface surface = mdl0Var.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            sgb1.d("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        jdv acquireLatestImage = mdl0Var.acquireLatestImage();
        if (acquireLatestImage == null) {
            sgb1.d("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return acquireLatestImage;
    }

    public static Bitmap c(jdv jdvVar) {
        if (jdvVar.getFormat() != 35) {
            ny61.g("Input image format must be YUV_420_888");
            return null;
        }
        int width = jdvVar.getWidth();
        int height = jdvVar.getHeight();
        int a2 = jdvVar.i0()[0].a();
        int a3 = jdvVar.i0()[1].a();
        int a4 = jdvVar.i0()[2].a();
        int b = jdvVar.i0()[0].b();
        int b2 = jdvVar.i0()[1].b();
        Bitmap createBitmap = Bitmap.createBitmap(jdvVar.getWidth(), jdvVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(jdvVar.i0()[0].h(), a2, jdvVar.i0()[1].h(), a3, jdvVar.i0()[2].h(), a4, b, b2, createBitmap, createBitmap.getRowBytes(), width, height) == 0) {
            return createBitmap;
        }
        w511.x("YUV to RGB conversion failed");
        return null;
    }

    public static e8v d(jdv jdvVar, pdv pdvVar, ByteBuffer byteBuffer, int i, boolean z) {
        if (!h(jdvVar)) {
            sgb1.d("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        if (!g(i)) {
            sgb1.d("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = pdvVar.getSurface();
        int width = jdvVar.getWidth();
        int height = jdvVar.getHeight();
        int a2 = jdvVar.i0()[0].a();
        int a3 = jdvVar.i0()[1].a();
        int a4 = jdvVar.i0()[2].a();
        int b = jdvVar.i0()[0].b();
        int b2 = jdvVar.i0()[1].b();
        if ((nativeConvertAndroid420ToABGR(jdvVar.i0()[0].h(), a2, jdvVar.i0()[1].h(), a3, jdvVar.i0()[2].h(), a4, b, b2, surface, byteBuffer, width, height, z ? b : 0, z ? b2 : 0, z ? b2 : 0, i) != 0 ? Result.ERROR_CONVERSION : Result.SUCCESS) == Result.ERROR_CONVERSION) {
            sgb1.d("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            sgb1.g(3, "ImageProcessingUtil");
            a++;
        }
        jdv acquireLatestImage = pdvVar.acquireLatestImage();
        if (acquireLatestImage == null) {
            sgb1.d("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        e8v e8vVar = new e8v(acquireLatestImage);
        e8vVar.a(new edv(acquireLatestImage, jdvVar, 0));
        return e8vVar;
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void f(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean g(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    public static boolean h(jdv jdvVar) {
        return jdvVar.getFormat() == 35 && jdvVar.i0().length == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e8v i(jdv jdvVar, pdv pdvVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        e8v e8vVar;
        Result result;
        if (!h(jdvVar)) {
            sgb1.d("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!g(i)) {
            sgb1.d("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        Result result2 = Result.ERROR_CONVERSION;
        if (i > 0) {
            int width = jdvVar.getWidth();
            int height = jdvVar.getHeight();
            int a2 = jdvVar.i0()[0].a();
            int a3 = jdvVar.i0()[1].a();
            int a4 = jdvVar.i0()[2].a();
            int b = jdvVar.i0()[1].b();
            Image dequeueInputImage = imageWriter.dequeueInputImage();
            if (dequeueInputImage != null) {
                e8vVar = null;
                if (nativeRotateYUV(jdvVar.i0()[0].h(), a2, jdvVar.i0()[1].h(), a3, jdvVar.i0()[2].h(), a4, b, dequeueInputImage.getPlanes()[0].getBuffer(), dequeueInputImage.getPlanes()[0].getRowStride(), dequeueInputImage.getPlanes()[0].getPixelStride(), dequeueInputImage.getPlanes()[1].getBuffer(), dequeueInputImage.getPlanes()[1].getRowStride(), dequeueInputImage.getPlanes()[1].getPixelStride(), dequeueInputImage.getPlanes()[2].getBuffer(), dequeueInputImage.getPlanes()[2].getRowStride(), dequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) == 0) {
                    imageWriter.queueInputImage(dequeueInputImage);
                    result = Result.SUCCESS;
                    if (result == result2) {
                        sgb1.d("ImageProcessingUtil", "rotate YUV failure");
                        return e8vVar;
                    }
                    jdv acquireLatestImage = pdvVar.acquireLatestImage();
                    if (acquireLatestImage == null) {
                        sgb1.d("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                        return e8vVar;
                    }
                    e8v e8vVar2 = new e8v(acquireLatestImage);
                    e8vVar2.a(new edv(acquireLatestImage, jdvVar, 1));
                    return e8vVar2;
                }
                result = result2;
                if (result == result2) {
                }
            }
        }
        e8vVar = null;
        result = result2;
        if (result == result2) {
        }
    }

    public static e8v j(jdv jdvVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
        if (!h(jdvVar)) {
            sgb1.d("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!g(i)) {
            sgb1.d("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i == 0 && jdvVar.i0().length == 3 && jdvVar.i0()[1].b() == 2 && nativeGetYUVImageVUOff(jdvVar.i0()[2].h(), jdvVar.i0()[1].h()) == -1) {
            return null;
        }
        int i2 = i % SubsamplingScaleImageView.ORIENTATION_180;
        int width = i2 == 0 ? jdvVar.getWidth() : jdvVar.getHeight();
        int height = i2 == 0 ? jdvVar.getHeight() : jdvVar.getWidth();
        ByteBuffer nativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(jdvVar.i0()[0].h(), jdvVar.i0()[0].a(), jdvVar.i0()[1].h(), jdvVar.i0()[1].a(), jdvVar.i0()[2].h(), jdvVar.i0()[2].a(), jdvVar.i0()[2].b(), byteBuffer4, width, 1, nativeNewDirectByteBuffer, width, 2, byteBuffer5, width, 2, byteBuffer, byteBuffer2, byteBuffer3, jdvVar.getWidth(), jdvVar.getHeight(), i) == 0) {
            return new e8v(new gdv(jdvVar, byteBuffer4, nativeNewDirectByteBuffer, byteBuffer5, width, height));
        }
        sgb1.d("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    public static void k(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            sgb1.d("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
