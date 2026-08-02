package com.yandex.go.chargers.attention.data;

import com.yandex.go.chargers.data.model.ChargersAttentionDto;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public a(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1 chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1;
        int i;
        ChargersAttentionDto chargersAttentionDto;
        if (continuation instanceof ChargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1) {
            chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1 = (ChargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1) continuation;
            int i2 = chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj;
                    if (cVar != null) {
                        chargersAttentionDto = (ChargersAttentionDto) ((xnt) this.b.a).d(cVar, ChargersAttentionDto.Companion.serializer());
                    } else {
                        chargersAttentionDto = null;
                    }
                    chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1.L$0 = null;
                    chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1.L$1 = null;
                    chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1.L$2 = null;
                    chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1.L$3 = null;
                    chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(chargersAttentionDto, chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1 = new ChargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersAttentionRepositoryImpl$chargersAttentionFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
