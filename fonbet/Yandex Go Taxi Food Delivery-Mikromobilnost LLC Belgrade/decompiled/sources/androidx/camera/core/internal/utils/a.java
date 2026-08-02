package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import defpackage.hlo;
import defpackage.idv;
import defpackage.ilo;
import defpackage.jdv;
import defpackage.kbs;
import defpackage.llo;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wlo;
import defpackage.ylo;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes10.dex */
public abstract class a {
    public static Bitmap a(jdv jdvVar) {
        int format = jdvVar.getFormat();
        if (format == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(jdvVar.getWidth(), jdvVar.getHeight(), Bitmap.Config.ARGB_8888);
            jdvVar.i0()[0].h().rewind();
            ImageProcessingUtil.f(createBitmap, jdvVar.i0()[0].h(), jdvVar.i0()[0].a());
            return createBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.c(jdvVar);
        }
        if (format != 256 && format != 4101) {
            kbs.i("Incorrect image format of the input image proxy: ", jdvVar.getFormat(), ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
            return null;
        }
        if (!c(jdvVar.getFormat())) {
            ny61.e(jdvVar.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ByteBuffer h = jdvVar.i0()[0].h();
        int capacity = h.capacity();
        byte[] bArr = new byte[capacity];
        h.rewind();
        h.get(bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity, null);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        w511.x("Decode jpeg byte array failed");
        return null;
    }

    public static Rational b(int i, Rational rational) {
        return (i == 90 || i == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static boolean c(int i) {
        return i == 256 || i == 4101;
    }

    public static byte[] d(jdv jdvVar, Rect rect, int i, int i2) {
        if (jdvVar.getFormat() != 35) {
            ny61.e(jdvVar.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        idv idvVar = jdvVar.i0()[0];
        idv idvVar2 = jdvVar.i0()[1];
        int i3 = 2;
        idv idvVar3 = jdvVar.i0()[2];
        ByteBuffer h = idvVar.h();
        ByteBuffer h2 = idvVar2.h();
        ByteBuffer h3 = idvVar3.h();
        h.rewind();
        h2.rewind();
        h3.rewind();
        int remaining = h.remaining();
        byte[] bArr = new byte[((jdvVar.getHeight() * jdvVar.getWidth()) / 2) + remaining];
        int i4 = 0;
        for (int i5 = 0; i5 < jdvVar.getHeight(); i5++) {
            h.get(bArr, i4, jdvVar.getWidth());
            i4 += jdvVar.getWidth();
            h.position(Math.min(remaining, idvVar.a() + (h.position() - jdvVar.getWidth())));
        }
        int height = jdvVar.getHeight() / 2;
        int width = jdvVar.getWidth() / 2;
        int a = idvVar3.a();
        int a2 = idvVar2.a();
        int b = idvVar3.b();
        int b2 = idvVar2.b();
        byte[] bArr2 = new byte[a];
        byte[] bArr3 = new byte[a2];
        int i6 = 0;
        while (i6 < height) {
            int i7 = i3;
            h3.get(bArr2, 0, Math.min(a, h3.remaining()));
            h2.get(bArr3, 0, Math.min(a2, h2.remaining()));
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < width; i10++) {
                int i11 = i4 + 1;
                bArr[i4] = bArr2[i8];
                i4 += 2;
                bArr[i11] = bArr3[i9];
                i8 += b;
                i9 += b2;
            }
            i6++;
            i3 = i7;
        }
        int i12 = i3;
        YuvImage yuvImage = new YuvImage(bArr, 17, jdvVar.getWidth(), jdvVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ylo[] yloVarArr = llo.c;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ilo iloVar = new ilo();
        String valueOf = String.valueOf(1);
        ArrayList arrayList = iloVar.a;
        iloVar.c("Orientation", valueOf, arrayList);
        iloVar.c("XResolution", "72/1", arrayList);
        iloVar.c("YResolution", "72/1", arrayList);
        iloVar.c("ResolutionUnit", String.valueOf(i12), arrayList);
        iloVar.c("YCbCrPositioning", String.valueOf(1), arrayList);
        iloVar.c("Make", Build.MANUFACTURER, arrayList);
        iloVar.c("Model", Build.MODEL, arrayList);
        if (jdvVar.G0() != null) {
            jdvVar.G0().a(iloVar);
        }
        iloVar.f(i2);
        iloVar.c("ImageWidth", String.valueOf(jdvVar.getWidth()), arrayList);
        iloVar.c("ImageLength", String.valueOf(jdvVar.getHeight()), arrayList);
        ArrayList list = Collections.list(new hlo(iloVar));
        if (!((Map) list.get(1)).isEmpty()) {
            iloVar.b("ExposureProgram", String.valueOf(0), list);
            iloVar.b("ExifVersion", "0230", list);
            iloVar.b("ComponentsConfiguration", llo.f, list);
            iloVar.b("MeteringMode", String.valueOf(0), list);
            iloVar.b("LightSource", String.valueOf(0), list);
            iloVar.b("FlashpixVersion", "0100", list);
            iloVar.b("FocalPlaneResolutionUnit", String.valueOf(i12), list);
            iloVar.b("FileSource", String.valueOf(3), list);
            iloVar.b("SceneType", String.valueOf(1), list);
            iloVar.b("CustomRendered", String.valueOf(0), list);
            iloVar.b("SceneCaptureType", String.valueOf(0), list);
            iloVar.b("Contrast", String.valueOf(0), list);
            iloVar.b("Saturation", String.valueOf(0), list);
            iloVar.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i12)).isEmpty()) {
            iloVar.b("GPSVersionID", "2300", list);
            iloVar.b("GPSSpeedRef", CA20Status.STATUS_REQUEST_K, list);
            iloVar.b("GPSTrackRef", "T", list);
            iloVar.b("GPSImgDirectionRef", "T", list);
            iloVar.b("GPSDestBearingRef", "T", list);
            iloVar.b("GPSDestDistanceRef", CA20Status.STATUS_REQUEST_K, list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, jdvVar.getWidth(), jdvVar.getHeight()) : rect, i, new wlo(byteArrayOutputStream, new llo(iloVar.b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        final ImageUtil$CodecFailedException.FailureType failureType = ImageUtil$CodecFailedException.FailureType.ENCODE_FAILED;
        throw new Exception(failureType) { // from class: androidx.camera.core.internal.utils.ImageUtil$CodecFailedException
            private final FailureType mFailureType;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class FailureType {
                private static final /* synthetic */ FailureType[] $VALUES;
                public static final FailureType DECODE_FAILED;
                public static final FailureType ENCODE_FAILED;
                public static final FailureType UNKNOWN;

                static {
                    FailureType failureType = new FailureType("ENCODE_FAILED", 0);
                    ENCODE_FAILED = failureType;
                    FailureType failureType2 = new FailureType("DECODE_FAILED", 1);
                    DECODE_FAILED = failureType2;
                    FailureType failureType3 = new FailureType("UNKNOWN", 2);
                    UNKNOWN = failureType3;
                    $VALUES = new FailureType[]{failureType, failureType2, failureType3};
                }

                public static FailureType valueOf(String str) {
                    return (FailureType) Enum.valueOf(FailureType.class, str);
                }

                public static FailureType[] values() {
                    return (FailureType[]) $VALUES.clone();
                }
            }

            {
                super("YuvImage failed to encode jpeg.");
                this.mFailureType = failureType;
            }
        };
    }
}
