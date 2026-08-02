package xsna;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import xsna.fly0;
import xsna.hox;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class rqy0 extends fly0 implements hjz0 {
    public final hox.f j;
    public final hox.f k;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a {
        public final xgy0 a;

        public a(xgy0 xgy0Var) {
            this.a = xgy0Var;
        }

        public final void a(iaz0 iaz0Var, o120 o120Var) {
            rqy0 rqy0Var = rqy0.this;
            if (rqy0Var.d != o120Var) {
                return;
            }
            StringBuilder sb = new StringBuilder("MediationInterstitialAdEngine$AdapterListener: No data from ");
            xgy0 xgy0Var = this.a;
            sb.append(xgy0Var.a);
            sb.append(" ad network - ");
            sb.append(iaz0Var);
            gu8.c(null, sb.toString());
            rqy0Var.t(xgy0Var, false);
        }
    }

    public rqy0(wcy0 wcy0Var, u6z0 u6z0Var, s3z0.a aVar, hox.f fVar, hox.f fVar2) {
        super(wcy0Var, u6z0Var, aVar);
        this.j = fVar;
        this.k = fVar2;
    }

    @Override // xsna.hjz0
    public final void a(Context context) {
        n120 n120Var = this.d;
        hox.f fVar = this.j;
        if (n120Var == null) {
            fVar.c();
            gu8.e(null, "MediationInterstitialAdEngine: Error - can't show ad, adapter is not set");
            return;
        }
        try {
            ((o120) n120Var).show();
        } catch (Throwable th) {
            fVar.c();
            gu8.e(null, "MediationInterstitialAdEngine: Error - " + th);
        }
    }

    @Override // xsna.hjz0
    public final void destroy() {
        n120 n120Var = this.d;
        if (n120Var == null) {
            gu8.e(null, "MediationInterstitialAdEngine: Error - can't destroy ad, adapter is not set");
            return;
        }
        try {
            ((o120) n120Var).destroy();
        } catch (Throwable th) {
            gu8.e(null, "MediationInterstitialAdEngine: Error - " + th);
        }
        this.d = null;
    }

    @Override // xsna.fly0
    public final void s(n120 n120Var, xgy0 xgy0Var, Context context) {
        o120 o120Var = (o120) n120Var;
        String str = xgy0Var.b;
        String str2 = xgy0Var.f;
        HashMap a2 = xgy0Var.a();
        u6z0 u6z0Var = this.a;
        fly0.a aVar = new fly0.a(str, str2, a2, u6z0Var.a.d(), u6z0Var.a.e(), TextUtils.isEmpty(this.h) ? null : u6z0Var.a(this.h));
        if (o120Var instanceof wr50) {
            njz0 njz0Var = xgy0Var.g;
            if (njz0Var instanceof ikz0) {
                ((wr50) o120Var).a = (ikz0) njz0Var;
            }
        }
        try {
            o120Var.i(aVar, new a(xgy0Var), context);
        } catch (Throwable th) {
            gu8.e(null, "MediationInterstitialAdEngine: Error - " + th);
        }
    }

    @Override // xsna.fly0
    public final boolean u(n120 n120Var) {
        return n120Var instanceof o120;
    }

    @Override // xsna.fly0
    public final void w() {
        iaz0 iaz0Var = iaz0.c;
        hox.f fVar = this.j;
        fVar.getClass();
        iaz0 iaz0Var2 = iaz0.v;
        hox hoxVar = hox.this;
        tr50 tr50Var = hoxVar.k;
        if (tr50Var != null) {
            tr50Var.b(iaz0Var2);
            return;
        }
        hox.d dVar = hoxVar.j;
        if (dVar != null) {
            dVar.c(iaz0Var2);
        }
    }

    @Override // xsna.fly0
    public final n120 x() {
        return new wr50();
    }
}
