package com.yandex.go.agreement.trackable.repository;

import com.yandex.go.agreement.api.trackable.network.CachedTrackableAcceptance;
import defpackage.cne0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.agreement.trackable.repository.TrackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1", f = "TrackableAcceptancesCacheRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TrackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ CachedTrackableAcceptance $acceptance;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1(b bVar, CachedTrackableAcceptance cachedTrackableAcceptance, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$acceptance = cachedTrackableAcceptance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1(this.this$0, this.$acceptance, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TrackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1 trackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1 = (TrackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        trackableAcceptancesCacheRepositoryImpl$saveToCache$2$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        cne0 cne0Var = bVar.d;
        CachedTrackableAcceptance cachedTrackableAcceptance = this.$acceptance;
        cne0Var.r(cachedTrackableAcceptance.a, ((xnt) bVar.a).e(cachedTrackableAcceptance, CachedTrackableAcceptance.Companion.serializer()));
        return zy11.a;
    }
}
