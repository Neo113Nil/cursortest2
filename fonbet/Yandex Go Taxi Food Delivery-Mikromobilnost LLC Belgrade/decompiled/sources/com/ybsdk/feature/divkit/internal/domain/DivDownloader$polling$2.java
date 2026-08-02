package com.ybsdk.feature.divkit.internal.domain;

import com.ybsdk.feature.divkit.internal.dto.DivPollingDto;
import com.ybsdk.feature.divkit.internal.dto.ResponseStatus;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/ybsdk/feature/divkit/internal/dto/DivPollingDto;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.divkit.internal.domain.DivDownloader$polling$2", f = "DivDownloader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DivDownloader$polling$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DivDownloader$polling$2 divDownloader$polling$2 = new DivDownloader$polling$2(2, continuation);
        divDownloader$polling$2.L$0 = obj;
        return divDownloader$polling$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivDownloader$polling$2) create((DivPollingDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(((DivPollingDto) this.L$0).getStatus() != ResponseStatus.IN_PROGRESS);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
