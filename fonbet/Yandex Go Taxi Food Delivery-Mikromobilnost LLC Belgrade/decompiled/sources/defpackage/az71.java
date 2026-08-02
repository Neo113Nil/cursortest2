package defpackage;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes7.dex */
public final class az71 implements zc81 {
    public static bw71 a(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Viewable".equals(xmlPullParser.getName())) {
                    arrayList.add(xf81.a(xmlPullParser));
                } else {
                    xf81.b(xmlPullParser);
                }
            }
        }
        return new bw71(arrayList);
    }

    @Override // defpackage.zc81
    public final /* bridge */ /* synthetic */ Object f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        return a(xmlPullParser);
    }
}
