package com.yandex.messaging.domain;

import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getRecommendedUsers$$inlined$makeCall$1;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.fse;
import defpackage.gbb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.to3;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "Loyj0;", "", "", "Lqn2;", "<anonymous>", "(Ltse;)Loyj0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.GetUserSuggestUseCase$run$result$1", f = "GetUserSuggestUseCase.kt", l = {60, 60}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetUserSuggestUseCase$run$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ GetUserSuggestUseCase$Source $source;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserSuggestUseCase$run$result$1(h hVar, GetUserSuggestUseCase$Source getUserSuggestUseCase$Source, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$source = getUserSuggestUseCase$Source;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetUserSuggestUseCase$run$result$1(this.this$0, this.$source, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetUserSuggestUseCase$run$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.messaging.internal.authorized.j jVar = this.this$0.b;
            this.label = 1;
            obj = gbb1.c(jVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        to3 a = ((d9g) ((cl21) obj)).a();
        String s = this.$source.getS();
        this.label = 2;
        fse fseVar = get_context();
        if (fseVar == null) {
            fseVar = get_context();
        }
        Object k0 = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$getRecommendedUsers$$inlined$makeCall$1(null, a, s), this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
