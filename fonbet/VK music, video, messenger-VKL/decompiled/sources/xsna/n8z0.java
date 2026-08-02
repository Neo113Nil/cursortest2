package xsna;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.s3z0;
import xsna.z8y0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class n8z0 {
    public final a a;
    public final u6z0 b;
    public final s3z0.a c;
    public b d;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        boolean a();

        z8y0 b();

        b920 c();

        ohz0 d();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface b {
        void f(njz0 njz0Var, xla xlaVar);
    }

    public n8z0(a aVar, u6z0 u6z0Var, s3z0.a aVar2) {
        this.a = aVar;
        this.b = u6z0Var;
        this.c = aVar2;
    }

    public static void d(s3z0 s3z0Var, int i, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        Long l = (Long) s3z0Var.b.get(Integer.valueOf(i));
        if (l != null) {
            currentTimeMillis += l.longValue();
        }
        s3z0Var.a(i, currentTimeMillis);
    }

    public final j79 a(jkz0 jkz0Var, njz0 njz0Var, ohz0 ohz0Var, s3z0 s3z0Var, xla xlaVar) {
        jkz0 jkz0Var2;
        int i;
        njz0 njz0Var2;
        long currentTimeMillis = System.currentTimeMillis();
        u6z0 u6z0Var = this.b;
        udz0 udz0Var = u6z0Var.j;
        bqz0 bqz0Var = u6z0Var.k;
        qez0 d = new v8z0(udz0Var).d(jkz0Var.a, null, null);
        d(s3z0Var, 1, currentTimeMillis);
        if (!d.a) {
            return new j79(d, njz0Var);
        }
        h8z0.c(jkz0Var.c("serviceRequested"), u6z0Var.j, bqz0Var);
        int a2 = njz0Var != null ? njz0Var.a() : 0;
        String str = (String) d.c;
        if (str != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            i = a2;
            njz0 d2 = ohz0Var.d(str, jkz0Var, njz0Var, this.b, this.c, s3z0Var, null, xlaVar);
            jkz0Var2 = jkz0Var;
            d(s3z0Var, 2, currentTimeMillis2);
            njz0Var2 = b(jkz0Var2.b, d2, ohz0Var, s3z0Var, xlaVar);
        } else {
            jkz0Var2 = jkz0Var;
            i = a2;
            njz0Var2 = njz0Var;
        }
        if (i == (njz0Var2 != null ? njz0Var2.a() : 0)) {
            h8z0.c(jkz0Var2.c("serviceAnswerEmpty"), u6z0Var.j, bqz0Var);
            jkz0 jkz0Var3 = jkz0Var2.g;
            if (jkz0Var3 != null) {
                njz0Var2 = (njz0) a(jkz0Var3, njz0Var2, ohz0Var, s3z0Var, xlaVar).c;
            }
        }
        return new j79(d, njz0Var2);
    }

    public final njz0 b(List list, njz0 njz0Var, ohz0 ohz0Var, s3z0 s3z0Var, xla xlaVar) {
        if (list.size() <= 0) {
            return njz0Var;
        }
        Iterator it = list.iterator();
        njz0 njz0Var2 = njz0Var;
        while (it.hasNext()) {
            njz0Var2 = (njz0) a((jkz0) it.next(), njz0Var2, ohz0Var, s3z0Var, xlaVar).c;
        }
        return njz0Var2;
    }

    public final void c(String str, String str2, String str3, s3z0 s3z0Var, b7z0 b7z0Var) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        a aVar = this.a;
        ohz0 d = aVar.d();
        xla xlaVar = new xla();
        jkz0 jkz0Var = new jkz0(str, str2);
        njz0 d2 = d.d(str3, jkz0Var, null, this.b, this.c, s3z0Var, arrayList, xlaVar);
        s3z0Var.a(2, System.currentTimeMillis() - currentTimeMillis);
        if (b7z0Var != null) {
            b7z0Var.d("hosts", arrayList.isEmpty() ? null : TextUtils.join(StringUtils.COMMA, arrayList));
        }
        if (aVar.a()) {
            d2 = b(jkz0Var.b, d2, d, s3z0Var, xlaVar);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        njz0 h = h(d2, xlaVar);
        s3z0Var.a(3, System.currentTimeMillis() - currentTimeMillis2);
        g(h, xlaVar, s3z0Var);
    }

    public void e(s3z0 s3z0Var, Context context) {
        Context applicationContext = context.getApplicationContext();
        if (!xr50.a.get()) {
            xr50.a(applicationContext);
        }
        o8z0.a(new kgb(9, this, s3z0Var));
    }

    public void f(s3z0 s3z0Var, idy0 idy0Var) {
        xez0.a(idy0Var);
        if (!idy0Var.a()) {
            this.b.j.a(0, 0, 1002, null, null);
            g(null, xla.a(iaz0.d), s3z0Var);
            return;
        }
        b7z0 b2 = b7z0.b(idy0Var.a);
        ArrayList arrayList = new ArrayList();
        String e = b2.e("hosts");
        if (!TextUtils.isEmpty(e)) {
            Collections.addAll(arrayList, e.split(StringUtils.COMMA));
        }
        arrayList.add("ad.mail.ru");
        z8y0 b3 = this.a.b();
        String str = (String) arrayList.get(0);
        u6z0 u6z0Var = this.b;
        m8z0 m8z0Var = new m8z0(this, s3z0Var, arrayList, b2);
        z8y0.a aVar = (z8y0.a) b3;
        u6z0Var.j.c(1000);
        int i = u6z0Var.f;
        if (i == 0 || i == 1) {
            khy0.a |= 16;
        } else {
            khy0.a &= -17;
        }
        if (i == 0 || i == 2) {
            khy0.a |= 32;
        } else {
            khy0.a &= -33;
        }
        if (i == 0 || i == 4) {
            khy0.a |= 256;
        } else {
            khy0.a &= -257;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = u6z0Var.b.values().iterator();
        while (it.hasNext()) {
            qg0 m = ((pg0) it.next()).m();
            if (m != null) {
                arrayList2.add(m);
            }
        }
        if (arrayList2.isEmpty()) {
            gu8.c(null, "DefaultAdServiceBuilder: no AdNetworkLoaders, direct call result");
            aVar.d(str, u6z0Var, new HashMap(), s3z0Var, idy0Var, m8z0Var);
            return;
        }
        gu8.c(null, "DefaultAdServiceBuilder: loading mediation params");
        txy0 txy0Var = new txy0(u6z0Var.h, arrayList2, idy0Var, new x8y0(aVar, str, u6z0Var, s3z0Var, idy0Var, m8z0Var));
        if (txy0Var.g == 0) {
            gu8.c(null, "MediationParamsLoader: empty loaders list, direct onResult call");
            txy0Var.a();
            return;
        }
        gu8.c(null, "MediationParamsLoader: params loading started, loaders count: " + txy0Var.g);
        txy0Var.b.c(txy0Var);
        Iterator it2 = txy0Var.d.iterator();
        while (it2.hasNext()) {
            qg0 qg0Var = (qg0) it2.next();
            gu8.c(null, "MediationParamsLoader: loading params for " + qg0Var);
            qg0Var.b();
            Context context = txy0Var.c.a;
            qg0Var.a();
        }
    }

    public final void g(njz0 njz0Var, xla xlaVar, s3z0 s3z0Var) {
        s3z0Var.b();
        if (this.d == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            o8z0.d(new pxz(this, njz0Var, xlaVar, 2));
        } else {
            this.d.f(njz0Var, xlaVar);
            this.d = null;
        }
    }

    public final njz0 h(njz0 njz0Var, xla xlaVar) {
        b920 c;
        u6z0 u6z0Var = this.b;
        u6z0Var.j.c(4000);
        return (njz0Var == null || (c = this.a.c()) == null) ? njz0Var : c.d(njz0Var, u6z0Var, xlaVar);
    }
}
