package com.ybsdk.di.modules;

import com.squareup.moshi.Moshi;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDto;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.dsg;
import defpackage.jqp0;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.trp0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.di.modules.DeeplinkModule$provideCacheUpdate$1$1", f = "DeeplinkModule.kt", l = {1920}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DeeplinkModule$provideCacheUpdate$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ DeeplinkAction.CacheUpdate $deeplink;
    final /* synthetic */ Moshi $moshi;
    final /* synthetic */ com.ybsdk.core.common.data.cache.b $responseCache;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkModule$provideCacheUpdate$1$1(Moshi moshi, DeeplinkAction.CacheUpdate cacheUpdate, com.ybsdk.core.common.data.cache.b bVar, Continuation continuation) {
        super(2, continuation);
        this.$moshi = moshi;
        this.$deeplink = cacheUpdate;
        this.$responseCache = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeeplinkModule$provideCacheUpdate$1$1 deeplinkModule$provideCacheUpdate$1$1 = new DeeplinkModule$provideCacheUpdate$1$1(this.$moshi, this.$deeplink, this.$responseCache, continuation);
        deeplinkModule$provideCacheUpdate$1$1.L$0 = obj;
        return deeplinkModule$provideCacheUpdate$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeeplinkModule$provideCacheUpdate$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                Moshi moshi = this.$moshi;
                DeeplinkAction.CacheUpdate cacheUpdate = this.$deeplink;
                com.ybsdk.core.common.data.cache.b bVar = this.$responseCache;
                DataEntryDto dataEntryDto = (DataEntryDto) moshi.adapter(DataEntryDto.class).fromJson(cacheUpdate.getDataEntry());
                String key = cacheUpdate.getKey();
                this.label = 1;
                n = bVar.n(key, dataEntryDto, this);
                if (n == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                n = ((Result) obj).getValue();
            }
            failure = new Result(n);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        DeeplinkAction.CacheUpdate cacheUpdate2 = this.$deeplink;
        Throwable a = Result.a(failure);
        if (a != null) {
            List singletonList = Collections.singletonList(lrp0.z);
            String key2 = cacheUpdate2.getKey();
            boolean isEmpty = singletonList.isEmpty();
            if (!isEmpty) {
                if (isEmpty) {
                    w511.b();
                    return null;
                }
                str = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
            }
            trp0 trp0Var = trp0.a;
            trp0.e(new jqp0(a, "Failed to handle common data entry update deeplink", key2, str));
        }
        return zy11.a;
    }
}
