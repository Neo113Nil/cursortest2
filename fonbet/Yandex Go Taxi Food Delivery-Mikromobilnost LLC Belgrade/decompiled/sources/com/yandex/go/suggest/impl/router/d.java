package com.yandex.go.suggest.impl.router;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.go.address.models.Address;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.v;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import com.yandex.payment.common.result.ResultType;
import defpackage.a7e;
import defpackage.afw0;
import defpackage.bwp0;
import defpackage.dfw0;
import defpackage.dpb;
import defpackage.ekr;
import defpackage.exu0;
import defpackage.f8v0;
import defpackage.f9w0;
import defpackage.fmr;
import defpackage.g18;
import defpackage.gfw0;
import defpackage.j9w0;
import defpackage.jgw0;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.kr0;
import defpackage.l01;
import defpackage.lag;
import defpackage.lg21;
import defpackage.mz0;
import defpackage.n3w;
import defpackage.nag;
import defpackage.nhr;
import defpackage.ny61;
import defpackage.oag;
import defpackage.ogw0;
import defpackage.p9p;
import defpackage.pav;
import defpackage.pgw0;
import defpackage.po21;
import defpackage.pw2;
import defpackage.pwy0;
import defpackage.qfw0;
import defpackage.qoh;
import defpackage.rfw0;
import defpackage.ru2;
import defpackage.s5w0;
import defpackage.s9w0;
import defpackage.swp0;
import defpackage.t870;
import defpackage.tis0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u7r;
import defpackage.usg0;
import defpackage.w030;
import defpackage.w4l0;
import defpackage.w66;
import defpackage.wa90;
import defpackage.wks;
import defpackage.xks;
import defpackage.y9y0;
import defpackage.yhr;
import defpackage.yks;
import defpackage.ywl;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlinx.coroutines.flow.r0;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class d extends ekr {
    public final w030 G;
    public final com.yandex.go.suggest.impl.data.flex.a H;
    public final ru.yandex.taxi.design.utils.b I;
    public final lag J;
    public final y9y0 K;
    public final lag L;
    public final t870 M;
    public final lag N;
    public final nag O;
    public final l01 P;
    public final zuj0 Q;
    public final com.yandex.go.suggest.impl.data.a R;
    public final lg21 S;
    public final f9w0 T;
    public final com.yandex.go.quark.soul.domain.a U;
    public final nag V;
    public final oag W;
    public final jgw0 Z;
    public final yks a0;
    public final wks b0;
    public final kr0 c0;
    public final dfw0 d0;
    public rfw0 e0;
    public g18 f0;
    public final AtomicBoolean g0 = new AtomicBoolean(false);
    public qoh h0;

    public d(w030 w030Var, com.yandex.go.suggest.impl.data.flex.a aVar, ru.yandex.taxi.design.utils.b bVar, lag lagVar, y9y0 y9y0Var, lag lagVar2, t870 t870Var, lag lagVar3, nag nagVar, l01 l01Var, zuj0 zuj0Var, com.yandex.go.suggest.impl.data.a aVar2, lg21 lg21Var, f9w0 f9w0Var, com.yandex.go.quark.soul.domain.a aVar3, nag nagVar2, oag oagVar, jgw0 jgw0Var, yks yksVar, wks wksVar, kr0 kr0Var, dfw0 dfw0Var) {
        this.G = w030Var;
        this.H = aVar;
        this.I = bVar;
        this.J = lagVar;
        this.K = y9y0Var;
        this.L = lagVar2;
        this.M = t870Var;
        this.N = lagVar3;
        this.O = nagVar;
        this.P = l01Var;
        this.Q = zuj0Var;
        this.R = aVar2;
        this.S = lg21Var;
        this.T = f9w0Var;
        this.U = aVar3;
        this.V = nagVar2;
        this.W = oagVar;
        this.Z = jgw0Var;
        this.a0 = yksVar;
        this.b0 = wksVar;
        this.c0 = kr0Var;
        this.d0 = dfw0Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        this.f0 = this.G.g(new qfw0());
        super.G((zy11) obj);
        tje.N(o(), null, null, new SuperappSuggestFlexModalViewRouter$onAttach$2(this, null), 3);
        tje.N(o(), null, null, new SuperappSuggestFlexModalViewRouter$onAttach$3(this, null), 3);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        com.yandex.go.suggest.impl.data.a aVar = this.R;
        String str = aVar.b().a;
        jgw0 jgw0Var = this.Z;
        this.d0.a = new tis0(str, new fmr(jgw0Var.f.c.c(), jgw0Var.d.c), aVar.b().d, 20);
        super.H((zy11) obj);
        j(dpb.a);
        ((json.state.disk.storage.feature.b) this.H.d.getValue()).b();
        g18 g18Var = this.f0;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.f0 = null;
        this.e0 = null;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.d0.a = null;
        qoh qohVar = this.h0;
        if (qohVar != null) {
            this.h0 = null;
            qohVar.w(new s5w0(5, qohVar));
        }
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        if (this.g0.getAndSet(false)) {
            f9w0 f9w0Var = this.T;
            if (((j9w0) f9w0Var.a.get()).a()) {
                f9w0Var.b.g(zy11.a);
            }
        }
    }

    @Override // defpackage.h55
    public final void L(Object obj) {
        this.g0.set(true);
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
    public final /* bridge */ /* synthetic */ Object S(Object obj, Continuation continuation) {
        return T(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.go.suggest.impl.router.SuperappSuggestFlexModalViewRouter$provideModalView$2$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(Continuation continuation) {
        SuperappSuggestFlexModalViewRouter$provideModalView$1 superappSuggestFlexModalViewRouter$provideModalView$1;
        int i;
        boolean z;
        boolean z2;
        wks wksVar;
        com.yandex.go.suggest.impl.presenter.c cVar;
        bwp0 bwp0Var;
        if (continuation instanceof SuperappSuggestFlexModalViewRouter$provideModalView$1) {
            superappSuggestFlexModalViewRouter$provideModalView$1 = (SuperappSuggestFlexModalViewRouter$provideModalView$1) continuation;
            int i2 = superappSuggestFlexModalViewRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestFlexModalViewRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappSuggestFlexModalViewRouter$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestFlexModalViewRouter$provideModalView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.suggest.impl.data.a aVar = this.R;
                    r0 r0Var = aVar.j;
                    bwp0 bwp0Var2 = (bwp0) aVar.f.b.getAndSet(null);
                    tis0 tis0Var = aVar.g.a;
                    if (bwp0Var2 == null) {
                        if (tis0Var == null || !tis0Var.R() || tis0Var.P().length() <= 0) {
                            if (aVar.h.k) {
                                String P = tis0Var != null ? tis0Var.P() : null;
                                bwp0Var2 = new bwp0(P != null ? P : "");
                            } else {
                                Address k = aVar.a.k();
                                String D1 = k != null ? k.D1() : null;
                                if (D1 != null) {
                                    bwp0 bwp0Var3 = (bwp0) r0Var.getValue();
                                    if (!jl40.l(bwp0Var3 != null ? bwp0Var3.a : null, D1)) {
                                        bwp0Var = new bwp0(D1);
                                        bwp0Var2 = bwp0Var;
                                    }
                                }
                                bwp0Var = (bwp0) r0Var.getValue();
                                if (bwp0Var == null) {
                                    bwp0Var = new bwp0(D1 != null ? D1 : "");
                                }
                                bwp0Var2 = bwp0Var;
                            }
                        } else {
                            bwp0Var2 = new bwp0(tis0Var.P());
                        }
                    }
                    r0Var.getClass();
                    r0Var.m(null, bwp0Var2);
                    aVar.d(bwp0Var2.a);
                    jgw0 jgw0Var = this.Z;
                    dfw0 dfw0Var = jgw0Var.d;
                    tis0 tis0Var2 = dfw0Var.a;
                    JSONObject c = jgw0Var.c.c();
                    Iterator it = ((a7e) kotlin.sequences.a.b(c.keys())).iterator();
                    while (true) {
                        z = false;
                        if (it.hasNext()) {
                            if (jl40.l(com.yandex.go.suggest.impl.data.flex.variables.b.d((String) it.next(), c), ResultType.RESULT_TYPE_LOADING)) {
                                break;
                            }
                        } else if (jgw0Var.a.i) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                    boolean l = jl40.l(tis0Var2 != null ? tis0Var2.P() : null, jgw0Var.b.b().a);
                    if (z2 && l) {
                        fmr N = tis0Var2.N();
                        ywl a = N.a();
                        Map b = N.b();
                        dfw0Var.b = a;
                        dfw0Var.c = b != null ? new LinkedHashMap(b) : new LinkedHashMap();
                        if (a != null && b != null) {
                            z = true;
                        }
                        dfw0Var.d = z;
                        jgw0Var.e.b = true;
                    }
                    c cVar2 = new c(this);
                    rfw0 rfw0Var = new rfw0();
                    new MutablePropertyReference0Impl(this) { // from class: com.yandex.go.suggest.impl.router.SuperappSuggestFlexModalViewRouter$provideModalView$2$1
                        {
                            super(this, d.class, "aiAssistantOpeningRepository", "getAiAssistantOpeningRepository()Lcom/yandex/go/suggest/impl/router/SuperappSuggestFlexModalViewRouter$InnerAiAssistantOpeningRepository;", 0);
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, defpackage.hgx
                        public final Object get() {
                            return ((d) this.receiver).e0;
                        }

                        public final void i(Object obj2) {
                            ((d) this.receiver).e0 = (rfw0) obj2;
                        }
                    }.i(rfw0Var);
                    xks xksVar = this.a0.a;
                    com.yandex.go.suggest.impl.presenter.c cVar3 = new com.yandex.go.suggest.impl.presenter.c((swp0) xksVar.a.get(), cVar2, rfw0Var, (Context) ((lag) xksVar.g).get(), (w4l0) ((oag) xksVar.h).get(), (pgw0) xksVar.b.get(), (ru.yandex.taxi.address.experiment.d) ((oag) xksVar.i).get(), (com.yandex.go.suggest.impl.data.a) xksVar.c.get(), (gfw0) xksVar.d.get(), (com.yandex.go.suggest.impl.data.flex.variables.b) xksVar.e.get(), (u7r) ((p9p) xksVar.j).get(), (s9w0) ((lag) xksVar.k).get(), (zuj0) ((oag) xksVar.l).get(), (po21) ((oag) xksVar.m).get(), (ogw0) ((n3w) xksVar.n).a, (v) ((oag) xksVar.p).get(), (pwy0) ((oag) xksVar.q).get(), (f8v0) ((n3w) xksVar.o).a, (wa90) ((oag) xksVar.r).get(), (k7x0) ((oag) xksVar.s).get(), (exu0) ((oag) xksVar.t).get(), (afw0) xksVar.f.get());
                    int i3 = usg0.round_section_radius;
                    superappSuggestFlexModalViewRouter$provideModalView$1.L$0 = null;
                    wksVar = this.b0;
                    superappSuggestFlexModalViewRouter$provideModalView$1.L$1 = wksVar;
                    superappSuggestFlexModalViewRouter$provideModalView$1.L$2 = cVar3;
                    superappSuggestFlexModalViewRouter$provideModalView$1.label = 1;
                    ru.yandex.taxi.design.utils.b bVar = this.I;
                    obj = bVar.a(tje.r(i3, bVar.a), true, superappSuggestFlexModalViewRouter$provideModalView$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cVar = cVar3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.go.suggest.impl.presenter.c cVar4 = (com.yandex.go.suggest.impl.presenter.c) superappSuggestFlexModalViewRouter$provideModalView$1.L$2;
                    wksVar = (wks) superappSuggestFlexModalViewRouter$provideModalView$1.L$1;
                    kotlin.b.b(obj);
                    cVar = cVar4;
                }
                Drawable drawable = (Drawable) obj;
                tse o = o();
                ru2 ru2Var = wksVar.a;
                return new FullscreenSuperappSuggestModalView((Context) ((lag) ru2Var.a).get(), (yhr) ((oag) ru2Var.b).get(), cVar, drawable, o, (pav) ((oag) ru2Var.c).get(), (nhr) ((mz0) ru2Var.d).get(), (ru.yandex.taxi.design.utils.a) ((oag) ru2Var.e).get(), (pwy0) ((oag) ru2Var.f).get(), (f8v0) ((n3w) ru2Var.g).a, (pw2) ((lag) ru2Var.h).get(), (w66) ((lag) ru2Var.i).get());
            }
        }
        superappSuggestFlexModalViewRouter$provideModalView$1 = new SuperappSuggestFlexModalViewRouter$provideModalView$1(this, (ContinuationImpl) continuation);
        Object obj2 = superappSuggestFlexModalViewRouter$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestFlexModalViewRouter$provideModalView$1.label;
        if (i != 0) {
        }
        Drawable drawable2 = (Drawable) obj2;
        tse o2 = o();
        ru2 ru2Var2 = wksVar.a;
        return new FullscreenSuperappSuggestModalView((Context) ((lag) ru2Var2.a).get(), (yhr) ((oag) ru2Var2.b).get(), cVar, drawable2, o2, (pav) ((oag) ru2Var2.c).get(), (nhr) ((mz0) ru2Var2.d).get(), (ru.yandex.taxi.design.utils.a) ((oag) ru2Var2.e).get(), (pwy0) ((oag) ru2Var2.f).get(), (f8v0) ((n3w) ru2Var2.g).a, (pw2) ((lag) ru2Var2.h).get(), (w66) ((lag) ru2Var2.i).get());
    }
}
