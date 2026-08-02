package yads;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class hi3 implements uq3 {
    public final vq3 a;

    public /* synthetic */ hi3() {
        this(new vq3());
    }

    @Override // yads.uq3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final gi3 a(XmlPullParser xmlPullParser) {
        this.a.getClass();
        String str = null;
        xmlPullParser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) {
                return new gi3(str, arrayList);
            }
            this.a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("ClickThrough".equals(name)) {
                    this.a.getClass();
                    String a = vq3.a(xmlPullParser);
                    if (a.length() > 0) {
                        str = a;
                    }
                } else if ("ClickTracking".equals(name)) {
                    this.a.getClass();
                    String a2 = vq3.a(xmlPullParser);
                    if (a2.length() > 0) {
                        arrayList.add(a2);
                    }
                } else {
                    this.a.getClass();
                    vq3.b(xmlPullParser);
                }
            }
        }
    }

    public hi3(vq3 vq3Var) {
        this.a = vq3Var;
    }
}
