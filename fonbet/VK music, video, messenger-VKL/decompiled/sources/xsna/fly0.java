package xsna;

import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class fly0 {
    public final u6z0 a;
    public final s3z0.a b;
    public final wcy0 c;
    public n120 d;
    public WeakReference e;
    public saz0 f;
    public b g;
    public String h;
    public s3z0 i;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final int d;
        public final HashMap e;
        public final pg0 f;

        public a(String str, String str2, HashMap hashMap, int i, int i2, pg0 pg0Var) {
            this.a = str;
            this.b = str2;
            this.e = hashMap;
            this.d = i;
            this.c = i2;
            this.f = pg0Var;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class b implements Runnable {
        public final xgy0 b;

        public b(xgy0 xgy0Var) {
            this.b = xgy0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb = new StringBuilder("MediationEngine: Timeout for ");
            xgy0 xgy0Var = this.b;
            sb.append(xgy0Var.a);
            sb.append(" ad network");
            gu8.c(null, sb.toString());
            h8z0.e(xgy0Var.d, "networkTimeout", 999, null);
            fly0.this.t(xgy0Var, false);
        }
    }

    public fly0(wcy0 wcy0Var, u6z0 u6z0Var, s3z0.a aVar) {
        this.c = wcy0Var;
        this.a = u6z0Var;
        this.b = aVar;
    }

    public abstract void s(n120 n120Var, xgy0 xgy0Var, Context context);

    public final void t(xgy0 xgy0Var, boolean z) {
        b bVar = this.g;
        if (bVar == null || bVar.b != xgy0Var) {
            return;
        }
        WeakReference weakReference = this.e;
        Context context = weakReference == null ? null : (Context) weakReference.get();
        s3z0 s3z0Var = this.i;
        if (s3z0Var != null && context != null) {
            s3z0Var.a(s3z0Var.d, System.currentTimeMillis() - s3z0Var.c);
            this.i.b();
        }
        saz0 saz0Var = this.f;
        if (saz0Var != null) {
            saz0Var.h(this.g);
            this.f.close();
            this.f = null;
        }
        this.g = null;
        if (!z) {
            y();
        } else {
            this.h = xgy0Var.a;
            h8z0.e(xgy0Var.d, "networkFilled", 999, null);
        }
    }

    public abstract boolean u(n120 n120Var);

    public final void v(Context context) {
        this.e = new WeakReference(context);
        y();
    }

    public abstract void w();

    public abstract n120 x();

    public final void y() {
        n120 n120Var;
        n120 n120Var2 = this.d;
        if (n120Var2 != null) {
            try {
                n120Var2.destroy();
            } catch (Throwable th) {
                gu8.e(null, "MediationEngine: Error - " + th);
            }
            this.d = null;
        }
        WeakReference weakReference = this.e;
        Context context = weakReference == null ? null : (Context) weakReference.get();
        if (context == null) {
            gu8.e(null, "MediationEngine: Can't configure next ad network, context is null");
            return;
        }
        ArrayList arrayList = this.c.a;
        xgy0 xgy0Var = arrayList.isEmpty() ? null : (xgy0) arrayList.remove(0);
        if (xgy0Var == null) {
            gu8.c(null, "MediationEngine: No ad networks available");
            w();
            return;
        }
        e5z0 e5z0Var = xgy0Var.d;
        String str = xgy0Var.c;
        String str2 = xgy0Var.a;
        gu8.c(null, "MediationEngine: Prepare adapter for " + str2 + " ad network");
        if (xgy0Var.b()) {
            n120Var = x();
        } else {
            try {
                n120Var = (n120) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th2) {
                gu8.e(null, "MediationEngine: Error – " + th2);
                n120Var = null;
            }
        }
        this.d = n120Var;
        if (n120Var == null || !u(n120Var)) {
            gu8.e(null, "MediationEngine: Can't create adapter, class " + str + " not found or invalid");
            h8z0.e(e5z0Var, "networkAdapterInvalid", 999, null);
            y();
            return;
        }
        gu8.c(null, "MediationEngine: Adapter created");
        float f = xgy0Var.i;
        s3z0.a aVar = this.b;
        s3z0 s3z0Var = new s3z0(aVar.a, str2, 5);
        s3z0Var.e = aVar.b;
        s3z0Var.a.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Float.valueOf(f));
        this.i = s3z0Var;
        saz0 saz0Var = this.f;
        if (saz0Var != null) {
            saz0Var.close();
        }
        int i = xgy0Var.h;
        if (i > 0) {
            this.g = new b(xgy0Var);
            saz0 b2 = saz0.b(i);
            this.f = b2;
            b2.c(this.g);
        } else {
            this.g = null;
        }
        h8z0.e(e5z0Var, "networkRequested", 999, null);
        s(this.d, xgy0Var, context);
    }
}
