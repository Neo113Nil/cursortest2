package com.yandex.go.chargers.error.data;

import com.yandex.go.chargers.error.api.ChargersErrorCode;
import defpackage.cy9;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.oeu;
import defpackage.s8o;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a {
    public final wnt a;
    public final tt2 b;

    public a(wnt wntVar, tt2 tt2Var) {
        this.a = wntVar;
        this.b = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Throwable th, Continuation continuation) {
        ChargersErrorDetailsMapperImpl$mapToErrorDetails$1 chargersErrorDetailsMapperImpl$mapToErrorDetails$1;
        int i;
        try {
            if (continuation instanceof ChargersErrorDetailsMapperImpl$mapToErrorDetails$1) {
                chargersErrorDetailsMapperImpl$mapToErrorDetails$1 = (ChargersErrorDetailsMapperImpl$mapToErrorDetails$1) continuation;
                int i2 = chargersErrorDetailsMapperImpl$mapToErrorDetails$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersErrorDetailsMapperImpl$mapToErrorDetails$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersErrorDetailsMapperImpl$mapToErrorDetails$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersErrorDetailsMapperImpl$mapToErrorDetails$1.label;
                    if (i != 0) {
                        b.b(obj);
                        this.b.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        ChargersErrorDetailsMapperImpl$mapToErrorDetails$2$1 chargersErrorDetailsMapperImpl$mapToErrorDetails$2$1 = new ChargersErrorDetailsMapperImpl$mapToErrorDetails$2$1(this, th, null);
                        chargersErrorDetailsMapperImpl$mapToErrorDetails$1.L$0 = null;
                        chargersErrorDetailsMapperImpl$mapToErrorDetails$1.label = 1;
                        obj = tje.k0(mdhVar, chargersErrorDetailsMapperImpl$mapToErrorDetails$2$1, chargersErrorDetailsMapperImpl$mapToErrorDetails$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return (cy9) obj;
                }
            }
            if (i != 0) {
            }
            return (cy9) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            String stringValue = ChargersErrorCode.UNKNOWN.getStringValue();
            oeu O = s8o.O(th2);
            return new cy9(6, stringValue, O != null ? O.a("X-YaTraceId") : null, null, null);
        }
        chargersErrorDetailsMapperImpl$mapToErrorDetails$1 = new ChargersErrorDetailsMapperImpl$mapToErrorDetails$1(this, continuation);
        Object obj2 = chargersErrorDetailsMapperImpl$mapToErrorDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersErrorDetailsMapperImpl$mapToErrorDetails$1.label;
    }
}
