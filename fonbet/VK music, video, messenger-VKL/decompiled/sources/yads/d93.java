package yads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class d93 {
    public final vq3 a;
    public final c93 b;

    public /* synthetic */ d93() {
        this(new vq3(), new c93());
    }

    public final HashMap a(XmlPullParser xmlPullParser) {
        this.a.getClass();
        xmlPullParser.require(2, null, "TrackingEvents");
        HashMap hashMap = new HashMap();
        while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) {
                return hashMap;
            }
            this.a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    b93 a = this.b.a(xmlPullParser);
                    if (a != null) {
                        String str = a.a;
                        String str2 = a.b;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new ArrayList());
                        }
                        List list = (List) hashMap.get(str);
                        if (list != null) {
                            list.add(str2);
                        }
                    }
                } else {
                    this.a.getClass();
                    vq3.b(xmlPullParser);
                }
            }
        }
    }

    public d93(vq3 vq3Var, c93 c93Var) {
        this.a = vq3Var;
        this.b = c93Var;
    }
}
