package xsna;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.model.content.GradientType;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.tf6;

/* compiled from: GradientFillContent.java */
/* loaded from: classes12.dex */
public final class gbu implements plo, tf6.a, wdy {

    @NonNull
    public final String a;
    public final boolean b;
    public final com.airbnb.lottie.model.layer.a c;
    public final x500<LinearGradient> d = new x500<>();
    public final x500<RadialGradient> e = new x500<>();
    public final Path f;
    public final xky g;
    public final RectF h;
    public final ArrayList i;
    public final GradientType j;
    public final cbu k;
    public final u9x l;
    public final llb0 m;
    public final llb0 n;

    @Nullable
    public pjr0 o;

    @Nullable
    public pjr0 p;
    public final k800 q;
    public final int r;

    @Nullable
    public tf6<Float, Float> s;
    public float t;

    public gbu(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar, fbu fbuVar) {
        Path path = new Path();
        this.f = path;
        this.g = new xky(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = aVar;
        this.a = fbuVar.g;
        this.b = fbuVar.h;
        this.q = k800Var;
        this.j = fbuVar.a;
        path.setFillType(fbuVar.b);
        this.r = (int) (i700Var.b() / 32.0f);
        tf6<abu, abu> j = fbuVar.c.j();
        this.k = (cbu) j;
        j.a(this);
        aVar.h(j);
        tf6<Integer, Integer> j2 = fbuVar.d.j();
        this.l = (u9x) j2;
        j2.a(this);
        aVar.h(j2);
        tf6<PointF, PointF> j3 = fbuVar.e.j();
        this.m = (llb0) j3;
        j3.a(this);
        aVar.h(j3);
        tf6<PointF, PointF> j4 = fbuVar.f.j();
        this.n = (llb0) j4;
        j4.a(this);
        aVar.h(j4);
        if (aVar.l() != null) {
            hqr j5 = ((nf2) aVar.l().b).j();
            this.s = j5;
            j5.a(this);
            aVar.h(this.s);
        }
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
        for (int i = 0; i < list2.size(); i++) {
            gfj gfjVar = list2.get(i);
            if (gfjVar instanceof gq90) {
                this.i.add((gq90) gfjVar);
            }
        }
    }

    @Override // xsna.vdy
    public final void d(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
        ls20.g(udyVar, i, arrayList, udyVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.plo
    public final void e(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        float[] fArr;
        int[] iArr;
        Shader shader;
        int[] iArr2;
        if (this.b) {
            return;
        }
        AsyncUpdates asyncUpdates = tky.a;
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((gq90) arrayList.get(i2)).getPath(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        GradientType gradientType = this.j;
        GradientType gradientType2 = GradientType.LINEAR;
        cbu cbuVar = this.k;
        llb0 llb0Var = this.n;
        llb0 llb0Var2 = this.m;
        if (gradientType == gradientType2) {
            long j = j();
            x500<LinearGradient> x500Var = this.d;
            shader = (LinearGradient) x500Var.get(j);
            if (shader == null) {
                PointF f = llb0Var2.f();
                PointF f2 = llb0Var.f();
                abu f3 = cbuVar.f();
                int[] h = h(f3.b);
                float[] fArr2 = f3.a;
                if (h.length < 2) {
                    int[] iArr3 = {h[0], h[0]};
                    fArr2 = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
                    iArr2 = iArr3;
                } else {
                    iArr2 = h;
                }
                shader = new LinearGradient(f.x, f.y, f2.x, f2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                x500Var.put(j, shader);
            }
        } else {
            long j2 = j();
            x500<RadialGradient> x500Var2 = this.e;
            RadialGradient radialGradient = x500Var2.get(j2);
            if (radialGradient != null) {
                shader = radialGradient;
            } else {
                PointF f4 = llb0Var2.f();
                PointF f5 = llb0Var.f();
                abu f6 = cbuVar.f();
                int[] h2 = h(f6.b);
                float[] fArr3 = f6.a;
                if (h2.length < 2) {
                    iArr = new int[]{h2[0], h2[0]};
                    fArr = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = h2;
                }
                float f7 = f4.x;
                float f8 = f4.y;
                float hypot = (float) Math.hypot(f5.x - f7, f5.y - f8);
                if (hypot <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f7, f8, hypot, iArr, fArr, Shader.TileMode.CLAMP);
                x500Var2.put(j2, radialGradient2);
                shader = radialGradient2;
            }
        }
        shader.setLocalMatrix(matrix);
        xky xkyVar = this.g;
        xkyVar.setShader(shader);
        pjr0 pjr0Var = this.o;
        if (pjr0Var != null) {
            xkyVar.setColorFilter((ColorFilter) pjr0Var.f());
        }
        tf6<Float, Float> tf6Var = this.s;
        if (tf6Var != null) {
            float floatValue = tf6Var.f().floatValue();
            if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                xkyVar.setMaskFilter(null);
            } else if (floatValue != this.t) {
                xkyVar.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = floatValue;
        }
        float intValue = this.l.f().intValue() / 100.0f;
        xkyVar.setAlpha(ls20.c((int) (i * intValue)));
        if (aVar != null) {
            aVar.a((int) (intValue * 255.0f), xkyVar);
        }
        canvas.drawPath(path, xkyVar);
        AsyncUpdates asyncUpdates2 = tky.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        PointF pointF = t800.a;
        if (t == 4) {
            this.l.k(a900Var);
            return;
        }
        ColorFilter colorFilter = t800.I;
        com.airbnb.lottie.model.layer.a aVar = this.c;
        if (t == colorFilter) {
            pjr0 pjr0Var = this.o;
            if (pjr0Var != null) {
                aVar.o(pjr0Var);
            }
            if (a900Var == null) {
                this.o = null;
                return;
            }
            pjr0 pjr0Var2 = new pjr0(null, a900Var);
            this.o = pjr0Var2;
            pjr0Var2.a(this);
            aVar.h(this.o);
            return;
        }
        if (t != t800.J) {
            if (t == t800.e) {
                tf6<Float, Float> tf6Var = this.s;
                if (tf6Var != null) {
                    tf6Var.k(a900Var);
                    return;
                }
                pjr0 pjr0Var3 = new pjr0(null, a900Var);
                this.s = pjr0Var3;
                pjr0Var3.a(this);
                aVar.h(this.s);
                return;
            }
            return;
        }
        pjr0 pjr0Var4 = this.p;
        if (pjr0Var4 != null) {
            aVar.o(pjr0Var4);
        }
        if (a900Var == null) {
            this.p = null;
            return;
        }
        this.d.clear();
        this.e.clear();
        pjr0 pjr0Var5 = new pjr0(null, a900Var);
        this.p = pjr0Var5;
        pjr0Var5.a(this);
        aVar.h(this.p);
    }

    @Override // xsna.plo
    public final void g(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((gq90) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    @Override // xsna.gfj
    public final String getName() {
        return this.a;
    }

    public final int[] h(int[] iArr) {
        pjr0 pjr0Var = this.p;
        if (pjr0Var != null) {
            Integer[] numArr = (Integer[]) pjr0Var.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.q.invalidateSelf();
    }

    public final int j() {
        float f = this.m.d;
        float f2 = this.r;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.n.d * f2);
        int round3 = Math.round(this.k.d * f2);
        int i = round != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
