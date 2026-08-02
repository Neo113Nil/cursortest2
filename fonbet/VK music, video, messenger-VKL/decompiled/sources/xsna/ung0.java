package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Size;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import xsna.xoe0;

/* compiled from: RoundCameraView.kt */
/* loaded from: classes16.dex */
public final class ung0 extends xoe0 {
    public static final TreeSet<Integer> S = oa01.b(0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1);
    public final ArrayList M;
    public final cq6 N;
    public final Size O;
    public os90 P;
    public int Q;
    public final fo4 R;

    public ung0(Activity activity, ArrayList arrayList, nih nihVar, lew lewVar, cq6 cq6Var, int i, Size size) {
        super(activity, nihVar, lewVar, i, 180000, true);
        this.M = arrayList;
        this.N = cq6Var;
        this.O = size;
        Context context = e43.a;
        this.R = new fo4(context == null ? null : context, false);
    }

    public final void A() {
        os90 os90Var = this.P;
        Bitmap bitmap = null;
        if (os90Var != null) {
            String str = (String) this.M.get(this.Q);
            int i = os90Var.b;
            Path d = rq90.d(str);
            RectF rectF = new RectF();
            d.computeBounds(rectF, true);
            float f = i;
            float max = f / Math.max(rectF.width(), rectF.height());
            Matrix matrix = new Matrix();
            matrix.setTranslate(-rectF.left, -rectF.top);
            matrix.postScale(max, max);
            float f2 = 2;
            matrix.postTranslate((f - (rectF.width() * max)) / f2, (f - (rectF.height() * max)) / f2);
            d.transform(matrix);
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setFlags(7);
            Bitmap d2 = kd7.d(i, i);
            if (d2 != null) {
                Canvas canvas = new Canvas(d2);
                d.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                canvas.drawPath(d, paint);
                bitmap = d2;
            }
        }
        if (bitmap != null) {
            mk9 mk9Var = ((mo9) getCameraPreview()).g;
            mk9Var.getClass();
            mk9Var.d(new h(3, mk9Var, bitmap));
        } else {
            L.l("RoundCameraView", "stencilProvider(" + this.P + ") returned null for stencil idx=" + this.Q);
        }
    }

    public final int getCurrentStencilIdx() {
        return this.Q;
    }

    @Override // xsna.xoe0
    public TreeSet<Integer> getQualitySet() {
        return S;
    }

    @Override // xsna.kk9
    public final MediaUtils.d l(boolean z) {
        Size size = this.O;
        return new MediaUtils.d(size.getWidth(), size.getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R.a.d(2);
    }

    @Override // xsna.kk9, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R.b();
    }

    public final void setCurrentStencilIdx(int i) {
        this.Q = i;
        A();
    }

    @Override // xsna.xoe0
    public final void z() {
        super.z();
        gzs<s3q0> onCameraReadyCallback = getOnCameraReadyCallback();
        if (onCameraReadyCallback != null) {
            onCameraReadyCallback.invoke();
        }
        jhu0 jhu0Var = this.m;
        if (jhu0Var != null) {
            jhu0Var.i(xoe0.b.b);
        }
        int min = Math.min(getCameraPreviewWidth(), getCameraPreviewHeight());
        if (this.P == null) {
            this.P = new os90(min, 1);
            A();
            cq6 cq6Var = this.N;
            if (cq6Var != null) {
                cq6Var.invoke();
            }
        }
    }
}
