package defpackage;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes7.dex */
public final class ac81 implements zc81 {
    public static u881 a(XmlPullParser xmlPullParser) {
        String str = null;
        xmlPullParser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("ClickThrough".equals(name)) {
                    String a = xf81.a(xmlPullParser);
                    if (a.length() > 0) {
                        str = a;
                    }
                } else if ("ClickTracking".equals(name)) {
                    String a2 = xf81.a(xmlPullParser);
                    if (a2.length() > 0) {
                        arrayList.add(a2);
                    }
                } else {
                    xf81.b(xmlPullParser);
                }
            }
        }
        return new u881(str, arrayList);
    }

    @Override // defpackage.zc81
    public final /* bridge */ /* synthetic */ Object f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        return a(xmlPullParser);
    }
}
