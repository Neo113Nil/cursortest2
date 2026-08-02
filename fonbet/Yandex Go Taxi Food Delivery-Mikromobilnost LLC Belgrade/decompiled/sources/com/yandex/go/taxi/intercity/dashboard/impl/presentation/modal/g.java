package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.h;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.j;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.k;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.l;
import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import defpackage.a60;
import defpackage.aaw;
import defpackage.ad5;
import defpackage.baw;
import defpackage.bfw;
import defpackage.caw;
import defpackage.daw;
import defpackage.eai;
import defpackage.eaw;
import defpackage.ekw;
import defpackage.faw;
import defpackage.fif;
import defpackage.fkw;
import defpackage.g18;
import defpackage.gkw;
import defpackage.gtq0;
import defpackage.ifw;
import defpackage.jl40;
import defpackage.klw;
import defpackage.law;
import defpackage.lg21;
import defpackage.maw;
import defpackage.mg21;
import defpackage.mgu;
import defpackage.miw;
import defpackage.naw;
import defpackage.nfw;
import defpackage.ny61;
import defpackage.oaw;
import defpackage.oow;
import defpackage.paq0;
import defpackage.paw;
import defpackage.pj;
import defpackage.pkw;
import defpackage.pzt0;
import defpackage.qaw;
import defpackage.qow;
import defpackage.raw;
import defpackage.rgw;
import defpackage.saw;
import defpackage.taw;
import defpackage.tgw;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.ugw;
import defpackage.ujw;
import defpackage.uyj;
import defpackage.v770;
import defpackage.v9w;
import defpackage.w511;
import defpackage.w9w;
import defpackage.y50;
import defpackage.ybw;
import defpackage.z9w;
import defpackage.zzs;
import java.util.HashMap;
import java.util.LinkedHashMap;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class g extends ad5 {
    public final klw A;
    public final v9w B;
    public final ifw C;
    public final fif D;
    public final miw E;
    public final j F;
    public final l G;
    public final h H;
    public final com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.a I;
    public final com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.a J;
    public final ekw K;
    public final oow L;
    public final ybw M;
    public final paq0 N;
    public final fkw O;
    public final k P;
    public final w9w Q;
    public g18 R;
    public final kotlinx.coroutines.sync.a S;
    public pzt0 T;
    public int U;
    public final nfw x;
    public final tt2 y;
    public final com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f z;

    public g(nfw nfwVar, tt2 tt2Var, com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f fVar, klw klwVar, v9w v9wVar, ifw ifwVar, fif fifVar, miw miwVar, j jVar, l lVar, h hVar, com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.a aVar, com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.a aVar2, ekw ekwVar, oow oowVar, ybw ybwVar, paq0 paq0Var, fkw fkwVar, k kVar, w9w w9wVar) {
        super(bfw.class);
        this.x = nfwVar;
        this.y = tt2Var;
        this.z = fVar;
        this.A = klwVar;
        this.B = v9wVar;
        this.C = ifwVar;
        this.D = fifVar;
        this.E = miwVar;
        this.F = jVar;
        this.G = lVar;
        this.H = hVar;
        this.I = aVar;
        this.J = aVar2;
        this.K = ekwVar;
        this.L = oowVar;
        this.M = ybwVar;
        this.N = paq0Var;
        this.O = fkwVar;
        this.P = kVar;
        this.Q = w9wVar;
        this.R = g18.u1;
        this.S = gtq0.a();
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((qow) this.L).b("IntercityMain");
        this.R.cancel();
    }

    public final void Kg() {
        tse Jg = Jg();
        this.y.getClass();
        tje.N(Jg, uyj.a, null, new IntercityDashboardPresenter$decrementSeats$1(this, null), 2);
    }

    public final void Lg() {
        tse Jg = Jg();
        this.y.getClass();
        tje.N(Jg, uyj.a, null, new IntercityDashboardPresenter$incrementSeats$1(this, null), 2);
    }

    public final void Mg(faw fawVar, String str) {
        zzs zzsVar;
        boolean z = fawVar instanceof z9w;
        nfw nfwVar = this.x;
        if (z) {
            ((a60) ((y50) nfwVar.a.V.get())).c(((z9w) fawVar).a, v770.c);
        } else if (fawVar instanceof aaw) {
            aaw aawVar = (aaw) fawVar;
            ugw ugwVar = this.z.a.a().d;
            if (ugwVar == null) {
                ny61.g("Required value was null.");
                return;
            }
            tgw tgwVar = ugwVar.a;
            if (tgwVar instanceof rgw) {
                rgw rgwVar = (rgw) tgwVar;
                zzsVar = new zzs(rgwVar.a, rgwVar.b, 0, null, null, 28);
            } else {
                zzsVar = null;
            }
            nfwVar.a.r(new mgu(12, aawVar, zzsVar));
        } else if (fawVar instanceof baw) {
            tje.N(Jg(), null, null, new IntercityDashboardPresenter$onHappyHoursClicked$1(this, (baw) fawVar, null), 3);
        } else if (fawVar instanceof daw) {
            BulletsOrderPopup bulletsOrderPopup = ((daw) fawVar).a;
            if (bulletsOrderPopup != null) {
                nfwVar.a(bulletsOrderPopup, true);
            }
        } else if (fawVar instanceof eaw) {
            ((mg21) ((lg21) nfwVar.a.W.get())).c(((eaw) fawVar).a);
        } else if (!jl40.l(fawVar, caw.a)) {
            w511.b();
            return;
        }
        pj pjVar = this.B.a;
        LinkedHashMap a = str != null ? v9w.a(str) : null;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        if (a != null) {
            hashMap.put("info", a);
        }
        pjVar.a.a("IntercityMain.Banner.Tapped", hashMap, 1, new HashMap());
    }

    public final void Ng(String str) {
        pj pjVar = this.B.a;
        LinkedHashMap a = str != null ? v9w.a(str) : null;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        if (a != null) {
            hashMap.put("info", a);
        }
        pjVar.a.a("IntercityMain.Banner.Shown", hashMap, 1, new HashMap());
    }

    public final void Og(taw tawVar) {
        boolean z = tawVar instanceof qaw;
        v9w v9wVar = this.B;
        nfw nfwVar = this.x;
        if (z) {
            pj pjVar = v9wVar.a;
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(IssuingDistributionPointExtension.POINT, "a");
            pjVar.a.a("IntercityMain.AddressSelector.Tapped", hashMap, 1, new HashMap());
            com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e.U(nfwVar.a, PointType.SOURCE);
            return;
        }
        if (tawVar instanceof oaw) {
            pj pjVar2 = v9wVar.a;
            pjVar2.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(IssuingDistributionPointExtension.POINT, "b");
            pjVar2.a.a("IntercityMain.AddressSelector.Tapped", hashMap2, 1, new HashMap());
            com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e.U(nfwVar.a, PointType.DESTINATION);
            return;
        }
        if (tawVar instanceof paw) {
            Qg();
            return;
        }
        if (tawVar instanceof law) {
            Pg();
            return;
        }
        if (tawVar instanceof raw) {
            Pg();
            return;
        }
        if (tawVar instanceof maw) {
            String str = ((maw) tawVar).a;
            ((gkw) this.O).a();
            tje.N(Jg(), null, null, new IntercityDashboardPresenter$onOpenIntercityDashboardFlexModalScreenClick$1(this, str, null), 3);
        } else if (!(tawVar instanceof naw)) {
            if (tawVar instanceof saw) {
                return;
            }
            w511.b();
        } else {
            String str2 = ((naw) tawVar).a;
            ((a60) ((y50) nfwVar.a.V.get())).c(str2, v770.c);
        }
    }

    public final void Pg() {
        ((gkw) this.O).a();
        ujw i = this.z.i();
        if (i == null) {
            return;
        }
        tje.N(Jg(), null, null, new IntercityDashboardPresenter$onOpenSummaryClick$1(this, i, null), 3);
    }

    public final void Qg() {
        pj pjVar = this.B.a;
        pjVar.getClass();
        pjVar.a.a("IntercityMain.DueSelector.Tapped", new HashMap(), 1, new HashMap());
        tje.N(Jg(), null, null, new IntercityDashboardPresenter$onSelectTimeClick$1(this, null), 3);
    }

    public final void Rg(ugw ugwVar) {
        String b = this.C.b();
        this.R.cancel();
        this.R = this.D.c(new eai(b, 0));
        tse Jg = Jg();
        this.y.getClass();
        com.yandex.go.coroutines.b.g(Jg, uyj.a, null, new IntercityDashboardPresenter$onSuggestClosed$1(this, ugwVar, null), 2);
    }

    public final void Sg(pkw pkwVar) {
        tse Jg = Jg();
        this.y.getClass();
        tje.N(Jg, uyj.a, null, new IntercityDashboardPresenter$onTariffClicked$1(this, pkwVar, null), 2);
    }

    public final void Tg() {
        tse Jg = Jg();
        this.y.getClass();
        com.yandex.go.coroutines.b.g(Jg, uyj.a, null, new IntercityDashboardPresenter$reloadDashboardContentWithCurrentRoute$1(this, null), 2);
    }
}
