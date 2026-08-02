package com.yandex.go.scooters.data;

import defpackage.n1o0;
import defpackage.ny61;
import defpackage.u1o0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.h;

/* loaded from: classes13.dex */
public final class d {
    public final h a;
    public final u1o0 b;

    public d(h hVar, u1o0 u1o0Var) {
        this.a = hVar;
        this.b = u1o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersIsNewbieRepository$isNewbie$1 scootersIsNewbieRepository$isNewbie$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ScootersIsNewbieRepository$isNewbie$1) {
            scootersIsNewbieRepository$isNewbie$1 = (ScootersIsNewbieRepository$isNewbie$1) continuationImpl;
            int i2 = scootersIsNewbieRepository$isNewbie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIsNewbieRepository$isNewbie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIsNewbieRepository$isNewbie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIsNewbieRepository$isNewbie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z2 = this.a.a().d;
                    scootersIsNewbieRepository$isNewbie$1.Z$0 = z2;
                    scootersIsNewbieRepository$isNewbie$1.label = 1;
                    Object b = this.b.a.b(scootersIsNewbieRepository$isNewbie$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    z = z2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = scootersIsNewbieRepository$isNewbie$1.Z$0;
                    kotlin.b.b(obj);
                }
                n1o0 n1o0Var = (n1o0) obj;
                return Boolean.valueOf(!z && n1o0Var.b && n1o0Var.d);
            }
        }
        scootersIsNewbieRepository$isNewbie$1 = new ScootersIsNewbieRepository$isNewbie$1(this, continuationImpl);
        Object obj2 = scootersIsNewbieRepository$isNewbie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIsNewbieRepository$isNewbie$1.label;
        if (i != 0) {
        }
        n1o0 n1o0Var2 = (n1o0) obj2;
        return Boolean.valueOf(!z && n1o0Var2.b && n1o0Var2.d);
    }
}
