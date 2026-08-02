package com.yandex.go.routestops.v2.interactor;

import com.yandex.go.address.models.Address;
import defpackage.a3v;
import defpackage.afl0;
import defpackage.aye0;
import defpackage.c21;
import defpackage.c3l0;
import defpackage.d3l0;
import defpackage.dit0;
import defpackage.e3l0;
import defpackage.f3l0;
import defpackage.fcj0;
import defpackage.g3l0;
import defpackage.h3l0;
import defpackage.i3y;
import defpackage.i4u;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.rwo0;
import defpackage.sjh;
import defpackage.sy60;
import defpackage.tje;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wdl0;
import defpackage.wvb1;
import defpackage.xdl0;
import defpackage.ydl0;
import defpackage.yn5;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;

/* loaded from: classes13.dex */
public final class b {
    public final fcj0 a;
    public final h3l0 b;

    public b(fcj0 fcj0Var, h3l0 h3l0Var) {
        this.a = fcj0Var;
        this.b = h3l0Var;
    }

    public final Object a(ydl0 ydl0Var, aye0 aye0Var, Continuation continuation) {
        Object obj;
        boolean l = jl40.l(ydl0Var, wdl0.a);
        zy11 zy11Var = zy11.a;
        if (l) {
            aye0Var.a();
            return zy11Var;
        }
        if (jl40.l(ydl0Var, wdl0.b)) {
            aye0Var.a();
            return zy11Var;
        }
        boolean z = ydl0Var instanceof xdl0;
        fcj0 fcj0Var = this.a;
        if (z) {
            ((a3v) fcj0Var.b).F8(((Number) ((i3y) fcj0Var.e).getValue()).intValue(), ((xdl0) ydl0Var).a, ((i4u) fcj0Var.d).a);
            return zy11Var;
        }
        if (!(ydl0Var instanceof g3l0)) {
            if (jl40.l(ydl0Var, wdl0.c)) {
                fcj0Var.b();
                return zy11Var;
            }
            w511.b();
            return null;
        }
        g3l0 g3l0Var = (g3l0) ydl0Var;
        h3l0 h3l0Var = this.b;
        com.yandex.go.taxi.summary.routestops.e eVar = h3l0Var.a;
        if (g3l0Var instanceof e3l0) {
            List<afl0> list = ((e3l0) g3l0Var).a;
            List b = eVar.b();
            ArrayList arrayList = new ArrayList();
            for (afl0 afl0Var : list) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((Address) obj).B(), afl0Var.a)) {
                        break;
                    }
                }
                Address address = (Address) obj;
                if (address != null) {
                    arrayList.add(address);
                }
            }
            if (arrayList.size() != b.size()) {
                arrayList = null;
            }
            if (arrayList != null) {
                sjh sjhVar = uyj.a;
                Object k0 = tje.k0(mdh.b, new RouteEditUiActionInteractor$replaceDestinations$2(h3l0Var, arrayList, null), continuation);
                if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return k0;
                }
            }
        } else {
            boolean equals = g3l0Var.equals(c3l0.a);
            c21 c21Var = sy60.Q2;
            if (equals) {
                com.yandex.go.routestops.v2.router.b bVar = (com.yandex.go.routestops.v2.router.b) aye0Var.b;
                Address c = bVar.I.c();
                if (c != null) {
                    dit0 dit0Var = bVar.M;
                    wvb1 wvb1Var = bVar.G;
                    ModalViewOrigin modalViewOrigin = (ModalViewOrigin) wvb1Var.b;
                    boolean z2 = wvb1Var.a;
                    dit0Var.getClass();
                    yn5 yn5Var = new yn5(dit0Var, c, modalViewOrigin, z2);
                    bVar.P = yn5Var;
                    bVar.z(yn5Var, c21Var);
                    return zy11Var;
                }
            } else if (g3l0Var instanceof d3l0) {
                d3l0 d3l0Var = (d3l0) g3l0Var;
                if (d3l0Var.a == 0) {
                    ((com.yandex.go.routestops.v2.router.b) aye0Var.b).M.getClass();
                    return zy11Var;
                }
                int a = h3l0.a(d3l0Var);
                if (kotlin.collections.a.S(a, eVar.b()) != null) {
                    com.yandex.go.routestops.v2.router.b bVar2 = (com.yandex.go.routestops.v2.router.b) aye0Var.b;
                    Address c2 = bVar2.I.c();
                    if (c2 != null) {
                        dit0 dit0Var2 = bVar2.M;
                        wvb1 wvb1Var2 = bVar2.G;
                        ModalViewOrigin modalViewOrigin2 = (ModalViewOrigin) wvb1Var2.b;
                        boolean z3 = wvb1Var2.a;
                        dit0Var2.getClass();
                        rwo0 rwo0Var = new rwo0(dit0Var2, c2, a, modalViewOrigin2, z3);
                        bVar2.P = rwo0Var;
                        bVar2.z(rwo0Var, c21Var);
                        return zy11Var;
                    }
                }
            } else {
                if (!(g3l0Var instanceof f3l0)) {
                    w511.b();
                    return null;
                }
                int a2 = h3l0.a((f3l0) g3l0Var);
                if (kotlin.collections.a.S(a2, eVar.b()) != null) {
                    sjh sjhVar2 = uyj.a;
                    Object k02 = tje.k0(mdh.b, new RouteEditUiActionInteractor$removeDestination$2(h3l0Var, a2, null), continuation);
                    if (k02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return k02;
                    }
                }
            }
        }
        return zy11Var;
    }
}
