package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.sx80;

/* compiled from: OrderScreen.kt */
/* loaded from: classes18.dex */
public final class cx80 {

    /* compiled from: OrderScreen.kt */
    @b6l(c = "com.vk.ecomm.orders.impl.order.presentation.compose.OrderScreenKt$OrderScreen$2$1", f = "OrderScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<z37<OrderAction>, com.vk.ecomm.orders.impl.order.presentation.mvi.c, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<com.vk.ecomm.orders.impl.order.presentation.mvi.c, s3q0> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super com.vk.ecomm.orders.impl.order.presentation.mvi.c, s3q0> izsVar, spj<? super a> spjVar) {
            super(3, spjVar);
            this.$onEvent = izsVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<OrderAction> z37Var, com.vk.ecomm.orders.impl.order.presentation.mvi.c cVar, spj<? super s3q0> spjVar) {
            a aVar = new a(this.$onEvent, spjVar);
            aVar.L$0 = cVar;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.vk.ecomm.orders.impl.order.presentation.mvi.c cVar = (com.vk.ecomm.orders.impl.order.presentation.mvi.c) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onEvent.invoke(cVar);
            return s3q0.a;
        }
    }

    public static final void a(ix80 ix80Var, pu80 pu80Var, izs<? super com.vk.ecomm.orders.impl.order.presentation.mvi.c, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        sdz sdzVar = pu80Var.a;
        androidx.compose.runtime.a M = aVar.M(-489483487);
        int i2 = (M.J(ix80Var) ? 4 : 2) | i | (M.J(pu80Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-489483487, i2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.OrderScreen (OrderScreen.kt:32)");
            }
            boolean J = M.J(sdzVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new hx80(sdzVar);
                M.R(x);
            }
            hx80 hx80Var = (hx80) x;
            boolean y = M.y(hx80Var) | ((i2 & 14) == 4);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new lh(20, ix80Var, hx80Var);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean z = (i2 & 896) == 256;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new a(izsVar, null);
                M.R(x3);
            }
            r37.a(izsVar2, (yzs) x3, k9q0.b, M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cr7(i, 8, ix80Var, pu80Var, izsVar);
        }
    }

    public static final void b(sx80 sx80Var, izs<? super OrderAction, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-374209247);
        int i2 = (M.J(sx80Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-374209247, i2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.OrderScreen (OrderScreen.kt:67)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qx80.a((i2 & 112) | 384, M, sx80Var.b.a, izsVar, txj0.f(aVar2, 1.0f));
            sx80.a aVar4 = sx80Var.c;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new juz(7);
                M.R(x);
            }
            njk.a(aVar4, (izs) x, null, null, "OrderScreenCrossfade", kai.c(-1173426874, new tvq(izsVar, 1), M), M, 221232);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new io7(sx80Var, izsVar, i, 6);
        }
    }
}
