package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.OffscreenLayer;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: ImageLayer.java */
/* loaded from: classes12.dex */
public final class wjw extends com.airbnb.lottie.model.layer.a {
    public final xky D;
    public final Rect E;
    public final Rect F;
    public final RectF G;

    @Nullable
    public final q800 H;

    @Nullable
    public pjr0 I;

    @Nullable
    public pjr0 J;

    @Nullable
    public final lmo K;

    @Nullable
    public OffscreenLayer L;

    @Nullable
    public OffscreenLayer.b M;

    public wjw(k800 k800Var, Layer layer) {
        super(k800Var, layer);
        this.D = new xky(3);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = layer.g;
        i700 i700Var = k800Var.b;
        this.H = i700Var == null ? null : (q800) ((HashMap) i700Var.d()).get(str);
        m22 m22Var = this.p.x;
        if (m22Var != null) {
            this.K = new lmo(this, this, m22Var);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        super.f(t, a900Var);
        if (t == t800.I) {
            if (a900Var == null) {
                this.I = null;
                return;
            } else {
                this.I = new pjr0(null, a900Var);
                return;
            }
        }
        if (t == t800.L) {
            if (a900Var == null) {
                this.J = null;
                return;
            } else {
                this.J = new pjr0(null, a900Var);
                return;
            }
        }
        lmo lmoVar = this.K;
        if (t == 5 && lmoVar != null) {
            lmoVar.c.k(a900Var);
            return;
        }
        if (t == t800.E && lmoVar != null) {
            lmoVar.b(a900Var);
            return;
        }
        if (t == t800.F && lmoVar != null) {
            lmoVar.e.k(a900Var);
            return;
        }
        if (t == t800.G && lmoVar != null) {
            lmoVar.f.k(a900Var);
        } else {
            if (t != t800.H || lmoVar == null) {
                return;
            }
            lmoVar.g.k(a900Var);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, xsna.plo
    public final void g(RectF rectF, Matrix matrix, boolean z) {
        super.g(rectF, matrix, z);
        q800 q800Var = this.H;
        if (q800Var != null) {
            int i = q800Var.b;
            int i2 = q800Var.a;
            float c = b3r0.c();
            if (this.o.p) {
                rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2 * c, i * c);
            } else {
                if (s() != null) {
                    rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r1.getWidth() * c, r1.getHeight() * c);
                } else {
                    rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2 * c, i * c);
                }
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void k(@NonNull Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        q800 q800Var;
        Bitmap s = s();
        if (s == null || s.isRecycled() || (q800Var = this.H) == null) {
            return;
        }
        float c = b3r0.c();
        xky xkyVar = this.D;
        xkyVar.setAlpha(i);
        pjr0 pjr0Var = this.I;
        if (pjr0Var != null) {
            xkyVar.setColorFilter((ColorFilter) pjr0Var.f());
        }
        lmo lmoVar = this.K;
        if (lmoVar != null) {
            aVar = lmoVar.a(matrix, i);
        }
        int width = s.getWidth();
        int height = s.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z = this.o.p;
        Rect rect2 = this.F;
        if (z) {
            rect2.set(0, 0, (int) (q800Var.a * c), (int) (q800Var.b * c));
        } else {
            rect2.set(0, 0, (int) (s.getWidth() * c), (int) (s.getHeight() * c));
        }
        boolean z2 = aVar != null;
        if (z2) {
            if (this.L == null) {
                this.L = new OffscreenLayer();
            }
            if (this.M == null) {
                this.M = new OffscreenLayer.b();
            }
            OffscreenLayer.b bVar = this.M;
            bVar.a = 255;
            bVar.b = null;
            aVar.getClass();
            com.airbnb.lottie.utils.a aVar2 = new com.airbnb.lottie.utils.a(aVar);
            bVar.b = aVar2;
            aVar2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(s, rect, rect2, xkyVar);
        if (z2) {
            this.L.c();
            if (this.L.c == OffscreenLayer.RenderStrategy.RENDER_NODE) {
                return;
            }
        }
        canvas.restore();
    }

    @Nullable
    public final Bitmap s() {
        Bitmap bitmap;
        pjr0 pjr0Var = this.J;
        if (pjr0Var != null && (bitmap = (Bitmap) pjr0Var.f()) != null) {
            return bitmap;
        }
        Bitmap j = this.o.j(this.p.g);
        if (j != null) {
            return j;
        }
        q800 q800Var = this.H;
        if (q800Var != null) {
            return q800Var.f;
        }
        return null;
    }
}
