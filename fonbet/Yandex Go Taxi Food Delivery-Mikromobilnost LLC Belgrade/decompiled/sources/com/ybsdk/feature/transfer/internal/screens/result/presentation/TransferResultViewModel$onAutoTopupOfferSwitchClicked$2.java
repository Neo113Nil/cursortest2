package com.ybsdk.feature.transfer.internal.screens.result.presentation;

import com.ybsdk.core.utils.text.Text;
import defpackage.dzh0;
import defpackage.jl40;
import defpackage.ls01;
import defpackage.mvg;
import defpackage.mw3;
import defpackage.n0t0;
import defpackage.ns01;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.internal.screens.result.presentation.TransferResultViewModel$onAutoTopupOfferSwitchClicked$2", f = "TransferResultViewModel.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferResultViewModel$onAutoTopupOfferSwitchClicked$2 extends SuspendLambda implements wls {
    final /* synthetic */ mw3 $autoTopupOffer;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferResultViewModel$onAutoTopupOfferSwitchClicked$2(b bVar, mw3 mw3Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$autoTopupOffer = mw3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferResultViewModel$onAutoTopupOfferSwitchClicked$2(this.this$0, this.$autoTopupOffer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferResultViewModel$onAutoTopupOfferSwitchClicked$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        int i;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            com.ybsdk.feature.autotopup.internal.domain.a aVar = bVar.G;
            mw3 mw3Var = this.$autoTopupOffer;
            this.label = 1;
            a = aVar.a(mw3Var, bVar, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        if (a instanceof Result.Failure) {
            a = null;
        }
        mw3 mw3Var2 = (mw3) a;
        Boolean bool = mw3Var2 != null ? mw3Var2.d : null;
        if (jl40.l(bool, Boolean.TRUE)) {
            i = dzh0.ybsdk_deposit_auto_topup_is_enabled;
        } else if (jl40.l(bool, Boolean.FALSE)) {
            i = dzh0.ybsdk_deposit_auto_topup_is_disabled;
        } else {
            if (bool != null) {
                w511.b();
                return null;
            }
            i = dzh0.ybsdk_deposit_auto_topup_switch_failed;
        }
        this.this$0.Z(new ls01(new n0t0(new Text.Resource(i), Text.Empty.INSTANCE)));
        b bVar2 = this.this$0;
        mw3 mw3Var3 = this.$autoTopupOffer;
        pz40 Y = bVar2.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ns01.a((ns01) value, null, null, null, mw3Var2 == null ? mw3Var3 : mw3Var2, false, 16383)));
        return zy11.a;
    }
}
