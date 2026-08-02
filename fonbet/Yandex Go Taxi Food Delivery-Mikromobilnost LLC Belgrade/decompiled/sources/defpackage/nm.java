package defpackage;

import androidx.datastore.core.f;
import com.yandex.go.agreement.router.d;
import com.yandex.go.drive.launch.e;
import com.yandex.go.drive.sdkintegration.source.DriveStoredRideSession;
import com.yandex.go.drive.sdkintegration.source.DriveStoredUserSession;
import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.overdraft.data.model.TopNotification;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.CashLikeAccount;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;
import com.yandex.go.payments.data.model.response.Kaspi;
import com.yandex.go.payments.data.model.response.MBankAccount;
import com.yandex.go.payments.data.model.response.NequiToken;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.data.model.response.SbpBindToken;
import com.yandex.go.payments.data.model.response.SbpToken;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.data.model.response.YapeToken;
import com.yandex.go.payments.data.model.response.YbWallet;
import com.yandex.go.payments.data.model.response.y1;
import com.yandex.go.payments.domain.i;
import com.yandex.go.payments.paymentlist.experiments.ForcedPaymentMethodChangeExperiment;
import com.yandex.go.payments.paymentlist.experiments.g;
import com.yandex.go.profile.domain.divkit.variables.a;
import com.yandex.go.proxyprovision.GeProxyProvisionExperiment;
import com.yandex.go.suggest.impl.presenter.c;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import com.yandex.mob.reporting.MobTrigger;
import io.appmetrica.analytics.AppMetrica;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.notifications.local.LocalNotificationItemComponent;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.statebar.controller.NotificatorReporter$MessageType;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes8.dex */
public final class nm implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x058a, code lost:
    
        if (defpackage.jl40.l(r0.f, java.lang.String.valueOf(((defpackage.fl3) r1).a)) == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x058c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x059a, code lost:
    
        if (r4 == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x059c, code lost:
    
        r0.b.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x05a3, code lost:
    
        if ((r1 instanceof defpackage.fl3) == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x05a5, code lost:
    
        r1 = (defpackage.fl3) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x05a9, code lost:
    
        if (r1 == null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x05ab, code lost:
    
        r6 = java.lang.Long.valueOf(r1.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x05b1, code lost:
    
        r0.f = java.lang.String.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:?, code lost:
    
        return defpackage.zy11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x05a8, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0597, code lost:
    
        if (((defpackage.gl3) r1).a == false) goto L216;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c6  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Object f;
        PaymentMethod$Type a;
        PaymentMethod$Type paymentMethod$Type;
        Object obj2;
        c cVar;
        boolean z = false;
        Long l = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        lv90 lv90Var = null;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                mm mmVar = (mm) obj;
                a aVar = (a) this.b;
                aVar.getClass();
                aVar.b(new u131("superapp.profile.is_authorized", mmVar.a), new z131("superapp.profile.name", mmVar.b), new z131("superapp.profile.contact", mmVar.c));
                return zy11.a;
            case 1:
                ru.yandex.taxi.linked_order.a aVar2 = (ru.yandex.taxi.linked_order.a) this.b;
                aVar2.n = (loy) obj;
                aVar2.f();
                return zy11.a;
            case 2:
                tk1 tk1Var = (tk1) obj;
                com.yandex.go.agreement.domain.a aVar3 = (com.yandex.go.agreement.domain.a) this.b;
                if (!gtq0.u((d) aVar3.g.getValue())) {
                    hst hstVar = jst.e;
                    tk1Var.getClass();
                    dd a2 = tk1Var.a();
                    if (a2 != null) {
                        a2.a();
                    }
                    hstVar.getClass();
                    ((pep0) aVar3.b).f((d) aVar3.g.getValue(), tk1Var, hxx.a);
                }
                return zy11.a;
            case 3:
                Object c = ((j) this.b).i().c(((Boolean) obj).booleanValue(), continuation);
                return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
            case 4:
                GeProxyProvisionExperiment geProxyProvisionExperiment = (GeProxyProvisionExperiment) obj;
                if (geProxyProvisionExperiment.b) {
                    z2 = geProxyProvisionExperiment.h;
                } else {
                    ((com.yandex.go.proxyprovision.a) this.b).b.getClass();
                }
                jst.e.getClass();
                AppMetrica.setDataSendingEnabled(z2);
                return zy11.a;
            case 5:
                ((com.yandex.quark.webchat.observers.a) this.b).b.invoke();
                return zy11.a;
            case 6:
                hl3 hl3Var = (hl3) obj;
                un3 un3Var = (un3) this.b;
                un3Var.d.a("AuthorizationStateInteractor", "onAccountStateChanged()", null);
                if (!(hl3Var instanceof fl3)) {
                    if (!(hl3Var instanceof gl3)) {
                        w511.b();
                        return null;
                    }
                    break;
                } else {
                    break;
                }
            case 7:
                String str = ((ym20) obj).a;
                Object c2 = ((com.yandex.mob.domain.d) this.b).c(MobTrigger.ContourChanged, true, true, continuation);
                return c2 == CoroutineSingletons.COROUTINE_SUSPENDED ? c2 : zy11.a;
            case 8:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mn4 mn4Var = (mn4) this.b;
                if (booleanValue) {
                    cma1.L(mn4Var.a);
                } else {
                    cma1.J(mn4Var.a);
                }
                return zy11.a;
            case 9:
                return i.d((i) this.b, (String) obj, continuation);
            case 10:
                ((Boolean) obj).getClass();
                com.yandex.go.blockeduser.c cVar2 = (com.yandex.go.blockeduser.c) this.b;
                g46 g46Var = cVar2.f;
                if (g46Var == null || !gtq0.u(g46Var)) {
                    g46 g46Var2 = (g46) cVar2.e.get();
                    cVar2.f = g46Var2;
                    oep0.b(cVar2.c, g46Var2);
                }
                return zy11.a;
            case 11:
                zy11 zy11Var = zy11.a;
                f fVar = (f) this.b;
                return ((fVar.h.a() instanceof g6r) || (f = f.f(fVar, true, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? zy11Var : f;
            case 12:
                com.yandex.go.overdraft.domain.d dVar = (com.yandex.go.overdraft.domain.d) this.b;
                dVar.getClass();
                for (TopNotification topNotification : (List) obj) {
                    String d = topNotification.getD();
                    String a3 = d != null ? ((m7x0) dVar.f).a(d) : null;
                    aug augVar = dVar.e;
                    String a4 = topNotification.getA();
                    cne0 cne0Var = augVar.a;
                    Set M0 = kotlin.collections.a.M0(cne0Var.n("NOTIFICATIONS"));
                    M0.add(a4);
                    cne0Var.t("NOTIFICATIONS", M0);
                    LocalNotificationItemComponent localNotificationItemComponent = new LocalNotificationItemComponent(dVar.a, null, 0, 6, null);
                    x3z x3zVar = new x3z();
                    x3zVar.e(topNotification.getC());
                    x3zVar.d(topNotification.getA());
                    x3zVar.g(topNotification.getB());
                    x3zVar.c(a3);
                    localNotificationItemComponent.init(x3zVar.a(), dVar.g);
                    dVar.d.e(localNotificationItemComponent);
                    localNotificationItemComponent.startExpiresTimer(5000L);
                    localNotificationItemComponent.setExpiresListener(new qn5(4, dVar, topNotification));
                    yy80 yy80Var = dVar.i;
                    String e = topNotification.getE();
                    Screen b = dVar.h.b();
                    jc4 jc4Var = yy80Var.h;
                    String a5 = yy80.a(b);
                    String str2 = "";
                    if (e == null) {
                        e = "";
                    }
                    boolean z3 = yy80Var.d().c;
                    boolean e2 = yy80Var.e();
                    boolean f2 = yy80Var.f();
                    String str3 = (String) kotlin.collections.a.R(yy80Var.d().b);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    jc4Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(MetaDataField.SCREEN_FIELD, a5);
                    hashMap.put(ACSPConstants.STATUS, e);
                    oo31.q(z3, hashMap, "has_overdraft", e2, "is_card_available");
                    hashMap.put("is_cash_available", Boolean.valueOf(f2));
                    hashMap.put("order_id", str2);
                    jc4Var.a.a("DebtPaymentNotification.Shown", hashMap, 1, new HashMap());
                }
                return zy11.a;
            case 13:
                ((com.yandex.quark.lite.supportedfeatures.a) this.b).a.k((Set) obj);
                return zy11.a;
            case 14:
                ((e) this.b).a((yb20) obj);
                return zy11.a;
            case 15:
                jnt jntVar = (jnt) obj;
                com.yandex.go.drive.sdkintegration.domain.session.e eVar = (com.yandex.go.drive.sdkintegration.domain.session.e) this.b;
                tfm tfmVar = eVar.a;
                Long valueOf = Long.valueOf(tfmVar.a.d());
                String Hg = ((h) tfmVar.b).Hg();
                List<fnt> list = jntVar.a;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (fnt fntVar : list) {
                    arrayList.add(new DriveStoredRideSession(fntVar.f(), fntVar.e(), fntVar.g(), fntVar.d(), fntVar.c(), fntVar.a(), fntVar.b(), fntVar.h().ordinal()));
                }
                tfmVar.d.b(new DriveStoredUserSession(valueOf, Hg, arrayList));
                r0 r0Var = (r0) eVar.b();
                r0Var.getClass();
                r0Var.m(null, jntVar);
                return zy11.a;
            case 16:
                Pair pair = (Pair) obj;
                DynamicFeature dynamicFeature = (DynamicFeature) pair.getFirst();
                boolean booleanValue2 = ((Boolean) pair.getSecond()).booleanValue();
                com.yandex.go.dynamic.impl.domain.interactror.a aVar4 = (com.yandex.go.dynamic.impl.domain.interactror.a) this.b;
                if (booleanValue2) {
                    g7n g7nVar = aVar4.b;
                    String id = dynamicFeature.getId();
                    g7nVar.b.l(null);
                    g7nVar.a.f(id);
                } else {
                    g7n g7nVar2 = aVar4.b;
                    String id2 = dynamicFeature.getId();
                    g7nVar2.b.l(null);
                    g7nVar2.a.e(id2);
                }
                return zy11.a;
            case 17:
                ((com.yandex.go.order.external.tracking.h) this.b).a.c((m2e0) obj);
                return zy11.a;
            case 18:
                ru.yandex.taxi.persuggest.source.f fVar2 = (ru.yandex.taxi.persuggest.source.f) this.b;
                FinalSuggestScreen finalSuggestScreen = (FinalSuggestScreen) obj;
                int i = x6r.a[finalSuggestScreen.ordinal()];
                if (i == 1) {
                    fVar2.a();
                } else if (i != 2) {
                    fVar2.c(finalSuggestScreen);
                } else {
                    fVar2.b();
                }
                return zy11.a;
            case 19:
                ((Collection) this.b).add(obj);
                return zy11.a;
            case 20:
                Pair pair2 = (Pair) obj;
                ForcedPaymentMethodChangeExperiment forcedPaymentMethodChangeExperiment = (ForcedPaymentMethodChangeExperiment) pair2.getFirst();
                PaymentMethods paymentMethods = (PaymentMethods) pair2.getSecond();
                g gVar = (g) this.b;
                fga0 fga0Var = gVar.f;
                i3y i3yVar = gVar.i;
                if (forcedPaymentMethodChangeExperiment.b && !gVar.c.g() && !gVar.e.e()) {
                    String str4 = forcedPaymentMethodChangeExperiment.c;
                    if (!evu0.J(str4) && !((cne0) i3yVar.getValue()).n("forced_payment_method_change_applied_ids").contains(str4) && (a = fga0Var.c().a()) != null && forcedPaymentMethodChangeExperiment.e.contains(a) && (paymentMethod$Type = forcedPaymentMethodChangeExperiment.d) != null) {
                        switch (r2s.a[paymentMethod$Type.ordinal()]) {
                            case 1:
                                lv90Var = lv90.f;
                                if (lv90Var != null) {
                                    gVar.g.b(lv90Var);
                                    Set M02 = kotlin.collections.a.M0(((cne0) i3yVar.getValue()).n("forced_payment_method_change_applied_ids"));
                                    M02.add(str4);
                                    ((cne0) i3yVar.getValue()).t("forced_payment_method_change_applied_ids", M02);
                                    break;
                                }
                                break;
                            case 2:
                                kv90 kv90Var = lv90.Companion;
                                PaymentMethod$Type paymentMethod$Type2 = PaymentMethod$Type.GOOGLE_PAY;
                                kv90Var.getClass();
                                lv90Var = kv90.b(null, paymentMethod$Type2);
                                if (lv90Var != null) {
                                }
                                break;
                            case 3:
                                Card card = (Card) kotlin.collections.a.R(paymentMethods.a.a);
                                if (card != null) {
                                    lv90Var = sa91.a(card);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 4:
                                CashLikeAccount cashLikeAccount = (CashLikeAccount) kotlin.collections.a.R(paymentMethods.b.a);
                                if (cashLikeAccount != null) {
                                    lv90Var = sa91.a(cashLikeAccount);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 5:
                                CorpAccount corpAccount = (CorpAccount) kotlin.collections.a.R(paymentMethods.c.a);
                                if (corpAccount != null) {
                                    lv90Var = sa91.a(corpAccount);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 6:
                                DeliveryPaymentMethod deliveryPaymentMethod = (DeliveryPaymentMethod) kotlin.collections.a.R(paymentMethods.d.a);
                                if (deliveryPaymentMethod != null) {
                                    lv90Var = sa91.a(deliveryPaymentMethod);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 7:
                                MBankAccount mBankAccount = paymentMethods.r.a;
                                if (mBankAccount != null) {
                                    lv90Var = sa91.a(mBankAccount);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 8:
                                NequiToken nequiToken = (NequiToken) kotlin.collections.a.R(paymentMethods.c());
                                if (nequiToken != null) {
                                    lv90Var = sa91.a(nequiToken);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 9:
                                PersonalAccount personalAccount = (PersonalAccount) kotlin.collections.a.R(paymentMethods.e.a);
                                if (personalAccount != null) {
                                    lv90Var = sa91.a(personalAccount);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 10:
                                SbpToken sbpToken = (SbpToken) kotlin.collections.a.R(paymentMethods.q.a);
                                if (sbpToken != null) {
                                    lv90Var = sa91.a(sbpToken);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 11:
                                Iterator it = paymentMethods.f.b.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (((SharedAccount) obj2).getE()) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                SharedAccount sharedAccount = (SharedAccount) obj2;
                                if (sharedAccount != null) {
                                    lv90Var = sa91.a(sharedAccount);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 12:
                                y1 y1Var = (y1) kotlin.collections.a.R(paymentMethods.h.a);
                                if (y1Var != null) {
                                    lv90Var = sa91.a(y1Var);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 13:
                                YapeToken yapeToken = (YapeToken) kotlin.collections.a.R(paymentMethods.d());
                                if (yapeToken != null) {
                                    lv90Var = sa91.a(yapeToken);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 14:
                                YbWallet ybWallet = (YbWallet) kotlin.collections.a.R(paymentMethods.g.a);
                                if (ybWallet != null) {
                                    lv90Var = sa91.a(ybWallet);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 15:
                                SbpBindToken sbpBindToken = (SbpBindToken) kotlin.collections.a.R(paymentMethods.e());
                                if (sbpBindToken != null) {
                                    lv90Var = sa91.a(sbpBindToken);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 16:
                                Kaspi kaspi = (Kaspi) kotlin.collections.a.R(paymentMethods.b());
                                if (kaspi != null) {
                                    lv90Var = sa91.a(kaspi);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                                String q = fga0Var.q(paymentMethod$Type);
                                if (q != null) {
                                    lv90.Companion.getClass();
                                    lv90Var = kv90.b(q, paymentMethod$Type);
                                }
                                if (lv90Var != null) {
                                }
                                break;
                            case 21:
                            case 22:
                            case 23:
                                if (lv90Var != null) {
                                }
                                break;
                            default:
                                w511.b();
                                return null;
                        }
                    }
                }
                return zy11.a;
            case 21:
                cVar = ((FullscreenSuperappSuggestModalView) this.b).presenter;
                String a6 = vks.a((String) obj);
                cVar.D.c(a6);
                if (evu0.J(a6)) {
                    cVar.A.b();
                }
                ca01 ca01Var = cVar.U.b;
                if (ca01Var != null) {
                    ca01Var.h(a6);
                }
                return zy11.a;
            case 22:
                ((gls) this.b).render((fls) obj);
                return zy11.a;
            case 23:
                ((ru.yandex.taxi.inapp_calls.a) this.b).f();
                return zy11.a;
            case 24:
                ((Number) obj).intValue();
                ((yrw) this.b).d();
                return zy11.a;
            case 25:
                ru.yandex.taxi.statebar.controller.a aVar5 = (ru.yandex.taxi.statebar.controller.a) this.b;
                a160 a160Var = (a160) obj;
                if (a160Var instanceof y060) {
                    y060 y060Var = (y060) a160Var;
                    ru.yandex.taxi.statebar.controller.a.h(aVar5, y060Var.a, y060Var.b);
                } else {
                    if (!jl40.l(a160Var, z060.a)) {
                        w511.b();
                        return null;
                    }
                    if (aVar5.e()) {
                        aVar5.q = true;
                        if (aVar5.e() && !aVar5.s) {
                            aVar5.k.a("improper", NotificatorReporter$MessageType.NETWORK_ERROR);
                        }
                        aVar5.f();
                    }
                }
                return zy11.a;
            case 26:
                s10 s10Var = ((ru.yandex.taxi.linked_order.interactor.e) this.b).a;
                EmptyList emptyList = EmptyList.a;
                r0 r0Var2 = s10Var.a;
                r0Var2.getClass();
                r0Var2.m(null, emptyList);
                return zy11.a;
            case 27:
                ((Boolean) obj).getClass();
                sjy sjyVar = (sjy) this.b;
                pzt0 pzt0Var = sjyVar.g;
                if (pzt0Var == null || !pzt0Var.isCancelled()) {
                    pzt0 pzt0Var2 = sjyVar.g;
                    if (pzt0Var2 != null) {
                        pzt0Var2.a(null);
                    }
                    sjyVar.a(new qjy());
                }
                return zy11.a;
            case 28:
                zy11 zy11Var2 = zy11.a;
                n nVar = ((x6z) this.b).a;
                if (nVar.a.isLocationEnabled()) {
                    nVar.f.g(zy11Var2);
                } else {
                    n0 n0Var = nVar.g;
                    LocationRequirementsException.Companion.getClass();
                    n0Var.g(ru.yandex.taxi.systemrequeirements.location.e.c());
                }
                return zy11Var2;
            default:
                t61 t61Var = ((ru.yandex.taxi.systemrequeirements.location.d) this.b).b.a;
                t61Var.getClass();
                t61Var.a.a("GeolocationCard.Shown", new HashMap(), 1, new HashMap());
                return zy11.a;
        }
    }
}
