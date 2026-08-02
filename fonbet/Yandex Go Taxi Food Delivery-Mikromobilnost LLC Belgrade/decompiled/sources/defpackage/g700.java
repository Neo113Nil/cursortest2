package defpackage;

import android.view.View;
import com.yandex.go.address.address_map_picker.navigation.b;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.payments.transport.navigation.e;
import com.yandex.go.user_profile.settings.main.UserInfoView;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.masstransit.geopayment.checkout.t;
import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;
import ru.yandex.taxi.plaque.level.MicroWidgetLevelView;
import ru.yandex.taxi.plus.sdk.badge.widget.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class g700 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g700(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Object value;
        ugp ugpVar;
        zy11 updateLevelModel$lambda$0$0;
        h22 m22Var;
        tya0 permissionManager_delegate$lambda$0;
        zy11 render$lambda$13$lambda$11$lambda$10;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                i700 i700Var = (i700) obj;
                UserInfoView userInfoView = (UserInfoView) ((h3y) obj2).get();
                userInfoView.setDebounceClickListener(new d700(i700Var, 15));
                View findViewById = i700Var.F.findViewById(oeh0.auth_stub);
                if (findViewById != null) {
                    c.w(findViewById, userInfoView);
                } else {
                    unr0.z(jst.e, "Failed to attach userInfoView to menu");
                }
                userInfoView.setId(oeh0.auth);
                break;
            case 1:
                ((gh00) ((com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration.c) obj2).d).u((yh00) obj);
                break;
            case 2:
                ((ni00) obj2).T.invoke((ibc0) obj);
                break;
            case 3:
                c9v c9vVar = (c9v) obj2;
                b bVar = (b) obj;
                wtr wtrVar = (wtr) c9vVar.c;
                if (wtrVar.c == 0) {
                    wtrVar.b.b8(wtrVar.a);
                }
                wtrVar.c++;
                bVar.invoke(wtrVar.d);
                break;
            case 4:
                tgp tgpVar = (tgp) obj;
                r0 r0Var = (r0) ((uj00) obj2).Q.a;
                do {
                    value = r0Var.getValue();
                    ugpVar = (ugp) value;
                    if (jl40.l(ugpVar, tgpVar)) {
                        ugpVar = null;
                    }
                } while (!r0Var.k(value, ugpVar));
            case 5:
                wjm wjmVar = (wjm) obj2;
                b01 b01Var = new b01(13, (vl00) obj);
                ((gh00) ((ah00) wjmVar.c)).e(b01Var);
                break;
            case 6:
                wjm wjmVar2 = (wjm) obj2;
                ntg ntgVar = new ntg(i2, (wl00) obj);
                ru.yandex.taxi.viewholder.b bVar2 = (ru.yandex.taxi.viewholder.b) ((xi00) wjmVar2.b);
                CopyOnWriteArraySet copyOnWriteArraySet = bVar2.p;
                if (copyOnWriteArraySet.isEmpty()) {
                    ((gh00) bVar2.c).e(bVar2.u);
                }
                copyOnWriteArraySet.add(ntgVar);
                break;
            case 7:
                ((gh00) ((ah00) ((wjm) obj2).c)).u((b01) obj);
                break;
            case 8:
                ru.yandex.taxi.viewholder.b bVar3 = (ru.yandex.taxi.viewholder.b) ((xi00) ((wjm) obj2).b);
                CopyOnWriteArraySet copyOnWriteArraySet2 = bVar3.p;
                copyOnWriteArraySet2.remove((ntg) obj);
                if (copyOnWriteArraySet2.isEmpty()) {
                    ((gh00) bVar3.c).u(bVar3.u);
                    break;
                }
                break;
            case 9:
                e100 e100Var = (e100) obj2;
                xm00 xm00Var = ((gh00) ((ah00) e100Var.b)).i;
                xm00 p = xm00Var.p();
                p.b(xm00Var);
                ((y4) obj).invoke(p);
                break;
            case 10:
                ru.yandex.taxi.layers.presentation.optimalview.c cVar = (ru.yandex.taxi.layers.presentation.optimalview.c) obj2;
                cVar.F.t("KEY_ONBOARDING_ZOOM_DONE", v4r0.i((Set) cVar.H.getValue(cVar, ru.yandex.taxi.layers.presentation.optimalview.c.M[1]), ((Mode) obj).getWireName()));
                break;
            case 11:
                xq00 xq00Var = (xq00) obj2;
                xq00Var.a(0.0f);
                ((i6l0) obj).invoke();
                xq00Var.d().removeAllListeners();
                break;
            case 12:
                ((sls) obj2).invoke();
                ((mx00) obj).e.invoke();
                break;
            case 13:
                ((tls) obj2).invoke(((t510) obj).d);
                break;
            case 14:
                ((tls) obj2).invoke(((p510) obj).c);
                break;
            case 15:
                break;
            case 16:
                kdc kdcVar = (kdc) obj;
                ListItemComponent listItemComponent = ((jm10) obj2).S;
                listItemComponent.setLeadImage(c.l(y2h0.ic_payment_banner_info, listItemComponent));
                if (kdcVar != null) {
                    listItemComponent.setLeadColor(kdcVar);
                    break;
                }
                break;
            case 17:
                updateLevelModel$lambda$0$0 = MicroWidgetLevelView.updateLevelModel$lambda$0$0((MicroWidgetLevelView) obj2, (gf20) obj);
                break;
            case 18:
                dg20 dg20Var = (dg20) obj;
                ijc0 ijc0Var = (ijc0) ((sg20) obj2).b;
                ijc0Var.getClass();
                if (!(dg20Var instanceof sf20)) {
                    if (!(dg20Var instanceof mf20)) {
                        w511.b();
                        break;
                    } else {
                        mf20 mf20Var = (mf20) dg20Var;
                        String str = mf20Var.a;
                        q0d0 q0d0Var = mf20Var.b;
                        if (q0d0Var == null) {
                            q0d0Var = null;
                        }
                        m22Var = new m22(str, q0d0Var);
                    }
                } else {
                    ijc0Var.f.getClass();
                    m22Var = ljz0.a((sf20) dg20Var);
                }
                ijc0Var.b.b(m22Var);
                a aVar = ijc0Var.a;
                q0d0 a = dg20Var.a();
                a.d(aVar, a != null ? a : null);
                break;
            case 19:
                ((tls) obj2).invoke(((gi20) ((hi20) obj)).h);
                break;
            case 20:
                break;
            case 21:
                ljh ljhVar = (ljh) obj;
                if (jl40.l((String) obj2, "3ds")) {
                    ljhVar.a.onSuccess(tm0.a);
                    break;
                }
                break;
            case 22:
                ct20 ct20Var = (ct20) obj2;
                ryj0 ryj0Var = ((ljh) obj).a;
                if (!(ct20Var instanceof p89)) {
                    if (!(ct20Var instanceof u89)) {
                        if (!(ct20Var instanceof x89)) {
                            if (ct20Var instanceof s89) {
                                ryj0Var.onSuccess(xm0.a);
                                break;
                            }
                        } else {
                            ryj0Var.onSuccess(new wm0(wme.b((x89) ct20Var)));
                            break;
                        }
                    } else {
                        ryj0Var.onSuccess(new wm0(wme.a((u89) ct20Var)));
                        break;
                    }
                } else {
                    p89 p89Var = (p89) ct20Var;
                    ryj0Var.onSuccess(new vm0(p89Var.b, p89Var.c));
                    break;
                }
                break;
            case 23:
                permissionManager_delegate$lambda$0 = MobilePaymentSelectContactFragment.permissionManager_delegate$lambda$0((MobilePaymentSelectContactFragment) obj2, (ug01) obj);
                break;
            case 24:
                render$lambda$13$lambda$11$lambda$10 = MobileProvidersListFragment.render$lambda$13$lambda$11$lambda$10((q361) obj2, (mu20) obj);
                break;
            case 25:
                ((we6) obj2).b++;
                break;
            case 26:
                rz20 rz20Var = (rz20) obj;
                Boolean bool = (Boolean) ((m3u0) obj2).getValue();
                boolean a2 = rz20Var.a.a();
                sz40 sz40Var = rz20Var.a;
                Boolean bool2 = (Boolean) sz40Var.c.getValue();
                boolean booleanValue = bool2.booleanValue();
                boolean booleanValue2 = ((Boolean) sz40Var.b.getValue()).booleanValue();
                if (a2 && booleanValue == booleanValue2 && bool2.equals(bool)) {
                    break;
                }
                break;
            case 27:
                ((tls) obj2).invoke((y930) ((f930) obj).d.c);
                break;
            case 28:
                t tVar = (t) obj;
                q8j0 q8j0Var = ((CheckoutUIState$PaymentCheckoutUIState) ((qnb) obj2)).p;
                String str2 = q8j0Var.d;
                String str3 = q8j0Var.e;
                String str4 = q8j0Var.b;
                Object obj3 = q8j0Var.f;
                tVar.G.e();
                t.Og(tVar, str2, str3, str4, obj3, 16);
                break;
            default:
                je30 je30Var = (je30) obj2;
                at20 at20Var = (at20) obj;
                e eVar = je30Var.V;
                if (eVar != null) {
                    eVar.i();
                }
                je30Var.V = null;
                ((je30) at20Var.b).T();
                break;
        }
        return zy11Var;
    }
}
