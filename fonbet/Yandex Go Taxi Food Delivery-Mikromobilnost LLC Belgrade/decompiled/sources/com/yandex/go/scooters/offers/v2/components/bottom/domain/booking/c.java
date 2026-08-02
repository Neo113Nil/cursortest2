package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuActionDialogOpenReason;
import defpackage.a7n0;
import defpackage.dvw;
import defpackage.h7n0;
import defpackage.hzn0;
import defpackage.j18;
import defpackage.lzn0;
import defpackage.m950;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.r95;
import defpackage.uem;
import defpackage.znn0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c extends r95 {
    public final n6n0 b;
    public final znn0 c;

    public c(n6n0 n6n0Var, znn0 znn0Var) {
        this.b = n6n0Var;
        this.c = znn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.r95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersMosRuBookHandler$handle$1 scootersMosRuBookHandler$handle$1;
        Object obj;
        Object obj2;
        int i;
        if (continuationImpl instanceof ScootersMosRuBookHandler$handle$1) {
            scootersMosRuBookHandler$handle$1 = (ScootersMosRuBookHandler$handle$1) continuationImpl;
            int i2 = scootersMosRuBookHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuBookHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersMosRuBookHandler$handle$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuBookHandler$handle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.c.a) {
                        scootersMosRuBookHandler$handle$1.label = 1;
                        j18 j18Var = new j18(1, dvw.b(scootersMosRuBookHandler$handle$1));
                        j18Var.u();
                        n6n0 n6n0Var = this.b;
                        uem uemVar = new uem(j18Var, 4);
                        uem uemVar2 = new uem(j18Var, 5);
                        com.yandex.go.scooters.offers.v2.g gVar = ((h7n0) n6n0Var).b;
                        gVar.A((m950) gVar.M.get(), new lzn0(new hzn0(ScootersMosRuActionDialogOpenReason.OFFER_SCREEN)), new a7n0(uemVar, uemVar2));
                        obj = j18Var.s();
                    }
                    scootersMosRuBookHandler$handle$1.label = 2;
                    Object a = super.a(scootersMosRuBookHandler$handle$1);
                    return a == obj2 ? obj2 : a;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    this.c.a = false;
                    return zy11.a;
                }
                scootersMosRuBookHandler$handle$1.label = 2;
                Object a2 = super.a(scootersMosRuBookHandler$handle$1);
                if (a2 == obj2) {
                }
            }
        }
        scootersMosRuBookHandler$handle$1 = new ScootersMosRuBookHandler$handle$1(this, continuationImpl);
        obj = scootersMosRuBookHandler$handle$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuBookHandler$handle$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        scootersMosRuBookHandler$handle$1.label = 2;
        Object a22 = super.a(scootersMosRuBookHandler$handle$1);
        if (a22 == obj2) {
        }
    }
}
