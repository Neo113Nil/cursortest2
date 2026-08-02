package defpackage;

import coil.memory.MemoryCache$Key;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ja3 {
    public final Object a;
    public final q501 b;
    public final qav c;

    public ja3(Object obj, q501 q501Var, qav qavVar) {
        this.a = obj;
        this.b = q501Var;
        this.c = qavVar;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this != obj) {
            if (obj instanceof ja3) {
                ja3 ja3Var = (ja3) obj;
                Object obj2 = ja3Var.a;
                this.b.getClass();
                Object obj3 = this.a;
                if (obj3 != obj2) {
                    if ((obj3 instanceof hev) && (obj2 instanceof hev)) {
                        hev hevVar = (hev) obj3;
                        hev hevVar2 = (hev) obj2;
                        if (!jl40.l(hevVar.a, hevVar2.a) || !hevVar.b.equals(hevVar2.b) || !jl40.l(hevVar.e, hevVar2.e) || !jl40.l(hevVar.f, hevVar2.f) || hevVar.g != hevVar2.g || !jl40.l(hevVar.i, hevVar2.i) || !jl40.l(hevVar.k, hevVar2.k) || hevVar.m != hevVar2.m || hevVar.n != hevVar2.n || hevVar.o != hevVar2.o || hevVar.p != hevVar2.p || hevVar.q != hevVar2.q || hevVar.r != hevVar2.r || hevVar.s != hevVar2.s || !hevVar.y.equals(hevVar2.y) || hevVar.z != hevVar2.z || hevVar.h != hevVar2.h || !jl40.l(hevVar.A, hevVar2.A)) {
                            l = false;
                        }
                    } else {
                        l = jl40.l(obj3, obj2);
                    }
                    if (l || !this.c.equals(ja3Var.c)) {
                    }
                }
                l = true;
                if (l) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        this.b.getClass();
        Object obj = this.a;
        if (obj instanceof hev) {
            hev hevVar = (hev) obj;
            int c = smw0.c(hevVar.a.hashCode() * 31, 961, hevVar.b);
            MemoryCache$Key memoryCache$Key = hevVar.e;
            int hashCode = (c + (memoryCache$Key != null ? memoryCache$Key.hashCode() : 0)) * 31;
            String str = hevVar.f;
            r2 = hevVar.A.a.hashCode() + ((hevVar.h.hashCode() + ((hevVar.z.hashCode() + ((hevVar.y.hashCode() + ((hevVar.s.hashCode() + ((hevVar.r.hashCode() + ((hevVar.q.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e((unr0.c((hevVar.g.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 961, 31, hevVar.i) + Arrays.hashCode(hevVar.k.a)) * 31, 31, hevVar.m), 31, hevVar.n), 31, hevVar.o), 31, hevVar.p)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else if (obj != null) {
            r2 = obj.hashCode();
        }
        return this.c.hashCode() + (r2 * 31);
    }
}
