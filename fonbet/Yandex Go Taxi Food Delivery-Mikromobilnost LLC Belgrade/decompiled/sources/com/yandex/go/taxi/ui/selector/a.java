package com.yandex.go.taxi.ui.selector;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.bbx0;
import defpackage.bdc;
import defpackage.ena1;
import defpackage.f1f0;
import defpackage.g18;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.kdc;
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
import defpackage.w511;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class a {
    public final f1f0 a;
    public final bbx0 b;
    public final hbp0 c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final AppCompatImageView f;
    public final AppCompatImageView g;
    public t0f0 i;
    public pzt0 j;
    public ena1 l;
    public g18 m;
    public final bdc h = new bdc(xng0.textMain);
    public int k = -1;

    public a(f1f0 f1f0Var, bbx0 bbx0Var, hbp0 hbp0Var, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.a = f1f0Var;
        this.b = bbx0Var;
        this.c = hbp0Var;
        this.d = robotoTextView;
        this.e = robotoTextView2;
        this.f = appCompatImageView;
        this.g = appCompatImageView2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, FormattedText formattedText, ContinuationImpl continuationImpl) {
        DefaultPriceViewHolder$applyPrice$1 defaultPriceViewHolder$applyPrice$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof DefaultPriceViewHolder$applyPrice$1) {
            defaultPriceViewHolder$applyPrice$1 = (DefaultPriceViewHolder$applyPrice$1) continuationImpl;
            int i2 = defaultPriceViewHolder$applyPrice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultPriceViewHolder$applyPrice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultPriceViewHolder$applyPrice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultPriceViewHolder$applyPrice$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    defaultPriceViewHolder$applyPrice$1.L$0 = null;
                    defaultPriceViewHolder$applyPrice$1.L$1 = aVar;
                    defaultPriceViewHolder$applyPrice$1.label = 1;
                    obj = aVar.f(formattedText, defaultPriceViewHolder$applyPrice$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (a) defaultPriceViewHolder$applyPrice$1.L$1;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                bdc bdcVar = aVar.h;
                RobotoTextView robotoTextView = aVar.d;
                if (aVar.k != 0) {
                    aVar.k = 0;
                    robotoTextView.setTextTypeface(0);
                }
                robotoTextView.setTextColor(bdcVar);
                robotoTextView.setVisibility(0);
                robotoTextView.setText(charSequence);
                return zy11.a;
            }
        }
        defaultPriceViewHolder$applyPrice$1 = new DefaultPriceViewHolder$applyPrice$1(aVar, continuationImpl);
        Object obj2 = defaultPriceViewHolder$applyPrice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultPriceViewHolder$applyPrice$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        bdc bdcVar2 = aVar.h;
        RobotoTextView robotoTextView2 = aVar.d;
        if (aVar.k != 0) {
        }
        robotoTextView2.setTextColor(bdcVar2);
        robotoTextView2.setVisibility(0);
        robotoTextView2.setText(charSequence2);
        return zy11.a;
    }

    public final void b(String str) {
        RobotoTextView robotoTextView = this.e;
        if (str == null || str.length() == 0) {
            robotoTextView.setVisibility(8);
            return;
        }
        robotoTextView.setVisibility(0);
        robotoTextView.setText(str);
        robotoTextView.setForeground((Drawable) this.b.h.invoke());
    }

    public final void c(ena1 ena1Var) {
        if (jl40.l(this.l, ena1Var)) {
            return;
        }
        this.l = ena1Var;
        g18 g18Var = this.m;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.m = null;
        AppCompatImageView appCompatImageView = this.g;
        if (ena1Var == null) {
            appCompatImageView.setVisibility(8);
            return;
        }
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageDrawable(null);
        if (ena1Var instanceof nn0) {
            appCompatImageView.setImageResource(((nn0) ena1Var).a);
        } else {
            if (!(ena1Var instanceof on0)) {
                w511.b();
                return;
            }
            this.m = ((nac) this.a.b.a(appCompatImageView)).c(((on0) ena1Var).a);
        }
    }

    public final void d(npw0 npw0Var) {
        AppCompatImageView appCompatImageView = this.f;
        if (npw0Var == null) {
            appCompatImageView.setVisibility(8);
            return;
        }
        appCompatImageView.setVisibility(0);
        Drawable l = c.l(npw0Var.a, appCompatImageView);
        l.setTint(npw0Var.b);
        appCompatImageView.setImageDrawable(l);
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
            this.j = hbp0.e(hbp0Var, null, null, new DefaultPriceViewHolder$bindPrice$1(this, t0f0Var, null), 3);
            return;
        }
        if (t0f0Var instanceof s0f0) {
            this.j = hbp0.e(hbp0Var, null, null, new DefaultPriceViewHolder$bindPrice$2(this, t0f0Var, null), 3);
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
        DefaultPriceViewHolder$convertText$1 defaultPriceViewHolder$convertText$1;
        int i;
        if (continuationImpl instanceof DefaultPriceViewHolder$convertText$1) {
            defaultPriceViewHolder$convertText$1 = (DefaultPriceViewHolder$convertText$1) continuationImpl;
            int i2 = defaultPriceViewHolder$convertText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultPriceViewHolder$convertText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultPriceViewHolder$convertText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultPriceViewHolder$convertText$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DefaultPriceViewHolder$convertText$2 defaultPriceViewHolder$convertText$2 = new DefaultPriceViewHolder$convertText$2(this, formattedText, null);
                    defaultPriceViewHolder$convertText$1.L$0 = formattedText;
                    defaultPriceViewHolder$convertText$1.label = 1;
                    obj = kotlinx.coroutines.a.w(750L, defaultPriceViewHolder$convertText$2, defaultPriceViewHolder$convertText$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    formattedText = (FormattedText) defaultPriceViewHolder$convertText$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                return charSequence != null ? this.a.a.r(formattedText) : charSequence;
            }
        }
        defaultPriceViewHolder$convertText$1 = new DefaultPriceViewHolder$convertText$1(this, continuationImpl);
        Object obj2 = defaultPriceViewHolder$convertText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultPriceViewHolder$convertText$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence2 != null) {
        }
    }
}
