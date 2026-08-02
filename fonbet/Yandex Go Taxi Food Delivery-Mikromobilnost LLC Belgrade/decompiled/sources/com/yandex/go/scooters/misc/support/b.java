package com.yandex.go.scooters.misc.support;

import android.content.Context;
import com.yandex.go.scooters.misc.api.support.ScootersSupportEntryPoint;
import defpackage.an41;
import defpackage.dpb;
import defpackage.fva0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.q2p0;
import defpackage.r2p0;
import defpackage.t2p0;
import defpackage.tje;
import defpackage.ukn0;
import defpackage.v3n0;
import defpackage.w030;
import defpackage.yvf0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final class b extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final fva0 G;
    public final an41 H;
    public final ukn0 I;
    public final yvf0 J;
    public final MapNotificationsMuteRepository K;
    public final q2p0 L;
    public final c M;
    public String N;
    public pzt0 O;
    public ru.yandex.taxi.scooters.presentation.loading.b P;

    public b(w030 w030Var, fva0 fva0Var, an41 an41Var, ukn0 ukn0Var, yvf0 yvf0Var, MapNotificationsMuteRepository mapNotificationsMuteRepository, q2p0 q2p0Var, c cVar) {
        super(null);
        this.F = w030Var;
        this.G = fva0Var;
        this.H = an41Var;
        this.I = ukn0Var;
        this.J = yvf0Var;
        this.K = mapNotificationsMuteRepository;
        this.L = q2p0Var;
        this.M = cVar;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        this.K.a();
        this.O = tje.N(o(), null, null, new ScootersDefaultSupportRouter$onAttach$1(this, (r2p0) obj, null), 3);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H((r2p0) obj);
        pzt0 pzt0Var = this.O;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.O = null;
        j(dpb.a);
        this.P = null;
        this.N = null;
        this.K.b();
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(r2p0 r2p0Var, ContinuationImpl continuationImpl) {
        ScootersDefaultSupportRouter$provideModalView$1 scootersDefaultSupportRouter$provideModalView$1;
        int i;
        if (continuationImpl instanceof ScootersDefaultSupportRouter$provideModalView$1) {
            scootersDefaultSupportRouter$provideModalView$1 = (ScootersDefaultSupportRouter$provideModalView$1) continuationImpl;
            int i2 = scootersDefaultSupportRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDefaultSupportRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDefaultSupportRouter$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDefaultSupportRouter$provideModalView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = this.N;
                    if (str == null) {
                        str = "";
                    }
                    t2p0 t2p0Var = r2p0Var.a;
                    ScootersSupportEntryPoint scootersSupportEntryPoint = r2p0Var.b;
                    scootersDefaultSupportRouter$provideModalView$1.L$0 = null;
                    scootersDefaultSupportRouter$provideModalView$1.L$1 = null;
                    scootersDefaultSupportRouter$provideModalView$1.label = 1;
                    obj = this.M.a(str, t2p0Var, scootersSupportEntryPoint, scootersDefaultSupportRouter$provideModalView$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                v3n0 v3n0Var = new v3n0(4, this);
                ScootersSupportModalView scootersSupportModalView = new ScootersSupportModalView((Context) this.L.a.a.get(), an41.a(this.H, (UiWebViewConfig) obj, v3n0Var).asView());
                scootersSupportModalView.setOnAppearingListener(new a(this));
                return scootersSupportModalView;
            }
        }
        scootersDefaultSupportRouter$provideModalView$1 = new ScootersDefaultSupportRouter$provideModalView$1(this, continuationImpl);
        Object obj2 = scootersDefaultSupportRouter$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDefaultSupportRouter$provideModalView$1.label;
        if (i != 0) {
        }
        v3n0 v3n0Var2 = new v3n0(4, this);
        ScootersSupportModalView scootersSupportModalView2 = new ScootersSupportModalView((Context) this.L.a.a.get(), an41.a(this.H, (UiWebViewConfig) obj2, v3n0Var2).asView());
        scootersSupportModalView2.setOnAppearingListener(new a(this));
        return scootersSupportModalView2;
    }
}
