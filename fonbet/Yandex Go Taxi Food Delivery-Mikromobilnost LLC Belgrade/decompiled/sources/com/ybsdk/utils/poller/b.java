package com.ybsdk.utils.poller;

import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.PercentJitterConfigSchema;
import com.ybsdk.rconfig.configs.PollingConfigsImpl;
import com.ybsdk.rconfig.configs.PollingStrategyConfig;
import defpackage.a0e0;
import defpackage.a1e0;
import defpackage.az91;
import defpackage.azd0;
import defpackage.b0e0;
import defpackage.b1e0;
import defpackage.bzd0;
import defpackage.c0e0;
import defpackage.c1e0;
import defpackage.czd0;
import defpackage.d0e0;
import defpackage.d1e0;
import defpackage.dfr;
import defpackage.dzd0;
import defpackage.e0e0;
import defpackage.e1e0;
import defpackage.ezd0;
import defpackage.f0e0;
import defpackage.f1e0;
import defpackage.f8x;
import defpackage.fzd0;
import defpackage.g0e0;
import defpackage.g1e0;
import defpackage.gzd0;
import defpackage.h0e0;
import defpackage.h1e0;
import defpackage.hgz;
import defpackage.hzd0;
import defpackage.i0e0;
import defpackage.i1e0;
import defpackage.izd0;
import defpackage.j0e0;
import defpackage.j1e0;
import defpackage.jzd0;
import defpackage.k0e0;
import defpackage.k1e0;
import defpackage.khs;
import defpackage.kzd0;
import defpackage.l0e0;
import defpackage.l1e0;
import defpackage.lzd0;
import defpackage.m0e0;
import defpackage.m1e0;
import defpackage.myd0;
import defpackage.mzd0;
import defpackage.n0e0;
import defpackage.n1e0;
import defpackage.n27;
import defpackage.ny61;
import defpackage.nyd0;
import defpackage.nzd0;
import defpackage.o0e0;
import defpackage.o1e0;
import defpackage.oyd0;
import defpackage.ozd0;
import defpackage.p0e0;
import defpackage.p1e0;
import defpackage.pyd0;
import defpackage.pzd0;
import defpackage.q0e0;
import defpackage.q1e0;
import defpackage.q6c0;
import defpackage.qyd0;
import defpackage.qzd0;
import defpackage.r0e0;
import defpackage.rzd0;
import defpackage.s0e0;
import defpackage.szd0;
import defpackage.t0e0;
import defpackage.tyd0;
import defpackage.tzd0;
import defpackage.u0e0;
import defpackage.uyd0;
import defpackage.uzd0;
import defpackage.v0e0;
import defpackage.vld0;
import defpackage.voc;
import defpackage.vy91;
import defpackage.vyd0;
import defpackage.vzd0;
import defpackage.w0e0;
import defpackage.w511;
import defpackage.wlp;
import defpackage.wls;
import defpackage.wyd0;
import defpackage.wzd0;
import defpackage.x0e0;
import defpackage.xta0;
import defpackage.xzd0;
import defpackage.y0e0;
import defpackage.yyd0;
import defpackage.yzd0;
import defpackage.z0e0;
import defpackage.zls;
import defpackage.zyd0;
import defpackage.zzd0;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes9.dex */
public final class b {
    public final Set a;
    public final nyd0 b;

    public b(Set set, nyd0 nyd0Var) {
        this.a = set;
        this.b = nyd0Var;
    }

    public final c a(q1e0 q1e0Var, wls wlsVar, zls zlsVar) {
        Object next;
        f8x khsVar;
        oyd0 a;
        PollerScopeType pollerScopeType;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int a2 = ((yyd0) next).a();
                do {
                    Object next2 = it.next();
                    int a3 = ((yyd0) next2).a();
                    if (a2 > a3) {
                        next = next2;
                        a2 = a3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        yyd0 yyd0Var = (yyd0) next;
        if (yyd0Var == null) {
            ny61.r("No poller launchers available");
            return null;
        }
        qyd0 qyd0Var = (qyd0) this.b;
        com.ybsdk.rconfig.b bVar = qyd0Var.a;
        com.ybsdk.rconfig.b bVar2 = (com.ybsdk.rconfig.b) qyd0Var.b.a;
        bVar2.getClass();
        PercentJitterConfigSchema percentJitterConfigSchema = (PercentJitterConfigSchema) bVar2.d(xta0.a).getData();
        if (percentJitterConfigSchema.isEnabled()) {
            Integer jitterPercent = percentJitterConfigSchema.getJitterPercent();
            khsVar = new hgz(jitterPercent != null ? jitterPercent.intValue() : 0);
        } else {
            khsVar = new khs();
        }
        bVar.getClass();
        dfr dfrVar = voc.a;
        PollingConfigsImpl pollingConfigsImpl = (PollingConfigsImpl) bVar.d(dfrVar).getData();
        boolean isEnabled = ((CommonFeatureFlag) bVar.d(wlp.i0).getData()).isEnabled();
        boolean z = q1e0Var instanceof a0e0;
        if (z) {
            a = qyd0Var.a(q1e0Var, khsVar);
        } else {
            int i = pyd0.a[((PollingStrategyConfig) bVar.d(com.ybsdk.rconfig.configs.e.a).getData()).getIntervalType().ordinal()];
            if (i == 1) {
                a = qyd0Var.a(q1e0Var, khsVar);
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                a = qyd0Var.b(q1e0Var, (PollingConfigsImpl) bVar.d(dfrVar).getData(), khsVar);
            }
        }
        if (q1e0Var.equals(lzd0.b) || q1e0Var.equals(vzd0.b) || q1e0Var.equals(uzd0.b) || q1e0Var.equals(u0e0.b) || q1e0Var.equals(v0e0.b) || q1e0Var.equals(o0e0.b) || q1e0Var.equals(tzd0.b)) {
            pollerScopeType = PollerScopeType.SDK;
        } else if (q1e0Var.equals(d1e0.b) || q1e0Var.equals(m1e0.b) || q1e0Var.equals(ozd0.b) || q1e0Var.equals(f0e0.b) || q1e0Var.equals(dzd0.b) || q1e0Var.equals(gzd0.b) || q1e0Var.equals(hzd0.b) || q1e0Var.equals(ezd0.b) || q1e0Var.equals(fzd0.b) || q1e0Var.equals(izd0.b) || q1e0Var.equals(czd0.b) || q1e0Var.equals(l0e0.b) || q1e0Var.equals(mzd0.b) || q1e0Var.equals(nzd0.b) || q1e0Var.equals(yzd0.b) || q1e0Var.equals(wzd0.b) || q1e0Var.equals(jzd0.b) || q1e0Var.equals(i0e0.b) || q1e0Var.equals(f1e0.b) || q1e0Var.equals(n0e0.b) || q1e0Var.equals(e1e0.b) || q1e0Var.equals(p0e0.b) || q1e0Var.equals(s0e0.b) || q1e0Var.equals(q0e0.b) || q1e0Var.equals(r0e0.b) || q1e0Var.equals(t0e0.b) || q1e0Var.equals(a1e0.b) || q1e0Var.equals(b1e0.b) || q1e0Var.equals(y0e0.b) || q1e0Var.equals(c1e0.b) || q1e0Var.equals(z0e0.b) || q1e0Var.equals(n1e0.b) || q1e0Var.equals(p1e0.b) || q1e0Var.equals(o1e0.b) || q1e0Var.equals(g1e0.b) || q1e0Var.equals(j1e0.b) || q1e0Var.equals(k1e0.b) || q1e0Var.equals(l1e0.b) || q1e0Var.equals(h1e0.b) || q1e0Var.equals(i1e0.b) || q1e0Var.equals(h0e0.b) || q1e0Var.equals(g0e0.b) || q1e0Var.equals(kzd0.b) || q1e0Var.equals(x0e0.b) || q1e0Var.equals(xzd0.b) || q1e0Var.equals(m0e0.b) || q1e0Var.equals(j0e0.b) || q1e0Var.equals(k0e0.b) || z || q1e0Var.equals(c0e0.b) || q1e0Var.equals(zzd0.b) || q1e0Var.equals(e0e0.b) || q1e0Var.equals(d0e0.b) || q1e0Var.equals(b0e0.b) || q1e0Var.equals(rzd0.b) || q1e0Var.equals(qzd0.b) || q1e0Var.equals(pzd0.b) || q1e0Var.equals(szd0.b)) {
            pollerScopeType = PollerScopeType.CURRENT;
        } else {
            if (!q1e0Var.equals(w0e0.b)) {
                w511.b();
                return null;
            }
            pollerScopeType = PollerScopeType.HOST_ACTIVITY;
        }
        PollerScopeType pollerScopeType2 = pollerScopeType;
        vy91 c = a.c();
        vy91 b = a.b();
        bzd0 d = a.d();
        q6c0 a4 = a.a();
        u0e0 u0e0Var = u0e0.b;
        az91 zyd0Var = (q1e0Var.equals(u0e0Var) ? Integer.valueOf(pollingConfigsImpl.getRegistrationStatusNewUserTakesTooLongTimeoutMs()) : q1e0Var.equals(tzd0.b) ? Integer.valueOf(pollingConfigsImpl.getChangePhoneAppealHandlingTimeoutMs()) : null) != null ? new zyd0(r3.intValue()) : azd0.a;
        n27 n27Var = wyd0.b;
        if (!isEnabled) {
            if (q1e0Var.equals(lzd0.b) || q1e0Var.equals(vzd0.b) || q1e0Var.equals(uzd0.b) || q1e0Var.equals(u0e0Var) || q1e0Var.equals(v0e0.b) || q1e0Var.equals(o0e0.b) || q1e0Var.equals(d1e0.b) || q1e0Var.equals(w0e0.b) || q1e0Var.equals(n0e0.b) || q1e0Var.equals(e1e0.b) || q1e0Var.equals(b1e0.b) || q1e0Var.equals(y0e0.b) || q1e0Var.equals(c1e0.b) || q1e0Var.equals(z0e0.b) || q1e0Var.equals(c0e0.b) || q1e0Var.equals(e0e0.b) || q1e0Var.equals(g1e0.b) || q1e0Var.equals(j1e0.b) || q1e0Var.equals(k1e0.b) || q1e0Var.equals(l1e0.b) || q1e0Var.equals(h1e0.b) || q1e0Var.equals(i1e0.b) || q1e0Var.equals(h0e0.b) || q1e0Var.equals(kzd0.b) || q1e0Var.equals(rzd0.b) || q1e0Var.equals(qzd0.b) || q1e0Var.equals(pzd0.b) || q1e0Var.equals(szd0.b)) {
                n27Var = uyd0.b;
            } else if (!q1e0Var.equals(m1e0.b) && !q1e0Var.equals(tzd0.b) && !q1e0Var.equals(ozd0.b) && !q1e0Var.equals(f0e0.b) && !q1e0Var.equals(izd0.b) && !q1e0Var.equals(czd0.b) && !q1e0Var.equals(mzd0.b) && !q1e0Var.equals(nzd0.b) && !q1e0Var.equals(yzd0.b) && !q1e0Var.equals(wzd0.b) && !q1e0Var.equals(i0e0.b) && !q1e0Var.equals(jzd0.b) && !q1e0Var.equals(f1e0.b) && !q1e0Var.equals(p0e0.b) && !q1e0Var.equals(s0e0.b) && !q1e0Var.equals(q0e0.b) && !q1e0Var.equals(r0e0.b) && !q1e0Var.equals(t0e0.b) && !q1e0Var.equals(n1e0.b) && !q1e0Var.equals(p1e0.b) && !q1e0Var.equals(o1e0.b) && !q1e0Var.equals(g0e0.b) && !q1e0Var.equals(x0e0.b) && !q1e0Var.equals(xzd0.b) && !q1e0Var.equals(m0e0.b) && !q1e0Var.equals(j0e0.b) && !q1e0Var.equals(k0e0.b) && !q1e0Var.equals(zzd0.b) && !q1e0Var.equals(d0e0.b) && !z && !q1e0Var.equals(b0e0.b)) {
                if (q1e0Var.equals(dzd0.b) || q1e0Var.equals(gzd0.b) || q1e0Var.equals(hzd0.b) || q1e0Var.equals(ezd0.b) || q1e0Var.equals(fzd0.b) || q1e0Var.equals(l0e0.b)) {
                    n27Var = tyd0.b;
                } else {
                    if (!q1e0Var.equals(a1e0.b)) {
                        w511.b();
                        return null;
                    }
                    n27Var = new vyd0(new vld0(9));
                }
            }
        }
        return new c(yyd0Var, new myd0(pollerScopeType2, c, b, a4, d, zyd0Var, n27Var), wlsVar, zlsVar);
    }

    public final c b(q1e0 q1e0Var, wls wlsVar, wls wlsVar2, wls wlsVar3) {
        return a(q1e0Var, wlsVar3, new PollerFactoryImpl$createPollerWithMapping$1(wlsVar, wlsVar2, null));
    }

    public final c c(q1e0 q1e0Var, wls wlsVar, wls wlsVar2) {
        return com.ybsdk.core.utils.poller.a.a(this, q1e0Var, new PollerFactoryImpl$createSimplePoller$1(wlsVar, null), wlsVar2);
    }
}
