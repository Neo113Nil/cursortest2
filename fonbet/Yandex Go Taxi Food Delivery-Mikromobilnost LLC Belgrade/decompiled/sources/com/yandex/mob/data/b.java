package com.yandex.mob.data;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(List list, Continuation continuation) {
        MobContourProvisionMemoryStorage$subscribe$2$emit$1 mobContourProvisionMemoryStorage$subscribe$2$emit$1;
        int i;
        if (continuation instanceof MobContourProvisionMemoryStorage$subscribe$2$emit$1) {
            mobContourProvisionMemoryStorage$subscribe$2$emit$1 = (MobContourProvisionMemoryStorage$subscribe$2$emit$1) continuation;
            int i2 = mobContourProvisionMemoryStorage$subscribe$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobContourProvisionMemoryStorage$subscribe$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobContourProvisionMemoryStorage$subscribe$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobContourProvisionMemoryStorage$subscribe$2$emit$1.label;
                c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cVar.c(list);
                    mobContourProvisionMemoryStorage$subscribe$2$emit$1.L$0 = null;
                    mobContourProvisionMemoryStorage$subscribe$2$emit$1.label = 1;
                    if (c.a(cVar, mobContourProvisionMemoryStorage$subscribe$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                n0 n0Var = cVar.h;
                zy11 zy11Var = zy11.a;
                n0Var.g(zy11Var);
                return zy11Var;
            }
        }
        mobContourProvisionMemoryStorage$subscribe$2$emit$1 = new MobContourProvisionMemoryStorage$subscribe$2$emit$1(this, continuation);
        Object obj2 = mobContourProvisionMemoryStorage$subscribe$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobContourProvisionMemoryStorage$subscribe$2$emit$1.label;
        c cVar2 = this.a;
        if (i != 0) {
        }
        n0 n0Var2 = cVar2.h;
        zy11 zy11Var2 = zy11.a;
        n0Var2.g(zy11Var2);
        return zy11Var2;
    }
}
