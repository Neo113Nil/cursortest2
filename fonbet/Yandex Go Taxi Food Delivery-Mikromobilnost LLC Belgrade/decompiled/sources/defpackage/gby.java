package defpackage;

import com.yandex.plus.core.graphql.type.LEGAL_ITEM_TYPE;
import com.yandex.plus.pay.repository.api.model.offers.LegalInfo;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class gby {
    public static LegalInfo a(yay yayVar) {
        LegalInfo.Item link;
        if (yayVar == null) {
            return null;
        }
        String str = yayVar.a;
        ArrayList<xay> arrayList = yayVar.b;
        ArrayList arrayList2 = new ArrayList();
        for (xay xayVar : arrayList) {
            LEGAL_ITEM_TYPE legal_item_type = xayVar.a;
            way wayVar = xayVar.c;
            String str2 = wayVar.a;
            String str3 = xayVar.b;
            int i = fby.a[legal_item_type.ordinal()];
            if (i == 1) {
                String str4 = wayVar.b;
                if (str4 == null) {
                    str4 = "";
                }
                link = new LegalInfo.Item.Link(str3, str2, str4);
            } else if (i == 2) {
                link = new LegalInfo.Item.Text(str3, str2);
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                link = null;
            }
            if (link != null) {
                arrayList2.add(link);
            }
        }
        return new LegalInfo(str, arrayList2);
    }
}
