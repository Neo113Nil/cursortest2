package com.yandex.passport.internal.ui.bouncer.fallback;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.links.h;
import com.yandex.passport.internal.report.reporters.n;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.bouncer.t;
import defpackage.bvf0;
import defpackage.nns0;
import defpackage.ny61;
import defpackage.rs11;
import defpackage.s50;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c extends com.lightside.slab.a {
    public final t E;
    public final n F;
    public w1 G;
    public final nns0 I;
    public final String H = "FallbackSlab";
    public final s50 J = (s50) registerForActivityResult(new b(), new h(this, 2));

    public c(BouncerActivity bouncerActivity, t tVar, n nVar) {
        this.E = tVar;
        this.F = nVar;
        this.I = new nns0(bouncerActivity, 1);
    }

    @Override // defpackage.ins0
    public final String d() {
        return this.H;
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.lightside.slab.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(w1 w1Var, ContinuationImpl continuationImpl) {
        FallbackSlab$performBind$1 fallbackSlab$performBind$1;
        int i;
        c cVar = this;
        w1 w1Var2 = w1Var;
        if (continuationImpl instanceof FallbackSlab$performBind$1) {
            fallbackSlab$performBind$1 = (FallbackSlab$performBind$1) continuationImpl;
            int i2 = fallbackSlab$performBind$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fallbackSlab$performBind$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fallbackSlab$performBind$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fallbackSlab$performBind$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "performBind: " + w1Var2, 8);
                    }
                    cVar.G = w1Var2;
                    long b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, 120L);
                    fallbackSlab$performBind$1.L$0 = cVar;
                    fallbackSlab$performBind$1.L$1 = w1Var2;
                    fallbackSlab$performBind$1.label = 1;
                    if (kotlinx.coroutines.a.i(b, fallbackSlab$performBind$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w1 w1Var3 = (w1) fallbackSlab$performBind$1.L$1;
                    c cVar3 = (c) fallbackSlab$performBind$1.L$0;
                    kotlin.b.b(obj);
                    w1Var2 = w1Var3;
                    cVar = cVar3;
                }
                if (cVar.c.getIsAttached() && bvf0.D(bvf0.a(fallbackSlab$performBind$1.get_context()))) {
                    cVar.F.j(w1Var2);
                    cVar.J.a(w1Var2);
                }
                return zy11.a;
            }
        }
        fallbackSlab$performBind$1 = new FallbackSlab$performBind$1(cVar, continuationImpl);
        Object obj2 = fallbackSlab$performBind$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fallbackSlab$performBind$1.label;
        if (i != 0) {
        }
        if (cVar.c.getIsAttached()) {
            cVar.F.j(w1Var2);
            cVar.J.a(w1Var2);
        }
        return zy11.a;
    }
}
