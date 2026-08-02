package com.yandex.go.chargers.debt.notification.domain;

import com.yandex.go.chargers.data.model.ChargersDebt;
import defpackage.bdc;
import defpackage.d9s;
import defpackage.gdc;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t3u0;
import defpackage.u3u0;
import defpackage.up9;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersDebt;", "debt", "Lup9;", "progress", "Lu3u0;", "<anonymous>", "(Lcom/yandex/go/chargers/data/model/ChargersDebt;Lup9;)Lu3u0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.debt.notification.domain.ChargersDebtStateBarUiStateInteractor$listenToUiState$1", f = "ChargersDebtStateBarUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDebtStateBarUiStateInteractor$listenToUiState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDebtStateBarUiStateInteractor$listenToUiState$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersDebtStateBarUiStateInteractor$listenToUiState$1 chargersDebtStateBarUiStateInteractor$listenToUiState$1 = new ChargersDebtStateBarUiStateInteractor$listenToUiState$1(this.this$0, (Continuation) obj3);
        chargersDebtStateBarUiStateInteractor$listenToUiState$1.L$0 = (ChargersDebt) obj;
        chargersDebtStateBarUiStateInteractor$listenToUiState$1.L$1 = (up9) obj2;
        return chargersDebtStateBarUiStateInteractor$listenToUiState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String obj2;
        ChargersDebt chargersDebt = (ChargersDebt) this.L$0;
        up9 up9Var = (up9) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.CHARGERS_DEBT);
        a aVar = this.this$0;
        t3u0Var.h = new gdc(mqg0.component_red_normal);
        if (chargersDebt == null) {
            t3u0Var.b = false;
        } else {
            t3u0Var.b = true;
            t3u0Var.j = true;
            e eVar = aVar.c;
            FormattedText formattedText = chargersDebt.a;
            if (formattedText == null) {
                obj2 = eVar.a.getString(kyh0.debt_error_while_processing);
            } else {
                xdf xdfVar = aVar.b;
                ief iefVar = chargersDebt.i;
                if (iefVar == null) {
                    iefVar = ief.e;
                }
                obj2 = eVar.r(d9s.c(formattedText, xdfVar, gwk0.h(iefVar), true)).toString();
            }
            t3u0Var.e = obj2;
            t3u0Var.k = new gdc(mqg0.component_white);
            t3u0Var.c = up9Var.a();
            t3u0Var.m = new bdc(xng0.textMinor);
            t3u0Var.i = aVar.g;
        }
        return new u3u0(t3u0Var);
    }
}
