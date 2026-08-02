package com.google.mlkit.common.internal;

import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.alo;
import defpackage.e1d;
import defpackage.g0d;
import defpackage.j0d;
import defpackage.kpr0;
import defpackage.o0c;
import defpackage.o430;
import defpackage.o491;
import defpackage.qje;
import defpackage.qk20;
import defpackage.sk20;
import defpackage.vwi;
import defpackage.x4c;
import defpackage.xvi0;
import defpackage.xw91;
import defpackage.yvi0;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        j0d j0dVar = kpr0.b;
        g0d b = j0d.b(o430.class);
        b.a(vwi.b(qk20.class));
        b.g = new e1d() { // from class: n391
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                return new o430(0);
            }
        };
        j0d c = b.c();
        g0d b2 = j0d.b(sk20.class);
        b2.g = new e1d() { // from class: c891
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                return new sk20();
            }
        };
        j0d c2 = b2.c();
        g0d b3 = j0d.b(yvi0.class);
        b3.a(new vwi(2, 0, xvi0.class));
        b3.g = new e1d() { // from class: oc91
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                Set<xvi0> g = yuf0Var.g(jgg0.a(xvi0.class));
                yvi0 yvi0Var = new yvi0();
                yvi0Var.a = new HashMap();
                for (xvi0 xvi0Var : g) {
                    HashMap hashMap = (HashMap) yvi0Var.a;
                    xvi0Var.getClass();
                    hashMap.put(pkf.class, xvi0Var.a);
                }
                return yvi0Var;
            }
        };
        j0d c3 = b3.c();
        g0d b4 = j0d.b(alo.class);
        b4.a(new vwi(1, 1, sk20.class));
        b4.g = new e1d() { // from class: sg91
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                return new alo(yuf0Var.d(sk20.class));
            }
        };
        j0d c4 = b4.c();
        g0d b5 = j0d.b(o0c.class);
        b5.g = new e1d() { // from class: xl91
            /* JADX WARN: Type inference failed for: r4v1, types: [o391] */
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                o0c o0cVar = new o0c();
                ?? r4 = new Runnable() { // from class: o391
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                };
                ReferenceQueue referenceQueue = o0cVar.a;
                Set set = o0cVar.b;
                set.add(new tg91(o0cVar, referenceQueue, set, r4));
                Thread thread = new Thread(new tqs(24, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return o0cVar;
            }
        };
        j0d c5 = b5.c();
        g0d b6 = j0d.b(x4c.class);
        b6.a(vwi.b(o0c.class));
        b6.g = new e1d() { // from class: dr91
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                return new x4c(0);
            }
        };
        j0d c6 = b6.c();
        g0d b7 = j0d.b(xw91.class);
        b7.a(vwi.b(qk20.class));
        b7.g = new e1d() { // from class: ww91
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                mpb1.f();
                return new xw91(0);
            }
        };
        j0d c7 = b7.c();
        g0d b8 = j0d.b(xvi0.class);
        b8.b = 1;
        b8.a(new vwi(1, 1, xw91.class));
        b8.g = new e1d() { // from class: h3a1
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                return new xvi0(yuf0Var.d(xw91.class));
            }
        };
        j0d c8 = b8.c();
        o491 o491Var = zzaf.b;
        Object[] objArr = {j0dVar, c, c2, c3, c4, c5, c6, c7, c8};
        qje.g0(9, objArr);
        return zzaf.i(9, objArr);
    }
}
