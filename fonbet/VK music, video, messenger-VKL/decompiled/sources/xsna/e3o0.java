package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TapGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class e3o0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<ov70, s3q0> $onDoubleTap;
    final /* synthetic */ izs<ov70, s3q0> $onLongPress;
    final /* synthetic */ yzs<j2d0, ov70, spj<? super s3q0>, Object> $onPress;
    final /* synthetic */ izs<ov70, s3q0> $onTap;
    final /* synthetic */ dmb0 $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: TapGestureDetector.kt */
    @b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105}, m = "invokeSuspend", v = 1)
    public static final class a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
        final /* synthetic */ yvj $$this$coroutineScope;
        final /* synthetic */ izs<ov70, s3q0> $onDoubleTap;
        final /* synthetic */ izs<ov70, s3q0> $onLongPress;
        final /* synthetic */ yzs<j2d0, ov70, spj<? super s3q0>, Object> $onPress;
        final /* synthetic */ izs<ov70, s3q0> $onTap;
        final /* synthetic */ n2d0 $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(yvj yvjVar, n2d0 n2d0Var, izs<? super ov70, s3q0> izsVar, izs<? super ov70, s3q0> izsVar2, yzs<? super j2d0, ? super ov70, ? super spj<? super s3q0>, ? extends Object> yzsVar, izs<? super ov70, s3q0> izsVar3, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$$this$coroutineScope = yvjVar;
            this.$pressScope = n2d0Var;
            this.$onDoubleTap = izsVar;
            this.$onLongPress = izsVar2;
            this.$onPress = yzsVar;
            this.$onTap = izsVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$$this$coroutineScope, this.$pressScope, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
            return ((a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                eu5 eu5Var = (eu5) this.L$0;
                yvj yvjVar = this.$$this$coroutineScope;
                n2d0 n2d0Var = this.$pressScope;
                izs<ov70, s3q0> izsVar = this.$onDoubleTap;
                izs<ov70, s3q0> izsVar2 = this.$onLongPress;
                yzs<j2d0, ov70, spj<? super s3q0>, Object> yzsVar = this.$onPress;
                izs<ov70, s3q0> izsVar3 = this.$onTap;
                this.label = 1;
                if (z2o0.h(eu5Var, yvjVar, n2d0Var, izsVar, izsVar2, yzsVar, izsVar3, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e3o0(dmb0 dmb0Var, izs<? super ov70, s3q0> izsVar, izs<? super ov70, s3q0> izsVar2, yzs<? super j2d0, ? super ov70, ? super spj<? super s3q0>, ? extends Object> yzsVar, izs<? super ov70, s3q0> izsVar3, spj<? super e3o0> spjVar) {
        super(2, spjVar);
        this.$this_detectTapGestures = dmb0Var;
        this.$onDoubleTap = izsVar;
        this.$onLongPress = izsVar2;
        this.$onPress = yzsVar;
        this.$onTap = izsVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        e3o0 e3o0Var = new e3o0(this.$this_detectTapGestures, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, spjVar);
        e3o0Var.L$0 = obj;
        return e3o0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e3o0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            n2d0 n2d0Var = new n2d0(this.$this_detectTapGestures);
            dmb0 dmb0Var = this.$this_detectTapGestures;
            a aVar = new a(yvjVar, n2d0Var, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, null);
            this.label = 1;
            if (d7s.c(dmb0Var, aVar, this) == coroutineSingletons) {
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
