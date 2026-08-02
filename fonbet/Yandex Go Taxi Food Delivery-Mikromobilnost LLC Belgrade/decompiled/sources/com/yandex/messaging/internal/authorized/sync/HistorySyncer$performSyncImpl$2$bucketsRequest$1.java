package com.yandex.messaging.internal.authorized.sync;

import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getBuckets$$inlined$makeCall$1;
import defpackage.fse;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.k020;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.to3;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Loyj0;", "Lcom/yandex/messaging/core/net/entities/BucketsData;", "Lqn2;", "<anonymous>", "(Ltse;)Loyj0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.HistorySyncer$performSyncImpl$2$bucketsRequest$1", f = "HistorySyncer.kt", l = {165}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class HistorySyncer$performSyncImpl$2$bucketsRequest$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistorySyncer$performSyncImpl$2$bucketsRequest$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HistorySyncer$performSyncImpl$2$bucketsRequest$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HistorySyncer$performSyncImpl$2$bucketsRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
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
        e eVar = this.this$0;
        to3 to3Var = eVar.s;
        k020 k020Var = eVar.c;
        String[] strArr = {"privacy", "sticker_packs", "folders", "chat_mutings", "restrictions", "hidden_private_chats", "pinned_chats", "miniapps", "custom_user_statuses", "preferences"};
        int d = gw00.d(10);
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (int i2 = 0; i2 < 10; i2++) {
            String str = strArr[i2];
            if (jl40.l(str, "hidden_private_chats")) {
                j = k020Var.j("remote_hidden_private_chats");
            } else if (jl40.l(str, "chat_mutings")) {
                Long c = k020Var.b.m().c();
                j = c != null ? c.longValue() : 0L;
            } else {
                j = k020Var.j(str);
            }
            linkedHashMap.put(str, new Long(j));
        }
        fse fseVar = this.this$0.G.a;
        this.label = 1;
        if (fseVar == null) {
            fseVar = get_context();
        }
        Object k0 = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$getBuckets$$inlined$makeCall$1(null, to3Var, linkedHashMap), this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
