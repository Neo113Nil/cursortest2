package yads;

import android.util.Base64;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Map;
import xsna.brm0;

/* loaded from: classes10.dex */
public abstract class wp2 {
    public static final kv1 a = jv1.a();

    public static final void a(long j, qp2 qp2Var, g92 g92Var) {
        String str;
        String str2;
        byte[] b = qp2Var.b();
        String str3 = null;
        if (b != null) {
            try {
                str = brm0.u(b);
            } catch (Exception unused) {
                str = "UNKNOWN_CONTENT";
            }
            str2 = str;
        } else {
            str2 = null;
        }
        byte[] bArr = g92Var.b;
        if (bArr != null) {
            if (qp2Var instanceof r41) {
                str3 = "IMAGE_CONTENT";
            } else {
                try {
                    str3 = brm0.u(Base64.decode(bArr, 0));
                } catch (IllegalArgumentException unused2) {
                    str3 = brm0.u(bArr);
                } catch (Exception unused3) {
                    str3 = "UNKNOWN_CONTENT";
                }
            }
        }
        kv1 kv1Var = a;
        int i = qp2Var.c;
        String str4 = i == 0 ? "GET" : i == 1 ? "POST" : i == 2 ? "PUT" : i == 3 ? "DELETE" : i == 4 ? "HEAD" : i == 5 ? "OPTIONS" : i == 6 ? "TRACE" : i == 7 ? "PATCH" : GrsBaseInfo.CountryCodeSource.UNKNOWN;
        String g = qp2Var.g();
        Map d = qp2Var.d();
        Integer valueOf = Integer.valueOf(g92Var.a);
        Map map = g92Var.c;
        kv1Var.getClass();
        if (fv1.b) {
            iv1 iv1Var = new iv1(new nv1(j, str4, g, d, str2), new qv1(System.currentTimeMillis(), valueOf, map, str3));
            synchronized (kv1.c) {
                try {
                    if (kv1Var.a.size() > 100) {
                        kv1Var.a.removeFirst();
                    }
                    kv1Var.a.addLast(iv1Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
