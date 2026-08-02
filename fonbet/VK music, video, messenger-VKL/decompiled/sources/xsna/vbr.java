package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: FillSidesSquarePostprocessor.kt */
/* loaded from: classes15.dex */
public final class vbr extends mk6 {
    public final a c;
    public final float e;
    public final float f;
    public final boolean d = true;
    public final Rect g = new Rect();
    public final Rect h = new Rect();

    /* compiled from: FillSidesSquarePostprocessor.kt */
    public static abstract class a {

        /* compiled from: FillSidesSquarePostprocessor.kt */
        /* renamed from: xsna.vbr$a$a, reason: collision with other inner class name */
        public static final class C3883a extends a {
        }

        /* compiled from: FillSidesSquarePostprocessor.kt */
        public static final class b extends a {
            public final int a = -16777216;
        }
    }

    public vbr(a aVar, float f, float f2) {
        this.c = aVar;
        this.e = f;
        this.f = f2;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return new ppj0(f());
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        Pair pair;
        Rect rect = this.g;
        Rect rect2 = this.h;
        a aVar = this.c;
        float width = bitmap.getWidth() / bitmap.getHeight();
        float f = this.f;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || width <= f) {
            float f2 = this.e;
            pair = (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || width >= f2) ? new Pair(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight())) : new Pair(Integer.valueOf((int) (bitmap.getHeight() * f2)), Integer.valueOf(bitmap.getHeight()));
        } else {
            pair = new Pair(Integer.valueOf(bitmap.getWidth()), Integer.valueOf((int) (bitmap.getWidth() / f)));
        }
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        int width2 = bitmap.getWidth();
        boolean z = this.d;
        if (intValue == width2 && intValue2 == bitmap.getHeight() && z) {
            return super.b(bitmap, hta0Var);
        }
        uvf<Bitmap> c = hta0Var.c(intValue, intValue2, Bitmap.Config.ARGB_8888);
        try {
            Bitmap r = c.r();
            Canvas canvas = new Canvas(r);
            if (aVar instanceof a.C3883a) {
                rect2.set(0, 0, r.getWidth(), r.getHeight());
                canvas.drawBitmap(bitmap, (Rect) null, rect2, (Paint) null);
                ((a.C3883a) aVar).getClass();
                ((a.C3883a) aVar).getClass();
                NativeBlurFilter.iterativeBoxBlur(r, 0, 0);
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                canvas.drawColor(((a.b) aVar).a);
            }
            if (z) {
                rect.set((canvas.getWidth() / 2) - (bitmap.getWidth() / 2), (canvas.getHeight() / 2) - (bitmap.getHeight() / 2), (canvas.getWidth() / 2) + (bitmap.getWidth() / 2), (canvas.getHeight() / 2) + (bitmap.getHeight() / 2));
                canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
            }
            uvf<Bitmap> n = c.n();
            c.close();
            return n;
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(" - ");
        sb.append(this.d);
        sb.append(" - ");
        sb.append(this.e);
        sb.append(" - ");
        return xq.c('}', this.f, sb);
    }

    public final String toString() {
        return "BlurSidesSquarePostprocessor(" + f() + ')';
    }
}
