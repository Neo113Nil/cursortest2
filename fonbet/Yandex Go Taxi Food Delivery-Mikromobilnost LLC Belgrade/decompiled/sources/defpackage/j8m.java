package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.recyclerview.widget.ItemTouchHelper$Callback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.x0;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes3.dex */
public final class j8m extends ItemTouchHelper$Callback {
    public final RecyclerView d;
    public final float e;
    public final wls f;
    public final sls g;
    public final tls h;
    public final sls i;
    public final qa3 j;
    public final t3c0 k;
    public final sls l;
    public final sls m;
    public final boolean n;
    public final f8m o = new f8m();
    public final AccelerateDecelerateInterpolator p = new AccelerateDecelerateInterpolator();
    public boolean q;
    public View r;
    public RecyclerView s;
    public float t;
    public float u;
    public final i3y v;
    public final i3y w;
    public final i8m x;

    public j8m(RecyclerView recyclerView, float f, wls wlsVar, sls slsVar, tls tlsVar, sls slsVar2, qa3 qa3Var, t3c0 t3c0Var, sls slsVar3, sls slsVar4, boolean z) {
        this.d = recyclerView;
        this.e = f;
        this.f = wlsVar;
        this.g = slsVar;
        this.h = tlsVar;
        this.i = slsVar2;
        this.j = qa3Var;
        this.k = t3c0Var;
        this.l = slsVar3;
        this.m = slsVar4;
        this.n = z;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.v = a.b(lazyThreadSafetyMode, new sls(this) { // from class: h8m
            public final /* synthetic */ j8m b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                float f2;
                float f3;
                int i2 = i;
                j8m j8mVar = this.b;
                switch (i2) {
                    case 0:
                        f2 = j8mVar.d.getResources().getDisplayMetrics().density;
                        f3 = 80.0f;
                        break;
                    default:
                        f2 = j8mVar.d.getResources().getDisplayMetrics().density;
                        f3 = 12.0f;
                        break;
                }
                return Integer.valueOf((int) (f2 * f3));
            }
        });
        final int i2 = 1;
        this.w = a.b(lazyThreadSafetyMode, new sls(this) { // from class: h8m
            public final /* synthetic */ j8m b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                float f2;
                float f3;
                int i22 = i2;
                j8m j8mVar = this.b;
                switch (i22) {
                    case 0:
                        f2 = j8mVar.d.getResources().getDisplayMetrics().density;
                        f3 = 80.0f;
                        break;
                    default:
                        f2 = j8mVar.d.getResources().getDisplayMetrics().density;
                        f3 = 12.0f;
                        break;
                }
                return Integer.valueOf((int) (f2 * f3));
            }
        });
        this.x = new i8m(i, this);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void b(RecyclerView recyclerView, x0 x0Var) {
        View view = x0Var.a;
        Object tag = view.getTag(xbh0.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = b.a;
            ViewCompat$Api21Impl.m(view, floatValue);
        }
        view.setTag(xbh0.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.x);
        }
        this.r = null;
        this.s = null;
        this.u = 0.0f;
        this.t = 0.0f;
        CardView cardView = view instanceof CardView ? (CardView) view : null;
        if (cardView != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(this.p);
            this.o.getClass();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cardView, (Property<CardView, Float>) View.SCALE_X, cardView.getScaleX(), 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cardView, (Property<CardView, Float>) View.SCALE_Y, cardView.getScaleX(), 1.0f);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(cardView.getCardElevation(), 0.0f);
            ofFloat3.addUpdateListener(new yi(23, cardView));
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
            animatorSet.start();
        }
        t3c0 t3c0Var = this.k;
        t3c0Var.b = false;
        t3c0Var.c = null;
        this.g.invoke();
        recyclerView.post(new uxh(25, recyclerView));
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final int e(x0 x0Var) {
        return q(x0Var.E()) ? ItemTouchHelper$Callback.k(15, 0) : ItemTouchHelper$Callback.k(0, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final int h(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        if (!this.n) {
            return 0;
        }
        this.l.invoke();
        return super.h(recyclerView, i, i2, i3, j);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final boolean j() {
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void l(Canvas canvas, RecyclerView recyclerView, x0 x0Var, float f, float f2, int i, boolean z) {
        View view = x0Var.a;
        if (f2 != this.t) {
            this.u = 0.0f;
        }
        this.t = f2;
        float f3 = f2 + this.u;
        if (z) {
            int height = recyclerView.getHeight();
            int top = view.getTop();
            int bottom = view.getBottom();
            float f4 = (bottom - top) * this.e;
            float f5 = ((-f4) - top) - f3;
            float f6 = (bottom + f3) - (height + f4);
            if (f5 > 0.0f) {
                f3 += f5;
            } else if (f6 > 0.0f) {
                f3 -= f6;
            }
        }
        y9b1.d(recyclerView, view, f, f3, z);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final boolean m(RecyclerView recyclerView, x0 x0Var, x0 x0Var2) {
        if (!q(x0Var2.E()) || this.q) {
            return false;
        }
        this.q = true;
        Integer valueOf = Integer.valueOf(x0Var2.E());
        t3c0 t3c0Var = this.k;
        t3c0Var.b = true;
        t3c0Var.c = valueOf;
        x0Var2.a.invalidate();
        int E = x0Var.E();
        int E2 = x0Var2.E();
        if (q(E2)) {
            this.f.invoke(Integer.valueOf(E), Integer.valueOf(E2));
        }
        recyclerView.postDelayed(new uxh(26, this), 100L);
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void o(x0 x0Var, int i) {
        View view;
        if (x0Var != null) {
            this.d.setItemAnimator(new h());
        }
        if (x0Var != null) {
            this.h.invoke(Integer.valueOf(x0Var.E()));
        }
        if (i == 2) {
            this.i.invoke();
            if (x0Var != null && (view = x0Var.a) != null) {
                cg91.c(view, ok31.c);
            }
            if (x0Var == null) {
                return;
            }
            View view2 = x0Var.a;
            Integer valueOf = Integer.valueOf(x0Var.E());
            t3c0 t3c0Var = this.k;
            t3c0Var.b = true;
            t3c0Var.c = valueOf;
            view2.invalidate();
            CardView cardView = view2 instanceof CardView ? (CardView) view2 : null;
            if (cardView != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(300L);
                animatorSet.setInterpolator(this.p);
                this.o.getClass();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cardView, (Property<CardView, Float>) View.SCALE_X, cardView.getScaleX(), 1.02f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cardView, (Property<CardView, Float>) View.SCALE_Y, cardView.getScaleX(), 1.02f);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(cardView.getCardElevation(), 6.0f);
                ofFloat3.addUpdateListener(new yi(23, cardView));
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
                animatorSet.start();
            }
            RecyclerView recyclerView = (RecyclerView) this.m.invoke();
            if (recyclerView == null) {
                return;
            }
            this.r = view2;
            this.s = recyclerView;
            this.u = 0.0f;
            this.t = 0.0f;
            WeakHashMap weakHashMap = b.a;
            recyclerView.postOnAnimation(this.x);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void p(x0 x0Var, int i) {
    }

    public final boolean q(int i) {
        Object obj = this.j.b.f.get(i);
        aam aamVar = obj instanceof aam ? (aam) obj : null;
        if (aamVar != null) {
            return aamVar.a();
        }
        return false;
    }

    public final int r(int i, int i2) {
        int intValue = (int) (((Number) this.w.getValue()).intValue() * y6i0.c(i / i2, 0.0f, 1.0f));
        if (intValue < 1) {
            return 1;
        }
        return intValue;
    }
}
