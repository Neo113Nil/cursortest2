package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ybp0;

/* compiled from: TopshelfViewPagerAdapter.kt */
@b6l(c = "com.vk.catalog2.common.ui.mvp.holder.video.TopshelfViewPagerAdapter$1", f = "TopshelfViewPagerAdapter.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class wcp0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ xcp0 this$0;

    /* compiled from: TopshelfViewPagerAdapter.kt */
    @b6l(c = "com.vk.catalog2.common.ui.mvp.holder.video.TopshelfViewPagerAdapter$1$1", f = "TopshelfViewPagerAdapter.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<ybp0, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ xcp0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xcp0 xcp0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = xcp0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(ybp0 ybp0Var, spj<? super s3q0> spjVar) {
            return ((a) create(ybp0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ybp0 ybp0Var = (ybp0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (ybp0Var instanceof ybp0.c) {
                this.this$0.r = ((ybp0.c) ybp0Var).a;
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcp0(xcp0 xcp0Var, spj<? super wcp0> spjVar) {
        super(2, spjVar);
        this.this$0 = xcp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wcp0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wcp0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            xcp0 xcp0Var = this.this$0;
            sh50<ybp0> sh50Var = xcp0Var.m;
            a aVar = new a(xcp0Var, null);
            this.label = 1;
            if (rsr.k(sh50Var, aVar, this) == coroutineSingletons) {
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
