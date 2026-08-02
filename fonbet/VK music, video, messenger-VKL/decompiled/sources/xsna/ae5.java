package xsna;

import com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelSliderView$AuthorsChannelState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuthorsChannelInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelInlineActor$listenCatalogEvent$1", f = "AuthorsChannelInlineActor.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class ae5 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ de5 this$0;

    /* compiled from: AuthorsChannelInlineActor.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ de5 b;

        public a(de5 de5Var) {
            this.b = de5Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            y4a y4aVar = (y4a) obj;
            if (y4aVar instanceof sxm0) {
                de5 de5Var = this.b;
                sxm0 sxm0Var = (sxm0) y4aVar;
                if (((AuthorsChannelSliderView$AuthorsChannelState) ((b2a) de5Var.b.b).getCurrentState()).d.equals(sxm0Var.b) && ((AuthorsChannelSliderView$AuthorsChannelState) ((b2a) de5Var.b.b).getCurrentState()).f != sxm0Var.c) {
                    de5Var.m(new yx0(y4aVar, 8));
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae5(de5 de5Var, spj<? super ae5> spjVar) {
        super(2, spjVar);
        this.this$0 = de5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ae5(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ae5) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ksr<y4a> b = this.this$0.d.b();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (b.collect(aVar, this) == coroutineSingletons) {
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
