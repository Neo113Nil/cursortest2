package defpackage;

import java.net.ConnectException;
import java.net.UnknownHostException;
import retrofit2.HttpException;

/* loaded from: classes.dex */
public final class akr implements p8w {
    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        String str;
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        try {
            return ((zci0) m8wVar).b(d5j0Var);
        } catch (Throwable th) {
            if (zci0Var.a.K) {
                throw th;
            }
            boolean z = th instanceof HttpException;
            if ((z ? th.a() : 0) / 100 != 4) {
                str = (z ? th.a() : 0) / 100 != 5 ? ((th instanceof UnknownHostException) || (th instanceof ConnectException)) ? "FLEX_REQUEST_ERROR:NO_INTERNET_ERROR" : jx81.D(th) ? "FLEX_REQUEST_ERROR:IO_ERROR" : "FLEX_REQUEST_ERROR:OTHER" : "FLEX_REQUEST_ERROR:SERVER_ERROR";
            } else {
                str = "FLEX_REQUEST_ERROR:CLIENT_ERROR";
            }
            String str2 = str;
            xby.l(jst.e, str2, null, th, "Failed to execute feed request " + d5j0Var.a, 2);
            throw th;
        }
    }
}
