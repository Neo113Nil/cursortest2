package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import com.vk.log.L;
import com.vk.statistic.DeprecatedStatisticUrl;
import java.util.HashMap;

/* compiled from: DeprecatedStatisticBase.java */
/* loaded from: classes5.dex */
public final class t0m implements Runnable {
    public int b = 0;
    public final /* synthetic */ rzl c;
    public final /* synthetic */ DeprecatedStatisticUrl d;

    public t0m(DeprecatedStatisticUrl deprecatedStatisticUrl, rzl rzlVar) {
        this.d = deprecatedStatisticUrl;
        this.c = rzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0m.a();
        if (this.d.zb()) {
            rzl rzlVar = this.c;
            DeprecatedStatisticUrl deprecatedStatisticUrl = this.d;
            rzlVar.getClass();
            String str = deprecatedStatisticUrl.f;
            o260 o260Var = d260.a;
            if (o260Var == null) {
                o260Var = null;
            }
            HashMap<String, String> hashMap = com.vkontakte.android.data.b.h().s;
            o260 o260Var2 = d260.a;
            o260 o260Var3 = o260Var2 != null ? o260Var2 : null;
            o260Var3.getClass();
            nv9 e = o260Var.e(str, hashMap, o260Var3.b(NetworkClient.ClientType.CLIENT_DEFAULT));
            Boolean bool = Boolean.TRUE;
            if (bool.equals((Boolean) e.b)) {
                L.e("Statistics sent", deprecatedStatisticUrl);
            }
            if (bool.equals((Boolean) e.b)) {
                this.d.Cb();
                return;
            }
            int i = this.b;
            if (i < 10) {
                this.b = i + 1;
                asu0.a.getClass();
                l3q.a.schedule(new k3q(asu0.q(), this), 60000L);
            }
        }
    }
}
