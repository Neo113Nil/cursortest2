package xsna;

import com.vk.ecomm.cart.impl.common.ui.compose.BottomSheetState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CourierMapScreen.kt */
@b6l(c = "com.vk.ecomm.cart.impl.courier_map.ui.compose.CourierMapScreenKt$rememberBottomSheetState$1$1$1", f = "CourierMapScreen.kt", l = {188, 190}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class rzj extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ it0 $addressViewState;
    final /* synthetic */ f12<BottomSheetState> $this_apply;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzj(it0 it0Var, f12<BottomSheetState> f12Var, spj<? super rzj> spjVar) {
        super(2, spjVar);
        this.$addressViewState = it0Var;
        this.$this_apply = f12Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rzj(this.$addressViewState, this.$this_apply, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rzj) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (xsna.lz1.f(r5, r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (xsna.lz1.f(r5, r1, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$addressViewState.a()) {
                f12<BottomSheetState> f12Var = this.$this_apply;
                BottomSheetState bottomSheetState = BottomSheetState.Expanded;
                this.label = 1;
            } else {
                f12<BottomSheetState> f12Var2 = this.$this_apply;
                BottomSheetState bottomSheetState2 = BottomSheetState.Collapsed;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
