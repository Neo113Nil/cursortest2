package com.ybsdk.core.common.data.cache;

import com.ybsdk.core.utils.ui.RequestStatus$Data$Source;
import defpackage.e5z0;
import defpackage.i5z0;
import defpackage.mlg;
import defpackage.mvg;
import defpackage.nv00;
import defpackage.ny61;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.vvj0;
import defpackage.wvj0;
import defpackage.yvj0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/ybsdk/core/common/data/cache/StoredLayoutInfo;", "storedInfo", "", "", "Lcom/ybsdk/core/common/data/cache/StoredDataEntry;", "commonData", "Lu8j0;", "Lnv00;", "", "<anonymous>", "(Lcom/ybsdk/core/common/data/cache/StoredLayoutInfo;Ljava/util/Map;)Lu8j0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.common.data.cache.ResponseCache$createResponseStorageFlow$mappedResponseUpdateJob$1", f = "ResponseCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ResponseCache$createResponseStorageFlow$mappedResponseUpdateJob$1 extends SuspendLambda implements zls {
    final /* synthetic */ vvj0 $key;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseCache$createResponseStorageFlow$mappedResponseUpdateJob$1(b bVar, vvj0 vvj0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
        this.$key = vvj0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ResponseCache$createResponseStorageFlow$mappedResponseUpdateJob$1 responseCache$createResponseStorageFlow$mappedResponseUpdateJob$1 = new ResponseCache$createResponseStorageFlow$mappedResponseUpdateJob$1(this.this$0, this.$key, (Continuation) obj3);
        responseCache$createResponseStorageFlow$mappedResponseUpdateJob$1.L$0 = (StoredLayoutInfo) obj;
        responseCache$createResponseStorageFlow$mappedResponseUpdateJob$1.L$1 = (Map) obj2;
        return responseCache$createResponseStorageFlow$mappedResponseUpdateJob$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        StoredLayoutInfo storedLayoutInfo = (StoredLayoutInfo) this.L$0;
        Map map = (Map) this.L$1;
        b bVar = this.this$0;
        vvj0 vvj0Var = this.$key;
        bVar.getClass();
        try {
            if (storedLayoutInfo == null) {
                e5z0 e5z0Var = i5z0.a;
                e5z0Var.m("ResponseCache");
                e5z0Var.a("Cache miss", new Object[0]);
                failure = null;
            } else {
                e5z0 e5z0Var2 = i5z0.a;
                e5z0Var2.m("ResponseCache");
                e5z0Var2.a("Cache hit. Mapping", new Object[0]);
                failure = ((mlg) ((wvj0) bVar.c.get(vvj0Var.a))).a(new yvj0(storedLayoutInfo.getInfo(), storedLayoutInfo.getStale(), storedLayoutInfo.getReceivedAt(), bVar.k(map)));
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            e5z0 e5z0Var3 = i5z0.a;
            e5z0Var3.m("ResponseCache");
            e5z0Var3.c(a, "Cache mapping failed", new Object[0]);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            e5z0 e5z0Var4 = i5z0.a;
            e5z0Var4.m("ResponseCache");
            e5z0Var4.c(a2, "Cache request is error", new Object[0]);
            return new s8j0(a2);
        }
        nv00 nv00Var = (nv00) failure;
        e5z0 e5z0Var5 = i5z0.a;
        e5z0Var5.m("ResponseCache");
        e5z0Var5.a("Cache request status " + nv00Var, new Object[0]);
        Object obj2 = nv00Var != null ? nv00Var.a : null;
        if (obj2 == null) {
            return new t8j0();
        }
        return new r8j0(new nv00(obj2, nv00Var.b), (storedLayoutInfo == null || !storedLayoutInfo.getStale()) ? RequestStatus$Data$Source.NETWORK : RequestStatus$Data$Source.CACHE, 6);
    }
}
