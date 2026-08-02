package com.yandex.plus.core.network.api.interceptors;

import com.yandex.plus.log.api.LogPriority;
import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.m8w;
import defpackage.oyr;
import defpackage.p8w;
import defpackage.rkd0;
import defpackage.rvj0;
import defpackage.t4j0;
import defpackage.tje;
import defpackage.tls;
import defpackage.vez0;
import defpackage.wls;
import defpackage.zci0;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class b implements p8w {
    public final tls a;
    public final wls b;
    public final rkd0 c;

    public b(tls tlsVar, wls wlsVar, rkd0 rkd0Var) {
        this.a = tlsVar;
        this.b = wlsVar;
        this.c = rkd0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0097, code lost:
    
        if (r8.intValue() != 401) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a0, code lost:
    
        if (r8.intValue() != 403) goto L55;
     */
    @Override // defpackage.p8w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kvj0 intercept(m8w m8wVar) {
        Object failure;
        Integer num;
        String a0;
        Object obj;
        String obj2;
        zci0 zci0Var = (zci0) m8wVar;
        kvj0 b = zci0Var.b(zci0Var.e);
        d5j0 d5j0Var = b.a;
        int i = b.w;
        rkd0 rkd0Var = this.c;
        if (i != 401 && i != 403) {
            if (d5j0Var.c.a("X-APOLLO-OPERATION-NAME") == null) {
                num = null;
            } else {
                try {
                    rvj0 rvj0Var = b.z;
                    failure = (rvj0Var == null || (a0 = vez0.a0(rvj0Var)) == null || (obj = new JSONObject(a0).get(ACSPConstants.STATUS)) == null || (obj2 = obj.toString()) == null) ? null : Integer.valueOf(Integer.parseInt(obj2));
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                boolean z = failure instanceof Result.Failure;
                if (!z) {
                    Integer num2 = (Integer) failure;
                    LogPriority logPriority = LogPriority.DEBUG;
                    if (rkd0Var.e(logPriority)) {
                        rkd0Var.b(logPriority, "RefreshTokenInterceptor", "apolloHttpCode() = " + num2, null);
                    }
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    LogPriority logPriority2 = LogPriority.ERROR;
                    if (rkd0Var.e(logPriority2)) {
                        rkd0Var.b(logPriority2, "RefreshTokenInterceptor", "apolloHttpCode()", a);
                    }
                }
                if (z) {
                    failure = null;
                }
                num = (Integer) failure;
            }
            if (num != null) {
            }
            if (num != null) {
            }
            return b;
        }
        LogPriority logPriority3 = LogPriority.INFO;
        if (rkd0Var.e(logPriority3)) {
            rkd0Var.b(logPriority3, "RefreshTokenInterceptor", oyr.i(i, "Try refresh token, receive code="), null);
        }
        String str = (String) tje.Y(EmptyCoroutineContext.a, new RefreshTokenInterceptor$intercept$token$1(this, null));
        if (str != null) {
            if (rkd0Var.e(logPriority3)) {
                rkd0Var.b(logPriority3, "RefreshTokenInterceptor", "Token is refreshed, proceed request again", null);
            }
            t4j0 t4j0Var = (t4j0) this.b.invoke(d5j0Var.b(), str);
            t4j0Var.getClass();
            d5j0 d5j0Var2 = new d5j0(t4j0Var);
            b.close();
            return zci0Var.b(d5j0Var2);
        }
        return b;
    }
}
