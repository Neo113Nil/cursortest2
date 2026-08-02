package xsna;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.corpmailru.adsession.AdSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.c8x;
import xsna.exy0;
import xsna.faz0;
import xsna.s3z0;
import xsna.xrz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class p7z0 {
    public final c8x a;
    public final rez0 b;
    public final u6z0 c;
    public final ihz0 d;
    public final n0z0 e;
    public final mez0 f;
    public final s3z0.a g;
    public final i620 h;
    public mwy0 i;
    public volatile xrz0 j;
    public lgz0 k;
    public c8x.a l;
    public c8x.d m;
    public fvy0 o;
    public String p;
    public int u;
    public final a n = new a();
    public final faz0 q = new faz0(new b());
    public final jbz0 r = new jbz0();
    public float[] s = new float[0];
    public int t = 0;
    public final rcz0 v = new rcz0();
    public final c w = new c();

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements exy0.a {
        public a() {
        }

        @Override // xsna.exy0.a
        public final void b() {
            p7z0 p7z0Var = p7z0.this;
            if (p7z0Var.a.l == null) {
                gu8.c(null, "InstreamAdEngine: can't call onBannerShouldClose callback, instreamAdListener is null");
                return;
            }
            if (p7z0Var.k.E.equals("video-motion")) {
                gu8.c(null, "InstreamAdEngine: onVideoMotionBannerShouldClose called by adChoicesOption");
                return;
            }
            if (p7z0Var.k.E.equals("video")) {
                gu8.c(null, "InstreamAdEngine: onBannerShouldClose called by adChoicesOption");
                return;
            }
            gu8.c(null, "InstreamAdEngine: ignore " + p7z0Var.k.E + " banner type for closing by adChoicesOption");
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b {
        public c8x.a a;

        public b() {
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class c implements xrz0.a {
        public c() {
        }

        @Override // xsna.xrz0.a
        public final void a() {
            p7z0.this.f();
        }

        @Override // xsna.xrz0.a
        public final boolean b(ArrayList arrayList, ga40 ga40Var) {
            idy0 idy0Var = xr50.c;
            if (idy0Var == null) {
                gu8.c(null, "InstreamAdEngine: can't load after services - context is null");
                return false;
            }
            p7z0 p7z0Var = p7z0.this;
            w8z0 w8z0Var = new w8z0(arrayList, p7z0Var.c, p7z0Var.g, p7z0Var.u, null);
            w8z0Var.d = ga40Var;
            w8z0Var.e(p7z0Var.g.a(), idy0Var.a);
            return true;
        }

        @Override // xsna.xrz0.a
        public final void c(lgz0 lgz0Var) {
            p7z0.this.c(lgz0Var, "playbackStarted");
        }

        @Override // xsna.xrz0.a
        public final void d(lgz0 lgz0Var) {
            List list;
            boolean z;
            kiw kiwVar;
            kiw kiwVar2;
            boolean z2;
            p7z0 p7z0Var = p7z0.this;
            p7z0Var.k = lgz0Var;
            wty0 wty0Var = lgz0Var.L;
            c8x.d dVar = null;
            if (wty0Var != null) {
                p7z0Var.p = wty0Var.b;
                list = wty0Var.c;
            } else {
                list = null;
            }
            if (list != null) {
                p7z0Var.o = new fvy0(wty0Var, p7z0Var.h);
            }
            giy0 giy0Var = lgz0Var.T;
            if (!(lgz0Var instanceof bsz0)) {
                qhz0 qhz0Var = lgz0Var.v0;
                if (qhz0Var == null) {
                    gu8.c(null, "InstreamAdEngine: failed play instreamAd banner, media-data is empty");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (ArrayList arrayList2 = lgz0Var.U; i < new ArrayList(arrayList2).size(); arrayList2 = arrayList2) {
                    n4z0 n4z0Var = (n4z0) new ArrayList(arrayList2).get(i);
                    arrayList.add(new c8x.b(n4z0Var.B, n4z0Var.C, n4z0Var.U, n4z0Var.V, n4z0Var.W, n4z0Var.X, !TextUtils.isEmpty(n4z0Var.J), n4z0Var.Y, n4z0Var.Z, n4z0Var.a0, n4z0Var.b0, n4z0Var.c0, n4z0Var.d0, n4z0Var.H));
                    i++;
                }
                wty0 wty0Var2 = lgz0Var.L;
                if (wty0Var2 != null) {
                    kiwVar = wty0Var2.a;
                    z = true;
                } else {
                    z = false;
                    kiwVar = null;
                }
                cwm cwmVar = lgz0Var.X;
                ArrayList arrayList3 = cwmVar == null ? null : new ArrayList((ArrayList) cwmVar.b);
                oez0 oez0Var = lgz0Var.d0;
                ejb0 ejb0Var = lgz0Var.e0;
                mnh0 mnh0Var = ejb0Var != null ? (mnh0) ejb0Var.a : null;
                ka9 ka9Var = oez0Var != null ? new ka9(oez0Var.c, oez0Var.d, oez0Var.e, oez0Var.a, oez0Var.f, mnh0Var) : new ka9(lgz0Var.n(), null, null, lgz0Var.e, null, mnh0Var);
                y5z0 y5z0Var = lgz0Var.f0;
                p7z0Var.l = new c8x.a(lgz0Var.F, lgz0Var.l0, lgz0Var.q0, lgz0Var.D, lgz0Var.g(), lgz0Var.q(), lgz0Var.p0, lgz0Var.W != null, arrayList, z, lgz0Var.r, lgz0Var.w0, lgz0Var.x0, ka9Var, y5z0Var != null ? (int) (y5z0Var.b * 1000.0d) : 0, kiwVar, arrayList3, lgz0Var.H, lgz0Var.g, lgz0Var.h);
                new ArrayList(p7z0Var.l.k);
                giy0Var.e(1, yup.PERMISSION_NOT_DECLARED, lgz0Var.v());
                p7z0Var.d.b(lgz0Var, false);
                return;
            }
            bsz0 bsz0Var = (bsz0) lgz0Var;
            wty0 wty0Var3 = bsz0Var.L;
            if (wty0Var3 != null) {
                kiwVar2 = wty0Var3.a;
                z2 = true;
            } else {
                kiwVar2 = null;
                z2 = false;
            }
            rvu rvuVar = bsz0Var.y0;
            if (rvuVar == null) {
                gu8.c(null, "InstreamAdVideoMotionBanner: internalVideoMotionData is null");
            } else {
                q7z0 q7z0Var = (q7z0) rvuVar.b;
                xvu xvuVar = new xvu(q7z0Var.a, q7z0Var.b, q7z0Var.c, q7z0Var.d, q7z0Var.e);
                ArrayList arrayList4 = (ArrayList) rvuVar.c;
                ArrayList arrayList5 = new ArrayList();
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    ljz0 ljz0Var = (ljz0) it.next();
                    arrayList5.add(new wws0(ljz0Var.a, ljz0Var.g, ljz0Var.h, ljz0Var.b, ljz0Var.c, ljz0Var.d, ljz0Var.e));
                }
                jxb0 jxb0Var = (jxb0) rvuVar.d;
                dVar = new c8x.d(bsz0Var.F, bsz0Var.l0, bsz0Var.q0, bsz0Var.D, z2, kiwVar2, new vws0(xvuVar, arrayList5, jxb0Var != null ? new m0n((String) jxb0Var.b) : null), bsz0Var.H);
            }
            p7z0Var.m = dVar;
            if (dVar == null) {
                gu8.c(null, "InstreamAdEngine: can't create instreamAdVideoMotionBanner");
                return;
            }
            giy0Var.e(1, yup.PERMISSION_NOT_DECLARED, lgz0Var.v());
            n0z0 n0z0Var = p7z0Var.e;
            n0z0Var.d = bsz0Var;
            n0z0Var.e = new HashSet();
            e8x e8xVar = n0z0Var.b;
            if (e8xVar != null) {
                e8xVar.c();
                return;
            }
            gu8.c(null, "InstreamVideoMotionController: can't start videoMotionBanner. VideoMotionPlayer is null");
            f fVar = n0z0Var.c;
            if (fVar == null) {
                return;
            }
            fVar.a(bsz0Var);
        }

        @Override // xsna.xrz0.a
        public final void a(xrz0 xrz0Var, boolean z) {
            p7z0 p7z0Var = p7z0.this;
            if (z) {
                p7z0Var.e(xrz0Var);
            } else {
                p7z0Var.d(xrz0Var);
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class d {
        public final b1z0 a;
        public final mez0 b;
        public final WeakReference c;

        public d(b1z0 b1z0Var, mez0 mez0Var, Context context) {
            this.a = b1z0Var;
            this.b = mez0Var;
            this.c = new WeakReference(context.getApplicationContext());
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class e {
        public e() {
        }

        public final void a(lgz0 lgz0Var) {
            faz0 faz0Var;
            lxd lxdVar;
            int i;
            a6z0 a6z0Var;
            p7z0 p7z0Var = p7z0.this;
            ihz0 ihz0Var = p7z0Var.d;
            if (b(lgz0Var)) {
                return;
            }
            b1z0 b1z0Var = lgz0Var.W;
            if (b1z0Var != null && p7z0Var.t != 0 && p7z0Var.i != null) {
                long currentTimeMillis = System.currentTimeMillis();
                WeakReference weakReference = p7z0Var.i.e;
                long andResetInteractionEnd = (weakReference == null || (a6z0Var = (a6z0) weakReference.get()) == null) ? 0L : a6z0Var.getAndResetInteractionEnd();
                long j = b1z0Var.V;
                StringBuilder b = fp.b(currentTimeMillis, "InstreamAdEngine$VideoControllerListener: cm=", ", vi=");
                b.append(andResetInteractionEnd);
                b.append(", it=");
                b.append(j);
                gu8.c(null, b.toString());
                if (currentTimeMillis - andResetInteractionEnd < j) {
                    p7z0Var.c(b1z0Var, "shoppableReplay");
                    ihz0Var.b(lgz0Var, true);
                    return;
                } else {
                    ihz0Var.e();
                    p7z0Var.t = 2;
                }
            }
            c8x c8xVar = p7z0Var.a;
            d8x d8xVar = c8xVar.j;
            y5z0 y5z0Var = p7z0Var.k.f0;
            if (y5z0Var == null || (lxdVar = (faz0Var = p7z0Var.q).d) == null || (i = faz0Var.e) != 0) {
                c8x.c cVar = c8xVar.l;
                if (cVar != null) {
                    cVar.f();
                }
                if (p7z0Var.t == 0) {
                    p7z0Var.g();
                }
            } else if (lxdVar != null && i == 0) {
                faz0Var.f = y5z0Var.c;
                int i2 = (int) (y5z0Var.b * 1000.0d);
                if (i2 == 0) {
                    gu8.c("InstreamAdPostViewCtrl", "Duration of PostViewInfo is 0. Skip playing.");
                } else {
                    if (faz0Var.d()) {
                        gu8.c("InstreamAdPostViewCtrl", "Show was called while player is still playing");
                        faz0Var.c();
                    }
                    faz0Var.h = true;
                    faz0.a aVar = new faz0.a(new daz0(faz0Var, y5z0Var, i2));
                    faz0Var.g = aVar;
                    aVar.d = i2;
                    aVar.e = false;
                    daz0 daz0Var = aVar.b;
                    faz0 faz0Var2 = daz0Var.c;
                    y5z0 y5z0Var2 = daz0Var.a;
                    lxd lxdVar2 = faz0Var2.d;
                    if (lxdVar2 != null) {
                        com.vk.movika.sdk.android.defaultplayer.utils.c cVar2 = new com.vk.movika.sdk.android.defaultplayer.utils.c(y5z0Var2.e, y5z0Var2.a, y5z0Var2.d);
                        lxdVar2.c = cVar2;
                        n9c0 n9c0Var = (n9c0) lxdVar2.b;
                        if (n9c0Var != null) {
                            n9c0Var.n4((sc0) lxdVar2.a, cVar2);
                            n9c0Var.h0(true);
                        }
                        gu8.c("InstreamAdPostViewCtrl", "Player is shown");
                    }
                    b bVar = faz0Var2.a;
                    p7z0 p7z0Var2 = p7z0.this;
                    bVar.a = p7z0Var2.l;
                    c8x.c cVar3 = p7z0Var2.a.l;
                    if (cVar3 != null) {
                        cVar3.k();
                    }
                    faz0Var2.e = 1;
                    ou4 ou4Var = aVar.f;
                    saz0 saz0Var = aVar.a;
                    if (ou4Var != null) {
                        saz0Var.h(ou4Var);
                    }
                    ou4 ou4Var2 = new ou4(aVar, 13);
                    aVar.f = ou4Var2;
                    saz0Var.c(ou4Var2);
                }
            }
            ejb0 ejb0Var = lgz0Var.e0;
            if (ejb0Var != null) {
                jbz0 jbz0Var = p7z0Var.r;
                jbz0Var.getClass();
                n52 n52Var = jbz0Var.b;
                Handler handler = jbz0Var.a;
                int i3 = ((mhy0) ejb0Var.b).a;
                if (i3 > 0) {
                    handler.postDelayed(n52Var, i3 * 1000);
                } else {
                    handler.removeCallbacks(n52Var);
                }
            }
        }

        public final boolean b(lgz0 lgz0Var) {
            if (p7z0.this.j == null) {
                return true;
            }
            p7z0 p7z0Var = p7z0.this;
            return p7z0Var.k != lgz0Var || p7z0Var.l == null;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class f {
        public f() {
        }

        public final void a(bsz0 bsz0Var) {
            p7z0 p7z0Var = p7z0.this;
            if (p7z0Var.j != null) {
                p7z0 p7z0Var2 = p7z0.this;
                if (p7z0Var2.k != bsz0Var || p7z0Var2.m == null) {
                    return;
                }
                c8x c8xVar = p7z0Var.a;
                d8x d8xVar = c8xVar.j;
                c8x.c cVar = c8xVar.l;
                if (cVar != null) {
                    cVar.e();
                }
                if (p7z0Var.t == 0) {
                    p7z0Var.g();
                }
            }
        }
    }

    public p7z0(c8x c8xVar, rez0 rez0Var, u6z0 u6z0Var, s3z0.a aVar, i620 i620Var) {
        this.a = c8xVar;
        this.b = rez0Var;
        this.c = u6z0Var;
        this.g = aVar;
        ihz0 ihz0Var = new ihz0();
        this.d = ihz0Var;
        ihz0Var.h = new e();
        u6z0 u6z0Var2 = c8xVar.a;
        mez0 a2 = mez0.a(u6z0Var2.a);
        this.f = a2;
        qnk qnkVar = u6z0Var2.a;
        n0z0 n0z0Var = new n0z0(a2);
        this.e = n0z0Var;
        n0z0Var.c = new f();
        this.h = i620Var;
    }

    public final void a(String str, String str2) {
        d8x d8xVar = this.d.g;
        if ((d8xVar == null ? null : d8xVar.getView().getContext()) == null) {
            gu8.c(null, "InstreamAdEngine: Can't send stat - context is null");
            return;
        }
        lgz0 lgz0Var = this.k;
        if (lgz0Var == null) {
            gu8.c(null, "InstreamAdEngine: hasn't current banner");
            return;
        }
        cwm cwmVar = lgz0Var.X;
        if (cwmVar == null) {
            gu8.c(null, "InstreamAdEngine: hasn't shoppableAdsData");
            return;
        }
        Iterator it = ((ArrayList) cwmVar.b).iterator();
        while (it.hasNext()) {
            gaz0 gaz0Var = (gaz0) it.next();
            if (str.equals(gaz0Var.b)) {
                h8z0.e(gaz0Var.i, str2, 999, null);
                h8z0.e((e5z0) cwmVar.c, str2, 999, null);
                return;
            }
        }
        gu8.c(null, "InstreamAdEngine: wrong shoppableAdsItemId");
    }

    public final void b(d8x d8xVar) {
        ihz0 ihz0Var = this.d;
        kwy0 kwy0Var = ihz0Var.b;
        d8x d8xVar2 = ihz0Var.g;
        if (d8xVar2 != null) {
            d8xVar2.b(null);
        }
        ihz0Var.g = d8xVar;
        if (d8xVar == null) {
            f5z0 f5z0Var = ihz0Var.e;
            if (f5z0Var != null) {
                f5z0Var.d(null);
            }
            izy0 izy0Var = ihz0Var.d;
            if (izy0Var != null) {
                izy0Var.h();
            }
            kwy0Var.g = null;
            return;
        }
        View view = d8xVar.getView();
        f5z0 f5z0Var2 = ihz0Var.e;
        if (f5z0Var2 != null) {
            f5z0Var2.d(view);
        }
        izy0 izy0Var2 = ihz0Var.d;
        if (izy0Var2 != null && izy0Var2.g) {
            izy0Var2.j = new WeakReference(view);
            if (view instanceof ViewGroup) {
                izy0Var2.d((ViewGroup) view);
            }
        }
        d8xVar.b(ihz0Var);
        kwy0Var.g = view.getContext();
        thz0 thz0Var = ihz0Var.f;
        if (thz0Var != null) {
            View view2 = d8xVar.getView();
            AdSession adSession = thz0Var.g;
            if (adSession == null) {
                return;
            }
            try {
                adSession.registerAdView(view2);
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("OmTracker: Unable to register view: "), th);
            }
        }
    }

    public final void c(xey0 xey0Var, String str) {
        if (xey0Var == null) {
            gu8.c(null, "InstreamAdEngine: Can't send stat - banner is null");
            return;
        }
        d8x d8xVar = this.d.g;
        if ((d8xVar == null ? null : d8xVar.getView().getContext()) == null) {
            gu8.c(null, "InstreamAdEngine: Can't send stat - context is null");
        } else {
            h8z0.e(xey0Var.a, str, 1, null);
        }
    }

    public final void d(xrz0 xrz0Var) {
        if (xrz0Var != null) {
            faz0 faz0Var = this.q;
            if (faz0Var.d()) {
                faz0Var.c();
            } else {
                this.d.e();
            }
            e(xrz0Var);
        }
    }

    public final void e(xrz0 xrz0Var) {
        lgz0 lgz0Var = this.k;
        if (lgz0Var != null) {
            lgz0Var.T.e(1, yup.INVALID_PERMISSION_RATIONALE_DECLARATION, lgz0Var.v());
        }
        this.v.c(xrz0Var);
        if (xrz0Var != this.j) {
            return;
        }
        f();
        this.k = null;
        this.l = null;
        this.m = null;
        this.j = null;
        c8x.c cVar = this.a.l;
        if (cVar != null) {
            cVar.onComplete(xrz0Var.c.c);
        }
    }

    public final void f() {
        a6z0 a6z0Var;
        this.t = 0;
        mwy0 mwy0Var = this.i;
        if (mwy0Var == null) {
            return;
        }
        gu8.c(null, "ShoppableAdPresenter: destroy presenter");
        izy0 izy0Var = mwy0Var.c;
        izy0Var.l = null;
        izy0Var.h();
        WeakReference weakReference = mwy0Var.e;
        if (weakReference != null && (a6z0Var = (a6z0) weakReference.get()) != null) {
            a6z0Var.setListener(null);
        }
        mwy0Var.e = null;
        this.i.f = null;
        this.i = null;
    }

    public final void g() {
        xrz0 xrz0Var = this.j;
        if (xrz0Var != null) {
            xrz0Var.f();
        } else {
            f();
        }
    }
}
