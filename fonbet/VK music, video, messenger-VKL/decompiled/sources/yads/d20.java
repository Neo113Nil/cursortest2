package yads;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class d20 implements uq3 {
    public final uq3 a;
    public final vq3 b;

    public d20(kr0 kr0Var, vq3 vq3Var) {
        this.a = kr0Var;
        this.b = vq3Var;
    }

    @Override // yads.uq3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) {
        this.b.getClass();
        Object obj = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (true) {
            this.b.getClass();
            if (xmlPullParser.next() == 3) {
                return obj;
            }
            this.b.getClass();
            if (xmlPullParser.getEventType() == 2) {
                obj = this.a.a(xmlPullParser, knVar);
            }
        }
    }
}
