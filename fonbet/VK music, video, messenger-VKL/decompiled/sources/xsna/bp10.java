package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.util.measure.ScaleType;

/* compiled from: MeasureImageUtils.java */
/* loaded from: classes2.dex */
public final class bp10 {

    /* compiled from: MeasureImageUtils.java */
    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public ScaleType k;
        public float l;
    }

    /* compiled from: MeasureImageUtils.java */
    public static class b {
        public int a;
        public int b;
        public int c;
        public int d;

        public final boolean a() {
            return this.c >= this.a && this.d >= this.b;
        }
    }

    public static int a(int i, int i2, int i3, int i4) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                size = Math.min(i2, i3);
            } else if (mode != 1073741824) {
                throw new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "));
            }
        } else if (size >= i2) {
            size = Math.min(size, i3);
        }
        return Math.max(0, size - i4);
    }

    public static int b(int i, int i2, int i3) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i2 = Math.min(size, i2);
        } else if (mode != 0) {
            if (mode != 1073741824) {
                throw new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "));
            }
            i2 = size;
        }
        return Math.max(0, i2 - i3);
    }

    public static int c(int i, int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (size < i2 || size < i4) ? size : Math.max(i2, Math.min(i4, i3));
        }
        if (mode == 0) {
            return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "));
    }

    public static void d(a aVar, b bVar) {
        int i;
        int i2;
        float f;
        float f2;
        int b2 = b(aVar.c, aVar.e, aVar.i);
        int b3 = b(aVar.d, aVar.f, aVar.j);
        int a2 = a(aVar.c, aVar.e, aVar.g, aVar.i);
        int a3 = a(aVar.d, aVar.f, aVar.h, aVar.j);
        float f3 = aVar.l;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i2 = aVar.a;
            i = aVar.b;
        } else if (f3 >= 1.0f) {
            int i3 = aVar.a;
            i = (int) (i3 / f3);
            i2 = i3;
        } else {
            i = aVar.b;
            i2 = (int) (i / f3);
        }
        if (i2 == 0 || i == 0) {
            f = 1.0f;
            f2 = 1.0f;
        } else {
            float f5 = i2;
            float f6 = i;
            f = Math.max(b2 / f5, b3 / f6);
            f2 = Math.min(a2 / f5, a3 / f6);
        }
        ScaleType scaleType = aVar.k;
        ScaleType scaleType2 = ScaleType.CENTER_CROP_UPSCALE;
        boolean z = scaleType == scaleType2;
        if (f > 1.0f && f2 > 1.0f) {
            if (z) {
                f = f2;
            }
            f2 = f;
        } else if ((f >= 1.0f || f2 >= 1.0f) && !z) {
            f2 = 1.0f;
        }
        float f7 = i2;
        int c = c(aVar.c, aVar.e, aVar.g, Math.round(f7 * f2));
        float f8 = i;
        int c2 = c(aVar.d, aVar.f, aVar.h, Math.round(f2 * f8));
        float f9 = c / f7;
        float f10 = c2 / f8;
        if (i2 != 0 && i != 0) {
            ScaleType scaleType3 = aVar.k;
            if (scaleType3 == scaleType2) {
                f4 = Math.max(f9, f10);
            } else if (scaleType3 == ScaleType.CENTER_CROP) {
                f4 = Math.max(f9, f10);
            } else if (scaleType3 == ScaleType.CENTER_INSIDE) {
                f4 = (f9 <= 1.0f || f10 <= 1.0f) ? Math.min(f9, f10) : 1.0f;
            } else {
                if (scaleType3 != ScaleType.FIT_START && scaleType3 != ScaleType.FIT_CENTER && scaleType3 != ScaleType.FIT_END) {
                    f4 = f9;
                    bVar.c = Math.round(f7 * f4);
                    bVar.d = Math.round(f8 * f10);
                    bVar.a = c + aVar.i;
                    bVar.b = c2 + aVar.j;
                }
                f4 = Math.min(f9, f10);
            }
        }
        f10 = f4;
        bVar.c = Math.round(f7 * f4);
        bVar.d = Math.round(f8 * f10);
        bVar.a = c + aVar.i;
        bVar.b = c2 + aVar.j;
    }
}
