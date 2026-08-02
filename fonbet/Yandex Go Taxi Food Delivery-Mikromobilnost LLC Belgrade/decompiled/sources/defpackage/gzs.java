package defpackage;

import com.yandex.go.order.external.tracking.c;
import com.yandex.go.order.external.tracking.h;
import com.yandex.go.shortcuts.dto.response.Parameters;
import com.yandex.go.shortcuts.dto.response.ProductMode$Eats;
import com.yandex.go.shortcuts.dto.response.ProductMode$Grocery;
import com.yandex.go.shortcuts.dto.response.ProductMode$Pharmacy;
import com.yandex.go.shortcuts.dto.response.t1;
import com.yandex.go.shortcuts.impl.view.adapter.model.a;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes13.dex */
public final class gzs {
    public final a a;
    public final s9p b;
    public final h c;

    public gzs(a aVar, s9p s9pVar, h hVar) {
        this.a = aVar;
        this.b = s9pVar;
        this.c = hVar;
    }

    public final ArrayList a(ezs ezsVar) {
        ArrayList arrayList = new ArrayList();
        for (t1 t1Var : ezsVar.b.b) {
            Parameters parameters = t1Var instanceof ProductMode$Eats ? ((ProductMode$Eats) t1Var).a : t1Var instanceof ProductMode$Grocery ? ((ProductMode$Grocery) t1Var).a : t1Var instanceof ProductMode$Pharmacy ? ((ProductMode$Pharmacy) t1Var).a : null;
            if (parameters != null) {
                boolean z = parameters.a;
                h1p r = gwk0.r(t1Var.a().getMode());
                boolean z2 = (r == null || ((c) this.c.l.getValue()).b(r) == null) ? false : true;
                if (z || z2) {
                    arrayList.add(new sa4(t1Var.a().name().toLowerCase(Locale.ROOT)));
                }
            }
        }
        return arrayList;
    }
}
