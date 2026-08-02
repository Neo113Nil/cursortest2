package com.yandex.go.multimodal_route.ui.rate_route;

import com.yandex.go.multimodal_route.network.models.CompleteResponseDto;
import defpackage.cv40;
import defpackage.es40;
import defpackage.ny61;
import defpackage.tt2;
import defpackage.wv40;
import defpackage.yu40;
import defpackage.zu40;
import defpackage.zuj0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class g {
    public final cv40 a;
    public final zu40 b;
    public final wv40 c;
    public final com.yandex.go.multimodal_route.repositories.b d;
    public final com.yandex.go.multimodal_route.ui.rate_route.mappers.a e;
    public final zuj0 f;
    public final yu40 g;
    public final es40 h;

    public g(tt2 tt2Var, cv40 cv40Var, zu40 zu40Var, wv40 wv40Var, com.yandex.go.multimodal_route.repositories.b bVar, com.yandex.go.multimodal_route.ui.rate_route.mappers.a aVar, zuj0 zuj0Var, yu40 yu40Var, es40 es40Var) {
        this.a = cv40Var;
        this.b = zu40Var;
        this.c = wv40Var;
        this.d = bVar;
        this.e = aVar;
        this.f = zuj0Var;
        this.g = yu40Var;
        this.h = es40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, String str, ContinuationImpl continuationImpl) {
        MultimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1 multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1;
        int i;
        Object a;
        CompleteResponseDto completeResponseDto;
        gVar.getClass();
        if (continuationImpl instanceof MultimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1) {
            multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1 = (MultimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1) continuationImpl;
            int i2 = multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.multimodal_route.repositories.b bVar = gVar.d;
                    multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.L$0 = str;
                    multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.label = 1;
                    a = bVar.a(str, multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (a instanceof Result.Failure) {
                    a = null;
                }
                completeResponseDto = (CompleteResponseDto) a;
                if (completeResponseDto != null) {
                    return null;
                }
                gVar.g.e(str);
                com.yandex.go.multimodal_route.ui.rate_route.mappers.a aVar = gVar.e;
                multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.L$0 = null;
                multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.L$1 = null;
                multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.label = 2;
                Object a2 = aVar.a(str, completeResponseDto, multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1 = new MultimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1(gVar, continuationImpl);
        Object obj2 = multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRoutesRateScreenUiStateInteractor$feedbackUiState$1.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        completeResponseDto = (CompleteResponseDto) a;
        if (completeResponseDto != null) {
        }
    }
}
