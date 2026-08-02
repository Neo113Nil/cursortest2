package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.utils.OffscreenLayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class eud extends l35 {
    public i35 C;
    public final ArrayList D;
    public final RectF E;
    public final RectF F;
    public final RectF G;
    public final OffscreenLayer H;
    public final OffscreenLayer.a I;
    public Boolean J;
    public Boolean K;
    public float L;
    public boolean M;
    public final bnm N;

    public eud(LottieDrawable lottieDrawable, mxx mxxVar, List list, nsz nszVar) {
        super(lottieDrawable, mxxVar);
        l35 l35Var;
        l35 uhr0Var;
        this.D = new ArrayList();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new OffscreenLayer();
        this.I = new OffscreenLayer.a();
        this.M = true;
        be2 be2Var = mxxVar.s;
        if (be2Var != null) {
            kor I = be2Var.I();
            this.C = I;
            c(I);
            this.C.a(this);
        } else {
            this.C = null;
        }
        rnz rnzVar = new rnz(nszVar.j.size());
        int size = list.size() - 1;
        l35 l35Var2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < rnzVar.j(); i++) {
                    l35 l35Var3 = (l35) rnzVar.c(rnzVar.g(i));
                    if (l35Var3 != null && (l35Var = (l35) rnzVar.c(l35Var3.p.f)) != null) {
                        l35Var3.t = l35Var;
                    }
                }
                oo2 oo2Var = this.p.x;
                if (oo2Var != null) {
                    this.N = new bnm(this, this, oo2Var);
                    return;
                }
                return;
            }
            mxx mxxVar2 = (mxx) list.get(size);
            switch (k35.a[mxxVar2.e.ordinal()]) {
                case 1:
                    uhr0Var = new uhr0(lottieDrawable, mxxVar2, this, nszVar);
                    break;
                case 2:
                    uhr0Var = new eud(lottieDrawable, mxxVar2, (List) nszVar.c.get(mxxVar2.g), nszVar);
                    break;
                case 3:
                    uhr0Var = new c6t0(lottieDrawable, mxxVar2);
                    break;
                case 4:
                    uhr0Var = new jav(lottieDrawable, mxxVar2);
                    break;
                case 5:
                    uhr0Var = new dm60(lottieDrawable, mxxVar2);
                    break;
                case 6:
                    uhr0Var = new a(lottieDrawable, mxxVar2);
                    break;
                default:
                    lgz.b("Unknown layer type " + mxxVar2.e);
                    uhr0Var = null;
                    break;
            }
            if (uhr0Var != null) {
                rnzVar.h(uhr0Var.p.d, uhr0Var);
                if (l35Var2 != null) {
                    l35Var2.s = uhr0Var;
                    l35Var2 = null;
                } else {
                    this.D.add(0, uhr0Var);
                    int i2 = dud.a[mxxVar2.u.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        l35Var2 = uhr0Var;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.l35, defpackage.ccm
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.E;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((l35) arrayList.get(size)).b(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.l35, defpackage.tix
    public final void g(puz puzVar, Object obj) {
        super.g(puzVar, obj);
        if (obj == cuz.C) {
            if (puzVar == null) {
                i35 i35Var = this.C;
                if (i35Var != null) {
                    i35Var.k(null);
                    return;
                }
                return;
            }
            e131 e131Var = new e131(puzVar, null);
            this.C = e131Var;
            e131Var.a(this);
            c(this.C);
            return;
        }
        bnm bnmVar = this.N;
        if (obj == 5 && bnmVar != null) {
            bnmVar.b(puzVar);
            return;
        }
        if (obj == cuz.E && bnmVar != null) {
            bnmVar.f(puzVar);
            return;
        }
        if (obj == cuz.F && bnmVar != null) {
            bnmVar.c(puzVar);
            return;
        }
        if (obj == cuz.G && bnmVar != null) {
            bnmVar.e(puzVar);
        } else {
            if (obj != cuz.H || bnmVar == null) {
                return;
            }
            bnmVar.g(puzVar);
        }
    }

    @Override // defpackage.l35
    public final void i(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.a aVar) {
        Canvas canvas2;
        AsyncUpdates asyncUpdates = upx.a;
        boolean z = false;
        bnm bnmVar = this.N;
        boolean z2 = (aVar == null && bnmVar == null) ? false : true;
        LottieDrawable lottieDrawable = this.o;
        boolean isApplyingOpacityToLayersEnabled = lottieDrawable.isApplyingOpacityToLayersEnabled();
        ArrayList arrayList = this.D;
        if ((isApplyingOpacityToLayersEnabled && arrayList.size() > 1 && i != 255) || (z2 && lottieDrawable.isApplyingShadowToLayersEnabled())) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (bnmVar != null) {
            aVar = bnmVar.a(matrix, i2);
        }
        boolean z3 = this.M;
        mxx mxxVar = this.p;
        RectF rectF = this.F;
        if (z3 || !"__container".equals(mxxVar.c)) {
            rectF.set(0.0f, 0.0f, mxxVar.o, mxxVar.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l35 l35Var = (l35) it.next();
                RectF rectF2 = this.G;
                l35Var.b(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        OffscreenLayer offscreenLayer = this.H;
        if (z) {
            OffscreenLayer.a aVar2 = this.I;
            aVar2.b = null;
            aVar2.a = i;
            if (aVar != null) {
                if (Color.alpha(aVar.d) > 0) {
                    aVar2.b = aVar;
                } else {
                    aVar2.b = null;
                }
                aVar = null;
            }
            canvas2 = offscreenLayer.e(canvas, rectF, aVar2);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((l35) arrayList.get(size)).f(canvas2, matrix, i2, aVar);
            }
        }
        if (z) {
            offscreenLayer.c();
        }
        canvas.restore();
        AsyncUpdates asyncUpdates2 = upx.a;
    }

    @Override // defpackage.l35
    public final void n(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.D;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((l35) arrayList2.get(i2)).a(sixVar, i, arrayList, sixVar2);
            i2++;
        }
    }

    @Override // defpackage.l35
    public final void o(boolean z) {
        super.o(z);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((l35) it.next()).o(z);
        }
    }

    @Override // defpackage.l35
    public final void p(float f) {
        AsyncUpdates asyncUpdates = upx.a;
        this.L = f;
        super.p(f);
        i35 i35Var = this.C;
        mxx mxxVar = this.p;
        if (i35Var != null) {
            nsz composition = this.o.getComposition();
            f = ((((Float) this.C.f()).floatValue() * mxxVar.b.n) - mxxVar.b.l) / ((composition.m - composition.l) + 0.01f);
        }
        if (this.C == null) {
            float f2 = mxxVar.n;
            nsz nszVar = mxxVar.b;
            f -= f2 / (nszVar.m - nszVar.l);
        }
        if (mxxVar.m != 0.0f && !"__container".equals(mxxVar.c)) {
            f /= mxxVar.m;
        }
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((l35) arrayList.get(size)).p(f);
        }
        AsyncUpdates asyncUpdates2 = upx.a;
    }

    public final boolean q() {
        if (this.K == null) {
            ArrayList arrayList = this.D;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                l35 l35Var = (l35) arrayList.get(size);
                if (l35Var instanceof uhr0) {
                    if (l35Var.k()) {
                        this.K = Boolean.TRUE;
                        return true;
                    }
                } else if ((l35Var instanceof eud) && ((eud) l35Var).q()) {
                    this.K = Boolean.TRUE;
                    return true;
                }
            }
            this.K = Boolean.FALSE;
        }
        return this.K.booleanValue();
    }
}
