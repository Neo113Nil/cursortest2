package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AlbumChooseView.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.AlbumChooseViewKt$HandlePagination$1$1", f = "AlbumChooseView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class je1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $onPaginationScrollTrigger;
    final /* synthetic */ boolean $shouldLoadMore;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: AlbumChooseView.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.AlbumChooseViewKt$HandlePagination$1$1$1", f = "AlbumChooseView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<s3q0> $onPaginationScrollTrigger;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gzs<s3q0> gzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$onPaginationScrollTrigger = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$onPaginationScrollTrigger, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onPaginationScrollTrigger.invoke();
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je1(boolean z, gzs<s3q0> gzsVar, spj<? super je1> spjVar) {
        super(2, spjVar);
        this.$shouldLoadMore = z;
        this.$onPaginationScrollTrigger = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        je1 je1Var = new je1(this.$shouldLoadMore, this.$onPaginationScrollTrigger, spjVar);
        je1Var.L$0 = obj;
        return je1Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((je1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$shouldLoadMore) {
            myc0.h(yvjVar, null, null, new a(this.$onPaginationScrollTrigger, null), 3);
        }
        return s3q0.a;
    }
}
