package defpackage;

import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class hfd0 implements gfd0 {
    public final gio a;
    public final jbd0 b;
    public final String c;
    public final String d;

    public hfd0(gio gioVar, jbd0 jbd0Var, String str, String str2) {
        this.a = gioVar;
        this.b = jbd0Var;
        this.c = str;
        this.d = str2;
    }

    public final void a(String str, String str2, List list) {
        PlusPaySmartOffer.Meta meta;
        String batchId;
        String str3 = "no_value";
        if (str == null) {
            str = "no_value";
        }
        PlusPaySmartOffer plusPaySmartOffer = (PlusPaySmartOffer) a.R(list);
        if (plusPaySmartOffer != null && (meta = plusPaySmartOffer.getMeta()) != null && (batchId = meta.getBatchId()) != null) {
            str3 = batchId;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlusPaySmartOffer) it.next()).getMeta().getPositionId());
        }
        this.a.d(str2, str, str3, arrayList);
    }
}
