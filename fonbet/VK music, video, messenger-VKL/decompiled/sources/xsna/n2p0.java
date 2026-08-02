package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: TooManyRequestRetryChainCall.kt */
/* loaded from: classes.dex */
public final class n2p0<T> extends dfg0<T> {
    public static final laq f = new laq(24, 1000, 1.2f, 8000);
    public final a c;
    public final m2p0 d;
    public final jpx e;

    /* compiled from: TooManyRequestRetryChainCall.kt */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            if (j / i < 150) {
                this.a = 20;
                this.b = 3000L;
            } else {
                this.a = i;
                this.b = j;
            }
        }
    }

    public n2p0(l7r0 l7r0Var, int i, a aVar, m2p0 m2p0Var, jpx jpxVar) {
        super(l7r0Var, i);
        this.c = aVar;
        this.d = m2p0Var;
        this.e = jpxVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) throws Exception {
        int i = this.b;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                laq laqVar = f;
                laqVar.e();
                a aVar = this.c;
                this.d.a(aVar.a, aVar.b);
                try {
                    T t = (T) this.e.c(zqaVar, 0);
                    laqVar.c();
                    return t;
                } catch (VKApiExecutionException e) {
                    if (!e.e0()) {
                        throw e;
                    }
                    b(e, "Too many requests");
                    laqVar.b();
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
        }
        throw new VKApiException(tgw.b(i, "Can't handle too many requests due to retry limit! (retryLimit=", ")"));
    }
}
