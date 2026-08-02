package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ScalingUtils.java */
/* loaded from: classes12.dex */
public final class f5h0 {

    /* compiled from: ScalingUtils.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static abstract class b implements d {
        @Override // xsna.f5h0.d
        public final Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            b(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
            return matrix;
        }

        public abstract void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
    }

    /* compiled from: ScalingUtils.java */
    public static class c implements d, p {
        public final d a;
        public final d b;
        public final Rect c;
        public final Rect d;
        public final PointF e;
        public final PointF f;
        public final float[] g = new float[9];
        public final float[] h = new float[9];
        public final float[] i = new float[9];
        public float j;

        public c(d dVar, d dVar2, Rect rect, Rect rect2, PointF pointF, PointF pointF2) {
            this.a = dVar;
            this.b = dVar2;
            this.c = rect;
            this.d = rect2;
            this.e = pointF;
            this.f = pointF2;
        }

        @Override // xsna.f5h0.d
        public final Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Rect rect2 = this.c;
            Rect rect3 = rect2 != null ? rect2 : rect;
            Rect rect4 = this.d;
            Rect rect5 = rect4 != null ? rect4 : rect;
            PointF pointF = this.e;
            this.a.a(matrix, rect3, i, i2, pointF == null ? f : pointF.x, pointF == null ? f2 : pointF.y);
            float[] fArr = this.g;
            matrix.getValues(fArr);
            PointF pointF2 = this.f;
            this.b.a(matrix, rect5, i, i2, pointF2 == null ? f : pointF2.x, pointF2 == null ? f2 : pointF2.y);
            float[] fArr2 = this.h;
            matrix.getValues(fArr2);
            int i3 = 0;
            while (true) {
                float[] fArr3 = this.i;
                if (i3 >= 9) {
                    matrix.setValues(fArr3);
                    return matrix;
                }
                float f3 = fArr[i3];
                float f4 = this.j;
                fArr3[i3] = (fArr2[i3] * f4) + ((1.0f - f4) * f3);
                i3++;
            }
        }

        public final Rect b() {
            return this.c;
        }

        public final Rect c() {
            return this.d;
        }

        public final PointF d() {
            return this.e;
        }

        public final PointF e() {
            return this.f;
        }

        public final d f() {
            return this.a;
        }

        public final d g() {
            return this.b;
        }

        @Override // xsna.f5h0.p
        public final Float getState() {
            return Float.valueOf(this.j);
        }

        public final float h() {
            return this.j;
        }

        public final void i(float f) {
            this.j = f;
        }

        public final String toString() {
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(this.e);
            return h5s.d(xe9.a("InterpolatingScaleType(", valueOf, " (", valueOf2, ") -> "), String.valueOf(this.b), " (", String.valueOf(this.f), "))");
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public interface d {
        Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2);
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class e extends b {
        public static final e a = new e();

        @Override // xsna.f5h0.b
        public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((int) (((rect.width() - i) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i2) * 0.5f) + rect.top + 0.5f));
        }

        public final String toString() {
            return TtmlNode.CENTER;
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class f extends b {
        public static final f a = new f();

        @Override // xsna.f5h0.b
        public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float height;
            if (f4 > f3) {
                f5 = ((rect.width() - (i * f4)) * 0.5f) + rect.left;
                height = rect.top;
                f3 = f4;
            } else {
                f5 = rect.left;
                height = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
        }

        public final String toString() {
            return "center_crop";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class g extends b {
        public static final g a = new g();

        @Override // xsna.f5h0.b
        public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = ((rect.width() - (i * min)) * 0.5f) + rect.left;
            float height = ((rect.height() - (i2 * min)) * 0.5f) + rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public final String toString() {
            return "center_inside";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class h extends b {
        public static final h a = new h();

        @Override // xsna.f5h0.b
        public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = rect.left;
            float height = (rect.height() - (i2 * min)) + rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
        }

        public final String toString() {
            return "fit_bottom_start";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class i extends b {
        public static final i a = new i();

        @Override // xsna.f5h0.b
        public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((rect.width() - (i * min)) * 0.5f) + rect.left;
            float height = ((rect.height() - (i2 * min)) * 0.5f) + rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public final String toString() {
            return "fit_center";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class j extends b {
        public static final j a = new j();

        @Override // xsna.f5h0.b
        public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = (rect.width() - (i * min)) + rect.left;
            float height = (rect.height() - (i2 * min)) + rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public final String toString() {
            return "fit_end";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class k extends b {
        public static final k a = new k();

        @Override // xsna.f5h0.b
        public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = rect.left;
            float f6 = rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
        }

        public final String toString() {
            return "fit_start";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class l extends b {
        public static final l a = new l();

        @Override // xsna.f5h0.b
        public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = rect.left;
            float height = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
        }

        public final String toString() {
            return "fit_x";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class m extends b {
        public static final m a = new m();

        @Override // xsna.f5h0.b
        public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = rect.left;
            float f6 = rect.top;
            matrix.setScale(f3, f4);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
        }

        public final String toString() {
            return "fit_xy";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class n extends b {
        public static final n a = new n();

        @Override // xsna.f5h0.b
        public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float width = ((rect.width() - (i * f4)) * 0.5f) + rect.left;
            float f5 = rect.top;
            matrix.setScale(f4, f4);
            matrix.postTranslate((int) (width + 0.5f), (int) (f5 + 0.5f));
        }

        public final String toString() {
            return "fit_y";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static class o extends b {
        public static final o a = new o();

        @Override // xsna.f5h0.b
        public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float max;
            if (f4 > f3) {
                float f6 = i * f4;
                f5 = Math.max(Math.min((rect.width() * 0.5f) - (f * f6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), rect.width() - f6) + rect.left;
                max = rect.top;
                f3 = f4;
            } else {
                f5 = rect.left;
                float f7 = i2 * f3;
                max = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), rect.height() - f7) + rect.top;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (max + 0.5f));
        }

        public final String toString() {
            return "focus_crop";
        }
    }

    /* compiled from: ScalingUtils.java */
    public interface p {
        Float getState();
    }

    public static b a(ImageView.ScaleType scaleType) {
        switch (a.a[scaleType.ordinal()]) {
            case 1:
                return e.a;
            case 2:
                return f.a;
            case 3:
                return g.a;
            case 4:
                return i.a;
            case 5:
                return k.a;
            case 6:
                return j.a;
            case 7:
                return m.a;
            default:
                return null;
        }
    }
}
