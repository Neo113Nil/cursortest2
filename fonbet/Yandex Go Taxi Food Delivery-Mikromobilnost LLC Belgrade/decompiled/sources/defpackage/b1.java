package defpackage;

import com.yandex.go.about.domain.BusinessNameAboutAnalytics$ActionV2;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorCardType;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorErrorType;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorTappedAction;
import com.yandex.go.benefits_center.activation.analytics.AddBenefitAnalytics$AddBenefitCloseAction;
import com.yandex.go.benefits_center.activation.analytics.AddBenefitAnalytics$AddBenefitTappedType;
import com.yandex.go.summary.analytics.CancelModalCardAnalytics$ReorderModalButton;
import com.yandex.go.summary.analytics.CancelModalCardAnalytics$ReorderModalType;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.text.Regex;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes12.dex */
public final class b1 {
    public final pho a;

    public /* synthetic */ b1(pho phoVar) {
        this.a = phoVar;
    }

    public static void a(b1 b1Var, String str, AIWidgetAnalytics$TextsEvaluatorTappedAction aIWidgetAnalytics$TextsEvaluatorTappedAction, String str2, Integer num, Integer num2, Integer num3, Integer num4, String str3, String str4, String str5, AIWidgetAnalytics$TextsEvaluatorCardType aIWidgetAnalytics$TextsEvaluatorCardType, Integer num5, AIWidgetAnalytics$TextsEvaluatorErrorType aIWidgetAnalytics$TextsEvaluatorErrorType, int i) {
        Integer num6 = (i & 8) != 0 ? null : num;
        Integer num7 = (i & 16) != 0 ? null : num2;
        Integer num8 = (i & 32) != 0 ? null : num3;
        Integer num9 = (i & 64) != 0 ? null : num4;
        String str6 = (i & 128) != 0 ? null : str3;
        String str7 = (i & 256) != 0 ? null : str4;
        String str8 = (i & 512) != 0 ? null : str5;
        AIWidgetAnalytics$TextsEvaluatorCardType aIWidgetAnalytics$TextsEvaluatorCardType2 = (i & 1024) != 0 ? null : aIWidgetAnalytics$TextsEvaluatorCardType;
        Integer num10 = (i & 2048) != 0 ? null : num5;
        AIWidgetAnalytics$TextsEvaluatorErrorType aIWidgetAnalytics$TextsEvaluatorErrorType2 = (i & 4096) == 0 ? aIWidgetAnalytics$TextsEvaluatorErrorType : null;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", str);
        if (str2 != null) {
            hashMap.put("batch_id", str2);
        }
        hashMap.put("action", aIWidgetAnalytics$TextsEvaluatorTappedAction.getEventValue());
        if (num6 != null) {
            hashMap.put("card_num", num6);
        }
        if (num7 != null) {
            hashMap.put("cards_count", num7);
        }
        if (num8 != null) {
            hashMap.put("onboarding_cards_count", num8);
        }
        if (num9 != null) {
            hashMap.put("evaluation_cards_count", num9);
        }
        if (str6 != null) {
            hashMap.put("card_text", str6);
        }
        if (str7 != null) {
            hashMap.put("shortcut_text", str7);
        }
        if (str8 != null) {
            hashMap.put("campaign_id", str8);
        }
        if (aIWidgetAnalytics$TextsEvaluatorCardType2 != null) {
            hashMap.put("card_type", aIWidgetAnalytics$TextsEvaluatorCardType2.getEventValue());
        }
        if (num10 != null) {
            hashMap.put("time_spent_ms", num10);
        }
        if (aIWidgetAnalytics$TextsEvaluatorErrorType2 != null) {
            hashMap.put("error_type", aIWidgetAnalytics$TextsEvaluatorErrorType2.getEventValue());
        }
        b1Var.a.a("AIWidget.TextsEvaluator.Tapped", hashMap, 1, new HashMap());
    }

    public static void n(b1 b1Var, String str, String str2, String str3, Long l, Double d, Double d2, Double d3, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            d = null;
        }
        if ((i & 32) != 0) {
            d2 = null;
        }
        if ((i & 64) != 0) {
            d3 = null;
        }
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        hashMap.put(ACSPConstants.STATUS, str2);
        if (str3 != null) {
            hashMap.put("error_reason", str3);
        }
        if (l != null) {
            hashMap.put(RemoteBioParameters.TIME, l);
        }
        if (d != null) {
            hashMap.put("lat", d);
        }
        if (d2 != null) {
            hashMap.put("lon", d2);
        }
        if (d3 != null) {
            hashMap.put("accuracy", d3);
        }
        b1Var.a.a("GeoRequest", hashMap, 1, new HashMap());
    }

    public void b(String str, AddBenefitAnalytics$AddBenefitCloseAction addBenefitAnalytics$AddBenefitCloseAction) {
        HashMap p = x4e.p("user_input", str);
        p.put("close_action", addBenefitAnalytics$AddBenefitCloseAction.getEventValue());
        this.a.a("AddBenefit.Closed", p, 1, new HashMap());
    }

    public void c(String str, String str2) {
        this.a.a("AddBenefit.Error", g8e.u("open_reason", str, "error_message", str2), 1, new HashMap());
    }

    public void d(String str, AddBenefitAnalytics$AddBenefitTappedType addBenefitAnalytics$AddBenefitTappedType, String str2) {
        HashMap p = x4e.p("open_reason", str);
        p.put("type", addBenefitAnalytics$AddBenefitTappedType.getEventValue());
        if (str2 != null) {
            p.put("text", str2);
        }
        this.a.a("AddBenefit.Tapped", p, 1, new HashMap());
    }

    public void e(String str, String str2, String str3, boolean z) {
        HashMap u = g8e.u(MetaDataField.SCREEN_FIELD, str, "button_type", str2);
        u.put("skip_req_destination", Boolean.valueOf(z));
        u.put("action", str3);
        this.a.a("AddressSelectionSkipButtonTap", u, 1, new HashMap());
    }

    public void f(String str, String str2) {
        HashMap p = x4e.p(CRLReasonCodeExtension.REASON, str);
        if (str2 != null) {
            p.put("api_endpoint", str2);
        }
        this.a.a("BlockedUser.Shown", p, 1, new HashMap());
    }

    public void g(BusinessNameAboutAnalytics$ActionV2 businessNameAboutAnalytics$ActionV2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", businessNameAboutAnalytics$ActionV2.getEventValue());
        HashMap hashMap2 = new HashMap();
        Regex regex = sho.a;
        this.a.a(sb2.q("Screens.BUSINESS_NAME_ABOUT." + businessNameAboutAnalytics$ActionV2, hashMap), hashMap, 2, hashMap2);
    }

    public void h(CancelModalCardAnalytics$ReorderModalType cancelModalCardAnalytics$ReorderModalType, CancelModalCardAnalytics$ReorderModalButton cancelModalCardAnalytics$ReorderModalButton, String str) {
        o("CancelModalCard.Tapped", b.i(new Pair("type", cancelModalCardAnalytics$ReorderModalType.getEventValue()), new Pair("button", cancelModalCardAnalytics$ReorderModalButton.getEventValue()), new Pair("modal_id", str)));
    }

    public void i(String str, String str2) {
        HashMap p = x4e.p("context", str);
        if (str2 != null) {
            p.put("type", str2);
        }
        this.a.a("CashbackNotification.Dismissed", p, 1, new HashMap());
    }

    public void j(String str, String str2) {
        HashMap p = x4e.p("context", str);
        if (str2 != null) {
            p.put("type", str2);
        }
        this.a.a("CashbackNotification.Shown", p, 1, new HashMap());
    }

    public void k(String str, String str2) {
        HashMap p = x4e.p("context", str);
        if (str2 != null) {
            p.put("type", str2);
        }
        this.a.a("CashbackNotification.Tapped", p, 1, new HashMap());
    }

    public void l(String str, String str2) {
        this.a.a("ChangeSourceConfirmationScreen.ShowFailed", g8e.u("source", str, "p_type", str2), 1, new HashMap());
    }

    public void m(String str, String str2, String str3) {
        HashMap p = x4e.p("button_name", str);
        if (str2 != null) {
            p.put("open_reason", str2);
        }
        if (str3 != null) {
            p.put(ClidProvider.STATE, str3);
        }
        this.a.a("DeliveryPhoneList.Tapped", p, 1, new HashMap());
    }

    public void o(String str, Map map) {
        x4e.B(this.a, str, new HashMap(map), 2);
    }
}
