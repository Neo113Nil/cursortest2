package xsna;

import com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointsSheetState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.kyl;

/* compiled from: DeliveryPointsMapScreen.kt */
@b6l(c = "com.vk.ecomm.cart.impl.points_map.ui.compose.DeliveryPointsMapScreenKt$DeliveryPointsMapScreenContent$2$1", f = "DeliveryPointsMapScreen.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class dyl extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ f12<DeliveryPointsSheetState> $sheetState;
    final /* synthetic */ mtk0<kyl.e> $sheetViewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dyl(f12<DeliveryPointsSheetState> f12Var, mtk0<? extends kyl.e> mtk0Var, spj<? super dyl> spjVar) {
        super(2, spjVar);
        this.$sheetState = f12Var;
        this.$sheetViewState$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new dyl(this.$sheetState, this.$sheetViewState$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((dyl) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            f12<DeliveryPointsSheetState> f12Var = this.$sheetState;
            DeliveryPointsSheetState deliveryPointsSheetState = this.$sheetViewState$delegate.getValue().a;
            this.label = 1;
            if (lz1.f(f12Var, deliveryPointsSheetState, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
