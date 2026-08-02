package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.et7;
import xsna.q630;

/* compiled from: BookingPreloaderScreen.kt */
/* loaded from: classes18.dex */
public final class rs7 {

    /* compiled from: BookingPreloaderScreen.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.preloader.ui.compose.BookingPreloaderScreenKt$BookingPreloaderScreen$2$1", f = "BookingPreloaderScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<z37<gs7>, is7, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<is7, s3q0> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super is7, s3q0> izsVar, spj<? super a> spjVar) {
            super(3, spjVar);
            this.$onEvent = izsVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<gs7> z37Var, is7 is7Var, spj<? super s3q0> spjVar) {
            a aVar = new a(this.$onEvent, spjVar);
            aVar.L$0 = is7Var;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            is7 is7Var = (is7) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onEvent.invoke(is7Var);
            return s3q0.a;
        }
    }

    public static final void a(us7 us7Var, izs<? super is7, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1935363964);
        int i2 = (M.J(us7Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1935363964, i2, -1, "com.vk.ecomm.onlinebooking.impl.preloader.ui.compose.BookingPreloaderScreen (BookingPreloaderScreen.kt:34)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new ka(us7Var, 9);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new a(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, d02.o, M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ps7(us7Var, izsVar, i, 0);
        }
    }

    public static final void b(final et7 et7Var, final izs<? super gs7, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(546482705);
        int i2 = (M.J(et7Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(546482705, i2, -1, "com.vk.ecomm.onlinebooking.impl.preloader.ui.compose.BookingPreloaderScreen (BookingPreloaderScreen.kt:60)");
            }
            jai c = kai.c(-544740630, new ms7(izsVar, 0), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(null, c, null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(462682933, new yzs() { // from class: xsna.ns7
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(462682933, intValue, -1, "com.vk.ecomm.onlinebooking.impl.preloader.ui.compose.BookingPreloaderScreen.<anonymous> (BookingPreloaderScreen.kt:82)");
                        }
                        et7 et7Var2 = et7.this;
                        if (et7Var2 instanceof et7.b) {
                            aVar2.K(1237282664);
                            com.vk.ecomm.onlinebooking.impl.common.a aVar3 = ((et7.b) et7Var2).b;
                            izs izsVar2 = izsVar;
                            boolean J = aVar2.J(izsVar2) | aVar2.J(et7Var2);
                            Object x = aVar2.x();
                            if (J || x == a.C0011a.a) {
                                x = new com.vk.voip.a(5, izsVar2, et7Var2);
                                aVar2.R(x);
                            }
                            iq7.a(aVar3, (gzs) x, aVar2, 0);
                            aVar2.j();
                        } else if (epx.f(et7Var2, et7.c.b)) {
                            aVar2.K(1237465192);
                            zfr0.f(SpinnerState.Loading, txj0.d(q630.a.a, 1.0f), null, 0L, SpinnerSize.Size56, null, aVar2, 24630, 44);
                            aVar2.j();
                        } else {
                            if (!epx.f(et7Var2, et7.a.b)) {
                                throw alb0.c(-2038299406, aVar2);
                            }
                            aVar2.K(-2038286055);
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 805306416, 381);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zw5(et7Var, izsVar, i, 1);
        }
    }
}
