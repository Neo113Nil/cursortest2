package com.yandex.go.navigation.activity;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.intentprocessor.i;
import com.yandex.go.navigation.activity.a;
import com.yandex.go.preload.e;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.a2f0;
import defpackage.cey;
import defpackage.h3y;
import defpackage.ly01;
import defpackage.pep0;
import defpackage.qx60;
import defpackage.s300;
import defpackage.t9f0;
import defpackage.tje;
import defpackage.tse;
import defpackage.yvf0;
import defpackage.zy11;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes8.dex */
public final class a implements a2f0 {
    public final tse a;
    public final Lifecycle b;
    public final ly01 c;
    public final e d;
    public final yvf0 e;
    public final qx60 f;
    public final s300 g;
    public final MainUiAvailabilityMonitor h;
    public final t9f0 i;
    public final h3y j;
    public final h3y k;

    public a(tse tseVar, Lifecycle lifecycle, ly01 ly01Var, e eVar, yvf0 yvf0Var, qx60 qx60Var, pep0 pep0Var, yvf0 yvf0Var2, s300 s300Var, MainUiAvailabilityMonitor mainUiAvailabilityMonitor, t9f0 t9f0Var, h3y h3yVar, h3y h3yVar2) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = ly01Var;
        this.d = eVar;
        this.e = yvf0Var;
        this.f = qx60Var;
        this.g = s300Var;
        this.h = mainUiAvailabilityMonitor;
        this.i = t9f0Var;
        this.j = h3yVar;
        this.k = h3yVar2;
    }

    @Override // defpackage.a2f0
    public final void c() {
        this.d.a.getClass();
        this.i.a.g(zy11.a);
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        NavigationActivityLifecycleListener$onActivityCreate$1 navigationActivityLifecycleListener$onActivityCreate$1 = new NavigationActivityLifecycleListener$onActivityCreate$1(this, null);
        tse tseVar = this.a;
        final int i = 1;
        com.yandex.go.coroutines.b.g(tseVar, null, coroutineStart, navigationActivityLifecycleListener$onActivityCreate$1, 1);
        this.f.b(this.g);
        tje.N(tseVar, null, null, new NavigationActivityLifecycleListener$observeMainUiReadinessForBackPress$1(this, null), 3);
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        final int i2 = 0;
        Runnable runnable = new Runnable(this) { // from class: e650
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        com.yandex.go.taxi.order.navigation.a aVar2 = (com.yandex.go.taxi.order.navigation.a) ((e5y0) aVar.e.get());
                        com.yandex.go.preorder.payments.a aVar3 = (com.yandex.go.preorder.payments.a) aVar2.R.get();
                        Preorder preorder = aVar3.f;
                        Preorder preorder2 = aVar3.f;
                        boolean z = aVar3.e && preorder2 != null && preorder2.h() == PaymentMethod$Type.GOOGLE_PAY && ((com.yandex.go.payments.googlepay.domain.e) aVar3.a).v.d && preorder != null;
                        aVar2.Z.getClass();
                        a3y0.h(new String[]{"checkGooglePayRestorationRequired"});
                        hst hstVar = jst.e;
                        if (z) {
                            com.yandex.go.preorder.confirm.a aVar4 = (com.yandex.go.preorder.confirm.a) aVar2.S.get();
                            d0l0 d0l0Var = preorder.G;
                            aVar4.b(d0l0Var.h(), d0l0Var.b(), preorder.a);
                            aVar4.a(preorder);
                            aVar3.e = false;
                            aVar3.f = null;
                            aVar2.E.b((m950) aVar2.J.get(), new b5y0("restore order processing", preorder));
                        }
                        ((i) aVar.k.get()).c();
                        break;
                    default:
                        aVar.c.d();
                        break;
                }
            }
        };
        Lifecycle lifecycle = this.b;
        cey.a(lifecycle, event, runnable);
        cey.a(lifecycle, Lifecycle.Event.ON_PAUSE, new Runnable(this) { // from class: e650
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        com.yandex.go.taxi.order.navigation.a aVar2 = (com.yandex.go.taxi.order.navigation.a) ((e5y0) aVar.e.get());
                        com.yandex.go.preorder.payments.a aVar3 = (com.yandex.go.preorder.payments.a) aVar2.R.get();
                        Preorder preorder = aVar3.f;
                        Preorder preorder2 = aVar3.f;
                        boolean z = aVar3.e && preorder2 != null && preorder2.h() == PaymentMethod$Type.GOOGLE_PAY && ((com.yandex.go.payments.googlepay.domain.e) aVar3.a).v.d && preorder != null;
                        aVar2.Z.getClass();
                        a3y0.h(new String[]{"checkGooglePayRestorationRequired"});
                        hst hstVar = jst.e;
                        if (z) {
                            com.yandex.go.preorder.confirm.a aVar4 = (com.yandex.go.preorder.confirm.a) aVar2.S.get();
                            d0l0 d0l0Var = preorder.G;
                            aVar4.b(d0l0Var.h(), d0l0Var.b(), preorder.a);
                            aVar4.a(preorder);
                            aVar3.e = false;
                            aVar3.f = null;
                            aVar2.E.b((m950) aVar2.J.get(), new b5y0("restore order processing", preorder));
                        }
                        ((i) aVar.k.get()).c();
                        break;
                    default:
                        aVar.c.d();
                        break;
                }
            }
        });
        tje.N(tseVar, null, null, new NavigationActivityLifecycleListener$onActivityCreate$4(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "NavigationActivityLifecycleListener";
    }
}
