package xsna;

import com.vk.httpexecutor.api.utils.debug.FakeNetworkConditions;
import com.vk.knet.core.http.HttpProtocol;
import java.net.SocketTimeoutException;
import java.util.Collection;
import kotlin.random.Random;
import xsna.zjv;

/* compiled from: FakeNetworkConditionInterceptor.kt */
/* loaded from: classes2.dex */
public final class qjq implements ojv, uz80 {
    public final gzs<Integer> a;
    public final zkv b;

    /* compiled from: FakeNetworkConditionInterceptor.kt */
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

    public qjq(gzs gzsVar, zkv zkvVar) {
        this.a = gzsVar;
        this.b = zkvVar;
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        ckv ckvVar = aVar.b;
        FakeNetworkConditions fakeNetworkConditions = (FakeNetworkConditions) j5g.x0((Collection) this.b.invoke(), Random.b);
        int i = fakeNetworkConditions == null ? -1 : a.$EnumSwitchMapping$0[fakeNetworkConditions.ordinal()];
        gzs<Integer> gzsVar = this.a;
        if (i == 1) {
            int intValue = gzsVar.invoke().intValue();
            if (intValue > 0) {
                Thread.sleep(intValue);
            }
            throw new SocketTimeoutException("Socket timeout");
        }
        if (i == 2) {
            int intValue2 = gzsVar.invoke().intValue();
            if (intValue2 > 0) {
                Thread.sleep(intValue2);
            }
            return new mkv(HttpProtocol.HTTP_2, ckvVar.b, 404, "Not Found", jgp.b, null);
        }
        if (i != 3) {
            return aVar.c(ckvVar);
        }
        int intValue3 = gzsVar.invoke().intValue();
        if (intValue3 > 0) {
            Thread.sleep(intValue3);
        }
        return aVar.c(ckvVar);
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "FakeNetwork";
    }
}
