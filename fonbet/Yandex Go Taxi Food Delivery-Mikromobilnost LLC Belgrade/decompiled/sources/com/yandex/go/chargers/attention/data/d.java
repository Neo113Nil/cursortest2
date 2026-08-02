package com.yandex.go.chargers.attention.data;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements tpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ e b;

    public d(b bVar, e eVar) {
        this.a = bVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1 chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof ChargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1) {
            chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1 = (ChargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1) continuation;
            int i2 = chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1.L$0 = null;
                    chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1.L$1 = null;
                    chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1.L$2 = null;
                    chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(cVar, chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1 = new ChargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
