package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {IronSourceError.ERROR_PLACEMENT_CAPPED}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class i02 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ yzs<cz1, sgo<Object>, spj<? super s3q0>, Object> $block;
    int label;
    final /* synthetic */ c12<Object> this$0;

    /* compiled from: AnchoredDraggable.kt */
    @b6l(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {IronSourceError.ERROR_AD_FORMAT_CAPPED}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<sgo<Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ yzs<cz1, sgo<Object>, spj<? super s3q0>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c12<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c12 c12Var, spj spjVar, yzs yzsVar) {
            super(2, spjVar);
            this.$block = yzsVar;
            this.this$0 = c12Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar, this.$block);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(sgo<Object> sgoVar, spj<? super s3q0> spjVar) {
            return ((a) create(sgoVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sgo<Object> sgoVar = (sgo) this.L$0;
                yzs<cz1, sgo<Object>, spj<? super s3q0>, Object> yzsVar = this.$block;
                s02 s02Var = this.this$0.l;
                this.label = 1;
                if (yzsVar.invoke(s02Var, sgoVar, this) == coroutineSingletons) {
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
    public i02(c12 c12Var, spj spjVar, yzs yzsVar) {
        super(1, spjVar);
        this.this$0 = c12Var;
        this.$block = yzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new i02(this.this$0, spjVar, this.$block);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((i02) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            c12<Object> c12Var = this.this$0;
            s4 s4Var = new s4(c12Var, 4);
            a aVar = new a(c12Var, null, this.$block);
            this.label = 1;
            if (nzo.b(s4Var, aVar, this) == coroutineSingletons) {
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
