package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnimateAsState.kt */
@b6l(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {430}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class gg2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<iq2<Object>> $animSpec$delegate;
    final /* synthetic */ if2<Object, Object> $animatable;
    final /* synthetic */ qta<Object> $channel;
    final /* synthetic */ mtk0<izs<Object, s3q0>> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: AnimateAsState.kt */
    @b6l(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {439}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mtk0<iq2<Object>> $animSpec$delegate;
        final /* synthetic */ if2<Object, Object> $animatable;
        final /* synthetic */ mtk0<izs<Object, s3q0>> $listener$delegate;
        final /* synthetic */ Object $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, if2<Object, Object> if2Var, mtk0<? extends iq2<Object>> mtk0Var, mtk0<? extends izs<Object, s3q0>> mtk0Var2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$newTarget = obj;
            this.$animatable = if2Var;
            this.$animSpec$delegate = mtk0Var;
            this.$listener$delegate = mtk0Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (epx.f(this.$newTarget, ((zak0) this.$animatable.e).getValue())) {
                    return s3q0.a;
                }
                if2<Object, Object> if2Var = this.$animatable;
                Object obj2 = this.$newTarget;
                mtk0<iq2<Object>> mtk0Var = this.$animSpec$delegate;
                xmk0<Float> xmk0Var = hg2.a;
                iq2<Object> value = mtk0Var.getValue();
                this.label = 1;
                aVar = this;
                if (if2.c(if2Var, obj2, value, null, aVar, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                aVar = this;
            }
            mtk0<izs<Object, s3q0>> mtk0Var2 = aVar.$listener$delegate;
            xmk0<Float> xmk0Var2 = hg2.a;
            izs<Object, s3q0> value2 = mtk0Var2.getValue();
            if (value2 != null) {
                value2.invoke(aVar.$animatable.d());
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gg2(qta<Object> qtaVar, if2<Object, Object> if2Var, mtk0<? extends iq2<Object>> mtk0Var, mtk0<? extends izs<Object, s3q0>> mtk0Var2, spj<? super gg2> spjVar) {
        super(2, spjVar);
        this.$channel = qtaVar;
        this.$animatable = if2Var;
        this.$animSpec$delegate = mtk0Var;
        this.$listener$delegate = mtk0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        gg2 gg2Var = new gg2(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, spjVar);
        gg2Var.L$0 = obj;
        return gg2Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gg2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0035 -> B:5:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o0b<Object> it;
        yvj yvjVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar2 = (yvj) this.L$0;
            it = this.$channel.iterator();
            yvjVar = yvjVar2;
            this.L$0 = yvjVar;
            this.L$1 = it;
            this.label = 1;
            obj = it.a(this);
            if (obj == coroutineSingletons) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (o0b) this.L$1;
            yvjVar = (yvj) this.L$0;
            kotlin.a.a(obj);
            if (((Boolean) obj).booleanValue()) {
                Object next = it.next();
                Object b = kbb.b(this.$channel.l());
                myc0.h(yvjVar, null, null, new a(b == null ? next : b, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, null), 3);
                this.L$0 = yvjVar;
                this.L$1 = it;
                this.label = 1;
                obj = it.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) obj).booleanValue()) {
                    return s3q0.a;
                }
            }
        }
    }
}
