package com.google.android.gms.internal.play_billing;

import defpackage.dxf0;
import defpackage.e3a1;
import defpackage.g8e;
import defpackage.jga1;
import defpackage.ny61;
import defpackage.ofa1;
import defpackage.oo31;
import defpackage.pia1;
import defpackage.sp91;
import defpackage.uw91;
import defpackage.x4e;
import defpackage.xp91;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class t implements ofa1 {
    public final m a;
    public final xp91 b;
    public final boolean c;

    public t(xp91 xp91Var, m mVar) {
        sp91 sp91Var = e3a1.a;
        this.b = xp91Var;
        this.c = mVar instanceof o;
        this.a = mVar;
    }

    public static t i(xp91 xp91Var, m mVar) {
        sp91 sp91Var = e3a1.a;
        return new t(xp91Var, mVar);
    }

    @Override // defpackage.ofa1
    public final boolean a(Object obj) {
        ((o) obj).zzb.e();
        return true;
    }

    @Override // defpackage.ofa1
    public final void b(Object obj) {
        this.b.getClass();
        pia1 pia1Var = ((p) obj).zzc;
        if (pia1Var.e) {
            pia1Var.e = false;
        }
        sp91 sp91Var = e3a1.a;
        ((o) obj).zzb.d();
    }

    @Override // defpackage.ofa1
    public final int c(p pVar) {
        pia1 pia1Var = pVar.zzc;
        int i = pia1Var.d;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < pia1Var.a; i2++) {
                int i3 = pia1Var.b[i2] >>> 3;
                zzgk zzgkVar = (zzgk) pia1Var.c[i2];
                int q = n.q(8);
                int q2 = n.q(i3) + n.q(16);
                int q3 = n.q(24);
                int f = zzgkVar.f();
                i = x4e.D(q + q, q2, oo31.a(f, f, q3), i);
            }
            pia1Var.d = i;
        }
        if (this.c) {
            jga1 jga1Var = ((o) pVar).zzb.a;
            if (jga1Var.b > 0) {
                jga1Var.d(0).getKey().getClass();
                ny61.u();
                return 0;
            }
            Iterator it = jga1Var.b().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null) {
                    ny61.u();
                    return 0;
                }
                entry.getValue();
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.ofa1
    public final int d(p pVar) {
        int hashCode = pVar.zzc.hashCode();
        if (!this.c) {
            return hashCode;
        }
        return ((o) pVar).zzb.a.hashCode() + (hashCode * 53);
    }

    @Override // defpackage.ofa1
    public final boolean e(p pVar, p pVar2) {
        if (!pVar.zzc.equals(pVar2.zzc)) {
            return false;
        }
        if (this.c) {
            return ((o) pVar).zzb.equals(((o) pVar2).zzb);
        }
        return true;
    }

    @Override // defpackage.ofa1
    public final void f(Object obj, Object obj2) {
        u.p(obj, obj2);
        if (this.c) {
            sp91 sp91Var = e3a1.a;
            if (((o) obj2).zzb.a.isEmpty()) {
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.ofa1
    public final void g(Object obj, dxf0 dxf0Var) {
        Iterator c = ((o) obj).zzb.c();
        if (c.hasNext()) {
            throw g8e.j((Map.Entry) c.next());
        }
        pia1 pia1Var = ((p) obj).zzc;
        for (int i = 0; i < pia1Var.a; i++) {
            int i2 = pia1Var.b[i] >>> 3;
            Object obj2 = pia1Var.c[i];
            boolean z = obj2 instanceof zzgk;
            n nVar = (n) dxf0Var.a;
            if (z) {
                nVar.m(11);
                nVar.l(2, i2);
                nVar.c(3, (zzgk) obj2);
                nVar.m(12);
            } else {
                nVar.m(11);
                nVar.l(2, i2);
                nVar.m(26);
                p pVar = (p) ((m) obj2);
                nVar.m(pVar.h());
                pVar.f(nVar);
                nVar.m(12);
            }
        }
    }

    @Override // defpackage.ofa1
    public final void h(Object obj, byte[] bArr, int i, int i2, uw91 uw91Var) {
        p pVar = (p) obj;
        if (pVar.zzc == pia1.f) {
            pVar.zzc = pia1.b();
        }
        throw null;
    }

    @Override // defpackage.ofa1
    public final Object zze() {
        m mVar = this.a;
        return mVar instanceof p ? (p) ((p) mVar).g(4) : mVar.a().c();
    }
}
