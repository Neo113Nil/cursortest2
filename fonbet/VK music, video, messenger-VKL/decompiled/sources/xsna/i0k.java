package xsna;

import androidx.compose.runtime.a;
import com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity.CoverChooseState;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CoverChooseComposeComponent.kt */
/* loaded from: classes7.dex */
public final class i0k extends dk50<bn50<CoverChooseState, CoverChooseState, f0k, m0k>> {
    public final g1k b;
    public final CoverChooseFragment.b c;

    /* compiled from: CoverChooseComposeComponent.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ bn50<CoverChooseState, CoverChooseState, f0k, m0k> b;

        public a(bn50<CoverChooseState, CoverChooseState, f0k, m0k> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((f0k) lj50Var);
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

    /* compiled from: CoverChooseComposeComponent.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.CoverChooseComposeComponent$ThemedContent$2$1", f = "CoverChooseComposeComponent.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<f0k>, m0k, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<f0k> z37Var, m0k m0kVar, spj<? super s3q0> spjVar) {
            b bVar = i0k.this.new b(spjVar);
            bVar.L$0 = m0kVar;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            m0k m0kVar = (m0k) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            i0k.this.c.invoke(m0kVar);
            return s3q0.a;
        }
    }

    public i0k(g1k g1kVar, CoverChooseFragment.b bVar) {
        this.b = g1kVar;
        this.c = bVar;
    }

    @Override // xsna.zqi
    public final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(-765861722);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-765861722, i, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.CoverChooseComposeComponent.Theme (CoverChooseComposeComponent.kt:44)");
            }
            rrv0.e(true, null, null, null, null, null, kai.c(1238969225, new wnd(1, jaiVar), M), M, 1572870, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g06(this, jaiVar, i, 2);
        }
    }

    @Override // xsna.ypo0
    public final /* bridge */ /* synthetic */ void b(mm50 mm50Var, androidx.compose.runtime.a aVar) {
        d((bn50) mm50Var, aVar, 0);
    }

    public final void d(bn50<CoverChooseState, CoverChooseState, f0k, m0k> bn50Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(420630276);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(420630276, i, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.CoverChooseComposeComponent.ThemedContent (CoverChooseComposeComponent.kt:26)");
        }
        boolean y = M.y(bn50Var) | M.y(this);
        Object x = M.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new ut6(10, bn50Var, this);
            M.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = M.y(this);
        Object x2 = M.x();
        if (y2 || x2 == c0012a) {
            x2 = new b(null);
            M.R(x2);
        }
        r37.a(izsVar, (yzs) x2, jei.a, M, 384, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h0k(this, bn50Var, i, 0);
        }
    }
}
