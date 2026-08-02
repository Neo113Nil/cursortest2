package com.yandex.go.multimodal_route.repositories;

import com.yandex.go.multimodal_route.network.MultimodalRoutesApi;
import com.yandex.go.multimodal_route.network.models.CompleteRequestDto;
import com.yandex.go.multimodal_route.network.models.CompleteResponseDto;
import defpackage.ck;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.jst;
import defpackage.ny61;
import defpackage.on2;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final i3y a;

    public b(on2 on2Var) {
        this.a = kotlin.a.a(new ck(on2Var, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        MultimodalRoutesCompleteRouteRepository$completeRoute$1 multimodalRoutesCompleteRouteRepository$completeRoute$1;
        int i;
        try {
            if (continuationImpl instanceof MultimodalRoutesCompleteRouteRepository$completeRoute$1) {
                multimodalRoutesCompleteRouteRepository$completeRoute$1 = (MultimodalRoutesCompleteRouteRepository$completeRoute$1) continuationImpl;
                int i2 = multimodalRoutesCompleteRouteRepository$completeRoute$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    multimodalRoutesCompleteRouteRepository$completeRoute$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = multimodalRoutesCompleteRouteRepository$completeRoute$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = multimodalRoutesCompleteRouteRepository$completeRoute$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<CompleteResponseDto> a = ((MultimodalRoutesApi) this.a.getValue()).a(new CompleteRequestDto(str));
                        multimodalRoutesCompleteRouteRepository$completeRoute$1.L$0 = null;
                        multimodalRoutesCompleteRouteRepository$completeRoute$1.L$1 = null;
                        multimodalRoutesCompleteRouteRepository$completeRoute$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(a, null, multimodalRoutesCompleteRouteRepository$completeRoute$1);
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
                    return (CompleteResponseDto) obj;
                }
            }
            if (i != 0) {
            }
            return (CompleteResponseDto) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Multimodal Complete request error");
            return new Result.Failure(th);
        }
        multimodalRoutesCompleteRouteRepository$completeRoute$1 = new MultimodalRoutesCompleteRouteRepository$completeRoute$1(this, continuationImpl);
        Object obj2 = multimodalRoutesCompleteRouteRepository$completeRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRoutesCompleteRouteRepository$completeRoute$1.label;
    }
}
