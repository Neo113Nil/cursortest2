package xsna;

import androidx.compose.runtime.a;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SmartCropComposeComponent.kt */
/* loaded from: classes7.dex */
public final class f4k0 extends dk50<bn50<SmartCropState, SmartCropState, d4k0, g4k0>> {
    public final r5k0 b;
    public final SmartCropFragment.b c;

    /* compiled from: SmartCropComposeComponent.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ bn50<SmartCropState, SmartCropState, d4k0, g4k0> b;

        public a(bn50<SmartCropState, SmartCropState, d4k0, g4k0> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((d4k0) lj50Var);
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

    /* compiled from: SmartCropComposeComponent.kt */
    @b6l(c = "com.vk.video.ui.smartcrop.impl.presentation.compose.SmartCropComposeComponent$ThemedContent$2$1", f = "SmartCropComposeComponent.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<d4k0>, g4k0, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<d4k0> z37Var, g4k0 g4k0Var, spj<? super s3q0> spjVar) {
            b bVar = f4k0.this.new b(spjVar);
            bVar.L$0 = g4k0Var;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            g4k0 g4k0Var = (g4k0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            f4k0.this.c.invoke(g4k0Var);
            return s3q0.a;
        }
    }

    public f4k0(r5k0 r5k0Var, SmartCropFragment.b bVar) {
        this.b = r5k0Var;
        this.c = bVar;
    }

    @Override // xsna.zqi
    public final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(528692816);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(528692816, i, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.SmartCropComposeComponent.Theme (SmartCropComposeComponent.kt:42)");
            }
            rrv0.e(true, null, null, null, null, null, kai.c(146077325, new fd4(jaiVar, 9), M), M, 1572870, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yku(this, jaiVar, i, 6);
        }
    }

    @Override // xsna.ypo0
    public final /* bridge */ /* synthetic */ void b(mm50 mm50Var, androidx.compose.runtime.a aVar) {
        d((bn50) mm50Var, aVar, 0);
    }

    public final void d(bn50<SmartCropState, SmartCropState, d4k0, g4k0> bn50Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(119588658);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(119588658, i, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.SmartCropComposeComponent.ThemedContent (SmartCropComposeComponent.kt:24)");
        }
        boolean y = M.y(bn50Var) | M.y(this);
        Object x = M.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new oh3(26, bn50Var, this);
            M.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = M.y(this);
        Object x2 = M.x();
        if (y2 || x2 == c0012a) {
            x2 = new b(null);
            M.R(x2);
        }
        r37.a(izsVar, (yzs) x2, cli.a, M, 384, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zjm(this, bn50Var, i, 10);
        }
    }
}
