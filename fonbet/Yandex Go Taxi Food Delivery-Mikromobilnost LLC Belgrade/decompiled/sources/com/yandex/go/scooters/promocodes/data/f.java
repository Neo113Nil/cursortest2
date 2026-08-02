package com.yandex.go.scooters.promocodes.data;

import com.yandex.go.scooters.promocodes.data.model.ScootersPromocodesErrorResponse;
import com.yandex.go.scooters.promocodes.data.model.ScootersPromocodesUseResponse;
import com.yandex.go.scooters.promocodes.domain.model.ScootersPromocodesException;
import defpackage.avj0;
import defpackage.j19;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tno0;
import defpackage.vno0;
import defpackage.xnt;
import defpackage.zgz;
import defpackage.zuj0;
import java.io.BufferedInputStream;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f {
    public final com.yandex.go.scooters.promocodes.data.mapper.a a;
    public final j19 b;
    public final g c;

    public f(com.yandex.go.scooters.promocodes.data.mapper.a aVar, j19 j19Var, g gVar) {
        this.a = aVar;
        this.b = j19Var;
        this.c = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersPromocodesUseRepository$use$1 scootersPromocodesUseRepository$use$1;
        int i;
        com.yandex.go.scooters.promocodes.data.mapper.a aVar;
        BufferedInputStream N;
        com.yandex.go.scooters.promocodes.data.mapper.a aVar2;
        try {
            if (continuationImpl instanceof ScootersPromocodesUseRepository$use$1) {
                scootersPromocodesUseRepository$use$1 = (ScootersPromocodesUseRepository$use$1) continuationImpl;
                int i2 = scootersPromocodesUseRepository$use$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPromocodesUseRepository$use$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersPromocodesUseRepository$use$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPromocodesUseRepository$use$1.label;
                    aVar = this.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g gVar = this.c;
                        scootersPromocodesUseRepository$use$1.L$0 = null;
                        scootersPromocodesUseRepository$use$1.L$1 = aVar;
                        scootersPromocodesUseRepository$use$1.label = 1;
                        obj = gVar.a(str, scootersPromocodesUseRepository$use$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar2 = aVar;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return (vno0) obj;
                        }
                        aVar2 = (com.yandex.go.scooters.promocodes.data.mapper.a) scootersPromocodesUseRepository$use$1.L$1;
                        kotlin.b.b(obj);
                    }
                    scootersPromocodesUseRepository$use$1.L$0 = null;
                    scootersPromocodesUseRepository$use$1.L$1 = null;
                    scootersPromocodesUseRepository$use$1.label = 2;
                    obj = aVar2.a((ScootersPromocodesUseResponse) obj, scootersPromocodesUseRepository$use$1);
                }
            }
            if (i != 0) {
            }
            scootersPromocodesUseRepository$use$1.L$0 = null;
            scootersPromocodesUseRepository$use$1.L$1 = null;
            scootersPromocodesUseRepository$use$1.label = 2;
            obj = aVar2.a((ScootersPromocodesUseResponse) obj, scootersPromocodesUseRepository$use$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            th = th;
            j19 j19Var = this.b;
            j19Var.getClass();
            if (s8o.x(th) && (N = s8o.N(th)) != null) {
                ScootersPromocodesErrorResponse scootersPromocodesErrorResponse = (ScootersPromocodesErrorResponse) ((xnt) j19Var.a).b(N, ScootersPromocodesErrorResponse.Companion.serializer());
                String str2 = scootersPromocodesErrorResponse.a;
                String str3 = scootersPromocodesErrorResponse.b;
                if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                    th = new ScootersPromocodesException(scootersPromocodesErrorResponse.a, str3);
                }
            }
            zuj0 zuj0Var = aVar.a;
            if (th instanceof ScootersPromocodesException) {
                ScootersPromocodesException scootersPromocodesException = th;
                if (scootersPromocodesException.getTitle().length() > 0) {
                    return new tno0(scootersPromocodesException.getTitle(), Collections.singletonList(scootersPromocodesException.getMessage()));
                }
            }
            zgz.a(null, th);
            avj0 avj0Var = (avj0) zuj0Var;
            return new tno0(avj0Var.h(kyh0.scooters_promocodes_use_error_title), Collections.singletonList(avj0Var.h(kyh0.scooters_promocodes_use_error_description)));
        }
        scootersPromocodesUseRepository$use$1 = new ScootersPromocodesUseRepository$use$1(this, continuationImpl);
        Object obj2 = scootersPromocodesUseRepository$use$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPromocodesUseRepository$use$1.label;
        aVar = this.a;
    }
}
