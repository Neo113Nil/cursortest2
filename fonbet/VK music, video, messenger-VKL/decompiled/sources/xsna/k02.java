package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "com.vk.core.compose.component.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {IronSourceError.ERROR_AD_UNIT_CAPPED}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class k02 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ yzs<ez1, ugo<Object>, spj<? super s3q0>, Object> $block;
    int label;
    final /* synthetic */ e12<Object> this$0;

    /* compiled from: AnchoredDraggable.kt */
    @b6l(c = "com.vk.core.compose.component.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {531}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<ugo<Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ yzs<ez1, ugo<Object>, spj<? super s3q0>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e12<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e12 e12Var, spj spjVar, yzs yzsVar) {
            super(2, spjVar);
            this.$block = yzsVar;
            this.this$0 = e12Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar, this.$block);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(ugo<Object> ugoVar, spj<? super s3q0> spjVar) {
            return ((a) create(ugoVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ugo<Object> ugoVar = (ugo) this.L$0;
                yzs<ez1, ugo<Object>, spj<? super s3q0>, Object> yzsVar = this.$block;
                u02 u02Var = this.this$0.m;
                this.label = 1;
                if (yzsVar.invoke(u02Var, ugoVar, this) == coroutineSingletons) {
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
    public k02(e12 e12Var, spj spjVar, yzs yzsVar) {
        super(1, spjVar);
        this.this$0 = e12Var;
        this.$block = yzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new k02(this.this$0, spjVar, this.$block);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((k02) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            e12<Object> e12Var = this.this$0;
            ji0 ji0Var = new ji0(e12Var, 2);
            a aVar = new a(e12Var, null, this.$block);
            this.label = 1;
            if (d02.h(ji0Var, aVar, this) == coroutineSingletons) {
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
