package xsna;

import okhttp3.Interceptor;
import okhttp3.Protocol;

/* compiled from: OtelOkhttpRequestInterceptor.kt */
/* loaded from: classes17.dex */
public final class sz80 implements Interceptor {
    public static final j8 b = new j8(22);
    public final wdp0 a;

    /* compiled from: OtelOkhttpRequestInterceptor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Protocol.values().length];
            try {
                iArr[Protocol.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Protocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Protocol.HTTP_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Protocol.QUIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sz80(wdp0 wdp0Var) {
        this.a = wdp0Var;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.p request = aVar.request();
        return (okhttp3.u) vhk0.i(this.a, request.b, true, new wq20(request, 12), new hn0(request, aVar, this));
    }
}
