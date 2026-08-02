package xsna;

import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.base.js.bridge.data.VKWebAppPermission;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import xsna.mgn0;

/* compiled from: VkUiPresenter.kt */
/* loaded from: classes6.dex */
public interface xwv0 {
    void B(boolean z);

    void C(WebApiApplication webApiApplication);

    String D();

    void D1(tb0 tb0Var);

    VkBridgeAnalytics E();

    void F();

    WebAdConfig H();

    boolean I();

    boolean K();

    boolean L();

    qfu0 M();

    void N();

    void O(yvv0 yvv0Var);

    List<k1w0> Q();

    void R(List<? extends VKWebAppPermission> list);

    boolean S();

    ux90 T();

    String T0();

    boolean U(String str, String str2, boolean z);

    void V();

    boolean W();

    io.reactivex.rxjava3.disposables.c X(io.reactivex.rxjava3.disposables.c cVar);

    mgn0.c Y();

    boolean Z();

    String a();

    Integer a0();

    void b(boolean z);

    String c();

    String e();

    void e3(tb0 tb0Var);

    boolean f();

    boolean g();

    long getAppId();

    String getUserAgent();

    VkUiView getView();

    boolean h();

    void h2();

    boolean i();

    Map<String, String> j();

    void k(boolean z);

    String l();

    boolean o();

    void p(String str);

    boolean q();

    boolean r();

    boolean s();

    WebApiApplication t();

    String u();

    WebApiApplication v();

    io.reactivex.rxjava3.disposables.c w(io.reactivex.rxjava3.disposables.c cVar);

    String x(JSONObject jSONObject);

    Long y();
}
