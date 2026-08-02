package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.js.bridge.events.EventNames;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: VkBrowser.kt */
/* loaded from: classes6.dex */
public interface mfu0 {
    void A(JsApiMethodType jsApiMethodType, Throwable th);

    void B(JsMethod jsMethod);

    boolean C();

    String D(EventNames eventNames);

    void a();

    void b(Context context);

    void c(int i, Intent intent, boolean z);

    boolean d(int i);

    void destroy();

    void e(Context context);

    void f();

    void g(aj0 aj0Var, List<? extends AdvertisementType> list, WebAdConfig webAdConfig);

    s93 getState();

    void h(Bundle bundle);

    void i();

    void j(JsApiMethodType jsApiMethodType, JSONObject jSONObject);

    void k(Intent intent, boolean z);

    String l();

    void m(JsApiMethodType jsApiMethodType, VkAppsErrors.Client client, Pair<String, ? extends Object> pair, String str);

    void n(JsApiMethodType jsApiMethodType, JSONObject jSONObject);

    boolean o();

    WebView p(FrameLayout frameLayout, Bundle bundle, g680 g680Var);

    void pause();

    void q(String str);

    void r(JsApiEvent jsApiEvent, JSONObject jSONObject);

    void resume();

    void s(EventNames eventNames, bd6 bd6Var);

    boolean t(boolean z);

    void u();

    void v(String str, Map map, boolean z);

    void w();

    void x(EventNames eventNames, com.vk.superapp.base.js.bridge.a aVar);

    void y(Rect rect);

    void z(wlb0 wlb0Var);
}
