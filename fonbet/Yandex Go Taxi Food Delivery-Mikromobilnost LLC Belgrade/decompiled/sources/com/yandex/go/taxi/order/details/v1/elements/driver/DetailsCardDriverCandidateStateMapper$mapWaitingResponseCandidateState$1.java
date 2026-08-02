package com.yandex.go.taxi.order.details.v1.elements.driver;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import defpackage.e6j;
import defpackage.jl40;
import defpackage.mb4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.x5j;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx5j;", "carIconState", "Lmb4;", "avatarState", "Le6j;", "<anonymous>", "(Lx5j;Lmb4;)Le6j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.driver.DetailsCardDriverCandidateStateMapper$mapWaitingResponseCandidateState$1", f = "DetailsCardDriverCandidateStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardDriverCandidateStateMapper$mapWaitingResponseCandidateState$1 extends SuspendLambda implements zls {
    final /* synthetic */ SearchInfoResponse$TaxiSearch.PerformerInfoResponse $candidate;
    final /* synthetic */ String $description;
    final /* synthetic */ Ref$ObjectRef<String> $lastId;
    final /* synthetic */ CharSequence $title;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardDriverCandidateStateMapper$mapWaitingResponseCandidateState$1(CharSequence charSequence, String str, SearchInfoResponse$TaxiSearch.PerformerInfoResponse performerInfoResponse, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(3, continuation);
        this.$title = charSequence;
        this.$description = str;
        this.$candidate = performerInfoResponse;
        this.$lastId = ref$ObjectRef;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DetailsCardDriverCandidateStateMapper$mapWaitingResponseCandidateState$1 detailsCardDriverCandidateStateMapper$mapWaitingResponseCandidateState$1 = new DetailsCardDriverCandidateStateMapper$mapWaitingResponseCandidateState$1(this.$title, this.$description, this.$candidate, this.$lastId, (Continuation) obj3);
        detailsCardDriverCandidateStateMapper$mapWaitingResponseCandidateState$1.L$0 = (x5j) obj;
        detailsCardDriverCandidateStateMapper$mapWaitingResponseCandidateState$1.L$1 = (mb4) obj2;
        return detailsCardDriverCandidateStateMapper$mapWaitingResponseCandidateState$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x5j x5jVar = (x5j) this.L$0;
        mb4 mb4Var = (mb4) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CharSequence charSequence = this.$title;
        String str = this.$description;
        if (str == null) {
            str = charSequence.toString();
        }
        e6j e6jVar = new e6j(charSequence, str, x5jVar, mb4Var, this.$candidate.a, !jl40.l(this.$lastId.element, r6));
        this.$lastId.element = this.$candidate.a;
        return e6jVar;
    }
}
