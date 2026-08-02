package xsna;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.tf6;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes12.dex */
public abstract class ro6 implements tf6.a, wdy, plo {
    public final k800 e;
    public final com.airbnb.lottie.model.layer.a f;
    public final float[] h;
    public final xky i;
    public final hqr j;
    public final u9x k;
    public final ArrayList l;

    @Nullable
    public final hqr m;

    @Nullable
    public pjr0 n;

    @Nullable
    public tf6<Float, Float> o;
    public float p;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    public static final class a {
        public final ArrayList a = new ArrayList();

        @Nullable
        public final arp0 b;

        public a(arp0 arp0Var) {
            this.b = arp0Var;
        }
    }

    public ro6(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f, pf2 pf2Var, nf2 nf2Var, ArrayList arrayList, nf2 nf2Var2) {
        xky xkyVar = new xky(1);
        this.i = xkyVar;
        this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = k800Var;
        this.f = aVar;
        xkyVar.setStyle(Paint.Style.STROKE);
        xkyVar.setStrokeCap(cap);
        xkyVar.setStrokeJoin(join);
        xkyVar.setStrokeMiter(f);
        this.k = (u9x) pf2Var.j();
        this.j = nf2Var.j();
        if (nf2Var2 == null) {
            this.m = null;
        } else {
            this.m = nf2Var2.j();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((nf2) arrayList.get(i)).j());
        }
        aVar.h(this.k);
        aVar.h(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            aVar.h((tf6) this.l.get(i2));
        }
        hqr hqrVar = this.m;
        if (hqrVar != null) {
            aVar.h(hqrVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((tf6) this.l.get(i3)).a(this);
        }
        hqr hqrVar2 = this.m;
        if (hqrVar2 != null) {
            hqrVar2.a(this);
        }
        if (aVar.l() != null) {
            hqr j = ((nf2) aVar.l().b).j();
            this.o = j;
            j.a(this);
            aVar.h(this.o);
        }
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        arp0 arp0Var = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            gfj gfjVar = (gfj) arrayList2.get(size);
            if (gfjVar instanceof arp0) {
                arp0 arp0Var2 = (arp0) gfjVar;
                if (arp0Var2.c == ShapeTrimPath.Type.INDIVIDUALLY) {
                    arp0Var = arp0Var2;
                }
            }
        }
        if (arp0Var != null) {
            arp0Var.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            gfj gfjVar2 = list2.get(size2);
            if (gfjVar2 instanceof arp0) {
                arp0 arp0Var3 = (arp0) gfjVar2;
                if (arp0Var3.c == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(arp0Var3);
                    arp0Var3.d(this);
                    aVar = aVar2;
                }
            }
            if (gfjVar2 instanceof gq90) {
                if (aVar == null) {
                    aVar = new a(arp0Var);
                }
                aVar.a.add((gq90) gfjVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    @Override // xsna.vdy
    public final void d(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
        ls20.g(udyVar, i, arrayList, udyVar2, this);
    }

    public void e(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        int i2;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        ro6 ro6Var = this;
        AsyncUpdates asyncUpdates = tky.a;
        float[] fArr2 = b3r0.e.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i3 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f = 100.0f;
        float intValue = ro6Var.k.f().intValue() / 100.0f;
        int c = ls20.c((int) (i * intValue));
        xky xkyVar = ro6Var.i;
        xkyVar.setAlpha(c);
        xkyVar.setStrokeWidth(ro6Var.j.m());
        if (xkyVar.getStrokeWidth() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        ArrayList arrayList = ro6Var.l;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = ro6Var.h;
                if (i4 >= size) {
                    break;
                }
                float floatValue = ((Float) ((tf6) arrayList.get(i4)).f()).floatValue();
                fArr[i4] = floatValue;
                if (i4 % 2 == 0) {
                    if (floatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (floatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                i4++;
            }
            hqr hqrVar = ro6Var.m;
            xkyVar.setPathEffect(new DashPathEffect(fArr, hqrVar == null ? 0.0f : hqrVar.f().floatValue()));
            AsyncUpdates asyncUpdates2 = tky.a;
        }
        pjr0 pjr0Var = ro6Var.n;
        if (pjr0Var != null) {
            xkyVar.setColorFilter((ColorFilter) pjr0Var.f());
        }
        tf6<Float, Float> tf6Var = ro6Var.o;
        if (tf6Var != null) {
            float floatValue2 = tf6Var.f().floatValue();
            if (floatValue2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                xkyVar.setMaskFilter(null);
            } else if (floatValue2 != ro6Var.p) {
                com.airbnb.lottie.model.layer.a aVar2 = ro6Var.f;
                if (aVar2.A == floatValue2) {
                    blurMaskFilter = aVar2.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    aVar2.B = blurMaskFilter2;
                    aVar2.A = floatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                xkyVar.setMaskFilter(blurMaskFilter);
            }
            ro6Var.p = floatValue2;
        }
        if (aVar != null) {
            aVar.a((int) (intValue * 255.0f), xkyVar);
        }
        canvas.save();
        canvas.concat(matrix);
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = ro6Var.g;
            if (i5 >= arrayList2.size()) {
                canvas.restore();
                AsyncUpdates asyncUpdates3 = tky.a;
                return;
            }
            a aVar3 = (a) arrayList2.get(i5);
            arp0 arp0Var = aVar3.b;
            ArrayList arrayList3 = aVar3.a;
            Path path = ro6Var.b;
            if (arp0Var != null) {
                AsyncUpdates asyncUpdates4 = tky.a;
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((gq90) arrayList3.get(size2)).getPath());
                }
                float floatValue3 = arp0Var.d.f().floatValue() / f;
                float floatValue4 = arp0Var.e.f().floatValue() / f;
                float floatValue5 = arp0Var.f.f().floatValue() / 360.0f;
                if (floatValue3 >= 0.01f || floatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = ro6Var.a;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f2 = floatValue5 * length;
                    float f3 = (floatValue3 * length) + f2;
                    float min = Math.min((floatValue4 * length) + f2, (f3 + length) - 1.0f);
                    int size3 = arrayList3.size() - i3;
                    float f4 = 0.0f;
                    while (size3 >= 0) {
                        int i6 = i3;
                        Path path2 = ((gq90) arrayList3.get(size3)).getPath();
                        Path path3 = ro6Var.c;
                        path3.set(path2);
                        pathMeasure.setPath(path3, z);
                        float length2 = pathMeasure.getLength();
                        if (min > length) {
                            float f5 = min - length;
                            if (f5 < f4 + length2 && f4 < f5) {
                                b3r0.a(path3, f3 > length ? (f3 - length) / length2 : 0.0f, Math.min(f5 / length2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                canvas.drawPath(path3, xkyVar);
                                f4 += length2;
                                size3--;
                                ro6Var = this;
                                i3 = i6;
                                z = false;
                            }
                        }
                        float f6 = f4 + length2;
                        if (f6 >= f3 && f4 <= min) {
                            if (f6 > min || f3 >= f4) {
                                b3r0.a(path3, f3 < f4 ? 0.0f : (f3 - f4) / length2, min > f6 ? 1.0f : (min - f4) / length2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                canvas.drawPath(path3, xkyVar);
                            } else {
                                canvas.drawPath(path3, xkyVar);
                            }
                        }
                        f4 += length2;
                        size3--;
                        ro6Var = this;
                        i3 = i6;
                        z = false;
                    }
                    i2 = i3;
                    AsyncUpdates asyncUpdates5 = tky.a;
                } else {
                    canvas.drawPath(path, xkyVar);
                    AsyncUpdates asyncUpdates6 = tky.a;
                    i2 = i3;
                }
            } else {
                i2 = i3;
                AsyncUpdates asyncUpdates7 = tky.a;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((gq90) arrayList3.get(size4)).getPath());
                }
                AsyncUpdates asyncUpdates8 = tky.a;
                canvas.drawPath(path, xkyVar);
            }
            i5++;
            ro6Var = this;
            i3 = i2;
            z = false;
            f = 100.0f;
        }
    }

    public <T> void f(T t, @Nullable a900<T> a900Var) {
        PointF pointF = t800.a;
        if (t == 4) {
            this.k.k(a900Var);
            return;
        }
        if (t == t800.q) {
            this.j.k(a900Var);
            return;
        }
        ColorFilter colorFilter = t800.I;
        com.airbnb.lottie.model.layer.a aVar = this.f;
        if (t == colorFilter) {
            pjr0 pjr0Var = this.n;
            if (pjr0Var != null) {
                aVar.o(pjr0Var);
            }
            if (a900Var == null) {
                this.n = null;
                return;
            }
            pjr0 pjr0Var2 = new pjr0(null, a900Var);
            this.n = pjr0Var2;
            pjr0Var2.a(this);
            aVar.h(this.n);
            return;
        }
        if (t == t800.e) {
            tf6<Float, Float> tf6Var = this.o;
            if (tf6Var != null) {
                tf6Var.k(a900Var);
                return;
            }
            pjr0 pjr0Var3 = new pjr0(null, a900Var);
            this.o = pjr0Var3;
            pjr0Var3.a(this);
            aVar.h(this.o);
        }
    }

    @Override // xsna.plo
    public final void g(RectF rectF, Matrix matrix, boolean z) {
        AsyncUpdates asyncUpdates = tky.a;
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float m = this.j.m() / 2.0f;
                rectF2.set(rectF2.left - m, rectF2.top - m, rectF2.right + m, rectF2.bottom + m);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                AsyncUpdates asyncUpdates2 = tky.a;
                return;
            }
            a aVar = (a) arrayList.get(i);
            for (int i2 = 0; i2 < aVar.a.size(); i2++) {
                path.addPath(((gq90) aVar.a.get(i2)).getPath(), matrix);
            }
            i++;
        }
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.e.invalidateSelf();
    }
}
