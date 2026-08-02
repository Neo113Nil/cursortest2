package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ExecutorService;
import kotlin.LazyThreadSafetyMode;
import xsna.iog0;

/* compiled from: RoundRectShadowDrawable.kt */
/* loaded from: classes4.dex */
public final class iog0 extends j9s {
    public final b f;
    public final ExecutorService g;
    public final Object h;
    public final flo<njt> i;

    /* compiled from: RoundRectShadowDrawable.kt */
    public static final class a extends ae<uvf<svf>> {
        public final b h;
        public final Paint i;
        public final RectF j;

        public a(b bVar, ExecutorService executorService) {
            this.h = bVar;
            Paint paint = new Paint(1);
            this.i = paint;
            this.j = new RectF();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-16777216);
            n220<ww8, svf> n220Var = wkw.f().e().f;
            ppj0 ppj0Var = new ppj0(bVar.toString());
            uvf<svf> uvfVar = n220Var.get(ppj0Var);
            if (uvfVar == null || !uvfVar.s()) {
                executorService.execute(new wv6(this, n220Var, ppj0Var, 2));
            } else {
                j(uvfVar, true, null);
            }
        }

        public final kcl l() {
            b bVar = this.h;
            int width = bVar.a.d.width();
            hog0 hog0Var = bVar.a;
            Bitmap createBitmap = Bitmap.createBitmap(width, hog0Var.d.height(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            float f = bVar.c;
            float f2 = bVar.b;
            Paint paint = this.i;
            paint.setAlpha(71);
            RectF rectF = hog0Var.c;
            RectF rectF2 = this.j;
            rectF2.set(rectF);
            rectF2.offset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
            canvas.drawRoundRect(rectF2, f2, f2, paint);
            rectF2.offset(-0.0f, -f);
            NativeBlurFilter.iterativeBoxBlur(createBitmap, 2, bVar.d);
            return uvf.v(xvf.i2(createBitmap, wwf0.s(), gpw.d));
        }
    }

    /* compiled from: RoundRectShadowDrawable.kt */
    public static final class b {
        public final hog0 a;
        public final float b;
        public final float c;
        public final int d;

        public b(hog0 hog0Var, float f, float f2, int i) {
            this.a = hog0Var;
            this.b = f;
            this.c = f2;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Float.compare(this.b, bVar.b) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(this.c, bVar.c) == 0 && this.d == bVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, shy.a(71, io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShadowParams(layoutStrategy=");
            sb.append(this.a);
            sb.append(", cornerRadius=");
            sb.append(this.b);
            sb.append(", alpha=71, shadowHorizontalOffset=0.0, shadowVerticalOffset=");
            sb.append(this.c);
            sb.append(", blurRadius=");
            return vu5.b(sb, this.d, ')');
        }
    }

    public iog0(Context context, b bVar, ExecutorService executorService) {
        super(null);
        this.f = bVar;
        this.g = executorService;
        this.h = msy.a(LazyThreadSafetyMode.NONE, new fog0(0));
        njt a2 = new ojt(context.getResources()).a();
        this.i = new flo<>(a2);
        p(a2.d);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect.isEmpty()) {
            return;
        }
        hog0 hog0Var = this.f.a;
        Rect rect2 = hog0Var.d;
        rect2.set(rect);
        RectF rectF = hog0Var.c;
        float f = rect2.left;
        int width = rect2.width();
        int i = hog0Var.a;
        rectF.left = ((width - i) / 2.0f) + f;
        float f2 = rect2.top;
        int height = rect2.height();
        int i2 = hog0Var.b;
        float f3 = ((height - i2) / 2.0f) + f2;
        rectF.top = f3;
        rectF.right = rectF.left + i;
        rectF.bottom = f3 + i2;
        lpa0 lpa0Var = (lpa0) this.h.getValue();
        lpa0Var.d();
        flo<njt> floVar = this.i;
        lpa0Var.l = floVar.e;
        lpa0Var.b = null;
        lpa0Var.g = new yhn0() { // from class: xsna.gog0
            @Override // xsna.yhn0
            public final Object get() {
                iog0 iog0Var = iog0.this;
                return new iog0.a(iog0Var.f, iog0Var.g);
            }
        };
        floVar.h(lpa0Var.b());
    }
}
