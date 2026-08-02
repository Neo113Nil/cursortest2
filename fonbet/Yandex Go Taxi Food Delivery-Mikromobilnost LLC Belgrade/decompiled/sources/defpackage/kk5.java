package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.beginners.auth_postload.BeginnersFinalLoadingModalView;
import com.yandex.go.beginners.experiments.BeginnersAuthPostloadExperiment;
import com.yandex.go.navigator.driving.speaker.d;
import com.yandex.go.navigator.permission.NavigatorPermissionRequestModalView;
import com.yandex.go.navigator.settings.language_settings.LanguageSettingsModalView;
import com.yandex.go.navigator.settings.language_settings.a;
import com.yandex.go.permission.location_with_agreement.ui.LocationPermissionWithAgreementModalView;
import com.yandex.go.permission.location_with_agreement.ui.c;
import com.yandex.go.places.impl.ui.web_custom_tabs.WebCustomTabsModalView;
import com.yandex.go.safety.center.car.crash.share.SafetyCenterCarCrashShareView;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.safety.center.lost_item.modal.ui.LostItemModalView;
import com.yandex.go.trusted_contacts.ui.dialog.DialogContentModalView;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.HashMap;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.due_selector.impl.presentation.ui.DueSelectorModalView;
import ru.yandex.taxi.due_selector.impl.presentation.ui.DueSelectorView;
import ru.yandex.taxi.preorder.source.domain.h;

/* loaded from: classes12.dex */
public final class kk5 extends m230 {
    public final /* synthetic */ int E;
    public final Object F;
    public final boolean G;
    public final Object H;
    public final Object I;
    public final Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk5(w030 w030Var, Activity activity, lk5 lk5Var) {
        super(null);
        this.E = 0;
        this.F = w030Var;
        this.H = activity;
        this.I = lk5Var;
        this.J = new qc(6, this);
        this.G = true;
    }

    @Override // defpackage.m230, defpackage.h55
    public void G(Object obj) {
        switch (this.E) {
            case 6:
                zy11 zy11Var = (zy11) obj;
                if (!((k0b0) this.H).b()) {
                    super.G(zy11Var);
                    break;
                } else {
                    r(new ej40(13));
                    break;
                }
            default:
                super.G(obj);
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        int i = this.E;
        Object obj2 = this.J;
        switch (i) {
            case 0:
                ((qc) obj2).g();
                break;
            case 3:
                i650 i650Var = ((r6r0) obj2).a;
                i650Var.a.a("navigation.settings.close", n.u(i650Var), 1, new HashMap());
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.E) {
            case 0:
                tje.a0((Activity) this.H, (qc) this.J);
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return (w030) this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return this.G;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        int i = this.E;
        Object obj2 = this.J;
        Object obj3 = this.H;
        Object obj4 = this.I;
        switch (i) {
            case 0:
                BeginnersAuthPostloadExperiment beginnersAuthPostloadExperiment = ((jk5) obj).a;
                mc mcVar = ((lk5) obj4).a;
                return new BeginnersFinalLoadingModalView((Context) mcVar.a.get(), beginnersAuthPostloadExperiment, (ip11) mcVar.b.get());
            case 1:
                yzh yzhVar = new yzh(this);
                ((ldj) obj2).a.getClass();
                return new DialogContentModalView((Context) obj3, (gdj) obj4, new kdj(yzhVar));
            case 2:
                hym hymVar = (hym) this.F;
                mum mumVar = new mum(this);
                xjg xjgVar = ((sxm) obj3).a;
                zrm zrmVar = hymVar.a;
                return new DueSelectorModalView(new DueSelectorView((Context) ((fzf) zrmVar.b).get(), new rxm(mumVar, (v920) ((ncb) xjgVar.b).get(), (dvm) ((xvf0) xjgVar.c).get()), (bym) obj2, (kxm) ((oti) zrmVar.c).get()));
            case 3:
                yrx yrxVar = new yrx(this);
                v31 v31Var = ((xrx) obj4).a;
                a aVar = new a((bf50) v31Var.a.get(), (zuj0) v31Var.b.get(), (qc50) v31Var.c.get(), (d) v31Var.d.get(), yrxVar, (r6r0) v31Var.e.get(), (bsx) v31Var.f.get(), (pwy0) v31Var.g.get(), (b) v31Var.h.get());
                zz7 zz7Var = ((urx) obj3).a;
                return new LanguageSettingsModalView((Context) zz7Var.a.get(), aVar, (ip11) zz7Var.b.get());
            case 4:
                aaz aazVar = (aaz) obj;
                bd bdVar = aazVar.a;
                naz nazVar = new naz(this);
                m mVar = ((jdz) obj4).a;
                c cVar = new c(nazVar, bdVar, (bk1) ((r2g) mVar.a).get(), (kdz) ((prq) mVar.b).get(), (ru.yandex.taxi.systemrequeirements.location.c) ((r2g) mVar.c).get(), (ed) ((r2g) mVar.d).get(), (lbz) ((r2g) mVar.e).get(), (jbz) ((r2g) mVar.f).get(), (zzv0) ((r2g) mVar.g).get(), (h) ((r2g) mVar.h).get(), (com.yandex.go.permission.location_with_agreement.analytics.a) ((xvf0) mVar.i).get(), (rqo) ((r2g) mVar.j).get());
                hbz hbzVar = new hbz(aazVar.b);
                r1s r1sVar = ((kbz) obj2).a;
                return new LocationPermissionWithAgreementModalView(cVar, hbzVar, (pav) ((xvf0) r1sVar.b).get(), (Context) ((r2g) r1sVar.c).get(), (ic6) ((n3w) r1sVar.w).a);
            case 5:
                com.yandex.go.safety.center.lost_item.modal.navigation.a aVar2 = new com.yandex.go.safety.center.lost_item.modal.navigation.a(this);
                kjz kjzVar = ((zqz) obj3).a;
                yqz yqzVar = new yqz((com.yandex.go.safety.center.lost_item.modal.interactor.c) ((l20) kjzVar.b).get(), (ppl0) ((xvf0) kjzVar.c).get(), (dqk0) obj, aVar2);
                mc mcVar2 = ((drz) obj2).a;
                return new LostItemModalView((Context) mcVar2.a.get(), (ip11) mcVar2.b.get(), yqzVar);
            case 6:
                uk10 uk10Var = new uk10(this);
                e100 e100Var = ((be50) obj4).a;
                ae50 ae50Var = new ae50(uk10Var, (y50) ((h4g) e100Var.b).get(), (v7j0) ((l4g) e100Var.c).get(), (ney) ((xvf0) e100Var.w).get());
                zz7 zz7Var2 = ((yd50) obj2).a;
                return new NavigatorPermissionRequestModalView((Context) zz7Var2.a.get(), (ip11) zz7Var2.b.get(), ae50Var);
            case 7:
                pgk0 pgk0Var = new pgk0(5, this);
                w040 w040Var = ((bql0) obj4).a;
                com.yandex.go.safety.center.car.crash.share.a aVar3 = new com.yandex.go.safety.center.car.crash.share.a((hrl0) obj3, pgk0Var, (j) ((xvf0) w040Var.a).get(), (po21) ((xvf0) w040Var.b).get(), (com.yandex.go.safety.center.analytics.a) ((xvf0) w040Var.c).get(), (fkr0) ((gaq0) w040Var.g).get(), (k7x0) ((xvf0) w040Var.d).get(), (SafetyCenterExperiment) ((xvf0) w040Var.e).get(), (pwy0) ((xvf0) w040Var.f).get(), (q3u0) ((xvf0) w040Var.h).get());
                vx0 vx0Var = ((xpl0) obj2).a;
                return new SafetyCenterCarCrashShareView((Context) vx0Var.a.get(), aVar3, (yiz0) vx0Var.b.get(), (pav) vx0Var.c.get());
            case 8:
                eao eaoVar = ((uim0) obj).a;
                int i2 = 9;
                return new ymu(i2, (Context) obj3, (ru.yandex.taxi.utils.d) obj4).m(new hr1(null, null, null, eaoVar.b, eaoVar.c, null, new q1c(eaoVar.d.a, new d82(1)), new g8m0(16, this), new j6m0(i2, this), 39));
            default:
                rg41 rg41Var = new rg41(this);
                a811 a811Var = ((ug41) obj4).a;
                com.yandex.go.places.impl.ui.web_custom_tabs.b bVar = new com.yandex.go.places.impl.ui.web_custom_tabs.b(rg41Var, (tg41) obj, (tt2) a811Var.a.get(), (o) a811Var.b.get());
                a811 a811Var2 = ((qg41) obj3).a;
                return new WebCustomTabsModalView((Context) a811Var2.a.get(), (c2x0) a811Var2.b.get(), bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk5(Object obj, Object obj2, Object obj3, w030 w030Var, int i) {
        super(null);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.F = w030Var;
        this.G = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(null);
        this.E = i;
        this.F = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.G = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk5(Object obj, Object obj2, w030 w030Var, Object obj3, int i) {
        super(null);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.F = w030Var;
        this.J = obj3;
        this.G = true;
    }
}
