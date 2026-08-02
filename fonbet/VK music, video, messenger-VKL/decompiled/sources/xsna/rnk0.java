package xsna;

import java.io.IOException;
import okhttp3.p;
import ru.ok.android.commons.http.Http;

/* compiled from: SseEventSourceBuilderImpl.kt */
/* loaded from: classes.dex */
public final class rnk0 implements pnk0 {
    public final w0f a;
    public final boolean b;
    public final bpn0 c = new bpn0(new qnk0(0, this, rnk0.class, "createOkHttpClient", "createOkHttpClient()Lokhttp3/OkHttpClient;", 0));
    public final bpn0 d = new bpn0(new b63(11));

    public rnk0(n560 n560Var, w0f w0fVar, boolean z) {
        this.a = w0fVar;
        this.b = z;
    }

    @Override // xsna.pnk0
    public final snk0 a(int i, String str) throws IOException {
        p.a aVar = new p.a();
        aVar.c.h(Http.Header.ACCEPT, "text/event-stream");
        if (this.b) {
            aVar.c.h("X-compress", Http.ContentEncoding.GZIP);
        }
        aVar.c(okhttp3.c.n);
        aVar.i(str);
        okhttp3.p b = aVar.b();
        ((sqo) this.d.getValue()).a(i);
        return new snk0((okhttp3.o) this.c.getValue(), b);
    }
}
