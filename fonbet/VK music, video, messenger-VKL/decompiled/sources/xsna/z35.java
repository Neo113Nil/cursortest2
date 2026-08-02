package xsna;

import android.os.Bundle;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.silentauth.SilentAuthInfo;
import com.vk.superapp.api.exceptions.AuthException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z35 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z35(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                VkAuthMetaInfo vkAuthMetaInfo = (VkAuthMetaInfo) obj2;
                Throwable th = (Throwable) obj;
                if (!(th instanceof AuthException.NeedSilentAuthException)) {
                    return io.reactivex.rxjava3.core.q.H(th);
                }
                AuthException.NeedSilentAuthException needSilentAuthException = (AuthException.NeedSilentAuthException) th;
                SilentAuthInfo a = SilentAuthInfo.a(bnj0.c(bnj0.a, needSilentAuthException.g(), needSilentAuthException.i(), needSilentAuthException.h(), vkAuthMetaInfo.c), null, null, 0L, vkAuthMetaInfo.g, 131071);
                try {
                    q55 q55Var = q55.a;
                    Bundle bundle = q55.c().a.K;
                    if (bundle != null) {
                        m63.m(bundle, ((AuthException.NeedSilentAuthException) th).k());
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable unused) {
                }
                l55 l55Var = l55.a;
                r55 r55Var = r55.a;
                return l55.f(l55Var, r55.a(), a, vkAuthMetaInfo, 48).U(new lx1(new n45(th)));
            default:
                t260 t260Var = (t260) obj2;
                w6l w6lVar = t260Var.e;
                if (w6lVar.i.invoke().booleanValue()) {
                    return new su20(new j90(t260Var, 4), w6lVar.k);
                }
                return null;
        }
    }
}
