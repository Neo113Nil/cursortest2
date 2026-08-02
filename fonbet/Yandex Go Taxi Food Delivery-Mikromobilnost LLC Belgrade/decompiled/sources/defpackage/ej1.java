package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.go.chargers.multiorder.select_to_return.ChargersMultiOrderSelectToReturnModalView;
import com.yandex.go.due_timetable.presentation.DueTimetableModalView;
import com.yandex.go.due_timetable.presentation.g;
import com.yandex.go.image_viewer.GalleryViewerModalView;
import com.yandex.go.intercity.flex.dashboard.router.error.IntercityDashboardFlexPartialUpdateErrorView;
import com.yandex.go.navigator.complete_route.CancelMode;
import com.yandex.go.navigator.complete_route.CompleteRouteModalView;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.route_stops.RouteStopsModalView;
import com.yandex.go.payments.sbp.ui.binding_progress.SbpTokenBindingProgressModalView;
import com.yandex.go.payments.sbp.ui.opening_bank_dialog.OpeningBankDialogModalView;
import com.yandex.go.search.model.DecideLaterConfig;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.popup.IntercityDashboardPopupView;
import com.yandex.go.taxi.order.cancel.popup.model.a;
import com.yandex.go.taxi.order.cancel.popup.mvp.DetailedCancelPopupModalView;
import com.yandex.go.taxi.order.custom_tips_input.mvp.CustomTipsInputModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.cancel.DetailedCancelNotification;
import com.yandex.go.taxi.order.tipssuggest.experiment.TipsSuggestModalExperiment;
import com.yandex.go.taxi.order.tipssuggest.mvp.TipsSuggestModalView;
import com.yandex.go.taxi.tariffs.interactor.r;
import com.yandex.go.trusted_contacts.data.entities.network.EditContactNameConfigDto;
import com.yandex.go.trusted_contacts.share_settings.edit.EditContactNameModalView;
import com.yandex.go.trusted_contacts.ui.error.TrustedContactsErrorModalView;
import ru.yandex.taxi.address.entrances.ui.v1.PorchNumberInputModalView;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.favorites.rides.settings_modal.ui.SettingsModalView;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.location.no_permission.NoLocationPermissionModalView;
import ru.yandex.taxi.logistics.care.impl.router.FullScreenOverlayModalView;
import ru.yandex.taxi.logistics.photocomment.error_photos_dialog.ErrorPhotosDialogView;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class ej1 extends m230 {
    public final /* synthetic */ int E;
    public final Object F;
    public final boolean G;
    public final Object H;
    public Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej1(int i, Object obj, Object obj2, Object obj3) {
        super(null);
        this.E = i;
        this.F = obj;
        this.H = obj2;
        this.I = obj3;
        this.G = true;
    }

    @Override // defpackage.m230, defpackage.h55
    public void G(Object obj) {
        switch (this.E) {
            case 18:
                super.G((zy11) obj);
                ((MapNotificationsMuteRepository) this.H).a();
                break;
            default:
                super.G(obj);
                break;
        }
    }

    @Override // defpackage.m230, defpackage.h55
    public void H(Object obj) {
        switch (this.E) {
            case 18:
                super.H((zy11) obj);
                ((MapNotificationsMuteRepository) this.H).b();
                break;
            default:
                super.H(obj);
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.E) {
            case 0:
                this.I = null;
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 14:
                mbe0 mbe0Var = (mbe0) this.x;
                if (mbe0Var != null && mbe0Var.b) {
                    break;
                } else {
                    break;
                }
        }
        return (w030) obj;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        f51 a;
        int i = this.E;
        int i2 = 18;
        kzi kziVar = kzi.a;
        DecideLaterConfig decideLaterConfig = DecideLaterConfig.a;
        int i3 = 7;
        int i4 = 3;
        int i5 = 5;
        int i6 = 24;
        int i7 = 20;
        int i8 = 2;
        int i9 = 4;
        int i10 = 6;
        int i11 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                dj1 dj1Var = (dj1) obj;
                yyf yyfVar = (yyf) this.I;
                if (yyfVar == null) {
                    j4n j4nVar = (j4n) obj2;
                    TaxiOrder taxiOrder = dj1Var.a;
                    DetailedCancelNotification detailedCancelNotification = dj1Var.b;
                    j4nVar.getClass();
                    taxiOrder.getClass();
                    detailedCancelNotification.getClass();
                    yyf yyfVar2 = new yyf();
                    yyfVar2.a = n3w.a(detailedCancelNotification);
                    yyfVar2.b = n3w.a(new i2j(new apf(yyfVar2.a, n3w.a(taxiOrder), new bpf(new xyf(j4nVar, objArr2 == true ? 1 : 0), new xyf(j4nVar, i4), new xyf(j4nVar, 1), new xyf(j4nVar, i10), 19), new gmh(new lk(14, new xyf(j4nVar, i9)), 13), 17)));
                    yyfVar2.c = n3w.a(new f2j(new xjg(new xyf(j4nVar, 2), new xyf(j4nVar, i5), objArr == true ? 1 : 0, i2)));
                    this.I = yyfVar2;
                    yyfVar = yyfVar2;
                }
                i2j i2jVar = (i2j) yyfVar.b.a;
                g191 g191Var = new g191(this);
                apf apfVar = i2jVar.a;
                h2j h2jVar = new h2j((DetailedCancelNotification) ((n3w) apfVar.b).a, (TaxiOrder) ((n3w) apfVar.c).a, (a) ((bpf) apfVar.w).get(), g191Var, (a2j) ((gmh) apfVar.x).get());
                xjg xjgVar = ((f2j) yyfVar.c.a).a;
                return new DetailedCancelPopupModalView((Context) ((xyf) xjgVar.b).get(), h2jVar, (pav) ((xyf) xjgVar.c).get());
            case 1:
                z4a z4aVar = new z4a((d5a) ((t4) ((a5a) this.I).a.a).get(), new hh5(27, this));
                zz7 zz7Var = ((x4a) obj2).a;
                return new ChargersMultiOrderSelectToReturnModalView((Context) zz7Var.a.get(), (pav) zz7Var.b.get(), z4aVar);
            case 2:
                gyc gycVar = new gyc(this);
                p1b p1bVar = ((jzc) obj2).a;
                return new CompleteRouteModalView((Context) ((fzc) this.I).a.a.get(), new izc(gycVar, (CancelMode) obj, (t) ((xvf0) p1bVar.a).get(), (ya50) ((x0z) p1bVar.b).get()));
            case 3:
                vx0 vx0Var = ((hmf) this.I).a;
                return new CustomTipsInputModalView((Context) ((r6g) ((dmf) obj2).a.b).get(), new gmf((com.yandex.go.taxi.order.details.v2.domain.feedback.a) vx0Var.a.get(), (orq) vx0Var.b.get(), (xdf) vx0Var.c.get(), (fmf) obj));
            case 4:
                j8o j8oVar = (j8o) this.I;
                l8o l8oVar = new l8o(((m8o) obj).a);
                o7i o7iVar = new o7i(this, 0);
                o7i o7iVar2 = new o7i(this, 1);
                ((o8o) obj2).a.getClass();
                n8o n8oVar = new n8o(l8oVar, o7iVar, o7iVar2);
                u1n u1nVar = j8oVar.a;
                return new ErrorPhotosDialogView((Context) ((xvf0) u1nVar.b).get(), n8oVar, (dci) ((fyf) u1nVar.c).get());
            case 5:
                f0n f0nVar = (f0n) obj;
                m1n m1nVar = (m1n) this.I;
                gym gymVar = new gym(this);
                g1n g1nVar = f0nVar.a;
                hz91 hz91Var = f0nVar.b;
                izm izmVar = f0nVar.c;
                iw8 iw8Var = m1nVar.a;
                g gVar = new g((String) ((xvf0) iw8Var.a).get(), g1nVar, gymVar, hz91Var, izmVar, (tt2) ((xvf0) iw8Var.b).get(), (com.yandex.go.due_timetable.domain.interactor.a) ((xvf0) iw8Var.c).get(), (zym) ((xvf0) iw8Var.d).get(), (q0n) ((xvf0) iw8Var.e).get(), (r0n) ((xvf0) iw8Var.g).get(), (b) ((xvf0) iw8Var.f).get(), (pwy0) ((xvf0) iw8Var.h).get(), (l0n) ((xvf0) iw8Var.i).get(), (com.yandex.go.due_timetable.domain.interactor.b) ((xvf0) iw8Var.j).get(), (j0n) ((xvf0) iw8Var.k).get(), (dvm) ((xvf0) iw8Var.l).get(), (yym) ((xvf0) iw8Var.m).get(), (n1n) ((xvf0) iw8Var.n).get(), (uze0) ((xvf0) iw8Var.o).get(), (r) ((xvf0) iw8Var.p).get(), (com.yandex.go.due_timetable.domain.interactor.impl.a) ((xvf0) iw8Var.q).get());
                wjm wjmVar = ((c1n) obj2).a;
                return new DueTimetableModalView((Context) ((fzf) wjmVar.b).get(), (pav) ((fzf) wjmVar.c).get(), (k7x0) ((jzf) wjmVar.w).get(), gVar, (sym) ((pgi) wjmVar.x).get());
            case 6:
                eln elnVar = (eln) obj;
                gln glnVar = (gln) this.I;
                String str = elnVar.a;
                EditContactNameConfigDto editContactNameConfigDto = elnVar.b;
                jln jlnVar = new jln(objArr3 == true ? 1 : 0, this);
                glnVar.a.getClass();
                return new EditContactNameModalView((Context) ((bln) obj2).a.a.get(), new fln(str, editContactNameConfigDto, jlnVar));
            case 7:
                return new FullScreenOverlayModalView((Context) obj2, (ComposeView) this.I);
            case 8:
                mum mumVar = new mum(this);
                fss fssVar = (fss) this.I;
                mc mcVar = ((kss) obj2).a;
                return new GalleryViewerModalView((Context) mcVar.a.get(), (nss) obj, mumVar, fssVar, (pav) mcVar.b.get());
            case 9:
                zdw zdwVar = (zdw) this.I;
                i4u i4uVar = new i4u(this);
                zdwVar.a.getClass();
                return new IntercityDashboardFlexPartialUpdateErrorView((Context) ((d2g) ((eew) obj2).a.b).get(), new ydw(i4uVar));
            case 10:
                ygw ygwVar = (ygw) this.I;
                h2t h2tVar = new h2t(this);
                ygwVar.a.getClass();
                return new IntercityDashboardPopupView((Context) ((dhw) obj2).a.a.get(), new xgw(h2tVar));
            case 11:
                a8v0 a8v0Var = (a8v0) obj;
                m9w m9wVar = (m9w) this.I;
                wjw wjwVar = new wjw(this);
                wjw wjwVar2 = new wjw(this);
                wjw wjwVar3 = new wjw(this);
                z8w z8wVar = (z8w) obj2;
                o9w o9wVar = (o9w) m9wVar;
                dsd dsdVar = o9wVar.a;
                String str2 = a8v0Var.c;
                String str3 = a8v0Var.d;
                i6r i6rVar = o9wVar.b.a;
                ga0 ga0Var = new ga0(str2, str3, false);
                ujt0 ujt0Var = new ujt0(false);
                ddf ddfVar = new ddf(RoutePointType.POINT_A);
                SourcePicker sourcePicker = SourcePicker.NONE;
                r51 r51Var = new r51(sourcePicker, decideLaterConfig, null);
                m3o m3oVar = m3o.b;
                aye0 aye0Var = new aye0(20, z8wVar);
                i6rVar.getClass();
                m3oVar.getClass();
                n9g n9gVar = new n9g(ujt0Var, ddfVar, r51Var, m3oVar, aye0Var, i6rVar, ga0Var);
                String str4 = a8v0Var.a;
                String str5 = a8v0Var.e;
                String str6 = a8v0Var.f;
                lmw lmwVar = o9wVar.c;
                boolean z = !lmwVar.a.d(str4);
                apf a2 = uub1.a(new p1b(n9gVar, wub1.e(new r51(sourcePicker, decideLaterConfig, null), new ddf(RoutePointType.POINT_B), new h0j(kziVar, "pickup_location", true), m3oVar, lmwVar.d, z8wVar, new lvq0(str4, str5, str6, z, z))), dsdVar.a, z8wVar);
                CompositeAddressSearchView.Companion.getClass();
                fjd fjdVar = new fjd(a2);
                fjdVar.j = wch0.addresses_picker;
                fjdVar.k = true;
                fjdVar.p = a8v0Var.b;
                fjdVar.n = new n9w(wjwVar2, wjwVar3, wjwVar);
                CompositeAddressSearchModalView.Companion.getClass();
                CompositeAddressSearchModalView.a aVar = new CompositeAddressSearchModalView.a();
                ModalViewOrigin modalViewOrigin = ModalViewOrigin.HOME;
                return ru.yandex.taxi.search.address.view.b.b(fjdVar, aVar);
            case 12:
                lc60 lc60Var = (lc60) this.I;
                fl10 fl10Var = new fl10(this);
                kjz kjzVar = lc60Var.a;
                NoLocationPermissionModalView noLocationPermissionModalView = new NoLocationPermissionModalView((Context) ((xvf0) kjzVar.b).get(), fl10Var, (ic60) ((jc60) kjzVar.c).get());
                String str7 = ((nc60) obj).a;
                if (str7 != null) {
                    noLocationPermissionModalView.setDescriptionText(str7);
                }
                return noLocationPermissionModalView;
            case 13:
                gq4 gq4Var = ((pa70) obj).a;
                ra70 ra70Var = (ra70) this.I;
                ub60 ub60Var = new ub60(i10, this);
                dt20 dt20Var = ra70Var.a;
                return new OpeningBankDialogModalView((Context) obj2, new qa70(ub60Var, gq4Var, (c) ((e7g) dt20Var.b).get(), (dt41) ((e7g) dt20Var.c).get(), (ja70) ((e7g) dt20Var.w).get(), (dfm0) ((e7g) dt20Var.x).get()));
            case 14:
                mbe0 mbe0Var = (mbe0) obj;
                zrm zrmVar = (zrm) obj2;
                zrmVar.getClass();
                Context context = (Context) zrmVar.b;
                q5z.h(context);
                cu1 cu1Var = (cu1) zrmVar.c;
                q5z.h(cu1Var);
                PorchNumberInputModalView porchNumberInputModalView = new PorchNumberInputModalView(context, new nbe0(cu1Var));
                sls slsVar = mbe0Var.c;
                porchNumberInputModalView.setInitialPorchNumber(mbe0Var.a);
                porchNumberInputModalView.setPorchNumberInputListener(new y4a0(slsVar, this, objArr4 == true ? 1 : 0, i2));
                return porchNumberInputModalView;
            case 15:
                oal0 oal0Var = (oal0) obj;
                PointType pointType = oal0Var.b;
                SourcePicker sourcePicker2 = oal0Var.a;
                PointType pointType2 = PointType.SOURCE;
                s6k0 s6k0Var = (s6k0) obj2;
                if (pointType == pointType2) {
                    s6k0Var.getClass();
                    a = fh4.c(new r51(sourcePicker2), new ddf(RoutePointType.POINT_A, true), m3o.b, ((tjt0) s6k0Var.b).a, new aye0(i7, (y9y0) s6k0Var.a), new ujt0(false));
                } else {
                    s6k0Var.getClass();
                    a = ((g0j) s6k0Var.c).a(new h0j(kziVar, "dest_location", true), new ddf(RoutePointType.POINT_B, true), new r51(sourcePicker2), m3o.b, (y9y0) s6k0Var.a);
                }
                ((y4k0) this.I).getClass();
                AddressSearchView.Companion.getClass();
                b61 b61Var = new b61(a);
                b61Var.p = oal0Var.b == pointType2;
                AddressSearchModalView.Companion.getClass();
                AddressSearchModalView a3 = p51.a(b61Var);
                a3.setOnAddressPickedListener(new fai(1, this));
                a3.setOnPickupFromPhotoTapListener(new vfc0(i7, this));
                return a3;
            case 16:
                jdl0 jdl0Var = new jdl0(new ndl0(objArr5 == true ? 1 : 0, this), (re50) ((kdl0) this.I).a.a.get());
                a2g a2gVar = ((zcl0) obj2).a;
                return new RouteStopsModalView((Context) a2gVar.a.get(), jdl0Var, (scl0) a2gVar.b.a);
            case 17:
                return new SbpTokenBindingProgressModalView((Context) obj2, (zim0) this.I);
            case 18:
                cjm0 cjm0Var = (cjm0) this.I;
                ehn0 ehn0Var = new ehn0(25, this);
                uyo0 uyo0Var = new uyo0(i11, this);
                cjm0Var.getClass();
                p51 p51Var = AddressSearchModalView.Companion;
                c61 c61Var = AddressSearchView.Companion;
                cjm0 cjm0Var2 = (cjm0) cjm0Var.c;
                qvq0 qvq0Var = (qvq0) cjm0Var2.b;
                lvq0 lvq0Var = new lvq0("scooters", false, false);
                ddf ddfVar2 = new ddf(RoutePointType.POINT_B);
                ujt0 ujt0Var2 = new ujt0(false);
                r51 r51Var2 = new r51(SourcePicker.NONE, decideLaterConfig, new e0p0((qxm0) cjm0Var2.c));
                m3o m3oVar2 = m3o.b;
                i6r i6rVar2 = qvq0Var.a;
                m3oVar2.getClass();
                m9g m9gVar = new m9g(ddfVar2, ujt0Var2, r51Var2, m3oVar2, i6rVar2, lvq0Var);
                c61Var.getClass();
                b61 b61Var2 = new b61(m9gVar);
                b61Var2.j = wch0.addresses_picker;
                b61Var2.p = false;
                b61Var2.q = new ykn0(i9, ehn0Var);
                b61Var2.l.mh();
                b61Var2.n = ((avj0) ((zuj0) cjm0Var.b)).h(kyh0.scooters_where_we_go);
                b61Var2.s = true;
                p51Var.getClass();
                AddressSearchModalView a4 = p51.a(b61Var2);
                a4.setOnAddressPickedListener(new fai(2, uyo0Var));
                a4.setOnKeyboardListener(new o51(a4, 7));
                return a4;
            case 19:
                dar0 dar0Var = new dar0(this);
                w040 w040Var = (w040) obj2;
                w040Var.getClass();
                p9g p9gVar = new p9g(w040Var, i11);
                n3w a5 = n3w.a(new zar0(new cjm0(i6, p9gVar, new p9g(w040Var, i10))));
                n3w a6 = n3w.a(dar0Var);
                p9g p9gVar2 = new p9g(w040Var, i5);
                p9g p9gVar3 = new p9g(w040Var, i4);
                p9g p9gVar4 = new p9g(w040Var, i9);
                p9g p9gVar5 = new p9g(w040Var, objArr6 == true ? 1 : 0);
                hwo0 hwo0Var = ((bar0) n3w.a(new bar0(new hwo0(new elo0(a6, new u6o0(p9gVar, p9gVar2, u9r0.a, p9gVar3, p9gVar4, p9gVar5), 21), p9gVar5, new p9g(w040Var, i3), new p9p(new p9g(w040Var, i8), 12), 8))).a).a;
                aar0 aar0Var = new aar0((ru.yandex.taxi.favorites.rides.settings_modal.domain.a) ((elo0) hwo0Var.b).get(), (tt2) ((p9g) hwo0Var.c).get(), (pwy0) ((p9g) hwo0Var.w).get(), (aip) ((p9p) hwo0Var.x).get(), (car0) obj);
                cjm0 cjm0Var3 = ((zar0) a5.a).a;
                return new SettingsModalView((Context) ((p9g) cjm0Var3.b).get(), (bts0) ((p9g) cjm0Var3.c).get(), aar0Var);
            case 20:
                whz0 whz0Var = (whz0) this.I;
                n2v0 n2v0Var = new n2v0(i6, this);
                hlx0 hlx0Var = whz0Var.a;
                return new TipsSuggestModalView((Context) ((dbg) ((thz0) obj2).a.a).get(), new vhz0((TaxiOrder) ((n3w) hlx0Var.b).a, (TipsSuggestModalExperiment) ((n3w) hlx0Var.c).a, (uio0) ((z7y0) hlx0Var.w).get(), (jhu0) ((uzu0) hlx0Var.x).get(), (e) ((dbg) hlx0Var.y).get(), n2v0Var));
            default:
                return new TrustedContactsErrorModalView((Context) obj2, new wpy0(17, this), (wg11) this.I);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej1(Object obj, w030 w030Var, Object obj2, int i) {
        super(null);
        this.E = i;
        this.H = obj;
        this.F = w030Var;
        this.I = obj2;
        this.G = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej1(Object obj, Object obj2, w030 w030Var, int i) {
        super(null);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.F = w030Var;
        this.G = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej1(w030 w030Var, j4n j4nVar) {
        super(null);
        this.E = 0;
        this.F = w030Var;
        this.H = j4nVar;
        this.G = true;
    }
}
