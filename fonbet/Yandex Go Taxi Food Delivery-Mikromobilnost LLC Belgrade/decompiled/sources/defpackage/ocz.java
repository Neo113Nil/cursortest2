package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.widget.ImageView;
import com.yandex.go.intentprocessor.k;
import com.yandex.go.payments_widgets.api.PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction;
import com.yandex.go.taxi.order.cache.domain.a;
import com.yandex.messenger.websdk.api.Notification;
import com.yandex.messenger.websdk.api.PushToken;
import com.yandex.messenger.websdk.api.PushTokenType;
import com.yandex.mob.domain.r;
import com.yandex.mob.m;
import com.yandex.passport.api.PassportVpnStatus;
import com.yandex.plus.log.api.LogPriority;
import flex.feature.sections.action.ScrollPositionSurrogate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;
import ru.yandex.taxi.address.experiment.q;
import ru.yandex.taxi.am.m0;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.layers.presentation.g;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationComponent;
import ru.yandex.taxi.layers.presentation.mapnotification.d;
import ru.yandex.taxi.logistics.sdk.LogisticsTimedNotification;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.messenger.e;
import ru.yandex.taxi.systemrequeirements.location.l;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.viewholder.b;
import ru.yandex.taxi.widget.dialog.Toggleable;

/* loaded from: classes10.dex */
public final class ocz implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ocz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Intent intent;
        PushToken pushToken;
        String str;
        String str2;
        int i = this.a;
        int i2 = 2;
        Long l = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                l lVar = (l) obj2;
                n nVar = lVar.h;
                int[] a = ((o0b0) obj).a();
                z9z z9zVar = nVar.d;
                ArrayList d = nVar.c.d(a);
                if (!d.isEmpty()) {
                    if (!d.isEmpty()) {
                        Iterator it = d.iterator();
                        while (it.hasNext()) {
                            if (!Boolean.TRUE.equals(it.next())) {
                            }
                        }
                    }
                    t61 t61Var = z9zVar.a;
                    t61Var.getClass();
                    t61Var.a.a("GeolocationCard.ConfirmButtonTapped", new HashMap(), 1, new HashMap());
                    nVar.e.g(zy11Var);
                    intent = lVar.a.getIntent();
                    if (intent != null && (egb1.d(intent) || s8o.v(intent))) {
                        k.c((k) lVar.f.get(), intent);
                        break;
                    }
                }
                t61 t61Var2 = z9zVar.a;
                t61Var2.getClass();
                t61Var2.a.a("GeolocationCard.DismissButtonTapped", new HashMap(), 1, new HashMap());
                intent = lVar.a.getIntent();
                if (intent != null) {
                    k.c((k) lVar.f.get(), intent);
                }
                break;
            case 1:
                iej iejVar = (iej) obj;
                ru.yandex.taxi.logistics.sdk.k kVar = (ru.yandex.taxi.logistics.sdk.k) obj2;
                int i3 = phz.a[iejVar.a().g().ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        kVar.getClass();
                        qej a2 = iejVar.a();
                        Toggleable toggleable = a2.h() ? Toggleable.ON : Toggleable.OFF;
                        String a3 = a2.a();
                        CharSequence f = a2.f();
                        CharSequence b = a2.b();
                        CharSequence c = a2.c();
                        q1c q1cVar = c != null ? new q1c(c, new ohz(iejVar, 0)) : null;
                        CharSequence e = a2.e();
                        kVar.f.s(new ymu(kVar.b).m(new hr1(null, toggleable, a3, f, b, q1cVar, e != null ? new q1c(e, new ohz(iejVar, 1)) : null, null, new yow(26, iejVar), HProv.PP_SECURITY_LEVEL)), true);
                        break;
                    } else {
                        w511.b();
                        break;
                    }
                } else {
                    break;
                }
            case 2:
                ci60 ci60Var = (ci60) obj;
                ru.yandex.taxi.logistics.sdk.l lVar2 = (ru.yandex.taxi.logistics.sdk.l) obj2;
                gkz gkzVar = lVar2.c;
                ci60Var.a().getClass();
                String b2 = ci60Var.a().b();
                ci60Var.a().getClass();
                h2t h2tVar = new h2t(ci60Var);
                zqj zqjVar = gkzVar.a;
                LogisticsTimedNotification logisticsTimedNotification = new LogisticsTimedNotification((Context) zqjVar.a.get(), (pav) zqjVar.b.get(), (k7x0) zqjVar.c.get(), "DeliveryDefaultNotification", b2, null, h2tVar);
                tj60 tj60Var = lVar2.d;
                NotificationItemComponent a4 = tj60Var.a(logisticsTimedNotification.getUid());
                if (a4 != null) {
                    tj60Var.c(a4.getUid());
                }
                long longValue = ci60Var.a().a().longValue();
                NotificationStackComponent notificationStackComponent = tj60Var.a;
                if (notificationStackComponent != null) {
                    notificationStackComponent.showNotification(logisticsTimedNotification);
                }
                logisticsTimedNotification.startExpiresTimer(longValue);
                logisticsTimedNotification.setExpiresListener(new uhz(lVar2, logisticsTimedNotification, ci60Var));
                c.z(new m0v(3, lVar2, logisticsTimedNotification, ci60Var), logisticsTimedNotification);
                break;
            case 3:
                ((com.yandex.go.flex.main_screen.routers.c) obj2).J.h(((Boolean) obj).booleanValue());
                break;
            case 4:
                ((t900) obj2).setFabsVisibility(((Boolean) obj).booleanValue());
                break;
            case 5:
                gm00 gm00Var = (gm00) obj;
                d dVar = (d) obj2;
                tj60 tj60Var2 = dVar.c;
                if (gm00Var instanceof z6s0) {
                    for (fm00 fm00Var : ((z6s0) gm00Var).a()) {
                        tj60Var2.e(new MapNotificationComponent(dVar.a, fm00Var.d(), fm00Var.c(), fm00Var.a(), fm00Var.b(), new k200(9, dVar)));
                    }
                    tj60Var2.g();
                } else if (!(gm00Var instanceof biu)) {
                    w511.b();
                    break;
                } else {
                    Iterator it2 = ((biu) gm00Var).a().iterator();
                    while (it2.hasNext()) {
                        tj60Var2.c(((fm00) it2.next()).b());
                    }
                }
                break;
            case 6:
                yp00 yp00Var = (yp00) obj;
                g gVar = (g) obj2;
                if (((p) gVar.C.get()).isInitialized()) {
                    for (sxi0 sxi0Var : yp00Var.b) {
                        if (sxi0Var instanceof ixi0) {
                            ((jq00) gVar.Dg()).N5(((ixi0) sxi0Var).a());
                        } else if (sxi0Var instanceof qxi0) {
                            ((jq00) gVar.Dg()).Z5(((qxi0) sxi0Var).a());
                        } else if (sxi0Var instanceof mxi0) {
                            ((jq00) gVar.Dg()).s3(((mxi0) sxi0Var).a());
                        } else if (jl40.l(sxi0Var, kxi0.a)) {
                            ((jq00) gVar.Dg()).R6(yp00Var.a);
                            String a5 = gVar.A.c.a();
                            if (a5 != null) {
                                ((jq00) gVar.Dg()).h4(a5);
                            }
                        } else if (sxi0Var instanceof oxi0) {
                            ((jq00) gVar.Dg()).x8();
                        } else if (sxi0Var instanceof jxi0) {
                            ((jq00) gVar.Dg()).hide();
                            gcc0 gcc0Var = gVar.B;
                            m950 m950Var = gcc0Var instanceof m950 ? (m950) gcc0Var : null;
                            if (m950Var != null) {
                                ((h55) m950Var).i();
                            }
                        } else if (sxi0Var instanceof pxi0) {
                            ((jq00) gVar.Dg()).h4(((pxi0) sxi0Var).a());
                        } else if (sxi0Var instanceof lxi0) {
                            ((jq00) gVar.Dg()).D1(((lxi0) sxi0Var).a());
                        } else if (sxi0Var instanceof nxi0) {
                            ((jq00) gVar.Dg()).o1(((nxi0) sxi0Var).a);
                        } else if (!(sxi0Var instanceof rxi0)) {
                            w511.b();
                            break;
                        } else {
                            ((jq00) gVar.Dg()).N6(((rxi0) sxi0Var).a());
                        }
                    }
                }
                break;
            case 7:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                TaxiMapView d2 = ((b) obj2).d();
                if (d2 != null) {
                    d2.setJamsVisible(booleanValue);
                    break;
                }
                break;
            case 8:
                rj10 rj10Var = (rj10) obj2;
                rj10Var.B = ((Number) obj).intValue();
                rj10Var.Kg();
                break;
            case 9:
                Pair pair = (Pair) obj;
                String str3 = (String) pair.getFirst();
                String str4 = (String) pair.getSecond();
                e eVar = (e) obj2;
                eVar.getClass();
                if (str3 != null && !evu0.J(str3)) {
                    pushToken = new PushToken(str3, PushTokenType.FCM);
                } else if (str4 != null && !evu0.J(str4)) {
                    pushToken = new PushToken(str4, PushTokenType.HMS);
                }
                vh60 vh60Var = (vh60) ((Notification) eVar.a.b.getValue());
                ew2 ew2Var = vh60Var.d;
                Handler handler = vh60Var.i;
                ew2Var.c("wm_push_set_token_local", gw00.e(new Pair("notificationsEnabled", Boolean.valueOf(vh60Var.j))));
                handler.post(new sd30(6, vh60Var, pushToken));
                if (vh60Var.j) {
                    String str5 = vh60Var.c.c;
                    if (str5 != null && !evu0.J(str5)) {
                        handler.post(new ssu(15, vh60Var));
                        break;
                    } else {
                        ew2Var.c("wm_push_set_token_to_backend_error", gw00.e(new Pair(CRLReasonCodeExtension.REASON, "empty deviceId")));
                        break;
                    }
                }
                break;
            case 10:
                Object b3 = ((r) ((xo20) ((oo20) obj2)).F.getValue()).b((Map) obj, continuation);
                if (b3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                m mVar = (m) obj2;
                for (lq20 lq20Var : (List) obj) {
                    mVar.getClass();
                    String str6 = lq20Var.g;
                    if (str6 != null) {
                        mVar.c.put(lq20Var.d, str6);
                    }
                }
                break;
            case 12:
                ((androidx.compose.ui.platform.p) obj2).c.setFloatValue(((Number) obj).floatValue());
                break;
            case 13:
                wl40 wl40Var = (wl40) obj;
                com.yandex.go.superapp.order.multi.old.provider.g gVar2 = (com.yandex.go.superapp.order.multi.old.provider.g) obj2;
                gVar2.q.l(wl40Var);
                ((a) gVar2.l).a(((qs70) gVar2.h).a().f, new duu(i2, gVar2, wl40Var));
                break;
            case 14:
                ((com.yandex.go.messenger_native.interactors.a) ((com.yandex.go.messenger_native.a) obj2).e.get()).b();
                break;
            case 15:
                ((com.yandex.go.navigation.activity.a) obj2).g.h(((Boolean) obj).booleanValue());
                break;
            case 16:
                ((q) ((ru.yandex.taxi.address.d) obj2).c.get()).d.l((NewbiesRedesignPointsABExperiment) obj);
                break;
            case 17:
                xi60 xi60Var = (xi60) obj2;
                Pair pair2 = (Pair) obj;
                hl3 hl3Var = (hl3) pair2.getFirst();
                boolean booleanValue2 = ((Boolean) pair2.getSecond()).booleanValue();
                if (!(hl3Var instanceof fl3)) {
                    if (!(hl3Var instanceof gl3)) {
                        w511.b();
                        break;
                    } else {
                        ((as21) xi60Var.e.a).e("NOTIFICATION_PERMISSION_ASKED", false);
                    }
                } else if (booleanValue2) {
                    ((as21) xi60Var.e.a).e("NOTIFICATION_PERMISSION_ASKED", true);
                    xi60Var.d.o();
                }
                break;
            case 18:
                pfs0 pfs0Var = (pfs0) obj;
                fb80 fb80Var = ((com.yandex.go.flex.main_screen.data.widgets.orders.e) obj2).x;
                if (fb80Var != null) {
                    fb80Var.changeAppearanceState(pfs0Var);
                    break;
                }
                break;
            case 19:
                int i4 = kn90.a[((PassportVpnStatus) obj).ordinal()];
                if (i4 == 1) {
                    str = "allowed";
                } else if (i4 != 2) {
                    w511.b();
                    break;
                } else {
                    str = "blocked";
                }
                i d3 = ((j) ((m0) obj2).a).d("Passport.Anticrisis.StatusChanged");
                d3.d(ACSPConstants.STATUS, str);
                d3.m();
                break;
            case 20:
                com.yandex.go.domain.interactor.a aVar = (com.yandex.go.domain.interactor.a) obj2;
                hl3 hl3Var2 = (hl3) obj;
                if (hl3Var2 instanceof fl3) {
                    com.yandex.go.repositories.e eVar2 = aVar.a;
                    kj Ig = eVar2.c.a.Ig();
                    if (Ig != null) {
                        eVar2.e.l(Ig.h);
                    }
                } else if (!(hl3Var2 instanceof gl3)) {
                    w511.b();
                    break;
                } else {
                    aVar.a.e.l(null);
                }
                break;
            case 21:
                g1a0 g1a0Var = (g1a0) obj2;
                for (Map.Entry entry : g1a0Var.e.entrySet()) {
                    g1a0Var.b((ImageView) entry.getKey(), (t0a0) entry.getValue());
                }
                for (Map.Entry entry2 : g1a0Var.f.entrySet()) {
                    g1a0Var.b((ImageView) entry2.getKey(), (t0a0) entry2.getValue());
                }
                break;
            case 22:
                ((jca0) obj2).c7((String) obj);
                break;
            case 23:
                cla0 cla0Var = (cla0) obj2;
                cla0Var.getClass();
                if (bla0.a[((PaymentWidgetsSectionActionRepository$PaymentWidgetsSectionAction) obj).ordinal()] != 1) {
                    w511.b();
                    break;
                } else {
                    Object a6 = cla0Var.a.a(new yip0("payment_widgets", ScrollPositionSurrogate.TOP, 0, true), continuation);
                    if (a6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            case 24:
                ((com.yandex.go.permission.a) obj2).b.z();
                break;
            case 25:
                com.yandex.plus.home.plaque.feature.internal.b bVar = (com.yandex.plus.home.plaque.feature.internal.b) obj2;
                pgz pgzVar = bVar.f;
                LogPriority logPriority = LogPriority.INFO;
                if (pgzVar.e(logPriority)) {
                    pgzVar.a(logPriority, "PlaqueFeatureImpl", "collect update trigger");
                }
                bVar.b(true);
                break;
            case 26:
                ((ru.yandex.taxi.plus.sdk.di.b) obj2).e.b();
                break;
            case 27:
                hl3 hl3Var3 = (hl3) obj;
                if (hl3Var3 instanceof fl3) {
                    l = new Long(((fl3) hl3Var3).a);
                } else if (!(hl3Var3 instanceof gl3)) {
                    w511.b();
                    break;
                }
                ((ru.yandex.taxi.plus.sdk.micro_widget.websdk.a) obj2).a.k(l);
                break;
            case 28:
                xhd0 xhd0Var = (xhd0) obj;
                exf0 exf0Var = (exf0) obj2;
                exf0Var.getClass();
                ((com.yandex.plus.home.plaque.feature.internal.b) exf0Var.a.getValue()).a(new omc0(xhd0Var.a, xhd0Var.b, xhd0Var.c, xhd0Var.d));
                break;
            default:
                zrd0 zrd0Var = (zrd0) obj2;
                whd0 whd0Var = (whd0) obj;
                if (whd0Var instanceof uhd0) {
                    zrd0Var.d.a();
                    break;
                } else if (whd0Var instanceof thd0) {
                    thd0 thd0Var = (thd0) whd0Var;
                    ru.yandex.taxi.plus.sdk.badge.widget.a aVar2 = zrd0Var.f;
                    String b4 = thd0Var.b();
                    if (jl40.l(b4, "TYPED_SCREEN")) {
                        String str7 = (String) thd0Var.a().get(MetaDataField.SCREEN_FIELD);
                        if (str7 != null) {
                            String str8 = (String) thd0Var.a().get("templates");
                            List W = str8 != null ? evu0.W(str8, new String[]{","}, (r2 & 4) != 0 ? 0 : 2) : null;
                            String str9 = (String) thd0Var.a().get("context");
                            if (W == null) {
                                W = EmptyList.a;
                            }
                            ru.yandex.taxi.plus.sdk.badge.widget.a.d(aVar2, new o0d0(str7, W, str9));
                            break;
                        }
                    } else if (jl40.l(b4, "URL") && (str2 = (String) thd0Var.a().get("url")) != null) {
                        ru.yandex.taxi.plus.sdk.badge.widget.a.d(aVar2, new p0d0(str2, Boolean.parseBoolean((String) thd0Var.a().get("need_auth"))));
                        break;
                    }
                } else if (whd0Var instanceof shd0) {
                    shd0 shd0Var = (shd0) whd0Var;
                    zrd0Var.getClass();
                    if (shd0Var.b() && shd0Var.a().keySet().contains("update_calculator")) {
                        stx stxVar = zrd0Var.j.a;
                        r0 r0Var = stxVar.b;
                        stxVar.a.getClass();
                        Long valueOf = Long.valueOf(System.currentTimeMillis());
                        r0Var.getClass();
                        r0Var.m(null, valueOf);
                        break;
                    }
                } else if (whd0Var instanceof vhd0) {
                    String a7 = zrd0Var.c.a();
                    n5c n5cVar = zrd0Var.b;
                    String a8 = ((vhd0) whd0Var).a();
                    r0 r0Var2 = n5cVar.a;
                    r0Var2.m(null, v4r0.i((Set) r0Var2.getValue(), new m5c(a8, a7)));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
