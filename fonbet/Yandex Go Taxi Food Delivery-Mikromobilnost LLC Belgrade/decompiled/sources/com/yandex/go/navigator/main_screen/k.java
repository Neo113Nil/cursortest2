package com.yandex.go.navigator.main_screen;

import com.yandex.mapkit.geometry.Point;
import defpackage.k200;
import defpackage.k700;
import defpackage.m901;
import defpackage.mo21;
import defpackage.n3h;
import defpackage.ny61;
import defpackage.po21;
import defpackage.wjg;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class k {
    public final n3h a;
    public final m901 b;
    public final com.yandex.go.navigator.map_interactions.parkings.c c;
    public final po21 d;
    public final com.yandex.go.navigator.repository.o e;
    public final com.yandex.go.navigator.analitycs.a f;
    public final com.yandex.go.navigator.driving.analytics.a g;

    public k(n3h n3hVar, m901 m901Var, com.yandex.go.navigator.map_interactions.parkings.c cVar, po21 po21Var, com.yandex.go.navigator.repository.o oVar, com.yandex.go.navigator.analitycs.a aVar, com.yandex.go.navigator.driving.analytics.a aVar2) {
        this.a = n3hVar;
        this.b = m901Var;
        this.c = cVar;
        this.d = po21Var;
        this.e = oVar;
        this.f = aVar;
        this.g = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(k700 k700Var, ContinuationImpl continuationImpl) {
        MainModalUiActionInteractor$openRoadEvent$1 mainModalUiActionInteractor$openRoadEvent$1;
        int i;
        if (continuationImpl instanceof MainModalUiActionInteractor$openRoadEvent$1) {
            mainModalUiActionInteractor$openRoadEvent$1 = (MainModalUiActionInteractor$openRoadEvent$1) continuationImpl;
            int i2 = mainModalUiActionInteractor$openRoadEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainModalUiActionInteractor$openRoadEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainModalUiActionInteractor$openRoadEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainModalUiActionInteractor$openRoadEvent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mainModalUiActionInteractor$openRoadEvent$1.L$0 = null;
                    mainModalUiActionInteractor$openRoadEvent$1.L$1 = k700Var;
                    mainModalUiActionInteractor$openRoadEvent$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.d).h(mainModalUiActionInteractor$openRoadEvent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k700Var = (k700) mainModalUiActionInteractor$openRoadEvent$1.L$1;
                    kotlin.b.b(obj);
                }
                zzs a = ((mo21) obj).a();
                k700Var.a.r(new k200(4, new wjg(new Point(a.a, a.b), 6)));
                return zy11.a;
            }
        }
        mainModalUiActionInteractor$openRoadEvent$1 = new MainModalUiActionInteractor$openRoadEvent$1(this, continuationImpl);
        Object obj2 = mainModalUiActionInteractor$openRoadEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainModalUiActionInteractor$openRoadEvent$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        k700Var.a.r(new k200(4, new wjg(new Point(a2.a, a2.b), 6)));
        return zy11.a;
    }
}
