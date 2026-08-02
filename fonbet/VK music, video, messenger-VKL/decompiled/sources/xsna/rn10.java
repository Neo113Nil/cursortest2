package xsna;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: MatrixPositionTransformer.kt */
/* loaded from: classes3.dex */
public final class rn10 {
    public final float A;
    public a B;
    public final Rect a;
    public final Rect b;
    public final int c;
    public final Rect d;
    public final int e;
    public final tn10 f;
    public final View g;
    public final VideoResizer.MatrixType h;
    public final Rect i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;
    public final float s;
    public final float t;
    public final float u;
    public final float v;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    /* compiled from: MatrixPositionTransformer.kt */
    public static final class a {
        public float a = 1.0f;
        public float b = 1.0f;
        public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public float d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public Rect e = null;
        public sn10 f = null;
        public final float g;
        public final float h;

        public a(float f, float f2) {
            this.g = f;
            this.h = f2;
        }

        public static Float b(float f) {
            Float valueOf = Float.valueOf(f);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return valueOf;
            }
            return null;
        }

        public final void a(View view) {
            if (com.vk.toggle.b.A.a(VideoFeatures.VIDEO_SURFACE_VIEW) && (view instanceof VideoTextureView)) {
                return;
            }
            view.setClipBounds(this.e);
            view.setOutlineProvider(this.f);
            Float b = b(this.a);
            if (b != null) {
                view.setScaleX(b.floatValue());
            }
            Float b2 = b(this.b);
            if (b2 != null) {
                view.setScaleY(b2.floatValue());
            }
            Float b3 = b(this.c);
            if (b3 != null) {
                view.setTranslationX(this.g + b3.floatValue());
            }
            Float b4 = b(this.d);
            if (b4 != null) {
                view.setTranslationY(this.h + b4.floatValue());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && Float.compare(this.g, aVar.g) == 0 && Float.compare(this.h, aVar.h) == 0;
        }

        public final int hashCode() {
            int a = io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
            Rect rect = this.e;
            int hashCode = (a + (rect == null ? 0 : rect.hashCode())) * 31;
            sn10 sn10Var = this.f;
            return Float.hashCode(this.h) + io.reactivex.rxjava3.subjects.b.a(this.g, (hashCode + (sn10Var != null ? sn10Var.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnimationParams(scaleX=");
            sb.append(this.a);
            sb.append(", scaleY=");
            sb.append(this.b);
            sb.append(", translationX=");
            sb.append(this.c);
            sb.append(", translationY=");
            sb.append(this.d);
            sb.append(", clipBounds=");
            sb.append(this.e);
            sb.append(", outlineProvider=");
            sb.append(this.f);
            sb.append(", initialTranslationX=");
            sb.append(this.g);
            sb.append(", initialTranslationY=");
            return xq.c(')', this.h, sb);
        }
    }

    /* compiled from: MatrixPositionTransformer.kt */
    public static final class b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }
    }

    public rn10(Rect rect, Rect rect2, VideoResizer.VideoFitType videoFitType, int i, Rect rect3, VideoResizer.VideoFitType videoFitType2, int i2, tn10 tn10Var) {
        this.a = rect;
        this.b = rect2;
        this.c = i;
        this.d = rect3;
        this.e = i2;
        this.f = tn10Var;
        View b2 = tn10Var.b();
        this.g = b2;
        this.h = tn10Var instanceof com.vk.libvideo.api.ui.b ? VideoResizer.MatrixType.IMAGE_MATRIX : tn10Var instanceof ImageView ? VideoResizer.MatrixType.IMAGE_MATRIX : tn10Var instanceof com.vk.libvideo.api.ui.c ? VideoResizer.MatrixType.VIEW_MATRIX : tn10Var instanceof com.vk.libvideo.api.ui.a ? VideoResizer.MatrixType.VIEW_MATRIX : VideoResizer.MatrixType.TEXTURE_MATRIX;
        this.i = new Rect();
        this.B = new a(b2.getTranslationX(), b2.getTranslationY());
        b a2 = a(videoFitType, rect);
        float f = a2.a;
        this.j = f;
        float f2 = a2.b;
        this.k = f2;
        float f3 = a2.c;
        this.l = f3;
        float f4 = a2.d;
        this.m = f4;
        b a3 = a(videoFitType2, rect3);
        float f5 = a3.a;
        float f6 = a3.b;
        float f7 = a3.c;
        this.n = f7;
        float f8 = a3.d;
        this.o = f8;
        b a4 = a(VideoResizer.VideoFitType.FIT, rect3);
        float f9 = a4.a;
        this.p = f9;
        float f10 = a4.b;
        this.q = f10;
        float f11 = a4.c;
        this.r = f11;
        float f12 = a4.d;
        this.s = f12;
        float f13 = f5 / f9;
        this.t = f13;
        float f14 = f6 / f10;
        this.u = f14;
        this.v = f7 - (f13 * f11);
        this.w = f8 - (f14 * f12);
        float f15 = f / f9;
        this.x = f15;
        float f16 = f2 / f10;
        this.y = f16;
        this.z = (f3 - (f11 * f15)) + (rect.left - rect3.left);
        this.A = (f4 - (f12 * f16)) + (rect.top - rect3.top);
    }

    public final b a(VideoResizer.VideoFitType videoFitType, Rect rect) {
        float[] fArr = new float[8];
        int width = rect.width();
        int height = rect.height();
        tn10 tn10Var = this.f;
        VideoResizer.a.a(fArr, videoFitType, this.h, width, height, tn10Var.getContentWidth(), tn10Var.getContentHeight());
        return new b(fArr[4], fArr[5], fArr[6], fArr[7]);
    }

    public final void b() {
        a aVar = new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.B = aVar;
        aVar.a(this.g);
    }

    public final void c(float f) {
        float b2;
        float b3;
        Rect rect;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Rect rect2 = this.a;
        Rect rect3 = this.d;
        if (epx.f(rect2, rect3)) {
            return;
        }
        a aVar = this.B;
        float f7 = this.t;
        float f8 = this.x;
        aVar.a = u11.b(f7, f8, f, f8);
        float f9 = this.u;
        float f10 = this.y;
        aVar.b = u11.b(f9, f10, f, f10);
        boolean z = this.h == VideoResizer.MatrixType.VIEW_MATRIX;
        View view = this.g;
        if (!z || iah0.r(view.getContext())) {
            float f11 = this.v;
            float f12 = this.z;
            b2 = u11.b(f11, f12, f, f12);
        } else {
            b2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        aVar.c = b2;
        if (z && iah0.r(view.getContext())) {
            b3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            float f13 = this.w;
            float f14 = this.A;
            b3 = u11.b(f13, f14, f, f14);
        }
        aVar.d = b3;
        float f15 = (-this.o) / f9;
        float f16 = (-this.m) / f10;
        float f17 = this.s;
        if (f17 <= 1.0f) {
            f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f18 = f16 + f17;
        float b4 = u11.b(f15, f18, f, f18);
        float f19 = this.n;
        float f20 = (-f19) / f7;
        float f21 = (-this.l) / f8;
        if (this.r <= 1.0f) {
            f19 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f22 = f21 + f19;
        float b5 = u11.b(f20, f22, f, f22);
        Rect rect4 = this.b;
        if (rect4 != null) {
            f6 = rect2.top - rect4.top < 0 ? (1.0f - f) * (Math.abs(r13) / f10) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f2 = 1.0f;
            f5 = rect2.bottom - rect4.bottom > 0 ? (1.0f - f) * (Math.abs(r13) / f10) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            rect = rect3;
            f4 = rect2.left - rect4.left < 0 ? (1.0f - f) * (Math.abs(r13) / f8) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f3 = rect2.right - rect4.right > 0 ? (Math.abs(r3) / f8) * (1.0f - f) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            rect = rect3;
            f2 = 1.0f;
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i = (int) b5;
        int i2 = ((int) f4) + i;
        Rect rect5 = this.i;
        rect5.left = i2;
        int i3 = (int) b4;
        rect5.top = ((int) f6) + i3;
        rect5.right = (rect.width() - i) - ((int) f3);
        rect5.bottom = (rect.height() - i3) - ((int) f5);
        aVar.e = rect5;
        float min = Math.min(this.k, rect2.height()) / f10;
        float height = rect.height();
        float f23 = this.q;
        float f24 = 2;
        float height2 = (rect.height() / 2) - (Math.min(min, Math.min(Math.min(f23, height), rect.height())) / f24);
        float height3 = rect.height() - height2;
        float min2 = Math.min(this.j, rect2.width()) / f8;
        float width = rect.width();
        float f25 = this.p;
        float width2 = (rect.width() / 2) - (Math.min(min2, Math.min(Math.min(f25, width), rect.width())) / f24);
        float width3 = rect.width() - width2;
        float height4 = (rect.height() / 2) - ((Math.min(f23 * f9, rect.height()) / f9) / f24);
        float width4 = (rect.width() / 2) - ((Math.min(f25 * f7, rect.width()) / f7) / f24);
        aVar.f = new sn10(u11.b(width4, width2, f, width2), u11.b(height4, height2, f, height2), u11.b(rect.width() - width4, width3, f, width3), u11.b(rect.height() - height4, height3, f, height3), ((this.e / f7) * f) + ((f2 - f) * (this.c / f8)));
        this.B.a(view);
    }
}
