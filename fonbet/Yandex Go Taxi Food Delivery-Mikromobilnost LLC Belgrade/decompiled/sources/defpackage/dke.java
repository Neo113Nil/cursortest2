package defpackage;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.delivery.mapper.model.PointType;
import com.yandex.go.address.models.Address;
import com.yandex.go.delivery.tracking.l;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutButtonAction;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.CounterChange;
import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.divkit.challenger.DKChallengerFragment;
import com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment;
import com.yandex.payment.divkit.select.DKSelectFragment;
import com.yandex.payment.divkit.select.h;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelLogsView;
import com.yandex.xplat.common.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.dashboard.internal.data.dto.ScreenItemV2Dto;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.view.DashboardCardView;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.yandex.taxi.delivery.addresscorrection.DeliveryAddressCorrectionInputType;
import ru.yandex.taxi.delivery.addresscorrection.DeliveryAddressCorrectionView;
import ru.yandex.taxi.delivery.ui.form.e;
import ru.yandex.taxi.eatskit.Controller$State;
import ru.yandex.taxi.eatskit.dto.ErrorSource;
import ru.yandex.taxi.modal.LoadingModalView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final /* synthetic */ class dke implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dke(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        CheckoutButtonAction checkoutButtonAction;
        zy11 onViewCreated$lambda$2$0;
        zy11 zy11Var;
        zy11 onViewCreated$lambda$2;
        avf viewModel;
        zy11 contentDescription$lambda$2;
        zy11 showDialog$lambda$20;
        zy11 initInputField$lambda$2;
        int i = this.a;
        int i2 = 10;
        zy11 zy11Var2 = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                eke ekeVar = (eke) obj2;
                try {
                    r4 = ((Boolean) ((Method) obj3).invoke(ekeVar.a.getPackageManager(), (String) obj)).booleanValue();
                } catch (Exception e) {
                    ekeVar.b.reportError("cannot_get_permission_from_context", e);
                }
                return Boolean.valueOf(r4);
            case 1:
                ((Boolean) obj).getClass();
                clz0 clz0Var = (clz0) ((ome) obj2);
                ((lhg) obj3).b(clz0Var.i, clz0Var.h);
                clz0Var.c.b.invoke();
                return zy11Var2;
            case 2:
                rme rmeVar = (rme) obj3;
                sls slsVar = (sls) obj2;
                bb41 bb41Var = (bb41) obj;
                if (bb41Var == null) {
                    xby.d.j(new IllegalStateException("No authorizer to load url"));
                    ien h = rmeVar.h();
                    if (h != null) {
                        h.loadUrl("about:blank", b.f());
                    }
                    rmeVar.u(Controller$State.NO_AUTH);
                } else {
                    String str = rmeVar.g().g;
                    if (str == null || str.length() == 0) {
                        str = null;
                    }
                    String concat = str != null ? " promoMode/".concat(str) : null;
                    if (concat == null) {
                        concat = "";
                    }
                    ien h2 = rmeVar.h();
                    if (h2 != null) {
                        String str2 = rmeVar.d;
                        String str3 = rmeVar.e;
                        if (str3 == null) {
                            str3 = rmeVar.g().b;
                        }
                        h2.setUserAgentString(a.X(j73.A(new String[]{str2, b64.j(str3, concat), "EatsKit/29.3.0", rmeVar.g().n ? "mode/fullscreen" : null}), " ", null, null, null, 62));
                    }
                    Uri uri = (Uri) slsVar.invoke();
                    rmeVar.u(Controller$State.LOADING);
                    rmeVar.h = uri.toString();
                    ien h3 = rmeVar.h();
                    if (h3 != null) {
                        try {
                            bb41Var.a(uri.toString(), h3);
                        } catch (Exception e2) {
                            xby.d.k(e2, "Failed to load url: " + uri);
                            String message = e2.getMessage();
                            rmeVar.p(new f8o(new d6j0(null, message == null ? "" : message, null, null, 29)), ErrorSource.WEB_VIEW_CLIENT);
                        }
                    }
                }
                return zy11Var2;
            case 3:
                oay oayVar = (oay) obj3;
                ml6 ml6Var = (ml6) obj2;
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                if (((Boolean) oayVar.s.getValue()).booleanValue() || ((Boolean) oayVar.t.getValue()).booleanValue()) {
                    qam.t(c1yVar, ml6Var, 0L, 0L, 0.0f, null, 0, HProv.PP_DELETE_SAVED_PASSWD);
                }
                return zy11Var2;
            case 4:
                t0f t0fVar = (t0f) obj3;
                tls tlsVar = (tls) obj2;
                int intValue = ((Integer) obj).intValue();
                CounterChange counterChange = intValue > t0fVar.b ? CounterChange.Up : CounterChange.Down;
                int i3 = s0f.a[counterChange.ordinal()];
                if (i3 == 1) {
                    checkoutButtonAction = CheckoutButtonAction.NumericInputUp;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    checkoutButtonAction = CheckoutButtonAction.NumericInputDown;
                }
                String str4 = t0fVar.e;
                String str5 = t0fVar.h;
                String str6 = t0fVar.i;
                tlsVar.invoke(new pib(str4, intValue, counterChange, str5, str6, new nnb(checkoutButtonAction, str5, str6, str4)));
                return zy11Var2;
            case 5:
                ((nmf) obj3).b.c((oll0) obj, (List) obj2);
                return zy11Var2;
            case 6:
                onViewCreated$lambda$2$0 = CvvConfirmFragment.onViewCreated$lambda$2$0((CvvConfirmFragment) obj3, (qwl) obj2, ((Boolean) obj).booleanValue());
                return onViewCreated$lambda$2$0;
            case 7:
                zy11Var = DKBindCardFragment.setupInput$lambda$1$0((nrf) obj3, (DKBindCardFragment) obj2, ((Integer) obj).intValue());
                return zy11Var;
            case 8:
                onViewCreated$lambda$2 = DKChallengerFragment.onViewCreated$lambda$2((DKChallengerFragment) obj3, (Ref$ObjectRef) obj2, (osf) obj);
                return onViewCreated$lambda$2;
            case 9:
                DKSelectFragment dKSelectFragment = (DKSelectFragment) obj2;
                String str7 = (String) obj;
                String encodeToString = str7 != null ? Base64.encodeToString((byte[]) obj3, 2) : null;
                rwo eventReporter = dKSelectFragment.getEventReporter();
                sv90 sv90Var = qv90.a;
                boolean z = str7 != null;
                String valueOf = String.valueOf(encodeToString);
                String valueOf2 = String.valueOf(str7);
                sv90Var.getClass();
                String concat2 = c.d(0, 10, valueOf2).concat("***");
                String p = g8e.p(unr0.o(oyr.p("Отправка результата нативного челленджа: user_result = ", z ? "true" : "false", Extension.FIX_SPACE), "data = ", valueOf, Extension.FIX_SPACE), "signature = ", concat2);
                wj00 wj00Var = new wj00(0);
                wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
                wj00Var.i("user_result", z);
                wj00Var.k(Constants.KEY_DATA, valueOf);
                wj00Var.k(X509CertImpl.SIGNATURE, concat2);
                ((y22) eventReporter).a(y891.c("biometry_supply_device_challenge_result", wj00Var));
                viewModel = dKSelectFragment.getViewModel();
                viewModel.s(encodeToString, str7, str7 != null);
                return zy11Var2;
            case 10:
                h hVar = (h) obj3;
                rwo rwoVar = hVar.c;
                qv90.a.getClass();
                ((y22) rwoVar).a(iho.b(sv90.e0(), null, 3));
                r0 r0Var = hVar.P;
                eeq0 eeq0Var = new eeq0((PaymentKitError) obj2);
                r0Var.getClass();
                r0Var.m(null, eeq0Var);
                return zy11Var2;
            case 11:
                String str8 = ((zcg) obj3).a;
                String str9 = ((gdg) obj2).a;
                lio.a(str8);
                throw null;
            case 12:
                tgg tggVar = (tgg) obj3;
                n351 n351Var = (n351) obj2;
                a151 a151Var = (a151) tggVar.a.get(n351Var.a);
                if (a151Var != null) {
                    a151Var.d(n351Var);
                }
                return new te4(5, tggVar, n351Var);
            case 13:
                contentDescription$lambda$2 = DashboardCardView.setContentDescription$lambda$2((hig) obj3, (DashboardCardView) obj2, ((Boolean) obj).booleanValue());
                return contentDescription$lambda$2;
            case 14:
                ScreenItemV2Dto screenItemV2Dto = (ScreenItemV2Dto) obj;
                Object c = ((com.ybsdk.feature.divkit.api.domain.a) obj3).c(screenItemV2Dto.getDivKitData(), (yvj0) obj2);
                kotlin.b.b(c);
                return new elg((rr51) c, screenItemV2Dto.getItemType());
            case 15:
                n70 n70Var = (n70) obj3;
                zo31 zo31Var = n70Var.N;
                Context context = n70Var.P;
                ((f961) zo31Var).a.setTag(((bwz0) n70Var.Z()).c);
                f961 f961Var = (f961) n70Var.N;
                f961Var.a.setOnClickListener(new k5(27, (mjg) obj2, n70Var));
                rbv rbvVar = ((bwz0) n70Var.Z()).b;
                AppCompatImageView appCompatImageView = f961Var.a;
                v4b1.k(rbvVar, appCompatImageView, null, null, 6);
                Text text = ((bwz0) n70Var.Z()).d;
                if (text != null) {
                    appCompatImageView.setContentDescription(d.a(context, text));
                }
                appCompatImageView.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, smg0.ybsdk_click_scale_animator));
                return zy11Var2;
            case 16:
                com.ybsdk.core.utils.coroutines.a aVar = (com.ybsdk.core.utils.coroutines.a) obj3;
                if (aVar.c == ((pzt0) obj2)) {
                    aVar.c = null;
                }
                return zy11Var2;
            case 17:
                showDialog$lambda$20 = DebugPanelLogsView.showDialog$lambda$20((tls) obj3, (boolean[]) obj2, (List) obj);
                return showDialog$lambda$20;
            case 18:
                ((w030) obj3).l((LoadingModalView) obj2);
                return zy11Var2;
            case 19:
                initInputField$lambda$2 = DeliveryAddressCorrectionView.initInputField$lambda$2((DeliveryAddressCorrectionView) obj3, (DeliveryAddressCorrectionInputType) obj2, (String) obj);
                return initInputField$lambda$2;
            case 20:
                q qVar = (q) obj3;
                Address address = (Address) obj;
                ((j0g) obj2).getClass();
                String D1 = address.D1();
                PointType pointType = PointType.SOURCE;
                a0t a0tVar = new a0t(address.B().a, address.B().b, address.B().c);
                String uri2 = address.getUri();
                String str10 = address.getAddress().g;
                oo0 oo0Var = new oo0(D1, pointType, uri2, str10 == null ? "" : str10, address.d(), a0tVar, address.q0(), address.getZoneName());
                String J1 = address.J1();
                String str11 = J1 == null ? "" : J1;
                String H1 = address.H1();
                String str12 = H1 == null ? "" : H1;
                String e22 = address.e2();
                String str13 = e22 == null ? "" : e22;
                String b1 = address.b1();
                String str14 = b1 == null ? "" : b1;
                String e0 = address.e0();
                String str15 = e0 == null ? "" : e0;
                bgq0 d1 = address.d1();
                s9e s9eVar = d1 != null ? new s9e(d1.a, d1.b) : new s9e(0);
                List<fkb0> P1 = address.P1();
                ArrayList arrayList = new ArrayList(tcc.n(P1, 10));
                for (fkb0 fkb0Var : P1) {
                    arrayList.add(new kkb0(fkb0Var.a, fkb0Var.b));
                }
                qVar.invoke(new qv0(oo0Var, str11, str13, str12, str14, str15, s9eVar, arrayList, 256));
                return zy11Var2;
            case 21:
                com.yandex.go.logistics.cargo_flow.a.P((com.yandex.go.logistics.cargo_flow.a) obj3, (hu0) obj2, (Address) obj, c51.a);
                return zy11Var2;
            case 22:
                ((bmh) obj3).invoke();
                ((sls) obj2).invoke();
                return zy11Var2;
            case 23:
                l2i l2iVar = (l2i) obj3;
                c2q0 c2q0Var = (c2q0) obj;
                c2q0.a(c2q0Var, null, null, false, null, new androidx.compose.runtime.internal.a(1184249797, new tbb(21, l2iVar), true), 31);
                c2q0.a(c2q0Var, null, null, false, null, new androidx.compose.runtime.internal.a(-1653937938, new mjf(i2, l2iVar, (sls) obj2), true), 31);
                return zy11Var2;
            case 24:
                ygg yggVar = (ygg) obj3;
                q5i q5iVar = (q5i) obj2;
                Object value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    q5iVar.b(yggVar.b, new cb0(9, q5iVar, yggVar), yggVar.e);
                }
                return zy11Var2;
            case 25:
                Integer num = (Integer) obj3;
                bgq0 bgq0Var = (bgq0) obj;
                kki kkiVar = ((e) obj2).G;
                if (num != null) {
                    y5i.n(kkiVar.a, num.intValue(), e991.e(bgq0Var), null, null, null, null, null, null, 508);
                } else {
                    y5i.n(kkiVar.a, kkiVar.a.h.size() - 1, e991.e(bgq0Var), null, null, null, null, null, null, 508);
                }
                return zy11Var2;
            case 26:
                gbi gbiVar = ((e) obj3).H;
                r0i e3 = e991.e((bgq0) obj);
                hki hkiVar = ((nq) obj2).a;
                kki kkiVar2 = gbiVar.b;
                if (hkiVar instanceof gki) {
                    y5i.q(kkiVar2.a, e3, null, null, null, null, null, null, 254);
                } else {
                    if (!(hkiVar instanceof fki)) {
                        kkiVar2.getClass();
                        w511.b();
                        return null;
                    }
                    y5i.n(kkiVar2.a, ((fki) hkiVar).a, e3, null, null, null, null, null, null, 508);
                }
                return zy11Var2;
            case 27:
                l lVar = (l) obj3;
                lVar.D.b((String) obj);
                ((j970) obj2).b.invoke();
                lVar.Lg(null);
                return zy11Var2;
            case 28:
                l lVar2 = (l) obj3;
                qol0 qol0Var = (qol0) obj2;
                String str16 = (String) obj;
                if (!jl40.l(str16, WriteBlocks.OK) || lVar2.H.d() >= qol0Var.b) {
                    lVar2.D.b(str16);
                    qol0Var.d.invoke();
                    lVar2.Lg(null);
                } else {
                    qol0Var.c.invoke();
                }
                return zy11Var2;
            default:
                ((ywi) obj3).b.d((oll0) obj, (uwi) obj2);
                return zy11Var2;
        }
    }
}
