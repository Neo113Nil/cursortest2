package defpackage;

import com.yandex.go.trusted_contacts.data.entities.network.DeletedTrustedContactsResponse;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.data.entities.network.TrustingContactDto;
import com.yandex.go.trusted_contacts.domain.entities.RenderedContactState;
import com.yandex.go.trusted_contacts.domain.entities.TrustedContactsMode;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class ish {
    public static og11 a(og11 og11Var, DeletedTrustedContactsResponse deletedTrustedContactsResponse) {
        TrustedContactsMode trustedContactsMode = TrustedContactsMode.DEFAULT;
        u7q0 u7q0Var = og11Var.c;
        ArrayList arrayList = u7q0Var.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            cyi0 cyi0Var = (cyi0) it.next();
            cyi0 a = deletedTrustedContactsResponse.a.contains(((TrustedContactDto) cyi0Var.d).a) ? null : cyi0.a(cyi0Var, RenderedContactState.DEFAULT);
            if (a != null) {
                arrayList2.add(a);
            }
        }
        u7q0 a2 = u7q0.a(u7q0Var, arrayList2);
        u7q0 u7q0Var2 = og11Var.d;
        ArrayList<cyi0> arrayList3 = u7q0Var2.b;
        ArrayList arrayList4 = new ArrayList();
        for (cyi0 cyi0Var2 : arrayList3) {
            cyi0 a3 = deletedTrustedContactsResponse.b.contains(((TrustingContactDto) cyi0Var2.d).a) ? null : cyi0.a(cyi0Var2, RenderedContactState.DEFAULT);
            if (a3 != null) {
                arrayList4.add(a3);
            }
        }
        return og11.a(og11Var, trustedContactsMode, a2, u7q0.a(u7q0Var2, arrayList4), new gsh(0), 50);
    }
}
