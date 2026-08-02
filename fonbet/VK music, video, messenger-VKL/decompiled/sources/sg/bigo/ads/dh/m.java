package sg.bigo.ads.dh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes9.dex */
public final class m {
    Document a;

    public final List<d> a() {
        ArrayList arrayList = new ArrayList();
        Document document = this.a;
        if (document != null) {
            NodeList elementsByTagName = document.getElementsByTagName("Ad");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                arrayList.add(new d(elementsByTagName.item(i)));
            }
        }
        return arrayList;
    }

    public final List<n> b() {
        List<Node> c;
        ArrayList arrayList = new ArrayList();
        NodeList elementsByTagName = this.a.getElementsByTagName("Error");
        for (int i = 0; i < elementsByTagName.getLength() && (c = sg.bigo.ads.dg.a.c(elementsByTagName.item(i), "Error")) != null; i++) {
            Iterator<Node> it = c.iterator();
            while (it.hasNext()) {
                String a = sg.bigo.ads.dg.a.a(it.next());
                if (!TextUtils.isEmpty(a)) {
                    arrayList.add(new n(a));
                }
            }
        }
        return arrayList;
    }
}
