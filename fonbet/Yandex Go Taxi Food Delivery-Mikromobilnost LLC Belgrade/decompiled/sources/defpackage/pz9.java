package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final /* synthetic */ class pz9 implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tls b;
    public final /* synthetic */ t0a c;

    public /* synthetic */ pz9(t0a t0aVar, tls tlsVar) {
        this.c = t0aVar;
        this.b = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        t0a t0aVar = this.c;
        tls tlsVar = this.b;
        ArrayList arrayList = null;
        switch (i) {
            case 0:
                q0a q0aVar = (q0a) t0aVar;
                az9 az9Var = q0aVar.a;
                dz9 dz9Var = az9Var.e;
                gz9 gz9Var = dz9Var != null ? dz9Var.g : null;
                if (gz9Var instanceof ez9) {
                    tlsVar.invoke(new h0a(new k0a(((ez9) dz9Var.g).a), az9Var.h, dz9Var.a));
                    return zy11Var;
                }
                if (jl40.l(gz9Var, fz9.a)) {
                    az9 az9Var2 = q0aVar.a;
                    tlsVar.invoke(new h0a(l0a.a, az9Var2.h, az9Var2.e.a));
                    return zy11Var;
                }
                if (gz9Var == null) {
                    return zy11Var;
                }
                w511.b();
                return null;
            default:
                q0a q0aVar2 = (q0a) t0aVar;
                zy9 zy9Var = q0aVar2.a.g;
                if (zy9Var != null) {
                    List list = zy9Var.b;
                    if (list.isEmpty() || !q0aVar2.e) {
                        list = null;
                    }
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            if (q0aVar2.c.contains(((yy9) obj).a)) {
                                arrayList2.add(obj);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((yy9) it.next()).b.toString());
                        }
                        arrayList = arrayList3;
                    }
                }
                tlsVar.invoke(new g0a(arrayList, q0aVar2.a.h));
                return zy11Var;
        }
    }

    public /* synthetic */ pz9(tls tlsVar, t0a t0aVar) {
        this.b = tlsVar;
        this.c = t0aVar;
    }
}
