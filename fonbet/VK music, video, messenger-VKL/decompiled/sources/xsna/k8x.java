package xsna;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* compiled from: InstrumentApacheHttpResponseHandler.java */
/* loaded from: classes13.dex */
public final class k8x<T> implements ResponseHandler<T> {
    public final ResponseHandler<? extends T> a;
    public final Timer b;
    public final e560 c;

    public k8x(ResponseHandler<? extends T> responseHandler, Timer timer, e560 e560Var) {
        this.a = responseHandler;
        this.b = timer;
        this.c = e560Var;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final T handleResponse(HttpResponse httpResponse) throws IOException {
        this.c.l(this.b.d());
        this.c.f(httpResponse.getStatusLine().getStatusCode());
        Long a = f560.a(httpResponse);
        if (a != null) {
            this.c.k(a.longValue());
        }
        String b = f560.b(httpResponse);
        if (b != null) {
            this.c.j(b);
        }
        this.c.d();
        return this.a.handleResponse(httpResponse);
    }
}
