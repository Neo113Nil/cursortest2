package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.ViewGroup;
import androidx.compose.ui.semantics.f;
import com.yandex.go.address.models.Address;
import com.yandex.go.agreement.trackable.analitycs.EULAAnalytics$AcceptanceTapAction;
import com.yandex.go.beginners.safety.name.domain.model.SafetyNameInputScreenState$Type;
import com.yandex.go.beginners.safety.photo.main.c;
import com.yandex.go.safety.center.main.SafetyCenterMainView;
import com.yandex.go.shortcuts.impl.view.adapter.p;
import com.yandex.go.taxi.order.details.v2.analytics.perf.a;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardStatusProgressItemView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.navigation.RideCardModalExitType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.mapkit.geometry.BoundingBox;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingState;
import com.ybsdk.feature.savings.api.SavingsActionStatus;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositFragment;
import com.ybsdk.feature.savings.internal.screens.goal.SavingsAccountGoalFragment;
import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameFragment;
import com.ybsdk.widgets.common.g;
import defpackage.a0m0;
import defpackage.agd;
import defpackage.axl0;
import defpackage.aye0;
import defpackage.b0m0;
import defpackage.bgd;
import defpackage.bts;
import defpackage.bxl0;
import defpackage.c0m0;
import defpackage.cqk0;
import defpackage.d0m0;
import defpackage.d50;
import defpackage.did;
import defpackage.e0m0;
import defpackage.exl0;
import defpackage.fid;
import defpackage.hjb0;
import defpackage.jl40;
import defpackage.kuk0;
import defpackage.pgk0;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.qxl0;
import defpackage.rxl0;
import defpackage.rzl0;
import defpackage.s6k0;
import defpackage.sxl0;
import defpackage.tje;
import defpackage.twa1;
import defpackage.txl0;
import defpackage.uxl0;
import defpackage.vxl0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwl0;
import defpackage.wxl0;
import defpackage.xfd;
import defpackage.xwl0;
import defpackage.xxl0;
import defpackage.ydl0;
import defpackage.yfd;
import defpackage.ywl0;
import defpackage.yzl0;
import defpackage.z0l0;
import defpackage.zlb0;
import defpackage.zpn;
import defpackage.zwl0;
import defpackage.zy11;
import defpackage.zzl0;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$SaveRideModalButtonName;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$SaveRideModalCloseReason;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderAnalyticsReporter$CompleteButtonActionName;
import ru.yandex.taxi.panorama.ridecard.d;
import ru.yandex.taxi.preorder.tollroad.compose.navigation.b;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

/* loaded from: classes14.dex */
public final /* synthetic */ class ohk0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ohk0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r16v0, types: [h5a0] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        tb90 panoramaData;
        ahq0 renderSourceSelection$lambda$16;
        r0 r0Var;
        Object value;
        Object value2;
        zy11 insetsType$lambda$02;
        zy11 lambda$0$0;
        zy11 showBottomSheet$lambda$15$lambda$14;
        zy11 viewBinding$lambda$3$lambda$0;
        g render$lambda$3;
        int i = this.a;
        int i2 = 2;
        int i3 = 10;
        boolean z = false;
        ?? r9 = 0;
        ?? r10 = 1;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                f.l((mnq0) obj, ((egk0) obj2).a);
                return zy11.a;
            case 1:
                RideCardDriverSectionView rideCardDriverSectionView = new RideCardDriverSectionView(((ViewGroup) obj).getContext(), (whk0) obj2);
                rideCardDriverSectionView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rideCardDriverSectionView.setFocusable(false);
                return rideCardDriverSectionView;
            case 2:
                insetsType$lambda$0 = RideCardModalView.insetsType$lambda$0((RideCardModalView) obj2, (t1w) obj);
                return insetsType$lambda$0;
            case 3:
                xkk0 xkk0Var = (xkk0) obj2;
                hfk0 hfk0Var = (hfk0) obj;
                int i4 = wkk0.a[(xkk0Var.G.a.c() == DriveState.COMPLETE ? RideCardModalExitType.CLOSE_ORDER_WITH_COMPLETE_EFFECT : RideCardModalExitType.GO_BACK_IN_STACK_VIEW).ordinal()];
                if (i4 == 1) {
                    ifk0 ifk0Var = hfk0Var.a;
                    ifk0Var.c0 = null;
                    if (ifk0Var.u()) {
                        ifk0Var.r(new qu(9));
                    } else {
                        ifk0Var.i();
                    }
                    ifk0Var.a0.onBack();
                } else {
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                    mkk0 mkk0Var = (mkk0) xkk0Var.H.get();
                    mkk0Var.b.a();
                    qzc qzcVar = mkk0Var.c;
                    o2y0 o2y0Var = mkk0Var.a;
                    qzcVar.a(o2y0Var, OrderAnalyticsReporter$CompleteButtonActionName.CLOSE);
                    TaxiOrder b = o2y0Var.b();
                    synchronized (b) {
                        b.l = b.l.E();
                    }
                    hfk0Var.a();
                }
                return zy11.a;
            case 4:
                ((a) ((zsa) obj2).G).h();
                ((sy60) obj).a();
                return zy11.a;
            case 5:
                RideCardStatusProgressItemView rideCardStatusProgressItemView = new RideCardStatusProgressItemView(((ViewGroup) obj).getContext(), null, 0, 0, (p9y0) obj2, 14, null);
                rideCardStatusProgressItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return rideCardStatusProgressItemView;
            case 6:
                d dVar = (d) obj2;
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                dVar.d.getClass();
                Address u = taxiOrder.u();
                if (u == null) {
                    panoramaData = null;
                } else {
                    panoramaData = u.getPanoramaData();
                    if (panoramaData == null) {
                        panoramaData = (tb90) dVar.k.a.c(vyx0.a(u, taxiOrder.a));
                    }
                }
                i8y0 i8y0Var = dVar.d;
                Objects.toString(panoramaData);
                i8y0Var.getClass();
                i8y0 i8y0Var2 = dVar.d;
                Address l = taxiOrder.l();
                Objects.toString(l != null ? l.getPanoramaData() : null);
                i8y0Var2.getClass();
                DriveState driveState = taxiOrder.h.b;
                Address l2 = taxiOrder.l();
                return driveState + " " + panoramaData + " " + (l2 != null ? l2.getPanoramaData() : null);
            case 7:
                final b bVar = (b) obj2;
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).f = new ne4(new auk0(bVar, r10 == true ? 1 : 0));
                agd agdVar = (agd) yfdVar;
                agdVar.c = bVar.I.d;
                agdVar.e = new tls() { // from class: ru.yandex.taxi.preorder.tollroad.compose.navigation.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        b bVar2 = b.this;
                        tje.N(bVar2.o(), null, null, new RoadsPaneRouter$content$1$2$1(bVar2, (kuk0) obj3, null), 3);
                        return zy11.a;
                    }
                };
                abd.a.getClass();
                agdVar.g = abd.b;
                return zy11.a;
            case 8:
                ((p) obj2).f0.setText((CharSequence) obj);
                return zy11.a;
            case 9:
                renderSourceSelection$lambda$16 = RoundingFragment.renderSourceSelection$lambda$16((ahq0) obj2, (ahq0) obj);
                return renderSourceSelection$lambda$16;
            case 10:
                tyk0 tyk0Var = (tyk0) obj2;
                n70 n70Var = (n70) obj;
                Context context = n70Var.P;
                n70Var.W(new vqy(n70Var, (Object) context.getString(dzh0.ybsdk_common_accessibility_selected), (Object) context.getString(dzh0.ybsdk_common_accessibility_unselected), (cms) tyk0Var, 26));
                return zy11.a;
            case 11:
                com.ybsdk.feature.autotopup.internal.presentation.saver.b bVar2 = (com.ybsdk.feature.autotopup.internal.presentation.saver.b) obj2;
                String str = (String) obj;
                ezk0 ezk0Var = (ezk0) ((RoundingState) bVar2.X()).e.a();
                if (ezk0Var != null) {
                    Iterator it = ezk0Var.e.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (jl40.l(((h5a0) next).getId(), str)) {
                                r8 = next;
                            }
                        }
                    }
                    r8 = (h5a0) r8;
                }
                ?? r16 = r8;
                pz40 Y = bVar2.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, RoundingState.a((RoundingState) value, null, null, null, null, null, null, r16, 63)));
                bVar2.h0();
                return zy11.a;
            case 12:
                com.yandex.go.preorder.map.a aVar = (com.yandex.go.preorder.map.a) obj2;
                BoundingBox boundingBox = (BoundingBox) obj;
                r0 r0Var2 = aVar.l;
                do {
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, Integer.valueOf(((Number) value2).intValue() + 1)));
                ((gh00) aVar.b).A(boundingBox, new mx0(i3, aVar));
                return zy11.a;
            case 13:
                yfd yfdVar2 = (yfd) obj;
                g92 g92Var = new g92(i2, ((v2l0) ((agd) yfdVar2).a).a);
                agd agdVar2 = (agd) yfdVar2;
                agdVar2.c = g92Var;
                agdVar2.e = new j01(r9 == true ? 1 : 0);
                agdVar2.g = new androidx.compose.runtime.internal.a(518071173, new alb0(21, (t) obj2), true);
                return zy11.a;
            case 14:
                mnq0 mnq0Var = (mnq0) obj;
                String str2 = ((txq) obj2).e;
                if (str2 == null) {
                    str2 = "";
                }
                f.l(mnq0Var, str2);
                return zy11.a;
            case 15:
                insetsType$lambda$02 = RouteSelectorModalView.insetsType$lambda$0((RouteSelectorModalView) obj2, (t1w) obj);
                return insetsType$lambda$02;
            case 16:
                ru.yandex.taxi.routeselector.a aVar2 = (ru.yandex.taxi.routeselector.a) obj2;
                aVar2.A((m950) aVar2.H.get(), new mbe0((String) obj, z), new h85(3, aVar2));
                return zy11.a;
            case 17:
                final com.yandex.go.routestops.v2.router.b bVar3 = (com.yandex.go.routestops.v2.router.b) obj2;
                yfd yfdVar3 = (yfd) obj;
                ((agd) yfdVar3).f = me4.a;
                agd agdVar3 = (agd) yfdVar3;
                agdVar3.c = bVar3.J.a();
                agdVar3.e = new tls() { // from class: com.yandex.go.routestops.v2.router.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        b bVar4 = b.this;
                        tje.N(bVar4.o(), null, null, new RouteStopsV2Router$content$1$1$1(bVar4, (ydl0) obj3, null), 3);
                        return zy11.a;
                    }
                };
                dbd.a.getClass();
                agdVar3.g = dbd.b;
                return zy11.a;
            case 18:
                lambda$0$0 = SafetyCenterMainView.lambda$0$0((IconCircleButton) obj2, (Drawable) obj);
                return lambda$0$0;
            case 19:
                oy7 oy7Var = (oy7) obj2;
                yfd yfdVar4 = (yfd) obj;
                aye0 aye0Var = new aye0(25, oy7Var);
                vvl0 vvl0Var = new vvl0();
                String str3 = ((com.yandex.go.beginners.safety.name.ui.a) oy7Var.J).a.a.a().a;
                if (str3 == null) {
                    str3 = "";
                }
                r0 r0Var3 = vvl0Var.a;
                uvl0 uvl0Var = new uvl0(SafetyNameInputScreenState$Type.INPUT_STATE, str3);
                r0Var3.getClass();
                r0Var3.m(null, uvl0Var);
                ((agd) yfdVar4).c = ((com.yandex.go.beginners.safety.name.ui.b) oy7Var.I).a(vvl0Var);
                agd agdVar4 = (agd) yfdVar4;
                agdVar4.e = new zdk0(i3, oy7Var, aye0Var, vvl0Var);
                fbd.a.getClass();
                agdVar4.g = fbd.b;
                return zy11.a;
            case 20:
                final c cVar = (c) obj2;
                yfd yfdVar5 = (yfd) obj;
                final pgk0 pgk0Var = new pgk0(r7, cVar);
                final cxl0 cxl0Var = new cxl0();
                ((agd) yfdVar5).e = new tls(cxl0Var, pgk0Var) { // from class: com.yandex.go.beginners.safety.photo.main.a
                    public final /* synthetic */ pgk0 a;

                    {
                        this.a = pgk0Var;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        c cVar2 = (c) this.a.b;
                        bxl0 bxl0Var = (bxl0) obj3;
                        if (jl40.l(bxl0Var, ywl0.a)) {
                            String str4 = cVar2.O;
                            if (str4 != null) {
                                ((com.yandex.go.agreement.photoupload.a) cVar2.L).c(str4);
                            }
                            com.yandex.go.navigation.activity.b bVar4 = cVar2.K.d;
                            zlb0.a aVar3 = new zlb0.a();
                            aVar3.a = d50.a;
                            bVar4.d(aVar3.a(), HProv.PP_CONTAINER_STATUS);
                        } else if (jl40.l(bxl0Var, axl0.a)) {
                            String str5 = cVar2.O;
                            if (str5 != null) {
                                ((com.yandex.go.agreement.photoupload.a) cVar2.L).c(str5);
                            }
                            tje.N(cVar2.o(), null, null, new SafetyPhotoMainRouter$InnerNavigator$onSelfieClicked$2(cVar2, null), 3);
                        } else if (jl40.l(bxl0Var, zwl0.a)) {
                            cVar2.r(new z0l0(24));
                        } else if (jl40.l(bxl0Var, wwl0.a)) {
                            cVar2.r(new qu(9));
                        } else {
                            if (!(bxl0Var instanceof xwl0)) {
                                w511.b();
                                return null;
                            }
                            String str6 = ((xwl0) bxl0Var).a;
                            String str7 = cVar2.O;
                            if (str7 != null) {
                                ((com.yandex.go.agreement.photoupload.a) cVar2.L).c.b(str7, EULAAnalytics$AcceptanceTapAction.Deeplink, str6);
                            }
                            ((hjb0) cVar2.M).a(str6);
                        }
                        return zy11.a;
                    }
                };
                ((agd) yfdVar5).g = new androidx.compose.runtime.internal.a(1644112459, new bms() { // from class: com.yandex.go.beginners.safety.photo.main.b
                    @Override // defpackage.bms
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i5;
                        xfd xfdVar = (xfd) obj3;
                        exl0 exl0Var = (exl0) obj4;
                        fid fidVar = (fid) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        if ((intValue & 6) == 0) {
                            i5 = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
                        } else {
                            i5 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i5 |= ((bts) fidVar).k(exl0Var) ? 32 : 16;
                        }
                        bts btsVar = (bts) fidVar;
                        if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
                            String str4 = exl0Var.h;
                            c cVar2 = c.this;
                            cVar2.O = str4;
                            boolean e = btsVar.e(cVar2) | ((i5 & 112) == 32);
                            Object Q = btsVar.Q();
                            if (e || Q == did.a) {
                                Q = new SafetyPhotoMainRouter$content$1$2$1$1(exl0Var, cVar2, null);
                                btsVar.o0(Q);
                            }
                            zpn.e(btsVar, (wls) Q, str4);
                            twa1.e(exl0Var, ((bgd) xfdVar).a, btsVar, (i5 >> 3) & 14);
                        } else {
                            btsVar.Y();
                        }
                        return zy11.a;
                    }
                }, true);
                return zy11.a;
            case 21:
                ((hxl0) obj).n1((ohb0) obj2);
                return zy11.a;
            case 22:
                final com.yandex.go.beginners.safety.photo.upload.b bVar4 = (com.yandex.go.beginners.safety.photo.upload.b) obj2;
                yfd yfdVar6 = (yfd) obj;
                ((agd) yfdVar6).c = bVar4.I.b(bVar4.L);
                agd agdVar5 = (agd) yfdVar6;
                agdVar5.e = new tls() { // from class: com.yandex.go.beginners.safety.photo.upload.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        wxl0 wxl0Var = (wxl0) obj3;
                        b bVar5 = b.this;
                        com.yandex.go.beginners.safety.photo.upload.ui.a aVar3 = bVar5.J;
                        aye0 aye0Var2 = bVar5.M;
                        rxl0 rxl0Var = bVar5.L;
                        aVar3.getClass();
                        if (jl40.l(wxl0Var, vxl0.a)) {
                            ((b) aye0Var2.b).r(new z0l0(28));
                        } else if (jl40.l(wxl0Var, txl0.a)) {
                            pzt0 pzt0Var = aVar3.d;
                            if (pzt0Var != null) {
                                pzt0Var.a(null);
                            }
                            aVar3.d = null;
                            com.yandex.go.navigation.activity.b bVar6 = ((b) aye0Var2.b).H.d;
                            zlb0.a aVar4 = new zlb0.a();
                            aVar4.a = d50.a;
                            bVar6.d(aVar4.a(), HProv.PP_CONTAINER_STATUS);
                        } else if (jl40.l(wxl0Var, uxl0.a)) {
                            pzt0 pzt0Var2 = aVar3.d;
                            if (pzt0Var2 != null) {
                                pzt0Var2.a(null);
                            }
                            aVar3.d = null;
                            b bVar7 = (b) aye0Var2.b;
                            tje.N(bVar7.o(), null, null, new SafetyPhotoUploadRouter$InnerNavigator$requestSelfie$1(bVar7, null), 3);
                        } else {
                            if (!jl40.l(wxl0Var, sxl0.a)) {
                                w511.b();
                                return null;
                            }
                            int i5 = xxl0.a[((qxl0) rxl0Var.a.getValue()).a.ordinal()];
                            if (i5 == 1) {
                                pzt0 pzt0Var3 = aVar3.c;
                                if (pzt0Var3 != null) {
                                    pzt0Var3.a(null);
                                }
                                aVar3.c = null;
                                ((b) aye0Var2.b).r(new z0l0(27));
                            } else if (i5 == 2 || i5 == 3 || i5 == 4) {
                                pzt0 pzt0Var4 = aVar3.d;
                                if (pzt0Var4 != null) {
                                    pzt0Var4.a(null);
                                }
                                aVar3.d = null;
                                ((b) aye0Var2.b).r(new z0l0(27));
                            } else if (i5 != 5) {
                                w511.b();
                                return null;
                            }
                        }
                        return zy11.a;
                    }
                };
                gbd.a.getClass();
                agdVar5.g = gbd.b;
                return zy11.a;
            case 23:
                final ru.yandex.taxi.favorites.rides.save_modal.routers.c cVar2 = (ru.yandex.taxi.favorites.rides.save_modal.routers.c) obj2;
                final yfd yfdVar7 = (yfd) obj;
                ((agd) yfdVar7).c = cVar2.L.h;
                tls tlsVar = new tls() { // from class: ru.yandex.taxi.favorites.rides.save_modal.routers.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        Object value3;
                        e0m0 e0m0Var;
                        cqk0 cqk0Var;
                        boolean l3;
                        String str4;
                        Object value4;
                        e0m0 e0m0Var2;
                        c cVar3 = c.this;
                        ru.yandex.taxi.favorites.rides.save_modal.domain.b bVar5 = cVar3.L;
                        d0m0 d0m0Var = (d0m0) obj3;
                        boolean l4 = jl40.l(d0m0Var, yzl0.a);
                        yfd yfdVar8 = yfdVar7;
                        if (l4) {
                            rzl0 rzl0Var = (rzl0) ((agd) yfdVar8).a;
                            s6k0 s6k0Var = bVar5.e;
                            s6k0Var.c = FavoritesAnalytics$SaveRideModalCloseReason.Back;
                            s6k0Var.e(FavoritesAnalytics$SaveRideModalButtonName.Back, rzl0Var);
                            cVar3.r(new qu(9));
                        } else if (jl40.l(d0m0Var, a0m0.a)) {
                            bVar5.e.e(FavoritesAnalytics$SaveRideModalButtonName.NameField, (rzl0) ((agd) yfdVar8).a);
                        } else if (jl40.l(d0m0Var, c0m0.a)) {
                            r0 r0Var4 = bVar5.g;
                            do {
                                value4 = r0Var4.getValue();
                                e0m0Var2 = (e0m0) value4;
                            } while (!r0Var4.k(value4, e0m0Var2 != null ? e0m0.a(e0m0Var2, false, null, cqk0.a(e0m0Var2.f, false, null, 5), null, 479) : null));
                        } else if (d0m0Var instanceof zzl0) {
                            tje.N(cVar3.o(), null, null, new SaveFavoriteRideRootRouterImpl$content$1$1$1(cVar3, d0m0Var, yfdVar8, null), 3);
                        } else {
                            if (!(d0m0Var instanceof b0m0)) {
                                w511.b();
                                return null;
                            }
                            String str5 = ((b0m0) d0m0Var).a;
                            r0 r0Var5 = bVar5.g;
                            do {
                                value3 = r0Var5.getValue();
                                e0m0Var = (e0m0) value3;
                                if (e0m0Var == null) {
                                    break;
                                }
                                cqk0Var = e0m0Var.f;
                                l3 = jl40.l(cqk0Var.b, str5);
                                str4 = l3 ? "" : str5;
                            } while (!r0Var5.k(value3, e0m0.a(e0m0Var, false, str4, cqk0.a(cqk0Var, false, l3 ? null : str4, 5), null, 471)));
                        }
                        return zy11.a;
                    }
                };
                agd agdVar6 = (agd) yfdVar7;
                agdVar6.e = tlsVar;
                ibd.a.getClass();
                agdVar6.g = ibd.b;
                return zy11.a;
            case 24:
                l1m0 l1m0Var = ((j1m0) obj2).c;
                return Boolean.valueOf(l1m0Var != null ? l1m0Var.d(obj) : true);
            case 25:
                showBottomSheet$lambda$15$lambda$14 = SavingsAccountCloseDepositFragment.showBottomSheet$lambda$15$lambda$14((SavingsAccountCloseDepositFragment) obj2, ((Boolean) obj).booleanValue());
                return showBottomSheet$lambda$15$lambda$14;
            case 26:
                ((i561) obj2).c.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return zy11.a;
            case 27:
                viewBinding$lambda$3$lambda$0 = SavingsAccountGoalFragment.getViewBinding$lambda$3$lambda$0((SavingsAccountGoalFragment) obj2, (Editable) obj);
                return viewBinding$lambda$3$lambda$0;
            case 28:
                t9m0 t9m0Var = (t9m0) obj2;
                i6m0 i6m0Var = (i6m0) obj;
                MoneyEntity moneyEntity = t9m0Var.b;
                SavingsActionStatus savingsActionStatus = t9m0Var.c;
                if (moneyEntity == null || t9m0Var.a == null) {
                    return i6m0.a(i6m0Var, null, null, null, null, null, null, false, savingsActionStatus == SavingsActionStatus.IN_PROGRESS, 1535);
                }
                return i6m0.a(i6m0Var, null, null, null, null, null, null, savingsActionStatus == SavingsActionStatus.IN_PROGRESS, false, 1791);
            default:
                render$lambda$3 = SavingsAccountNameFragment.render$lambda$3((n7m0) obj2, (g) obj);
                return render$lambda$3;
        }
    }
}
