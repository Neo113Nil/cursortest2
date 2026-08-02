package com.yandex.go.address.search.common.presenter;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.address.search.common.presenter.a;
import com.yandex.go.shortcuts.analytic.MainScreenAnalytics$Action;
import com.yandex.go.shortcuts.analytic.MainScreenAnalytics$MainScreenState;
import com.yandex.go.zone.model.Zone;
import defpackage.bjd;
import defpackage.caq0;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.jl0;
import defpackage.jl40;
import defpackage.k8v0;
import defpackage.kvh;
import defpackage.lwf0;
import defpackage.mrj;
import defpackage.nwf0;
import defpackage.psd;
import defpackage.pv0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.qqo;
import defpackage.qsd;
import defpackage.qv10;
import defpackage.rsd;
import defpackage.sls;
import defpackage.ssd;
import defpackage.tit0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tsd;
import defpackage.ul5;
import defpackage.usd;
import defpackage.v51;
import defpackage.v6v0;
import defpackage.v7v0;
import defpackage.vbb;
import defpackage.w4l0;
import defpackage.w4v0;
import defpackage.w511;
import defpackage.x9v0;
import defpackage.yn0;
import defpackage.ysd;
import defpackage.yy4;
import defpackage.z81;
import defpackage.zxs0;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.analytics.Events$Suggest$ZeroSuggestAdditionalTapArea;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;
import ru.yandex.taxi.mainscreen.analytics.MainScreenAnalyticsScreenMode;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.modalview.ModalViewProcessing$ProcessingState;

/* loaded from: classes12.dex */
public final class a extends yy4 {
    public final ru.yandex.taxi.styling.f A;
    public final caq0 B;
    public final vbb C;
    public final ru.yandex.taxi.search.a D;
    public final com.yandex.go.address.search.common.deeplink.a E;
    public final ru.yandex.taxi.search.c F;
    public final ul5 G;
    public final zxs0 H;
    public final mrj I;
    public final com.yandex.go.zone.interactors.b J;
    public final MainScreenBehavior K;
    public final w4l0 L;
    public final kvh M;
    public final kvh N;
    public final com.yandex.go.address.search.perf.c O;
    public final pwy0 P;
    public final i3y Q;
    public final i3y R;
    public final i3y S;
    public final i3y T;
    public pv0 U;
    public pv0 V;
    public pv0 W;
    public boolean Z;
    public int a0;
    public boolean b0;
    public ModalViewProcessing$ProcessingState c0;
    public int d0;
    public v51 e0;
    public final d x;
    public final b y;
    public final tit0 z;

    public a(d dVar, b bVar, tit0 tit0Var, ru.yandex.taxi.styling.f fVar, caq0 caq0Var, vbb vbbVar, ru.yandex.taxi.search.a aVar, com.yandex.go.address.search.common.deeplink.a aVar2, ru.yandex.taxi.search.c cVar, ul5 ul5Var, zxs0 zxs0Var, mrj mrjVar, com.yandex.go.zone.interactors.b bVar2, MainScreenBehavior mainScreenBehavior, w4l0 w4l0Var, kvh kvhVar, kvh kvhVar2, com.yandex.go.address.search.perf.c cVar2, pwy0 pwy0Var) {
        this.x = dVar;
        this.y = bVar;
        this.z = tit0Var;
        this.A = fVar;
        this.B = caq0Var;
        this.C = vbbVar;
        this.D = aVar;
        this.E = aVar2;
        this.F = cVar;
        this.G = ul5Var;
        this.H = zxs0Var;
        this.I = mrjVar;
        this.J = bVar2;
        this.K = mainScreenBehavior;
        this.L = w4l0Var;
        this.M = kvhVar;
        this.N = kvhVar2;
        this.O = cVar2;
        this.P = pwy0Var;
        final int i = 0;
        this.Q = kotlin.a.a(new sls(this) { // from class: osd
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar3 = this.b;
                switch (i2) {
                    case 0:
                        return new qsd(aVar3, aVar3.L.e());
                    case 1:
                        return new ysd(aVar3);
                    case 2:
                        return new tsd(aVar3, PointType.SOURCE);
                    default:
                        return new tsd(aVar3, PointType.DESTINATION);
                }
            }
        });
        final int i2 = 1;
        this.R = kotlin.a.a(new sls(this) { // from class: osd
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new qsd(aVar3, aVar3.L.e());
                    case 1:
                        return new ysd(aVar3);
                    case 2:
                        return new tsd(aVar3, PointType.SOURCE);
                    default:
                        return new tsd(aVar3, PointType.DESTINATION);
                }
            }
        });
        final int i3 = 2;
        this.S = kotlin.a.a(new sls(this) { // from class: osd
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new qsd(aVar3, aVar3.L.e());
                    case 1:
                        return new ysd(aVar3);
                    case 2:
                        return new tsd(aVar3, PointType.SOURCE);
                    default:
                        return new tsd(aVar3, PointType.DESTINATION);
                }
            }
        });
        final int i4 = 3;
        this.T = kotlin.a.a(new sls(this) { // from class: osd
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                a aVar3 = this.b;
                switch (i22) {
                    case 0:
                        return new qsd(aVar3, aVar3.L.e());
                    case 1:
                        return new ysd(aVar3);
                    case 2:
                        return new tsd(aVar3, PointType.SOURCE);
                    default:
                        return new tsd(aVar3, PointType.DESTINATION);
                }
            }
        });
        Address h = w4l0Var.h();
        pv0 pv0Var = null;
        if (h != null) {
            h = h.X1() ? null : h;
            if (h != null) {
                pv0Var = new pv0(h, null, null, null, null, null, null, null, 1022);
            }
        }
        this.U = pv0Var;
        this.V = pv0Var;
        this.c0 = ModalViewProcessing$ProcessingState.DONE;
        this.d0 = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (defpackage.jl40.l(r5, r6 != null ? r6.a.B() : null) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void uh(a aVar, w4v0 w4v0Var) {
        aVar.getClass();
        PointType pointType = w4v0Var.a;
        String str = w4v0Var.d;
        String str2 = w4v0Var.b;
        ((bjd) aVar.Dg()).setActivePoint(pointType);
        pv0 pv0Var = w4v0Var.c;
        if (pv0Var != null && aVar.V != null) {
            zzs B = pv0Var.a.B();
            pv0 pv0Var2 = aVar.V;
        }
        if (pv0Var != null) {
            aVar.V = pv0Var;
            aVar.vh(pv0Var, PointType.SOURCE);
        } else {
            aVar.V = null;
            ((bjd) aVar.Dg()).Rd(str2);
        }
        pv0 pv0Var3 = w4v0Var.e;
        if (pv0Var3 != null) {
            aVar.W = pv0Var3;
            aVar.vh(pv0Var3, PointType.DESTINATION);
        } else {
            aVar.W = null;
            ((bjd) aVar.Dg()).D3(str);
        }
        int i = usd.a[pointType.ordinal()];
        if (i == 1) {
            aVar.Dh(PointType.DESTINATION);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            aVar.Dh(PointType.SOURCE);
        }
        if (pointType == PointType.SOURCE) {
            str = str2;
        }
        if (str != null) {
            aVar.Qg(pointType, str);
        }
    }

    public final void Ah(pv0 pv0Var, PointType pointType) {
        int i = usd.a[pointType.ordinal()];
        if (i == 1) {
            this.V = pv0Var;
            Ch();
        } else if (i != 2) {
            w511.b();
        } else {
            this.W = pv0Var;
            Bh();
        }
    }

    public final void Bh() {
        List list = xh().b;
        String l = list.isEmpty() ? "" : q5z.l(list);
        int size = xh().b.size();
        if (size == 1 || this.b0) {
            ((bjd) Dg()).od();
        } else if (size > 1) {
            ((bjd) Dg()).R4(size, l);
        } else if (Wg()) {
            ((bjd) Dg()).ye();
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.x.Cg();
        xh().getClass();
        b bVar = this.y;
        bVar.Cg();
        ((nwf0) ((lwf0) bVar.t0.getValue())).a(null);
    }

    public final void Ch() {
        String F;
        pv0 pv0Var = this.V;
        if (pv0Var == null || (F = q5z.F(pv0Var.a)) == null) {
            pv0 pv0Var2 = this.U;
            F = pv0Var2 != null ? q5z.F(pv0Var2.a) : null;
        }
        if (F == null || F.length() == 0) {
            return;
        }
        ((bjd) Dg()).b2(PointType.SOURCE);
    }

    public final void Dh(PointType pointType) {
        if (pointType != PointType.SOURCE ? Wg() || this.W != null : this.V != null) {
            ((bjd) Dg()).b2(pointType);
        } else {
            ((bjd) Dg()).Jc(pointType);
        }
    }

    @Override // defpackage.zc5
    public final void Fg() {
        this.x.pause();
        pzt0 pzt0Var = xh().c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.y.pause();
    }

    @Override // defpackage.zc5
    public final void Gg() {
        this.x.resume();
        qsd xh = xh();
        xh.getClass();
        this.y.resume();
        a aVar = xh.d;
        xh.c = tje.N(aVar.Jg(), null, null, new CompositeSuggestionsPresenter$LiveDestinationBlockHandler$resume$$inlined$safeCollectIn$1(aVar.L.g(), null, xh), 3);
    }

    @Override // defpackage.yy4
    public final void Kg(ModalViewProcessing$ProcessingState modalViewProcessing$ProcessingState) {
        this.c0 = modalViewProcessing$ProcessingState;
    }

    @Override // defpackage.yy4
    public final void Lg(PointType pointType) {
        int i = usd.a[pointType.ordinal()];
        final int i2 = 0;
        d dVar = this.x;
        b bVar = this.y;
        final int i3 = 1;
        if (i == 1) {
            dVar.e0 = true;
            bVar.e0 = false;
            ((tsd) this.S.getValue()).h(new BiConsumer(this) { // from class: nsd
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    int i4 = i2;
                    a aVar = this.b;
                    PointType pointType2 = (PointType) obj;
                    pv0 pv0Var = (pv0) obj2;
                    switch (i4) {
                        case 0:
                            aVar.vh(pv0Var, pointType2);
                            break;
                        default:
                            aVar.vh(pv0Var, pointType2);
                            break;
                    }
                }
            });
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            dVar.e0 = false;
            bVar.e0 = true;
            yh().h(new BiConsumer(this) { // from class: nsd
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    int i4 = i3;
                    a aVar = this.b;
                    PointType pointType2 = (PointType) obj;
                    pv0 pv0Var = (pv0) obj2;
                    switch (i4) {
                        case 0:
                            aVar.vh(pv0Var, pointType2);
                            break;
                        default:
                            aVar.vh(pv0Var, pointType2);
                            break;
                    }
                }
            });
        }
        ((bjd) Dg()).b2(pointType);
        ((nwf0) ((lwf0) bVar.t0.getValue())).a((ysd) this.R.getValue());
        com.yandex.go.coroutines.b.g(Jg(), null, null, new CompositeSuggestionsPresenter$attachActiveView$3(this, pointType, null), 3);
    }

    @Override // defpackage.yy4
    public final void Mg(bjd bjdVar, PointType pointType) {
        Bg(bjdVar);
        tje.N(Jg(), null, null, new CompositeSuggestionsPresenter$attachView$$inlined$safeCollectIn$1(bjdVar, ru.yandex.taxi.search.c.a(this.F, null, this.P.a(), 1), this, null), 3);
        this.x.f0 = bjdVar.H();
        this.y.f0 = bjdVar.H();
        if (Wg()) {
            bjdVar.ye();
        } else {
            bjdVar.od();
            PointType pointType2 = PointType.SOURCE;
            if (pointType == pointType2) {
                pointType2 = PointType.DESTINATION;
            }
            Lg(pointType2);
            Pg(pointType2);
        }
        Lg(pointType);
        com.yandex.go.coroutines.b.g(Jg(), null, null, new CompositeSuggestionsPresenter$attachView$2(this, pointType, bjdVar, null), 3);
    }

    @Override // defpackage.yy4
    public final void Ng(PointType pointType, boolean z) {
        zh(pointType).Kg(z);
    }

    @Override // defpackage.yy4
    public final void Og(bjd bjdVar) {
        pv0 pv0Var = this.V;
        if (pv0Var != null) {
            Ah(pv0Var, PointType.SOURCE);
        } else {
            Ah(this.U, PointType.SOURCE);
        }
        pv0 pv0Var2 = this.W;
        bjdVar.T2(pv0Var2 == null || (pv0Var2 instanceof psd) || Wg(), null);
    }

    @Override // defpackage.yy4
    public final void Pg(PointType pointType) {
        Dh(pointType);
        int i = usd.a[pointType.ordinal()];
        int i2 = 0;
        if (i == 1) {
            tsd tsdVar = (tsd) this.S.getValue();
            tsdVar.c = new ssd(i2);
            tsdVar.w = null;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            tsd yh = yh();
            yh.c = new ssd(i2);
            yh.w = null;
        }
    }

    @Override // defpackage.yy4
    public final void Qg(PointType pointType, String str) {
        kvh kvhVar;
        jl0 jl0Var;
        jl0 jl0Var2;
        kvh kvhVar2;
        jl0 jl0Var3;
        jl0 jl0Var4;
        Ah(null, pointType);
        zh(pointType).Lg(str);
        if (pointType == PointType.SOURCE && (jl0Var3 = (kvhVar2 = this.M).f) != null && jl40.l(jl0Var3.b, evu0.k0(str).toString()) && (jl0Var4 = kvhVar2.f) != null) {
            kvhVar2.a.a.l(jl0Var4);
        }
        if (pointType != PointType.DESTINATION || (jl0Var = (kvhVar = this.N).f) == null || !jl40.l(jl0Var.b, evu0.k0(str).toString()) || (jl0Var2 = kvhVar.f) == null) {
            return;
        }
        kvhVar.a.a.l(jl0Var2);
    }

    @Override // defpackage.yy4
    public final tpr Rg(PointType pointType, x9v0 x9v0Var) {
        return zh(pointType).Mg(x9v0Var);
    }

    @Override // defpackage.yy4
    public final ModalViewProcessing$ProcessingState Sg() {
        return this.c0;
    }

    @Override // defpackage.yy4
    public final void Tg(PointType pointType) {
        zh(pointType).hideKeyboard();
    }

    @Override // defpackage.yy4
    public final boolean Ug() {
        return ((Boolean) ((qqo) this.G.a.getValue()).b()).booleanValue();
    }

    @Override // defpackage.yy4
    public final void Vg(bjd bjdVar) {
        if (this.b0) {
            bjdVar.setActivePoint(PointType.DESTINATION);
        } else if (Wg() || (this.V == null && this.U == null)) {
            bjdVar.setActivePoint(PointType.SOURCE);
        } else {
            bjdVar.setActivePoint(PointType.DESTINATION);
        }
    }

    @Override // defpackage.yy4
    public final boolean Wg() {
        return xh().a;
    }

    @Override // defpackage.yy4
    public final void Xg(PointType pointType) {
        zh(pointType).Rg();
    }

    @Override // defpackage.yy4
    public final void Yg(yn0 yn0Var, String str, String str2, Events$Suggest$ZeroSuggestAdditionalTapArea events$Suggest$ZeroSuggestAdditionalTapArea, PointType pointType) {
        zh(pointType).fh(yn0Var, str, str2, events$Suggest$ZeroSuggestAdditionalTapArea);
    }

    @Override // defpackage.yy4
    public final void Zg(String str, String str2, PointType pointType) {
        zh(pointType).gh(str, str2);
    }

    @Override // defpackage.yy4
    public final void ah(PointType pointType) {
        zh(pointType).hh();
    }

    @Override // defpackage.yy4
    public final void bc(k8v0 k8v0Var) {
        this.x.bc(k8v0Var);
    }

    @Override // defpackage.yy4
    public final void bh(bjd bjdVar, ModalViewProcessing$ProcessingState modalViewProcessing$ProcessingState, boolean z, boolean z2) {
        pv0 pv0Var;
        v51 v51Var;
        Address k;
        pv0 pv0Var2;
        v51 v51Var2;
        if (this.a0 > 0 && z2) {
            this.C.U(MainScreenAnalytics$Action.PULL, bjdVar.S6(), z ? MainScreenAnalytics$MainScreenState.MINIMIZED : MainScreenAnalytics$MainScreenState.COLLAPSED);
        }
        this.a0++;
        Vg(bjdVar);
        PointType pointType = PointType.SOURCE;
        i zh = zh(pointType);
        if (zh.c0 && zh.f0) {
            zh.c0 = false;
            zh.M.c(zh.e0);
            zh.vh();
        }
        PointType pointType2 = PointType.DESTINATION;
        i zh2 = zh(pointType2);
        if (zh2.c0 && zh2.f0) {
            zh2.c0 = false;
            zh2.M.c(zh2.e0);
            zh2.vh();
        }
        if (modalViewProcessing$ProcessingState == ModalViewProcessing$ProcessingState.MINIMIZED) {
            return;
        }
        pv0 pv0Var3 = this.V;
        if (pv0Var3 == null && (pv0Var2 = this.U) != null) {
            Ah(pv0Var2, pointType);
            pv0 pv0Var4 = this.U;
            if (pv0Var4 != null && (v51Var2 = this.e0) != null) {
                v51Var2.accept(pv0Var4);
            }
        } else if (pv0Var3 != null && !pv0Var3.equals(this.U) && (pv0Var = this.V) != null && (v51Var = this.e0) != null) {
            v51Var.accept(pv0Var);
        }
        if (this.b0 && this.W == null && (k = this.L.k()) != null) {
            Ah(new pv0(k, null, null, null, null, null, null, null, 1022), pointType2);
        }
    }

    @Override // defpackage.yy4
    public final void ch() {
        wh();
    }

    @Override // defpackage.yy4
    public final void dh() {
        ((bjd) Dg()).Z8();
    }

    @Override // defpackage.yy4
    public final void eh(boolean z, MainScreenAnalyticsScreenMode mainScreenAnalyticsScreenMode, boolean z2) {
        zh(PointType.SOURCE).Eh();
        zh(PointType.DESTINATION).Eh();
        if (mainScreenAnalyticsScreenMode == MainScreenAnalyticsScreenMode.SHORTCUTS && z2) {
            return;
        }
        PointType S6 = ((bjd) Dg()).S6();
        MainScreenAnalytics$MainScreenState mainScreenAnalytics$MainScreenState = MainScreenAnalytics$MainScreenState.EXPANDED;
        vbb vbbVar = this.C;
        vbbVar.getClass();
        vbbVar.U(z ? MainScreenAnalytics$Action.TAP : MainScreenAnalytics$Action.PULL, S6, mainScreenAnalytics$MainScreenState);
    }

    @Override // defpackage.yy4
    public final void fh(PointType pointType, x9v0 x9v0Var) {
        zh(pointType).Vg(x9v0Var);
    }

    @Override // defpackage.yy4
    public final void gh(PointType pointType, x9v0 x9v0Var) {
        zh(pointType).ih(x9v0Var);
    }

    @Override // defpackage.yy4
    public final void hh(v6v0 v6v0Var) {
        i zh;
        PointType pointType = v6v0Var.b;
        if (pointType == null || (zh = zh(pointType)) == null) {
            return;
        }
        zh.Wg(v6v0Var);
    }

    @Override // defpackage.yy4
    public final void ih(PointType pointType) {
        ((bjd) Dg()).b2(pointType);
    }

    @Override // defpackage.yy4
    public final void jh(PointType pointType, int i) {
        zh(pointType).N0(i);
    }

    @Override // defpackage.yy4
    public final void kh(Address address) {
        if (address == null) {
            return;
        }
        pv0 pv0Var = this.U;
        if (z81.b(address, pv0Var != null ? pv0Var.a : null)) {
            return;
        }
        pv0 pv0Var2 = new pv0(address, null, null, null, null, null, null, null, 1022);
        this.U = pv0Var2;
        PointType pointType = PointType.SOURCE;
        Ah(pv0Var2, pointType);
        Dh(pointType);
    }

    @Override // defpackage.yy4
    public final void lh() {
        PointType S6 = ((bjd) Dg()).S6();
        qv10.B(S6 == PointType.SOURCE, this.x.B0.a, null);
        qv10.B(S6 == PointType.DESTINATION, this.y.q0.d, null);
    }

    @Override // defpackage.yy4
    public final void mh(PointType pointType) {
        Ah(null, pointType);
        zh(pointType).kh();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r5.U != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r5.Z != false) goto L33;
     */
    @Override // defpackage.yy4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void nh() {
        int min;
        bjd bjdVar = (bjd) Dg();
        rsd rsdVar = yh().b;
        if (!rsdVar.b && this.Z && this.c0 == ModalViewProcessing$ProcessingState.DONE) {
            this.d0 = rsdVar.a.size();
        }
        if (rsdVar.b || this.c0 == ModalViewProcessing$ProcessingState.LOADING) {
            min = Math.min(this.d0, 2);
        } else {
            if (!Wg() && this.W == null) {
                List list = xh().b;
                if ((list.isEmpty() ? "" : q5z.l(list)).length() == 0) {
                    if (this.V == null) {
                    }
                }
            }
            if (!this.b0) {
                min = 0;
            }
            min = Math.min(rsdVar.a.size(), 2);
        }
        bjdVar.W8(min);
    }

    @Override // defpackage.yy4
    public final void oh(Address address, PointType pointType) {
        if (pointType != PointType.SOURCE) {
            this.y.ah(address);
            return;
        }
        String zoneName = address.getZoneName();
        if (zoneName != null) {
            com.yandex.go.coroutines.b.g(Jg(), null, null, new CompositeSuggestionsPresenter$pointOnMapClicked$1(this, zoneName, address, null), 3);
            return;
        }
        this.L.i(new ZoneAddress(address, (Zone) null));
        this.x.ah(address);
    }

    @Override // defpackage.yy4
    public final void onDismiss() {
        this.x.ch();
        this.y.onDismiss();
    }

    @Override // defpackage.yy4
    public final void ph(PointType pointType) {
        zh(pointType).Zg();
    }

    @Override // defpackage.yy4
    public final void qh(Uri uri) {
        com.yandex.go.coroutines.b.g(Jg(), null, null, new CompositeSuggestionsPresenter$processDeeplink$1(this, uri, null), 3);
    }

    @Override // defpackage.yy4
    public final void rh(PointType pointType) {
        zh(pointType).lh();
    }

    @Override // defpackage.yy4
    public final void s7(k8v0 k8v0Var) {
        this.x.s7(k8v0Var);
    }

    @Override // defpackage.yy4
    public final void sh(boolean z) {
        com.yandex.go.coroutines.b.g(Jg(), null, null, new CompositeSuggestionsPresenter$setupShadow$1(z, this, null), 3);
    }

    @Override // defpackage.yy4
    public final void th(PointType pointType) {
        zh(pointType).showKeyboard();
    }

    public final void vh(pv0 pv0Var, PointType pointType) {
        Object obj;
        b bVar = this.y;
        SourcePicker sourcePicker = bVar.o0;
        boolean z = sourcePicker == SourcePicker.A_FROM_ORDER || sourcePicker == SourcePicker.B_FROM_ORDER;
        Ah(pv0Var, pointType);
        PointType pointType2 = PointType.SOURCE;
        caq0 caq0Var = this.B;
        if (pointType == pointType2) {
            caq0Var.getClass();
            if (caq0.a(pv0Var) && !((bjd) Dg()).H() && !z) {
                zzs zzsVar = pv0Var.j;
                if (zzsVar != null) {
                    ((bjd) Dg()).Yc(zzsVar);
                }
                this.C.U(MainScreenAnalytics$Action.TAP, ((bjd) Dg()).S6(), MainScreenAnalytics$MainScreenState.COLLAPSED);
                ((bjd) Dg()).dismiss();
            }
        }
        if (pointType == pointType2) {
            caq0Var.getClass();
            if (caq0.a(pv0Var) && ((bjd) Dg()).H()) {
                ((bjd) Dg()).collapse();
                return;
            }
        }
        if (pointType == pointType2 && (pv0Var.a.X1() || this.z.c())) {
            wh();
        } else {
            pv0 pv0Var2 = this.V;
            if (pv0Var2 == null || pv0Var2.a.X1()) {
                ((bjd) Dg()).setActivePoint(pointType2);
                return;
            }
            if (Wg()) {
                wh();
                ((bjd) Dg()).T2(false, null);
            } else {
                if (pv0Var.k) {
                    return;
                }
                pv0 pv0Var3 = this.W;
                if (pv0Var3 == null) {
                    ((bjd) Dg()).setActivePoint(PointType.DESTINATION);
                    bVar.onSourceAddressChanged(pv0Var);
                    return;
                }
                if (pv0Var3 instanceof psd) {
                    wh();
                    ((bjd) Dg()).T2(true, null);
                    bVar.onSourceAddressChanged(pv0Var);
                } else {
                    wh();
                    if (pointType == pointType2) {
                        bVar.onSourceAddressChanged(pv0Var);
                        ((bjd) Dg()).T2(false, null);
                    } else {
                        List list = pv0Var.h;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                v7v0 v7v0Var = (v7v0) obj;
                                if (jl40.l(v7v0Var != null ? v7v0Var.a : null, pv0Var.a.B()) && v7v0Var.M != null) {
                                    break;
                                }
                            }
                            v7v0 v7v0Var2 = (v7v0) obj;
                            ((bjd) Dg()).T2(false, v7v0Var2 != null ? v7v0Var2.M : null);
                        }
                    }
                }
            }
        }
        this.C.U(MainScreenAnalytics$Action.TAP, ((bjd) Dg()).S6(), MainScreenAnalytics$MainScreenState.COLLAPSED);
        ((bjd) Dg()).dismiss();
    }

    public final void wh() {
        pv0 pv0Var;
        v51 v51Var;
        if (jl40.l(this.V, this.U) || (pv0Var = this.V) == null || (v51Var = this.e0) == null) {
            return;
        }
        v51Var.accept(pv0Var);
    }

    public final qsd xh() {
        return (qsd) this.Q.getValue();
    }

    public final tsd yh() {
        return (tsd) this.T.getValue();
    }

    public final i zh(PointType pointType) {
        int i = usd.a[pointType.ordinal()];
        if (i == 1) {
            return this.x;
        }
        if (i == 2) {
            return this.y;
        }
        w511.b();
        return null;
    }
}
