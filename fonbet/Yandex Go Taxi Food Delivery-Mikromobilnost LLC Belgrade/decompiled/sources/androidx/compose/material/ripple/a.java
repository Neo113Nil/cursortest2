package androidx.compose.material.ripple;

import defpackage.aur;
import defpackage.ck11;
import defpackage.dsk0;
import defpackage.g8w;
import defpackage.jl40;
import defpackage.ltu;
import defpackage.lxe0;
import defpackage.mtu;
import defpackage.r4u0;
import defpackage.r9m;
import defpackage.rrk0;
import defpackage.rzo;
import defpackage.s9m;
import defpackage.t9m;
import defpackage.tje;
import defpackage.tse;
import defpackage.ubn;
import defpackage.vpr;
import defpackage.ztr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ tse b;

    public a(b bVar, tse tseVar) {
        this.a = bVar;
        this.b = tseVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        g8w g8wVar = (g8w) obj;
        boolean z = g8wVar instanceof lxe0;
        b bVar = this.a;
        if (!z) {
            r4u0 r4u0Var = bVar.y;
            if (r4u0Var == null) {
                r4u0Var = new r4u0(bVar.b, bVar.x);
                rzo.D(bVar);
                bVar.y = r4u0Var;
            }
            ArrayList arrayList = r4u0Var.d;
            if (g8wVar instanceof ltu) {
                arrayList.add(g8wVar);
            } else if (g8wVar instanceof mtu) {
                arrayList.remove(((mtu) g8wVar).a);
            } else if (g8wVar instanceof ztr) {
                arrayList.add(g8wVar);
            } else if (g8wVar instanceof aur) {
                arrayList.remove(((aur) g8wVar).a);
            } else if (g8wVar instanceof s9m) {
                arrayList.add(g8wVar);
            } else if (g8wVar instanceof t9m) {
                arrayList.remove(((t9m) g8wVar).a);
            } else if (g8wVar instanceof r9m) {
                arrayList.remove(((r9m) g8wVar).a);
            }
            g8w g8wVar2 = (g8w) kotlin.collections.a.b0(arrayList);
            if (!jl40.l(r4u0Var.e, g8wVar2)) {
                tse tseVar = this.b;
                if (g8wVar2 != null) {
                    rrk0 rrk0Var = (rrk0) r4u0Var.b.invoke();
                    boolean z2 = g8wVar2 instanceof ltu;
                    float f = z2 ? rrk0Var.c : g8wVar2 instanceof ztr ? rrk0Var.b : g8wVar2 instanceof s9m ? rrk0Var.a : 0.0f;
                    ck11 ck11Var = dsk0.a;
                    if (!z2) {
                        if (g8wVar2 instanceof ztr) {
                            ck11Var = new ck11(45, ubn.d, 2);
                        } else if (g8wVar2 instanceof s9m) {
                            ck11Var = new ck11(45, ubn.d, 2);
                        }
                    }
                    tje.N(tseVar, null, null, new StateLayer$handleInteraction$1(r4u0Var, f, ck11Var, null), 3);
                } else {
                    g8w g8wVar3 = r4u0Var.e;
                    ck11 ck11Var2 = dsk0.a;
                    if (!(g8wVar3 instanceof ltu) && !(g8wVar3 instanceof ztr) && (g8wVar3 instanceof s9m)) {
                        ck11Var2 = new ck11(150, ubn.d, 2);
                    }
                    tje.N(tseVar, null, null, new StateLayer$handleInteraction$2(r4u0Var, ck11Var2, null), 3);
                }
                r4u0Var.e = g8wVar2;
            }
        } else if (bVar.B) {
            bVar.E0((lxe0) g8wVar);
        } else {
            bVar.C.g(g8wVar);
        }
        return zy11.a;
    }
}
