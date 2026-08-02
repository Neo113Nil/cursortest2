package com.yandex.go.payments.domain;

import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.zone.model.Zone;
import defpackage.kw90;
import defpackage.lw90;
import defpackage.mvg;
import defpackage.n65;
import defpackage.ny61;
import defpackage.xw91;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, d2 = {"<anonymous>", "", "zone", "Lcom/yandex/go/zone/model/Zone;", "unverifiedCards", "", "Lcom/yandex/go/payments/data/model/response/Card;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.domain.MainMenuPaymentUiStateInteractorImpl$hasAvailableUnverifiedCardsFlow$3", f = "MainMenuPaymentUiStateInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MainMenuPaymentUiStateInteractorImpl$hasAvailableUnverifiedCardsFlow$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuPaymentUiStateInteractorImpl$hasAvailableUnverifiedCardsFlow$3(u uVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = uVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainMenuPaymentUiStateInteractorImpl$hasAvailableUnverifiedCardsFlow$3 mainMenuPaymentUiStateInteractorImpl$hasAvailableUnverifiedCardsFlow$3 = new MainMenuPaymentUiStateInteractorImpl$hasAvailableUnverifiedCardsFlow$3(this.this$0, (Continuation) obj3);
        mainMenuPaymentUiStateInteractorImpl$hasAvailableUnverifiedCardsFlow$3.L$0 = (Zone) obj;
        mainMenuPaymentUiStateInteractorImpl$hasAvailableUnverifiedCardsFlow$3.L$1 = (List) obj2;
        return mainMenuPaymentUiStateInteractorImpl$hasAvailableUnverifiedCardsFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Zone zone = (Zone) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = false;
        kw90 c = lw90.c(this.this$0.c, zone, new n65[0], 2);
        List list2 = list;
        u uVar = this.this$0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (c.b(uVar.g.a((Card) it.next(), false)).equals(xw91.C)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
