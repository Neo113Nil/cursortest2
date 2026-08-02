package xsna;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivityWithPip;
import com.vk.libvideo.tracker.VideoPlayerMode;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import xsna.c63;
import xsna.zno;

/* compiled from: VkAppPipAnalyticsObserver.kt */
/* loaded from: classes.dex */
public final class nau0 extends c63.b {
    public final x0f b;
    public final hpj c;
    public yok0 d;
    public WeakReference<VideoContainerActivityWithPip> e;
    public boolean f;
    public boolean g;

    /* compiled from: VkAppPipAnalyticsObserver.kt */
    @b6l(c = "com.vk.libvideo.pip.VkAppPipAnalyticsObserver$trackState$1", f = "VkAppPipAnalyticsObserver.kt", l = {66}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return nau0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WeakReference<VideoContainerActivityWithPip> weakReference;
            VideoContainerActivityWithPip videoContainerActivityWithPip;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                zno.a aVar = zno.c;
                long e = eoo.e(1, DurationUnit.SECONDS);
                this.label = 1;
                if (qsl.c(e, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            nau0 nau0Var = nau0.this;
            if (nau0Var.f && (weakReference = nau0Var.e) != null && (videoContainerActivityWithPip = weakReference.get()) != null) {
                VideoPlayerMode videoPlayerMode = (nau0Var.g && videoContainerActivityWithPip.getLifecycle().getCurrentState() == Lifecycle.State.STARTED) ? VideoPlayerMode.PIP_EXTERNAL : !nau0Var.g ? VideoPlayerMode.PIP_INTERNAL : null;
                if (videoPlayerMode != null) {
                    e4t0.a(videoPlayerMode, (yg5) nau0Var.b.invoke());
                }
            }
            return s3q0.a;
        }
    }

    public nau0(x0f x0fVar) {
        this.b = x0fVar;
        bdn bdnVar = bdn.a;
        this.c = zvj.a(ie00.a.plus(whn0.a()));
    }

    public final void D() {
        yok0 yok0Var = this.d;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.d = myc0.h(this.c, null, null, new a(null), 3);
    }

    @Override // xsna.c63.b
    public final void m(Activity activity) {
        if (activity instanceof VideoContainerActivityWithPip) {
            this.e = new WeakReference<>(activity);
        }
    }

    @Override // xsna.c63.b
    public final void n(Activity activity) {
        if (activity instanceof VideoContainerActivityWithPip) {
            this.e = null;
        }
    }

    @Override // xsna.c63.b
    public final void u() {
        this.g = true;
        D();
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        this.g = false;
        D();
    }
}
