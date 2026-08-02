package com.yandex.go.address.search.perf;

import android.os.SystemClock;
import defpackage.bva0;
import defpackage.cfs;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.mua0;
import defpackage.ocp0;
import defpackage.q91;
import defpackage.r91;
import defpackage.s91;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tt2;
import defpackage.v91;
import defpackage.xvz;
import defpackage.yes;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.yandex.taxi.perf.screen.ScreenEndpoint;

/* loaded from: classes12.dex */
public final class b implements q91 {
    public final String a;
    public final r91 b;
    public final ru.yandex.taxi.perf.b c;
    public final mua0 d;
    public final bva0 e;
    public cfs f;
    public final hbp0 g;
    public v91 h;
    public v91 i;
    public final CopyOnWriteArrayList j;

    public b(String str, r91 r91Var, ru.yandex.taxi.perf.b bVar, tt2 tt2Var, mua0 mua0Var, bva0 bva0Var) {
        this.a = str;
        this.b = r91Var;
        this.c = bVar;
        this.d = mua0Var;
        this.e = bva0Var;
        hbp0 hbp0Var = new hbp0(new AddressesListUpdatePerfCallbackImpl$coroutineScope$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
        hbp0Var.a();
        this.g = hbp0Var;
        this.j = new CopyOnWriteArrayList();
    }

    public final void a() {
        final v91 v91Var = this.i;
        if (v91Var == null) {
            return;
        }
        this.i = null;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        xvz.B(this.e.b, this);
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = this.j;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (jl40.l(((s91) next).b, v91Var.a)) {
                arrayList.add(next);
            }
        }
        final ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            s91 s91Var = (s91) it2.next();
            arrayList2.add(new ocp0(s91Var.a, s91Var.c - v91Var.b, s91Var.d, s91Var.e));
        }
        copyOnWriteArrayList.clear();
        cfs cfsVar = this.f;
        if (cfsVar != null) {
            cfsVar.b(new tls() { // from class: com.yandex.go.address.search.perf.a
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    b bVar = b.this;
                    hbp0.e(bVar.g, null, null, new AddressesListUpdatePerfCallbackImpl$onAllSuggestItemsBound$1$1((yes) obj, bVar, v91Var, elapsedRealtime, arrayList2, null), 3);
                    return zy11.a;
                }
            });
        }
    }

    public final void b(ScreenEndpoint screenEndpoint, long j, String str, String str2) {
        v91 v91Var = this.i;
        if (v91Var == null && (v91Var = this.h) == null) {
            return;
        }
        if (str2 == null || str2.equals(v91Var.e.getAnalyticsValue())) {
            this.j.add(new s91(screenEndpoint, v91Var.a, SystemClock.elapsedRealtime(), j, str));
        }
    }

    public final void c() {
        v91 v91Var = this.h;
        if (v91Var == null) {
            return;
        }
        this.h = null;
        this.i = v91Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        CopyOnWriteArrayList copyOnWriteArrayList = this.j;
        ArrayList arrayList = new ArrayList(tcc.n(copyOnWriteArrayList, 10));
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            s91 s91Var = (s91) it.next();
            arrayList.add(new ocp0(s91Var.a, s91Var.c - v91Var.b, s91Var.d, s91Var.e));
        }
        hbp0.e(this.g, null, null, new AddressesListUpdatePerfCallbackImpl$onFirstSuggestItemBound$1(this, v91Var, elapsedRealtime, arrayList, null), 3);
    }
}
