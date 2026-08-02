package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import xsna.u3j;

/* compiled from: Interceptor.kt */
/* loaded from: classes11.dex */
public interface Interceptor {

    /* compiled from: Interceptor.kt */
    public interface a {
        u a(p pVar) throws IOException;

        u3j b();

        a c(int i);

        d call();

        int d();

        a e(int i, TimeUnit timeUnit);

        int f();

        p request();
    }

    u intercept(a aVar) throws IOException;
}
