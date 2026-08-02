package com.yandex.go.payments.sbp.domain;

import defpackage.hq4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lhq4;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.sbp.domain.SbpHomeSearchBankInteractor$getFilteredBanksFlow$2", f = "SbpHomeSearchBankInteractor.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SbpHomeSearchBankInteractor$getFilteredBanksFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<hq4> $originalBankList;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpHomeSearchBankInteractor$getFilteredBanksFlow$2(List list, Continuation continuation) {
        super(2, continuation);
        this.$originalBankList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SbpHomeSearchBankInteractor$getFilteredBanksFlow$2 sbpHomeSearchBankInteractor$getFilteredBanksFlow$2 = new SbpHomeSearchBankInteractor$getFilteredBanksFlow$2(this.$originalBankList, continuation);
        sbpHomeSearchBankInteractor$getFilteredBanksFlow$2.L$0 = obj;
        return sbpHomeSearchBankInteractor$getFilteredBanksFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpHomeSearchBankInteractor$getFilteredBanksFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<hq4> list = this.$originalBankList;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(list, this) == coroutineSingletons) {
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
