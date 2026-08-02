package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vk.superapp.vkpay.checkout.data.model.Cash;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import java.util.List;
import xsna.bbv0;

/* compiled from: CheckoutRepository.kt */
/* loaded from: classes6.dex */
public final class a8c {
    public final m4c a;
    public PayMethodData b = Cash.c;
    public io.reactivex.rxjava3.subjects.g<List<PayMethodData>> c;

    public a8c(m4c m4cVar) {
        this.a = m4cVar;
    }

    public static VkPayCheckoutConfig a() {
        bbv0.g.getClass();
        return bbv0.a.f().b;
    }

    public static VkTransactionInfo b() {
        bbv0.g.getClass();
        return bbv0.a.f().a;
    }

    public static io.reactivex.rxjava3.internal.operators.single.l d(io.reactivex.rxjava3.core.x xVar) {
        m5 m5Var = new m5(new com.vk.movika.sdk.base.observable.e0(10), 14);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.o(xVar, m5Var).h(new defpackage.x(new d40(9), 10));
    }

    public static io.reactivex.rxjava3.internal.operators.single.m e(io.reactivex.rxjava3.internal.operators.single.l lVar) {
        return new io.reactivex.rxjava3.internal.operators.single.m(lVar, new zj0(new x7c(0), 5));
    }

    public static void f(tr90 tr90Var) {
        bbv0.g.getClass();
        bbv0.a.f().e.a.d = new ten0(tr90Var.d);
        TransactionStatusResponse.VkCheckoutTransactionStatus vkCheckoutTransactionStatus = tr90Var.c;
        if (vkCheckoutTransactionStatus.h()) {
            g(tr90Var, vkCheckoutTransactionStatus);
        }
    }

    public static void g(b0l0 b0l0Var, TransactionStatusResponse.VkCheckoutTransactionStatus vkCheckoutTransactionStatus) {
        if (!b0l0Var.b()) {
            bbv0.g.getClass();
            bbv0.a.f().e.a.a(b0l0Var);
        }
        bbv0.g.getClass();
        shn0 shn0Var = bbv0.a.f().e;
        TransactionStatusResponse.VkCheckoutTransactionStatus vkCheckoutTransactionStatus2 = TransactionStatusResponse.VkCheckoutTransactionStatus.DONE;
        SchemeStatSak$TypeVkPayCheckoutItem.EventType eventType = vkCheckoutTransactionStatus == vkCheckoutTransactionStatus2 ? SchemeStatSak$TypeVkPayCheckoutItem.EventType.SUCCESS : SchemeStatSak$TypeVkPayCheckoutItem.EventType.FAILED;
        if (vkCheckoutTransactionStatus == vkCheckoutTransactionStatus2) {
            bbv0.a.f().f = true;
        }
        shn0Var.a(eventType);
        bbv0.a.f().e.a.a(null);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [io.reactivex.rxjava3.subjects.g$b, java.util.concurrent.atomic.AtomicReference] */
    public final io.reactivex.rxjava3.internal.operators.single.l c(boolean z) {
        io.reactivex.rxjava3.subjects.g<List<PayMethodData>> gVar;
        io.reactivex.rxjava3.subjects.g<List<PayMethodData>> gVar2;
        if (z) {
            gVar = io.reactivex.rxjava3.subjects.g.N0();
            this.c = gVar;
        } else {
            gVar = this.c;
            if (gVar == null) {
                gVar = io.reactivex.rxjava3.subjects.g.N0();
                this.c = gVar;
            }
        }
        if (z && (gVar2 = this.c) != null) {
            gVar2.b.d();
        }
        return d(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.o(this.a.init(), new j22(new pd(gVar, 22), 12)), new ul0(this, 1)), new sv(new ak(this, 8), 13)));
    }
}
