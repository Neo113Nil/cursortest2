package xsna;

import android.os.Build;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class s3z0 {
    public final HashMap a;
    public final HashMap b;
    public final long c;
    public final int d;
    public boolean e;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public final int a;
        public boolean b = false;

        public a(int i) {
            this.a = i;
        }

        public final s3z0 a() {
            s3z0 s3z0Var = new s3z0(this.a, "myTarget", 0);
            s3z0Var.e = this.b;
            return s3z0Var;
        }
    }

    public s3z0(int i, String str, int i2) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.b = new HashMap();
        this.d = i2;
        this.c = System.currentTimeMillis();
        hashMap.put("slot", Integer.valueOf(i));
        hashMap.put("network", str);
    }

    public final void a(int i, long j) {
        this.b.put(Integer.valueOf(i), Long.valueOf(j));
    }

    public final void b() {
        if (!this.e) {
            gu8.c(null, "MetricMessage: Metrics sending disabled");
            return;
        }
        if (this.b.isEmpty()) {
            gu8.c(null, "MetricMessage: Metrics not send: empty");
            return;
        }
        zty0 zty0Var = gpy0.l.b.b;
        if (zty0Var == null) {
            gu8.c(null, "MetricMessage: Metrics not send: basic info not collected");
            return;
        }
        String str = (String) zty0Var.b;
        HashMap hashMap = this.a;
        hashMap.put("instanceId", str);
        hashMap.put(O6.F, X3.d);
        hashMap.put("osver", Build.VERSION.RELEASE);
        hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, (String) zty0Var.c);
        hashMap.put("appver", (String) zty0Var.d);
        hashMap.put("sdkver", "5.50.2");
        o8z0.c(new gs2(this, 20));
    }
}
