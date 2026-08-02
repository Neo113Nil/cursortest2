package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import com.vk.httpexecutor.api.utils.debug.FakeNetworkConditions;
import java.net.SocketTimeoutException;
import java.util.EnumSet;
import kotlin.random.Random;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.u;

/* compiled from: FakeNetworkConditionsInterceptor.kt */
/* loaded from: classes2.dex */
public final class sjq implements Interceptor, uz80 {
    public final NetworkClient.ClientType a;
    public final gzs<EnumSet<NetworkClient.ClientType>> b;
    public final gzs<Integer> c;
    public final gzs<EnumSet<FakeNetworkConditions>> d;

    /* compiled from: FakeNetworkConditionsInterceptor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FakeNetworkConditions.values().length];
            try {
                iArr[FakeNetworkConditions.SOCKET_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FakeNetworkConditions.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FakeNetworkConditions.SLOW_NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sjq(NetworkClient.ClientType clientType, gzs<? extends EnumSet<NetworkClient.ClientType>> gzsVar, gzs<Integer> gzsVar2, gzs<? extends EnumSet<FakeNetworkConditions>> gzsVar3) {
        this.a = clientType;
        this.b = gzsVar;
        this.c = gzsVar2;
        this.d = gzsVar3;
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "FakeNetwork";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        EnumSet<NetworkClient.ClientType> invoke = this.b.invoke();
        NetworkClient.ClientType clientType = this.a;
        if (!invoke.contains(clientType)) {
            return aVar.a(aVar.request());
        }
        FakeNetworkConditions fakeNetworkConditions = (FakeNetworkConditions) j5g.x0(this.d.invoke(), Random.b);
        int i = fakeNetworkConditions == null ? -1 : a.$EnumSwitchMapping$0[fakeNetworkConditions.ordinal()];
        gzs<Integer> gzsVar = this.c;
        if (i == 1) {
            int intValue = gzsVar.invoke().intValue();
            if (intValue > 0) {
                Thread.sleep(intValue);
            }
            throw new SocketTimeoutException("Socket timeout for request type " + clientType);
        }
        if (i != 2) {
            if (i != 3) {
                return aVar.a(aVar.request());
            }
            int intValue2 = gzsVar.invoke().intValue();
            if (intValue2 > 0) {
                Thread.sleep(intValue2);
            }
            return aVar.a(aVar.request());
        }
        int intValue3 = gzsVar.invoke().intValue();
        if (intValue3 > 0) {
            Thread.sleep(intValue3);
        }
        u.a aVar2 = new u.a();
        aVar2.b = Protocol.HTTP_2;
        aVar2.a = aVar.request();
        aVar2.c = 404;
        aVar2.d = "Not Found";
        return aVar2.c();
    }
}
