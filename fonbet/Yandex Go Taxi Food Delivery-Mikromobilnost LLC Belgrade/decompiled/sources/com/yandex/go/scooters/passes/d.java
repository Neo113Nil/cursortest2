package com.yandex.go.scooters.passes;

import com.yandex.go.scooters.passes.data.model.ScootersPassesBduiExperiment;
import defpackage.bdo0;
import defpackage.beo0;
import defpackage.ceo0;
import defpackage.ggo0;
import defpackage.gyc;
import defpackage.h3y;
import defpackage.i5m;
import defpackage.ik0;
import defpackage.ny61;
import defpackage.oeo0;
import defpackage.peo0;
import defpackage.v7g;
import defpackage.w511;
import defpackage.wco0;
import defpackage.xvf0;
import defpackage.yco0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d implements beo0 {
    public final h3y a;
    public final wco0 b;

    public d(h3y h3yVar, wco0 wco0Var) {
        this.a = h3yVar;
        this.b = wco0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ggo0 ggo0Var, ContinuationImpl continuationImpl) {
        ScootersPassesFactoryImpl$create$1 scootersPassesFactoryImpl$create$1;
        int i;
        ScootersPassesBduiExperiment scootersPassesBduiExperiment;
        boolean z;
        if (continuationImpl instanceof ScootersPassesFactoryImpl$create$1) {
            scootersPassesFactoryImpl$create$1 = (ScootersPassesFactoryImpl$create$1) continuationImpl;
            int i2 = scootersPassesFactoryImpl$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesFactoryImpl$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassesFactoryImpl$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesFactoryImpl$create$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPassesFactoryImpl$create$1.L$0 = ggo0Var;
                    scootersPassesFactoryImpl$create$1.label = 1;
                    obj = this.b.a.b(scootersPassesFactoryImpl$create$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ggo0Var = (ggo0) scootersPassesFactoryImpl$create$1.L$0;
                    kotlin.b.b(obj);
                }
                scootersPassesBduiExperiment = (ScootersPassesBduiExperiment) obj;
                if (scootersPassesBduiExperiment.b) {
                    ScootersPassesBduiExperiment.Flows flows = scootersPassesBduiExperiment.c;
                    ScootersPassesScreenRoute$PassType scootersPassesScreenRoute$PassType = ggo0Var.a;
                    ScootersPassesScreenRoute$Intention scootersPassesScreenRoute$Intention = ggo0Var.b;
                    int i4 = ceo0.b[scootersPassesScreenRoute$PassType.ordinal()];
                    int i5 = 3;
                    int i6 = 2;
                    int i7 = 0;
                    if (i4 == 1) {
                        int i8 = ceo0.a[scootersPassesScreenRoute$Intention.ordinal()];
                        if (i8 != 1) {
                            if (i8 == 2) {
                                z = flows.a.a;
                            }
                            z = false;
                        } else {
                            z = flows.a.b;
                        }
                        if (z) {
                        }
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        int i9 = ceo0.a[scootersPassesScreenRoute$Intention.ordinal()];
                        if (i9 == 1) {
                            z = flows.b.b;
                        } else if (i9 != 2) {
                            if (i9 == 3) {
                                z = flows.b.c;
                            }
                            z = false;
                        } else {
                            z = flows.b.a;
                        }
                        if (z) {
                            bdo0 bdo0Var = (bdo0) this.a.get();
                            bdo0Var.getClass();
                            ik0 ik0Var = new ik0();
                            ik0Var.a = i5m.b(peo0.a);
                            ik0Var.b = new v7g(bdo0Var, 12);
                            ik0Var.c = new v7g(bdo0Var, 13);
                            ik0Var.d = new v7g(bdo0Var, 10);
                            ik0Var.e = new v7g(bdo0Var, 4);
                            ik0Var.f = new v7g(bdo0Var, i6);
                            ik0Var.g = new v7g(bdo0Var, 9);
                            ik0Var.h = new v7g(bdo0Var, 11);
                            ik0Var.i = new v7g(bdo0Var, 5);
                            ik0Var.j = new v7g(bdo0Var, i7);
                            ik0Var.k = new v7g(bdo0Var, i3);
                            ik0Var.l = new v7g(bdo0Var, i5);
                            ik0Var.m = new v7g(bdo0Var, 7);
                            ik0Var.n = new v7g(bdo0Var, 8);
                            ik0Var.o = i5m.b(yco0.a);
                            ik0Var.p = new v7g(bdo0Var, 6);
                            return new i(new gyc(ik0Var), (oeo0) ((xvf0) ik0Var.a).get());
                        }
                    }
                }
                return null;
            }
        }
        scootersPassesFactoryImpl$create$1 = new ScootersPassesFactoryImpl$create$1(this, continuationImpl);
        Object obj2 = scootersPassesFactoryImpl$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesFactoryImpl$create$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        scootersPassesBduiExperiment = (ScootersPassesBduiExperiment) obj2;
        if (scootersPassesBduiExperiment.b) {
        }
        return null;
    }
}
