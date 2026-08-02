package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;
import ru.yandex.taxi.cashback.international.c;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;

/* loaded from: classes5.dex */
public final class d49 {
    public final cda0 a;
    public final u500 b;
    public final a29 c;
    public final c d;

    public d49(cda0 cda0Var, u500 u500Var, a29 a29Var, c cVar) {
        this.a = cda0Var;
        this.b = u500Var;
        this.c = a29Var;
        this.d = cVar;
    }

    public static void d(d49 d49Var, CashbackCardContext cashbackCardContext) {
        d49Var.c(cashbackCardContext, w2d0.f, null);
    }

    public final void a() {
        ListBuilder h = ((com.yandex.go.payments.paymentlist.data.c) this.a).h();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = h.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            }
            Object next = qqyVar.next();
            if (next instanceof h8b0) {
                arrayList.add(next);
            }
        }
        h8b0 h8b0Var = (h8b0) a.R(arrayList);
        if (((Boolean) this.d.a.a.b()).booleanValue() || h8b0Var != null) {
            d(this, CashbackCardContext.TARIFF_CARD);
            return;
        }
        z19 z19Var = this.c.a;
        z19Var.getClass();
        z19Var.a.a("Cashback.NoWallet", new HashMap(), 1, new HashMap());
    }

    public final void b(CashbackCardContext cashbackCardContext) {
        c(cashbackCardContext, w2d0.f, null);
    }

    public final void c(CashbackCardContext cashbackCardContext, w2d0 w2d0Var, g0h g0hVar) {
        this.b.b(MainMenuProcessor$MenuEntry.PLUS_HOME, new qxx0(cashbackCardContext.getValue(), w2d0Var, g0hVar != null ? new pm5(27, g0hVar) : null));
    }
}
