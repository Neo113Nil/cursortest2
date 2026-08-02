package defpackage;

import com.yandex.payment.divkit.DivTemplateNames;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a5j0 {
    public final DivCardForAnalytics a;
    public final String b;
    public final JSONObject c;

    public a5j0(DivCardForAnalytics divCardForAnalytics, JSONObject jSONObject, int i) {
        String language = Locale.getDefault().getLanguage();
        jSONObject = (i & 4) != 0 ? new JSONObject() : jSONObject;
        this.a = divCardForAnalytics;
        this.b = language;
        this.c = jSONObject;
    }

    public final JSONObject a() {
        DivTemplateNames divTemplateNames;
        JSONObject jSONObject = new JSONObject();
        switch (yel.a[this.a.ordinal()]) {
            case 1:
                divTemplateNames = DivTemplateNames.SELECT;
                break;
            case 2:
                divTemplateNames = DivTemplateNames.CVV;
                break;
            case 3:
                divTemplateNames = DivTemplateNames.BANK_SELECT;
                break;
            case 4:
                divTemplateNames = DivTemplateNames.EXIT;
                break;
            case 5:
                divTemplateNames = DivTemplateNames.SBP_LICENSE;
                break;
            case 6:
                divTemplateNames = DivTemplateNames.SBP_CHALLENGER;
                break;
            case 7:
                divTemplateNames = DivTemplateNames.CARD_INPUT_SCREEN;
                break;
            case 8:
                divTemplateNames = DivTemplateNames.RESULT;
                break;
            default:
                ny61.g("Unsupported DivCardForAnalytics value");
                return null;
        }
        return jSONObject.put("template", divTemplateNames.getValue()).put("lang", this.b).put(Constants.KEY_DATA, this.c);
    }
}
