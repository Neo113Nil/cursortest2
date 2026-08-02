package com.yandex.go.safety.center.contacts;

import com.yandex.go.safety.center.api.SafetyCenterConfig;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.api.TrustedContacts;
import com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.safety.center.share.notification.ShareStatus;
import defpackage.crl0;
import defpackage.fkr0;
import defpackage.hrl0;
import defpackage.ia5;
import defpackage.l050;
import defpackage.mdh;
import defpackage.mo21;
import defpackage.ntl0;
import defpackage.pgk0;
import defpackage.po21;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q3u0;
import defpackage.qu;
import defpackage.sjh;
import defpackage.swe0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uql0;
import defpackage.uyj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.order.l;

/* loaded from: classes13.dex */
public final class a extends ia5 {
    public final l A;
    public final po21 B;
    public final tt2 C;
    public final pgk0 D;
    public final fkr0 E;
    public final com.yandex.go.safety.center.analytics.a F;
    public mo21 G;
    public boolean H;
    public boolean I;
    public ShareStatus J;
    public pzt0 K;
    public final j z;

    public a(j jVar, l lVar, po21 po21Var, tt2 tt2Var, hrl0 hrl0Var, pgk0 pgk0Var, fkr0 fkr0Var, com.yandex.go.safety.center.analytics.a aVar, q3u0 q3u0Var) {
        super(SafetyCenterContactsMvpView.class, q3u0Var, hrl0Var);
        this.z = jVar;
        this.A = lVar;
        this.B = po21Var;
        this.C = tt2Var;
        this.D = pgk0Var;
        this.E = fkr0Var;
        this.F = aVar;
        this.I = true;
    }

    @Override // defpackage.ia5, defpackage.ad5, defpackage.zc5
    public final void Bg(l050 l050Var) {
        SafetyCenterContactsMvpView safetyCenterContactsMvpView = (SafetyCenterContactsMvpView) l050Var;
        super.Bg(safetyCenterContactsMvpView);
        int i = 1;
        safetyCenterContactsMvpView.showLoading(true);
        int i2 = 0;
        safetyCenterContactsMvpView.setShareDescription(this.A.b(false) ? SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_NOTIFY_DESCRIPTION : SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_NOTIFY_DESCRIPTION_NO_TRIP);
        j jVar = this.z;
        tje.N(Jg(), null, null, new SafetyCenterContactsPresenter$attachView$$inlined$safeCollectIn$1(jVar.b(), com.yandex.go.coroutines.b.e(), null, this), 3);
        tje.N(Jg(), null, null, new SafetyCenterContactsPresenter$attachView$$inlined$safeCollectIn$2(jVar.v, com.yandex.go.coroutines.b.e(), null, this), 3);
        uql0 uql0Var = new uql0(this, i2);
        hrl0 hrl0Var = this.y;
        hrl0Var.c(uql0Var, true);
        hrl0Var.b(new uql0(this, i));
        ntl0 ntl0Var = (ntl0) jVar.y.get(Kg());
        if (ntl0Var != null) {
            Lg(ntl0Var);
        }
        tje.N(Jg(), null, null, new SafetyCenterContactsPresenter$updateLocation$1(this, null), 3);
    }

    public final ShareRequestParam Kg() {
        j jVar = this.z;
        List f = jVar.f();
        ArrayList arrayList = new ArrayList(tcc.n(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(((swe0) it.next()).b);
        }
        return jVar.n(this.G, ShareRequestParam.NotificationType.CONTACT_REQUEST, arrayList);
    }

    public final void Lg(ntl0 ntl0Var) {
        pz40 pz40Var = ntl0Var.b;
        this.C.getClass();
        sjh sjhVar = uyj.a;
        this.K = tje.N(Jg(), null, null, new SafetyCenterContactsPresenter$subscribeToShareSession$$inlined$safeCollectIn$1(e.F(pz40Var, mdh.b), com.yandex.go.coroutines.b.e(), null, this), 3);
    }

    public final void Mg() {
        if (this.H) {
            ((SafetyCenterContactsMvpView) Dg()).setMode(SafetyCenterContactsMvpView.UiMode.EDIT);
            return;
        }
        j jVar = this.z;
        if (jVar.f().isEmpty()) {
            ((SafetyCenterContactsMvpView) Dg()).setMode(SafetyCenterContactsMvpView.UiMode.EMPTY);
            return;
        }
        int size = jVar.f().size();
        SafetyCenterConfig d = jVar.d();
        if (size < ((jVar.s != null || d == null) ? jVar.r : ((TrustedContacts) d.d.getValue()).b)) {
            ((SafetyCenterContactsMvpView) Dg()).setMode(SafetyCenterContactsMvpView.UiMode.NOT_FILLED);
        } else {
            ((SafetyCenterContactsMvpView) Dg()).setMode(SafetyCenterContactsMvpView.UiMode.FILLED);
        }
    }

    @Override // defpackage.p95
    public final void onBackPressed() {
        ((crl0) this.D.b).r(new qu(9));
    }
}
