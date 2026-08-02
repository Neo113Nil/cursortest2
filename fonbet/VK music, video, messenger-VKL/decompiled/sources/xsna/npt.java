package xsna;

import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.Map;
import ru.ok.android.sdk.SharedKt;
import xsna.nhx;

/* compiled from: GetAnonymousTokenApiCommand.kt */
/* loaded from: classes.dex */
public final class npt extends nx2<String> {
    public final boolean b;
    public final VKApiExecutionException c;

    public npt(boolean z, VKApiExecutionException vKApiExecutionException) {
        this.b = z;
        this.c = vKApiExecutionException;
    }

    @Override // xsna.nx2
    public final String f(l7r0 l7r0Var) {
        VKApiExecutionException vKApiExecutionException;
        Map<String, String> z;
        String str;
        nhx.a aVar = new nhx.a();
        VKApiConfig vKApiConfig = l7r0Var.a;
        aVar.d = vKApiConfig.g;
        aVar.n = true;
        aVar.f(true);
        aVar.a(true);
        aVar.d("auth.getAnonymToken");
        aVar.b("client_id", String.valueOf(vKApiConfig.b));
        aVar.b(SharedKt.PARAM_CLIENT_SECRET, vKApiConfig.l);
        aVar.b("device_id", vKApiConfig.f.getValue());
        if (this.b && (vKApiExecutionException = this.c) != null && (z = vKApiExecutionException.z()) != null && (str = z.get(SharedKt.PARAM_ACCESS_TOKEN)) != null) {
            if (drm0.N(str)) {
                str = null;
            }
            if (str != null) {
                aVar.b("anonymous_token", str);
            }
        }
        return (String) l7r0Var.d(aVar.c(), mpt.b);
    }
}
