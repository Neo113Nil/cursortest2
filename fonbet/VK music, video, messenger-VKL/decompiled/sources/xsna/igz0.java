package xsna;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.iab.omid.library.corpmailru.adsession.CreativeType;
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
public final class igz0 extends euy0 {
    public final b6z0 k;
    public final boolean l;
    public final suy0 m;
    public thz0 n;
    public tez0 o;
    public WeakReference p;
    public izy0 q;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements u7z0.a {
        public final igz0 a;

        public a(igz0 igz0Var) {
            this.a = igz0Var;
        }

        @Override // xsna.jaz0.a
        public final void a(boolean z) {
            this.a.j = z;
        }

        @Override // xsna.u7z0.a
        public final void b() {
            igz0 igz0Var = this.a;
            tez0 tez0Var = igz0Var.o;
            h8z0.e(tez0Var.a, "error", 1, new xyf(igz0Var, tez0Var));
            tez0Var.T.b(0, 0, 5500, null, null);
            igz0Var.o.T.d(1, IronSourceConstants.errorCode_showInProgress);
            igz0Var.q();
        }

        @Override // xsna.jaz0.a
        public final void e(xey0 xey0Var) {
            this.a.e(xey0Var);
        }

        @Override // xsna.jaz0.a
        public final void f(xey0 xey0Var) {
            igz0 igz0Var = this.a;
            igz0Var.getClass();
            xey0Var.T.d(1, IronSourceConstants.errorCode_showInProgress);
            h8z0.e(xey0Var.a, "closedByUser", 999, null);
            igz0Var.q();
        }

        @Override // xsna.u7z0.a
        public final void h(nxy0 nxy0Var, String str) {
            this.a.getClass();
            h8z0.e(nxy0Var.a, str, 999, null);
        }

        @Override // xsna.jaz0.a
        public final void j(xey0 xey0Var, View view) {
            igz0 igz0Var = this.a;
            izy0 izy0Var = igz0Var.q;
            if (izy0Var != null) {
                izy0Var.h();
            }
            izy0 b = izy0.b(xey0Var.b, xey0Var.a, new vvi0(igz0Var, 13));
            igz0Var.q = b;
            b.l = new hgz0(igz0Var, view);
            if (igz0Var.d) {
                b.f(view);
            }
            qjk0.a(new StringBuilder("InterstitialAdPromoEngine: Ad shown, banner Id = "), xey0Var.F, null);
        }

        @Override // xsna.u7z0.a
        public final void e() {
            this.a.t();
        }

        @Override // xsna.jaz0.a
        public final void a(double d) {
            this.a.p(d);
        }

        @Override // xsna.u7z0.a
        public final void a(float f, float f2) {
            igz0 igz0Var = this.a;
            b6z0 b6z0Var = igz0Var.k;
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
            h8z0.g(a, 1, new aox0(igz0Var, 3));
        }

        @Override // xsna.jaz0.a
        public final void b(xey0 xey0Var, String str, int i, fiz0 fiz0Var, Context context) {
            xey0 xey0Var2;
            int i2;
            String str2;
            if (xey0Var != null) {
                igz0 igz0Var = this.a;
                ff6 ff6Var = igz0Var.c;
                if (igz0Var.u() == null) {
                    return;
                }
                mez0 a = mez0.a(ff6Var.a.a);
                if (TextUtils.isEmpty(str)) {
                    a.c(xey0Var, i, fiz0Var, context);
                    xey0Var2 = xey0Var;
                    i2 = i;
                } else {
                    xey0Var2 = xey0Var;
                    i2 = i;
                    a.e(xey0Var2, str, i2, fiz0Var, null, context);
                }
                boolean z = xey0Var2 instanceof wfy0;
                if (z) {
                    if (i2 == 2 && igz0Var.o.K != null) {
                        str2 = "ctaClick";
                    } else {
                        str2 = "click";
                    }
                    h8z0.e(igz0Var.o.a, str2, 2, null);
                }
                hjz0.a aVar = igz0Var.a;
                String str3 = igz0Var.o.F;
                aVar.g(new hox.a());
                if ((z || (xey0Var2 instanceof tez0)) && igz0Var.o.s()) {
                    igz0Var.o.T.d(1, IronSourceConstants.errorCode_showInProgress);
                    igz0Var.q();
                }
            }
        }

        @Override // xsna.u7z0.a
        public final void a(WebView webView) {
            igz0 igz0Var = this.a;
            thz0 thz0Var = igz0Var.n;
            if (thz0Var == null || thz0Var.a != CreativeType.HTML_DISPLAY) {
                return;
            }
            thz0Var.d(webView, new thz0.b[0]);
            jaz0 u = igz0Var.u();
            if (u == null) {
                return;
            }
            View closeButton = u.getCloseButton();
            if (closeButton != null) {
                igz0Var.n.f(new thz0.b(closeButton));
            }
            igz0Var.n.h();
        }

        @Override // xsna.u7z0.a
        public final void k() {
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b {
        public final igz0 a;

        public b(igz0 igz0Var) {
            this.a = igz0Var;
        }

        public final void a(float f) {
            igz0 igz0Var = this.a;
            hjz0.b bVar = igz0Var.b;
            if (bVar != null) {
                String str = igz0Var.o.F;
                hox.f fVar = (hox.f) bVar;
                if (b920.b(fVar.a, f) != 0) {
                    fVar.a = f;
                }
            }
        }

        public final void b() {
            igz0 igz0Var = this.a;
            hjz0.b bVar = igz0Var.b;
            if (bVar != null) {
                String str = igz0Var.o.F;
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
            igz0Var.t();
            hkz0 hkz0Var = igz0Var.o.d0;
            jaz0 u = igz0Var.u();
            ViewParent parent = u != null ? u.i().getParent() : null;
            if (hkz0Var == null || !(parent instanceof ViewGroup)) {
                return;
            }
            int i = igz0Var.o.i0;
            ViewGroup viewGroup = (ViewGroup) parent;
            jaz0 u2 = igz0Var.u();
            if (u2 != null) {
                u2.destroy();
            }
            if (hkz0Var instanceof nxy0) {
                viewGroup.removeAllViews();
                if (i == 3) {
                    thz0 thz0Var = igz0Var.n;
                    if (thz0Var != null) {
                        thz0Var.g();
                    }
                    thz0 a = thz0.a(hkz0Var, 2, null, viewGroup.getContext());
                    igz0Var.n = a;
                    huy0 huy0Var = new huy0(new guy0(a, viewGroup.getContext()), (nxy0) hkz0Var, new a(igz0Var));
                    igz0Var.p = new WeakReference(huy0Var);
                    viewGroup.addView(huy0Var.b, new FrameLayout.LayoutParams(-1, -1));
                    return;
                }
                thz0 thz0Var2 = igz0Var.n;
                if (thz0Var2 != null) {
                    thz0Var2.g();
                }
                igz0Var.n = thz0.a(hkz0Var, 2, null, viewGroup.getContext());
                u7z0 w4z0Var = CampaignEx.JSON_KEY_MRAID.equals(hkz0Var.E) ? new w4z0(viewGroup.getContext()) : new cwy0(viewGroup.getContext());
                igz0Var.p = new WeakReference(w4z0Var);
                w4z0Var.e(new a(igz0Var));
                w4z0Var.d((nxy0) hkz0Var);
                viewGroup.addView(w4z0Var.i(), new FrameLayout.LayoutParams(-1, -1));
                return;
            }
            if (!(hkz0Var instanceof p0z0)) {
                if (hkz0Var instanceof tez0) {
                    viewGroup.removeAllViews();
                    igz0Var.s((tez0) hkz0Var, viewGroup);
                    return;
                }
                return;
            }
            viewGroup.removeAllViews();
            if (i == 3) {
                p0z0 p0z0Var = (p0z0) hkz0Var;
                thz0 thz0Var3 = igz0Var.n;
                if (thz0Var3 != null) {
                    thz0Var3.g();
                }
                guy0 guy0Var = new guy0(igz0Var.n, viewGroup.getContext());
                igz0Var.n = thz0.a(p0z0Var, 2, null, viewGroup.getContext());
                bzy0 bzy0Var = new bzy0(guy0Var, p0z0Var, new a(igz0Var));
                igz0Var.p = new WeakReference(bzy0Var);
                viewGroup.addView(bzy0Var.g, new FrameLayout.LayoutParams(-1, -1));
                return;
            }
            p0z0 p0z0Var2 = (p0z0) hkz0Var;
            thz0 thz0Var4 = igz0Var.n;
            if (thz0Var4 != null) {
                thz0Var4.g();
            }
            igz0Var.n = thz0.a(p0z0Var2, 2, null, viewGroup.getContext());
            rxy0 rxy0Var = new rxy0(new zyy0(viewGroup.getContext()), new a(igz0Var));
            igz0Var.p = new WeakReference(rxy0Var);
            rxy0Var.a(p0z0Var2);
            viewGroup.addView(rxy0Var.c, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public igz0(ff6 ff6Var, tez0 tez0Var, ikz0 ikz0Var, boolean z, hjz0.a aVar, hjz0.b bVar) {
        super(aVar, ff6Var, bVar);
        this.o = tez0Var;
        this.l = z;
        this.m = suy0.a(tez0Var.a, new hoi0(aVar, tez0Var));
        this.k = tez0Var.a.m();
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void a() {
        this.d = true;
        jaz0 u = u();
        if (u != null) {
            u.resume();
            izy0 izy0Var = this.q;
            if (izy0Var != null) {
                izy0Var.f(u.i());
            }
            View i = u.i();
            suy0 suy0Var = this.m;
            suy0Var.b(i);
            suy0Var.c();
        }
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void c() {
        jaz0 u = u();
        if (u != null) {
            u.stop();
        }
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void g(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.g(myTargetActivity, intent, frameLayout);
        s(this.o, frameLayout);
    }

    @Override // xsna.euy0, com.my.target.common.MyTargetActivity.a
    public final void l() {
        super.l();
        if (this.o.V <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            t();
        }
        WeakReference weakReference = this.p;
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
            this.p.clear();
            this.p = null;
        }
        izy0 izy0Var = this.q;
        if (izy0Var != null) {
            izy0Var.h();
            this.q = null;
        }
        thz0 thz0Var = this.n;
        if (thz0Var != null) {
            thz0Var.g();
        }
    }

    @Override // com.my.target.common.MyTargetActivity.a
    public final void m() {
        this.d = false;
        jaz0 u = u();
        if (u != null) {
            u.pause();
        }
        izy0 izy0Var = this.q;
        if (izy0Var != null) {
            izy0Var.h();
        }
        this.m.b(null);
    }

    @Override // xsna.euy0
    public final boolean r() {
        return this.o.Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(tez0 tez0Var, ViewGroup viewGroup) {
        jgz0 jgz0Var;
        thz0 thz0Var = this.n;
        if (thz0Var != null) {
            thz0Var.g();
        }
        tez0Var.T.d(1, 5000);
        lgz0 lgz0Var = tez0Var.c0;
        thz0 a2 = thz0.a(tez0Var, lgz0Var != null ? 3 : 2, lgz0Var, viewGroup.getContext());
        this.n = a2;
        int i = tez0Var.i0;
        boolean z = this.l;
        if (i == 2) {
            ogz0 ogz0Var = new ogz0(tez0Var.a0, a2, viewGroup.getContext());
            ogz0Var.e = z;
            phz0 phz0Var = new phz0(ogz0Var, tez0Var, new a(this), new b(this), new m3z0(2, this, tez0Var));
            vez0 vez0Var = phz0Var.l;
            jgz0Var = phz0Var;
            if (vez0Var != null) {
                phz0 phz0Var2 = vez0Var.b;
                if (vez0Var.c.h0) {
                    phz0Var2.l();
                    vez0Var.e();
                    jgz0Var = phz0Var;
                } else {
                    nuy0 nuy0Var = phz0Var2.e;
                    nuy0Var.d(true);
                    nuy0Var.a(0, null);
                    nuy0Var.e(false);
                    phz0Var2.g.setVisible(false);
                    jgz0Var = phz0Var;
                }
            }
        } else if (i == 3) {
            guy0 guy0Var = new guy0(a2, viewGroup.getContext());
            guy0Var.c = z;
            pbz0 pbz0Var = new pbz0(guy0Var, tez0Var, new a(this), new b(this), new xqg0(2, this, tez0Var));
            lgz0 lgz0Var2 = pbz0Var.n;
            jgz0Var = pbz0Var;
            if (lgz0Var2 != null) {
                cez0 cez0Var = pbz0Var.o;
                jgz0Var = pbz0Var;
                if (cez0Var != null) {
                    if (lgz0Var2.h0) {
                        pbz0Var.t();
                        jgz0Var = pbz0Var;
                    } else {
                        cez0Var.e();
                        jgz0Var = pbz0Var;
                    }
                }
            }
        } else {
            bfz0 bfz0Var = new bfz0(a2, viewGroup.getContext());
            bfz0Var.c = z;
            jgz0Var = new jgz0(bfz0Var, tez0Var, new a(this), new b(this), new yqg0(this, tez0Var), viewGroup.getContext());
        }
        this.p = new WeakReference(jgz0Var);
        viewGroup.addView(jgz0Var.i(), new FrameLayout.LayoutParams(-1, -1));
        this.o = tez0Var;
    }

    public final void t() {
        if (this.e) {
            return;
        }
        this.e = true;
        ijg0.c cVar = this.i;
        if (cVar != null) {
            h8z0.e(this.o.a, C4572u.j, 999, new ggz0(this));
            cVar.a(new fvr());
        }
    }

    public final jaz0 u() {
        WeakReference weakReference = this.p;
        if (weakReference != null) {
            return (jaz0) weakReference.get();
        }
        return null;
    }
}
