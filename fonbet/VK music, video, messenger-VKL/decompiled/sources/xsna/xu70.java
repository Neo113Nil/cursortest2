package xsna;

import androidx.compose.runtime.a;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.fragment.OfflinePodcastEpisodesFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OfflinePodcastEpisodesMviComposeComponent.kt */
/* loaded from: classes3.dex */
public final class xu70 extends dk50<ev70> {
    public final OfflinePodcastEpisodesFragment.c b;

    /* compiled from: OfflinePodcastEpisodesMviComposeComponent.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ ev70 b;

        public a(ev70 ev70Var) {
            this.b = ev70Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, ev70.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: OfflinePodcastEpisodesMviComposeComponent.kt */
    @b6l(c = "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.OfflinePodcastEpisodesMviComposeComponent$ThemedContent$2$1", f = "OfflinePodcastEpisodesMviComposeComponent.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a>, dv70, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a> z37Var, dv70 dv70Var, spj<? super s3q0> spjVar) {
            b bVar = xu70.this.new b(spjVar);
            bVar.L$0 = dv70Var;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            dv70 dv70Var = (dv70) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            xu70.this.b.invoke(dv70Var);
            return s3q0.a;
        }
    }

    public xu70(OfflinePodcastEpisodesFragment.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.zqi
    public final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(-584523783);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-584523783, i, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.OfflinePodcastEpisodesMviComposeComponent.Theme (OfflinePodcastEpisodesMviComposeComponent.kt:89)");
            }
            rrv0.d(null, null, null, null, kai.c(1578846452, new k3m(1, jaiVar), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a6(this, jaiVar, i, 8);
        }
    }

    @Override // xsna.ypo0
    public final /* bridge */ /* synthetic */ void b(mm50 mm50Var, androidx.compose.runtime.a aVar) {
        d((ev70) mm50Var, aVar, 0);
    }

    public final void d(ev70 ev70Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(144601541);
        int i2 = (M.J(ev70Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(144601541, i2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.OfflinePodcastEpisodesMviComposeComponent.ThemedContent (OfflinePodcastEpisodesMviComposeComponent.kt:96)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new nt10(ev70Var, 11);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new b(null);
                M.R(x2);
            }
            r37.a(izsVar, (yzs) x2, aji.a, M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d6(this, ev70Var, i, 7);
        }
    }
}
