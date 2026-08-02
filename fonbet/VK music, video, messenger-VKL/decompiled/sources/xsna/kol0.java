package xsna;

import androidx.compose.runtime.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lnl0;
import xsna.zol0;

/* compiled from: StorefrontServicesScreen.kt */
/* loaded from: classes18.dex */
public final class kol0 {
    public static final iyk0 a = new iyk0(new xv0(24));

    /* compiled from: StorefrontServicesScreen.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ ool0 b;

        public a(ool0 ool0Var) {
            this.b = ool0Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((wml0) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, ool0.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: StorefrontServicesScreen.kt */
    @b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesScreenKt$StorefrontServicesScreen$2$1", f = "StorefrontServicesScreen.kt", l = {54}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<wml0>, lnl0, spj<? super s3q0>, Object> {
        final /* synthetic */ sh50<lnl0.b> $effects;
        final /* synthetic */ izs<lnl0.a, s3q0> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super lnl0.a, s3q0> izsVar, sh50<lnl0.b> sh50Var, spj<? super b> spjVar) {
            super(3, spjVar);
            this.$onEvent = izsVar;
            this.$effects = sh50Var;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<wml0> z37Var, lnl0 lnl0Var, spj<? super s3q0> spjVar) {
            b bVar = new b(this.$onEvent, this.$effects, spjVar);
            bVar.L$0 = lnl0Var;
            return bVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            lnl0 lnl0Var = (lnl0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (lnl0Var instanceof lnl0.a) {
                    this.$onEvent.invoke(lnl0Var);
                } else {
                    if (!(lnl0Var instanceof lnl0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sh50<lnl0.b> sh50Var = this.$effects;
                    this.L$0 = null;
                    this.label = 1;
                    if (sh50Var.emit(lnl0Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: StorefrontServicesScreen.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<wml0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(wml0 wml0Var) {
            ((z37) this.receiver).b(wml0Var);
            return s3q0.a;
        }
    }

    public static final void a(ool0 ool0Var, izs<? super lnl0.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(665705063);
        int i2 = (M.J(ool0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(665705063, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesScreen (StorefrontServicesScreen.kt:37)");
            }
            Object nol0Var = new nol0();
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = lyd.b(0, 0, null, 7);
                M.R(x);
            }
            final sh50 sh50Var = (sh50) x;
            boolean y = ((i2 & 14) == 4) | M.y(nol0Var);
            Object x2 = M.x();
            if (y || x2 == obj) {
                x2 = new wqb(21, ool0Var, nol0Var);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean y2 = M.y(sh50Var) | ((i2 & 112) == 32);
            Object x3 = M.x();
            if (y2 || x3 == obj) {
                x3 = new b(izsVar, sh50Var, null);
                M.R(x3);
            }
            r37.a(izsVar2, (yzs) x3, kai.c(1634451636, new zzs() { // from class: xsna.jol0
                @Override // xsna.zzs
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    z37 z37Var = (z37) obj2;
                    zol0 zol0Var = (zol0) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar2.J(z37Var) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar2.J(zol0Var) ? 32 : 16;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1634451636, i3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesScreen.<anonymous> (StorefrontServicesScreen.kt:57)");
                        }
                        rvi.a(kol0.a.b(sh50.this), kai.c(1066931188, new sg4(4, zol0Var, z37Var), aVar2), aVar2, 56);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new io7(ool0Var, izsVar, i, 10);
        }
    }

    public static final void b(zol0 zol0Var, izs<? super wml0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1660800068);
        int i2 = (M.J(zol0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1660800068, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesScreen (StorefrontServicesScreen.kt:74)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = yq.f(M);
            }
            dlv0 dlv0Var = (dlv0) x;
            int i3 = ((i2 << 3) & 896) | (i2 & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1923486962, i3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.showSnackBarIfNeed (StorefrontServicesScreen.kt:135)");
            }
            if (zol0Var.c instanceof zol0.a.d) {
                M.K(853863771);
                ((zol0.a.d) zol0Var.c).getClass();
                M.K(853949237);
                M.j();
                boolean y = M.y(null) | M.y(null);
                if ((((i3 & 896) ^ 384) <= 256 || !M.J(izsVar)) && (i3 & 384) != 256) {
                    z = false;
                }
                boolean z2 = y | z;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new lol0(dlv0Var, null, izsVar, null);
                    M.R(x2);
                }
                bap.g(null, (wzs) x2, M, 0);
                M.j();
            } else {
                M.K(854262895);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rrv0.d(null, null, null, null, kai.c(-1327190559, new x4a(zol0Var, izsVar, dlv0Var), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bta(zol0Var, izsVar, i, 9);
        }
    }
}
