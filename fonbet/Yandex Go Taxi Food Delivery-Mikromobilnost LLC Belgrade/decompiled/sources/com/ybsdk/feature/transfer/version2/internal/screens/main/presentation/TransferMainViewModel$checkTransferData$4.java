package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.dl01;
import defpackage.dqg;
import defpackage.gao;
import defpackage.hl01;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.nfb;
import defpackage.ny61;
import defpackage.ol01;
import defpackage.pz40;
import defpackage.u031;
import defpackage.w511;
import defpackage.wk01;
import defpackage.wls;
import defpackage.xk01;
import defpackage.ysb1;
import defpackage.zjy0;
import defpackage.zk01;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Result;", "Ldqg;", "Lnfb;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/CheckTransferEntity;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Lkotlin/Result;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainViewModel$checkTransferData$4", f = "TransferMainViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferMainViewModel$checkTransferData$4 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $navigateToResultScreen;
    final /* synthetic */ u031 $previousValidationState;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMainViewModel$checkTransferData$4(a aVar, boolean z, u031 u031Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$navigateToResultScreen = z;
        this.$previousValidationState = u031Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferMainViewModel$checkTransferData$4 transferMainViewModel$checkTransferData$4 = new TransferMainViewModel$checkTransferData$4(this.this$0, this.$navigateToResultScreen, this.$previousValidationState, continuation);
        transferMainViewModel$checkTransferData$4.L$0 = obj;
        return transferMainViewModel$checkTransferData$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransferMainViewModel$checkTransferData$4 transferMainViewModel$checkTransferData$4 = (TransferMainViewModel$checkTransferData$4) create(new Result(((Result) obj).getValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        transferMainViewModel$checkTransferData$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Object value4 = ((Result) this.L$0).getValue();
        a aVar = this.this$0;
        boolean z = this.$navigateToResultScreen;
        u031 u031Var = this.$previousValidationState;
        int i = a.a0;
        aVar.getClass();
        if (!(value4 instanceof Result.Failure)) {
            dqg dqgVar = (dqg) value4;
            if (dqgVar instanceof cqg) {
                cqg cqgVar = (cqg) dqgVar;
                List list = ((nfb) cqgVar.a).n;
                wk01 b = zk01.b((xk01) aVar.X());
                if (b != null && !list.isEmpty()) {
                    aVar.a0(new dl01(3, b, list));
                }
                pz40 Y = aVar.Y();
                do {
                    r0Var3 = (r0) Y;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, zk01.c((xk01) value3, new zjy0(8, cqgVar, aVar, u031Var))));
                if (z) {
                    aVar.d1();
                }
            } else {
                if (!(dqgVar instanceof bqg)) {
                    w511.b();
                    return null;
                }
                UnconditionalLimitWidgetEntity d = ysb1.d(u031Var);
                aVar.l0(d != null ? d.getDescription() : null);
                pz40 Y2 = aVar.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, zk01.c((xk01) value2, new hl01(u031Var, 2))));
                bqg bqgVar = (bqg) dqgVar;
                aVar.Z(new ol01(new n0t0(new Text.Constant(bqgVar.a), d.f(bqgVar.b))));
            }
        }
        Throwable a = Result.a(value4);
        if (a != null) {
            pz40 Y3 = aVar.Y();
            do {
                r0Var = (r0) Y3;
                value = r0Var.getValue();
            } while (!r0Var.k(value, zk01.c((xk01) value, new hl01(u031Var, 1))));
            UnconditionalLimitWidgetEntity d2 = ysb1.d(u031Var);
            aVar.l0(d2 != null ? d2.getDescription() : null);
            if (z) {
                aVar.Z(new ol01(gao.e(null, null, a, 3)));
            }
        }
        return zy11.a;
    }
}
