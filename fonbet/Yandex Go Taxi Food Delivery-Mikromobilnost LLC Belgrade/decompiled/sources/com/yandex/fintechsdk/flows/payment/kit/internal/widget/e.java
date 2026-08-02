package com.yandex.fintechsdk.flows.payment.kit.internal.widget;

import android.view.View;
import defpackage.bvf0;
import defpackage.d151;
import defpackage.fse;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jse;
import defpackage.l8x;
import defpackage.pzt0;
import defpackage.seu;
import defpackage.tje;
import defpackage.tse;
import defpackage.v351;
import java.util.Map;

/* loaded from: classes12.dex */
public final class e {
    public final PaymentKitWidgetImpl a;
    public final d151 b;
    public final Map c;
    public final a d;
    public final tse e;
    public final v351 f;
    public boolean g;
    public tse h;
    public ike i;
    public pzt0 j;

    public e(PaymentKitWidgetImpl paymentKitWidgetImpl, jse jseVar, d151 d151Var, Map map, a aVar, tse tseVar, v351 v351Var) {
        fse fseVar;
        this.a = paymentKitWidgetImpl;
        this.b = d151Var;
        this.c = map;
        this.d = aVar;
        this.e = tseVar;
        this.f = v351Var;
        new View.OnAttachStateChangeListener() { // from class: com.yandex.fintechsdk.flows.payment.kit.internal.widget.WidgetViewHandle$attachStateListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                e.this.b();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                e eVar = e.this;
                tse tseVar2 = eVar.h;
                if (tseVar2 != eVar.e && tseVar2 != null) {
                    bvf0.j(tseVar2, null);
                }
                eVar.h = null;
                ike ikeVar = eVar.i;
                if (ikeVar != null) {
                    bvf0.j(ikeVar, null);
                }
                eVar.i = null;
            }
        };
        paymentKitWidgetImpl.showPlaceholder(80);
        b();
        fse coroutineContext = tseVar.getCoroutineContext();
        ike a = bvf0.a(((coroutineContext == null || (fseVar = (l8x) coroutineContext.get(seu.C)) == null) ? jl40.a() : fseVar).plus(jseVar));
        this.i = a;
        tje.N(a, null, null, new WidgetViewHandle$1(this, null), 3);
    }

    public final void a(tse tseVar, boolean z) {
        Map map;
        if (this.g) {
            if (z) {
                this.a.showPlaceholder(80);
            }
            pzt0 pzt0Var = this.j;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            v351 v351Var = this.f;
            synchronized (v351Var) {
                map = v351Var.a;
            }
            this.j = tje.N(tseVar, null, null, new WidgetViewHandle$loadWidget$1(this, map, null), 3);
        }
    }

    public final void b() {
        tse tseVar = this.e;
        this.h = tseVar;
        a(tseVar, true);
        tje.N(tseVar, null, null, new WidgetViewHandle$startObserving$1(this, tseVar, null), 3);
    }
}
