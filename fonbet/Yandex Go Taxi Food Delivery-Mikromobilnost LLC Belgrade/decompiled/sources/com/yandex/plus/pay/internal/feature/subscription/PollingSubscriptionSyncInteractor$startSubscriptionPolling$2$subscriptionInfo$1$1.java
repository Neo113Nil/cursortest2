package com.yandex.plus.pay.internal.feature.subscription;

import com.yandex.plus.pay.api.model.SyncType;
import defpackage.m1v0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q0x0;
import defpackage.scc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/plus/pay/internal/model/PlusPaySubscriptionInfo;", "<anonymous>", "(Ltse;)Lcom/yandex/plus/pay/internal/model/PlusPaySubscriptionInfo;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.subscription.PollingSubscriptionSyncInteractor$startSubscriptionPolling$2$subscriptionInfo$1$1", f = "PollingSubscriptionSyncInteractor.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PollingSubscriptionSyncInteractor$startSubscriptionPolling$2$subscriptionInfo$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $invoiceId;
    final /* synthetic */ Set<SyncType> $syncTypes;
    final /* synthetic */ b $this_runSuspendCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingSubscriptionSyncInteractor$startSubscriptionPolling$2$subscriptionInfo$1$1(b bVar, String str, Set set, Continuation continuation) {
        super(2, continuation);
        this.$this_runSuspendCatching = bVar;
        this.$invoiceId = str;
        this.$syncTypes = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PollingSubscriptionSyncInteractor$startSubscriptionPolling$2$subscriptionInfo$1$1(this.$this_runSuspendCatching, this.$invoiceId, this.$syncTypes, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollingSubscriptionSyncInteractor$startSubscriptionPolling$2$subscriptionInfo$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        m1v0 m1v0Var = this.$this_runSuspendCatching.a;
        String str = this.$invoiceId;
        Set<SyncType> set = this.$syncTypes;
        this.label = 1;
        a aVar = (a) m1v0Var;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (q0x0.a[((SyncType) it.next()).ordinal()] != 1) {
                w511.b();
                return null;
            }
            ycc.r(scc.g("FEATURES", "OTT_SUBSCRIPTION", "FAMILY_ROLE"), arrayList);
        }
        Object a = aVar.a(str, kotlin.collections.a.X(kotlin.collections.a.I(arrayList), ",", null, null, null, 62), this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
