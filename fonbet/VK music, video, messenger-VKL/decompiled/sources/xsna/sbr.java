package xsna;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.AsyncUpdates;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.tf6;

/* compiled from: FillContent.java */
/* loaded from: classes12.dex */
public final class sbr implements plo, tf6.a, wdy {
    public final Path a;
    public final xky b;
    public final com.airbnb.lottie.model.layer.a c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final u6g g;
    public final u9x h;

    @Nullable
    public pjr0 i;
    public final k800 j;

    @Nullable
    public tf6<Float, Float> k;
    public float l;

    public sbr(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, y5j0 y5j0Var) {
        Path path = new Path();
        this.a = path;
        this.b = new xky(1);
        this.f = new ArrayList();
        this.c = aVar;
        String str = y5j0Var.c;
        pf2 pf2Var = y5j0Var.e;
        mf2 mf2Var = y5j0Var.d;
        this.d = str;
        this.e = y5j0Var.f;
        this.j = k800Var;
        if (aVar.l() != null) {
            hqr j = ((nf2) aVar.l().b).j();
            this.k = j;
            j.a(this);
            aVar.h(this.k);
        }
        if (mf2Var == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(y5j0Var.b);
        tf6<Integer, Integer> j2 = mf2Var.j();
        this.g = (u6g) j2;
        j2.a(this);
        aVar.h(j2);
        tf6<Integer, Integer> j3 = pf2Var.j();
        this.h = (u9x) j3;
        j3.a(this);
        aVar.h(j3);
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
        for (int i = 0; i < list2.size(); i++) {
            gfj gfjVar = list2.get(i);
            if (gfjVar instanceof gq90) {
                this.f.add((gq90) gfjVar);
            }
        }
    }

    @Override // xsna.vdy
    public final void d(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
        ls20.g(udyVar, i, arrayList, udyVar2, this);
    }

    @Override // xsna.plo
    public final void e(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        AsyncUpdates asyncUpdates = tky.a;
        u6g u6gVar = this.g;
        float intValue = this.h.f().intValue() / 100.0f;
        int c = (ls20.c((int) (i * intValue)) << 24) | (u6gVar.m(u6gVar.b(), u6gVar.d()) & 16777215);
        xky xkyVar = this.b;
        xkyVar.setColor(c);
        pjr0 pjr0Var = this.i;
        if (pjr0Var != null) {
            xkyVar.setColorFilter((ColorFilter) pjr0Var.f());
        }
        tf6<Float, Float> tf6Var = this.k;
        if (tf6Var != null) {
            float floatValue = tf6Var.f().floatValue();
            if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                xkyVar.setMaskFilter(null);
            } else if (floatValue != this.l) {
                com.airbnb.lottie.model.layer.a aVar2 = this.c;
                if (aVar2.A == floatValue) {
                    blurMaskFilter = aVar2.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    aVar2.B = blurMaskFilter2;
                    aVar2.A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                xkyVar.setMaskFilter(blurMaskFilter);
            }
            this.l = floatValue;
        }
        if (aVar != null) {
            aVar.a((int) (intValue * 255.0f), xkyVar);
        } else {
            xkyVar.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, xkyVar);
                AsyncUpdates asyncUpdates2 = tky.a;
                return;
            } else {
                path.addPath(((gq90) arrayList.get(i2)).getPath(), matrix);
                i2++;
            }
        }
    }

    @Override // xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        PointF pointF = t800.a;
        if (t == 1) {
            this.g.k(a900Var);
            return;
        }
        if (t == 4) {
            this.h.k(a900Var);
            return;
        }
        ColorFilter colorFilter = t800.I;
        com.airbnb.lottie.model.layer.a aVar = this.c;
        if (t == colorFilter) {
            pjr0 pjr0Var = this.i;
            if (pjr0Var != null) {
                aVar.o(pjr0Var);
            }
            if (a900Var == null) {
                this.i = null;
                return;
            }
            pjr0 pjr0Var2 = new pjr0(null, a900Var);
            this.i = pjr0Var2;
            pjr0Var2.a(this);
            aVar.h(this.i);
            return;
        }
        if (t == t800.e) {
            tf6<Float, Float> tf6Var = this.k;
            if (tf6Var != null) {
                tf6Var.k(a900Var);
                return;
            }
            pjr0 pjr0Var3 = new pjr0(null, a900Var);
            this.k = pjr0Var3;
            pjr0Var3.a(this);
            aVar.h(this.k);
        }
    }

    @Override // xsna.plo
    public final void g(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
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
        return this.d;
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.j.invalidateSelf();
    }
}
