package com.yandex.go.rida.bids.interactor;

import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pp5;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class n {
    public final pp5 a;
    public final o2y0 b;
    public final com.yandex.go.rida.bids.data.a c;

    public n(pp5 pp5Var, o2y0 o2y0Var, com.yandex.go.rida.bids.data.a aVar) {
        this.a = pp5Var;
        this.b = o2y0Var;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n nVar, ContinuationImpl continuationImpl) {
        BoostButtonClickInteractor$processBoost$1 boostButtonClickInteractor$processBoost$1;
        int i;
        Boolean bool;
        r0 r0Var;
        Object value;
        pp5 pp5Var = nVar.a;
        if (continuationImpl instanceof BoostButtonClickInteractor$processBoost$1) {
            boostButtonClickInteractor$processBoost$1 = (BoostButtonClickInteractor$processBoost$1) continuationImpl;
            int i2 = boostButtonClickInteractor$processBoost$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                boostButtonClickInteractor$processBoost$1.label = i2 - Integer.MIN_VALUE;
                Object obj = boostButtonClickInteractor$processBoost$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = boostButtonClickInteractor$processBoost$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.rida.bids.data.a aVar = nVar.c;
                    int intValue = ((Number) pp5Var.a.getValue()).intValue();
                    boostButtonClickInteractor$processBoost$1.label = 1;
                    obj = aVar.c(intValue, boostButtonClickInteractor$processBoost$1);
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
                bool = (Boolean) obj;
                zy11 zy11Var = zy11.a;
                if (bool != null && bool.booleanValue()) {
                    r0Var = pp5Var.a;
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, Integer.valueOf(((Number) value).intValue() + 1)));
                    r0 r0Var2 = pp5Var.b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    r0Var2.getClass();
                    r0Var2.m(null, linkedHashMap);
                    pp5Var.c.l(null);
                }
                return zy11Var;
            }
        }
        boostButtonClickInteractor$processBoost$1 = new BoostButtonClickInteractor$processBoost$1(nVar, continuationImpl);
        Object obj2 = boostButtonClickInteractor$processBoost$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = boostButtonClickInteractor$processBoost$1.label;
        if (i != 0) {
        }
        bool = (Boolean) obj2;
        zy11 zy11Var2 = zy11.a;
        if (bool != null) {
            r0Var = pp5Var.a;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, Integer.valueOf(((Number) value).intValue() + 1)));
            r0 r0Var22 = pp5Var.b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            r0Var22.getClass();
            r0Var22.m(null, linkedHashMap2);
            pp5Var.c.l(null);
        }
        return zy11Var2;
    }
}
