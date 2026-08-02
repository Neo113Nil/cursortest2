package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation;

import com.ybsdk.core.analytics.generated.delegates.TransfersDashboardEvents$TransfersDashboardBottomSheetShownResult;
import defpackage.bei;
import defpackage.cv01;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.rr51;
import defpackage.ru01;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.te6;
import defpackage.tse;
import defpackage.vv01;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardViewModel$onRequestDashboardData$1", f = "TransfersDashboardViewModel.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransfersDashboardViewModel$onRequestDashboardData$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransfersDashboardViewModel$onRequestDashboardData$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransfersDashboardViewModel$onRequestDashboardData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransfersDashboardViewModel$onRequestDashboardData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object a;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        r0 r0Var5;
        Object value5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            boolean p = this.this$0.G.p();
            a aVar = this.this$0;
            if (!p) {
                pz40 Y = aVar.Y();
                do {
                    r0Var3 = (r0) Y;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, vv01.a((vv01) value3, bei.y, 5, false, false, false, 57)));
                return zy11.a;
            }
            pz40 Y2 = aVar.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, vv01.a((vv01) value, new te6(new t8j0()), null, false, false, false, 61)));
            if (((vv01) this.this$0.X()).c == null) {
                a aVar2 = this.this$0;
                pz40 Y3 = aVar2.Y();
                do {
                    r0Var2 = (r0) Y3;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, vv01.a((vv01) value2, null, Integer.valueOf(((ru01) aVar2.G.b).a.a() ? 6 : 4), false, false, false, 59)));
            }
            a aVar3 = this.this$0;
            cv01 cv01Var = aVar3.E;
            Integer num = ((vv01) aVar3.X()).c;
            cv01Var.a.r0.a.a("transfers_dashboard.bottom_sheet.initiated", g8e.w(1, ClidProvider.STATE, cv01.a(num)));
            a aVar4 = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.screens.dashboard.domain.a aVar5 = aVar4.D;
            String agreementId = aVar4.H.getAgreementId();
            this.label = 1;
            a = aVar5.a(agreementId, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar6 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            rr51 rr51Var = (rr51) a;
            aVar6.E.a.r0.P(cv01.a(((vv01) aVar6.X()).c), TransfersDashboardEvents$TransfersDashboardBottomSheetShownResult.OK, null);
            pz40 Y4 = aVar6.Y();
            do {
                r0Var5 = (r0) Y4;
                value5 = r0Var5.getValue();
            } while (!r0Var5.k(value5, vv01.a((vv01) value5, new te6(new r8j0(rr51Var, null, 14)), null, false, false, false, 61)));
        }
        a aVar7 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            aVar7.E.a.r0.P(cv01.a(((vv01) aVar7.X()).c), TransfersDashboardEvents$TransfersDashboardBottomSheetShownResult.ERROR, a2.getMessage());
            pz40 Y5 = aVar7.Y();
            do {
                r0Var4 = (r0) Y5;
                value4 = r0Var4.getValue();
            } while (!r0Var4.k(value4, vv01.a((vv01) value4, new te6(new s8j0(a2)), null, false, false, false, 61)));
        }
        return zy11.a;
    }
}
