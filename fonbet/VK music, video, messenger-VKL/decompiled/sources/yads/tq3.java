package yads;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import xsna.epx;

/* loaded from: classes10.dex */
public final class tq3 implements uq3 {
    public final uq3 a;
    public final String b;
    public final String c;
    public final vq3 d;

    public /* synthetic */ tq3(uq3 uq3Var, String str, String str2) {
        this(uq3Var, str, str2, new vq3());
    }

    @Override // yads.uq3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, kn knVar) {
        ArrayList arrayList = new ArrayList();
        vq3 vq3Var = this.d;
        String str = this.b;
        vq3Var.getClass();
        xmlPullParser.require(2, null, str);
        while (true) {
            this.d.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.d.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (epx.f(this.c, xmlPullParser.getName())) {
                    Object a = this.a.a(xmlPullParser, knVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    this.d.getClass();
                    vq3.b(xmlPullParser);
                }
            }
        }
    }

    public tq3(uq3 uq3Var, String str, String str2, vq3 vq3Var) {
        this.a = uq3Var;
        this.b = str;
        this.c = str2;
        this.d = vq3Var;
    }
}
