package xsna;

import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.dto.common.VideoFile;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LiveDelegate.kt */
/* loaded from: classes16.dex */
public final class ajz implements emz {
    public final /* synthetic */ ars0 a;

    /* compiled from: LiveDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.LiveDelegateKt$createLiveEventsDelegate$2$onFinished$1", f = "LiveDelegate.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
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
        public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
            return ((a) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yg5 yg5Var = (yg5) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            yg5Var.S(true);
            return s3q0.a;
        }
    }

    /* compiled from: LiveDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.LiveDelegateKt$createLiveEventsDelegate$2$onPause$1", f = "LiveDelegate.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(2, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
            return ((b) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yg5 yg5Var = (yg5) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            yg5Var.pause();
            return s3q0.a;
        }
    }

    /* compiled from: LiveDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.LiveDelegateKt$createLiveEventsDelegate$2$onPlay$1", f = "LiveDelegate.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            c cVar = new c(2, spjVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
            return ((c) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yg5 yg5Var = (yg5) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            yg5Var.play();
            return s3q0.a;
        }
    }

    public ajz(ars0 ars0Var) {
        this.a = ars0Var;
    }

    @Override // xsna.emz
    public final void a() {
        ars0 ars0Var = this.a;
        fjz fjzVar = ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).v;
        if (fjzVar != null) {
            fjzVar.a();
        }
        if (((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).o) {
            ars0Var.x(new a(2, null));
        }
    }

    @Override // xsna.emz
    public final void b(VideoFile videoFile) {
        ars0 ars0Var = this.a;
        yg5 yg5Var = ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).r;
        if (yg5Var != null && epx.f(yg5Var.A().r1(), videoFile.r1())) {
            yg5Var.N(videoFile);
        }
        ars0Var.m(new l2i(videoFile, 22));
    }

    @Override // xsna.emz
    public final void onPause() {
        ars0 ars0Var = this.a;
        if (((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).o) {
            ars0Var.w(new b(2, null));
        }
    }

    @Override // xsna.emz
    public final void p() {
        ars0 ars0Var = this.a;
        if (((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).o && ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).t.f) {
            ars0Var.w(new c(2, null));
        }
    }
}
