package com.yandex.payment.divkit.select;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.smk;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModelRefactor$showDivPaymentMethod$1", f = "DKSelectViewModelRefactor.kt", l = {510}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModelRefactor$showDivPaymentMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ JSONObject $cardsJson;
    final /* synthetic */ JSONObject $templatesJson;
    final /* synthetic */ List<Pair<String, String>> $variables;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModelRefactor$showDivPaymentMethod$1(n nVar, JSONObject jSONObject, JSONObject jSONObject2, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$templatesJson = jSONObject;
        this.$cardsJson = jSONObject2;
        this.$variables = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKSelectViewModelRefactor$showDivPaymentMethod$1(this.this$0, this.$templatesJson, this.$cardsJson, this.$variables, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSelectViewModelRefactor$showDivPaymentMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 n0Var = this.this$0.O;
            smk smkVar = new smk(this.$templatesJson, this.$cardsJson, this.$variables);
            this.label = 1;
            if (n0Var.emit(smkVar, this) == coroutineSingletons) {
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
