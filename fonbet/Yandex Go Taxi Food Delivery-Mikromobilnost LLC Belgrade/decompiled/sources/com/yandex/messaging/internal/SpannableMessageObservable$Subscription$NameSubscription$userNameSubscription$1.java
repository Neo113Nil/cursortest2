package com.yandex.messaging.internal;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.h791;
import defpackage.mvg;
import defpackage.nlb1;
import defpackage.ny61;
import defpackage.qp21;
import defpackage.rmt0;
import defpackage.smt0;
import defpackage.tmt0;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqp21;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Lqp21;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.SpannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1", f = "SpannableMessageObservable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SpannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c0 this$0;
    final /* synthetic */ tmt0 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1(c0 c0Var, tmt0 tmt0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c0Var;
        this.this$1 = tmt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SpannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1 spannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1 = new SpannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1(this.this$0, this.this$1, continuation);
        spannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1.L$0 = obj;
        return spannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SpannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1 spannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1 = (SpannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1) create((qp21) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        spannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1.invokeSuspend(zy11Var);
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
        qp21 qp21Var = (qp21) this.L$0;
        c0 c0Var = this.this$0;
        String g = h791.g(qp21Var, this.this$1.a.getResources(), null);
        smt0 smt0Var = c0Var.c;
        Editable editable = smt0Var.b;
        Object obj2 = c0Var.a;
        if (obj2 != null) {
            int spanStart = editable.getSpanStart(obj2);
            int spanEnd = editable.getSpanEnd(obj2);
            int spanFlags = editable.getSpanFlags(obj2);
            editable.removeSpan(obj2);
            SpannableStringBuilder a = nlb1.a(g, editable, spanStart);
            editable.replace(spanStart, spanEnd, a);
            editable.setSpan(obj2, spanStart, a.length() + spanStart, spanFlags);
            LinkedHashSet linkedHashSet = smt0Var.y;
            linkedHashSet.remove(obj2);
            rmt0 rmt0Var = smt0Var.a;
            if (rmt0Var != null && linkedHashSet.isEmpty()) {
                rmt0Var.o(editable);
            }
        }
        return zy11.a;
    }
}
