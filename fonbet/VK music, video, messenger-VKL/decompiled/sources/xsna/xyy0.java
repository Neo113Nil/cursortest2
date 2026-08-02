package xsna;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.C4572u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.common.MyTargetActivity;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import xsna.cxs;
import xsna.hjz0;
import xsna.hox;
import xsna.ijg0;
import xsna.thz0;
import xsna.u7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class xyy0 extends euy0 {
    public final nxy0 k;
    public final b6z0 l;
    public WeakReference m;
    public izy0 n;
    public final suy0 o;
    public thz0 p;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements u7z0.a {
        public final xyy0 a;
        public final nxy0 b;
        public final hjz0.a c;
        public final xhb0 d;
        public final qnk e;

        public a(xyy0 xyy0Var, nxy0 nxy0Var, hjz0.a aVar, xhb0 xhb0Var, qnk qnkVar) {
            this.a = xyy0Var;
            this.b = nxy0Var;
            this.c = aVar;
            this.e = qnkVar;
            this.d = xhb0Var;
        }

        @Override // xsna.u7z0.a
        public final void a(float f, float f2) {
            xyy0 xyy0Var = this.a;
            b6z0 b6z0Var = xyy0Var.l;
            if (b6z0Var.c.isEmpty()) {
                return;
            }
            float f3 = f2 - f;
            b6z0 a = b6z0Var.a();
            Iterator it = b6z0Var.c.iterator();
            while (it.hasNext()) {
                e9z0 e9z0Var = (e9z0) it.next();
                float f4 = e9z0Var.f;
                if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f5 = e9z0Var.g;
                    if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f4 = (f2 / 100.0f) * f5;
                    }
                }
                if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 <= f3) {
                    a.c.add(e9z0Var);
                    it.remove();
                }
            }
            h8z0.g(a, 1, new ao90(xyy0Var, 13));
        }

        @Override // xsna.jaz0.a
        public final void b(xey0 xey0Var, String str, int i, fiz0 fiz0Var, Context context) {
            mez0 a = mez0.a(this.e);
            boolean isEmpty = TextUtils.isEmpty(str);
            nxy0 nxy0Var = this.b;
            if (isEmpty) {
                a.c(nxy0Var, i, fiz0Var, context);
            } else {
                a.e(this.b, str, i, fiz0Var, null, context);
            }
            String str2 = nxy0Var.F;
            this.c.g(new hox.a());
        }

        @Override // xsna.jaz0.a
        public final void e(xey0 xey0Var) {
            this.a.e(xey0Var);
        }

        @Override // xsna.jaz0.a
        public final void f(xey0 xey0Var) {
            xey0Var.T.d(1, IronSourceConstants.errorCode_showInProgress);
            h8z0.e(xey0Var.a, "closedByUser", 999, this.d);
            this.a.q();
        }

        @Override // xsna.u7z0.a
        public final void h(nxy0 nxy0Var, String str) {
            h8z0.e(nxy0Var.a, str, 999, new ccd(this.a, nxy0Var));
        }

        @Override // xsna.jaz0.a
        public final void j(xey0 xey0Var, View view) {
            qjk0.a(new StringBuilder("InterstitialAdHtmlEngine$InterstitialWebViewPresenterListener: Ad shown, banner Id = "), this.b.F, null);
            xyy0 xyy0Var = this.a;
            izy0 izy0Var = xyy0Var.n;
            if (izy0Var != null) {
                izy0Var.h();
            }
            nxy0 nxy0Var = xyy0Var.k;
            izy0 b = izy0.b(nxy0Var.b, nxy0Var.a, new aox0(xyy0Var, 1));
            xyy0Var.n = b;
            if (xyy0Var.d) {
                b.f(view);
            }
            qjk0.a(new StringBuilder("InterstitialAdHtmlEngine: Ad shown, banner Id = "), xey0Var.F, null);
        }

        @Override // xsna.u7z0.a
        public final void k() {
            this.b.T.d(1, IronSourceConstants.errorCode_showInProgress);
            this.a.q();
        }

        @Override // xsna.u7z0.a
        public final void e() {
            xyy0 xyy0Var = this.a;
            nxy0 nxy0Var = xyy0Var.k;
            if (xyy0Var.e) {
                return;
            }
            xyy0Var.e = true;
            hjz0.b bVar = xyy0Var.b;
            if (bVar != null) {
                String str = nxy0Var.F;
                hox hoxVar = hox.this;
                ur50 ur50Var = hoxVar.m;
                if (ur50Var != null) {
                    cxs.a aVar = ur50Var.a.a;
                    if (aVar != null) {
                        aVar.onCompleted();
                    }
                } else {
                    hox.d dVar = hoxVar.j;
                    if (dVar != null) {
                        dVar.f();
                    }
                }
            }
            ijg0.c cVar = xyy0Var.i;
            if (cVar != null) {
                h8z0.e(nxy0Var.a, C4572u.j, 999, new o860(xyy0Var, 18));
                cVar.a(new fvr());
            }
        }

        @Override // xsna.u7z0.a
        public final void b() {
            nxy0 nxy0Var = this.b;
            e5z0 e5z0Var = nxy0Var.a;
            xyy0 xyy0Var = this.a;
            h8z0.e(e5z0Var, "error", 1, new xyf(xyy0Var, nxy0Var));
            nxy0Var.T.b(0, 0, 5500, null, null);
            nxy0Var.T.d(1, IronSourceConstants.errorCode_showInProgress);
            xyy0Var.q();
        }

        @Override // xsna.jaz0.a
        public final void a(boolean z) {
            this.a.j = z;
        }

        @Override // xsna.jaz0.a
        public final void a(double d) {
            this.a.p(d);
        }

        @Override // xsna.u7z0.a
        public final void a(WebView webView) {
            xyy0 xyy0Var = this.a;
            if (xyy0Var.p == null) {
                return;
            }
            WeakReference weakReference = xyy0Var.m;
            u7z0 u7z0Var = weakReference != null ? (u7z0) weakReference.get() : null;
            if (u7z0Var == null) {
                return;
            }
            xyy0Var.p.d(webView, new thz0.b[0]);
            View closeButton = u7z0Var.getCloseButton();
            if (closeButton != null) {
                xyy0Var.p.f(new thz0.b(closeButton));
            }
            xyy0Var.p.h();
        }
    }

    public xyy0(ff6 ff6Var, nxy0 nxy0Var, ikz0 ikz0Var, hjz0.a aVar, hjz0.b bVar) {
        super(aVar, ff6Var, bVar);
        this.k = nxy0Var;
        this.o = suy0.a(nxy0Var.a, new vxb(aVar, nxy0Var));
        this.l = nxy0Var.a.m();
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void a() {
        u7z0 u7z0Var;
        this.d = true;
        WeakReference weakReference = this.m;
        if (weakReference == null || (u7z0Var = (u7z0) weakReference.get()) == null) {
            return;
        }
        u7z0Var.resume();
        izy0 izy0Var = this.n;
        if (izy0Var != null) {
            izy0Var.f(u7z0Var.i());
        }
        View i = u7z0Var.i();
        suy0 suy0Var = this.o;
        suy0Var.b(i);
        suy0Var.c();
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void g(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.g(myTargetActivity, intent, frameLayout);
        nxy0 nxy0Var = this.k;
        nxy0Var.T.d(1, 5000);
        this.p = thz0.a(nxy0Var, 1, null, frameLayout.getContext());
        u7z0 w4z0Var = CampaignEx.JSON_KEY_MRAID.equals(nxy0Var.E) ? new w4z0(frameLayout.getContext()) : new cwy0(frameLayout.getContext());
        this.m = new WeakReference(w4z0Var);
        w4z0Var.e(new a(this, this.k, this.a, new xhb0(this, 21), this.c.a.a));
        w4z0Var.d(nxy0Var);
        frameLayout.addView(w4z0Var.i(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void l() {
        u7z0 u7z0Var;
        super.l();
        izy0 izy0Var = this.n;
        if (izy0Var != null) {
            izy0Var.h();
            this.n = null;
        }
        thz0 thz0Var = this.p;
        if (thz0Var != null) {
            thz0Var.g();
        }
        WeakReference weakReference = this.m;
        if (weakReference != null && (u7z0Var = (u7z0) weakReference.get()) != null) {
            u7z0Var.a(this.p != null ? 7000 : 0);
        }
        this.m = null;
        suy0 suy0Var = this.o;
        suy0Var.b(null);
        suy0Var.d();
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void m() {
        u7z0 u7z0Var;
        this.d = false;
        WeakReference weakReference = this.m;
        if (weakReference != null && (u7z0Var = (u7z0) weakReference.get()) != null) {
            u7z0Var.pause();
        }
        izy0 izy0Var = this.n;
        if (izy0Var != null) {
            izy0Var.h();
        }
        this.o.b(null);
    }

    @Override // xsna.euy0
    public final boolean r() {
        return this.k.Z;
    }
}
