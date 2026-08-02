package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.XAdES.util.XMLUtils;

/* loaded from: classes4.dex */
public final class ft61 extends xw61 {
    public final /* synthetic */ int x;
    public List y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft61(Document document, xw61 xw61Var, String str, String str2, String str3, String str4, int i) {
        super(document, xw61Var, str, str2, str3, str4);
        this.x = i;
    }

    public List h() {
        switch (this.x) {
            case 0:
                if (this.y == null) {
                    List<Element> childElementsByTagNameNS = XMLUtils.getChildElementsByTagNameNS(e(), "CRLRef", this.c);
                    if (childElementsByTagNameNS == null || childElementsByTagNameNS.size() <= 0) {
                        this.y = Collections.EMPTY_LIST;
                    } else {
                        this.y = new ArrayList(childElementsByTagNameNS.size());
                        Iterator<Element> it = childElementsByTagNameNS.iterator();
                        while (it.hasNext()) {
                            this.y.add(new nr61(it.next(), this.b, this.c, this.w));
                        }
                    }
                }
                break;
            default:
                if (this.y == null) {
                    List<Element> childElementsByTagNameNS2 = XMLUtils.getChildElementsByTagNameNS(e(), "OCSPRef", this.c);
                    if (childElementsByTagNameNS2 == null || childElementsByTagNameNS2.size() <= 0) {
                        this.y = Collections.EMPTY_LIST;
                    } else {
                        this.y = new ArrayList(childElementsByTagNameNS2.size());
                        Iterator<Element> it2 = childElementsByTagNameNS2.iterator();
                        while (it2.hasNext()) {
                            this.y.add(new hu61(it2.next(), this.b, this.c, this.w));
                        }
                    }
                }
                break;
        }
        return this.y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft61(Node node, String str, String str2, String str3, int i) {
        super(node, str, str2, str3);
        this.x = i;
    }
}
