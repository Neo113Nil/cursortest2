package com.yandex.go.scooters.misc.attention.data;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
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
        ScootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1 scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1;
        int i;
        if (continuation instanceof ScootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1) {
            scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1 = (ScootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1) continuation;
            int i2 = scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1.L$0 = null;
                    scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1.L$1 = null;
                    scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1.L$2 = null;
                    scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1.label = 1;
                    if (this.a.collect(cVar, scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1) == coroutineSingletons) {
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
        scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1 = new ScootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1(this, continuation);
        Object obj2 = scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
