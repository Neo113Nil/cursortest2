package defpackage;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class jni0 {
    public final u8w a;
    public final xcv0 b;
    public final arv0 c;

    public jni0(u8w u8wVar, xcv0 xcv0Var, arv0 arv0Var) {
        this.a = u8wVar;
        this.b = xcv0Var;
        this.c = arv0Var;
    }

    public static String a(ReferralService referralService) {
        return referralService == ReferralService.UNKNOWN ? ReferralService.TAXI.getAnalyticsName() : referralService.getAnalyticsName();
    }

    public final void b(ReferralService referralService) {
        String a = a(referralService);
        u8w u8wVar = this.a;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        if (a != null) {
            hashMap.put(Constants.KEY_SERVICE, a);
        }
        u8wVar.a.a("Main.DiscountButtonHidden", hashMap, 1, new HashMap());
    }
}
