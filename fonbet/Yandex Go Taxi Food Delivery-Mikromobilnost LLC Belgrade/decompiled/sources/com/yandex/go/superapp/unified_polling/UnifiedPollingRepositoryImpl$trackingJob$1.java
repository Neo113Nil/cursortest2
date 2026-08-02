package com.yandex.go.superapp.unified_polling;

import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersPayloadDto;
import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersResponseDto;
import defpackage.bvf0;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingRepositoryImpl$trackingJob$1", f = "UnifiedPollingRepositoryImpl.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UnifiedPollingRepositoryImpl$trackingJob$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ k this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfmt;", "Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersResponseDto;", "response", "Lycw0;", "<anonymous>", "(Lfmt;)Lycw0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingRepositoryImpl$trackingJob$1$2", f = "UnifiedPollingRepositoryImpl.kt", l = {90}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.superapp.unified_polling.UnifiedPollingRepositoryImpl$trackingJob$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((fmt) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            fmt fmtVar = (fmt) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            k kVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            kVar.getClass();
            SuperAppOrdersPayloadDto superAppOrdersPayloadDto = ((SuperAppOrdersResponseDto) fmtVar.a).a;
            Object n = superAppOrdersPayloadDto != null ? bvf0.n(new UnifiedPollingRepositoryImpl$parseResponse$2(kVar, superAppOrdersPayloadDto, fmtVar, null), this) : null;
            return n == coroutineSingletons ? coroutineSingletons : n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingRepositoryImpl$trackingJob$1(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnifiedPollingRepositoryImpl$trackingJob$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UnifiedPollingRepositoryImpl$trackingJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k kVar = this.this$0;
        kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.X(kVar.j, new UnifiedPollingRepositoryImpl$trackingJob$1$invokeSuspend$$inlined$flatMapLatest$1(kVar, null)), new AnonymousClass2(this.this$0, null));
        j jVar = new j(this.this$0);
        this.label = 1;
        Object collect = I.collect(new h0(jVar), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
