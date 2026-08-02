package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: DatabaseService.kt */
/* loaded from: classes6.dex */
public interface uwk {

    /* compiled from: DatabaseService.kt */
    public static final class a {
        public static ufx a(String str, Integer num, Integer num2, Integer num3) {
            ufx ufxVar = new ufx("database.getCities", new ir(13), new jr(9));
            if (num != null) {
                ufx.k(ufxVar, AnalyticsBaseParamsConstantsKt.COUNTRY_ID, num.intValue(), 0, 8);
            }
            if (str != null) {
                ufx.n(ufxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 12);
            }
            if (num2 != null) {
                ufx.k(ufxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 8);
            }
            if (num3 != null) {
                ufxVar.f(num3.intValue(), 0, 1000, "count");
            }
            return ufxVar;
        }

        public static /* synthetic */ xy2 b(uwk uwkVar, Integer num, String str, Integer num2, Integer num3, int i) {
            if ((i & 32) != 0) {
                num2 = null;
            }
            if ((i & 64) != 0) {
                num3 = null;
            }
            return uwkVar.c(str, num, num2, num3);
        }
    }

    ufx c(String str, Integer num, Integer num2, Integer num3);
}
