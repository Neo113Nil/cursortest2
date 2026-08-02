package com.yandex.go.pin.api;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.pin.api.v2.c;
import com.yandex.mapkit.ScreenRect;
import defpackage.ah00;
import defpackage.bdp;
import defpackage.epr0;
import defpackage.fft0;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.lp2;
import defpackage.m8t0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u65;
import defpackage.yd2;
import kotlin.Pair;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class a extends u65 {
    public final com.yandex.go.pin.api.widget.a a;
    public final h3y b;
    public final tt2 c;
    public final pwy0 d;
    public final tse e;
    public pzt0 f;
    public com.yandex.go.pin.api.v1.a g;
    public c h;
    public final lp2 i = new lp2(3, this);
    public final Point j = new Point();
    public final Rect k = new Rect();
    public final n0 l = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public ValueAnimator m;
    public m8t0 n;
    public tls o;
    public fft0 p;

    public a(com.yandex.go.pin.api.widget.a aVar, h3y h3yVar, tt2 tt2Var, pwy0 pwy0Var, tse tseVar) {
        this.a = aVar;
        this.b = h3yVar;
        this.c = tt2Var;
        this.d = pwy0Var;
        this.e = tseVar;
    }

    @Override // defpackage.u65
    public final void a() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.m = null;
    }

    @Override // defpackage.u65
    public final Rect b() {
        Rect pinVisibleBounds;
        PinV2Component pinV2Component;
        PinV1Component d;
        com.yandex.go.pin.api.v1.a aVar = this.g;
        if (aVar == null || (d = aVar.d()) == null || (pinVisibleBounds = d.getPinVisibleBounds()) == null) {
            c cVar = this.h;
            pinVisibleBounds = (cVar == null || (pinV2Component = cVar.i) == null) ? epr0.a : pinV2Component.getPinVisibleBounds();
        }
        Rect rect = this.k;
        rect.set(pinVisibleBounds);
        Point point = this.j;
        rect.offset(point.x, point.y);
        return rect;
    }

    @Override // defpackage.u65
    public final n0 c() {
        return this.l;
    }

    @Override // defpackage.u65
    public final void d(PointF pointF, boolean z, bdp bdpVar) {
        this.j.set((int) pointF.x, (int) pointF.y);
        ViewGroup g = g();
        if (g != null) {
            h(g, z, bdpVar);
        } else {
            bdpVar.invoke();
        }
    }

    public final void e(View view, View view2, ah00 ah00Var) {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = tje.N(this.e, null, null, new SharedPinController$attachPin$1(this, ah00Var, view, view2, null), 3);
    }

    public final ScreenRect f() {
        ScreenRect screenRect;
        PinV2Component pinV2Component;
        PinV1Component d;
        ScreenRect pinScreenRect;
        com.yandex.go.pin.api.v1.a aVar = this.g;
        if (aVar != null && (d = aVar.d()) != null && (pinScreenRect = d.getPinScreenRect()) != null) {
            return pinScreenRect;
        }
        c cVar = this.h;
        if (cVar != null && (pinV2Component = cVar.i) != null) {
            return pinV2Component.getPinScreenRect();
        }
        screenRect = epr0.c;
        return screenRect;
    }

    public final ViewGroup g() {
        PinV1Component d;
        com.yandex.go.pin.api.v1.a aVar = this.g;
        if (aVar != null && (d = aVar.d()) != null) {
            return d;
        }
        c cVar = this.h;
        if (cVar != null) {
            return cVar.i;
        }
        return null;
    }

    public final void h(View view, boolean z, final sls slsVar) {
        PointF targetOffsetPoint;
        PinV2Component pinV2Component;
        PinV1Component d;
        float f = this.j.y;
        float top = view.getTop();
        com.yandex.go.pin.api.v1.a aVar = this.g;
        if (aVar == null || (d = aVar.d()) == null || (targetOffsetPoint = d.getTargetOffsetPoint()) == null) {
            c cVar = this.h;
            targetOffsetPoint = (cVar == null || (pinV2Component = cVar.i) == null) ? epr0.b : pinV2Component.getTargetOffsetPoint();
        }
        float f2 = f - (top + targetOffsetPoint.y);
        a();
        n0 n0Var = this.l;
        if (!z) {
            view.setTranslationY(f2);
            n0Var.g(new Pair(b(), Boolean.FALSE));
            slsVar.invoke();
            return;
        }
        n0Var.g(new Pair(b(), Boolean.TRUE));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationY(), f2);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new yd2(4, view));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.pin.api.SharedPinController$refreshPinPosition$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                a aVar2 = a.this;
                aVar2.l.g(new Pair(aVar2.b(), Boolean.FALSE));
                slsVar.invoke();
            }
        });
        ofFloat.start();
        this.m = ofFloat;
    }
}
