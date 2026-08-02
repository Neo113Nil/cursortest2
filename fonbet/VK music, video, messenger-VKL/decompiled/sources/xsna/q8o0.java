package xsna;

import androidx.compose.runtime.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TemplateDetailsScreen.kt */
/* loaded from: classes3.dex */
public final class q8o0 {

    /* compiled from: TemplateDetailsScreen.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ r8o0 b;

        public a(r8o0 r8o0Var) {
            this.b = r8o0Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((com.vk.messagetemplates.impl.details.a) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, r8o0.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: TemplateDetailsScreen.kt */
    @b6l(c = "com.vk.messagetemplates.impl.details.ui.TemplateDetailsScreenKt$TemplateDetailsScreen$2$1", f = "TemplateDetailsScreen.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<com.vk.messagetemplates.impl.details.a>, com.vk.messagetemplates.impl.details.b, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<com.vk.messagetemplates.impl.details.b, s3q0> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super com.vk.messagetemplates.impl.details.b, s3q0> izsVar, spj<? super b> spjVar) {
            super(3, spjVar);
            this.$onEvent = izsVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<com.vk.messagetemplates.impl.details.a> z37Var, com.vk.messagetemplates.impl.details.b bVar, spj<? super s3q0> spjVar) {
            b bVar2 = new b(this.$onEvent, spjVar);
            bVar2.L$0 = bVar;
            return bVar2.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.vk.messagetemplates.impl.details.b bVar = (com.vk.messagetemplates.impl.details.b) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onEvent.invoke(bVar);
            return s3q0.a;
        }
    }

    /* compiled from: TemplateDetailsScreen.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<com.vk.messagetemplates.impl.details.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.messagetemplates.impl.details.a aVar) {
            ((r8o0) this.receiver).b(aVar);
            return s3q0.a;
        }
    }

    public static final void a(r8o0 r8o0Var, izs<? super com.vk.messagetemplates.impl.details.b, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-357151848);
        int i2 = (M.J(r8o0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-357151848, i2, -1, "com.vk.messagetemplates.impl.details.ui.TemplateDetailsScreen (TemplateDetailsScreen.kt:16)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new gj80(r8o0Var, 22);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new b(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, kai.c(1683032713, new v85(r8o0Var, 1), M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new iq8(r8o0Var, izsVar, i, 7);
        }
    }
}
