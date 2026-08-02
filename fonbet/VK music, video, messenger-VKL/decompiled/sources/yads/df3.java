package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import xsna.epx;
import xsna.j5g;
import xsna.s5a;

/* loaded from: classes10.dex */
public final class df3 {
    public final vq3 a;
    public final tq3 b;
    public final tq3 c;
    public final tm3 d;
    public final if3 e;

    public /* synthetic */ df3(Context context, jp2 jp2Var) {
        this(new vq3(), new tq3(new h20(context, jp2Var), "Creatives", "Creative"), new tq3(new oe3(), "AdVerifications", "Verification"), new tm3(), new if3());
    }

    public final void a(XmlPullParser xmlPullParser, xe3 xe3Var, kn knVar) {
        String name = xmlPullParser.getName();
        if ("Impression".equals(name)) {
            this.a.getClass();
            String a = vq3.a(xmlPullParser);
            LinkedHashMap linkedHashMap = xe3Var.n;
            Object obj = linkedHashMap.get("impression");
            if (obj == null) {
                obj = s5a.a("impression", linkedHashMap);
            }
            ((List) obj).add(a);
            return;
        }
        if ("ViewableImpression".equals(name)) {
            xe3Var.i = this.d.a(xmlPullParser);
            return;
        }
        if ("Error".equals(name)) {
            this.a.getClass();
            String a2 = vq3.a(xmlPullParser);
            LinkedHashMap linkedHashMap2 = xe3Var.n;
            Object obj2 = linkedHashMap2.get("error");
            if (obj2 == null) {
                obj2 = s5a.a("error", linkedHashMap2);
            }
            ((List) obj2).add(a2);
            return;
        }
        if ("Survey".equals(name)) {
            this.a.getClass();
            xe3Var.g = vq3.a(xmlPullParser);
            return;
        }
        if ("Description".equals(name)) {
            this.a.getClass();
            xe3Var.f = vq3.a(xmlPullParser);
            return;
        }
        if ("AdTitle".equals(name)) {
            this.a.getClass();
            xe3Var.e = vq3.a(xmlPullParser);
            return;
        }
        if ("AdSystem".equals(name)) {
            this.a.getClass();
            xe3Var.d = vq3.a(xmlPullParser);
            return;
        }
        if ("Creatives".equals(name)) {
            xe3Var.l.addAll(this.b.a(xmlPullParser, knVar));
            return;
        }
        if ("AdVerifications".equals(name)) {
            xe3Var.m.addAll(this.c.a(xmlPullParser, knVar));
            return;
        }
        if (!"Extensions".equals(name)) {
            this.a.getClass();
            vq3.b(xmlPullParser);
            return;
        }
        if3 if3Var = this.e;
        if3Var.a.getClass();
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            if3Var.a.getClass();
            if (xmlPullParser.next() == 3) {
                xe3Var.o = new hf3(j5g.O0(arrayList2), j5g.O0(arrayList));
                return;
            }
            if3Var.a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("Extension".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if (if3.e.contains(attributeValue)) {
                        iq0 a3 = if3Var.b.a(xmlPullParser);
                        if (a3 != null) {
                            arrayList2.add(a3);
                        }
                    } else if (epx.f(if3.d, attributeValue)) {
                        arrayList.addAll(if3Var.c.a(xmlPullParser, knVar));
                    } else {
                        if3Var.a.getClass();
                        vq3.b(xmlPullParser);
                    }
                } else {
                    if3Var.a.getClass();
                    vq3.b(xmlPullParser);
                }
            }
        }
    }

    public df3(vq3 vq3Var, tq3 tq3Var, tq3 tq3Var2, tm3 tm3Var, if3 if3Var) {
        this.a = vq3Var;
        this.b = tq3Var;
        this.c = tq3Var2;
        this.d = tm3Var;
        this.e = if3Var;
    }
}
