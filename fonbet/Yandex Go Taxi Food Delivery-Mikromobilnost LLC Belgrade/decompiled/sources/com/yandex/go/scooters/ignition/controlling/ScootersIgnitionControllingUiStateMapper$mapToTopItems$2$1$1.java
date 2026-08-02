package com.yandex.go.scooters.ignition.controlling;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.f9s;
import defpackage.kqn0;
import defpackage.mqn0;
import defpackage.mvg;
import defpackage.nqn0;
import defpackage.ny61;
import defpackage.pqn0;
import defpackage.tqn0;
import defpackage.tse;
import defpackage.uqn0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lqqn0;", "<anonymous>", "(Ltse;)Lqqn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.ScootersIgnitionControllingUiStateMapper$mapToTopItems$2$1$1", f = "ScootersIgnitionControllingUiStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingUiStateMapper$mapToTopItems$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionExperiment $experiment;
    final /* synthetic */ ScootersIgnitionExperiment.Ui.InfoItem $it;
    int label;
    final /* synthetic */ uqn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingUiStateMapper$mapToTopItems$2$1$1(uqn0 uqn0Var, ScootersIgnitionExperiment.Ui.InfoItem infoItem, ScootersIgnitionExperiment scootersIgnitionExperiment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uqn0Var;
        this.$it = infoItem;
        this.$experiment = scootersIgnitionExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionControllingUiStateMapper$mapToTopItems$2$1$1(this.this$0, this.$it, this.$experiment, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionControllingUiStateMapper$mapToTopItems$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        uqn0 uqn0Var = this.this$0;
        ScootersIgnitionExperiment.Ui.InfoItem infoItem = this.$it;
        ScootersIgnitionExperiment scootersIgnitionExperiment = this.$experiment;
        String str = scootersIgnitionExperiment.o;
        String str2 = scootersIgnitionExperiment.p;
        String str3 = scootersIgnitionExperiment.q;
        uqn0Var.getClass();
        ru.yandex.taxi.widget.c cVar = uqn0Var.b;
        ScootersIgnitionExperiment.Ui.InfoItem.ActionType actionType = infoItem.e;
        FormattedText formattedText = infoItem.d;
        FormattedText formattedText2 = infoItem.c;
        String str4 = infoItem.b;
        int i = tqn0.a[actionType.ordinal()];
        if (i == 1) {
            return new pqn0(str4, ru.yandex.taxi.widget.c.f(cVar, f9s.e(formattedText2, scootersIgnitionExperiment), false, null, 14).toString(), ru.yandex.taxi.widget.c.f(cVar, f9s.e(formattedText, scootersIgnitionExperiment), false, null, 14).toString());
        }
        if (i == 2) {
            String obj2 = ru.yandex.taxi.widget.c.f(cVar, f9s.e(formattedText2, scootersIgnitionExperiment), false, null, 14).toString();
            String obj3 = ru.yandex.taxi.widget.c.f(cVar, f9s.e(formattedText, scootersIgnitionExperiment), false, null, 14).toString();
            if (str != null) {
                return new nqn0(str4, obj2, obj3, str);
            }
        } else if (i == 3) {
            String obj4 = ru.yandex.taxi.widget.c.f(cVar, f9s.e(formattedText2, scootersIgnitionExperiment), false, null, 14).toString();
            String obj5 = ru.yandex.taxi.widget.c.f(cVar, f9s.e(formattedText, scootersIgnitionExperiment), false, null, 14).toString();
            if (str2 != null) {
                return new mqn0(str4, obj4, obj5, str2);
            }
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            String obj6 = ru.yandex.taxi.widget.c.f(cVar, f9s.e(formattedText2, scootersIgnitionExperiment), false, null, 14).toString();
            String obj7 = ru.yandex.taxi.widget.c.f(cVar, f9s.e(formattedText, scootersIgnitionExperiment), false, null, 14).toString();
            if (str3 != null) {
                return new kqn0(str4, obj6, obj7, str3);
            }
        }
        return null;
    }
}
