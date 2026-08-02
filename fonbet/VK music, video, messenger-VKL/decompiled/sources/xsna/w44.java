package xsna;

import androidx.compose.runtime.a;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AttachedClipsComposeComponent.kt */
/* loaded from: classes7.dex */
public final class w44 extends dk50<bn50<AttachedClipsState, AttachedClipsState, t44, x44>> {
    public final c64 b;
    public final AttachedClipsFragment.b c;

    /* compiled from: AttachedClipsComposeComponent.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ bn50<AttachedClipsState, AttachedClipsState, t44, x44> b;

        public a(bn50<AttachedClipsState, AttachedClipsState, t44, x44> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((t44) lj50Var);
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

    /* compiled from: AttachedClipsComposeComponent.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.AttachedClipsComposeComponent$ThemedContent$2$1", f = "AttachedClipsComposeComponent.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<t44>, x44, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<t44> z37Var, x44 x44Var, spj<? super s3q0> spjVar) {
            b bVar = w44.this.new b(spjVar);
            bVar.L$0 = x44Var;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x44 x44Var = (x44) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            w44.this.c.invoke(x44Var);
            return s3q0.a;
        }
    }

    public w44(c64 c64Var, AttachedClipsFragment.b bVar) {
        this.b = c64Var;
        this.c = bVar;
    }

    @Override // xsna.zqi
    public final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(434889843);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(434889843, i, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.AttachedClipsComposeComponent.Theme (AttachedClipsComposeComponent.kt:42)");
            }
            rrv0.d(null, null, null, null, kai.c(1202141656, new v44(0, jaiVar), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jz1(this, jaiVar, i, 1);
        }
    }

    @Override // xsna.ypo0
    public final /* bridge */ /* synthetic */ void b(mm50 mm50Var, androidx.compose.runtime.a aVar) {
        d((bn50) mm50Var, aVar, 0);
    }

    public final void d(bn50<AttachedClipsState, AttachedClipsState, t44, x44> bn50Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-794586031);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-794586031, i, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.AttachedClipsComposeComponent.ThemedContent (AttachedClipsComposeComponent.kt:24)");
        }
        boolean y = M.y(bn50Var) | M.y(this);
        Object x = M.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new ya(3, bn50Var, this);
            M.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = M.y(this);
        Object x2 = M.x();
        if (y2 || x2 == c0012a) {
            x2 = new b(null);
            M.R(x2);
        }
        r37.a(izsVar, (yzs) x2, fbi.a, M, 384, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mz1(this, bn50Var, i, 1);
        }
    }
}
