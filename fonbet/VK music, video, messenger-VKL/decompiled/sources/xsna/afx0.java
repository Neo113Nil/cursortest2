package xsna;

import android.net.Uri;
import com.vk.log.L;
import com.vk.superapp.api.internal.requests.common.CustomApiRequest;
import java.io.File;

/* compiled from: WebAppProxyBridge.kt */
/* loaded from: classes11.dex */
public final class afx0 {
    public static final afx0 a = new afx0();
    public static final jgx0 b = jgx0.a;
    public static final bpn0 c = new bpn0(new m(20));
    public static final bpn0 d = new bpn0(new yp6(20));
    public static final bpn0 e = new bpn0(new s65(19));
    public static final bpn0 f = new bpn0(new c24(25));
    public static final bpn0 g = new bpn0(new l67(19));

    public static okhttp3.b a(boolean z) {
        com.vk.superapp.b cache = q7n0.a().getCache();
        if (!cache.C()) {
            cache.w();
        }
        return new okhttp3.b(z ? (File) g.getValue() : (File) f.getValue(), z ? 104857600L : 52428800L);
    }

    public final okhttp3.o b() {
        return (okhttp3.o) d.getValue();
    }

    public final okhttp3.o c() {
        return (okhttp3.o) e.getValue();
    }

    public final void d(String str, boolean z) {
        try {
            if (str != null) {
                CustomApiRequest.a a2 = CustomApiRequest.a.C1865a.a(str);
                a2.b(z ? c() : b());
                a2.c(CustomApiRequest.RequestMethod.GET);
                a2.a().f().close();
                return;
            }
            afx0 afx0Var = e370.r;
            if (afx0Var != null) {
                afx0Var.b();
            }
        } catch (Throwable th) {
            L.i(th);
        }
    }

    public final boolean e(Uri uri) {
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        return o260Var.h().c(uri);
    }
}
