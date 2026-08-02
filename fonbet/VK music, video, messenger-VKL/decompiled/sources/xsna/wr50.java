package xsna;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C4572u;
import java.util.Map;
import xsna.fly0;
import xsna.hox;
import xsna.rqy0;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class wr50 implements o120 {
    public ikz0 a;
    public hox b;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements hox.d {
        public final rqy0.a a;

        public a(rqy0.a aVar) {
            this.a = aVar;
        }

        @Override // xsna.hox.d
        public final void a() {
            gu8.c(null, "MyTargetInterstitialAdAdapter: Ad displayed");
            rqy0.a aVar = this.a;
            rqy0 rqy0Var = rqy0.this;
            if (rqy0Var.d != wr50.this) {
                return;
            }
            h8z0.e(aVar.a.d, "show", 1, null);
            rqy0Var.j.e();
        }

        @Override // xsna.hox.d
        public final void c(iaz0 iaz0Var) {
            gu8.c(null, "MyTargetInterstitialAdAdapter: No ad (" + iaz0Var.b + ")");
            this.a.a(iaz0Var, wr50.this);
        }

        @Override // xsna.hox.d
        public final void f() {
            gu8.c(null, "MyTargetInterstitialAdAdapter: Video completed");
            rqy0.a aVar = this.a;
            rqy0 rqy0Var = rqy0.this;
            if (rqy0Var.d != wr50.this) {
                return;
            }
            rqy0Var.k.c(null);
            h8z0.e(aVar.a.d, C4572u.j, 999, null);
        }

        @Override // xsna.hox.d
        public final void g() {
            gu8.c(null, "MyTargetInterstitialAdAdapter: On failed to show");
            rqy0 rqy0Var = rqy0.this;
            if (rqy0Var.d != wr50.this) {
                return;
            }
            rqy0Var.j.c();
        }

        @Override // xsna.hox.d
        public final void k(hox hoxVar) {
            gu8.c(null, "MyTargetInterstitialAdAdapter: Ad loaded");
            rqy0.a aVar = this.a;
            xgy0 xgy0Var = aVar.a;
            rqy0 rqy0Var = rqy0.this;
            if (rqy0Var.d != wr50.this) {
                return;
            }
            gu8.c(null, "MediationInterstitialAdEngine$AdapterListener: Data from " + xgy0Var.a + " ad network loaded successfully");
            rqy0Var.t(xgy0Var, true);
            hox hoxVar2 = hox.this;
            tr50 tr50Var = hoxVar2.k;
            if (tr50Var != null) {
                tr50Var.a();
                return;
            }
            hox.d dVar = hoxVar2.j;
            if (dVar != null) {
                dVar.k(hoxVar2);
            }
        }

        @Override // xsna.hox.d
        public final void onClick() {
            gu8.c(null, "MyTargetInterstitialAdAdapter: Ad clicked");
            rqy0.a aVar = this.a;
            rqy0 rqy0Var = rqy0.this;
            if (rqy0Var.d != wr50.this) {
                return;
            }
            h8z0.e(aVar.a.d, "click", 2, null);
            rqy0Var.j.g(null);
        }

        @Override // xsna.hox.d
        public final void onDismiss() {
            gu8.c(null, "MyTargetInterstitialAdAdapter: Ad dismissed");
            rqy0 rqy0Var = rqy0.this;
            if (rqy0Var.d != wr50.this) {
                return;
            }
            rqy0Var.j.b();
        }
    }

    @Override // xsna.n120
    public final void destroy() {
        hox hoxVar = this.b;
        if (hoxVar == null) {
            return;
        }
        hoxVar.j = null;
        hoxVar.d();
        this.b = null;
    }

    @Override // xsna.o120
    public final void i(@NonNull fly0.a aVar, @NonNull rqy0.a aVar2, @NonNull Context context) {
        String str = aVar.a;
        try {
            int parseInt = Integer.parseInt(str);
            hox hoxVar = new hox(parseInt, context);
            this.b = hoxVar;
            u6z0 u6z0Var = hoxVar.a;
            u6z0Var.c = false;
            hoxVar.j = new a(aVar2);
            qnk qnkVar = u6z0Var.a;
            qnkVar.f(aVar.d);
            qnkVar.h(aVar.c);
            for (Map.Entry entry : aVar.e.entrySet()) {
                qnkVar.g((String) entry.getKey(), (String) entry.getValue());
            }
            String str2 = aVar.b;
            if (this.a != null) {
                gu8.c(null, "MyTargetInterstitialAdAdapter: Got banner from mediation response");
                hox hoxVar2 = this.b;
                ikz0 ikz0Var = this.a;
                s3z0.a aVar3 = hoxVar2.b;
                s3z0 a2 = aVar3.a();
                awy0 awy0Var = new awy0(hoxVar2.a, aVar3, ikz0Var);
                awy0Var.d = new o7(hoxVar2, 4);
                awy0Var.e(a2, hoxVar2.e);
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                gu8.c(null, "MyTargetInterstitialAdAdapter: Load id " + parseInt);
                this.b.e();
                return;
            }
            gu8.c(null, "MyTargetInterstitialAdAdapter: Load id " + parseInt + " from BID " + str2);
            hox hoxVar3 = this.b;
            hoxVar3.a.e = str2;
            hoxVar3.e();
        } catch (Throwable unused) {
            gu8.e(null, "MyTargetInterstitialAdAdapter: Error - failed to request ad, unable to convert slotId " + str + " to int");
            aVar2.a(iaz0.o, this);
        }
    }

    @Override // xsna.o120
    public final void show() {
        hox hoxVar = this.b;
        if (hoxVar == null) {
            return;
        }
        hoxVar.f();
    }
}
