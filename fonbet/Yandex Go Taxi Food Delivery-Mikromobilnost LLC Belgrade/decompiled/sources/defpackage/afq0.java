package defpackage;

import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.a;
import com.yandex.payment.sdk.datasource.payment.interfaces.PaymentButton$DisableReason;
import com.yandex.xplat.payment.sdk.NewCard;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class afq0 extends yr31 {
    public final rwo A;
    public uv90 G;
    public boolean H;
    public kcq0 I;
    public PaymentMethod.SbpToken K;
    public final oy90 b;
    public final vv90 c;
    public final PaymentMethod w;
    public final NewCard x;
    public final String y;
    public final boolean z;
    public final dy40 B = new dy40();
    public final dy40 C = new dy40();
    public final dy40 D = new dy40();
    public final dy40 E = new dy40();
    public final dy40 F = new dy40();
    public h991 J = new nw90(PaymentButton$DisableReason.NoSelectedMethod);

    public afq0(oy90 oy90Var, vv90 vv90Var, PaymentMethod paymentMethod, NewCard newCard, String str, boolean z, rwo rwoVar) {
        this.b = oy90Var;
        this.c = vv90Var;
        this.w = paymentMethod;
        this.x = newCard;
        this.y = str;
        this.z = z;
        this.A = rwoVar;
    }

    public static /* synthetic */ void b0(afq0 afq0Var) {
        afq0Var.a0(new do21(0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (((defpackage.wga0) r0).h(((com.yandex.payment.sdk.core.data.PaymentMethod.Card) r2).getId()) == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(uv90 uv90Var) {
        ArrayList e = ((wga0) uv90Var).e();
        ArrayList arrayList = new ArrayList();
        Iterator it = e.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(((PaymentMethod) next) instanceof PaymentMethod.Cash)) {
                arrayList.add(next);
            }
        }
        rwo rwoVar = this.A;
        PaymentMethod paymentMethod = this.w;
        dy40 dy40Var = this.D;
        int i = 0;
        if (paymentMethod == null) {
            if (arrayList.isEmpty()) {
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.u0());
                dy40Var.l(new deq0(false));
                return;
            }
            qv90.a.getClass();
            ((y22) rwoVar).a(sv90.v0());
            List a = a8a0.a(arrayList);
            kcq0 kcq0Var = this.I;
            if (kcq0Var == null) {
                kcq0Var = null;
            }
            kcq0Var.e(a);
            List list = a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((PaymentMethod) it2.next()) instanceof PaymentMethod.SbpToken) {
                        dy40Var.l(new geq0(false, false));
                        kcq0 kcq0Var2 = this.I;
                        c991.m(this.c, (kcq0Var2 != null ? kcq0Var2 : null).a(), new cjm0(21, this, a));
                        return;
                    }
                }
            }
            Z(a);
            return;
        }
        qv90.a.getClass();
        ((y22) rwoVar).a(sv90.x0());
        if (a8a0.b(a8a0.c(paymentMethod), arrayList) == null) {
            a aVar = PaymentKitError.Companion;
            String c = a8a0.c(paymentMethod);
            aVar.getClass();
            dy40Var.l(new eeq0(a.e(c)));
            return;
        }
        kcq0 kcq0Var3 = this.I;
        if (kcq0Var3 == null) {
            kcq0Var3 = null;
        }
        kcq0Var3.e(Collections.singletonList(paymentMethod));
        if ((paymentMethod instanceof PaymentMethod.Card) && (r0 = this.G) != null) {
        }
        if ((!(paymentMethod instanceof PaymentMethod.NewCard) || this.x == null) && !(paymentMethod instanceof PaymentMethod.YBMethod) && !(paymentMethod instanceof PaymentMethod.GooglePay) && !(paymentMethod instanceof PaymentMethod.SbpToken)) {
            if (paymentMethod instanceof PaymentMethod.Sbp) {
                dy40Var.l(new heq0(SbpOperation.Pay.INSTANCE, false));
                return;
            }
            if (paymentMethod instanceof PaymentMethod.NewSbpToken) {
                dy40Var.l(new heq0(SbpOperation.NewTokenPay.INSTANCE, false));
                return;
            }
            kcq0 kcq0Var4 = this.I;
            if (kcq0Var4 == null) {
                kcq0Var4 = null;
            }
            ArrayList a2 = kcq0Var4.a();
            kcq0 kcq0Var5 = this.I;
            dy40Var.l(new ieq0(a2, (kcq0Var5 != null ? kcq0Var5 : null).c()));
            Y(paymentMethod, false);
            return;
        }
        X(new do21(i));
    }

    public final void X(do21 do21Var) {
        ndl0 ndl0Var = new ndl0(23, this);
        kcq0 kcq0Var = this.I;
        if (kcq0Var == null) {
            kcq0Var = null;
        }
        PaymentMethod paymentMethod = kcq0Var.z;
        if (paymentMethod == null) {
            ny61.r("Invalid state. Selected method is empty.");
            return;
        }
        boolean z = paymentMethod instanceof PaymentMethod.Sbp;
        dy40 dy40Var = this.D;
        if (z || (paymentMethod instanceof PaymentMethod.NewSbpToken)) {
            dy40Var.l(new heq0(paymentMethod instanceof PaymentMethod.NewSbpToken ? SbpOperation.NewTokenPay.INSTANCE : SbpOperation.Pay.INSTANCE, true));
            return;
        }
        String str = do21Var.a;
        if (str == null) {
            str = this.y;
        }
        dy40Var.l(new geq0(true, z));
        this.E.l(v27.a);
        boolean equals = paymentMethod.equals(PaymentMethod.NewCard.INSTANCE);
        oy90 oy90Var = this.b;
        if (equals || a8a0.d(paymentMethod)) {
            oy90Var.d(this.x, str, ndl0Var);
            return;
        }
        if (paymentMethod.equals(PaymentMethod.GooglePay.INSTANCE)) {
            oy90Var.a(str, ndl0Var);
            return;
        }
        int i = 0;
        if ((paymentMethod instanceof PaymentMethod.Card) && !a8a0.d(paymentMethod)) {
            oy90Var.c(paymentMethod, new weq0(this, i), str, ndl0Var);
            return;
        }
        if (paymentMethod instanceof PaymentMethod.SbpToken) {
            PaymentMethod.SbpToken sbpToken = (PaymentMethod.SbpToken) paymentMethod;
            this.K = sbpToken;
            sbpToken.getMemberId();
            oy90Var.f(sbpToken.getId(), str, sbpToken.getPayload(), new yeq0(this));
            return;
        }
        if (paymentMethod instanceof PaymentMethod.YBMethod) {
            oy90Var.c(paymentMethod, new suf(i), str, ndl0Var);
        } else {
            ny61.r("Invalid state. Selected method is not payable here.");
        }
    }

    public final void Y(PaymentMethod paymentMethod, boolean z) {
        ((y22) this.A).a(ox21.a(paymentMethod, z));
        if (paymentMethod.equals(PaymentMethod.NewCard.INSTANCE)) {
            this.D.l(new deq0(z));
        }
    }

    public final void Z(List list) {
        kcq0 kcq0Var = this.I;
        if (kcq0Var == null) {
            kcq0Var = null;
        }
        ArrayList a = kcq0Var.a();
        kcq0 kcq0Var2 = this.I;
        this.D.l(new ieq0(a, (kcq0Var2 != null ? kcq0Var2 : null).c()));
        if (list.size() == 1) {
            Y((PaymentMethod) kotlin.collections.a.P(list), false);
        } else {
            b0(this);
        }
    }

    public final void a0(do21 do21Var) {
        Object t27Var;
        String str = do21Var.a;
        if (str == null) {
            str = this.y;
        }
        if ((str == null || evu0.J(str)) && (this.b.m || !this.z)) {
            t27Var = new t27(null);
        } else {
            h991 h991Var = this.J;
            if (h991Var instanceof nw90) {
                t27Var = ((nw90) h991Var).b == PaymentButton$DisableReason.InvalidCvn ? new t27(Integer.valueOf(ryh0.paymentsdk_wait_for_cvv_title)) : new t27(null);
            } else if (!jl40.l(h991Var, ow90.b)) {
                w511.b();
                return;
            } else {
                kcq0 kcq0Var = this.I;
                PaymentMethod paymentMethod = (kcq0Var != null ? kcq0Var : null).z;
                t27Var = new u27((paymentMethod instanceof PaymentMethod.SbpToken) || jl40.l(paymentMethod, PaymentMethod.Sbp.INSTANCE) || jl40.l(paymentMethod, PaymentMethod.NewSbpToken.INSTANCE));
            }
        }
        this.E.l(t27Var);
    }
}
