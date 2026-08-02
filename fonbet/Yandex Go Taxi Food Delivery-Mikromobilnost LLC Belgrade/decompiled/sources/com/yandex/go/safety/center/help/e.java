package com.yandex.go.safety.center.help;

import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import defpackage.atd0;
import defpackage.g92;
import defpackage.h3y;
import defpackage.hrl0;
import defpackage.ia5;
import defpackage.itl0;
import defpackage.jqr;
import defpackage.krl0;
import defpackage.lrl0;
import defpackage.mdh;
import defpackage.mo21;
import defpackage.nrl0;
import defpackage.orl0;
import defpackage.po21;
import defpackage.ppl0;
import defpackage.q3u0;
import defpackage.qu;
import defpackage.sjh;
import defpackage.swe0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse0;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.y50;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.h;

/* loaded from: classes13.dex */
public final class e extends ia5 {
    public final SafetyCenterExperiment A;
    public final atd0 B;
    public final po21 C;
    public final h D;
    public final y50 E;
    public final itl0 F;
    public final tt2 G;
    public final h3y H;
    public final krl0 I;
    public final com.yandex.go.safety.center.analytics.a J;
    public volatile mo21 K;
    public final j z;

    public e(j jVar, SafetyCenterExperiment safetyCenterExperiment, atd0 atd0Var, po21 po21Var, h hVar, y50 y50Var, itl0 itl0Var, tt2 tt2Var, h3y h3yVar, krl0 krl0Var, hrl0 hrl0Var, com.yandex.go.safety.center.analytics.a aVar, q3u0 q3u0Var) {
        super(nrl0.class, q3u0Var, hrl0Var);
        this.z = jVar;
        this.A = safetyCenterExperiment;
        this.B = atd0Var;
        this.C = po21Var;
        this.D = hVar;
        this.E = y50Var;
        this.F = itl0Var;
        this.G = tt2Var;
        this.H = h3yVar;
        this.I = krl0Var;
        this.J = aVar;
    }

    @Override // defpackage.ia5, defpackage.ad5, defpackage.zc5
    /* renamed from: Kg, reason: merged with bridge method [inline-methods] */
    public final void Bg(nrl0 nrl0Var) {
        super.Bg(nrl0Var);
        hrl0 hrl0Var = this.y;
        if (!hrl0Var.a()) {
            hrl0Var.c(new orl0(this, 0), false);
        }
        g X = kotlinx.coroutines.flow.e.X(new jqr(new n(((ru.yandex.taxi.preorder.source.userposition.e) this.C).n(), new SafetyCenterHelpPresenter$updateLocation$1(this, null)), new SafetyCenterHelpPresenter$updateLocation$2(this, null), 3), new SafetyCenterHelpPresenter$updateLocation$$inlined$flatMapLatest$1(this, null));
        this.G.getClass();
        sjh sjhVar = uyj.a;
        tje.N(Jg(), null, null, new SafetyCenterHelpPresenter$updateLocation$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(X, mdh.b), null, this), 3);
        j jVar = this.z;
        tje.N(Jg(), null, null, new SafetyCenterHelpPresenter$observeSharingUIChanges$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(new m0(jVar.B, jVar.q, new SafetyCenterHelpPresenter$observeSharingUIChanges$1(3, null))), null, this), 3);
    }

    public final boolean Lg() {
        j jVar = this.z;
        if (jVar.d() == null || jVar.f().isEmpty()) {
            return false;
        }
        return ((Boolean) jVar.q.getValue()).booleanValue();
    }

    public final jqr Mg(int i, boolean z) {
        return new jqr(com.yandex.go.coroutines.b.k(kotlinx.coroutines.flow.e.T(new b(new d(this.D.a()), z), 1), TimeUnit.SECONDS.toMillis(i), new g92(2, Boolean.valueOf(z))), new SafetyCenterHelpPresenter$observeCallStateChanging$3(z, null), 3);
    }

    public final void Ng(boolean z, boolean z2, ShareRequestParam.NotificationType notificationType) {
        List f = this.z.f();
        ArrayList arrayList = new ArrayList(tcc.n(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(((swe0) it.next()).b);
        }
        tje.N(Jg(), null, null, new SafetyCenterHelpPresenter$share$1(this, arrayList, notificationType, z, z2, null), 3);
        ppl0 ppl0Var = this.J.a;
        ppl0Var.a.a("SafetyCenter.Emergency.ShareExecuted", tse0.o(ppl0Var), 1, new HashMap());
    }

    @Override // defpackage.p95
    public final void onBackPressed() {
        ((lrl0) this.I.b).r(new qu(9));
    }
}
