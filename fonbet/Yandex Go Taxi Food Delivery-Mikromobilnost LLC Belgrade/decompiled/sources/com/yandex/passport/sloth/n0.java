package com.yandex.passport.sloth;

import android.net.Uri;
import android.net.http.SslError;
import defpackage.g8e;
import defpackage.gw00;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class n0 extends v0 {
    public n0(p pVar, boolean z, String str, Long l) {
        super(SlothMetricaEvent$Event.OPEN_EXTERNAL_URL, kotlin.collections.b.i(new Pair("url", Uri.parse(pVar.a).buildUpon().clearQuery().build().toString()), new Pair("uid", String.valueOf(l)), new Pair("success", String.valueOf(z)), new Pair("browser_package_name", String.valueOf(str)), new Pair("is_auth_url_required", String.valueOf(pVar.b)), new Pair("is_web_view_closed", String.valueOf(pVar.c))));
    }

    public n0(String str, Map map) {
        super(SlothMetricaEvent$Event.UI_ERROR, kotlin.collections.b.n(gw00.e(new Pair("ui_error", str)), map));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n0(SslError sslError) {
        super(r0, v0.a(sslError));
        SlothMetricaEvent$Event slothMetricaEvent$Event = SlothMetricaEvent$Event.SSL_ERROR;
        u0.c.getClass();
    }

    public n0(SlothMetricaEvent$PhoneNumberHintState slothMetricaEvent$PhoneNumberHintState, String str) {
        super(SlothMetricaEvent$Event.PHONE_NUMBER_HINT, kotlin.collections.b.i(new Pair(ClidProvider.STATE, slothMetricaEvent$PhoneNumberHintState.getStateValue()), new Pair("throwable_message", String.valueOf(str))));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n0(String str, Pair... pairArr) {
        super(r0, r3);
        Map map;
        SlothMetricaEvent$Event slothMetricaEvent$Event = SlothMetricaEvent$Event.ERROR;
        Map z = g8e.z("ui_error", str);
        if (z.isEmpty()) {
            map = kotlin.collections.b.u(pairArr);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(z);
            kotlin.collections.b.q(linkedHashMap, pairArr);
            map = linkedHashMap;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(String str, int i) {
        super(SlothMetricaEvent$Event.BLOCKER_URL, g8e.z("blocked_url", String.valueOf(str != null ? Uri.parse(str).buildUpon().clearQuery().build() : null)));
        switch (i) {
            case 3:
                super(SlothMetricaEvent$Event.ERROR, g8e.z("error", str));
                break;
            case 7:
                super(SlothMetricaEvent$Event.FALLBACK, g8e.z(CRLReasonCodeExtension.REASON, str));
                break;
            case 20:
                super(SlothMetricaEvent$Event.UI_WISH, g8e.z("ui_wish", str));
                break;
            default:
                break;
        }
    }
}
