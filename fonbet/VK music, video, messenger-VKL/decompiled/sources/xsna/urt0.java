package xsna;

import android.content.Context;
import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerArguments;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.jrt0;
import xsna.lrt0;

/* compiled from: VideoViewerInlineActor.kt */
/* loaded from: classes7.dex */
public final class urt0 extends bl50<VideoViewerState, jrt0, on50, bwj, dwj, lrt0> {
    public final VideoViewerArguments c;
    public final Context d;
    public final vrt0 e;
    public final sj50<VideoViewerState, on50, ll50<on50, bwj, dwj>, jl50<VideoViewerState>, lrt0> f;

    /* compiled from: VideoViewerInlineActor.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.videoviewer.presentation.feature.store.VideoViewerInlineActor$runOnUiThread$1", f = "VideoViewerInlineActor.kt", l = {183}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<spj<? super s3q0>, Object> $block;
        int label;

        /* compiled from: VideoViewerInlineActor.kt */
        @b6l(c = "com.vk.video.ui.upload.impl.videoviewer.presentation.feature.store.VideoViewerInlineActor$runOnUiThread$1$1", f = "VideoViewerInlineActor.kt", l = {184}, m = "invokeSuspend")
        /* renamed from: xsna.urt0$a$a, reason: collision with other inner class name */
        public static final class C3817a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ izs<spj<? super s3q0>, Object> $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3817a(izs<? super spj<? super s3q0>, ? extends Object> izsVar, spj<? super C3817a> spjVar) {
                super(2, spjVar);
                this.$block = izsVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3817a(this.$block, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3817a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    izs<spj<? super s3q0>, Object> izsVar = this.$block;
                    this.label = 1;
                    if (izsVar.invoke(this) == coroutineSingletons) {
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
        public a(izs<? super spj<? super s3q0>, ? extends Object> izsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$block = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$block, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                bdn bdnVar = bdn.a;
                ge00 ge00Var = ie00.a;
                C3817a c3817a = new C3817a(this.$block, null);
                this.label = 1;
                if (myc0.k(ge00Var, c3817a, this) == coroutineSingletons) {
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

    public urt0(VideoViewerArguments videoViewerArguments, Context context, vrt0 vrt0Var, sj50<VideoViewerState, on50, ll50<on50, bwj, dwj>, jl50<VideoViewerState>, lrt0> sj50Var) {
        super(sj50Var);
        this.c = videoViewerArguments;
        this.d = context;
        this.e = vrt0Var;
        this.f = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<VideoViewerState, on50, ll50<on50, bwj, dwj>, jl50<VideoViewerState>, lrt0> W() {
        return this.f;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        m(new srt0(this, null));
    }

    public final void m(izs<? super spj<? super s3q0>, ? extends Object> izsVar) {
        g3q.a(this, new a(izsVar, null));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        jrt0 jrt0Var = (jrt0) lj50Var;
        if (jrt0Var instanceof jrt0.a) {
            c(new lrt0.a(null));
            return;
        }
        if (jrt0Var instanceof jrt0.c) {
            VideoViewerArguments videoViewerArguments = this.c;
            if (videoViewerArguments instanceof VideoViewerArguments.Local) {
                c(new lrt0.a(null));
                return;
            } else {
                if (!(videoViewerArguments instanceof VideoViewerArguments.RemoteAttachedClip)) {
                    throw new NoWhenBranchMatchedException();
                }
                c(new lrt0.a(new VideoViewerResult(((VideoViewerArguments.RemoteAttachedClip) videoViewerArguments).b)));
                return;
            }
        }
        if (jrt0Var instanceof jrt0.b) {
            m(new trt0(this, null));
            return;
        }
        if (jrt0Var instanceof jrt0.g) {
            m(new trt0(this, null));
            return;
        }
        if (jrt0Var instanceof jrt0.f) {
            m(new qrt0(this, (jrt0.f) jrt0Var, null));
        } else if (jrt0Var instanceof jrt0.d) {
            m(new ort0(this, null));
        } else if (jrt0Var instanceof jrt0.e) {
            m(new prt0(this, null));
        }
    }
}
