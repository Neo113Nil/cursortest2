package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.du11;
import defpackage.e1d;
import defpackage.g0d;
import defpackage.ig4;
import defpackage.j0d;
import defpackage.jfy;
import defpackage.jgg0;
import defpackage.jhe0;
import defpackage.jse;
import defpackage.ooc;
import defpackage.p56;
import defpackage.scc;
import defpackage.vwi;
import defpackage.yuf0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lj0d;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements e1d {
        public static final a a = new a();

        @Override // defpackage.e1d
        public final Object k(yuf0 yuf0Var) {
            return ooc.o((Executor) yuf0Var.c(new jgg0(ig4.class, Executor.class)));
        }
    }

    public static final class b implements e1d {
        public static final b a = new b();

        @Override // defpackage.e1d
        public final Object k(yuf0 yuf0Var) {
            return ooc.o((Executor) yuf0Var.c(new jgg0(jfy.class, Executor.class)));
        }
    }

    public static final class c implements e1d {
        public static final c a = new c();

        @Override // defpackage.e1d
        public final Object k(yuf0 yuf0Var) {
            return ooc.o((Executor) yuf0Var.c(new jgg0(p56.class, Executor.class)));
        }
    }

    public static final class d implements e1d {
        public static final d a = new d();

        @Override // defpackage.e1d
        public final Object k(yuf0 yuf0Var) {
            return ooc.o((Executor) yuf0Var.c(new jgg0(du11.class, Executor.class)));
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<j0d> getComponents() {
        g0d a2 = j0d.a(new jgg0(ig4.class, jse.class));
        a2.a(new vwi(new jgg0(ig4.class, Executor.class), 1, 0));
        a aVar = a.a;
        jhe0.a(aVar, "Null factory");
        a2.g = aVar;
        j0d c2 = a2.c();
        g0d a3 = j0d.a(new jgg0(jfy.class, jse.class));
        a3.a(new vwi(new jgg0(jfy.class, Executor.class), 1, 0));
        b bVar = b.a;
        jhe0.a(bVar, "Null factory");
        a3.g = bVar;
        j0d c3 = a3.c();
        g0d a4 = j0d.a(new jgg0(p56.class, jse.class));
        a4.a(new vwi(new jgg0(p56.class, Executor.class), 1, 0));
        c cVar = c.a;
        jhe0.a(cVar, "Null factory");
        a4.g = cVar;
        j0d c4 = a4.c();
        g0d a5 = j0d.a(new jgg0(du11.class, jse.class));
        a5.a(new vwi(new jgg0(du11.class, Executor.class), 1, 0));
        d dVar = d.a;
        jhe0.a(dVar, "Null factory");
        a5.g = dVar;
        return scc.g(c2, c3, c4, a5.c());
    }
}
