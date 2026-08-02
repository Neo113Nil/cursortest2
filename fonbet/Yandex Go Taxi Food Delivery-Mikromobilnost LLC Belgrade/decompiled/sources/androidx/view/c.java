package androidx.view;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import defpackage.a550;
import defpackage.jl40;
import defpackage.kf50;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qs31;
import defpackage.sls;
import defpackage.tls;
import defpackage.x43;
import defpackage.xfo;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class c extends kf50 {
    public final j g;
    public final /* synthetic */ d h;

    public c(d dVar, j jVar) {
        this.h = dVar;
        this.g = jVar;
    }

    @Override // defpackage.kf50
    public final b a(f fVar, Bundle bundle) {
        d dVar = this.h;
        return new b(dVar.a, fVar, bundle, dVar.h(), dVar.o, UUID.randomUUID().toString(), null);
    }

    @Override // defpackage.kf50
    public final void b(b bVar) {
        a550 a550Var;
        qs31 qs31Var;
        String str = bVar.y;
        d dVar = this.h;
        r0 r0Var = dVar.i;
        LinkedHashMap linkedHashMap = dVar.y;
        boolean l = jl40.l(linkedHashMap.get(bVar), Boolean.TRUE);
        super.b(bVar);
        linkedHashMap.remove(bVar);
        x43 x43Var = dVar.g;
        if (x43Var.contains(bVar)) {
            if (this.d) {
                return;
            }
            dVar.t();
            r0 r0Var2 = dVar.h;
            ArrayList arrayList = new ArrayList(x43Var);
            r0Var2.getClass();
            r0Var2.m(null, arrayList);
            ArrayList p = dVar.p();
            r0Var.getClass();
            r0Var.m(null, p);
            return;
        }
        dVar.s(bVar);
        if (bVar.A.w.a(Lifecycle.State.CREATED)) {
            bVar.b(Lifecycle.State.DESTROYED);
        }
        if (x43Var == null || !x43Var.isEmpty()) {
            Iterator it = x43Var.iterator();
            while (it.hasNext()) {
                if (jl40.l(((b) it.next()).y, str)) {
                    break;
                }
            }
        }
        if (!l && (a550Var = dVar.o) != null && (qs31Var = (qs31) a550Var.b.remove(str)) != null) {
            qs31Var.a();
        }
        dVar.t();
        ArrayList p2 = dVar.p();
        r0Var.getClass();
        r0Var.m(null, p2);
    }

    @Override // defpackage.kf50
    public final void d(final b bVar, final boolean z) {
        d dVar = this.h;
        j b = dVar.u.b(bVar.b.a);
        dVar.y.put(bVar, Boolean.valueOf(z));
        if (!b.equals(this.g)) {
            ((c) dVar.v.get(b)).d(bVar, z);
            return;
        }
        tls tlsVar = dVar.x;
        if (tlsVar != null) {
            ((NavController$executePopOperations$1) tlsVar).invoke(bVar);
            super.d(bVar, z);
            return;
        }
        sls slsVar = new sls() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$pop$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                super/*kf50*/.d(bVar, z);
                return zy11.a;
            }
        };
        x43 x43Var = dVar.g;
        int indexOf = x43Var.indexOf(bVar);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + bVar + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != x43Var.size()) {
            dVar.m(((b) x43Var.get(i)).b.A, true, false);
        }
        d.o(dVar, bVar);
        slsVar.invoke();
        dVar.u();
        dVar.b();
    }

    @Override // defpackage.kf50
    public final void f(b bVar) {
        super.f(bVar);
        if (this.h.g.contains(bVar)) {
            bVar.b(Lifecycle.State.STARTED);
        } else {
            ny61.r("Cannot transition entry that is not in the back stack");
        }
    }

    @Override // defpackage.kf50
    public final void g(b bVar) {
        d dVar = this.h;
        j b = dVar.u.b(bVar.b.a);
        if (!b.equals(this.g)) {
            Object obj = dVar.v.get(b);
            if (obj != null) {
                ((c) obj).g(bVar);
                return;
            } else {
                xfo.g(oyr.t(new StringBuilder("NavigatorBackStack for "), bVar.b.a, " should already be created"));
                return;
            }
        }
        tls tlsVar = dVar.w;
        if (tlsVar != null) {
            tlsVar.invoke(bVar);
            super.g(bVar);
        } else {
            Log.i("NavController", "Ignoring add of destination " + bVar.b + " outside of the call to navigate(). ");
        }
    }

    public final void j(b bVar) {
        super.g(bVar);
    }
}
