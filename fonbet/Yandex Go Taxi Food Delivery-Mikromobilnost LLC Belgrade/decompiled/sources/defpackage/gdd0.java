package defpackage;

import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.repository.api.model.offers.LegalInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gdd0 {
    public static PlusPayLegalInfo a(LegalInfo legalInfo) {
        PlusPayLegalInfo.Item text;
        if (legalInfo == null) {
            return null;
        }
        String text2 = legalInfo.getText();
        List<LegalInfo.Item> items = legalInfo.getItems();
        ArrayList arrayList = new ArrayList(tcc.n(items, 10));
        for (LegalInfo.Item item : items) {
            if (item instanceof LegalInfo.Item.Link) {
                LegalInfo.Item.Link link = (LegalInfo.Item.Link) item;
                text = new PlusPayLegalInfo.Item.Link(link.getKey(), link.getText(), link.getLink());
            } else {
                if (!(item instanceof LegalInfo.Item.Text)) {
                    w511.b();
                    return null;
                }
                LegalInfo.Item.Text text3 = (LegalInfo.Item.Text) item;
                text = new PlusPayLegalInfo.Item.Text(text3.getKey(), text3.getText());
            }
            arrayList.add(text);
        }
        return new PlusPayLegalInfo(text2, arrayList);
    }
}
