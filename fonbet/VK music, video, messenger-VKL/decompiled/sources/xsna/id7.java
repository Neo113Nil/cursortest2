package xsna;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.nio.ByteBuffer;
import xsna.n7l;

/* compiled from: BitmapUtil.kt */
/* loaded from: classes12.dex */
public final class id7 {
    public static final bpn0 a = new bpn0(new nd1(2));

    /* compiled from: BitmapUtil.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                config = Bitmap.Config.RGBA_1010102;
                iArr[config.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final j79 a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        bpn0 bpn0Var = a;
        ByteBuffer byteBuffer = (ByteBuffer) ((vvb0) bpn0Var.getValue()).c();
        if (byteBuffer == null) {
            n7l.a aVar = n7l.a;
            byteBuffer = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBuffer.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            return new j79(options.outWidth, options.outHeight, options.outColorSpace);
        } finally {
            ((vvb0) bpn0Var.getValue()).a(byteBuffer);
        }
    }

    @SuppressLint({"NewApi"})
    public static final int b(Bitmap.Config config) {
        switch (config == null ? -1 : a.$EnumSwitchMapping$0[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int c(int i, int i2, Bitmap.Config config) {
        if (i <= 0) {
            throw new IllegalArgumentException(lhg.a(i, "width must be > 0, width is: ").toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException(lhg.a(i2, "height must be > 0, height is: ").toString());
        }
        int b = b(config);
        int i3 = i * i2 * b;
        if (i3 > 0) {
            return i3;
        }
        throw new IllegalStateException(bd3.b(", pixelSize: ", i2, b, odj.a(i3, i, "size must be > 0: size: ", ", width: ", ", height: ")).toString());
    }

    @SuppressLint({"NewApi"})
    public static final int d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
