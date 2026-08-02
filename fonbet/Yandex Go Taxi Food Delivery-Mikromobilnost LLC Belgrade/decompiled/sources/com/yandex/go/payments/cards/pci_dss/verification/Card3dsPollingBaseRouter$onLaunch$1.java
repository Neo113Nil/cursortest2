package com.yandex.go.payments.cards.pci_dss.verification;

import defpackage.avj0;
import defpackage.dg41;
import defpackage.k88;
import defpackage.kyh0;
import defpackage.m88;
import defpackage.mvg;
import defpackage.n88;
import defpackage.ny61;
import defpackage.scg;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.pci_dss.verification.Card3dsPollingBaseRouter$onLaunch$1", f = "Card3dsPollingBaseRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class Card3dsPollingBaseRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ n88 $payload;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Card3dsPollingBaseRouter$onLaunch$1(d dVar, n88 n88Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = n88Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Card3dsPollingBaseRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Card3dsPollingBaseRouter$onLaunch$1 card3dsPollingBaseRouter$onLaunch$1 = (Card3dsPollingBaseRouter$onLaunch$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        card3dsPollingBaseRouter$onLaunch$1.invokeSuspend(zy11Var);
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
        scg a = this.this$0.G.a();
        CoreWebViewConfig.Companion.getClass();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = this.$payload.a;
        this.this$0.A(a.b(), new dg41(new UiWebViewConfig(aVar.a(), null, false, false, false, false, ((avj0) this.this$0.D).h(kyh0.add_credit_card_random_amt_title), false, false, null, false, false, UiWebViewConfig.SignalForLoaded.OnCommitVisible.INSTANCE, null, null, 0, 0, true, false, null, false, false, 4026042, null), null, null, null, new m88(), null, null, 222), new k88(this.this$0, 2));
        d dVar = this.this$0;
        tje.N(dVar.o(), null, null, new Card3dsPollingBaseRouter$checkUrl$1(dVar, this.$payload.a, a, null), 3);
        tje.N(dVar.o(), null, null, new Card3dsPollingBaseRouter$checkUrl$2(dVar, null), 3);
        return zy11.a;
    }
}
