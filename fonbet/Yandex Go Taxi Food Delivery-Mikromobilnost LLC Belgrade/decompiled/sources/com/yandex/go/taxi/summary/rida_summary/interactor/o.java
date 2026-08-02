package com.yandex.go.taxi.summary.rida_summary.interactor;

import com.yandex.go.taxi.summary.rida_summary.repository.MarginSource;
import defpackage.biv0;
import defpackage.bvf0;
import defpackage.ci70;
import defpackage.f5k0;
import defpackage.f7k0;
import defpackage.fnx0;
import defpackage.g7k0;
import defpackage.h7k0;
import defpackage.i7k0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.l89;
import defpackage.lfv0;
import defpackage.nex0;
import defpackage.pex0;
import defpackage.rf5;
import defpackage.w511;
import defpackage.wep0;
import defpackage.wiq0;
import defpackage.wjm;
import defpackage.wrr;
import defpackage.x6k0;
import defpackage.xb80;
import defpackage.xfv0;
import defpackage.z6k0;
import defpackage.z880;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.analytics.Events$Summary$SummaryState;

/* loaded from: classes14.dex */
public final class o {
    public final wep0 a;
    public final f5k0 b;
    public final xfv0 c;
    public final com.yandex.go.taxi.summary.rida_summary.repository.i d;
    public final wrr e;
    public final z6k0 f;

    public o(wep0 wep0Var, f5k0 f5k0Var, xfv0 xfv0Var, com.yandex.go.taxi.summary.rida_summary.repository.i iVar, wrr wrrVar, z6k0 z6k0Var) {
        this.a = wep0Var;
        this.b = f5k0Var;
        this.c = xfv0Var;
        this.d = iVar;
        this.e = wrrVar;
        this.f = z6k0Var;
    }

    public final Object a(i7k0 i7k0Var, x6k0 x6k0Var, Continuation continuation) {
        pex0 pex0Var;
        boolean l = jl40.l(i7k0Var, g7k0.h);
        zy11 zy11Var = zy11.a;
        if (l) {
            Object n = bvf0.n(new ScreenStartInteractor$handleAction$2(this.a, x6k0Var, null), continuation);
            return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11Var;
        }
        if (jl40.l(i7k0Var, g7k0.b)) {
            x6k0Var.j();
            return zy11Var;
        }
        if (jl40.l(i7k0Var, g7k0.g)) {
            x6k0Var.r();
            return zy11Var;
        }
        boolean l2 = jl40.l(i7k0Var, g7k0.e);
        com.yandex.go.taxi.summary.rida_summary.repository.i iVar = this.d;
        if (l2) {
            iVar.b(-1);
            return zy11Var;
        }
        if (jl40.l(i7k0Var, g7k0.f)) {
            iVar.b(1);
            return zy11Var;
        }
        if (i7k0Var instanceof f7k0) {
            this.b.a(((f7k0) i7k0Var).a);
            return zy11Var;
        }
        if (!jl40.l(i7k0Var, g7k0.d)) {
            if (jl40.l(i7k0Var, g7k0.a)) {
                x6k0Var.close();
                return zy11Var;
            }
            if (jl40.l(i7k0Var, g7k0.c)) {
                this.c.a(lfv0.a);
                return zy11Var;
            }
            if (i7k0Var instanceof h7k0) {
                z6k0.a(this.f, MarginSource.BottomSheet, null, new Integer(((h7k0) i7k0Var).a), 2);
                return zy11Var;
            }
            w511.b();
            return null;
        }
        wrr wrrVar = this.e;
        z880 z880Var = (z880) wrrVar.c;
        fnx0 n2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) ((wiq0) wrrVar.w)).n();
        if (n2 != null && (pex0Var = n2.c) != null && pex0Var.u) {
            jst.e.n("Taxi order was initiated from Summary Screen, but tariff is unavailable");
        } else if (((l89) z880Var).c) {
            jst.e.n("Taxi order was initiated from Summary Screen, but another order was in processing");
        } else {
            ((ci70) ((xb80) wrrVar.z)).E = ((biv0) wrrVar.y).c() ? Events$Summary$SummaryState.EXPANDED : Events$Summary$SummaryState.COLLAPSED;
            z880Var.a();
            jst.e.n("Taxi order was initiated from Summary Screen");
        }
        ((nex0) wrrVar.x).a(((wjm) wrrVar.A).q());
        ((rf5) wrrVar.b).b();
        return zy11Var;
    }
}
