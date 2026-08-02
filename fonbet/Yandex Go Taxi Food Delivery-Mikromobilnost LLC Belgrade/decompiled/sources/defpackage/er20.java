package defpackage;

import com.yandex.mob.okhttp.metrics.MobCallStatus;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final /* synthetic */ class er20 implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ er20(long j, yuf0 yuf0Var) {
        this.b = j;
        this.c = yuf0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        long j = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                yuf0 yuf0Var = (yuf0) obj2;
                Map.Entry entry = (Map.Entry) obj;
                boolean z = j > ((gm20) entry.getValue()).b;
                if (z && ((gm20) entry.getValue()).a == MobCallStatus.ResponseReceived) {
                    yuf0Var.K("Network.Success", bb1.d((gm20) entry.getValue()));
                }
                return Boolean.valueOf(z);
            default:
                kvj0 kvj0Var = (kvj0) obj2;
                ConcurrentHashMap concurrentHashMap = ((ek7) obj).c;
                Object obj3 = concurrentHashMap.get("request_size");
                Object obj4 = null;
                if (obj3 == null) {
                    m5j0 m5j0Var = kvj0Var.a.d;
                    if (m5j0Var == null) {
                        obj3 = 0L;
                    } else {
                        long a = m5j0Var.a();
                        obj3 = Long.valueOf(a);
                        if (a < 0) {
                            obj3 = null;
                        }
                    }
                }
                if (obj3 != null) {
                    concurrentHashMap.put("request_size", obj3);
                }
                Object obj5 = concurrentHashMap.get("response_size");
                if (obj5 == null) {
                    long contentLength = kvj0Var.z.contentLength();
                    Long valueOf = Long.valueOf(contentLength);
                    if (contentLength >= 0) {
                        obj4 = valueOf;
                    }
                } else {
                    obj4 = obj5;
                }
                if (obj4 != null) {
                    concurrentHashMap.put("response_size", obj4);
                }
                concurrentHashMap.put("parsing_duration", Long.valueOf(j));
                return zy11.a;
        }
    }

    public /* synthetic */ er20(kvj0 kvj0Var, long j) {
        this.c = kvj0Var;
        this.b = j;
    }
}
