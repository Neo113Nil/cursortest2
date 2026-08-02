package defpackage;

import com.yandex.messaging.internal.net.HttpRequestTag;
import java.util.ArrayList;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes15.dex */
public final class ahz implements p8w {
    public final gsu a;
    public final HttpLoggingInterceptor b;
    public final HttpLoggingInterceptor c;

    public ahz(gsu gsuVar, dy00 dy00Var) {
        this.a = gsuVar;
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(dy00Var);
        httpLoggingInterceptor.d = HttpLoggingInterceptor.Level.BODY;
        this.b = httpLoggingInterceptor;
        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(dy00Var);
        httpLoggingInterceptor2.d = HttpLoggingInterceptor.Level.HEADERS;
        this.c = httpLoggingInterceptor2;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        kwu kwuVar = d5j0Var.a;
        String str = kwuVar.d;
        ArrayList arrayList = kwuVar.f;
        g0c a = qoi0.a(Object.class);
        Object cast = a.a().cast(d5j0Var.e.o(a));
        gsu gsuVar = this.a;
        boolean l = jl40.l(str, (String) gsuVar.a.c(gsuVar.c));
        HttpLoggingInterceptor httpLoggingInterceptor = this.c;
        return l ? httpLoggingInterceptor.intercept(m8wVar) : (jl40.l(str, (String) gsuVar.a.c(gsuVar.b)) && !arrayList.isEmpty() && "media_upload".equals(arrayList.get(0))) ? httpLoggingInterceptor.intercept(m8wVar) : (jl40.l(d5j0Var.b, "POST") && arrayList.contains("report")) ? zci0Var.b(d5j0Var) : (cast == HttpRequestTag.FileRequest || cast == HttpRequestTag.YaDiskFileRequest) ? httpLoggingInterceptor.intercept(m8wVar) : this.b.intercept(m8wVar);
    }
}
