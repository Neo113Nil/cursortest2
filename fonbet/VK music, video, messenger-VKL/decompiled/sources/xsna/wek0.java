package xsna;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.Layer;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: SolidLayer.java */
/* loaded from: classes12.dex */
public final class wek0 extends com.airbnb.lottie.model.layer.a {
    public final RectF D;
    public final xky E;
    public final float[] F;
    public final Path G;
    public final Layer H;

    @Nullable
    public pjr0 I;

    @Nullable
    public pjr0 J;

    public wek0(k800 k800Var, Layer layer) {
        super(k800Var, layer);
        this.D = new RectF();
        xky xkyVar = new xky();
        this.E = xkyVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = layer;
        xkyVar.setAlpha(0);
        xkyVar.setStyle(Paint.Style.FILL);
        xkyVar.setColor(layer.l);
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
        if (t == 1) {
            if (a900Var != null) {
                this.J = new pjr0(null, a900Var);
                return;
            }
            this.J = null;
            this.E.setColor(this.H.l);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, xsna.plo
    public final void g(RectF rectF, Matrix matrix, boolean z) {
        super.g(rectF, matrix, z);
        Layer layer = this.H;
        float f = layer.j;
        float f2 = layer.k;
        RectF rectF2 = this.D;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void k(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        Layer layer = this.H;
        int alpha = Color.alpha(layer.l);
        if (alpha == 0) {
            return;
        }
        pjr0 pjr0Var = this.J;
        Integer num = pjr0Var == null ? null : (Integer) pjr0Var.f();
        xky xkyVar = this.E;
        if (num != null) {
            xkyVar.setColor(num.intValue());
        } else {
            xkyVar.setColor(layer.l);
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.w.p == null ? 100 : r2.f().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        xkyVar.setAlpha(intValue);
        if (aVar == null) {
            xkyVar.clearShadowLayer();
        } else if (Color.alpha(aVar.d) > 0) {
            xkyVar.setShadowLayer(Math.max(aVar.a, Float.MIN_VALUE), aVar.b, aVar.c, aVar.d);
        } else {
            xkyVar.clearShadowLayer();
        }
        pjr0 pjr0Var2 = this.I;
        if (pjr0Var2 != null) {
            xkyVar.setColorFilter((ColorFilter) pjr0Var2.f());
        }
        if (intValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = layer.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = layer.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, xkyVar);
        }
    }
}
