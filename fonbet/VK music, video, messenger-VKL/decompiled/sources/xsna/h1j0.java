package xsna;

import androidx.compose.runtime.a;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SettingsComposeComponent.kt */
/* loaded from: classes7.dex */
public final class h1j0 extends dk50<bn50<SettingsState, SettingsState, q0j0, q1j0>> {
    public final y3j0 b;
    public final SettingsFragment.b c;

    /* compiled from: SettingsComposeComponent.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ bn50<SettingsState, SettingsState, q0j0, q1j0> b;

        public a(bn50<SettingsState, SettingsState, q0j0, q1j0> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((q0j0) lj50Var);
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

    /* compiled from: SettingsComposeComponent.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.settings.presentation.compose.SettingsComposeComponent$ThemedContent$2$1", f = "SettingsComposeComponent.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<q0j0>, q1j0, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<q0j0> z37Var, q1j0 q1j0Var, spj<? super s3q0> spjVar) {
            b bVar = h1j0.this.new b(spjVar);
            bVar.L$0 = q1j0Var;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q1j0 q1j0Var = (q1j0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            h1j0.this.c.invoke(q1j0Var);
            return s3q0.a;
        }
    }

    public h1j0(y3j0 y3j0Var, SettingsFragment.b bVar) {
        this.b = y3j0Var;
        this.c = bVar;
    }

    @Override // xsna.zqi
    public final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(1399038407);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1399038407, i, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.SettingsComposeComponent.Theme (SettingsComposeComponent.kt:42)");
            }
            rrv0.d(null, null, null, null, kai.c(-806957310, new g1j0(0, jaiVar), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wbi(this, jaiVar, i, 10);
        }
    }

    @Override // xsna.ypo0
    public final /* bridge */ /* synthetic */ void b(mm50 mm50Var, androidx.compose.runtime.a aVar) {
        d((bn50) mm50Var, aVar, 0);
    }

    public final void d(bn50<SettingsState, SettingsState, q0j0, q1j0> bn50Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(506065321);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(506065321, i, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.SettingsComposeComponent.ThemedContent (SettingsComposeComponent.kt:24)");
        }
        boolean y = M.y(bn50Var) | M.y(this);
        Object x = M.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new ab(19, bn50Var, this);
            M.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = M.y(this);
        Object x2 = M.x();
        if (y2 || x2 == c0012a) {
            x2 = new b(null);
            M.R(x2);
        }
        r37.a(izsVar, (yzs) x2, vki.a, M, 384, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qg(this, bn50Var, i, 8);
        }
    }
}
