package yads;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class tm3 implements uq3 {
    public final vq3 a;

    public /* synthetic */ tm3() {
        this(new vq3());
    }

    @Override // yads.uq3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final sm3 a(XmlPullParser xmlPullParser) {
        this.a.getClass();
        xmlPullParser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) {
                return new sm3(arrayList);
            }
            this.a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("Viewable".equals(xmlPullParser.getName())) {
                    this.a.getClass();
                    arrayList.add(vq3.a(xmlPullParser));
                } else {
                    this.a.getClass();
                    vq3.b(xmlPullParser);
                }
            }
        }
    }

    public tm3(vq3 vq3Var) {
        this.a = vq3Var;
    }
}
