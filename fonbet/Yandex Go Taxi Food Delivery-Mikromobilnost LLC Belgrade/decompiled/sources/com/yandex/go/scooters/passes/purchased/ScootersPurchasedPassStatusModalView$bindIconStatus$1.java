package com.yandex.go.scooters.passes.purchased;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.view.GoImageView;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.koo0;
import defpackage.mvg;
import defpackage.noo0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchased.ScootersPurchasedPassStatusModalView$bindIconStatus$1", f = "ScootersPurchasedPassStatusModalView.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersPurchasedPassStatusModalView$bindIconStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ koo0 $iconStatus;
    Object L$0;
    int label;
    final /* synthetic */ ScootersPurchasedPassStatusModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPurchasedPassStatusModalView$bindIconStatus$1(ScootersPurchasedPassStatusModalView scootersPurchasedPassStatusModalView, koo0 koo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersPurchasedPassStatusModalView;
        this.$iconStatus = koo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPurchasedPassStatusModalView$bindIconStatus$1(this.this$0, this.$iconStatus, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPurchasedPassStatusModalView$bindIconStatus$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noo0 binding;
        e eVar;
        GoImageView goImageView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            binding = this.this$0.getBinding();
            GoImageView goImageView2 = binding.e;
            eVar = this.this$0.mediaInfoConverter;
            String str = this.$iconStatus.a;
            this.L$0 = goImageView2;
            this.label = 1;
            Object f = e.f(eVar, str, null, this, 6);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = f;
            goImageView = goImageView2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            goImageView = (GoImageView) this.L$0;
            b.b(obj);
        }
        goImageView.setImageDrawable((Drawable) obj);
        return zy11.a;
    }
}
