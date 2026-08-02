package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vkontakte.android.R;

/* compiled from: EsiaSettings.kt */
/* loaded from: classes4.dex */
public final class nxp {
    public final Context a;
    public final String b;
    public final String c;

    public nxp(Context context) {
        this.a = context;
        Bundle a = gnj.a(context);
        r55 r55Var = r55.a;
        umu0 umu0Var = r55.g;
        (umu0Var == null ? null : umu0Var).s.getClass();
        o2l.a.getClass();
        if (o2l.b("__dbg_use_esia_test_domain", false)) {
            this.b = sxc0.c(a, "com.vk.oauth.esia.TEST_CLIENT_ID");
            this.c = sxc0.c(a, "com.vk.oauth.esia.TEST_AUTH_URI");
        } else {
            this.b = sxc0.c(a, "com.vk.oauth.esia.OAUTH_CLIENT_ID");
            this.c = "https://esia.gosuslugi.ru/aas/oauth2/ac";
        }
    }

    public final Uri a() {
        Uri.Builder builder = new Uri.Builder();
        Context context = this.a;
        Uri build = builder.scheme(context.getPackageName()).authority(context.getString(R.string.vk_esia_redirect_host)).build();
        return er.a(HttpRequest.DEFAULT_SCHEME).encodedAuthority(dgn0.g()).path("esia_client_redirect").encodedQuery("to=" + build + "&vk_external_client_id=" + this.b).build();
    }
}
