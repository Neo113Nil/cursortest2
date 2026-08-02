package com.yandex.go.places.impl.ui.main;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.places.common.flex.actions.web.a;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.impl.ui.main.d;
import defpackage.ah00;
import defpackage.atj;
import defpackage.btj;
import defpackage.c9c0;
import defpackage.ctj;
import defpackage.dac0;
import defpackage.dt20;
import defpackage.dtj;
import defpackage.ftj;
import defpackage.g3h;
import defpackage.gtq0;
import defpackage.h55;
import defpackage.i3y;
import defpackage.jio;
import defpackage.jl40;
import defpackage.jsj;
import defpackage.k0b0;
import defpackage.k6c0;
import defpackage.l6c0;
import defpackage.n3h;
import defpackage.nac0;
import defpackage.ny61;
import defpackage.o4c0;
import defpackage.o8c0;
import defpackage.oep0;
import defpackage.q3v;
import defpackage.qac0;
import defpackage.qnh;
import defpackage.qu;
import defpackage.qwj;
import defpackage.rs2;
import defpackage.sls;
import defpackage.tse;
import defpackage.tsj;
import defpackage.u050;
import defpackage.ufc0;
import defpackage.uiq0;
import defpackage.w030;
import defpackage.wbc0;
import defpackage.x43;
import defpackage.y7c0;
import defpackage.yvf0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes13.dex */
public final class d extends com.yandex.go.places.base.ui.modals.map.c {
    public final qnh D;
    public final y7c0 E;
    public final jsj F;
    public final com.yandex.go.places.impl.navigation.common.navigator.internal.b G;
    public final jio H;
    public final com.yandex.go.places.experiments.tabbar.b I;
    public final e J;
    public final com.yandex.go.places.impl.domain.interactors.main.c K;
    public final boolean L;
    public final n3h M;
    public final yvf0 N;
    public final g3h O;
    public final Context P;
    public final tse Q;
    public final w030 R;
    public final PlacesNavigationMode S;
    public final rs2 T;
    public final ufc0 U;
    public final oep0 V;
    public final l6c0 W;
    public final com.yandex.go.places.experiments.flex.b Z;
    public final nac0 a0;
    public final com.yandex.go.places.impl.ui.main.actions.video_queue.a b0;
    public final com.yandex.go.places.impl.ui.main.actions.change_address.a c0;
    public final qac0 d0;
    public final u050 e0;
    public final wbc0 f0;
    public final qwj g0;
    public final dac0 h0;
    public final i3y i0;
    public final i3y j0;
    public final i3y k0;
    public final i3y l0;
    public final i3y m0;
    public final i3y n0;
    public final dt20 o0;
    public boolean p0;
    public c9c0 q0;

    public d(qnh qnhVar, y7c0 y7c0Var, jsj jsjVar, com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar, jio jioVar, com.yandex.go.places.experiments.tabbar.b bVar2, e eVar, com.yandex.go.places.impl.domain.interactors.main.c cVar, boolean z, n3h n3hVar, yvf0 yvf0Var, g3h g3hVar, Context context, tse tseVar, w030 w030Var, PlacesNavigationMode placesNavigationMode, rs2 rs2Var, ufc0 ufc0Var, oep0 oep0Var, l6c0 l6c0Var, com.yandex.go.places.experiments.flex.b bVar3, nac0 nac0Var, com.yandex.go.places.impl.ui.main.actions.video_queue.a aVar, com.yandex.go.places.impl.ui.main.actions.change_address.a aVar2, qac0 qac0Var, u050 u050Var, wbc0 wbc0Var, qwj qwjVar, dac0 dac0Var, o4c0 o4c0Var, q3v q3vVar, k0b0 k0b0Var, ah00 ah00Var) {
        super(tsj.class, q3vVar, k0b0Var, ah00Var, true);
        this.D = qnhVar;
        this.E = y7c0Var;
        this.F = jsjVar;
        this.G = bVar;
        this.H = jioVar;
        this.I = bVar2;
        this.J = eVar;
        this.K = cVar;
        this.L = z;
        this.M = n3hVar;
        this.N = yvf0Var;
        this.O = g3hVar;
        this.P = context;
        this.Q = tseVar;
        this.R = w030Var;
        this.S = placesNavigationMode;
        this.T = rs2Var;
        this.U = ufc0Var;
        this.V = oep0Var;
        this.W = l6c0Var;
        this.Z = bVar3;
        this.a0 = nac0Var;
        this.b0 = aVar;
        this.c0 = aVar2;
        this.d0 = qac0Var;
        this.e0 = u050Var;
        this.f0 = wbc0Var;
        this.g0 = qwjVar;
        this.h0 = dac0Var;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: usj
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        return new wsj(dVar);
                    case 1:
                        return dVar.O.a((wsj) dVar.i0.getValue(), dVar.S);
                    case 2:
                        return new i3h(dVar.P, dVar.Q, dVar.M, DeeplinkSource.PLACES, (f3h) dVar.j0.getValue());
                    case 3:
                        return new w4c(new zch(dVar));
                    case 4:
                        return new a(dVar.V, dVar.N, qgc0.U3);
                    default:
                        l6c0 l6c0Var2 = dVar.W;
                        w030 w030Var2 = dVar.R;
                        Lifecycle lifecycle = ((tsj) dVar.Dg()).getLifecycle();
                        yzh yzhVar = new yzh(dVar);
                        vx0 vx0Var = l6c0Var2.a;
                        return new k6c0(w030Var2, lifecycle, yzhVar, (f6c0) vx0Var.a.get(), (j6c0) vx0Var.b.get(), (d6c0) vx0Var.c.get());
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i0 = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.j0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: usj
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        return new wsj(dVar);
                    case 1:
                        return dVar.O.a((wsj) dVar.i0.getValue(), dVar.S);
                    case 2:
                        return new i3h(dVar.P, dVar.Q, dVar.M, DeeplinkSource.PLACES, (f3h) dVar.j0.getValue());
                    case 3:
                        return new w4c(new zch(dVar));
                    case 4:
                        return new a(dVar.V, dVar.N, qgc0.U3);
                    default:
                        l6c0 l6c0Var2 = dVar.W;
                        w030 w030Var2 = dVar.R;
                        Lifecycle lifecycle = ((tsj) dVar.Dg()).getLifecycle();
                        yzh yzhVar = new yzh(dVar);
                        vx0 vx0Var = l6c0Var2.a;
                        return new k6c0(w030Var2, lifecycle, yzhVar, (f6c0) vx0Var.a.get(), (j6c0) vx0Var.b.get(), (d6c0) vx0Var.c.get());
                }
            }
        });
        final int i3 = 2;
        this.k0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: usj
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        return new wsj(dVar);
                    case 1:
                        return dVar.O.a((wsj) dVar.i0.getValue(), dVar.S);
                    case 2:
                        return new i3h(dVar.P, dVar.Q, dVar.M, DeeplinkSource.PLACES, (f3h) dVar.j0.getValue());
                    case 3:
                        return new w4c(new zch(dVar));
                    case 4:
                        return new a(dVar.V, dVar.N, qgc0.U3);
                    default:
                        l6c0 l6c0Var2 = dVar.W;
                        w030 w030Var2 = dVar.R;
                        Lifecycle lifecycle = ((tsj) dVar.Dg()).getLifecycle();
                        yzh yzhVar = new yzh(dVar);
                        vx0 vx0Var = l6c0Var2.a;
                        return new k6c0(w030Var2, lifecycle, yzhVar, (f6c0) vx0Var.a.get(), (j6c0) vx0Var.b.get(), (d6c0) vx0Var.c.get());
                }
            }
        });
        final int i4 = 3;
        this.l0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: usj
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        return new wsj(dVar);
                    case 1:
                        return dVar.O.a((wsj) dVar.i0.getValue(), dVar.S);
                    case 2:
                        return new i3h(dVar.P, dVar.Q, dVar.M, DeeplinkSource.PLACES, (f3h) dVar.j0.getValue());
                    case 3:
                        return new w4c(new zch(dVar));
                    case 4:
                        return new a(dVar.V, dVar.N, qgc0.U3);
                    default:
                        l6c0 l6c0Var2 = dVar.W;
                        w030 w030Var2 = dVar.R;
                        Lifecycle lifecycle = ((tsj) dVar.Dg()).getLifecycle();
                        yzh yzhVar = new yzh(dVar);
                        vx0 vx0Var = l6c0Var2.a;
                        return new k6c0(w030Var2, lifecycle, yzhVar, (f6c0) vx0Var.a.get(), (j6c0) vx0Var.b.get(), (d6c0) vx0Var.c.get());
                }
            }
        });
        final int i5 = 4;
        this.m0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: usj
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i5;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        return new wsj(dVar);
                    case 1:
                        return dVar.O.a((wsj) dVar.i0.getValue(), dVar.S);
                    case 2:
                        return new i3h(dVar.P, dVar.Q, dVar.M, DeeplinkSource.PLACES, (f3h) dVar.j0.getValue());
                    case 3:
                        return new w4c(new zch(dVar));
                    case 4:
                        return new a(dVar.V, dVar.N, qgc0.U3);
                    default:
                        l6c0 l6c0Var2 = dVar.W;
                        w030 w030Var2 = dVar.R;
                        Lifecycle lifecycle = ((tsj) dVar.Dg()).getLifecycle();
                        yzh yzhVar = new yzh(dVar);
                        vx0 vx0Var = l6c0Var2.a;
                        return new k6c0(w030Var2, lifecycle, yzhVar, (f6c0) vx0Var.a.get(), (j6c0) vx0Var.b.get(), (d6c0) vx0Var.c.get());
                }
            }
        });
        final int i6 = 5;
        this.n0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: usj
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i6;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        return new wsj(dVar);
                    case 1:
                        return dVar.O.a((wsj) dVar.i0.getValue(), dVar.S);
                    case 2:
                        return new i3h(dVar.P, dVar.Q, dVar.M, DeeplinkSource.PLACES, (f3h) dVar.j0.getValue());
                    case 3:
                        return new w4c(new zch(dVar));
                    case 4:
                        return new a(dVar.V, dVar.N, qgc0.U3);
                    default:
                        l6c0 l6c0Var2 = dVar.W;
                        w030 w030Var2 = dVar.R;
                        Lifecycle lifecycle = ((tsj) dVar.Dg()).getLifecycle();
                        yzh yzhVar = new yzh(dVar);
                        vx0 vx0Var = l6c0Var2.a;
                        return new k6c0(w030Var2, lifecycle, yzhVar, (f6c0) vx0Var.a.get(), (j6c0) vx0Var.b.get(), (d6c0) vx0Var.c.get());
                }
            }
        });
        this.o0 = new dt20((com.yandex.go.route.interactor.b) o4c0Var.a.a.get(), dac0Var.f);
    }

    public static final void Lg(d dVar) {
        ftj ftjVar = dVar.J.a;
        btj btjVar = (btj) ((x43) ftjVar.c.getValue()).f();
        uiq0 uiq0Var = (uiq0) ftjVar.a.getValue();
        boolean z = (btjVar == null || jl40.l(btjVar.a, uiq0Var != null ? uiq0Var.b : null)) ? false : true;
        if (z) {
            ftjVar.a(btjVar);
        }
        if (z) {
            return;
        }
        ((atj) dVar.D.a).r(new qu(9));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Mg(d dVar, ContinuationImpl continuationImpl) {
        DiscoveryMainPresenter$getTabBar$1 discoveryMainPresenter$getTabBar$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof DiscoveryMainPresenter$getTabBar$1) {
            discoveryMainPresenter$getTabBar$1 = (DiscoveryMainPresenter$getTabBar$1) continuationImpl;
            int i2 = discoveryMainPresenter$getTabBar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                discoveryMainPresenter$getTabBar$1.label = i2 - Integer.MIN_VALUE;
                Object obj = discoveryMainPresenter$getTabBar$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = discoveryMainPresenter$getTabBar$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.places.experiments.tabbar.b bVar = dVar.I;
                    discoveryMainPresenter$getTabBar$1.label = 1;
                    obj = bVar.b(discoveryMainPresenter$getTabBar$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return !dVar.L ? new dtj((List) obj) : ctj.a;
            }
        }
        discoveryMainPresenter$getTabBar$1 = new DiscoveryMainPresenter$getTabBar$1(dVar, continuationImpl);
        Object obj3 = discoveryMainPresenter$getTabBar$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = discoveryMainPresenter$getTabBar$1.label;
        if (i != 0) {
        }
        if (!dVar.L) {
        }
    }

    public static final void Ng(d dVar, String str, String str2) {
        c9c0 c9c0Var = dVar.q0;
        if (c9c0Var == null) {
            return;
        }
        if (str != null) {
            c9c0Var.V(new o8c0(str, str2), dVar.K);
        }
        if (gtq0.u(c9c0Var)) {
            return;
        }
        oep0.b(dVar.V, c9c0Var);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        c9c0 c9c0Var = this.q0;
        if (c9c0Var != null) {
            c9c0Var.i();
        }
        c9c0 c9c0Var2 = this.q0;
        if (c9c0Var2 != null) {
            c9c0Var2.T();
        }
        ((h55) this.U).i();
        ((k6c0) this.n0.getValue()).i();
        this.q0 = null;
    }
}
