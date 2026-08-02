package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.igz0;
import xsna.kkz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class jgz0 implements jaz0 {
    public final saz0 b;
    public final fs2 c;
    public final tez0 d;
    public final ViewGroup e;
    public final igz0.a f;
    public final fvy0 g;
    public final ViewGroup h;
    public final fxy0 i;
    public final sgy0 j;
    public v1z0 k;
    public long l;
    public long m;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements View.OnClickListener {
        public final jgz0 b;

        public a(jgz0 jgz0Var) {
            this.b = jgz0Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            jgz0 jgz0Var = this.b;
            v1z0 v1z0Var = jgz0Var.k;
            if (v1z0Var != null) {
                ojz0 ojz0Var = v1z0Var.d;
                ojz0Var.a(true);
                v1z0Var.b(ojz0Var.getView().getContext());
                if (v1z0Var.l) {
                    v1z0Var.f.j();
                }
            }
            jgz0Var.f.f(jgz0Var.d);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b implements kkz0.a {
        public final jgz0 b;

        public b(jgz0 jgz0Var) {
            this.b = jgz0Var;
        }

        /* JADX WARN: Type inference failed for: r9v1, types: [android.view.ViewGroup, xsna.kkz0] */
        public final void a(int i, dhz0 dhz0Var) {
            jgz0 jgz0Var = this.b;
            jgz0Var.f.b(jgz0Var.d, null, i, wn4.d(dhz0Var), jgz0Var.e.getView().getContext());
        }

        @Override // xsna.exy0.a
        public final void b() {
            jgz0 jgz0Var = this.b;
            v1z0 v1z0Var = jgz0Var.k;
            if (v1z0Var != null) {
                v1z0Var.d();
            }
            jgz0Var.f.e(jgz0Var.d);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, xsna.kkz0] */
        public final void c() {
            jgz0 jgz0Var = this.b;
            Context context = jgz0Var.e.getView().getContext();
            wty0 wty0Var = jgz0Var.d.L;
            if (wty0Var == null) {
                return;
            }
            fvy0 fvy0Var = jgz0Var.g;
            if (fvy0Var == null || !fvy0Var.c()) {
                if (fvy0Var == null) {
                    de.L(wty0Var.b, null, null, null, context);
                } else {
                    fvy0Var.b(context);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewGroup, xsna.kkz0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.ViewGroup, xsna.kkz0] */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.view.ViewGroup, xsna.kkz0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewGroup, xsna.kkz0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewGroup, xsna.kkz0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.ViewGroup, xsna.kkz0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.ViewGroup, xsna.ojz0] */
    public jgz0(bfz0 bfz0Var, tez0 tez0Var, igz0.a aVar, igz0.b bVar, yqg0 yqg0Var, Context context) {
        b bVar2;
        ArrayList arrayList;
        String str;
        fxy0 fxy0Var;
        Context context2 = bfz0Var.b;
        igz0 igz0Var = aVar.a;
        saz0 saz0Var = new saz0(o8z0.g, 200);
        this.b = saz0Var;
        fs2 fs2Var = new fs2(this, 23);
        this.c = fs2Var;
        this.d = tez0Var;
        this.f = aVar;
        b bVar3 = new b(this);
        lgz0 lgz0Var = tez0Var.c0;
        ArrayList arrayList2 = tez0Var.b0;
        if (!arrayList2.isEmpty()) {
            fxy0 fxy0Var2 = new fxy0(context2);
            this.i = fxy0Var2;
            this.e = fxy0Var2;
        } else if (lgz0Var == null || tez0Var.i0 != 1) {
            ydz0 ydz0Var = new ydz0(context2, bfz0Var);
            this.h = ydz0Var;
            this.e = ydz0Var;
        } else {
            hhy0 hhy0Var = new hhy0(context2, bfz0Var.c);
            this.h = hhy0Var;
            this.e = hhy0Var;
        }
        this.e.setInterstitialPromoViewListener(bVar3);
        this.e.getCloseButton().setOnClickListener(new a(this));
        ?? r4 = this.h;
        if (r4 == 0 || lgz0Var == null) {
            bVar2 = bVar3;
            arrayList = arrayList2;
            str = null;
        } else {
            bVar2 = bVar3;
            arrayList = arrayList2;
            str = null;
            v1z0 v1z0Var = new v1z0(bfz0Var, lgz0Var, r4, aVar, bVar, new ao90(this, 15), yqg0Var);
            this.k = v1z0Var;
            sgz0 sgz0Var = (sgz0) lgz0Var.v0;
            if (sgz0Var != null && sgz0Var.d == null) {
                v1z0Var.n = false;
            }
            boolean z = lgz0Var.l0;
            v1z0Var.k = z;
            if (z && lgz0Var.q0 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && lgz0Var.h0) {
                gu8.c(null, "InterstitialMediaPresenter: Banner is allowed to close");
                v1z0Var.c();
            }
            if (!v1z0Var.k || (lgz0Var.q0 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && lgz0Var.h0)) {
                igz0Var.j = false;
            }
            v1z0Var.i = lgz0Var.D;
            boolean z2 = lgz0Var.g0;
            v1z0Var.j = z2;
            if (z2) {
                r4.a(0);
            } else {
                if (lgz0Var.h0) {
                    v1z0Var.e(context);
                }
                r4.a(2);
            }
            if (lgz0Var.h0) {
                this.m = 0L;
            }
        }
        this.e.setBanner(tez0Var);
        this.e.setClickArea(tez0Var.v);
        if (lgz0Var == null || !lgz0Var.h0) {
            long j = (long) (tez0Var.V * 1000.0f);
            this.l = j;
            if (j > 0) {
                gu8.c(str, "InterstitialPromoPresenter: Banner will be allowed to close in " + this.l + " millis");
                saz0Var.c(fs2Var);
                this.m = System.currentTimeMillis();
                igz0Var.j = false;
            } else {
                gu8.c(str, "InterstitialPromoPresenter: Banner is allowed to close");
                this.e.c();
            }
        }
        if (!arrayList.isEmpty() && (fxy0Var = this.i) != null) {
            this.j = new sgy0(arrayList, fxy0Var);
        }
        sgy0 sgy0Var = this.j;
        if (sgy0Var != null) {
            sgy0Var.c = aVar;
        }
        wty0 wty0Var = tez0Var.L;
        if (wty0Var != null && wty0Var.c != null) {
            fvy0 fvy0Var = new fvy0(wty0Var, new mnh0());
            this.g = fvy0Var;
            fvy0Var.d = bVar2;
        }
        aVar.j(tez0Var, this.e.getView());
        aVar.a(tez0Var.V);
    }

    @Override // xsna.jaz0
    public final void destroy() {
        this.b.h(this.c);
        v1z0 v1z0Var = this.k;
        if (v1z0Var != null) {
            v1z0Var.d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, xsna.kkz0] */
    @Override // xsna.jaz0
    public final View getCloseButton() {
        return this.e.getCloseButton();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, xsna.kkz0] */
    @Override // xsna.jaz0
    public final View i() {
        return this.e.getView();
    }

    @Override // xsna.jaz0
    public final void pause() {
        v1z0 v1z0Var = this.k;
        if (v1z0Var != null) {
            v1z0Var.f();
        }
        this.b.h(this.c);
        if (this.m > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.m;
            if (currentTimeMillis > 0) {
                long j = this.l;
                if (currentTimeMillis < j) {
                    this.l = j - currentTimeMillis;
                    return;
                }
            }
            this.l = 0L;
        }
    }

    @Override // xsna.jaz0
    public final void resume() {
        if (this.k != null || this.l <= 0) {
            return;
        }
        this.b.c(this.c);
        this.m = System.currentTimeMillis();
        this.f.a.j = false;
    }

    @Override // xsna.jaz0
    public final void stop() {
        v1z0 v1z0Var = this.k;
        if (v1z0Var != null) {
            v1z0Var.b(v1z0Var.d.getView().getContext());
        }
    }
}
