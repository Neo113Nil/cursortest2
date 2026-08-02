package com.yandex.go.navigator.alt_select.new_summary;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.domain.NavigationManagerImpl$startRoutesAutoRequests$$inlined$safeCollectIn$1;
import com.yandex.go.navigator.domain.b;
import com.yandex.go.navigator.domain.t;
import com.yandex.mapkit.navigation.automotive.Navigation;
import defpackage.bg50;
import defpackage.bzw;
import defpackage.dg50;
import defpackage.e621;
import defpackage.eg50;
import defpackage.fg50;
import defpackage.flm;
import defpackage.fu00;
import defpackage.gg50;
import defpackage.h55;
import defpackage.i3y;
import defpackage.lg50;
import defpackage.liq0;
import defpackage.m950;
import defpackage.mdh;
import defpackage.n1j0;
import defpackage.ny61;
import defpackage.oc50;
import defpackage.oj00;
import defpackage.pe50;
import defpackage.pzt0;
import defpackage.qf50;
import defpackage.re50;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uf50;
import defpackage.uj00;
import defpackage.uyj;
import defpackage.whu0;
import defpackage.yvf0;
import defpackage.yxf0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a extends h55 {
    public final yvf0 D;
    public final yvf0 E;
    public final re50 F;
    public final lg50 G;
    public final oc50 H;
    public final yxf0 I;
    public final zuj0 J;
    public final tt2 K;
    public final t L;
    public final bzw M;
    public final com.yandex.go.navigator.alt_select.a N;
    public final liq0 O;
    public final b P;
    public final e621 Q;
    public final yvf0 R;
    public final fu00 S;
    public final i3y T;

    public a(yvf0 yvf0Var, yvf0 yvf0Var2, re50 re50Var, lg50 lg50Var, oc50 oc50Var, yxf0 yxf0Var, zuj0 zuj0Var, tt2 tt2Var, t tVar, bzw bzwVar, com.yandex.go.navigator.alt_select.a aVar, liq0 liq0Var, b bVar, e621 e621Var, yvf0 yvf0Var3, fu00 fu00Var) {
        super(null);
        this.D = yvf0Var;
        this.E = yvf0Var2;
        this.F = re50Var;
        this.G = lg50Var;
        this.H = oc50Var;
        this.I = yxf0Var;
        this.J = zuj0Var;
        this.K = tt2Var;
        this.L = tVar;
        this.M = bzwVar;
        this.N = aVar;
        this.O = liq0Var;
        this.P = bVar;
        this.Q = e621Var;
        this.R = yvf0Var3;
        this.S = fu00Var;
        this.T = kotlin.a.a(new eg50(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, ContinuationImpl continuationImpl) {
        NavigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1 navigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof NavigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1) {
            navigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1 = (NavigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1) continuationImpl;
            int i2 = navigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = aVar.P;
                    navigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1.label = 1;
                    obj = bVar.a(navigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1);
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
                aVar.I.p((Address) obj);
                return zy11.a;
            }
        }
        navigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1 = new NavigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1(aVar, continuationImpl);
        Object obj3 = navigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorSummaryRootRouter$resetFromAddressToCurrentLocation$1.label;
        if (i != 0) {
        }
        aVar.I.p((Address) obj3);
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.M.l(Boolean.FALSE);
        t tVar = this.L;
        pzt0 pzt0Var = tVar.z;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        tVar.z = null;
        tVar.x.b();
        tVar.y = 0;
        Navigation navigation = tVar.w;
        if (navigation != null) {
            navigation.resetRoutes();
        }
        this.S.c = 0.0f;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        Object value;
        pe50 pe50Var;
        dg50 dg50Var = (dg50) obj;
        this.M.l(Boolean.TRUE);
        this.S.c = 14.0f;
        boolean a = this.H.a();
        t tVar = this.L;
        if (a) {
            Navigation navigation = tVar.w;
            if (navigation != null) {
                navigation.suspend();
            }
            tVar.B = false;
            lg50 lg50Var = this.G;
            pe50 c = lg50Var.a.c();
            if (lg50Var.d == null) {
                lg50Var.d = c != null ? pe50.a(c, null, null, 3) : null;
            }
            Integer num = (Integer) this.Q.h();
            if (num != null) {
                int intValue = num.intValue();
                r0 r0Var = this.F.b;
                do {
                    value = r0Var.getValue();
                    pe50Var = (pe50) value;
                    if (pe50Var == null) {
                        break;
                    }
                } while (!r0Var.k(value, pe50.a(pe50Var, null, kotlin.collections.a.B0(intValue, pe50Var.b), 1)));
            }
        }
        tse o = o();
        this.K.getClass();
        sjh sjhVar = uyj.a;
        tje.N(o, mdh.b, null, new NavigatorSummaryRootRouter$onLaunch$1(this, dg50Var, null), 2);
        S(dg50Var, true);
        pzt0 pzt0Var = tVar.z;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        tVar.z = tje.N(tVar.p.c(), null, null, new NavigationManagerImpl$startRoutesAutoRequests$$inlined$safeCollectIn$1(tVar.a.c, null, tVar), 3);
    }

    public final uj00 Q() {
        return (uj00) this.T.getValue();
    }

    public final void R(String str, whu0 whu0Var, Address address) {
        B((m950) this.E.get(), new qf50(new uf50(address, str), !this.H.a()), new fg50(this, whu0Var), new n1j0(Q()));
    }

    public final void S(dg50 dg50Var, boolean z) {
        int i = 1;
        int i2 = 0;
        B((m950) this.D.get(), new bg50(dg50Var.a, z), new gg50(this), new n1j0(Q()));
        if (v(Q())) {
            return;
        }
        A(Q(), new oj00(new eg50(this, i2), new eg50(this, i)), new flm(this, 2));
    }
}
