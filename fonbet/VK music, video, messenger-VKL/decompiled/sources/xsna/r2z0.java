package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.MyTargetActivity;
import java.lang.ref.WeakReference;
import xsna.hjz0;
import xsna.hox;
import xsna.jaz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class r2z0 extends euy0 {
    public final p0z0 k;
    public final suy0 l;
    public izy0 m;
    public WeakReference n;
    public thz0 o;

    public r2z0(ff6 ff6Var, p0z0 p0z0Var, hjz0.a aVar) {
        super(aVar, ff6Var, null);
        this.k = p0z0Var;
        this.l = suy0.a(p0z0Var.a, new xmr0(1, aVar, p0z0Var));
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void a() {
        rxy0 rxy0Var;
        this.d = true;
        WeakReference weakReference = this.n;
        if (weakReference == null || (rxy0Var = (rxy0) weakReference.get()) == null) {
            return;
        }
        zyy0 zyy0Var = rxy0Var.c;
        izy0 izy0Var = this.m;
        if (izy0Var != null) {
            izy0Var.f(zyy0Var);
        }
        suy0 suy0Var = this.l;
        suy0Var.b(zyy0Var);
        suy0Var.c();
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void g(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.g(myTargetActivity, intent, frameLayout);
        p0z0 p0z0Var = this.k;
        p0z0Var.T.d(1, 5000);
        this.o = thz0.a(p0z0Var, 2, null, frameLayout.getContext());
        Context context = frameLayout.getContext();
        rxy0 rxy0Var = new rxy0(new zyy0(context), new a(this));
        this.n = new WeakReference(rxy0Var);
        rxy0Var.a(p0z0Var);
        frameLayout.addView(rxy0Var.c, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void l() {
        super.l();
        izy0 izy0Var = this.m;
        if (izy0Var != null) {
            izy0Var.h();
            this.m = null;
        }
        thz0 thz0Var = this.o;
        if (thz0Var != null) {
            thz0Var.g();
        }
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void m() {
        this.d = false;
        izy0 izy0Var = this.m;
        if (izy0Var != null) {
            izy0Var.h();
        }
        this.l.b(null);
    }

    @Override // xsna.euy0
    public final boolean r() {
        return this.k.Z;
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements jaz0.a {
        public final r2z0 a;

        public a(r2z0 r2z0Var) {
            this.a = r2z0Var;
        }

        @Override // xsna.jaz0.a
        public final void a(boolean z) {
            this.a.j = z;
        }

        @Override // xsna.jaz0.a
        public final void b(xey0 xey0Var, String str, int i, fiz0 fiz0Var, Context context) {
            r2z0 r2z0Var = this.a;
            mez0 a = mez0.a(r2z0Var.c.a.a);
            p0z0 p0z0Var = r2z0Var.k;
            a.c(p0z0Var, i, fiz0Var, context);
            hjz0.a aVar = r2z0Var.a;
            String str2 = p0z0Var.F;
            aVar.g(new hox.a());
            p0z0Var.T.d(1, IronSourceConstants.errorCode_showInProgress);
            r2z0Var.q();
        }

        @Override // xsna.jaz0.a
        public final void e(xey0 xey0Var) {
            this.a.e(xey0Var);
        }

        @Override // xsna.jaz0.a
        public final void f(xey0 xey0Var) {
            xey0Var.T.d(1, IronSourceConstants.errorCode_showInProgress);
            e5z0 e5z0Var = xey0Var.a;
            r2z0 r2z0Var = this.a;
            h8z0.e(e5z0Var, "closedByUser", 999, new mvc0(r2z0Var, 17));
            r2z0Var.q();
        }

        @Override // xsna.jaz0.a
        public final void j(xey0 xey0Var, View view) {
            qjk0.a(new StringBuilder("InterstitialAdImagineEngine$InterstitialImageListener: Ad shown, banner Id = "), xey0Var.F, null);
            r2z0 r2z0Var = this.a;
            izy0 izy0Var = r2z0Var.m;
            if (izy0Var != null) {
                izy0Var.h();
            }
            p0z0 p0z0Var = r2z0Var.k;
            izy0 b = izy0.b(p0z0Var.b, p0z0Var.a, new ugm0(r2z0Var, 10));
            r2z0Var.m = b;
            b.l = new q2z0(r2z0Var, view);
            if (r2z0Var.d) {
                b.f(view);
            }
            qjk0.a(new StringBuilder("InterstitialAdImagineEngine: Ad shown, banner Id = "), xey0Var.F, null);
        }

        @Override // xsna.jaz0.a
        public final void a(double d) {
            this.a.p(d);
        }
    }
}
