package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import defpackage.ny61;
import defpackage.px4;
import defpackage.r95;
import defpackage.yvf0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final com.yandex.go.scooters.data.d a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final px4 j;

    public d(com.yandex.go.scooters.data.d dVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, px4 px4Var) {
        this.a = dVar;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
        this.g = yvf0Var6;
        this.h = yvf0Var7;
        this.i = yvf0Var8;
        this.j = px4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersOfferBookHandlerFactory$create$1 scootersOfferBookHandlerFactory$create$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof ScootersOfferBookHandlerFactory$create$1) {
            scootersOfferBookHandlerFactory$create$1 = (ScootersOfferBookHandlerFactory$create$1) continuationImpl;
            int i2 = scootersOfferBookHandlerFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOfferBookHandlerFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOfferBookHandlerFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOfferBookHandlerFactory$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersOfferBookHandlerFactory$create$1.label = 1;
                    obj = this.a.a(scootersOfferBookHandlerFactory$create$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                yvf0 yvf0Var = this.b;
                yvf0 yvf0Var2 = this.d;
                yvf0 yvf0Var3 = this.e;
                if (!booleanValue) {
                    r95 r95Var = (r95) yvf0Var3.get();
                    r95Var.b((r95) yvf0Var2.get());
                    r95Var.b((r95) yvf0Var.get());
                    return r95Var;
                }
                r95 r95Var2 = (r95) yvf0Var2.get();
                r95Var2.b((r95) yvf0Var3.get());
                r95Var2.b((r95) this.h.get());
                r95Var2.b((r95) this.i.get());
                r95Var2.b((r95) this.j.get());
                r95Var2.b((r95) this.c.get());
                r95Var2.b((r95) this.f.get());
                r95Var2.b((r95) this.g.get());
                r95Var2.b((r95) yvf0Var.get());
                return r95Var2;
            }
        }
        scootersOfferBookHandlerFactory$create$1 = new ScootersOfferBookHandlerFactory$create$1(this, continuationImpl);
        Object obj2 = scootersOfferBookHandlerFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOfferBookHandlerFactory$create$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        yvf0 yvf0Var4 = this.b;
        yvf0 yvf0Var22 = this.d;
        yvf0 yvf0Var32 = this.e;
        if (!booleanValue) {
        }
    }
}
