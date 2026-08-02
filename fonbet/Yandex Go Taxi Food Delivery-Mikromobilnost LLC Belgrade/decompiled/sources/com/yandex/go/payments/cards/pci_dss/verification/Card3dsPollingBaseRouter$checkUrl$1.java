package com.yandex.go.payments.cards.pci_dss.verification;

import defpackage.ff41;
import defpackage.l88;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.pci_dss.verification.Card3dsPollingBaseRouter$checkUrl$1", f = "Card3dsPollingBaseRouter.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class Card3dsPollingBaseRouter$checkUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $baseUrl;
    final /* synthetic */ ff41 $webApi;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Card3dsPollingBaseRouter$checkUrl$1(d dVar, String str, ff41 ff41Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$baseUrl = str;
        this.$webApi = ff41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Card3dsPollingBaseRouter$checkUrl$1(this.this$0, this.$baseUrl, this.$webApi, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Card3dsPollingBaseRouter$checkUrl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(new b(new mth(e.d(this.this$0.F.e), 6), this.$baseUrl));
            l88 l88Var = new l88(this.$webApi);
            this.label = 1;
            if (t.collect(l88Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
