package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.internal.ui.bouncer.model.z1;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.bvf0;
import defpackage.fse;
import defpackage.j73;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class p1 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.ui.bouncer.model.sloth.b a;
    public final com.yandex.passport.internal.ui.bouncer.model.b1 b;

    public p1(com.yandex.passport.internal.ui.bouncer.model.sloth.b bVar, com.yandex.passport.internal.ui.bouncer.model.b1 b1Var) {
        this.a = bVar;
        this.b = b1Var;
    }

    @Override // com.yandex.passport.common.mvi.e
    public final tpr a(kotlinx.coroutines.flow.n0 n0Var) {
        return new com.yandex.passport.common.mvi.c(new com.yandex.passport.internal.impl.d(n0Var, 22), this, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(SlothParams slothParams, ContinuationImpl continuationImpl) {
        StartSlothMiddleware$actuallyStartSloth$1 startSlothMiddleware$actuallyStartSloth$1;
        int i;
        p1 p1Var;
        com.yandex.passport.sloth.c1 c1Var;
        if (continuationImpl instanceof StartSlothMiddleware$actuallyStartSloth$1) {
            startSlothMiddleware$actuallyStartSloth$1 = (StartSlothMiddleware$actuallyStartSloth$1) continuationImpl;
            int i2 = startSlothMiddleware$actuallyStartSloth$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startSlothMiddleware$actuallyStartSloth$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startSlothMiddleware$actuallyStartSloth$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startSlothMiddleware$actuallyStartSloth$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.ui.bouncer.model.sloth.b bVar = this.a;
                    bVar.getClass();
                    com.yandex.passport.internal.ui.challenge.vpn.o oVar = new com.yandex.passport.internal.ui.challenge.vpn.o();
                    oVar.a = slothParams;
                    oVar.b = new com.yandex.passport.sloth.dependencies.f(j73.d0(new com.yandex.passport.sloth.dependencies.e[]{bVar.b.a}));
                    oVar.c = bVar.a.a();
                    com.yandex.passport.sloth.c1 a = oVar.a().a();
                    fse fseVar = startSlothMiddleware$actuallyStartSloth$1.get_context();
                    startSlothMiddleware$actuallyStartSloth$1.L$0 = this;
                    startSlothMiddleware$actuallyStartSloth$1.L$1 = slothParams;
                    startSlothMiddleware$actuallyStartSloth$1.L$2 = a;
                    startSlothMiddleware$actuallyStartSloth$1.label = 1;
                    if (a.c(fseVar, startSlothMiddleware$actuallyStartSloth$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    p1Var = this;
                    c1Var = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c1Var = (com.yandex.passport.sloth.c1) startSlothMiddleware$actuallyStartSloth$1.L$2;
                    slothParams = (SlothParams) startSlothMiddleware$actuallyStartSloth$1.L$1;
                    p1Var = (p1) startSlothMiddleware$actuallyStartSloth$1.L$0;
                    kotlin.b.b(obj);
                }
                com.yandex.passport.sloth.v vVar = c1Var.c;
                com.yandex.passport.sloth.b1 b1Var = c1Var.C;
                tje.N(bvf0.a(startSlothMiddleware$actuallyStartSloth$1.get_context()), null, null, new StartSlothMiddleware$actuallyStartSloth$$inlined$collectOn$1(vVar.d, null, p1Var), 3);
                tje.N(bvf0.a(startSlothMiddleware$actuallyStartSloth$1.get_context()), null, null, new StartSlothMiddleware$actuallyStartSloth$$inlined$collectOn$2(c1Var.c.e, null, p1Var), 3);
                tje.N(bvf0.a(startSlothMiddleware$actuallyStartSloth$1.get_context()), null, null, new StartSlothMiddleware$actuallyStartSloth$$inlined$collectOn$3(b1Var.b(), null, p1Var), 3);
                return new com.yandex.passport.internal.ui.bouncer.model.f0(new z1(slothParams, b1Var));
            }
        }
        startSlothMiddleware$actuallyStartSloth$1 = new StartSlothMiddleware$actuallyStartSloth$1(this, continuationImpl);
        Object obj2 = startSlothMiddleware$actuallyStartSloth$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startSlothMiddleware$actuallyStartSloth$1.label;
        if (i != 0) {
        }
        com.yandex.passport.sloth.v vVar2 = c1Var.c;
        com.yandex.passport.sloth.b1 b1Var2 = c1Var.C;
        tje.N(bvf0.a(startSlothMiddleware$actuallyStartSloth$1.get_context()), null, null, new StartSlothMiddleware$actuallyStartSloth$$inlined$collectOn$1(vVar2.d, null, p1Var), 3);
        tje.N(bvf0.a(startSlothMiddleware$actuallyStartSloth$1.get_context()), null, null, new StartSlothMiddleware$actuallyStartSloth$$inlined$collectOn$2(c1Var.c.e, null, p1Var), 3);
        tje.N(bvf0.a(startSlothMiddleware$actuallyStartSloth$1.get_context()), null, null, new StartSlothMiddleware$actuallyStartSloth$$inlined$collectOn$3(b1Var2.b(), null, p1Var), 3);
        return new com.yandex.passport.internal.ui.bouncer.model.f0(new z1(slothParams, b1Var2));
    }
}
