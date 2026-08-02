package com.yandex.go.address_confirmation.modal;

import com.yandex.go.clarify_address.AddressClarificationReason;
import defpackage.bms;
import defpackage.hbt0;
import defpackage.ibt0;
import defpackage.jbt0;
import defpackage.jl40;
import defpackage.kbt0;
import defpackage.lbt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rbt0;
import defpackage.sbt0;
import defpackage.tje;
import defpackage.vbt0;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lrbt0;", "pickupFromPhotoButtonState", "Llbt0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lrbt0;Llbt0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalViewPresenter$attachView$7", f = "SourceAddressConfirmationModalViewPresenter.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SourceAddressConfirmationModalViewPresenter$attachView$7 extends SuspendLambda implements bms {
    final /* synthetic */ vbt0 $mvpView;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAddressConfirmationModalViewPresenter$attachView$7(vbt0 vbt0Var, d dVar, Continuation continuation) {
        super(4, continuation);
        this.$mvpView = vbt0Var;
        this.this$0 = dVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SourceAddressConfirmationModalViewPresenter$attachView$7 sourceAddressConfirmationModalViewPresenter$attachView$7 = new SourceAddressConfirmationModalViewPresenter$attachView$7(this.$mvpView, this.this$0, (Continuation) obj4);
        sourceAddressConfirmationModalViewPresenter$attachView$7.L$0 = (rbt0) obj2;
        sourceAddressConfirmationModalViewPresenter$attachView$7.L$1 = (lbt0) obj3;
        return sourceAddressConfirmationModalViewPresenter$attachView$7.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vbt0 vbt0Var;
        rbt0 rbt0Var = (rbt0) this.L$0;
        lbt0 lbt0Var = (lbt0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!jl40.l(lbt0Var, kbt0.a)) {
                if (jl40.l(lbt0Var, jbt0.a)) {
                    this.$mvpView.render(sbt0.a);
                } else {
                    if (!(lbt0Var instanceof ibt0)) {
                        w511.b();
                        return null;
                    }
                    d dVar = this.this$0;
                    ((com.yandex.go.clarify_address.a) dVar.H).c(true, AddressClarificationReason.Map);
                    tje.N(dVar.Jg(), null, null, new SourceAddressConfirmationModalViewPresenter$onClarifyState$1(dVar, (ibt0) lbt0Var, rbt0Var, null), 3);
                }
                return zy11.a;
            }
            vbt0 vbt0Var2 = this.$mvpView;
            d dVar2 = this.this$0;
            a aVar = dVar2.y;
            hbt0 hbt0Var = dVar2.E.b;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vbt0Var2;
            this.label = 1;
            Object a = aVar.a(hbt0Var, rbt0Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            vbt0Var = vbt0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vbt0Var = (vbt0) this.L$2;
            kotlin.b.b(obj);
        }
        vbt0Var.render(obj);
        return zy11.a;
    }
}
