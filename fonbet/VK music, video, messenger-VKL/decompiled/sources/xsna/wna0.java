package xsna;

import android.graphics.PointF;
import android.opengl.Matrix;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PinchToZoomDataCalculator.kt */
/* loaded from: classes8.dex */
public final class wna0 {
    public static final float[] k = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    public static final float[] l = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    public final a a;
    public PointF b;
    public float c;
    public final float[] d;
    public vna0 e;
    public final float[] f;
    public final float[] g;
    public final float[] h;
    public b i;
    public r5h0 j;

    /* compiled from: PinchToZoomDataCalculator.kt */
    public interface a {
        void b();

        void onFinish();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PinchToZoomDataCalculator.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NONE;
        public static final b ONE_FINGER;
        public static final b TWO_FINGERS;

        static {
            b bVar = new b("NONE", 0);
            NONE = bVar;
            b bVar2 = new b("ONE_FINGER", 1);
            ONE_FINGER = bVar2;
            b bVar3 = new b("TWO_FINGERS", 2);
            TWO_FINGERS = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: PinchToZoomDataCalculator.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ONE_FINGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.TWO_FINGERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wna0(a aVar) {
        this.a = aVar;
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        this.d = fArr;
        this.e = new vna0(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        this.f = fArr2;
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        this.g = fArr3;
        this.h = new float[4];
        this.i = b.NONE;
        this.j = new r5h0(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[LOOP:0: B:14:0x0069->B:16:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(PointF pointF, float f) {
        PointF pointF2;
        float f2;
        float f3;
        int i;
        float d;
        float c2;
        float f4;
        float f5;
        Size size = this.j.a;
        if (size == null || (pointF2 = this.b) == null) {
            return;
        }
        float f6 = pointF.x - pointF2.x;
        float f7 = pointF.y - pointF2.y;
        float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f9 = this.c;
            if (f9 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = f / f9;
                float f10 = this.e.a;
                f3 = f10 * f2;
                if (f3 >= 1.0f) {
                    f2 = 1.0f / f10;
                } else if (f3 > 5.0f) {
                    f2 = 5.0f / f10;
                }
                float width = (size.getWidth() / 2) - pointF.x;
                float height = (size.getHeight() / 2) - pointF.y;
                float[] fArr = this.f;
                Matrix.setIdentityM(fArr, 0);
                Matrix.translateM(fArr, 0, f6, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Matrix.translateM(fArr, 0, -width, -height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Matrix.scaleM(fArr, 0, f2, f2, 1.0f);
                Matrix.translateM(fArr, 0, width, height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                for (i = 0; i < 16; i++) {
                    this.g[i] = this.d[i];
                }
                Matrix.multiplyMM(this.d, 0, this.f, 0, this.g, 0);
                Matrix.multiplyMV(this.h, 0, this.d, 0, k, 0);
                float[] fArr2 = this.h;
                float f11 = fArr2[0];
                float f12 = fArr2[1];
                Matrix.multiplyMV(fArr2, 0, this.d, 0, l, 0);
                float length = new PointF(fArr2[0] - f11, fArr2[1] - f12).length();
                d = this.j.d();
                c2 = this.j.c();
                if (d <= c2) {
                    f5 = size.getHeight() * length;
                    f4 = c2 * f5;
                } else {
                    float width2 = size.getWidth() * length;
                    float f13 = width2 / c2;
                    f4 = width2;
                    f5 = f13;
                }
                if (f4 <= size.getWidth()) {
                    float f14 = 2;
                    if (((size.getWidth() - f4) / f14) + f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f11 = (-(size.getWidth() - f4)) / f14;
                    }
                    if (((size.getWidth() - f4) / f14) + f4 + f11 < size.getWidth()) {
                        f11 = (size.getWidth() - ((size.getWidth() - f4) / f14)) - f4;
                    }
                } else {
                    f11 = 0.0f;
                }
                if (f5 > size.getHeight()) {
                    float f15 = 2;
                    f8 = ((((float) size.getHeight()) - f5) / f15) + f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (-(size.getHeight() - f5)) / f15 : f12;
                    if (((size.getHeight() - f5) / f15) + f5 + f8 < size.getHeight()) {
                        f8 = (size.getHeight() - ((size.getHeight() - f5) / f15)) - f5;
                    }
                }
                b(length, f11, f8);
                this.a.b();
            }
        }
        f2 = 1.0f;
        float f102 = this.e.a;
        f3 = f102 * f2;
        if (f3 >= 1.0f) {
        }
        float width3 = (size.getWidth() / 2) - pointF.x;
        float height2 = (size.getHeight() / 2) - pointF.y;
        float[] fArr3 = this.f;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.translateM(fArr3, 0, f6, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix.translateM(fArr3, 0, -width3, -height2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix.scaleM(fArr3, 0, f2, f2, 1.0f);
        Matrix.translateM(fArr3, 0, width3, height2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        while (i < 16) {
        }
        Matrix.multiplyMM(this.d, 0, this.f, 0, this.g, 0);
        Matrix.multiplyMV(this.h, 0, this.d, 0, k, 0);
        float[] fArr22 = this.h;
        float f112 = fArr22[0];
        float f122 = fArr22[1];
        Matrix.multiplyMV(fArr22, 0, this.d, 0, l, 0);
        float length2 = new PointF(fArr22[0] - f112, fArr22[1] - f122).length();
        d = this.j.d();
        c2 = this.j.c();
        if (d <= c2) {
        }
        if (f4 <= size.getWidth()) {
        }
        if (f5 > size.getHeight()) {
        }
        b(length2, f112, f8);
        this.a.b();
    }

    public final void b(float f, float f2, float f3) {
        this.e = new vna0(f, f2, f3);
        float[] fArr = this.d;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, f2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix.scaleM(fArr, 0, f, f, 1.0f);
    }
}
