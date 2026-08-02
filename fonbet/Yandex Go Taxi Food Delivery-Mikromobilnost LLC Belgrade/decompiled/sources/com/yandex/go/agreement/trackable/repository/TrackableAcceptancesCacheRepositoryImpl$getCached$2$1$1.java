package com.yandex.go.agreement.trackable.repository;

import com.yandex.go.agreement.api.trackable.network.CachedTrackableAcceptance;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/go/agreement/api/trackable/network/CachedTrackableAcceptance;", "<anonymous>", "(Ltse;)Ljava/util/Set;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.agreement.trackable.repository.TrackableAcceptancesCacheRepositoryImpl$getCached$2$1$1", f = "TrackableAcceptancesCacheRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class TrackableAcceptancesCacheRepositoryImpl$getCached$2$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackableAcceptancesCacheRepositoryImpl$getCached$2$1$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackableAcceptancesCacheRepositoryImpl$getCached$2$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackableAcceptancesCacheRepositoryImpl$getCached$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Collection<?> values = this.this$0.d.k().getAll().values();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj2 : values) {
            if (obj2 instanceof String) {
                arrayList.add(obj2);
            }
        }
        b bVar = this.this$0;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (String str : arrayList) {
            arrayList2.add((CachedTrackableAcceptance) ((xnt) bVar.a).c(str, CachedTrackableAcceptance.Companion.serializer()));
        }
        return kotlin.collections.a.N0(arrayList2);
    }
}
