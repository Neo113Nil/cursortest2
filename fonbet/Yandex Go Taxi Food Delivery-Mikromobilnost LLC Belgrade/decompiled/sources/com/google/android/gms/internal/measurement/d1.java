package com.google.android.gms.internal.measurement;

import defpackage.dq91;
import defpackage.dxf0;
import defpackage.g8b1;
import defpackage.g8e;
import defpackage.i9b1;
import defpackage.iq91;
import defpackage.n7b1;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.p5b1;
import defpackage.rwa1;
import defpackage.v43;
import defpackage.x4e;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class d1 implements n7b1 {
    public final p5b1 a;
    public final dq91 b;
    public final boolean c;

    public d1(dq91 dq91Var, p5b1 p5b1Var) {
        iq91 iq91Var = rwa1.a;
        this.b = dq91Var;
        this.c = p5b1Var instanceof z0;
        this.a = p5b1Var;
    }

    public static d1 i(dq91 dq91Var, p5b1 p5b1Var) {
        iq91 iq91Var = rwa1.a;
        return new d1(dq91Var, p5b1Var);
    }

    @Override // defpackage.n7b1
    public final boolean a(Object obj) {
        ((z0) obj).zzb.d();
        return true;
    }

    @Override // defpackage.n7b1
    public final boolean b(a1 a1Var, a1 a1Var2) {
        if (!a1Var.zzc.equals(a1Var2.zzc)) {
            return false;
        }
        if (this.c) {
            return ((z0) a1Var).zzb.equals(((z0) a1Var2).zzb);
        }
        return true;
    }

    @Override // defpackage.n7b1
    public final int c(a1 a1Var) {
        i9b1 i9b1Var = a1Var.zzc;
        int i = i9b1Var.d;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < i9b1Var.a; i2++) {
                int i3 = i9b1Var.b[i2] >>> 3;
                zzlh zzlhVar = (zzlh) i9b1Var.c[i2];
                int t = y0.t(8);
                int t2 = y0.t(i3) + y0.t(16);
                int t3 = y0.t(24);
                int f = zzlhVar.f();
                i = x4e.D(t + t, t2, oo31.r(f, f, t3), i);
            }
            i9b1Var.d = i;
        }
        if (this.c) {
            g8b1 g8b1Var = ((z0) a1Var).zzb.a;
            if (g8b1Var.b > 0) {
                g8b1Var.b(0).getKey().getClass();
                ny61.u();
                return 0;
            }
            Iterator it = g8b1Var.c().iterator();
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

    @Override // defpackage.n7b1
    public final void d(Object obj, dxf0 dxf0Var) {
        Iterator c = ((z0) obj).zzb.c();
        if (c.hasNext()) {
            throw g8e.j((Map.Entry) c.next());
        }
        i9b1 i9b1Var = ((a1) obj).zzc;
        for (int i = 0; i < i9b1Var.a; i++) {
            int i2 = i9b1Var.b[i] >>> 3;
            Object obj2 = i9b1Var.c[i];
            boolean z = obj2 instanceof zzlh;
            y0 y0Var = (y0) dxf0Var.a;
            if (z) {
                y0Var.n(11);
                y0Var.e(2, i2);
                y0Var.i(3, (zzlh) obj2);
                y0Var.n(12);
            } else {
                y0Var.n(11);
                y0Var.e(2, i2);
                y0Var.n(26);
                y0Var.k((p5b1) obj2);
                y0Var.n(12);
            }
        }
    }

    @Override // defpackage.n7b1
    public final void e(Object obj, Object obj2) {
        e1.b(obj, obj2);
        if (this.c) {
            iq91 iq91Var = rwa1.a;
            if (((z0) obj2).zzb.a.isEmpty()) {
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.n7b1
    public final void f(Object obj) {
        this.b.getClass();
        i9b1 i9b1Var = ((a1) obj).zzc;
        if (i9b1Var.e) {
            i9b1Var.e = false;
        }
        iq91 iq91Var = rwa1.a;
        ((z0) obj).zzb.b();
    }

    @Override // defpackage.n7b1
    public final void g(Object obj, byte[] bArr, int i, int i2, v43 v43Var) {
        a1 a1Var = (a1) obj;
        if (a1Var.zzc == i9b1.f) {
            a1Var.zzc = i9b1.a();
        }
        throw null;
    }

    @Override // defpackage.n7b1
    public final int h(a1 a1Var) {
        int hashCode = a1Var.zzc.hashCode();
        if (!this.c) {
            return hashCode;
        }
        return ((z0) a1Var).zzb.a.hashCode() + (hashCode * 53);
    }

    @Override // defpackage.n7b1
    public final Object zza() {
        p5b1 p5b1Var = this.a;
        return p5b1Var instanceof a1 ? (a1) ((a1) p5b1Var).q(4) : p5b1Var.b().c();
    }
}
