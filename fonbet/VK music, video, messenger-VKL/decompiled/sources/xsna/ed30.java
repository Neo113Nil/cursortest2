package xsna;

import com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.MovieButtonsInlineActor$onInitialized$1$invokeSuspend$$inlined$filter$1$2;
import com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity.MovieButtonsBlockState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MovieButtonsInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.MovieButtonsInlineActor$onInitialized$1", f = "MovieButtonsInlineActor.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class ed30 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ dd30 this$0;

    /* compiled from: MovieButtonsInlineActor.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ dd30 b;

        public a(dd30 dd30Var) {
            this.b = dd30Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            dd30 dd30Var = this.b;
            ((MovieButtonsBlockState) ((b2a) dd30Var.b.b).getCurrentState()).f.s0(((bwr0) obj) instanceof axr0);
            dd30Var.m(new vsq(12));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed30(dd30 dd30Var, spj<? super ed30> spjVar) {
        super(2, spjVar);
        this.this$0 = dd30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ed30(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ed30) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            nb9 a2 = cdn.a(wjs0.b);
            a aVar = new a(this.this$0);
            this.label = 1;
            Object collect = a2.collect(new MovieButtonsInlineActor$onInitialized$1$invokeSuspend$$inlined$filter$1$2(aVar), this);
            if (collect != coroutineSingletons) {
                collect = s3q0.a;
            }
            if (collect == coroutineSingletons) {
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
