package defpackage;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.g;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig$SessionError;
import androidx.camera.core.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class ax31 implements si21 {
    public final HashSet B;
    public final HashMap C;
    public final fsj0 D;
    public final fsj0 E;
    public final HashSet a;
    public final zi21 x;
    public final br7 y;
    public final br7 z;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap w = new HashMap();
    public final sn7 A = new sn7(this);

    public ax31(br7 br7Var, br7 br7Var2, HashSet hashSet, zi21 zi21Var, ykn0 ykn0Var) {
        this.y = br7Var;
        this.z = br7Var2;
        this.x = zi21Var;
        this.a = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            hashMap.put(jVar, jVar.q(br7Var.f(), null, jVar.h(true, zi21Var)));
        }
        this.C = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.B = hashSet2;
        this.D = new fsj0(br7Var, hashSet2);
        if (this.z != null) {
            this.E = new fsj0(this.z, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            j jVar2 = (j) it2.next();
            this.w.put(jVar2, Boolean.FALSE);
            this.c.put(jVar2, new zw31(br7Var, this, ykn0Var));
        }
    }

    public static void t(enw0 enw0Var, DeferrableSurface deferrableSurface, jyq0 jyq0Var) {
        enw0Var.e();
        try {
            tob1.b();
            enw0Var.b();
            dnw0 dnw0Var = enw0Var.l;
            Objects.requireNonNull(dnw0Var);
            dnw0Var.g(deferrableSurface, new cnw0(dnw0Var, 0));
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            fyq0 fyq0Var = jyq0Var.f;
            if (fyq0Var != null) {
                fyq0Var.a(jyq0Var, SessionConfig$SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static DeferrableSurface u(j jVar) {
        List b = jVar instanceof w8v ? jVar.o.b() : Collections.unmodifiableList(jVar.o.g.a);
        d6z.y(null, b.size() <= 1);
        if (b.size() == 1) {
            return (DeferrableSurface) b.get(0);
        }
        return null;
    }

    @Override // defpackage.si21
    public final void e(j jVar) {
        tob1.b();
        if (x(jVar)) {
            enw0 w = w(jVar);
            DeferrableSurface u = u(jVar);
            if (u != null) {
                t(w, u, jVar.o);
                return;
            }
            tob1.b();
            w.b();
            w.l.a();
        }
    }

    @Override // defpackage.si21
    public final void k(j jVar) {
        tob1.b();
        if (x(jVar)) {
            return;
        }
        this.w.put(jVar, Boolean.TRUE);
        DeferrableSurface u = u(jVar);
        if (u != null) {
            t(w(jVar), u, jVar.o);
        }
    }

    @Override // defpackage.si21
    public final void p(j jVar) {
        DeferrableSurface u;
        tob1.b();
        enw0 w = w(jVar);
        if (x(jVar) && (u = u(jVar)) != null) {
            t(w, u, jVar.o);
        }
    }

    @Override // defpackage.si21
    public final void r(j jVar) {
        tob1.b();
        if (x(jVar)) {
            this.w.put(jVar, Boolean.FALSE);
            enw0 w = w(jVar);
            tob1.b();
            w.b();
            w.l.a();
        }
    }

    public final m74 s(j jVar, fsj0 fsj0Var, br7 br7Var, enw0 enw0Var, int i, boolean z) {
        int i2 = br7Var.c().i(i);
        boolean f = lw01.f(enw0Var.b);
        xi21 xi21Var = (xi21) this.C.get(jVar);
        Objects.requireNonNull(xi21Var);
        ene0 b = fsj0Var.b(xi21Var, enw0Var.d, lw01.b(enw0Var.b), z);
        Rect rect = b.a;
        Size size = b.b;
        int k = lw01.k((enw0Var.i + br7Var.c().i(((icv) jVar.h).n(0))) - i2);
        return new m74(UUID.randomUUID(), jVar instanceof g ? 1 : jVar instanceof w8v ? 4 : 2, jVar instanceof w8v ? 256 : 34, rect, lw01.i(k, size), k, jVar.p(br7Var) ^ f);
    }

    public final HashMap v(enw0 enw0Var, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            xi21 xi21Var = (xi21) this.C.get(jVar);
            Objects.requireNonNull(xi21Var);
            Size size = this.D.b(xi21Var, enw0Var.d, lw01.b(enw0Var.b), z).c;
            hashMap.put(jVar, size);
            Objects.toString(size);
            Objects.toString(jVar);
            sgb1.g(3, "VirtualCameraAdapter");
        }
        return hashMap;
    }

    public final enw0 w(j jVar) {
        enw0 enw0Var = (enw0) this.b.get(jVar);
        Objects.requireNonNull(enw0Var);
        return enw0Var;
    }

    public final boolean x(j jVar) {
        Boolean bool = (Boolean) this.w.get(jVar);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void y(HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = this.b;
        hashMap3.clear();
        hashMap3.putAll(hashMap);
        for (Map.Entry entry : hashMap3.entrySet()) {
            j jVar = (j) entry.getKey();
            enw0 enw0Var = (enw0) entry.getValue();
            jVar.E(enw0Var.d);
            jVar.C(enw0Var.b);
            j4n i = enw0Var.g.i();
            Size size = (Size) hashMap2.get(jVar);
            if (size != null) {
                i.b = size;
            }
            jVar.i = jVar.A(i.k(), null);
            jVar.t();
        }
    }
}
