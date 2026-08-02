package xsna;

import androidx.compose.runtime.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AudioBookChapterMviComposeComponent.kt */
/* loaded from: classes3.dex */
public final class le4 implements ypo0<qe4> {
    public final izs<pe4, s3q0> b;

    /* compiled from: AudioBookChapterMviComposeComponent.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ qe4 b;

        public a(qe4 qe4Var) {
            this.b = qe4Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((je4) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, qe4.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: AudioBookChapterMviComposeComponent.kt */
    @b6l(c = "com.vk.music.bottomsheets.audiobook.chapter.presentation.compose.AudioBookChapterMviComposeComponent$ThemedContent$2$1", f = "AudioBookChapterMviComposeComponent.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<je4>, pe4, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<je4> z37Var, pe4 pe4Var, spj<? super s3q0> spjVar) {
            b bVar = le4.this.new b(spjVar);
            bVar.L$0 = pe4Var;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            pe4 pe4Var = (pe4) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            le4.this.b.invoke(pe4Var);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public le4(izs<? super pe4, s3q0> izsVar) {
        this.b = izsVar;
    }

    public final void a(qe4 qe4Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1610070517);
        int i2 = (M.J(qe4Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1610070517, i2, -1, "com.vk.music.bottomsheets.audiobook.chapter.presentation.compose.AudioBookChapterMviComposeComponent.ThemedContent (AudioBookChapterMviComposeComponent.kt:41)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new s6(qe4Var, 7);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new b(null);
                M.R(x2);
            }
            r37.a(izsVar, (yzs) x2, ibi.a, M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ke4(this, qe4Var, i, 0);
        }
    }
}
