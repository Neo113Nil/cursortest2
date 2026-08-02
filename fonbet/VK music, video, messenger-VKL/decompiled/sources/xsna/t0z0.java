package xsna;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import xsna.fly0;
import xsna.ijg0;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class t0z0 extends fly0 implements hjz0 {
    public final ijg0.b j;
    public ijg0.c k;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a {
        public final xgy0 a;

        public a(xgy0 xgy0Var) {
            this.a = xgy0Var;
        }

        public final void a(iaz0 iaz0Var, r120 r120Var) {
            t0z0 t0z0Var = t0z0.this;
            if (t0z0Var.d != r120Var) {
                return;
            }
            StringBuilder sb = new StringBuilder("MediationRewardedAdEngine$AdapterListener: No data from ");
            xgy0 xgy0Var = this.a;
            sb.append(xgy0Var.a);
            sb.append(" ad network - ");
            sb.append(iaz0Var);
            gu8.c(null, sb.toString());
            t0z0Var.t(xgy0Var, false);
        }
    }

    public t0z0(wcy0 wcy0Var, u6z0 u6z0Var, s3z0.a aVar, ijg0.b bVar) {
        super(wcy0Var, u6z0Var, aVar);
        this.j = bVar;
    }

    @Override // xsna.hjz0
    public final void a(Context context) {
        n120 n120Var = this.d;
        ijg0.b bVar = this.j;
        if (n120Var == null) {
            bVar.c();
            gu8.e(null, "MediationRewardedAdEngine: Error - can't show ad, adapter is not set");
            return;
        }
        try {
            ((r120) n120Var).show();
        } catch (Throwable th) {
            bVar.c();
            gu8.e(null, "MediationRewardedAdEngine: Error - " + th);
        }
    }

    @Override // xsna.hjz0
    public final void destroy() {
        n120 n120Var = this.d;
        if (n120Var == null) {
            gu8.e(null, "MediationRewardedAdEngine: Error - can't destroy ad, adapter is not set");
            return;
        }
        try {
            ((r120) n120Var).destroy();
        } catch (Throwable th) {
            gu8.e(null, "MediationRewardedAdEngine: Error - " + th);
        }
        this.d = null;
    }

    @Override // xsna.fly0
    public final void s(n120 n120Var, xgy0 xgy0Var, Context context) {
        r120 r120Var = (r120) n120Var;
        String str = xgy0Var.b;
        String str2 = xgy0Var.f;
        HashMap a2 = xgy0Var.a();
        u6z0 u6z0Var = this.a;
        fly0.a aVar = new fly0.a(str, str2, a2, u6z0Var.a.d(), u6z0Var.a.e(), TextUtils.isEmpty(this.h) ? null : u6z0Var.a(this.h));
        if (r120Var instanceof ts50) {
            njz0 njz0Var = xgy0Var.g;
            if (njz0Var instanceof ikz0) {
                ((ts50) r120Var).a = (ikz0) njz0Var;
            }
        }
        try {
            r120Var.g(aVar, new a(xgy0Var), context);
        } catch (Throwable th) {
            gu8.e(null, "MediationRewardedAdEngine: Error - " + th);
        }
    }

    @Override // xsna.fly0
    public final boolean u(n120 n120Var) {
        return n120Var instanceof r120;
    }

    @Override // xsna.fly0
    public final void w() {
        iaz0 iaz0Var = iaz0.c;
        ijg0.b bVar = this.j;
        bVar.getClass();
        iaz0 iaz0Var2 = iaz0.v;
        ijg0.a aVar = ijg0.this.j;
        if (aVar != null) {
            aVar.e(iaz0Var2);
        }
    }

    @Override // xsna.fly0
    public final n120 x() {
        return new ts50();
    }
}
