package com.yandex.go.order.external.tracking;

import android.os.Looper;
import defpackage.czo0;
import defpackage.h1p;
import defpackage.hbp0;
import defpackage.hdn;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ky11;
import defpackage.ren;
import defpackage.ycw0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes8.dex */
public final class c {
    public final ky11 a;
    public final hbp0 b = new hbp0(new czo0(15), "EatsKitOrderTrackerImpl", null);
    public final LinkedHashSet c = new LinkedHashSet();

    public c(ky11 ky11Var) {
        this.a = ky11Var;
    }

    public static void c() {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        jst.e.a(20, "EatsKitOrderTrackerImpl", new IllegalStateException("Method accessed outside of MainThread"), "Method accessed outside of MainThread");
    }

    public final void a(hdn hdnVar) {
        c();
        LinkedHashSet linkedHashSet = this.c;
        linkedHashSet.add(hdnVar);
        if (linkedHashSet.size() == 1) {
            hbp0 hbp0Var = this.b;
            hbp0Var.a();
            hbp0.e(hbp0Var, null, CoroutineStart.UNDISPATCHED, new EatsKitOrderTrackerImpl$addListener$1(this, null), 1);
        }
    }

    public final ren b(h1p h1pVar) {
        ky11 ky11Var = this.a;
        Object obj = null;
        if (!((Boolean) ky11Var.a().getValue()).booleanValue()) {
            return null;
        }
        Iterator it = ((ycw0) ky11Var.d().getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ren renVar = (ren) next;
            if (renVar.n().getIsActive() && jl40.l(renVar.m(), h1pVar)) {
                obj = next;
                break;
            }
        }
        return (ren) obj;
    }
}
