package com.yandex.go.taxi.order.queue.interactor;

import defpackage.dkg0;
import defpackage.gkg0;
import defpackage.ha2;
import defpackage.mdh;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.rjg0;
import defpackage.rkg0;
import defpackage.sjg0;
import defpackage.sjh;
import defpackage.tjg0;
import defpackage.tkg0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class l {
    public final tt2 a;
    public final com.yandex.go.navigation.screen.c b;
    public final n20 c;
    public final com.yandex.go.taxi.order.queue.mapper.a d;
    public final com.yandex.go.taxi.order.domain.repositories.e e;
    public final e f;
    public final d g;

    static {
        int i = d.b;
        int i2 = e.j;
    }

    public l(tt2 tt2Var, com.yandex.go.navigation.screen.c cVar, n20 n20Var, com.yandex.go.taxi.order.queue.mapper.a aVar, com.yandex.go.taxi.order.domain.repositories.e eVar, e eVar2, d dVar) {
        this.a = tt2Var;
        this.b = cVar;
        this.c = n20Var;
        this.d = aVar;
        this.e = eVar;
        this.f = eVar2;
        this.g = dVar;
    }

    public final tpr a(o2y0 o2y0Var) {
        ha2 n = kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.t(this.b.c()), kotlinx.coroutines.flow.e.t(new g(((com.yandex.go.taxi.order.provider.a) this.c).a())), new k(kotlinx.coroutines.flow.e.t(new i(o2y0Var.a(), this)), this, o2y0Var), new QueueInteractor$queueFlow$1(this, null));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(n, mdh.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(tkg0 tkg0Var, String str, ContinuationImpl continuationImpl) {
        QueueInteractor$updatePrice$1 queueInteractor$updatePrice$1;
        int i;
        dkg0 dkg0Var;
        tjg0 tjg0Var;
        if (continuationImpl instanceof QueueInteractor$updatePrice$1) {
            queueInteractor$updatePrice$1 = (QueueInteractor$updatePrice$1) continuationImpl;
            int i2 = queueInteractor$updatePrice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                queueInteractor$updatePrice$1.label = i2 - Integer.MIN_VALUE;
                QueueInteractor$updatePrice$1 queueInteractor$updatePrice$12 = queueInteractor$updatePrice$1;
                Object obj = queueInteractor$updatePrice$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = queueInteractor$updatePrice$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dkg0 dkg0Var2 = tkg0Var.a;
                    o2y0 o2y0Var = dkg0Var2.a;
                    String str2 = dkg0Var2.h;
                    gkg0 gkg0Var = dkg0Var2.g;
                    queueInteractor$updatePrice$12.L$0 = null;
                    queueInteractor$updatePrice$12.L$1 = null;
                    queueInteractor$updatePrice$12.L$2 = dkg0Var2;
                    queueInteractor$updatePrice$12.label = 1;
                    obj = this.f.a(o2y0Var, str, str2, gkg0Var, queueInteractor$updatePrice$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dkg0Var = dkg0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dkg0Var = (dkg0) queueInteractor$updatePrice$12.L$2;
                    kotlin.b.b(obj);
                }
                tjg0Var = (tjg0) obj;
                if (!(tjg0Var instanceof sjg0)) {
                    return null;
                }
                if (tjg0Var instanceof rjg0) {
                    return new rkg0(dkg0Var, 1);
                }
                w511.b();
                return null;
            }
        }
        queueInteractor$updatePrice$1 = new QueueInteractor$updatePrice$1(this, continuationImpl);
        QueueInteractor$updatePrice$1 queueInteractor$updatePrice$122 = queueInteractor$updatePrice$1;
        Object obj2 = queueInteractor$updatePrice$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = queueInteractor$updatePrice$122.label;
        if (i != 0) {
        }
        tjg0Var = (tjg0) obj2;
        if (!(tjg0Var instanceof sjg0)) {
        }
    }
}
