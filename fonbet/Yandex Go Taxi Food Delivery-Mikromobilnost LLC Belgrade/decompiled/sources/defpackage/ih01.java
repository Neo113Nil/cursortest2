package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ih01 {
    public final pho a;

    public void a(Integer num, String str, String str2) {
        HashMap hashMap = new HashMap();
        if (num != null) {
            hashMap.put(AuthSdkActivity.RESPONSE_TYPE_CODE, num);
        }
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        if (str2 != null) {
            hashMap.put("route_id", str2);
        }
        this.a.a("TransportRouteCard.Loaded", hashMap, 1, new HashMap());
    }
}
