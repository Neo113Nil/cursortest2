package xsna;

import com.vk.httpexecutor.api.exceptions.SocialNetworkException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import kotlin.Pair;
import okhttp3.Interceptor;

/* compiled from: SocialNetworkInterceptor.kt */
/* loaded from: classes.dex */
public final class fek0 implements Interceptor, uz80 {
    public final dev0 a;
    public final zww b;

    public fek0(dev0 dev0Var, zww zwwVar) {
        this.a = dev0Var;
        this.b = zwwVar;
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "SocialNetwork";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.l lVar = aVar.request().a;
        String str = lVar.i;
        try {
            return aVar.a(aVar.request());
        } catch (Exception e) {
            if (this.a.isEnabled()) {
                throw e;
            }
            if (!(e instanceof UnknownHostException) && !(e instanceof ConnectException)) {
                throw e;
            }
            if (((Boolean) this.b.invoke(str)).booleanValue()) {
                throw e;
            }
            m63.b(m63.c(), "social_network_blocked", new Pair("blocked.url", str));
            throw new SocialNetworkException("You can't use host " + lVar.d + " and " + lVar.e + " for social net! Full url - " + str);
        }
    }
}
