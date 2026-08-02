package com.ybsdk.screens.initial.deeplink;

import com.ybsdk.core.analytics.generated.delegates.DeeplinkEvents$DeeplinkNetworkRequestMarkEventReadResult;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.initial.deeplink.DeeplinkRemoteRequestsManager$markEvent$1", f = "DeeplinkRemoteRequestsManager.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DeeplinkRemoteRequestsManager$markEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $actionId;
    final /* synthetic */ String $eventId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.screens.initial.deeplink.DeeplinkRemoteRequestsManager$markEvent$1$1", f = "DeeplinkRemoteRequestsManager.kt", l = {35}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.screens.initial.deeplink.DeeplinkRemoteRequestsManager$markEvent$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $eventId;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$eventId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$eventId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                com.ybsdk.feature.banners.api.interactors.a aVar = this.this$0.b;
                String str2 = this.$eventId;
                this.label = 1;
                a = aVar.a(str2, str, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
            }
            return new Result(a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkRemoteRequestsManager$markEvent$1(b bVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$actionId = str;
        this.$eventId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeeplinkRemoteRequestsManager$markEvent$1 deeplinkRemoteRequestsManager$markEvent$1 = new DeeplinkRemoteRequestsManager$markEvent$1(this.this$0, this.$actionId, this.$eventId, continuation);
        deeplinkRemoteRequestsManager$markEvent$1.L$0 = obj;
        return deeplinkRemoteRequestsManager$markEvent$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeeplinkRemoteRequestsManager$markEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object O;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            l8x l8xVar = (l8x) this.this$0.d.get(this.$actionId);
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            this.this$0.d.put(this.$actionId, kotlinx.coroutines.a.n(tseVar.getCoroutineContext()));
            b bVar = this.this$0;
            com.ybsdk.core.utils.c cVar = bVar.e;
            String str = this.$actionId;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, this.$eventId, null);
            this.label = 1;
            O = cVar.O(anonymousClass1, str, this);
            if (O == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            O = ((Result) obj).getValue();
        }
        b bVar2 = this.this$0;
        String str2 = this.$actionId;
        String str3 = this.$eventId;
        if (!(O instanceof Result.Failure)) {
            bVar2.d.remove(str2);
            bVar2.c.t.o(DeeplinkEvents$DeeplinkNetworkRequestMarkEventReadResult.OK, str2, str3);
        }
        b bVar3 = this.this$0;
        String str4 = this.$actionId;
        String str5 = this.$eventId;
        if (Result.a(O) != null) {
            bVar3.d.remove(str4);
            bVar3.c.t.o(DeeplinkEvents$DeeplinkNetworkRequestMarkEventReadResult.ERROR, str4, str5);
        }
        return zy11.a;
    }
}
