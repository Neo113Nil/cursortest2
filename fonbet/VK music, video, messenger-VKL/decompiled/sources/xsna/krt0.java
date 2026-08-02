package xsna;

import androidx.compose.runtime.a;
import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoViewerComposeComponent.kt */
/* loaded from: classes7.dex */
public final class krt0 extends dk50<bn50<VideoViewerState, VideoViewerState, jrt0, lrt0>> {
    public final cst0 b;
    public final VideoViewerFragment.b c;

    /* compiled from: VideoViewerComposeComponent.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ bn50<VideoViewerState, VideoViewerState, jrt0, lrt0> b;

        public a(bn50<VideoViewerState, VideoViewerState, jrt0, lrt0> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((jrt0) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: VideoViewerComposeComponent.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.VideoViewerComposeComponent$ThemedContent$2$1", f = "VideoViewerComposeComponent.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<jrt0>, lrt0, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<jrt0> z37Var, lrt0 lrt0Var, spj<? super s3q0> spjVar) {
            b bVar = krt0.this.new b(spjVar);
            bVar.L$0 = lrt0Var;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            lrt0 lrt0Var = (lrt0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            krt0.this.c.invoke(lrt0Var);
            return s3q0.a;
        }
    }

    public krt0(cst0 cst0Var, VideoViewerFragment.b bVar) {
        this.b = cst0Var;
        this.c = bVar;
    }

    @Override // xsna.zqi
    public final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(1725863753);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1725863753, i, -1, "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.VideoViewerComposeComponent.Theme (VideoViewerComposeComponent.kt:42)");
            }
            rrv0.d(null, null, null, null, kai.c(-2088035218, new g1j0(1, jaiVar), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wbi(this, jaiVar, i, 12);
        }
    }

    @Override // xsna.ypo0
    public final /* bridge */ /* synthetic */ void b(mm50 mm50Var, androidx.compose.runtime.a aVar) {
        d((bn50) mm50Var, aVar, 0);
    }

    public final void d(bn50<VideoViewerState, VideoViewerState, jrt0, lrt0> bn50Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1382611545);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1382611545, i, -1, "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.VideoViewerComposeComponent.ThemedContent (VideoViewerComposeComponent.kt:24)");
        }
        boolean y = M.y(bn50Var) | M.y(this);
        Object x = M.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new ab(23, bn50Var, this);
            M.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = M.y(this);
        Object x2 = M.x();
        if (y2 || x2 == c0012a) {
            x2 = new b(null);
            M.R(x2);
        }
        r37.a(izsVar, (yzs) x2, umi.a, M, 384, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qg(this, bn50Var, i, 11);
        }
    }
}
