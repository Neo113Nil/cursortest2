package xsna;

import com.vk.core.compose.reorder.ReorderableState$visibleItemsChanged$$inlined$flatMapLatest$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* compiled from: ReorderableLazyListState.kt */
@b6l(c = "com.vk.core.compose.reorder.ReorderableLazyListStateKt$rememberReorderableLazyListState$1$1", f = "ReorderableLazyListState.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class a0g0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ zzf0 $state;
    int label;

    /* compiled from: ReorderableLazyListState.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ zzf0 b;

        public a(zzf0 zzf0Var) {
            this.b = zzf0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            this.b.w(0, 0);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0g0(zzf0 zzf0Var, spj<? super a0g0> spjVar) {
        super(2, spjVar);
        this.$state = zzf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new a0g0(this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((a0g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zzf0 zzf0Var = this.$state;
            zzf0Var.getClass();
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(rsr.y(nr2.M(new tu80(zzf0Var, 17)), new ReorderableState$visibleItemsChanged$$inlined$flatMapLatest$1(null, zzf0Var)));
            vp4 vp4Var = new vp4(zzf0Var, 6);
            cb3 cb3Var = atr.b;
            ttp0.d(2, vp4Var);
            dhn a2 = atr.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, cb3Var, vp4Var);
            a aVar = new a(this.$state);
            this.label = 1;
            if (a2.collect(aVar, this) == coroutineSingletons) {
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
