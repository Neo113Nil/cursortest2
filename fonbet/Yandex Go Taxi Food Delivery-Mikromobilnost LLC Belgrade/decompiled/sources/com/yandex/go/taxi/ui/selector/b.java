package com.yandex.go.taxi.ui.selector;

import android.graphics.drawable.Drawable;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.bbx0;
import defpackage.bdc;
import defpackage.ena1;
import defpackage.evu0;
import defpackage.f1f0;
import defpackage.g18;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.lbm;
import defpackage.nac;
import defpackage.nn0;
import defpackage.npw0;
import defpackage.ny61;
import defpackage.on0;
import defpackage.pzt0;
import defpackage.q0f0;
import defpackage.r0f0;
import defpackage.s0f0;
import defpackage.t0f0;
import defpackage.tje;
import defpackage.w511;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class b {
    public final f1f0 a;
    public final bbx0 b;
    public final hbp0 c;
    public final RobotoTextView d;
    public final ViewStub e;
    public final ViewStub f;
    public final ViewStub g;
    public t0f0 i;
    public pzt0 j;
    public ena1 l;
    public g18 m;
    public RobotoTextView n;
    public AppCompatImageView o;
    public AppCompatImageView p;
    public final bdc h = new bdc(xng0.textMain);
    public int k = -1;

    public b(f1f0 f1f0Var, bbx0 bbx0Var, hbp0 hbp0Var, RobotoTextView robotoTextView, ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        this.a = f1f0Var;
        this.b = bbx0Var;
        this.c = hbp0Var;
        this.d = robotoTextView;
        this.e = viewStub;
        this.f = viewStub2;
        this.g = viewStub3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, FormattedText formattedText, ContinuationImpl continuationImpl) {
        OptimisedPriceViewHolder$applyPrice$1 optimisedPriceViewHolder$applyPrice$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof OptimisedPriceViewHolder$applyPrice$1) {
            optimisedPriceViewHolder$applyPrice$1 = (OptimisedPriceViewHolder$applyPrice$1) continuationImpl;
            int i2 = optimisedPriceViewHolder$applyPrice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                optimisedPriceViewHolder$applyPrice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = optimisedPriceViewHolder$applyPrice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = optimisedPriceViewHolder$applyPrice$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    optimisedPriceViewHolder$applyPrice$1.L$0 = null;
                    optimisedPriceViewHolder$applyPrice$1.L$1 = bVar;
                    optimisedPriceViewHolder$applyPrice$1.label = 1;
                    obj = bVar.f(formattedText, optimisedPriceViewHolder$applyPrice$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) optimisedPriceViewHolder$applyPrice$1.L$1;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                bdc bdcVar = bVar.h;
                RobotoTextView robotoTextView = bVar.d;
                if (bVar.k != 0) {
                    bVar.k = 0;
                    robotoTextView.setTextTypeface(0);
                }
                robotoTextView.setTextColor(bdcVar);
                robotoTextView.setVisibility(0);
                robotoTextView.setText(charSequence);
                return zy11.a;
            }
        }
        optimisedPriceViewHolder$applyPrice$1 = new OptimisedPriceViewHolder$applyPrice$1(bVar, continuationImpl);
        Object obj2 = optimisedPriceViewHolder$applyPrice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = optimisedPriceViewHolder$applyPrice$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        bdc bdcVar2 = bVar.h;
        RobotoTextView robotoTextView2 = bVar.d;
        if (bVar.k != 0) {
        }
        robotoTextView2.setTextColor(bdcVar2);
        robotoTextView2.setVisibility(0);
        robotoTextView2.setText(charSequence2);
        return zy11.a;
    }

    public final void b(String str) {
        if (str != null && !evu0.J(str) && this.n == null) {
            this.n = (RobotoTextView) this.e.inflate();
        }
        if (str == null || evu0.J(str)) {
            RobotoTextView robotoTextView = this.n;
            if (robotoTextView != null) {
                robotoTextView.setVisibility(8);
                return;
            }
            return;
        }
        RobotoTextView robotoTextView2 = this.n;
        if (robotoTextView2 != null) {
            robotoTextView2.setVisibility(0);
        }
        RobotoTextView robotoTextView3 = this.n;
        if (robotoTextView3 != null) {
            robotoTextView3.setText(str);
        }
        RobotoTextView robotoTextView4 = this.n;
        if (robotoTextView4 != null) {
            robotoTextView4.setForeground((Drawable) this.b.h.invoke());
        }
    }

    public final void c(ena1 ena1Var) {
        lbm a;
        if (jl40.l(this.l, ena1Var)) {
            return;
        }
        this.l = ena1Var;
        g18 g18Var = this.m;
        if (g18Var != null) {
            g18Var.cancel();
        }
        g18 g18Var2 = null;
        this.m = null;
        if (ena1Var != null && this.p == null) {
            this.p = (AppCompatImageView) this.g.inflate();
        }
        AppCompatImageView appCompatImageView = this.p;
        if (ena1Var == null) {
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
                return;
            }
            return;
        }
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
        }
        AppCompatImageView appCompatImageView2 = this.p;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(null);
        }
        if (ena1Var instanceof nn0) {
            AppCompatImageView appCompatImageView3 = this.p;
            if (appCompatImageView3 != null) {
                appCompatImageView3.setImageResource(((nn0) ena1Var).a);
                return;
            }
            return;
        }
        if (!(ena1Var instanceof on0)) {
            w511.b();
            return;
        }
        AppCompatImageView appCompatImageView4 = this.p;
        if (appCompatImageView4 != null && (a = this.a.b.a(appCompatImageView4)) != null) {
            g18Var2 = ((nac) a).c(((on0) ena1Var).a);
        }
        this.m = g18Var2;
    }

    public final void d(npw0 npw0Var) {
        if (npw0Var != null && this.o == null) {
            this.o = (AppCompatImageView) this.f.inflate();
        }
        AppCompatImageView appCompatImageView = this.o;
        if (npw0Var == null) {
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
                return;
            }
            return;
        }
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
        }
        AppCompatImageView appCompatImageView2 = this.o;
        if (appCompatImageView2 != null) {
            Drawable y = tje.y(npw0Var.a, appCompatImageView2.getContext());
            y.setTint(npw0Var.b);
            appCompatImageView2.setImageDrawable(y);
        }
    }

    public final void e(t0f0 t0f0Var) {
        if (jl40.l(t0f0Var, this.i)) {
            return;
        }
        this.i = t0f0Var;
        pzt0 pzt0Var = this.j;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.j = null;
        RobotoTextView robotoTextView = this.d;
        if (t0f0Var == null) {
            robotoTextView.setVisibility(8);
            b(null);
            c(null);
            d(null);
            return;
        }
        boolean z = t0f0Var instanceof r0f0;
        hbp0 hbp0Var = this.c;
        if (z) {
            this.j = hbp0.e(hbp0Var, null, null, new OptimisedPriceViewHolder$bindPrice$1(this, t0f0Var, null), 3);
            return;
        }
        if (t0f0Var instanceof s0f0) {
            this.j = hbp0.e(hbp0Var, null, null, new OptimisedPriceViewHolder$bindPrice$2(this, t0f0Var, null), 3);
            return;
        }
        if (!(t0f0Var instanceof q0f0)) {
            w511.b();
            return;
        }
        q0f0 q0f0Var = (q0f0) t0f0Var;
        String str = q0f0Var.c;
        int i = q0f0Var.d;
        kdc kdcVar = q0f0Var.e;
        if (i != this.k) {
            this.k = i;
            robotoTextView.setTextTypeface(i);
        }
        robotoTextView.setTextColor(kdcVar);
        robotoTextView.setVisibility(0);
        robotoTextView.setText(str);
        b(q0f0Var.f);
        c(q0f0Var.a);
        d(q0f0Var.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(FormattedText formattedText, ContinuationImpl continuationImpl) {
        OptimisedPriceViewHolder$convertText$1 optimisedPriceViewHolder$convertText$1;
        int i;
        if (continuationImpl instanceof OptimisedPriceViewHolder$convertText$1) {
            optimisedPriceViewHolder$convertText$1 = (OptimisedPriceViewHolder$convertText$1) continuationImpl;
            int i2 = optimisedPriceViewHolder$convertText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                optimisedPriceViewHolder$convertText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = optimisedPriceViewHolder$convertText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = optimisedPriceViewHolder$convertText$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    OptimisedPriceViewHolder$convertText$2 optimisedPriceViewHolder$convertText$2 = new OptimisedPriceViewHolder$convertText$2(this, formattedText, null);
                    optimisedPriceViewHolder$convertText$1.L$0 = formattedText;
                    optimisedPriceViewHolder$convertText$1.label = 1;
                    obj = kotlinx.coroutines.a.w(750L, optimisedPriceViewHolder$convertText$2, optimisedPriceViewHolder$convertText$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    formattedText = (FormattedText) optimisedPriceViewHolder$convertText$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                return charSequence != null ? this.a.a.r(formattedText) : charSequence;
            }
        }
        optimisedPriceViewHolder$convertText$1 = new OptimisedPriceViewHolder$convertText$1(this, continuationImpl);
        Object obj2 = optimisedPriceViewHolder$convertText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = optimisedPriceViewHolder$convertText$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence2 != null) {
        }
    }
}
