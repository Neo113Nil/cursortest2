package com.yandex.go.taxi.summary.verticalsummary.interactor;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.verticalsummary.repository.MarginSource;
import defpackage.ai31;
import defpackage.at20;
import defpackage.bi31;
import defpackage.bvf0;
import defpackage.c0h;
import defpackage.c4r0;
import defpackage.ci31;
import defpackage.di31;
import defpackage.edv0;
import defpackage.gdv0;
import defpackage.gtz0;
import defpackage.jl40;
import defpackage.kdd0;
import defpackage.lh31;
import defpackage.mww0;
import defpackage.oev0;
import defpackage.pev0;
import defpackage.sh31;
import defpackage.th31;
import defpackage.tox0;
import defpackage.uh31;
import defpackage.uox0;
import defpackage.v0s;
import defpackage.vep0;
import defpackage.vh31;
import defpackage.w511;
import defpackage.w81;
import defpackage.wh31;
import defpackage.xh31;
import defpackage.yh31;
import defpackage.zh31;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class g {
    public final vep0 a;
    public final at20 b;
    public final v0s c;
    public final w81 d;
    public final gtz0 e;
    public final com.yandex.go.summary.interactor.common.action.a f;
    public final mww0 g;
    public final kdd0 h;
    public final c0h i;
    public final lh31 j;

    public g(vep0 vep0Var, at20 at20Var, v0s v0sVar, w81 w81Var, gtz0 gtz0Var, com.yandex.go.summary.interactor.common.action.a aVar, mww0 mww0Var, kdd0 kdd0Var, c0h c0hVar, lh31 lh31Var) {
        this.a = vep0Var;
        this.b = at20Var;
        this.c = v0sVar;
        this.d = w81Var;
        this.e = gtz0Var;
        this.f = aVar;
        this.g = mww0Var;
        this.h = kdd0Var;
        this.i = c0hVar;
        this.j = lh31Var;
    }

    public final Object a(di31 di31Var, com.yandex.go.taxi.summary.verticalsummary.router.c cVar, SuspendLambda suspendLambda) {
        oev0 edv0Var;
        boolean z = di31Var instanceof sh31;
        zy11 zy11Var = zy11.a;
        if (z) {
            this.d.a(((sh31) di31Var).a, cVar);
            return zy11Var;
        }
        if (di31Var instanceof uh31) {
            return this.c.a(((uh31) di31Var).a, cVar, suspendLambda);
        }
        if (di31Var instanceof bi31) {
            this.e.a(((bi31) di31Var).a, cVar);
            return zy11Var;
        }
        if (di31Var instanceof ci31) {
            return this.f.a(((ci31) di31Var).a, cVar, suspendLambda);
        }
        if (di31Var instanceof zh31) {
            return this.h.d(((zh31) di31Var).a, cVar, suspendLambda);
        }
        if (di31Var instanceof yh31) {
            yh31 yh31Var = (yh31) di31Var;
            uox0 uox0Var = yh31Var.a;
            boolean z2 = yh31Var.b;
            at20 at20Var = this.b;
            at20Var.getClass();
            tox0 tox0Var = uox0Var.g;
            if (uox0Var.a) {
                return ((pev0) at20Var.b).a(new gdv0(SummaryExpandReason.SELECTOR_TAP), suspendLambda);
            }
            if (!z2) {
                ((c4r0) at20Var.a).d(SelectionOrigin.USER, tox0Var.c, tox0Var.b, true);
                return zy11Var;
            }
        } else {
            if (!jl40.l(di31Var, wh31.a)) {
                boolean z3 = di31Var instanceof xh31;
                lh31 lh31Var = this.j;
                if (z3) {
                    lh31.a(lh31Var, MarginSource.BottomSheet, null, new Integer(((xh31) di31Var).a), 2);
                    return zy11Var;
                }
                if (di31Var instanceof vh31) {
                    lh31.a(lh31Var, MarginSource.BottomSheet, new Integer(((vh31) di31Var).a), null, 4);
                    return zy11Var;
                }
                if (di31Var instanceof ai31) {
                    this.g.a(((ai31) di31Var).a, cVar);
                    return zy11Var;
                }
                if (!(di31Var instanceof th31)) {
                    w511.b();
                    return null;
                }
                th31 th31Var = (th31) di31Var;
                SummaryExpandReason summaryExpandReason = th31Var.a;
                boolean z4 = th31Var.b;
                c0h c0hVar = this.i;
                c0hVar.getClass();
                if (z4) {
                    edv0Var = new gdv0(summaryExpandReason);
                } else {
                    if (z4) {
                        w511.b();
                        return null;
                    }
                    edv0Var = new edv0(summaryExpandReason);
                }
                return c0hVar.a.a(edv0Var, suspendLambda);
            }
            vep0 vep0Var = this.a;
            vep0Var.getClass();
            Object n = bvf0.n(new ScreenStartInteractor$handleAction$2(vep0Var, cVar, null), suspendLambda);
            if (n == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return n;
            }
        }
        return zy11Var;
    }
}
