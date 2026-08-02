package xsna;

import androidx.compose.runtime.a;
import com.vk.music.playlist.display.audiobook.offline.presentation.fragment.OfflineAudioBookChaptersFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OfflineAudioBookChaptersMviComposeComponent.kt */
/* loaded from: classes3.dex */
public final class vs70 extends dk50<bt70> {
    public final OfflineAudioBookChaptersFragment.c b;

    /* compiled from: OfflineAudioBookChaptersMviComposeComponent.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ bt70 b;

        public a(bt70 bt70Var) {
            this.b = bt70Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((us70) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, bt70.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: OfflineAudioBookChaptersMviComposeComponent.kt */
    @b6l(c = "com.vk.music.playlist.display.audiobook.offline.presentation.compose.OfflineAudioBookChaptersMviComposeComponent$ThemedContent$2$1", f = "OfflineAudioBookChaptersMviComposeComponent.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<us70>, at70, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<us70> z37Var, at70 at70Var, spj<? super s3q0> spjVar) {
            b bVar = vs70.this.new b(spjVar);
            bVar.L$0 = at70Var;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            at70 at70Var = (at70) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            vs70.this.b.invoke(at70Var);
            return s3q0.a;
        }
    }

    public vs70(OfflineAudioBookChaptersFragment.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.zqi
    public final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(1231079511);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1231079511, i, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.OfflineAudioBookChaptersMviComposeComponent.Theme (OfflineAudioBookChaptersMviComposeComponent.kt:92)");
            }
            rrv0.d(null, null, null, null, kai.c(-745896836, new com.vk.movika.tools.controls.seekbar.t(jaiVar, 8), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cg4(this, jaiVar, i, 6);
        }
    }

    @Override // xsna.ypo0
    public final /* bridge */ /* synthetic */ void b(mm50 mm50Var, androidx.compose.runtime.a aVar) {
        d((bt70) mm50Var, aVar, 0);
    }

    public final void d(bt70 bt70Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1803153388);
        int i2 = (M.J(bt70Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1803153388, i2, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.OfflineAudioBookChaptersMviComposeComponent.ThemedContent (OfflineAudioBookChaptersMviComposeComponent.kt:99)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new fa00(bt70Var, 10);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new b(null);
                M.R(x2);
            }
            r37.a(izsVar, (yzs) x2, xii.a, M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wn7(this, bt70Var, i, 9);
        }
    }
}
