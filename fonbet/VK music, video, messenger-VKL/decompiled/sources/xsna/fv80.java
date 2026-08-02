package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OrderListContent.kt */
/* loaded from: classes18.dex */
public final class fv80 {

    /* compiled from: OrderListContent.kt */
    @b6l(c = "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderListContentKt$OrderListContent$2$1", f = "OrderListContent.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<z37<OrderListAction>, com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c, s3q0> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c, s3q0> izsVar, spj<? super a> spjVar) {
            super(3, spjVar);
            this.$onEvent = izsVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<OrderListAction> z37Var, com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c cVar, spj<? super s3q0> spjVar) {
            a aVar = new a(this.$onEvent, spjVar);
            aVar.L$0 = cVar;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c cVar = (com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onEvent.invoke(cVar);
            return s3q0.a;
        }
    }

    /* compiled from: OrderListContent.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<OrderListAction, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(OrderListAction orderListAction) {
            ((z37) this.receiver).b(orderListAction);
            return s3q0.a;
        }
    }

    public static final void a(final ew80 ew80Var, final boolean z, final izs<? super dw80, nw80> izsVar, final izs<? super com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c, s3q0> izsVar2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-561702251);
        int i2 = (M.J(ew80Var) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.y(izsVar2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-561702251, i2, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderListContent (OrderListContent.kt:24)");
            }
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new qb6(20, ew80Var, izsVar);
                M.R(x);
            }
            izs izsVar3 = (izs) x;
            boolean z3 = (i2 & 7168) == 2048;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new a(izsVar2, null);
                M.R(x2);
            }
            r37.a(izsVar3, (yzs) x2, kai.c(-397632598, new zzs() { // from class: xsna.cv80
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3;
                    z37 z37Var = (z37) obj;
                    nw80 nw80Var = (nw80) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar2.J(z37Var) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar2.J(nw80Var) ? 32 : 16;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-397632598, i3, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderListContent.<anonymous> (OrderListContent.kt:39)");
                        }
                        emi.e.g(6, aVar2, kai.c(240783176, new l3j(z, nw80Var, z37Var), aVar2));
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
            s.d = new wzs(z, izsVar, izsVar2, i) { // from class: xsna.dv80
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ izs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    fv80.a(ew80.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
