package com.vungle.ads.internal.network;

import okhttp3.Interceptor;
import okhttp3.p;
import ru.ok.android.commons.http.Http;
import xsna.csu;
import xsna.d8f0;
import xsna.vl8;

/* loaded from: classes7.dex */
public final class u implements Interceptor {
    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.p request = aVar.request();
        okhttp3.t tVar = request.d;
        if (tVar == null || request.c.a(Http.Header.CONTENT_ENCODING) != null) {
            return aVar.a(request);
        }
        p.a b = request.b();
        b.c.h(Http.Header.CONTENT_ENCODING, Http.ContentEncoding.GZIP);
        String str = request.b;
        vl8 vl8Var = new vl8();
        d8f0 d8f0Var = new d8f0(new csu(vl8Var));
        tVar.writeTo(d8f0Var);
        d8f0Var.close();
        b.f(str, new t(tVar, vl8Var));
        return aVar.a(b.b());
    }
}
