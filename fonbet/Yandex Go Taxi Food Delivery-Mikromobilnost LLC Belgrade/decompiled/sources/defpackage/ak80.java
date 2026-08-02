package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitEnvironment;
import com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivity;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import com.yandex.fintechsdk.flows.payment.kit.internal.widget.PaymentKitWidgetImpl;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.s;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.paymentlist.details.PaymentMethodDetailsModalView;
import com.yandex.go.payments.paymentlist.domain.k;
import com.yandex.go.payments.promo.ui.PaymentPromoModalView;
import com.yandex.go.places.experiments.walkroute.OrganizationWalkingRouteExperiment;
import com.yandex.go.places.experiments.walkroute.b;
import com.yandex.go.places.impl.ui.organizations.e;
import com.yandex.go.places.impl.ui.organizations.v2.f;
import com.yandex.go.places.impl.ui.payments.info.PaymentsInfoModalView;
import com.yandex.go.places.impl.ui.sorting.OrganizationsSortingModalView;
import com.yandex.go.shortcuts.impl.view.adapter.j;
import com.yandex.messaging.input.preview.a;
import com.ybsdk.feature.partnerpayments.api.PartnerSaveScreenParams;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import com.ybsdk.feature.pdf.api.PdfLoaderScreenParams;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.PermissionSchematicComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class ak80 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ak80(ani aniVar, String str) {
        this.a = 0;
        this.b = aniVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        sp80 organizationsSortingListAdapter_delegate$lambda$0;
        String str;
        t7w intentArgs_delegate$lambda$0;
        View insetsType$lambda$0;
        zy11 _init_$lambda$1;
        Long m;
        zy11 onAttachedToWindow$lambda$0;
        zy11 _init_$lambda$0;
        int i = this.a;
        int i2 = 4;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ani aniVar = (ani) obj;
                aniVar.d0(ck80.a);
                ((xvq) aniVar.U).getClass();
                return zy11Var;
            case 1:
                View inflate = ((LayoutInflater) obj).inflate(uuh0.organization_snippet_tag_view, (ViewGroup) null, false);
                int i3 = o6h0.tag_icon;
                GoImageView goImageView = (GoImageView) cma1.O(i3, inflate);
                if (goImageView != null) {
                    i3 = o6h0.tag_text;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate);
                    if (robotoTextView != null) {
                        return new ho4((ViewGroup) inflate, (View) goImageView, (Object) robotoTextView, 12);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 2:
                return ((jbh) ((b) obj).a).e(OrganizationWalkingRouteExperiment.e);
            case 3:
                f fVar = (f) obj;
                return dac0.a(fVar.D, fVar.H, fVar.r0, fVar.I, Collections.singleton(fVar.M), new xsj(fVar, i2), fVar.s0, fVar.L, j73.f0(new e9c0[]{fVar.n0, fVar.o0, fVar.p0, fVar.m0, fVar.q0}), fVar.V.a().a(), null, HProv.ALG_TYPE_GR3410);
            case 4:
                return new xn80((yn80) obj);
            case 5:
                organizationsSortingListAdapter_delegate$lambda$0 = OrganizationsSortingModalView.organizationsSortingListAdapter_delegate$lambda$0((OrganizationsSortingModalView) obj);
                return organizationsSortingListAdapter_delegate$lambda$0;
            case 6:
                return ((e) obj).g ? scc.g(new b65(), new b65(), new b65(), new b65(), new b65(), new b65()) : scc.g(new a65(), new a65(), new a65(), new a65(), new a65(), new a65());
            case 7:
                return (xav) ((h3y) ((bu0) obj).a).get();
            case 8:
                a aVar = (a) obj;
                aVar.e = false;
                aVar.a();
                return zy11Var;
            case 9:
                PartnerSaveScreenParams partnerSaveScreenParams = (PartnerSaveScreenParams) obj;
                if (partnerSaveScreenParams instanceof PartnerSaveScreenParams.BindingParner) {
                    str = ((PartnerSaveScreenParams.BindingParner) partnerSaveScreenParams).getMemberId();
                } else {
                    if (!partnerSaveScreenParams.equals(PartnerSaveScreenParams.SelectPartner.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                    str = null;
                }
                return new ph90(str, null, null);
            case 10:
                PartnersFragment.Arguments arguments = (PartnersFragment.Arguments) obj;
                return new bj90(null, arguments.getBackVisible(), new t8j0(), arguments.getTransferScenario());
            case 11:
                ((yv90) obj).i = null;
                return zy11Var;
            case 12:
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) ((c) obj).get(Constants.KEY_DATA);
                if (bVar != null) {
                    return qcx.m(bVar);
                }
                yci0.m("Missing \"data\" field of content");
                return null;
            case 13:
                intentArgs_delegate$lambda$0 = PaymentKitActivity.intentArgs_delegate$lambda$0((PaymentKitActivity) obj);
                return intentArgs_delegate$lambda$0;
            case 14:
                insetsType$lambda$0 = PaymentMethodDetailsModalView.insetsType$lambda$0((PaymentMethodDetailsModalView) obj);
                return insetsType$lambda$0;
            case 15:
                com.yandex.go.payments.paymentlist.navigation.f fVar2 = ((k) obj).y.b;
                if (gtq0.u(fVar2)) {
                    fVar2.r(new bd90(22));
                } else {
                    xby.t(jst.e, "PAYMENTS_LIST:ON_NOT_LAUNCHED_ROUTER_CALL", new IllegalStateException(), null, 10);
                }
                return zy11Var;
            case 16:
                ((ox90) ((nw70) obj).b).c();
                return zy11Var;
            case 17:
                _init_$lambda$1 = PaymentPromoModalView._init_$lambda$1((PaymentPromoModalView) obj);
                return _init_$lambda$1;
            case 18:
                return Integer.valueOf(tje.r(mrg0.go_design_m_space, (Context) ((p370) obj).b));
            case 19:
                s sVar = (s) obj;
                com.yandex.fintechsdk.flows.payment.kit.internal.model.a aVar2 = sVar.b;
                Context context = sVar.a;
                Map f = kotlin.collections.b.f();
                gbp0 gbp0Var = sVar.c;
                jsi0 jsi0Var = new jsi0(context, aVar2);
                h5g h5gVar = aVar2.h;
                h5gVar.getClass();
                new b351();
                AdditionalSettings additionalSettings = aVar2.a;
                String str2 = aVar2.g;
                PaymentKitEnvironment paymentKitEnvironment = aVar2.d;
                Merchant merchant = aVar2.e;
                Payer payer = aVar2.f;
                String uuid = UUID.randomUUID().toString();
                String uid = payer.getUid();
                bvf0.c((uid == null || (m = bvu0.m(10, uid)) == null) ? ou11.a : new pu11(m.longValue()));
                v2a0 v2a0Var = new v2a0(str2);
                sjh sjhVar = uyj.a;
                DefaultEnvironment f2 = ha91.f(paymentKitEnvironment);
                Region region = Region.RU;
                Scenario.Widget widget = new Scenario.Widget(f, "");
                s3a0 s3a0Var = new s3a0(uuid);
                sjhVar.getClass();
                f2.getClass();
                region.getClass();
                vcg vcgVar = new vcg(new jxk(), new q151(), h5gVar, jsi0Var, additionalSettings, v2a0Var, context, sjhVar, f2, merchant, payer, widget, s3a0Var);
                PaymentKitWidgetImpl paymentKitWidgetImpl = new PaymentKitWidgetImpl(context, null, 0, 6, null);
                new com.yandex.fintechsdk.flows.payment.kit.internal.widget.e(paymentKitWidgetImpl, mdh.b, (d151) vcgVar.S.get(), f, new com.yandex.fintechsdk.flows.payment.kit.internal.widget.a((wxk) vcgVar.h0.get(), (z22) vcgVar.N.get(), sjhVar, (com.yandex.fintechsdk.adapters.divkit.sdk.impl.api.a) vcgVar.i0.get(), new com.yandex.fintechsdk.flows.payment.kit.internal.widget.b(vcgVar.b()), vcgVar.b(), widget), gbp0Var, (v351) vcgVar.W.get());
                return paymentKitWidgetImpl;
            case 20:
                ((lma0) obj).r(new qu(9));
                return zy11Var;
            case 21:
                onAttachedToWindow$lambda$0 = PaymentsInfoModalView.onAttachedToWindow$lambda$0((PaymentsInfoModalView) obj);
                return onAttachedToWindow$lambda$0;
            case 22:
                return new xqa0(rqa0.a((PdfLoaderScreenParams) obj));
            case 23:
                ((com.ybsdk.feature.pdf.internal.ui.a) obj).h0();
                return zy11Var;
            case 24:
                return (com.yandex.go.places.flex.container.domain.actions.c) ((bpw) obj).b;
            case 25:
                _init_$lambda$0 = PermissionSchematicComponent._init_$lambda$0((PermissionSchematicComponent) obj);
                return _init_$lambda$0;
            case 26:
                return ((p1b0) obj).a.Y();
            case 27:
                return kotlin.collections.a.M(((PersonalAccount.ComplementAttributes) obj).c);
            case 28:
                m5b0 m5b0Var = (m5b0) obj;
                return kotlin.collections.a.M0((List) androidx.room.util.a.b(m5b0Var.f.a, true, false, new my30(m5b0Var.a.b, 24)));
            default:
                ((j) obj).n0.setVisibility(4);
                return zy11Var;
        }
    }

    public /* synthetic */ ak80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
