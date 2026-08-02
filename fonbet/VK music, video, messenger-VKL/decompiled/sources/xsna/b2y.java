package xsna;

import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.List;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class b2y implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i2y c;
    public final /* synthetic */ long d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Long f;
    public final /* synthetic */ JsApiMethodType g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ b2y(long j, JsApiMethodType jsApiMethodType, Long l, List list, i2y i2yVar, boolean z, boolean z2) {
        this.b = z;
        this.c = i2yVar;
        this.d = j;
        this.e = list;
        this.f = l;
        this.g = jsApiMethodType;
        this.h = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        JSONObject b;
        fvv0 M;
        gvv0 view;
        i2y i2yVar = this.c;
        x6y x6yVar = i2yVar.a;
        Throwable th = (Throwable) obj;
        Throwable cause = th.getCause();
        if (cause == null) {
            cause = th;
        }
        boolean z = this.b;
        JsApiMethodType jsApiMethodType = this.g;
        if (!z) {
            WebApiApplication webApiApplication = null;
            VKWebAuthException vKWebAuthException = cause instanceof VKWebAuthException ? (VKWebAuthException) cause : null;
            if (vKWebAuthException != null && vKWebAuthException.l()) {
                if (jgn0.c()) {
                    bex0.a.a(x6yVar, jsApiMethodType, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                } else {
                    try {
                        fvv0 M2 = x6yVar.M();
                        if (M2 != null) {
                            webApiApplication = M2.t();
                        }
                    } catch (Throwable unused) {
                    }
                    WebApiApplication webApiApplication2 = webApiApplication;
                    if (webApiApplication2 != null && (M = x6yVar.M()) != null && (view = M.getView()) != null) {
                        long j = this.d;
                        Long l = this.f;
                        view.y4(this.e, l, webApiApplication2, new h2y(i2yVar, j, jsApiMethodType, l, this.h, x6yVar));
                    }
                }
                return s3q0.a;
            }
        }
        if (cause instanceof VKWebAuthException) {
            VKWebAuthException vKWebAuthException2 = (VKWebAuthException) cause;
            String d = vKWebAuthException2.d();
            if (d == null) {
                d = "";
            }
            String g = vKWebAuthException2.g();
            if (g == null) {
                g = "";
            }
            String h = vKWebAuthException2.h();
            b = VkAppsErrors.c(g, d, h != null ? h : "");
        } else {
            b = VkAppsErrors.b(th);
        }
        x6yVar.A(jsApiMethodType, b);
        return s3q0.a;
    }
}
