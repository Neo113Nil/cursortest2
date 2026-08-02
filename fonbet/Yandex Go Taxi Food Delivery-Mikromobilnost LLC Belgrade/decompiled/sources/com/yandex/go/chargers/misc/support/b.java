package com.yandex.go.chargers.misc.support;

import android.content.Context;
import com.yandex.go.chargers.data.g;
import defpackage.an41;
import defpackage.dn7;
import defpackage.dpb;
import defpackage.fva0;
import defpackage.i3y;
import defpackage.ju8;
import defpackage.ny61;
import defpackage.pva;
import defpackage.pzt0;
import defpackage.rva;
import defpackage.sva;
import defpackage.tje;
import defpackage.w030;
import defpackage.yvf0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class b extends com.yandex.go.navigation.modals.coroutines.a {
    public final fva0 F;
    public final w030 G;
    public final an41 H;
    public final g I;
    public final yvf0 J;
    public final pva K;
    public final c L;
    public String M;
    public pzt0 N;
    public final i3y O;

    public b(fva0 fva0Var, w030 w030Var, an41 an41Var, g gVar, yvf0 yvf0Var, pva pvaVar, c cVar) {
        super(null);
        this.F = fva0Var;
        this.G = w030Var;
        this.H = an41Var;
        this.I = gVar;
        this.J = yvf0Var;
        this.K = pvaVar;
        this.L = cVar;
        this.O = kotlin.a.a(new ju8(21, this));
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        this.N = tje.N(o(), null, null, new ChargersDefaultSupportRouter$onAttach$1(this, ((sva) obj).a, null), 3);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H(new sva(((sva) obj).a));
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = null;
        j(dpb.a);
        this.M = null;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.G;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final /* synthetic */ Object S(Object obj, Continuation continuation) {
        return U(((sva) obj).a, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(rva rvaVar, ContinuationImpl continuationImpl) {
        ChargersDefaultSupportRouter$provideModalView$1 chargersDefaultSupportRouter$provideModalView$1;
        int i;
        if (continuationImpl instanceof ChargersDefaultSupportRouter$provideModalView$1) {
            chargersDefaultSupportRouter$provideModalView$1 = (ChargersDefaultSupportRouter$provideModalView$1) continuationImpl;
            int i2 = chargersDefaultSupportRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDefaultSupportRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDefaultSupportRouter$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDefaultSupportRouter$provideModalView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = this.M;
                    if (str == null) {
                        str = "";
                    }
                    chargersDefaultSupportRouter$provideModalView$1.L$0 = null;
                    chargersDefaultSupportRouter$provideModalView$1.L$1 = null;
                    chargersDefaultSupportRouter$provideModalView$1.label = 1;
                    obj = this.L.a(str, rvaVar, chargersDefaultSupportRouter$provideModalView$1);
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
                dn7 dn7Var = new dn7(26, this);
                ChargersSupportModalView chargersSupportModalView = new ChargersSupportModalView((Context) this.K.a.a.get(), an41.a(this.H, (UiWebViewConfig) obj, dn7Var).asView());
                chargersSupportModalView.setOnAppearingListener(new a(this));
                return chargersSupportModalView;
            }
        }
        chargersDefaultSupportRouter$provideModalView$1 = new ChargersDefaultSupportRouter$provideModalView$1(this, continuationImpl);
        Object obj2 = chargersDefaultSupportRouter$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDefaultSupportRouter$provideModalView$1.label;
        if (i != 0) {
        }
        dn7 dn7Var2 = new dn7(26, this);
        ChargersSupportModalView chargersSupportModalView2 = new ChargersSupportModalView((Context) this.K.a.a.get(), an41.a(this.H, (UiWebViewConfig) obj2, dn7Var2).asView());
        chargersSupportModalView2.setOnAppearingListener(new a(this));
        return chargersSupportModalView2;
    }
}
