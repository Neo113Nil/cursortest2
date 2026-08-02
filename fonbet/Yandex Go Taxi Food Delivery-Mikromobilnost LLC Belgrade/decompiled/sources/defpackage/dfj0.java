package defpackage;

import android.content.Context;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.payments.paymentlist.data.c;
import java.util.List;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.costcenters.fields.CostCenterFieldsModalView;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes6.dex */
public final class dfj0 {
    public final Context a;
    public final w030 b;
    public final gwe c;
    public final cda0 d;
    public final zuj0 e;
    public final zwe f;
    public final wwe g;

    public dfj0(Context context, w030 w030Var, gwe gweVar, cda0 cda0Var, zuj0 zuj0Var, zwe zweVar, wwe wweVar) {
        this.a = context;
        this.b = w030Var;
        this.c = gweVar;
        this.d = cda0Var;
        this.e = zuj0Var;
        this.f = zweVar;
        this.g = wweVar;
    }

    public final void a(uxe uxeVar) {
        c cVar = (c) this.d;
        fga0 fga0Var = cVar.g;
        fga0Var.getClass();
        CorpAccount j = fga0Var.j(fga0Var.q(PaymentMethod$Type.CORP));
        jve b = j != null ? cVar.o.b(j) : null;
        if (b == null) {
            jst.e.r("CostCenter. corp account expected but null", new NullPointerException());
            return;
        }
        List list = b.e;
        int i = 15;
        aye0 aye0Var = new aye0(i, this);
        gwe gweVar = this.c;
        gweVar.getClass();
        zwe zweVar = this.f;
        zweVar.getClass();
        w030 w030Var = this.b;
        w030Var.getClass();
        Context context = this.a;
        context.getClass();
        j4n j4nVar = new j4n(gweVar, zweVar, b, uxeVar, w030Var, context, (hwe) aye0Var);
        if (list.size() != 1) {
            w030Var.s(new CostCenterFieldsModalView(context, j4nVar.m(), true), true);
            return;
        }
        CostCenterField costCenterField = (CostCenterField) list.get(0);
        aye0 aye0Var2 = new aye0(i, this);
        costCenterField.getClass();
        zxf zxfVar = new zxf(j4nVar, costCenterField, 0, aye0Var2);
        this.g.getClass();
        w030Var.s(wwe.a(context, zxfVar), true);
    }
}
