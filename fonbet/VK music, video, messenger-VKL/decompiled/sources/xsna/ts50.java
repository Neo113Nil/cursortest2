package xsna;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C4572u;
import java.util.Map;
import xsna.fly0;
import xsna.ijg0;
import xsna.s3z0;
import xsna.t0z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ts50 implements r120 {
    public ikz0 a;
    public ijg0 b;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements ijg0.a {
        public final t0z0.a a;

        public a(t0z0.a aVar) {
            this.a = aVar;
        }

        @Override // xsna.ijg0.a
        public final void b() {
            gu8.c(null, "MyTargetRewardedAdAdapter$AdListener: Ad clicked");
            t0z0.a aVar = this.a;
            t0z0 t0z0Var = t0z0.this;
            if (t0z0Var.d != ts50.this) {
                return;
            }
            h8z0.e(aVar.a.d, "click", 2, null);
            t0z0Var.j.g(null);
        }

        @Override // xsna.ijg0.a
        public final void d() {
            gu8.c(null, "MyTargetRewardedAdAdapter$AdListener: Ad displayed");
            t0z0.a aVar = this.a;
            t0z0 t0z0Var = t0z0.this;
            if (t0z0Var.d != ts50.this) {
                return;
            }
            h8z0.e(aVar.a.d, "show", 1, null);
            t0z0Var.j.e();
        }

        @Override // xsna.ijg0.a
        public final void e(iaz0 iaz0Var) {
            gu8.c(null, "MyTargetRewardedAdAdapter$AdListener: No ad (" + iaz0Var.b + ")");
            this.a.a(iaz0Var, ts50.this);
        }

        @Override // xsna.ijg0.a
        public final void h(ijg0 ijg0Var) {
            gu8.c(null, "MyTargetRewardedAdAdapter$AdListener: Ad loaded");
            t0z0.a aVar = this.a;
            xgy0 xgy0Var = aVar.a;
            t0z0 t0z0Var = t0z0.this;
            if (t0z0Var.d != ts50.this) {
                return;
            }
            gu8.c(null, "MediationRewardedAdEngine$AdapterListener: Data from " + xgy0Var.a + " ad network loaded successfully");
            t0z0Var.t(xgy0Var, true);
            ijg0 ijg0Var2 = ijg0.this;
            ijg0.a aVar2 = ijg0Var2.j;
            if (aVar2 != null) {
                aVar2.h(ijg0Var2);
            }
        }

        @Override // xsna.ijg0.a
        public final void i() {
            gu8.c(null, "MyTargetRewardedAdAdapter$AdListener: Ad failed to show");
            t0z0 t0z0Var = t0z0.this;
            if (t0z0Var.d != ts50.this) {
                return;
            }
            t0z0Var.j.c();
        }

        @Override // xsna.ijg0.a
        public final void j() {
            gu8.c(null, "MyTargetRewardedAdAdapter$AdListener: Ad dismissed");
            t0z0 t0z0Var = t0z0.this;
            if (t0z0Var.d != ts50.this) {
                return;
            }
            t0z0Var.j.b();
        }

        @Override // xsna.ijg0.a
        public final void l(fvr fvrVar) {
            gu8.c(null, "MyTargetRewardedAdAdapter$AdListener: onReward - default");
            t0z0.a aVar = this.a;
            t0z0 t0z0Var = t0z0.this;
            if (t0z0Var.d != ts50.this) {
                return;
            }
            h8z0.e(aVar.a.d, C4572u.j, 999, null);
            ijg0.c cVar = t0z0Var.k;
            if (cVar != null) {
                cVar.a(fvrVar);
            }
        }
    }

    @Override // xsna.n120
    public final void destroy() {
        ijg0 ijg0Var = this.b;
        if (ijg0Var == null) {
            return;
        }
        ijg0Var.j = null;
        ijg0Var.d();
        this.b = null;
    }

    @Override // xsna.r120
    public final void g(@NonNull fly0.a aVar, @NonNull t0z0.a aVar2, @NonNull Context context) {
        String str = aVar.a;
        try {
            int parseInt = Integer.parseInt(str);
            ijg0 ijg0Var = new ijg0(parseInt, context);
            this.b = ijg0Var;
            u6z0 u6z0Var = ijg0Var.a;
            u6z0Var.c = false;
            ijg0Var.j = new a(aVar2);
            qnk qnkVar = u6z0Var.a;
            qnkVar.f(aVar.d);
            qnkVar.h(aVar.c);
            for (Map.Entry entry : aVar.e.entrySet()) {
                qnkVar.g((String) entry.getKey(), (String) entry.getValue());
            }
            String str2 = aVar.b;
            if (this.a != null) {
                gu8.c(null, "MyTargetRewardedAdAdapter: Got banner from mediation response");
                ijg0 ijg0Var2 = this.b;
                ikz0 ikz0Var = this.a;
                s3z0.a aVar3 = ijg0Var2.b;
                s3z0 a2 = aVar3.a();
                awy0 awy0Var = new awy0(ijg0Var2.a, aVar3, ikz0Var);
                awy0Var.d = new o7(ijg0Var2, 4);
                awy0Var.e(a2, ijg0Var2.e);
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                gu8.c(null, "MyTargetRewardedAdAdapter: Load id " + parseInt);
                this.b.e();
                return;
            }
            gu8.c(null, "MyTargetRewardedAdAdapter: Load id " + parseInt + " from BID " + str2);
            ijg0 ijg0Var3 = this.b;
            ijg0Var3.a.e = str2;
            ijg0Var3.e();
        } catch (Throwable unused) {
            gu8.e(null, "MyTargetRewardedAdAdapter: Error - failed to request ad, unable to convert slotId " + str + " to int");
            aVar2.a(iaz0.o, this);
        }
    }

    @Override // xsna.r120
    public final void show() {
        ijg0 ijg0Var = this.b;
        if (ijg0Var == null) {
            return;
        }
        ijg0Var.f();
    }
}
