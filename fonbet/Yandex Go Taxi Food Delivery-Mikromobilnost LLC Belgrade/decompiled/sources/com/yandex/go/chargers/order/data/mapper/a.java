package com.yandex.go.chargers.order.data.mapper;

import com.yandex.go.chargers.analytics.ChargersError;
import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrdersResponse;
import defpackage.h3y;
import defpackage.kl9;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.sbx;
import defpackage.vmx;
import defpackage.yx9;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final class a {
    public final h3y a;
    public final h3y b;

    public a(h3y h3yVar, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = h3yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl, b bVar) {
        ChargersUnifiedPollingOrdersMapper$map$1 chargersUnifiedPollingOrdersMapper$map$1;
        int i;
        rl9 rl9Var;
        try {
            if (continuationImpl instanceof ChargersUnifiedPollingOrdersMapper$map$1) {
                chargersUnifiedPollingOrdersMapper$map$1 = (ChargersUnifiedPollingOrdersMapper$map$1) continuationImpl;
                int i2 = chargersUnifiedPollingOrdersMapper$map$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersUnifiedPollingOrdersMapper$map$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersUnifiedPollingOrdersMapper$map$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersUnifiedPollingOrdersMapper$map$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        sbx a = vmx.a.a();
                        a.getClass();
                        rl9 d = ((kl9) this.a.get()).d((ChargersActiveOrdersResponse) a.a(ChargersActiveOrdersResponse.Companion.serializer(), bVar), str);
                        e eVar = (e) this.b.get();
                        chargersUnifiedPollingOrdersMapper$map$1.L$0 = null;
                        chargersUnifiedPollingOrdersMapper$map$1.L$1 = null;
                        chargersUnifiedPollingOrdersMapper$map$1.L$2 = d;
                        chargersUnifiedPollingOrdersMapper$map$1.L$3 = null;
                        chargersUnifiedPollingOrdersMapper$map$1.label = 1;
                        if (eVar.d(d, chargersUnifiedPollingOrdersMapper$map$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        rl9Var = d;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rl9Var = (rl9) chargersUnifiedPollingOrdersMapper$map$1.L$2;
                        kotlin.b.b(obj);
                    }
                    return rl9Var.a;
                }
            }
            if (i != 0) {
            }
            return rl9Var.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            yx9.a(ChargersError.Companion, ChargersError.PollingOrdersMapper, "Unable to map jsonElement to list of ChargersOrder", 4);
            return EmptyList.a;
        }
        chargersUnifiedPollingOrdersMapper$map$1 = new ChargersUnifiedPollingOrdersMapper$map$1(this, continuationImpl);
        Object obj2 = chargersUnifiedPollingOrdersMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersUnifiedPollingOrdersMapper$map$1.label;
    }
}
