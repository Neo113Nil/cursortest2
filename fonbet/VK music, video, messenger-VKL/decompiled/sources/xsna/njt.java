package xsna;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.f5h0;

/* compiled from: GenericDraweeHierarchy.java */
/* loaded from: classes.dex */
public final class njt implements kzi0 {
    public final ColorDrawable a;
    public final Resources b;
    public RoundingParams c;
    public final gmg0 d;
    public final liq e;
    public final j9s f;

    public njt(ojt ojtVar) {
        int i;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.a = colorDrawable;
        if (lhs.d()) {
            lhs.a("GenericDraweeHierarchy()");
        }
        this.b = ojtVar.a;
        this.c = ojtVar.q;
        j9s j9sVar = new j9s(colorDrawable);
        this.f = j9sVar;
        List<Drawable> list = ojtVar.o;
        int size = list != null ? list.size() : 1;
        int i2 = (size == 0 ? 1 : size) + (ojtVar.p != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i2 + 6];
        drawableArr[0] = g(ojtVar.n, null);
        drawableArr[1] = g(ojtVar.d, ojtVar.e);
        f5h0.d dVar = ojtVar.l;
        PointF pointF = ojtVar.m;
        j9sVar.setColorFilter(null);
        drawableArr[2] = com.facebook.drawee.generic.a.e(j9sVar, dVar, pointF);
        drawableArr[3] = g(ojtVar.j, ojtVar.k);
        drawableArr[4] = g(ojtVar.f, ojtVar.g);
        drawableArr[5] = g(ojtVar.h, ojtVar.i);
        if (i2 > 0) {
            List<Drawable> list2 = ojtVar.o;
            if (list2 != null) {
                Iterator<Drawable> it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    drawableArr[i + 6] = g(it.next(), null);
                    i++;
                }
            } else {
                i = 1;
            }
            StateListDrawable stateListDrawable = ojtVar.p;
            if (stateListDrawable != null) {
                drawableArr[i + 6] = g(stateListDrawable, null);
            }
        }
        liq liqVar = new liq(drawableArr);
        this.e = liqVar;
        liqVar.m = ojtVar.b;
        if (liqVar.l == 1) {
            liqVar.l = 0;
        }
        gmg0 gmg0Var = new gmg0(com.facebook.drawee.generic.a.d(liqVar, this.c));
        gmg0Var.f = null;
        this.d = gmg0Var;
        gmg0Var.mutate();
        m();
        if (lhs.d()) {
            lhs.b();
        }
    }

    @Override // xsna.elo
    public final gmg0 a() {
        return this.d;
    }

    @Override // xsna.kzi0
    public final void b() {
        liq liqVar = this.e;
        liqVar.s++;
        i();
        if (liqVar.a(5) != null) {
            h(5);
        } else {
            h(1);
        }
        liqVar.e();
    }

    @Override // xsna.kzi0
    public final void c(float f, boolean z) {
        liq liqVar = this.e;
        if (liqVar.a(3) == null) {
            return;
        }
        liqVar.s++;
        t(f);
        if (z) {
            liqVar.f();
        }
        liqVar.e();
    }

    @Override // xsna.kzi0
    public final void d(Drawable drawable, float f, boolean z) {
        Drawable c = com.facebook.drawee.generic.a.c(drawable, this.c, this.b);
        c.mutate();
        this.f.p(c);
        liq liqVar = this.e;
        liqVar.s++;
        i();
        h(2);
        t(f);
        if (z) {
            liqVar.f();
        }
        liqVar.e();
    }

    @Override // xsna.kzi0
    public final void e(q2l q2lVar) {
        gmg0 gmg0Var = this.d;
        gmg0Var.f = q2lVar;
        gmg0Var.invalidateSelf();
    }

    @Override // xsna.kzi0
    public final void f() {
        liq liqVar = this.e;
        liqVar.s++;
        i();
        if (liqVar.a(4) != null) {
            h(4);
        } else {
            h(1);
        }
        liqVar.e();
    }

    public final Drawable g(Drawable drawable, f5h0.d dVar) {
        return com.facebook.drawee.generic.a.e(com.facebook.drawee.generic.a.c(drawable, this.c, this.b), dVar, null);
    }

    @Override // xsna.elo
    public final Rect getBounds() {
        return this.d.getBounds();
    }

    public final void h(int i) {
        if (i >= 0) {
            liq liqVar = this.e;
            liqVar.l = 0;
            liqVar.r[i] = true;
            liqVar.invalidateSelf();
        }
    }

    public final void i() {
        j(1);
        j(2);
        j(3);
        j(4);
        j(5);
    }

    public final void j(int i) {
        if (i >= 0) {
            liq liqVar = this.e;
            liqVar.l = 0;
            liqVar.r[i] = false;
            liqVar.invalidateSelf();
        }
    }

    public final ako k(int i) {
        liq liqVar = this.e;
        ako[] akoVarArr = liqVar.e;
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i < akoVarArr.length)) {
            throw new IllegalArgumentException();
        }
        if (akoVarArr[i] == null) {
            akoVarArr[i] = new tk3(liqVar, i);
        }
        ako akoVar = akoVarArr[i];
        if (akoVar.l() instanceof jn10) {
            akoVar = (jn10) akoVar.l();
        }
        return akoVar.l() instanceof a5h0 ? (a5h0) akoVar.l() : akoVar;
    }

    public final a5h0 l(int i) {
        ako k = k(i);
        if (k instanceof a5h0) {
            return (a5h0) k;
        }
        Drawable e = com.facebook.drawee.generic.a.e(k.d(com.facebook.drawee.generic.a.a), f5h0.m.a, null);
        k.d(e);
        sex0.e(e, "Parent has no child drawable!");
        return (a5h0) e;
    }

    public final void m() {
        liq liqVar = this.e;
        if (liqVar != null) {
            liqVar.s++;
            liqVar.l = 0;
            Arrays.fill(liqVar.r, true);
            liqVar.invalidateSelf();
            i();
            h(1);
            liqVar.f();
            liqVar.e();
        }
    }

    public final void n(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    public final void o(f5h0.d dVar) {
        dVar.getClass();
        l(2).t(dVar);
    }

    public final void p(Drawable drawable, int i) {
        if (drawable == null) {
            this.e.d(null, i);
        } else {
            k(i).d(com.facebook.drawee.generic.a.c(drawable, this.c, this.b));
        }
    }

    public final void q(int i) {
        liq liqVar = this.e;
        liqVar.m = i;
        if (liqVar.l == 1) {
            liqVar.l = 0;
        }
    }

    public final void r(Drawable drawable, int i) {
        sex0.b("The given index does not correspond to an overlay image.", i >= 0 && i + 6 < this.e.d.length);
        p(drawable, i + 6);
    }

    @Override // xsna.kzi0
    public final void reset() {
        this.f.p(this.a);
        m();
    }

    public final void s(Drawable drawable, f5h0.d dVar) {
        p(drawable, 1);
        l(1).t(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(float f) {
        Drawable a = this.e.a(3);
        if (a == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (a instanceof Animatable) {
                ((Animatable) a).stop();
            }
            j(3);
        } else {
            if (a instanceof Animatable) {
                ((Animatable) a).start();
            }
            h(3);
        }
        a.setLevel(Math.round(f * 10000.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(RoundingParams roundingParams) {
        this.c = roundingParams;
        ColorDrawable colorDrawable = com.facebook.drawee.generic.a.a;
        gmg0 gmg0Var = this.d;
        Drawable drawable = gmg0Var.b;
        if (roundingParams == null || roundingParams.a != RoundingParams.RoundingMethod.OVERLAY_COLOR) {
            if (drawable instanceof RoundedCornersDrawable) {
                gmg0Var.p(((RoundedCornersDrawable) drawable).p(colorDrawable));
                colorDrawable.setCallback(null);
            }
        } else if (drawable instanceof RoundedCornersDrawable) {
            RoundedCornersDrawable roundedCornersDrawable = (RoundedCornersDrawable) drawable;
            com.facebook.drawee.generic.a.b(roundedCornersDrawable, roundingParams);
            roundedCornersDrawable.p = roundingParams.d;
            roundedCornersDrawable.invalidateSelf();
        } else {
            gmg0Var.p(com.facebook.drawee.generic.a.d(gmg0Var.p(colorDrawable), roundingParams));
        }
        for (int i = 0; i < this.e.d.length; i++) {
            ako k = k(i);
            RoundingParams roundingParams2 = this.c;
            while (true) {
                Object l = k.l();
                if (l == k || !(l instanceof ako)) {
                    break;
                } else {
                    k = (ako) l;
                }
            }
            Drawable l2 = k.l();
            if (roundingParams2 == null || roundingParams2.a != RoundingParams.RoundingMethod.BITMAP_ONLY) {
                if (l2 instanceof jog0) {
                    jog0 jog0Var = (jog0) l2;
                    jog0Var.f(false);
                    jog0Var.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    jog0Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    jog0Var.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    jog0Var.n(false);
                    jog0Var.e(false);
                    int i2 = log0.J;
                    jog0Var.k();
                }
            } else if (l2 instanceof jog0) {
                com.facebook.drawee.generic.a.b((jog0) l2, roundingParams2);
            } else if (l2 != 0) {
                k.d(com.facebook.drawee.generic.a.a);
                k.d(com.facebook.drawee.generic.a.a(l2, roundingParams2, this.b));
            }
        }
    }
}
