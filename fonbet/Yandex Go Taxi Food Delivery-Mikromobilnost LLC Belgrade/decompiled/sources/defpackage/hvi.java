package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.LinkedHashMap;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes5.dex */
public final class hvi {
    public final wiq0 a;
    public final lx4 b;
    public final vsi c;

    public hvi(wiq0 wiq0Var, lx4 lx4Var, vsi vsiVar) {
        this.a = wiq0Var;
        this.b = lx4Var;
        this.c = vsiVar;
    }

    public static void c(hvi hviVar, String str) {
        i d = ((j) hviVar.b).d(str);
        pex0 m = ((k) hviVar.a).m();
        d.a.put(ClidProvider.STATE, m != null ? m.b : null);
        d.m();
    }

    public final void a(String str) {
        i d = ((j) this.b).d("DeliveryDetailsCard.Closed");
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("close_reason", str);
        pex0 m = ((k) this.a).m();
        linkedHashMap.put(ClidProvider.STATE, m != null ? m.b : null);
        d.m();
    }

    public final void b(tls tlsVar, String str) {
        w3j0 w3j0Var = (w3j0) tlsVar.invoke(((j) this.b).d(str));
        pex0 m = ((k) this.a).m();
        w3j0Var.a.put(ClidProvider.STATE, m != null ? m.b : null);
        w3j0Var.m();
    }

    public final void d(String str, hki hkiVar, int i) {
        String str2;
        int i2 = iwh.a[hkiVar.a().ordinal()];
        if (i2 == 1) {
            str2 = "source";
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            str2 = "destination";
        }
        String str3 = str2;
        if (hkiVar instanceof fki) {
            b(new mt0(str3, (Object) str, (Object) hkiVar, i, 1), "DeliveryDetailsCard.Tapped");
        } else {
            b(new r(str3, str, 9), "DeliveryDetailsCard.Tapped");
        }
    }
}
