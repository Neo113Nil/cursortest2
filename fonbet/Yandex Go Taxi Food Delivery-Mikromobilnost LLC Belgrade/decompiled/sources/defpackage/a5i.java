package defpackage;

import com.yandex.go.payments.paymentlist.data.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes5.dex */
public final class a5i {
    public final ycq0 a;
    public final cda0 b;
    public final zgf c;
    public final uq1 d;

    public a5i(ycq0 ycq0Var, cda0 cda0Var, zgf zgfVar, uq1 uq1Var) {
        this.a = ycq0Var;
        this.b = cda0Var;
        this.c = zgfVar;
        this.d = uq1Var;
    }

    public final void a(ifa0 ifa0Var) {
        lv90 a = ((xku0) this.c.b).a.a();
        PaymentMethod$Type paymentMethod$Type = a.a;
        g2a0 g2a0Var = paymentMethod$Type == null ? null : new g2a0(paymentMethod$Type.getCode(), a.b);
        String str = ifa0Var.a;
        String str2 = ifa0Var.b;
        if (jl40.l(str, g2a0Var != null ? g2a0Var.a : null) && jl40.l(str2, g2a0Var.b)) {
            return;
        }
        String str3 = ifa0Var.a;
        PaymentMethod$Type.Companion.getClass();
        PaymentMethod$Type a2 = b4a0.a(str3);
        if (a2 != null) {
            lv90.Companion.getClass();
            this.a.b(kv90.b(str2, a2));
        }
        pv90 pv90Var = ifa0Var.c;
        if (pv90Var != null) {
            AlertDialog positiveButton = this.d.a().setTitle(pv90Var.a).setPositiveButton(pv90Var.c);
            String str4 = pv90Var.b;
            if (str4 != null) {
                positiveButton.setMessage(str4);
            }
            String str5 = pv90Var.d;
            if (str5 != null) {
                positiveButton.setNegativeButton(str5);
            }
            positiveButton.show();
            xw31.w(positiveButton);
        }
    }

    public final boolean b(ifa0 ifa0Var) {
        String str = ifa0Var.a;
        PaymentMethod$Type.Companion.getClass();
        PaymentMethod$Type a = b4a0.a(str);
        if (a != null && z4i.a[a.ordinal()] == 1) {
            ListBuilder h = ((c) this.b).h();
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = h.listIterator(0);
            while (true) {
                qqy qqyVar = (qqy) listIterator;
                if (!qqyVar.hasNext()) {
                    break;
                }
                Object next = qqyVar.next();
                if (next instanceof yhi) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (jl40.l(((yhi) it.next()).a, ifa0Var.b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
