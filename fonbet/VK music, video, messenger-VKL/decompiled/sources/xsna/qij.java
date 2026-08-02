package xsna;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.photo.editor.views.DispatchTouchFrameLayout;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ContentPositionApplier.kt */
/* loaded from: classes4.dex */
public final class qij {
    public final View a;
    public final View b;
    public final View c;
    public final nv10 d;
    public final PhotoEditorView.a e;
    public boolean f;
    public boolean h;
    public o93 j;
    public rij g = rij.e;
    public final bpn0 i = new bpn0(new pr1(12));
    public final Rect k = new Rect();
    public final RectF l = new RectF();
    public final RectF m = new RectF();
    public final Rect n = new Rect();
    public final RectF o = new RectF();
    public final Matrix p = new Matrix();
    public final RectF q = new RectF();
    public final Matrix r = new Matrix();
    public final float[] s = new float[9];
    public final ConcurrentHashMap<f5p, ifj> t = new ConcurrentHashMap<>();

    public qij(FrameLayout frameLayout, FrameLayout frameLayout2, DispatchTouchFrameLayout dispatchTouchFrameLayout, FrameLayout frameLayout3, ov10 ov10Var, PhotoEditorView.a aVar) {
        this.a = frameLayout2;
        this.b = dispatchTouchFrameLayout;
        this.c = frameLayout3;
        this.d = ov10Var;
        this.e = aVar;
    }

    public static final void a(qij qijVar) {
        boolean z = qijVar.f;
        bpn0 bpn0Var = qijVar.i;
        if (!z) {
            qijVar.e(oij.b, false);
            return;
        }
        o93 o93Var = qijVar.j;
        if (o93Var != null) {
            ((Handler) bpn0Var.getValue()).removeCallbacks(o93Var);
        }
        o93 o93Var2 = new o93(qijVar, 10);
        qijVar.j = o93Var2;
        ((Handler) bpn0Var.getValue()).postDelayed(o93Var2, 500L);
    }

    public final RectF b() {
        RectF rectF = this.d.provide().e;
        if (rectF.isEmpty()) {
            return c();
        }
        float width = rectF.width();
        float height = rectF.height();
        RectF rectF2 = this.m;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
        return rectF2;
    }

    public final RectF c() {
        Rect rect = this.k;
        fyt0.g(rect, this.b);
        RectF rectF = this.l;
        rectF.set(rect);
        return rectF;
    }

    public final RectF d() {
        View view = this.c;
        Rect rect = this.n;
        view.getHitRect(rect);
        RectF rectF = this.o;
        rectF.set(rect);
        float f = rectF.left;
        rij rijVar = this.g;
        rectF.set(f + rijVar.a, rectF.top + rijVar.b, rectF.right - rijVar.c, rectF.bottom - rijVar.d);
        return rectF;
    }

    public final void e(zzs<? super ifj, ? super RectF, ? super RectF, ? super RectF, s3q0> zzsVar, boolean z) {
        RectF c = c();
        RectF d = d();
        if (!this.h) {
            l3p.a("positioning", new jij(this, d, c, z));
        }
        for (ifj ifjVar : this.t.values()) {
            RectF c2 = c();
            Matrix matrix = this.p;
            matrix.reset();
            float[] fArr = this.s;
            matrix.postScale(fArr[0], fArr[4], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            RectF c3 = c();
            float height = ((c3.height() - b().height()) / 2.0f) * fArr[4];
            matrix.postTranslate(fArr[2] - (((c3.width() - b().width()) / 2.0f) * fArr[0]), fArr[5] - height);
            RectF rectF = this.q;
            rectF.set(c3);
            matrix.mapRect(rectF);
            zzsVar.invoke(ifjVar, c2, rectF, d());
        }
    }
}
