package com.yandex.go.chargers.attention.presentation;

import defpackage.em9;
import defpackage.gn9;
import defpackage.hn9;
import defpackage.in9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rn9;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lin9;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lin9;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.attention.presentation.ChargersAttentionViewPresenter$listenToState$1", f = "ChargersAttentionViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersAttentionViewPresenter$listenToState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rn9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersAttentionViewPresenter$listenToState$1(rn9 rn9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rn9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersAttentionViewPresenter$listenToState$1 chargersAttentionViewPresenter$listenToState$1 = new ChargersAttentionViewPresenter$listenToState$1(this.this$0, continuation);
        chargersAttentionViewPresenter$listenToState$1.L$0 = obj;
        return chargersAttentionViewPresenter$listenToState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersAttentionViewPresenter$listenToState$1 chargersAttentionViewPresenter$listenToState$1 = (ChargersAttentionViewPresenter$listenToState$1) create((in9) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersAttentionViewPresenter$listenToState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in9 in9Var = (in9) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (in9Var instanceof gn9) {
            em9 em9Var = this.this$0.x;
            String str = ((gn9) in9Var).e;
            em9Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("promo_offer_id", str);
            em9Var.a.a("Chargers.MainScreen.OfferNotch.Shown", hashMap, 1, new HashMap());
        } else if (!(in9Var instanceof hn9)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
