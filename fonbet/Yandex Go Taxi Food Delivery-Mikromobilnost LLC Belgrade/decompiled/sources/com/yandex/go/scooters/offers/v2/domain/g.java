package com.yandex.go.scooters.offers.v2.domain;

import defpackage.d4o0;
import defpackage.lbn0;
import defpackage.nro0;
import defpackage.ny61;
import defpackage.q4o0;
import defpackage.sco0;
import defpackage.tt2;
import defpackage.ufo0;
import defpackage.vbn0;
import defpackage.vyo0;
import defpackage.y5p0;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class g {
    public final tt2 a;
    public final y5p0 b;
    public final com.yandex.go.scooters.offers.v2.data.a c;
    public final f d;
    public final nro0 e;
    public final lbn0 f;
    public final ru.yandex.taxi.scooters.data.h g;
    public final com.yandex.go.scooters.payments.domain.a h;
    public final ufo0 i;
    public final q4o0 j;
    public final vyo0 k;

    public g(tt2 tt2Var, y5p0 y5p0Var, com.yandex.go.scooters.offers.v2.data.a aVar, f fVar, nro0 nro0Var, lbn0 lbn0Var, ru.yandex.taxi.scooters.data.h hVar, com.yandex.go.scooters.payments.domain.a aVar2, ufo0 ufo0Var, q4o0 q4o0Var, vyo0 vyo0Var) {
        this.a = tt2Var;
        this.b = y5p0Var;
        this.c = aVar;
        this.d = fVar;
        this.e = nro0Var;
        this.f = lbn0Var;
        this.g = hVar;
        this.h = aVar2;
        this.i = ufo0Var;
        this.j = q4o0Var;
        this.k = vyo0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d4o0 d4o0Var, Continuation continuation) {
        ScootersOffersInteractor$updateRepositories$1 scootersOffersInteractor$updateRepositories$1;
        int i;
        if (continuation instanceof ScootersOffersInteractor$updateRepositories$1) {
            scootersOffersInteractor$updateRepositories$1 = (ScootersOffersInteractor$updateRepositories$1) continuation;
            int i2 = scootersOffersInteractor$updateRepositories$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOffersInteractor$updateRepositories$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOffersInteractor$updateRepositories$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOffersInteractor$updateRepositories$1.label;
                y5p0 y5p0Var = this.b;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lbn0 lbn0Var = this.f;
                    if (d4o0Var != null) {
                        vbn0 vbn0Var = d4o0Var.c;
                        y5p0Var.b(vbn0Var.c);
                        sco0 sco0Var = vbn0Var.a;
                        scootersOffersInteractor$updateRepositories$1.L$0 = null;
                        scootersOffersInteractor$updateRepositories$1.label = 1;
                        lbn0Var.Cg(sco0Var, scootersOffersInteractor$updateRepositories$1);
                        if (zy11Var != coroutineSingletons) {
                            return zy11Var;
                        }
                    } else {
                        scootersOffersInteractor$updateRepositories$1.L$0 = null;
                        scootersOffersInteractor$updateRepositories$1.label = 2;
                        lbn0Var.Cg(null, scootersOffersInteractor$updateRepositories$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                y5p0Var.b(EmptyList.a);
                return zy11Var;
            }
        }
        scootersOffersInteractor$updateRepositories$1 = new ScootersOffersInteractor$updateRepositories$1(this, continuation);
        Object obj2 = scootersOffersInteractor$updateRepositories$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOffersInteractor$updateRepositories$1.label;
        y5p0 y5p0Var2 = this.b;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        y5p0Var2.b(EmptyList.a);
        return zy11Var2;
    }
}
