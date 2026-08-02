package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.compose.ui.semantics.f;
import com.yandex.go.chargers.background.ChargersBackgroundModalView;
import com.yandex.go.chargers.design.components.badges.ChargersBadgesView;
import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import com.yandex.go.chargers.discounts.discount_stations.data.a;
import com.yandex.go.chargers.discounts.discount_stations.ui.d;
import com.yandex.go.chargers.discounts.list.ui.h;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferBottomComponent;
import com.yandex.go.chargers.order.completion.pre_finish.ChargersFinishModalView;
import com.yandex.go.chargers.qr.ChargersQrModalView;
import com.yandex.go.chargers.qr.api.ChargersQrOpenReason;
import com.yandex.go.chargers.station.presentation.tariff.ChargersTariffModalView;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutScreenOpenReason;
import com.yandex.messaging.internal.urlpreview.reporter.UrlPreviewReporter$Element;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.SupportEntryPointsImpl;
import com.ybsdk.screens.changephone.presentation.c;
import com.ybsdk.widgets.common.chip.ChipListView;
import defpackage.bt9;
import defpackage.bts;
import defpackage.cu9;
import defpackage.did;
import defpackage.du9;
import defpackage.fid;
import defpackage.lv9;
import defpackage.o0a;
import defpackage.rzo;
import defpackage.ss9;
import defpackage.tje;
import defpackage.ut9;
import defpackage.uv9;
import defpackage.vt9;
import defpackage.wls;
import defpackage.wwg;
import defpackage.xfd;
import defpackage.zpn;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.checkin.CheckInOnboardingModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class od9 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ od9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        zy11 recyclerAdapter$lambda$0;
        zy11 insetsType$lambda$02;
        zy11 legalTerms_CIcbqa4$lambda$0$0;
        zy11 insetsType$lambda$03;
        zy11 onAttachedToWindow$lambda$0;
        zy11 onAttachedToWindow$lambda$02;
        stz0 render$lambda$18$lambda$15;
        Long l;
        CheckoutScreenOpenReason checkoutScreenOpenReason;
        zy11 onViewCreated$lambda$3;
        zy11 chipsAdapterDelegate$lambda$7;
        int i = this.a;
        int i2 = 9;
        int i3 = 2;
        int i4 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                String str = ((qd9) ((agd) yfdVar).a).a;
                agd agdVar = (agd) yfdVar;
                qd9 qd9Var = (qd9) agdVar.a;
                agdVar.c = new g92(i3, new vd9(str, qd9Var.b, qd9Var.c, qd9Var.d));
                agdVar.e = new cs8(i2, (uv6) obj2, yfdVar);
                i4d.a.getClass();
                agdVar.g = i4d.b;
                return zy11Var;
            case 1:
                c cVar = (c) obj2;
                b bVar = cVar.D;
                bVar.getClass();
                dfr b = gjw0.b(bVar.f);
                SupportEntryPointsImpl supportEntryPointsImpl = (SupportEntryPointsImpl) bVar.d(b).getData();
                SupportEntryPointsImpl supportEntryPointsImpl2 = (SupportEntryPointsImpl) b.c.getData();
                String changePhoneProcessing = supportEntryPointsImpl.getChangePhoneProcessing();
                if (changePhoneProcessing.length() == 0) {
                    changePhoneProcessing = supportEntryPointsImpl2.getChangePhoneProcessing();
                }
                return new pe9(changePhoneProcessing, cVar.B.getShowLogoutButton());
            case 2:
                insetsType$lambda$0 = ChargersBackgroundModalView.insetsType$lambda$0((ChargersBackgroundModalView) obj2, (t1w) obj);
                return insetsType$lambda$0;
            case 3:
                recyclerAdapter$lambda$0 = ChargersBadgesView.recyclerAdapter$lambda$0((ChargersBadgesView) obj2, (qo9) obj);
                return recyclerAdapter$lambda$0;
            case 4:
                final ss9 ss9Var = (ss9) obj2;
                final yfd yfdVar2 = (yfd) obj;
                jt9 jt9Var = (jt9) ss9Var.K;
                a aVar = (a) ss9Var.J;
                an8 an8Var = jt9Var.a;
                agd agdVar2 = (agd) yfdVar2;
                agdVar2.c = new d((pwy0) ((txf) an8Var.c).get(), (em9) ((txf) an8Var.w).get(), (ru.yandex.taxi.widget.c) ((txf) an8Var.x).get(), (com.yandex.go.chargers.discounts.discount_stations.data.b) ((g6) an8Var.b).get(), aVar).a(((ls9) ((agd) yfdVar2).a).a);
                final rs9 rs9Var = new rs9(ss9Var);
                final com.yandex.go.chargers.discounts.discount_stations.ui.c cVar2 = new com.yandex.go.chargers.discounts.discount_stations.ui.c((com.yandex.go.chargers.discounts.discount_stations.data.b) ((ct9) ss9Var.L).a.a.get(), (a) ss9Var.J);
                agdVar2.e = new tls() { // from class: com.yandex.go.chargers.discounts.discount_stations.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        tje.N(ss9.this.o(), null, null, new ChargersDiscountStationsRouter$content$1$1$1(cVar2, yfdVar2, (bt9) obj3, rs9Var, null), 3);
                        return zy11.a;
                    }
                };
                p4d.a.getClass();
                agdVar2.g = p4d.b;
                return zy11Var;
            case 5:
                final vt9 vt9Var = (vt9) obj2;
                yfd yfdVar3 = (yfd) obj;
                com.yandex.go.chargers.discounts.activate.d dVar = vt9Var.I;
                String str2 = ((yoj) ((agd) yfdVar3).a).a;
                agd agdVar3 = (agd) yfdVar3;
                yoj yojVar = (yoj) agdVar3.a;
                xoj xojVar = yojVar.b;
                String str3 = yojVar.c;
                r0 r0Var = dVar.c.a;
                if (str3 == null) {
                    str3 = "";
                }
                q00 q00Var = new q00(new yj9(xojVar, str3, str2), i4);
                r0Var.getClass();
                r0Var.m(null, q00Var);
                agdVar3.c = dVar.a();
                final tt9 tt9Var = new tt9(vt9Var);
                agdVar3.e = new tls() { // from class: com.yandex.go.chargers.discounts.activate.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        vt9 vt9Var2 = vt9.this;
                        tje.N(vt9Var2.o(), null, null, new ChargersDiscountsActivateRouter$content$1$1$1(vt9Var2, (cu9) obj3, tt9Var, null), 3);
                        return zy11.a;
                    }
                };
                agdVar3.g = new androidx.compose.runtime.internal.a(2147378583, new bms() { // from class: com.yandex.go.chargers.discounts.activate.b
                    @Override // defpackage.bms
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i5;
                        xfd xfdVar = (xfd) obj3;
                        du9 du9Var = (du9) obj4;
                        fid fidVar = (fid) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        if ((intValue & 6) == 0) {
                            i5 = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
                        } else {
                            i5 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i5 |= ((bts) fidVar).k(du9Var) ? 32 : 16;
                        }
                        int i6 = 0;
                        bts btsVar = (bts) fidVar;
                        boolean V = btsVar.V(i5 & 1, (i5 & 147) != 146);
                        zy11 zy11Var2 = zy11.a;
                        if (!V) {
                            btsVar.Y();
                            return zy11Var2;
                        }
                        rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(i6, du9Var, xfdVar), btsVar), btsVar, 3456, 3);
                        vt9 vt9Var2 = vt9.this;
                        boolean e = btsVar.e(vt9Var2);
                        Object Q = btsVar.Q();
                        if (e || Q == did.a) {
                            Q = new ChargersDiscountsActivateRouter$content$1$2$2$1(vt9Var2, null);
                            btsVar.o0(Q);
                        }
                        zpn.e(btsVar, (wls) Q, zy11Var2);
                        return zy11Var2;
                    }
                }, true);
                return zy11Var;
            case 6:
                xoj xojVar2 = ((yoj) obj2).b;
                ((jw9) obj).a.r(new qu(i2));
                return zy11Var;
            case 7:
                final lv9 lv9Var = (lv9) obj2;
                yfd yfdVar4 = (yfd) obj;
                h hVar = lv9Var.J;
                ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint = ((hw9) ((agd) yfdVar4).a).a;
                agd agdVar4 = (agd) yfdVar4;
                hw9 hw9Var = (hw9) agdVar4.a;
                agdVar4.c = hVar.a(chargersDiscountsListEntryPoint, hw9Var.e, hw9Var.b, hw9Var.c);
                agdVar4.e = new tls() { // from class: com.yandex.go.chargers.discounts.list.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        lv9 lv9Var2 = lv9.this;
                        tje.N(lv9Var2.o(), null, null, new ChargersDiscountsListScreenRouter$content$1$1$1(lv9Var2, (uv9) obj3, null), 3);
                        return zy11.a;
                    }
                };
                fpb1.e(yfdVar4, new ju8(23, lv9Var));
                q4d.a.getClass();
                agdVar4.g = q4d.b;
                return zy11Var;
            case 8:
                final com.yandex.go.chargers.feedback.c cVar3 = (com.yandex.go.chargers.feedback.c) obj2;
                final yfd yfdVar5 = (yfd) obj;
                agd agdVar5 = (agd) yfdVar5;
                agdVar5.c = cVar3.N.a(((nar) ((agd) yfdVar5).a).a);
                agdVar5.e = new tls() { // from class: com.yandex.go.chargers.feedback.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        c cVar4 = c.this;
                        tje.N(cVar4.o(), null, null, new ChargersFeedbackScreenRouter$content$1$1$1(cVar4, yfdVar5, (o0a) obj3, null), 3);
                        return zy11.a;
                    }
                };
                t4d.a.getClass();
                agdVar5.g = t4d.b;
                return zy11Var;
            case 9:
                insetsType$lambda$02 = ChargersFinishModalView.insetsType$lambda$0((ChargersFinishModalView) obj2, (t1w) obj);
                return insetsType$lambda$02;
            case 10:
                legalTerms_CIcbqa4$lambda$0$0 = ChargersOfferBottomComponent.setLegalTerms_CIcbqa4$lambda$0$0((ChargersOfferBottomComponent) obj2, (String) obj);
                return legalTerms_CIcbqa4$lambda$0$0;
            case 11:
                uv6 uv6Var = (uv6) obj2;
                yfd yfdVar6 = (yfd) obj;
                CharSequence charSequence = ((xfa) ((agd) yfdVar6).a).b.a;
                agd agdVar6 = (agd) yfdVar6;
                iga igaVar = ((xfa) agdVar6.a).b;
                agdVar6.c = new g92(i3, new iga(charSequence, igaVar.b, igaVar.c));
                agdVar6.e = new cs8(19, uv6Var, new yfa(uv6Var));
                y4d.a.getClass();
                agdVar6.g = y4d.b;
                return zy11Var;
            case 12:
                com.yandex.go.chargers.passes.a aVar2 = (com.yandex.go.chargers.passes.a) obj2;
                yfd yfdVar7 = (yfd) obj;
                io9 io9Var = new io9(aVar2);
                ((agd) yfdVar7).c = e.d(aVar2.I.e);
                agd agdVar7 = (agd) yfdVar7;
                agdVar7.e = new cs8(20, aVar2, io9Var);
                e5d.a.getClass();
                agdVar7.g = e5d.b;
                return zy11Var;
            case 13:
                insetsType$lambda$03 = ChargersQrModalView.insetsType$lambda$0((ChargersQrModalView) obj2, (t1w) obj);
                return insetsType$lambda$03;
            case 14:
                ((bsa) obj).n1((ChargersQrOpenReason) obj2, null);
                return zy11Var;
            case 15:
                mnq0 mnq0Var = (mnq0) obj;
                f.l(mnq0Var, ((fta) obj2).a.toString());
                f.p(mnq0Var, 0);
                return zy11Var;
            case 16:
                onAttachedToWindow$lambda$0 = ChargersTariffModalView.onAttachedToWindow$lambda$0((ChargersTariffModalView) obj2, (uj9) obj);
                return onAttachedToWindow$lambda$0;
            case 17:
                zya zyaVar = (zya) obj2;
                zyaVar.A((m950) zyaVar.G.get(), new ly9(cy9.e), new qs9(zyaVar, 7));
                return zy11Var;
            case 18:
                com.yandex.messaging.internal.menu.c cVar4 = (com.yandex.messaging.internal.menu.c) obj2;
                if (((Boolean) obj).booleanValue()) {
                    int i5 = oyh0.mark_unread_fail;
                    Toast.makeText(cVar4.a, i5, 0).show();
                    cVar4.a.getResources().getString(i5);
                } else {
                    Toast.makeText(cVar4.a, oyh0.mark_unread_fail_server_error, 0).show();
                }
                return zy11Var;
            case 19:
                ldb ldbVar = (ldb) obj2;
                jcz0 jcz0Var = ldbVar.w;
                ye0 ye0Var = (ye0) ldbVar.b;
                jh21 jh21Var = (jh21) ye0Var;
                jcz0Var.z(jh21Var.a, (String) obj, jh21Var.c);
                ldbVar.z.a(ye0Var, UrlPreviewReporter$Element.OpenButton);
                return zy11Var;
            case 20:
                onAttachedToWindow$lambda$02 = CheckInOnboardingModalView.onAttachedToWindow$lambda$0((CheckInOnboardingModalView) obj2, (Drawable) obj);
                return onAttachedToWindow$lambda$02;
            case 21:
                render$lambda$18$lambda$15 = CheckPinFragment.render$lambda$18$lambda$15((thb) obj2, (stz0) obj);
                return render$lambda$18$lambda$15;
            case 22:
                return ((f530) obj).k((f530) obj2);
            case 23:
                llc llcVar = (llc) ((com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.processor.e) obj2).b.invoke();
                return Long.valueOf((llcVar == null || (l = llcVar.b) == null) ? 300L : l.longValue());
            case 24:
                as30 as30Var = (as30) obj2;
                xz00 xz00Var = (xz00) obj;
                boolean z = xz00Var.a;
                pj40 pj40Var = xz00Var.A;
                ru.yandex.taxi.masstransit.d dVar2 = xz00Var.x;
                q1j0 l1j0Var = z ? new l1j0(xz00Var.b) : k1j0.a;
                String str4 = xz00Var.c;
                if (str4 == null) {
                    str4 = xz00Var.w;
                }
                if (!jl40.l(as30Var.b, Boolean.TRUE) || str4 == null) {
                    dVar2.Y(xz00Var.y, xz00Var.D, xz00Var.c, xz00Var.E, pj40Var, xz00Var.z, xz00Var.B, xz00Var.C, l1j0Var);
                } else {
                    e310 e310Var = xz00Var.y;
                    int i6 = pz00.a[xz00Var.z.ordinal()];
                    if (i6 == 1) {
                        checkoutScreenOpenReason = CheckoutScreenOpenReason.QrScan;
                    } else if (i6 == 2) {
                        checkoutScreenOpenReason = CheckoutScreenOpenReason.Deeplink;
                    } else {
                        if (i6 != 3) {
                            w511.b();
                            return null;
                        }
                        checkoutScreenOpenReason = CheckoutScreenOpenReason.BleVehiclesScreen;
                    }
                    dVar2.b0(e310Var, new dmb(new mkb(str4), new zib(checkoutScreenOpenReason, pj40Var.a, pj40Var.b, null, 8)), xz00Var.B, xz00Var.C, l1j0Var);
                }
                return zy11Var;
            case 25:
                onViewCreated$lambda$3 = CheckoutFragment.onViewCreated$lambda$3((CheckoutFragment) obj2, (mx60) obj);
                return onViewCreated$lambda$3;
            case 26:
                g010 g010Var = (g010) obj;
                String str5 = ((alb) ((blb) obj2)).a;
                ru.yandex.taxi.masstransit.d dVar3 = g010Var.c;
                ((jj3) dVar3.F.get()).c(new um3(Events$Zalogin$LoginContext.MASSTRANSIT, new qzj0(null, new vqy(dVar3, str5, g010Var.a, g010Var.w, 4)), false, false, 28));
                return zy11Var;
            case 27:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.q(mnq0Var2, ((hob) obj2).d);
                f.p(mnq0Var2, 1);
                return zy11Var;
            case 28:
                FrameLayout frameLayout = new FrameLayout((Context) obj);
                ((xni) obj2).b(frameLayout);
                return frameLayout;
            default:
                chipsAdapterDelegate$lambda$7 = ChipListView.chipsAdapterDelegate$lambda$7((ChipListView) obj2, (n70) obj);
                return chipsAdapterDelegate$lambda$7;
        }
    }
}
