package xsna;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import org.json.JSONObject;

/* compiled from: JsWebDonutBridge.kt */
/* loaded from: classes6.dex */
public interface e8y {
    @JavascriptInterface
    default void VKWebAppDonutSubscriptionPaid(String str) {
        dv3 a = a();
        if (((onx) a.b).u(JsApiMethodType.DONUT_SUBSCRIPTION_PAID, str)) {
            UserId userId = new UserId(new JSONObject(str).optLong("owner_id"));
            if (userId.b == 0) {
                return;
            }
            UserId e = fkq0.e(userId);
            if (e.b < 0) {
                t6g0.b().C(e);
            }
            Intent intent = new Intent("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
            intent.putExtra("id", userId);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            n2i0.a(context, hf8.a, intent);
            ce60.b.getClass();
            p870.f().e(143, userId);
            rpx rpxVar = new rpx(userId);
            a1w a1wVar = q1w.a;
            (a1wVar != null ? a1wVar : null).D(a, rpxVar);
        }
    }

    dv3 a();
}
