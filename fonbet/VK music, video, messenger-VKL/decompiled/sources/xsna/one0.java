package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.datamatrix.DataMatrixReader;
import com.google.zxing.qrcode.QRCodeReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;

/* compiled from: QrDecoder.kt */
/* loaded from: classes5.dex */
public final class one0 {
    public final doe0 a;
    public final Context b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final Object g;
    public volatile fy2 h;

    public one0(Context context, doe0 doe0Var) {
        this.a = doe0Var;
        this.b = context != null ? context.getApplicationContext() : null;
        this.c = new bpn0(new w2a0(5));
        this.d = new bpn0(new ek(26));
        this.e = new bpn0(new vo50(12));
        this.f = new bpn0(new vt30(this, 26));
        this.g = new Object();
    }

    public static PlanarYUVLuminanceSource f(int i, int i2, byte[] bArr) {
        int b = an10.b(Math.min(i, i2) * 0.7f);
        int b2 = an10.b(Math.min(i, i2) * 0.7f);
        int b3 = an10.b(Math.min(i, i2) * 0.7f);
        Point point = new Point((i - b3) / 2, (i2 - b3) / 2);
        return new PlanarYUVLuminanceSource(bArr, i, i2, point.x, point.y, b, b2, false);
    }

    public final Result a(LuminanceSource luminanceSource) {
        Result result;
        Result result2;
        Result decode;
        bpn0 bpn0Var = this.d;
        bpn0 bpn0Var2 = this.c;
        bpn0 bpn0Var3 = this.e;
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
        Result result3 = null;
        try {
            result = ((QRCodeReader) bpn0Var3.getValue()).decode(binaryBitmap, (EnumMap) bpn0Var2.getValue());
        } catch (Throwable th) {
            xgx0.a.getClass();
            xgx0.d(th);
            try {
                result = ((DataMatrixReader) bpn0Var.getValue()).decode(binaryBitmap);
            } catch (Throwable th2) {
                xgx0.a.getClass();
                xgx0.d(th2);
                result = null;
            }
        }
        if (result != null) {
            return result;
        }
        Result b = b(luminanceSource);
        if (b != null) {
            return b;
        }
        BinaryBitmap binaryBitmap2 = new BinaryBitmap(new GlobalHistogramBinarizer(luminanceSource));
        try {
            decode = ((QRCodeReader) bpn0Var3.getValue()).decode(binaryBitmap2, (EnumMap) bpn0Var2.getValue());
        } catch (Throwable th3) {
            xgx0.a.getClass();
            xgx0.d(th3);
            try {
                decode = ((DataMatrixReader) bpn0Var.getValue()).decode(binaryBitmap2);
            } catch (Throwable unused) {
                xgx0.a.getClass();
                xgx0.d(th3);
                result2 = null;
            }
        }
        result2 = decode;
        if (result2 != null) {
            return result2;
        }
        try {
            result3 = ((MultiFormatReader) this.f.getValue()).decodeWithState(new BinaryBitmap(new GlobalHistogramBinarizer(luminanceSource)));
        } catch (Throwable th4) {
            xgx0.a.getClass();
            xgx0.d(th4);
        }
        return result3;
    }

    public final Result b(LuminanceSource luminanceSource) {
        bpn0 bpn0Var = this.f;
        try {
            Result decodeWithState = ((MultiFormatReader) bpn0Var.getValue()).decodeWithState(new BinaryBitmap(new HybridBinarizer(luminanceSource)));
            ((MultiFormatReader) bpn0Var.getValue()).reset();
            return decodeWithState;
        } catch (Throwable th) {
            xgx0.a.getClass();
            xgx0.d(th);
            return null;
        }
    }

    public final nne0 c(Image image, int i, int i2, int i3) {
        y1x y1xVar;
        int limit;
        ArrayList a;
        Bitmap createBitmap;
        if (image == null) {
            return null;
        }
        fy2 e = e();
        if (e != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            y1x.b(i3);
            exc0.a("Only JPEG and YUV_420_888 are supported now", image.getFormat() == 256 || image.getFormat() == 35);
            Image.Plane[] planes = image.getPlanes();
            if (image.getFormat() == 256) {
                limit = image.getPlanes()[0].getBuffer().limit();
                exc0.a("Only JPEG is supported now", image.getFormat() == 256);
                Image.Plane[] planes2 = image.getPlanes();
                if (planes2 == null || planes2.length != 1) {
                    throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
                }
                ByteBuffer buffer = planes2[0].getBuffer();
                buffer.rewind();
                int remaining = buffer.remaining();
                byte[] bArr = new byte[remaining];
                buffer.get(bArr);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
                int width = decodeByteArray.getWidth();
                int height = decodeByteArray.getHeight();
                if (i3 == 0) {
                    createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, width, height);
                } else {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i3);
                    createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, width, height, matrix, true);
                }
                y1xVar = new y1x(createBitmap);
            } else {
                for (Image.Plane plane : planes) {
                    if (plane.getBuffer() != null) {
                        plane.getBuffer().rewind();
                    }
                }
                y1xVar = new y1x(image, image.getWidth(), image.getHeight(), i3);
                limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
            }
            y1x y1xVar2 = y1xVar;
            zzmu.zza(zzms.zzb("vision-common"), image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), limit, i3);
            List h = e.h(y1xVar2);
            if (h != null && (a = tne0.a(h)) != null) {
                return new nne0(i, i2, a, true);
            }
        }
        ByteBuffer buffer2 = image.getPlanes()[0].getBuffer();
        byte[] bArr2 = new byte[buffer2.capacity()];
        buffer2.get(bArr2);
        return d(i, i2, i3, bArr2);
    }

    public final nne0 d(int i, int i2, int i3, byte[] bArr) {
        nne0 nne0Var;
        u900 u900Var = new u900(bArr, i, i2);
        if (i3 == 90) {
            byte[] bArr2 = new byte[i * i2];
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    bArr2[(i5 * i2) + ((i2 - i4) - 1)] = bArr[(i4 * i) + i5];
                }
            }
            u900Var = new u900(bArr2, i2, i);
        } else if (i3 == 180) {
            byte[] copyOf = Arrays.copyOf(bArr, i2 * i);
            int length = (copyOf.length / 2) - 1;
            if (length >= 0) {
                int length2 = copyOf.length - 1;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        byte b = copyOf[i6];
                        copyOf[i6] = copyOf[length2];
                        copyOf[length2] = b;
                        length2--;
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                    }
                }
            }
            u900Var = new u900(copyOf, i, i2);
        } else if (i3 == 270) {
            byte[] bArr3 = new byte[i * i2];
            for (int i7 = 0; i7 < i2; i7++) {
                for (int i8 = 0; i8 < i; i8++) {
                    bArr3[(((i - i8) - 1) * i2) + i7] = bArr[(i7 * i) + i8];
                }
            }
            u900Var = new u900(bArr3, i2, i);
        }
        ArrayList arrayList = new ArrayList();
        int i9 = u900Var.b;
        int i10 = u900Var.c;
        byte[] bArr4 = u900Var.a;
        Result a = a(f(i9, i10, bArr4));
        Result result = null;
        if (a != null) {
            arrayList.add(a);
            nne0Var = new nne0(i9, i10, arrayList, false);
        } else {
            nne0Var = null;
        }
        if (nne0Var == null) {
            int length3 = bArr4.length;
            for (int i11 = 0; i11 < length3; i11++) {
                bArr4[i11] = (byte) (bArr4[i11] ^ (-1));
            }
            PlanarYUVLuminanceSource f = f(i9, i10, bArr4);
            Result b2 = b(f);
            if (b2 == null) {
                try {
                    result = ((MultiFormatReader) this.f.getValue()).decodeWithState(new BinaryBitmap(new GlobalHistogramBinarizer(f)));
                } catch (Throwable th) {
                    xgx0.a.getClass();
                    xgx0.d(th);
                }
                b2 = result;
            }
            if (b2 != null) {
                arrayList.add(b2);
                return new nne0(i9, i10, arrayList, false);
            }
        }
        return nne0Var;
    }

    public final fy2 e() {
        fy2 fy2Var;
        fy2 fy2Var2 = this.h;
        if (fy2Var2 != null) {
            return fy2Var2;
        }
        Context context = this.b;
        fy2 fy2Var3 = null;
        if (context != null) {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            if (googleApiAvailability.isGooglePlayServicesAvailable(context) != 0) {
                googleApiAvailability = null;
            }
            if (googleApiAvailability != null) {
                synchronized (this.g) {
                    fy2Var = this.h;
                    if (fy2Var == null) {
                        try {
                            fy2 fy2Var4 = new fy2(this.a);
                            this.h = fy2Var4;
                            fy2Var3 = fy2Var4;
                        } catch (Throwable th) {
                            xgx0.a.getClass();
                            xgx0.c("mlkit reader creation failed", th);
                        }
                        fy2Var = fy2Var3;
                    }
                }
                return fy2Var;
            }
        }
        return null;
    }
}
