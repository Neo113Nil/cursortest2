package com.yandex.go.chargers.feedback.ui;

import defpackage.az9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q0a;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zy9;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Laz9;", "completedOrder", "", "", "selectedChipIds", "Lq0a;", "<anonymous>", "(Laz9;Ljava/util/Set;)Lq0a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.ui.ChargersFeedbackUiStateInteractor$getUiStateFlow$2", f = "ChargersFeedbackUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFeedbackUiStateInteractor$getUiStateFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFeedbackUiStateInteractor$getUiStateFlow$2(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersFeedbackUiStateInteractor$getUiStateFlow$2 chargersFeedbackUiStateInteractor$getUiStateFlow$2 = new ChargersFeedbackUiStateInteractor$getUiStateFlow$2(this.this$0, (Continuation) obj3);
        chargersFeedbackUiStateInteractor$getUiStateFlow$2.L$0 = (az9) obj;
        chargersFeedbackUiStateInteractor$getUiStateFlow$2.L$1 = (Set) obj2;
        return chargersFeedbackUiStateInteractor$getUiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        az9 az9Var = (az9) this.L$0;
        Set set = (Set) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Integer num = (Integer) this.this$0.c.b.a.getValue();
        boolean z = false;
        int intValue = num != null ? num.intValue() : 0;
        boolean z2 = az9Var.c;
        if (!z2) {
            zy9 zy9Var = az9Var.g;
            List list = zy9Var != null ? zy9Var.b : null;
            if (list != null && !list.isEmpty()) {
                z = true;
            }
        }
        return new q0a(az9Var, intValue, set, z2, z);
    }
}
