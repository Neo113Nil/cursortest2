package com.yandex.go.tariffcard.ui.adapter.header;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.ei;
import defpackage.ejp;
import defpackage.fbu;
import defpackage.gbu;
import defpackage.gci0;
import defpackage.hbu;
import defpackage.ibu;
import defpackage.icu;
import defpackage.idu;
import defpackage.jbu;
import defpackage.jcu;
import defpackage.jl40;
import defpackage.kbu;
import defpackage.kcu;
import defpackage.lbu;
import defpackage.lcu;
import defpackage.mbu;
import defpackage.mg;
import defpackage.nbu;
import defpackage.ny61;
import defpackage.qwt;
import defpackage.sls;
import defpackage.w511;
import defpackage.xw31;
import defpackage.yhx0;
import defpackage.z9u;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes14.dex */
public final class d {
    public final LinearLayout a;
    public final RobotoTextView b;
    public final RobotoTextView c;
    public final AppCompatImageView d;
    public final RobotoTextView e;
    public final PlaceholderView f;
    public final ShimmeringRobotoTextView g;
    public final PlaceholderView h;
    public final ShimmeringRobotoTextView i;
    public final PlaceholderView j;
    public final ShimmeringRobotoTextView k;
    public final yhx0 l;
    public final View m;
    public final sls n;
    public final sls o;
    public final sls p;
    public z9u q;

    public d(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView3, PlaceholderView placeholderView, ShimmeringRobotoTextView shimmeringRobotoTextView, PlaceholderView placeholderView2, ShimmeringRobotoTextView shimmeringRobotoTextView2, PlaceholderView placeholderView3, ShimmeringRobotoTextView shimmeringRobotoTextView3, yhx0 yhx0Var, View view, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4) {
        this.a = linearLayout;
        this.b = robotoTextView;
        this.c = robotoTextView2;
        this.d = appCompatImageView;
        this.e = robotoTextView3;
        this.f = placeholderView;
        this.g = shimmeringRobotoTextView;
        this.h = placeholderView2;
        this.i = shimmeringRobotoTextView2;
        this.j = placeholderView3;
        this.k = shimmeringRobotoTextView3;
        this.l = yhx0Var;
        this.m = view;
        this.n = slsVar;
        this.o = slsVar2;
        this.p = slsVar3;
        ru.yandex.taxi.design.utils.c.z(slsVar4, linearLayout);
        final int i = 0;
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: com.yandex.go.tariffcard.ui.adapter.header.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ibu ibuVar;
                int i2 = i;
                zy11 zy11Var = zy11.a;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        z9u z9uVar = dVar.q;
                        if (z9uVar != null && z9uVar.j) {
                            ((HeaderViewHolderDelegateFactory$create$3) dVar.p).invoke();
                            break;
                        }
                        break;
                    default:
                        z9u z9uVar2 = dVar.q;
                        if (z9uVar2 != null && (ibuVar = z9uVar2.g) != null && ibuVar.a()) {
                            ((HeaderViewHolderDelegateFactory$create$1) dVar.n).invoke();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, appCompatImageView);
        androidx.core.view.b.p(linearLayout, new ei(8));
        final int i2 = 1;
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: com.yandex.go.tariffcard.ui.adapter.header.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ibu ibuVar;
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        z9u z9uVar = dVar.q;
                        if (z9uVar != null && z9uVar.j) {
                            ((HeaderViewHolderDelegateFactory$create$3) dVar.p).invoke();
                            break;
                        }
                        break;
                    default:
                        z9u z9uVar2 = dVar.q;
                        if (z9uVar2 != null && (ibuVar = z9uVar2.g) != null && ibuVar.a()) {
                            ((HeaderViewHolderDelegateFactory$create$1) dVar.n).invoke();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, shimmeringRobotoTextView2);
        androidx.core.view.b.p(shimmeringRobotoTextView2, new mg(15, this));
    }

    public final void a(z9u z9uVar) {
        this.q = z9uVar;
        this.b.setText(z9uVar.a);
        this.c.setText(z9uVar.b);
        this.a.setContentDescription(z9uVar.c);
        boolean z = z9uVar.i;
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.k;
        PlaceholderView placeholderView = this.j;
        ShimmeringRobotoTextView shimmeringRobotoTextView2 = this.i;
        PlaceholderView placeholderView2 = this.h;
        PlaceholderView placeholderView3 = this.f;
        ShimmeringRobotoTextView shimmeringRobotoTextView3 = this.g;
        RobotoTextView robotoTextView = this.e;
        if (z) {
            robotoTextView.setVisibility(0);
            robotoTextView.setText(z9uVar.d);
            lcu lcuVar = z9uVar.f;
            if (jl40.l(lcuVar, icu.a)) {
                shimmeringRobotoTextView3.setVisibility(4);
                placeholderView3.setVisibility(0);
            } else if (lcuVar instanceof jcu) {
                jcu jcuVar = (jcu) lcuVar;
                shimmeringRobotoTextView3.setText(jcuVar.a);
                shimmeringRobotoTextView3.setContentDescription(jcuVar.b);
                shimmeringRobotoTextView3.setVisibility(0);
                shimmeringRobotoTextView3.setAnimateFullWidth(true);
                shimmeringRobotoTextView3.startAnimation();
                placeholderView3.setVisibility(8);
            } else {
                if (!(lcuVar instanceof kcu)) {
                    w511.b();
                    return;
                }
                kcu kcuVar = (kcu) lcuVar;
                CharSequence charSequence = kcuVar.a;
                shimmeringRobotoTextView3.setText(charSequence);
                shimmeringRobotoTextView3.setContentDescription(kcuVar.b);
                shimmeringRobotoTextView3.setVisibility(charSequence.length() > 0 ? 0 : 8);
                shimmeringRobotoTextView3.stopAnimation();
                placeholderView3.setVisibility(8);
            }
            ibu ibuVar = z9uVar.g;
            shimmeringRobotoTextView2.setClickable(ibuVar.a());
            if (ibuVar.equals(fbu.a)) {
                shimmeringRobotoTextView2.setVisibility(4);
                placeholderView2.setVisibility(0);
            } else if (ibuVar instanceof gbu) {
                shimmeringRobotoTextView2.setText(((gbu) ibuVar).a);
                shimmeringRobotoTextView2.setVisibility(0);
                shimmeringRobotoTextView2.setAnimateFullWidth(true);
                shimmeringRobotoTextView2.startAnimation();
                placeholderView2.setVisibility(8);
            } else {
                if (!(ibuVar instanceof hbu)) {
                    w511.b();
                    return;
                }
                hbu hbuVar = (hbu) ibuVar;
                shimmeringRobotoTextView2.setText(hbuVar.a);
                shimmeringRobotoTextView2.setContentDescription(hbuVar.b);
                shimmeringRobotoTextView2.setVisibility(0);
                shimmeringRobotoTextView2.stopAnimation();
                placeholderView2.setVisibility(8);
            }
            nbu nbuVar = z9uVar.h;
            if (jl40.l(nbuVar, jbu.a)) {
                shimmeringRobotoTextView.setVisibility(4);
                shimmeringRobotoTextView.setOnClickListener(null);
                placeholderView.setVisibility(0);
                OneShotPreDrawListener.add(placeholderView, new ejp(21, placeholderView));
            } else if (nbuVar instanceof lbu) {
                lbu lbuVar = (lbu) nbuVar;
                shimmeringRobotoTextView.setText(lbuVar.a);
                shimmeringRobotoTextView.setContentDescription(lbuVar.b);
                shimmeringRobotoTextView.setVisibility(0);
                shimmeringRobotoTextView.setAnimateFullWidth(true);
                shimmeringRobotoTextView.startAnimation();
                placeholderView.setVisibility(8);
                shimmeringRobotoTextView.setOnClickListener(null);
            } else if (nbuVar instanceof mbu) {
                mbu mbuVar = (mbu) nbuVar;
                shimmeringRobotoTextView.setText(mbuVar.a);
                shimmeringRobotoTextView.setContentDescription(mbuVar.b);
                shimmeringRobotoTextView.setVisibility(0);
                shimmeringRobotoTextView.stopAnimation();
                placeholderView.setVisibility(8);
                ru.yandex.taxi.design.utils.c.z(this.o, shimmeringRobotoTextView);
            } else if (!jl40.l(nbuVar, kbu.a)) {
                w511.b();
                return;
            } else {
                placeholderView.setVisibility(8);
                shimmeringRobotoTextView.setVisibility(8);
                shimmeringRobotoTextView.setOnClickListener(null);
            }
        } else {
            robotoTextView.setVisibility(8);
            shimmeringRobotoTextView3.setVisibility(8);
            shimmeringRobotoTextView2.setVisibility(8);
            shimmeringRobotoTextView.setVisibility(8);
            placeholderView3.setVisibility(8);
            placeholderView2.setVisibility(8);
            placeholderView.setVisibility(8);
        }
        z9u z9uVar2 = this.q;
        this.d.setVisibility(z9uVar2 != null && z9uVar2.j ? 0 : 4);
        idu iduVar = z9uVar.k;
        robotoTextView.setTextSize(0, iduVar.a);
        xw31.E(robotoTextView, null, null, null, Integer.valueOf(iduVar.b));
        xw31.E(shimmeringRobotoTextView3, null, null, null, Integer.valueOf(iduVar.c));
        xw31.E(this.m, null, null, null, Integer.valueOf(iduVar.d));
        shimmeringRobotoTextView3.setTextColor(iduVar.e);
        shimmeringRobotoTextView3.setTextTypeface(iduVar.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons b(ContinuationImpl continuationImpl) {
        HeaderViewHolderDelegate$updateMarginsOnTopInsetChanged$1 headerViewHolderDelegate$updateMarginsOnTopInsetChanged$1;
        int i;
        if (continuationImpl instanceof HeaderViewHolderDelegate$updateMarginsOnTopInsetChanged$1) {
            headerViewHolderDelegate$updateMarginsOnTopInsetChanged$1 = (HeaderViewHolderDelegate$updateMarginsOnTopInsetChanged$1) continuationImpl;
            int i2 = headerViewHolderDelegate$updateMarginsOnTopInsetChanged$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerViewHolderDelegate$updateMarginsOnTopInsetChanged$1.label = i2 - Integer.MIN_VALUE;
                Object obj = headerViewHolderDelegate$updateMarginsOnTopInsetChanged$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerViewHolderDelegate$updateMarginsOnTopInsetChanged$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gci0 d = kotlinx.coroutines.flow.e.d(this.l.a);
                    qwt qwtVar = new qwt(2, this);
                    headerViewHolderDelegate$updateMarginsOnTopInsetChanged$1.label = 1;
                    if (d.a.collect(qwtVar, headerViewHolderDelegate$updateMarginsOnTopInsetChanged$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        headerViewHolderDelegate$updateMarginsOnTopInsetChanged$1 = new HeaderViewHolderDelegate$updateMarginsOnTopInsetChanged$1(this, continuationImpl);
        Object obj2 = headerViewHolderDelegate$updateMarginsOnTopInsetChanged$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerViewHolderDelegate$updateMarginsOnTopInsetChanged$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }
}
