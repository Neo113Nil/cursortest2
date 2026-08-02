package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jpl0;

/* compiled from: StorefrontScreen.kt */
/* loaded from: classes18.dex */
public final class uml0 {

    /* compiled from: StorefrontScreen.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ cpl0 b;

        public a(cpl0 cpl0Var) {
            this.b = cpl0Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((hjl0) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, cpl0.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: StorefrontScreen.kt */
    @b6l(c = "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontScreenKt$StorefrontScreen$2$1", f = "StorefrontScreen.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<hjl0>, xll0, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<xll0, s3q0> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super xll0, s3q0> izsVar, spj<? super b> spjVar) {
            super(3, spjVar);
            this.$onEvent = izsVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<hjl0> z37Var, xll0 xll0Var, spj<? super s3q0> spjVar) {
            b bVar = new b(this.$onEvent, spjVar);
            bVar.L$0 = xll0Var;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            xll0 xll0Var = (xll0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onEvent.invoke(xll0Var);
            return s3q0.a;
        }
    }

    public static final void a(cpl0 cpl0Var, izs<? super xll0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1517090412);
        int i2 = (M.J(cpl0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1517090412, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontScreen (StorefrontScreen.kt:31)");
            }
            bpl0 bpl0Var = new bpl0();
            boolean J = ((i2 & 14) == 4) | M.J(bpl0Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new dvh0(4, cpl0Var, bpl0Var);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new b(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, ili.a, M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pzj(cpl0Var, izsVar, i, 10);
        }
    }

    public static final void b(jpl0 jpl0Var, izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        dlv0 dlv0Var;
        a7k0 a7k0Var;
        androidx.compose.runtime.a M = aVar.M(-391179391);
        if ((i & 6) == 0) {
            i2 = (M.J(jpl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-391179391, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontScreen (StorefrontScreen.kt:59)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj = x;
            if (x == c0012a) {
                obj = yq.f(M);
            }
            dlv0 dlv0Var2 = (dlv0) obj;
            int i3 = ((i2 << 3) & 896) | (i2 & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(5860305, i3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.showSnackBarIfNeed (StorefrontScreen.kt:116)");
            }
            a7k0 a7k0Var2 = null;
            CharSequence a2 = null;
            if (jpl0Var.c instanceof jpl0.a.d) {
                M.K(-1509051270);
                a7k0 a7k0Var3 = ((jpl0.a.d) jpl0Var.c).a.n;
                tlo0 tlo0Var = a7k0Var3 != null ? a7k0Var3.b : null;
                if (tlo0Var == null) {
                    M.K(-1508959790);
                } else {
                    M.K(1336797199);
                    a2 = tlo0Var.a((Context) M.r(AndroidCompositionLocals_androidKt.b));
                }
                M.j();
                boolean y = M.y(a7k0Var3) | M.y(a2);
                if ((((i3 & 896) ^ 384) <= 256 || !M.J(izsVar)) && (i3 & 384) != 256) {
                    z = false;
                }
                boolean z2 = y | z;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    dlv0Var = dlv0Var2;
                    a7k0Var = a7k0Var3;
                    vml0 vml0Var = new vml0(a7k0Var, dlv0Var, a2, izsVar, null);
                    M.R(vml0Var);
                    x2 = vml0Var;
                } else {
                    dlv0Var = dlv0Var2;
                    a7k0Var = a7k0Var3;
                }
                bap.g(a7k0Var, (wzs) x2, M, 0);
                M.j();
                a7k0Var2 = a7k0Var;
            } else {
                dlv0Var = dlv0Var2;
                M.K(-1508654068);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rrv0.d(null, null, null, null, kai.c(1570748262, new d48(jpl0Var, izsVar, a7k0Var2, dlv0Var), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sac(jpl0Var, izsVar, i);
        }
    }
}
