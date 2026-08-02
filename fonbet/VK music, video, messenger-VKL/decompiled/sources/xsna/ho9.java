package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Size;
import androidx.annotation.Nullable;
import com.vk.log.L;

/* compiled from: CameraUtils.java */
/* loaded from: classes13.dex */
public final class ho9 {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CameraUtils.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a CLOSEST_ASPECT_RATIO;
        public static final a CLOSEST_ASPECT_RATIO_WITH_THRESHOLD;
        public static final a EQUAL_ASPECT_RATIO;

        static {
            a aVar = new a("EQUAL_ASPECT_RATIO", 0);
            EQUAL_ASPECT_RATIO = aVar;
            a aVar2 = new a("CLOSEST_ASPECT_RATIO_WITH_THRESHOLD", 1);
            CLOSEST_ASPECT_RATIO_WITH_THRESHOLD = aVar2;
            a aVar3 = new a("CLOSEST_ASPECT_RATIO", 2);
            CLOSEST_ASPECT_RATIO = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static Size a(Size[] sizeArr, int i, int i2, int i3, boolean z) {
        if (sizeArr == null || sizeArr.length == 0) {
            return null;
        }
        if (z) {
            for (Size size : sizeArr) {
                if (size.getWidth() == i && size.getHeight() == i2) {
                    return size;
                }
            }
        }
        Size b = b(sizeArr, i, i2, i3, a.EQUAL_ASPECT_RATIO);
        if (b == null) {
            b = b(sizeArr, i, i2, i3, a.CLOSEST_ASPECT_RATIO_WITH_THRESHOLD);
        }
        if (b == null) {
            b = b(sizeArr, i, i2, i3, a.CLOSEST_ASPECT_RATIO);
        }
        if (b == null) {
            b = sizeArr[sizeArr.length - 1];
        }
        b.getWidth();
        b.getHeight();
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (java.lang.Math.abs((r4.getHeight() * r4.getWidth()) - r7) < java.lang.Math.abs((r11.getHeight() * r11.getWidth()) - r7)) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Size b(Size[] sizeArr, int i, int i2, int i3, a aVar) {
        boolean z;
        Size[] sizeArr2 = sizeArr;
        int i4 = i;
        int i5 = i2;
        while (i5 != 0) {
            int i6 = i4 % i5;
            i4 = i5;
            i5 = i6;
        }
        int i7 = i / i4;
        int i8 = i2 / i4;
        int i9 = i * i2;
        int i10 = 0;
        Size size = null;
        if (aVar == a.EQUAL_ASPECT_RATIO) {
            int length = sizeArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                Size size2 = sizeArr2[i11];
                boolean z2 = (size2.getWidth() / i7 == size2.getHeight() / i8) && (size == null || (size2.getWidth() > size.getWidth() && size2.getHeight() <= 1920)) && size2.getWidth() <= 1920;
                boolean z3 = size2.getHeight() / i7 == size2.getWidth() / i8;
                if (size != null) {
                    if (size2.getWidth() <= 1920 && size2.getHeight() <= 1920) {
                    }
                    z = false;
                    if (z3 && z && size2.getHeight() <= 1920) {
                        z2 = true;
                    }
                    boolean z4 = Math.min(size2.getWidth(), size2.getHeight()) < i3;
                    if (z2 && z4) {
                        size = size2;
                    }
                }
                z = true;
                if (z3) {
                    z2 = true;
                }
                if (Math.min(size2.getWidth(), size2.getHeight()) < i3) {
                }
                if (z2) {
                    size = size2;
                }
            }
            return size;
        }
        boolean z5 = aVar == a.CLOSEST_ASPECT_RATIO_WITH_THRESHOLD;
        double d = 1.0d;
        double d2 = (i * 1.0d) / i2;
        int length2 = sizeArr2.length;
        double d3 = Double.MAX_VALUE;
        while (i10 < length2) {
            Size size3 = sizeArr2[i10];
            double d4 = d;
            double width = (size3.getWidth() * d) / size3.getHeight();
            int i12 = length2;
            double abs = Math.abs(width - d2);
            double abs2 = Math.abs(((size3.getHeight() * d4) / size3.getWidth()) - d2);
            if ((abs == d3 || abs2 == d3) && size != null && Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) && !z5) {
                size = size3;
            }
            if ((abs < d3 || abs2 < d3) && (!z5 || Math.min(size3.getWidth(), size3.getHeight()) >= i3)) {
                d3 = Math.min(abs, abs2);
                size = size3;
            }
            i10++;
            sizeArr2 = sizeArr;
            length2 = i12;
            d = d4;
        }
        return size;
    }

    public static int c(int i, int i2) {
        khu0 c = ij9.a.c(i2);
        if (c == null) {
            return 0;
        }
        int i3 = ((i + 45) / 90) * 90;
        return c.a() == 1 ? ((c.getOrientation() - i3) + 360) % 360 : (c.getOrientation() + i3) % 360;
    }

    public static int d(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return 180;
        }
        if (rotation != 3) {
            return 0;
        }
        return atv0.b;
    }

    public static void e(Activity activity, boolean z) {
        try {
            if (z) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception unused) {
        }
    }

    public static Bitmap f(byte[] bArr) {
        Bitmap bitmap;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray != null) {
            Bitmap k = kd7.k(decodeByteArray, 180, true);
            if (k != decodeByteArray) {
                decodeByteArray.recycle();
            }
            decodeByteArray = k;
        }
        if (decodeByteArray == null) {
            return null;
        }
        if (decodeByteArray.getWidth() <= 1920 && decodeByteArray.getHeight() <= 1920) {
            return decodeByteArray;
        }
        float f = 1920;
        float min = Math.min(f / decodeByteArray.getWidth(), f / decodeByteArray.getHeight());
        try {
            bitmap = kd7.e((int) (decodeByteArray.getWidth() * min), (int) (decodeByteArray.getHeight() * min), decodeByteArray);
        } catch (Throwable th) {
            L.j(th, "ho9");
            bitmap = decodeByteArray;
        }
        if (bitmap != decodeByteArray) {
            decodeByteArray.recycle();
        }
        return bitmap;
    }
}
