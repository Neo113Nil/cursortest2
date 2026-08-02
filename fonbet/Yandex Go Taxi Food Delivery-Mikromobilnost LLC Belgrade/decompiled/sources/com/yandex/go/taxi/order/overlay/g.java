package com.yandex.go.taxi.order.overlay;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.provider.c0;
import defpackage.a3y0;
import defpackage.ah00;
import defpackage.ffx;
import defpackage.g18;
import defpackage.gh00;
import defpackage.gi70;
import defpackage.ii70;
import defpackage.ixx0;
import defpackage.ji70;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.qc5;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class g extends qc5 {
    public final tt2 A;
    public final ah00 B;
    public final ru.yandex.taxi.translations.interactor.a C;
    public final ixx0 D;
    public final com.yandex.go.taxi.order.provider.a E;
    public final gi70 F;
    public final com.yandex.go.taxi.order.search.overlay.companions.a G;
    public final a3y0 H;
    public final n0 I;
    public final n0 J;
    public g18 K;
    public o2y0 L;
    public final ji70 M;
    public Map N;
    public List O;
    public List P;

    public g(tt2 tt2Var, ah00 ah00Var, o2y0 o2y0Var, ru.yandex.taxi.translations.interactor.a aVar, ixx0 ixx0Var, ney neyVar, com.yandex.go.taxi.order.provider.a aVar2, gi70 gi70Var, com.yandex.go.taxi.order.search.overlay.companions.a aVar3) {
        super(ii70.class, neyVar);
        this.A = tt2Var;
        this.B = ah00Var;
        this.C = aVar;
        this.D = ixx0Var;
        this.E = aVar2;
        this.F = gi70Var;
        this.G = aVar3;
        this.H = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderBubblesPresenter");
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.I = ffx.b(0, 1, bufferOverflow);
        this.J = ffx.b(0, 1, bufferOverflow);
        this.K = g18.u1;
        this.L = o2y0Var;
        this.M = new ji70(1, this);
        this.N = kotlin.collections.b.f();
        EmptyList emptyList = EmptyList.a;
        this.O = emptyList;
        this.P = emptyList;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        this.K.cancel();
        this.K = g18.u1;
        ((gh00) this.B).u(this.M);
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        ((gh00) this.B).e(this.M);
        Mg();
        tje.N(Kg(), null, null, new OrderBubblesPresenter$onResume$1(this, null), 3);
        this.K = this.E.b(new f(this));
        tpr t = kotlinx.coroutines.flow.e.t(new e(this.I, this));
        this.A.getClass();
        sjh sjhVar = uyj.a;
        tje.N(Kg(), null, null, new OrderBubblesPresenter$listenUpdateRouteBubbles$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(t, sjhVar), null, this), 3);
        n0 n0Var = this.J;
        tje.N(Kg(), null, null, new OrderBubblesPresenter$listenCompanions$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.t(new c(n0Var, this)), new OrderBubblesPresenter$listenCompanions$2(this, null)), sjhVar), null, this), 3);
        Ng();
        n0Var.g(zy11.a);
    }

    public final void Mg() {
        o2y0 o2y0Var = this.L;
        if (o2y0Var == null) {
            return;
        }
        ixx0 ixx0Var = this.D;
        ixx0Var.getClass();
        tje.N(Kg(), null, null, new OrderBubblesPresenter$subscribeOrderHolder$$inlined$safeCollectIn$1(new c0(o2y0Var.a(), ixx0Var), null, this, this), 3);
    }

    public final void Ng() {
        this.I.g(zy11.a);
    }
}
