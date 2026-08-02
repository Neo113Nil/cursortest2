package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.flex.common.api.actions.DeeplinkNavigationAction;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.CurrentAddressModalExperiment;
import com.yandex.go.payments.cards.experiments.CreditCard3dsVerificationRetryPollicyExperiment;
import com.yandex.go.payments.cards.experiments.b;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment$AndroidCreateAccountUtmRecord$$serializer;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.b0;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.t;
import com.yandex.go.shortcuts.dto.request.Counters;
import com.yandex.go.shortcuts.dto.request.Seen$$serializer;
import com.yandex.go.shortcuts.dto.request.a;
import com.yandex.go.taxi.order.db.DbOrderImpl$Data;
import com.yandex.go.taxi.order.models.api.TaxiOrder$$serializer;
import com.yandex.go.zone.dto.objects.CustomEndpoint;
import com.yandex.go.zone.dto.objects.j0;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import java.lang.annotation.Annotation;
import java.util.SimpleTimeZone;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;

/* loaded from: classes8.dex */
public final /* synthetic */ class cue implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ cue(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                t tVar = CorpAccountFlowExperiment.CreateAccountUtm.Companion;
                return new p53(CorpAccountFlowExperiment$AndroidCreateAccountUtmRecord$$serializer.INSTANCE, 0);
            case 1:
                b0 b0Var = CorpAccountFlowExperiment.WebViewPersonalAccount.Companion;
                return new p53(auu0.a, 0);
            case 2:
                a aVar = Counters.Companion;
                return new p53(Seen$$serializer.INSTANCE, 0);
            case 3:
                d5f d5fVar = e5f.Companion;
                return new p53(f5f.a, 0);
            case 4:
                b bVar = CreditCard3dsVerificationRetryPollicyExperiment.Companion;
                return CreditCard3dsVerificationRetryPollicyExperiment.SuccessVerificationPolicy.Companion.serializer();
            case 5:
                return vez0.g("com.yandex.go.payments.cards.experiments.CreditCard3dsVerificationRetryPollicyExperiment.SuccessVerificationPolicy", CreditCard3dsVerificationRetryPollicyExperiment.SuccessVerificationPolicy.values(), new String[]{"success_redirect_url", "polling"}, new Annotation[][]{null, null});
            case 6:
                com.yandex.go.mainscreen.superapp.impl.header.experiment.a aVar2 = CurrentAddressModalExperiment.Companion;
                return CurrentAddressModalExperiment.OnMapClickActionType.Companion.serializer();
            case 7:
                com.yandex.go.mainscreen.superapp.impl.header.experiment.a aVar3 = CurrentAddressModalExperiment.Companion;
                return new p53(h6w.a, 0);
            case 8:
                com.yandex.go.mainscreen.superapp.impl.header.experiment.a aVar4 = CurrentAddressModalExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 9:
                return vez0.g("com.yandex.go.mainscreen.superapp.impl.header.experiment.CurrentAddressModalExperiment.OnMapClickActionType", CurrentAddressModalExperiment.OnMapClickActionType.values(), new String[]{"select_on_map", "open_suggested_addresses", null}, new Annotation[][]{null, null, null});
            case 10:
                fgf fgfVar = ggf.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 11:
                qhf qhfVar = rhf.Companion;
                return new p53(wxq0.a, 0);
            case 12:
                qhf qhfVar2 = rhf.Companion;
                return new p53(h48.a, 0);
            case 13:
                j0 j0Var = CustomEndpoint.Companion;
                return CustomEndpoint.Type.Companion.serializer();
            case 14:
                return vez0.g("com.yandex.go.zone.dto.objects.CustomEndpoint.Type", CustomEndpoint.Type.values(), new String[]{"route", null}, new Annotation[][]{null, null});
            case 15:
                pfg pfgVar = DarkThemeSwitchExperiment.Companion;
                return DarkThemeSwitchExperiment.ThemeDefaultSetting.Companion.serializer();
            case 16:
                return vez0.g("ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment.ThemeDefaultSetting", DarkThemeSwitchExperiment.ThemeDefaultSetting.values(), new String[]{"on", "off", "system"}, new Annotation[][]{null, null, null});
            case 17:
                i3y i3yVar = skd0.a;
                return skd0.a(PlusLogTag.SDK);
            case 18:
                return new t821();
            case 19:
                return new com.yandex.plus.home.payment.google.b(0);
            case 20:
                SimpleTimeZone simpleTimeZone = drg.c;
                return Pattern.compile("^([+-]?\\d{4}(?!\\d{2}\\b))((-?)((0[1-9]|1[0-2])(\\3([12]\\d|0[1-9]|3[01]))?|W([0-4]\\d|5[0-2])-?([1-7])?|(00[1-9]|0[1-9]\\d|[12]\\d{2}|3([0-5]\\d|6[1-6])))([T\\s]((([01]\\d|2[0-3])((:?)[0-5]\\d)?|24:?00)([.,]\\d+(?!:))?)?(\\17[0-5]\\d([.,]\\d+)?)?([zZ]|([+-])([01]\\d|2[0-3]):?([0-5]\\d)?)?)?)?$");
            case 21:
                SimpleTimeZone simpleTimeZone2 = drg.c;
                return Pattern.compile("^([zZ]|([+-])([01]\\d|2[0-3]):?([0-5]\\d)?)$");
            case 22:
                return "Deserialization error";
            case 23:
                com.yandex.go.taxi.order.db.a aVar5 = DbOrderImpl$Data.Companion;
                return new p53(TaxiOrder$$serializer.INSTANCE, 1);
            case 24:
                com.yandex.go.taxi.order.db.a aVar6 = DbOrderImpl$Data.Companion;
                return new p53(auu0.a, 1);
            case 25:
                com.yandex.go.taxi.order.db.a aVar7 = DbOrderImpl$Data.Companion;
                return new k8u(auu0.a, nv70.a, 1);
            case 26:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 27:
                return DeeplinkNavigationAction.Companion.serializer();
            case 28:
                return scc.g(new Pair(hz00.y, "promocodes"), new Pair(ui.e, "add_promocode"), new Pair(ui.c, "add_creditcard"), new Pair(mfi.m, "favorites"), new Pair(vzv0.h, "deeplink_tips"), new Pair(mfi.j, "email"), new Pair(hz00.C, "promocodes"), new Pair(ui.j, "deeplink_auth"), new Pair(vzv0.y, "deeplink_auth"), new Pair(hz00.t, "creditcards_list"), new Pair(frl0.x, "shared_account"), new Pair(frl0.b, "safety_center_main"), new Pair(frl0.c, "safety_center_instructions"), new Pair(ui.b, "safety_center_car_crash_status"), new Pair(mfi.k, "deeplink_eulas_agreement"), new Pair(vzv0.v, "plusPromo"), new Pair(ui.p, "CashbackCard"), new Pair(ui.n, "CashbackCard"), new Pair(hz00.w, "CashbackCard"), new Pair(vzv0.l, "CashbackCard"), new Pair(ui.B, "CashbackCard"), new Pair(vzv0.o, "deeplink_user_rating"), new Pair(vzv0.u, "deeplink_auth"), new Pair(vzv0.t, "yandex_bank"), new Pair(vzv0.f, "TaxiOnTheWay"));
            default:
                return j73.f0(new String[]{"ya.ru", "yandex.ru", "yandex.kz", "yandex.by", "yandex.uz", "yandex.com", "yandex.net", "yango.com", "yandex-team.ru", "go.yandex", "lavka.yandex", "bookmate.ru", "kinopoisk.ru", "yandexplusxiaomi.ru", Constants.AUTHORITY, "mango.rocks", "clck.ru", "app.link", "onelink.me", "adj.st", "bit.ly", "t.me", "vk.com", "x5paket.ru", "wind.go.link", "plus.foxford.ru", "beeline.ru", "hcb.kz", "s7.ru", "activ.kz", "kcell.co", "activ.mobi", "altel.kz", "bee.gg", "beeline.kz", "beeline.uz", "beltelecom.by", "dom.ru", "life.com.by", "megafon.ru", "moldcell.md", "mts.ru", "o.kg", "tele2.ru", "tele2.kz", "ucell.uz", "yota.ru", "x5id.ru", "x5.ru", "maam.family", "zebrainy.net", "apple.com", "kubokot.com", "yastat.net", "yastatic.net", "doubleclick.net", "userecho.com", "yaboard.com", "funtechservices.com"});
        }
    }
}
