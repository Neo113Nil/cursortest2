package yads;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import xsna.epx;

/* loaded from: classes10.dex */
public final class qm1 implements uq3 {
    public final vq3 a;
    public final vc1 b;
    public final nm1 c;

    public /* synthetic */ qm1() {
        this(new vq3(), new vc1(), new nm1());
    }

    @Override // yads.uq3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, kn knVar) {
        ArrayList arrayList = new ArrayList();
        this.a.getClass();
        xmlPullParser.require(2, null, "MediaFiles");
        while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (epx.f(name, "MediaFile")) {
                    arrayList.add(this.c.a(xmlPullParser));
                } else if (epx.f(name, "InteractiveCreativeFile")) {
                    uc1 a = this.b.a(xmlPullParser);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    this.a.getClass();
                    vq3.b(xmlPullParser);
                }
            }
        }
    }

    public qm1(vq3 vq3Var, vc1 vc1Var, nm1 nm1Var) {
        this.a = vq3Var;
        this.b = vc1Var;
        this.c = nm1Var;
    }
}
