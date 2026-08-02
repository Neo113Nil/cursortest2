package xsna;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.MyTargetActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.hjz0;
import xsna.hox;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class p4z0 extends euy0 {
    public ArrayList k;
    public WeakReference l;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a {
        public final p4z0 a;

        public a(p4z0 p4z0Var) {
            this.a = p4z0Var;
        }

        public final void a(xey0 xey0Var, int i, fiz0 fiz0Var, Context context) {
            xey0 xey0Var2;
            p4z0 p4z0Var = this.a;
            ff6 ff6Var = p4z0Var.c;
            if (p4z0Var.s() == null) {
                return;
            }
            mez0 a = mez0.a(ff6Var.a.a);
            if (TextUtils.isEmpty(null)) {
                a.c(xey0Var, i, fiz0Var, context);
                xey0Var2 = xey0Var;
            } else {
                xey0Var2 = xey0Var;
                a.e(xey0Var2, null, i, fiz0Var, null, context);
            }
            hjz0.a aVar = p4z0Var.a;
            String str = xey0Var2.F;
            aVar.g(new hox.a());
            if ((xey0Var2 instanceof tez0) && ((tez0) xey0Var2).s()) {
                xey0Var2.T.d(1, IronSourceConstants.errorCode_showInProgress);
                p4z0Var.q();
            }
        }

        public final void b(m6z0 m6z0Var, ViewGroup viewGroup) {
            izy0 izy0Var = m6z0Var.d;
            if (izy0Var != null) {
                izy0Var.h();
            }
            tez0 tez0Var = m6z0Var.a;
            ery0 ery0Var = tez0Var.b;
            e5z0 e5z0Var = tez0Var.a;
            p4z0 p4z0Var = this.a;
            izy0 b = izy0.b(ery0Var, e5z0Var, new xmr0(2, p4z0Var, tez0Var));
            b.l = new o4z0(p4z0Var, m6z0Var);
            if (p4z0Var.d) {
                b.f(viewGroup);
            }
            m6z0Var.d = b;
            m6z0Var.h = true;
            qjk0.a(new StringBuilder("InterstitialAdDoublePromoEngine: Ad shown, banner Id = "), tez0Var.F, null);
        }
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void a() {
        this.d = true;
        jaz0 s = s();
        if (s != null) {
            s.resume();
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                m6z0 m6z0Var = (m6z0) it.next();
                izy0 izy0Var = m6z0Var.d;
                if (izy0Var != null) {
                    izy0Var.f(s.i());
                }
                suy0 suy0Var = m6z0Var.c;
                suy0Var.b(s.i());
                suy0Var.c();
            }
        }
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void c() {
        jaz0 s = s();
        if (s != null) {
            s.stop();
        }
    }

    @Override // xsna.euy0
    public final void e(xey0 xey0Var) {
        xey0Var.T.d(1, IronSourceConstants.errorCode_showInProgress);
        h8z0.e(xey0Var.a, "closedByUser", 1, new bzc0(this, xey0Var));
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!((m6z0) it.next()).f) {
                return;
            }
        }
        q();
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void g(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.g(myTargetActivity, intent, frameLayout);
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m6z0 m6z0Var = (m6z0) it.next();
            tez0 tez0Var = m6z0Var.a;
            tez0Var.T.d(1, 5000);
            thz0 thz0Var = m6z0Var.b;
            if (thz0Var != null) {
                thz0Var.g();
                lgz0 lgz0Var = tez0Var.c0;
                m6z0Var.b = thz0.a(tez0Var, lgz0Var != null ? 3 : 2, lgz0Var, frameLayout.getContext());
            }
        }
        pdz0 pdz0Var = new pdz0(new hbz0(frameLayout.getContext()), arrayList, new a(this));
        this.l = new WeakReference(pdz0Var);
        frameLayout.addView(pdz0Var.i.getRootLayout(), new FrameLayout.LayoutParams(-1, -1));
        this.k = arrayList;
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void l() {
        super.l();
        WeakReference weakReference = this.l;
        if (weakReference != null) {
            jaz0 jaz0Var = (jaz0) weakReference.get();
            if (jaz0Var != null) {
                View i = jaz0Var.i();
                ViewParent parent = i.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(i);
                }
                jaz0Var.destroy();
            }
            this.l.clear();
            this.l = null;
        }
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            m6z0 m6z0Var = (m6z0) it.next();
            izy0 izy0Var = m6z0Var.d;
            if (izy0Var != null) {
                izy0Var.h();
                m6z0Var.d = null;
            }
            thz0 thz0Var = m6z0Var.b;
            if (thz0Var != null) {
                thz0Var.g();
            }
        }
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void m() {
        this.d = false;
        jaz0 s = s();
        if (s != null) {
            s.pause();
        }
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            m6z0 m6z0Var = (m6z0) it.next();
            izy0 izy0Var = m6z0Var.d;
            if (izy0Var != null) {
                izy0Var.h();
            }
            m6z0Var.c.b(null);
        }
    }

    @Override // xsna.euy0
    public final boolean r() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!((m6z0) it.next()).h) {
                return false;
            }
        }
        return true;
    }

    public final jaz0 s() {
        WeakReference weakReference = this.l;
        if (weakReference != null) {
            return (jaz0) weakReference.get();
        }
        return null;
    }
}
