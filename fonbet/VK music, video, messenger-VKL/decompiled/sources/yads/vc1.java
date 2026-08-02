package yads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import org.xmlpull.v1.XmlPullParser;
import xsna.arm0;
import xsna.drm0;

/* loaded from: classes10.dex */
public final class vc1 implements uq3 {
    public final vq3 a;

    public /* synthetic */ vc1() {
        this(new vq3());
    }

    @Override // yads.uq3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final uc1 a(XmlPullParser xmlPullParser) {
        Integer m;
        Integer m2;
        this.a.getClass();
        xmlPullParser.require(2, null, "InteractiveCreativeFile");
        this.a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        if (attributeValue != null) {
            this.a.getClass();
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
            if (attributeValue2 != null && (m = arm0.m(10, attributeValue2)) != null) {
                int intValue = m.intValue();
                this.a.getClass();
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
                if (attributeValue3 != null && (m2 = arm0.m(10, attributeValue3)) != null) {
                    int intValue2 = m2.intValue();
                    this.a.getClass();
                    String a = vq3.a(xmlPullParser);
                    if (drm0.D(attributeValue, "html", false) != (a.length() > 0)) {
                        a = null;
                    }
                    String str = a != null ? new String(Base64.decode(a, 0), StandardCharsets.UTF_8) : null;
                    if (str != null) {
                        return new uc1(intValue, intValue2, str, attributeValue);
                    }
                }
            }
        }
        return null;
    }

    public vc1(vq3 vq3Var) {
        this.a = vq3Var;
    }
}
