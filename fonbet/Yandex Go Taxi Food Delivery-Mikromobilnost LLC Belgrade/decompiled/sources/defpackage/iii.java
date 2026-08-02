package defpackage;

import android.content.Context;
import ru.yandex.taxi.logistics.payment.a;
import ru.yandex.taxi.logistics.payment_method_selector.DeliveryPaymentMethodSelectorModalView;

/* loaded from: classes5.dex */
public final class iii extends m230 {
    public final wwf E;
    public final i130 F;
    public final boolean G;

    public iii(wwf wwfVar, i130 i130Var) {
        super(null);
        this.E = wwfVar;
        this.F = i130Var;
        this.G = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.F.a();
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.G;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        h7a0 h7a0Var;
        wwf wwfVar = this.E;
        zch zchVar = new zch(this);
        wwfVar.getClass();
        Context context = (Context) wwfVar.a;
        q5z.h(context);
        rqo rqoVar = (rqo) wwfVar.b;
        q5z.h(rqoVar);
        hii hiiVar = new hii(new ut90(rqoVar), zchVar);
        q5z.h((a) wwfVar.c);
        synchronized (bvf0.g) {
            y8g y8gVar = bvf0.e;
            if (y8gVar == null) {
                y8gVar = null;
            }
            xv10 xv10Var = (xv10) y8gVar.d().a;
            n3w a = n3w.a(new r7a0(new yj70(new f380(new ywf(9, xv10Var), 17))));
            qcp0 qcp0Var = (qcp0) xv10Var.b;
            Context context2 = (Context) xv10Var.a;
            q5z.h(context2);
            h7a0Var = new h7a0(qcp0Var, new dt20(context2, (hwy0) xv10Var.x, (r7a0) a.a, (dci) xv10Var.w, 20));
        }
        return new DeliveryPaymentMethodSelectorModalView(context, hiiVar, h7a0Var);
    }
}
