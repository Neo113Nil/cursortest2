package com.yandex.go.places.map.data.repositories;

import defpackage.ny61;
import defpackage.uc4;
import defpackage.vpr;
import defpackage.zr00;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrganizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1 organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof OrganizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1) {
            organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1 = (OrganizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zr00 zr00Var = (zr00) obj;
                    uc4 uc4Var = zr00Var.a;
                    Float f = zr00Var.b;
                    Pair pair = (uc4Var == null || f == null) ? null : new Pair(uc4Var, f);
                    if (pair != null) {
                        organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(pair, organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1 = new OrganizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsMapStateRepository$getBboxStateFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
