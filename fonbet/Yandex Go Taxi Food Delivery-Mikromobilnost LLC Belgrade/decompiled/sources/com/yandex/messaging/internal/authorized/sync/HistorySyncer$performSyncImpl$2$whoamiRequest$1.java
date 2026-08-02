package com.yandex.messaging.internal.authorized.sync;

import defpackage.c051;
import defpackage.fse;
import defpackage.kse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/messaging/core/net/entities/proto/WhoamiResponse;", "<anonymous>", "(Ltse;)Lcom/yandex/messaging/core/net/entities/proto/WhoamiResponse;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.HistorySyncer$performSyncImpl$2$whoamiRequest$1", f = "HistorySyncer.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class HistorySyncer$performSyncImpl$2$whoamiRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $requestGuid;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistorySyncer$performSyncImpl$2$whoamiRequest$1(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$requestGuid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HistorySyncer$performSyncImpl$2$whoamiRequest$1(this.this$0, this.$requestGuid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HistorySyncer$performSyncImpl$2$whoamiRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        c051 c051Var = this.this$0.t;
        String str = this.$requestGuid;
        this.label = 1;
        kse.a(c051Var.a);
        fse fseVar = get_context();
        if (fseVar == null) {
            fseVar = get_context();
        }
        Object k0 = tje.k0(fseVar, new WhoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1(null, c051Var, str), this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
