package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.splashscreen.api.SplashScreenState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoCatalogRootVh.kt */
@b6l(c = "com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh$handleLoginRequestAfterSplashScreen$1", f = "VideoCatalogRootVh.kt", l = {1531}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class u9s0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ VideoCatalogRootVh this$0;

    /* compiled from: VideoCatalogRootVh.kt */
    @b6l(c = "com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh$handleLoginRequestAfterSplashScreen$1$1$1", f = "VideoCatalogRootVh.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<SplashScreenState, spj<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(2, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(SplashScreenState splashScreenState, spj<? super Boolean> spjVar) {
            return ((a) create(splashScreenState, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SplashScreenState splashScreenState = (SplashScreenState) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return Boolean.valueOf(splashScreenState == SplashScreenState.HIDDEN);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9s0(VideoCatalogRootVh videoCatalogRootVh, spj<? super u9s0> spjVar) {
        super(2, spjVar);
        this.this$0 = videoCatalogRootVh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new u9s0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((u9s0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        utk0 state;
        VideoCatalogRootVh videoCatalogRootVh;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            xkk0 xkk0Var = this.this$0.C;
            if (xkk0Var != null && (state = xkk0Var.getState()) != null) {
                VideoCatalogRootVh videoCatalogRootVh2 = this.this$0;
                a aVar = new a(2, null);
                this.L$0 = videoCatalogRootVh2;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                if (rsr.o(state, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                videoCatalogRootVh = videoCatalogRootVh2;
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        videoCatalogRootVh = (VideoCatalogRootVh) this.L$0;
        kotlin.a.a(obj);
        int i2 = VideoCatalogRootVh.M0;
        videoCatalogRootVh.l0();
        return s3q0.a;
    }
}
